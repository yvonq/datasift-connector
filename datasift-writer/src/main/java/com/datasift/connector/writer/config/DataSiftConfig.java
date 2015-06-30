package com.datasift.connector.writer.config;

import com.fasterxml.jackson.annotation.JsonProperty;
import javax.validation.constraints.NotNull;

/**
 * Holds & provides access to output stream configuration options.
 */
@SuppressWarnings("checkstyle:visibilitymodifier")
public class DataSiftConfig {
    /**
     * Host on which output HTTP API is exposed.
     */
    @NotNull
    @JsonProperty("base_url")
    public String baseURL;

    /**
     * Port on which output HTTP API is exposed.
     */
    @NotNull
    public Integer port;

    /**
     * Username with which to perform authentication.
     */
    @NotNull
    public String username;

    /**
     * API key with which to perform authentication.
     */
    @NotNull
    @JsonProperty("api_key")
    public String apiKey;

    /**
     * DataSift source ID to stream output into.
     */
    @NotNull
    @JsonProperty("source_id")
    public String sourceID;

    /**
     * The size of the bulk uploads.
     */
    @NotNull
    @SuppressWarnings("checkstyle:magicnumber")
    @JsonProperty("bulk_size")
    public int bulkSize = 1000;


    /**
     * The maximum interval at which to post to bulk upload in milliseconds.
     */
    @NotNull
    @SuppressWarnings("checkstyle:magicnumber")
    @JsonProperty("bulk_interval")
    public int bulkInterval = 1000;
}
