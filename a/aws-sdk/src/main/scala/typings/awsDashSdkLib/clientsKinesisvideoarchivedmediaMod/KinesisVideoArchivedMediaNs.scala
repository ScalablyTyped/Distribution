package typings
package awsDashSdkLib.clientsKinesisvideoarchivedmediaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("aws-sdk/clients/kinesisvideoarchivedmedia", "KinesisVideoArchivedMedia")
@js.native
object KinesisVideoArchivedMediaNs extends js.Object {
  trait ClientApiVersions extends js.Object {
    /**
      * A string in YYYY-MM-DD format that represents the latest possible API version that can be used in this service. Specify 'latest' to use the latest possible version.
      */
    var apiVersion: js.UndefOr[apiVersion] = js.undefined
  }
  
  trait Fragment extends js.Object {
    /**
      * The playback duration or other time value associated with the fragment.
      */
    var FragmentLengthInMilliseconds: js.UndefOr[Long] = js.undefined
    /**
      * The index value of the fragment.
      */
    var FragmentNumber: js.UndefOr[String] = js.undefined
    /**
      * The total fragment size, including information about the fragment and contained media data.
      */
    var FragmentSizeInBytes: js.UndefOr[Long] = js.undefined
    /**
      * The timestamp from the producer corresponding to the fragment.
      */
    var ProducerTimestamp: js.UndefOr[Timestamp] = js.undefined
    /**
      * The timestamp from the AWS server corresponding to the fragment.
      */
    var ServerTimestamp: js.UndefOr[Timestamp] = js.undefined
  }
  
  trait FragmentSelector extends js.Object {
    /**
      * The origin of the timestamps to use (Server or Producer).
      */
    var FragmentSelectorType: FragmentSelectorType
    /**
      * The range of timestamps to return.
      */
    var TimestampRange: TimestampRange
  }
  
  trait GetHLSStreamingSessionURLInput extends js.Object {
    /**
      * Specifies which format should be used for packaging the media. Specifying the FRAGMENTED_MP4 container format packages the media into MP4 fragments (fMP4 or CMAF). This is the recommended packaging because there is minimal packaging overhead. The other container format option is MPEG_TS. HLS has supported MPEG TS chunks since it was released and is sometimes the only supported packaging on older HLS players. MPEG TS typically has a 5-25 percent packaging overhead. This means MPEG TS typically requires 5-25 percent more bandwidth and cost than fMP4. The default is FRAGMENTED_MP4.
      */
    var ContainerFormat: js.UndefOr[ContainerFormat] = js.undefined
    /**
      * Specifies when flags marking discontinuities between fragments will be added to the media playlists. The default is ALWAYS when HLSFragmentSelector is SERVER_TIMESTAMP, and NEVER when it is PRODUCER_TIMESTAMP. Media players typically build a timeline of media content to play, based on the timestamps of each fragment. This means that if there is any overlap between fragments (as is typical if HLSFragmentSelector is SERVER_TIMESTAMP), the media player timeline has small gaps between fragments in some places, and overwrites frames in other places. When there are discontinuity flags between fragments, the media player is expected to reset the timeline, resulting in the fragment being played immediately after the previous fragment. We recommend that you always have discontinuity flags between fragments if the fragment timestamps are not accurate or if fragments might be missing. You should not place discontinuity flags between fragments for the player timeline to accurately map to the producer timestamps.
      */
    var DiscontinuityMode: js.UndefOr[DiscontinuityMode] = js.undefined
    /**
      * Specifies when the fragment start timestamps should be included in the HLS media playlist. Typically, media players report the playhead position as a time relative to the start of the first fragment in the playback session. However, when the start timestamps are included in the HLS media playlist, some media players might report the current playhead as an absolute time based on the fragment timestamps. This can be useful for creating a playback experience that shows viewers the wall-clock time of the media. The default is NEVER. When HLSFragmentSelector is SERVER_TIMESTAMP, the timestamps will be the server start timestamps. Similarly, when HLSFragmentSelector is PRODUCER_TIMESTAMP, the timestamps will be the producer start timestamps. 
      */
    var DisplayFragmentTimestamp: js.UndefOr[DisplayFragmentTimestamp] = js.undefined
    /**
      * The time in seconds until the requested session expires. This value can be between 300 (5 minutes) and 43200 (12 hours). When a session expires, no new calls to GetHLSMasterPlaylist, GetHLSMediaPlaylist, GetMP4InitFragment, or GetMP4MediaFragment can be made for that session. The default is 300 (5 minutes).
      */
    var Expires: js.UndefOr[Expires] = js.undefined
    /**
      * The time range of the requested fragment, and the source of the timestamps. This parameter is required if PlaybackMode is ON_DEMAND. This parameter is optional if PlaybackMode is LIVE. If PlaybackMode is LIVE, the FragmentSelectorType can be set, but the TimestampRange should not be set. If PlaybackMode is ON_DEMAND, both FragmentSelectorType and TimestampRange must be set.
      */
    var HLSFragmentSelector: js.UndefOr[HLSFragmentSelector] = js.undefined
    /**
      * The maximum number of fragments that are returned in the HLS media playlists. When the PlaybackMode is LIVE, the most recent fragments are returned up to this value. When the PlaybackMode is ON_DEMAND, the oldest fragments are returned, up to this maximum number. When there are a higher number of fragments available in a live HLS media playlist, video players often buffer content before starting playback. Increasing the buffer size increases the playback latency, but it decreases the likelihood that rebuffering will occur during playback. We recommend that a live HLS media playlist have a minimum of 3 fragments and a maximum of 10 fragments. The default is 5 fragments if PlaybackMode is LIVE, and 1,000 if PlaybackMode is ON_DEMAND.  The maximum value of 1,000 fragments corresponds to more than 16 minutes of video on streams with 1-second fragments, and more than 2 1/2 hours of video on streams with 10-second fragments.
      */
    var MaxMediaPlaylistFragmentResults: js.UndefOr[PageLimit] = js.undefined
    /**
      * Whether to retrieve live or archived, on-demand data. Features of the two types of session include the following:     LIVE : For sessions of this type, the HLS media playlist is continually updated with the latest fragments as they become available. We recommend that the media player retrieve a new playlist on a one-second interval. When this type of session is played in a media player, the user interface typically displays a "live" notification, with no scrubber control for choosing the position in the playback window to display.  In LIVE mode, the newest available fragments are included in an HLS media playlist, even if there is a gap between fragments (that is, if a fragment is missing). A gap like this might cause a media player to halt or cause a jump in playback. In this mode, fragments are not added to the HLS media playlist if they are older than the newest fragment in the playlist. If the missing fragment becomes available after a subsequent fragment is added to the playlist, the older fragment is not added, and the gap is not filled.      ON_DEMAND : For sessions of this type, the HLS media playlist contains all the fragments for the session, up to the number that is specified in MaxMediaPlaylistFragmentResults. The playlist must be retrieved only once for each session. When this type of session is played in a media player, the user interface typically displays a scrubber control for choosing the position in the playback window to display.   In both playback modes, if FragmentSelectorType is PRODUCER_TIMESTAMP, and if there are multiple fragments with the same start timestamp, the fragment that has the larger fragment number (that is, the newer fragment) is included in the HLS media playlist. The other fragments are not included. Fragments that have different timestamps but have overlapping durations are still included in the HLS media playlist. This can lead to unexpected behavior in the media player. The default is LIVE.
      */
    var PlaybackMode: js.UndefOr[PlaybackMode] = js.undefined
    /**
      * The Amazon Resource Name (ARN) of the stream for which to retrieve the HLS master playlist URL. You must specify either the StreamName or the StreamARN.
      */
    var StreamARN: js.UndefOr[ResourceARN] = js.undefined
    /**
      * The name of the stream for which to retrieve the HLS master playlist URL. You must specify either the StreamName or the StreamARN.
      */
    var StreamName: js.UndefOr[StreamName] = js.undefined
  }
  
  trait GetHLSStreamingSessionURLOutput extends js.Object {
    /**
      * The URL (containing the session token) that a media player can use to retrieve the HLS master playlist.
      */
    var HLSStreamingSessionURL: js.UndefOr[HLSStreamingSessionURL] = js.undefined
  }
  
  trait GetMediaForFragmentListInput extends js.Object {
    /**
      * A list of the numbers of fragments for which to retrieve media. You retrieve these values with ListFragments.
      */
    var Fragments: FragmentNumberList
    /**
      * The name of the stream from which to retrieve fragment media.
      */
    var StreamName: StreamName
  }
  
  trait GetMediaForFragmentListOutput extends js.Object {
    /**
      * The content type of the requested media.
      */
    var ContentType: js.UndefOr[ContentType] = js.undefined
    /**
      * The payload that Kinesis Video Streams returns is a sequence of chunks from the specified stream. For information about the chunks, see PutMedia. The chunks that Kinesis Video Streams returns in the GetMediaForFragmentList call also include the following additional Matroska (MKV) tags:    AWS_KINESISVIDEO_FRAGMENT_NUMBER - Fragment number returned in the chunk.   AWS_KINESISVIDEO_SERVER_SIDE_TIMESTAMP - Server-side timestamp of the fragment.   AWS_KINESISVIDEO_PRODUCER_SIDE_TIMESTAMP - Producer-side timestamp of the fragment.   The following tags will be included if an exception occurs:   AWS_KINESISVIDEO_FRAGMENT_NUMBER - The number of the fragment that threw the exception   AWS_KINESISVIDEO_EXCEPTION_ERROR_CODE - The integer code of the exception   AWS_KINESISVIDEO_EXCEPTION_MESSAGE - A text description of the exception  
      */
    var Payload: js.UndefOr[Payload] = js.undefined
  }
  
  trait HLSFragmentSelector extends js.Object {
    /**
      * The source of the timestamps for the requested media. When FragmentSelectorType is set to PRODUCER_TIMESTAMP and GetHLSStreamingSessionURLInput$PlaybackMode is ON_DEMAND, the first fragment ingested with a producer timestamp within the specified FragmentSelector$TimestampRange is included in the media playlist. In addition, the fragments with producer timestamps within the TimestampRange ingested immediately following the first fragment (up to the GetHLSStreamingSessionURLInput$MaxMediaPlaylistFragmentResults value) are included.  Fragments that have duplicate producer timestamps are deduplicated. This means that if producers are producing a stream of fragments with producer timestamps that are approximately equal to the true clock time, the HLS media playlists will contain all of the fragments within the requested timestamp range. If some fragments are ingested within the same time range and very different points in time, only the oldest ingested collection of fragments are returned. When FragmentSelectorType is set to PRODUCER_TIMESTAMP and GetHLSStreamingSessionURLInput$PlaybackMode is LIVE, the producer timestamps are used in the MP4 fragments and for deduplication. But the most recently ingested fragments based on server timestamps are included in the HLS media playlist. This means that even if fragments ingested in the past have producer timestamps with values now, they are not included in the HLS media playlist. The default is SERVER_TIMESTAMP.
      */
    var FragmentSelectorType: js.UndefOr[HLSFragmentSelectorType] = js.undefined
    /**
      * The start and end of the timestamp range for the requested media. This value should not be present if PlaybackType is LIVE.
      */
    var TimestampRange: js.UndefOr[HLSTimestampRange] = js.undefined
  }
  
  trait HLSTimestampRange extends js.Object {
    /**
      * The end of the timestamp range for the requested media. This value must be within 3 hours of the specified StartTimestamp, and it must be later than the StartTimestamp value. If FragmentSelectorType for the request is SERVER_TIMESTAMP, this value must be in the past. If the HLSTimestampRange value is specified, the EndTimestamp value is required.  This value is inclusive. The EndTimestamp is compared to the (starting) timestamp of the fragment. Fragments that start before the EndTimestamp value and continue past it are included in the session. 
      */
    var EndTimestamp: js.UndefOr[Timestamp] = js.undefined
    /**
      * The start of the timestamp range for the requested media. If the HLSTimestampRange value is specified, the StartTimestamp value is required.  This value is inclusive. Fragments that start before the StartTimestamp and continue past it are included in the session. If FragmentSelectorType is SERVER_TIMESTAMP, the StartTimestamp must be later than the stream head. 
      */
    var StartTimestamp: js.UndefOr[Timestamp] = js.undefined
  }
  
  trait ListFragmentsInput extends js.Object {
    /**
      * Describes the timestamp range and timestamp origin for the range of fragments to return.
      */
    var FragmentSelector: js.UndefOr[FragmentSelector] = js.undefined
    /**
      * The total number of fragments to return. If the total number of fragments available is more than the value specified in max-results, then a ListFragmentsOutput$NextToken is provided in the output that you can use to resume pagination.
      */
    var MaxResults: js.UndefOr[PageLimit] = js.undefined
    /**
      * A token to specify where to start paginating. This is the ListFragmentsOutput$NextToken from a previously truncated response.
      */
    var NextToken: js.UndefOr[String] = js.undefined
    /**
      * The name of the stream from which to retrieve a fragment list.
      */
    var StreamName: StreamName
  }
  
  trait ListFragmentsOutput extends js.Object {
    /**
      * A list of archived Fragment objects from the stream that meet the selector criteria. Results are in no specific order, even across pages.
      */
    var Fragments: js.UndefOr[FragmentList] = js.undefined
    /**
      * If the returned list is truncated, the operation returns this token to use to retrieve the next page of results. This value is null when there are no more results to return.
      */
    var NextToken: js.UndefOr[String] = js.undefined
  }
  
  trait TimestampRange extends js.Object {
    /**
      * The ending timestamp in the range of timestamps for which to return fragments.
      */
    var EndTimestamp: Timestamp
    /**
      * The starting timestamp in the range of timestamps for which to return fragments.
      */
    var StartTimestamp: Timestamp
  }
  
  @js.native
  trait Types
    extends awsDashSdkLib.libServiceMod.Service {
    @JSName("config")
    var config_Types: awsDashSdkLib.libConfigMod.ConfigBase with ClientConfiguration = js.native
    /**
      * Retrieves an HTTP Live Streaming (HLS) URL for the stream. You can then open the URL in a browser or media player to view the stream contents. You must specify either the StreamName or the StreamARN. An Amazon Kinesis video stream has the following requirements for providing data through HLS:   The media must contain h.264 encoded video and, optionally, AAC encoded audio. Specifically, the codec id of track 1 should be V_MPEG/ISO/AVC. Optionally, the codec id of track 2 should be A_AAC.   Data retention must be greater than 0.   The video track of each fragment must contain codec private data in the Advanced Video Coding (AVC) for H.264 format (MPEG-4 specification ISO/IEC 14496-15). For information about adapting stream data to a given format, see NAL Adaptation Flags.   The audio track (if present) of each fragment must contain codec private data in the AAC format (AAC specification ISO/IEC 13818-7).   Kinesis Video Streams HLS sessions contain fragments in the fragmented MPEG-4 form (also called fMP4 or CMAF), rather than the MPEG-2 form (also called TS chunks, which the HLS specification also supports). For more information about HLS fragment types, see the HLS specification. The following procedure shows how to use HLS with Kinesis Video Streams:   Get an endpoint using GetDataEndpoint, specifying GET_HLS_STREAMING_SESSION_URL for the APIName parameter.   Retrieve the HLS URL using GetHLSStreamingSessionURL. Kinesis Video Streams creates an HLS streaming session to be used for accessing content in a stream using the HLS protocol. GetHLSStreamingSessionURL returns an authenticated URL (that includes an encrypted session token) for the session's HLS master playlist (the root resource needed for streaming with HLS).  Don't share or store this token where an unauthorized entity could access it. The token provides access to the content of the stream. Safeguard the token with the same measures that you would use with your AWS credentials.  The media that is made available through the playlist consists only of the requested stream, time range, and format. No other media data (such as frames outside the requested window or alternate bitrates) is made available.   Provide the URL (containing the encrypted session token) for the HLS master playlist to a media player that supports the HLS protocol. Kinesis Video Streams makes the HLS media playlist, initialization fragment, and media fragments available through the master playlist URL. The initialization fragment contains the codec private data for the stream, and other data needed to set up the video or audio decoder and renderer. The media fragments contain H.264-encoded video frames or AAC-encoded audio samples.   The media player receives the authenticated URL and requests stream metadata and media data normally. When the media player requests data, it calls the following actions:    GetHLSMasterPlaylist: Retrieves an HLS master playlist, which contains a URL for the GetHLSMediaPlaylist action for each track, and additional metadata for the media player, including estimated bitrate and resolution.    GetHLSMediaPlaylist: Retrieves an HLS media playlist, which contains a URL to access the MP4 initialization fragment with the GetMP4InitFragment action, and URLs to access the MP4 media fragments with the GetMP4MediaFragment actions. The HLS media playlist also contains metadata about the stream that the player needs to play it, such as whether the PlaybackMode is LIVE or ON_DEMAND. The HLS media playlist is typically static for sessions with a PlaybackType of ON_DEMAND. The HLS media playlist is continually updated with new fragments for sessions with a PlaybackType of LIVE. There is a distinct HLS media playlist for the video track and the audio track (if applicable) that contains MP4 media URLs for the specific track.     GetMP4InitFragment: Retrieves the MP4 initialization fragment. The media player typically loads the initialization fragment before loading any media fragments. This fragment contains the "fytp" and "moov" MP4 atoms, and the child atoms that are needed to initialize the media player decoder. The initialization fragment does not correspond to a fragment in a Kinesis video stream. It contains only the codec private data for the stream and respective track, which the media player needs to decode the media frames.    GetMP4MediaFragment: Retrieves MP4 media fragments. These fragments contain the "moof" and "mdat" MP4 atoms and their child atoms, containing the encoded fragment's media frames and their timestamps.   After the first media fragment is made available in a streaming session, any fragments that don't contain the same codec private data cause an error to be returned when those different media fragments are loaded. Therefore, the codec private data should not change between fragments in a session. This also means that the session fails if the fragments in a stream change from having only video to having both audio and video.  Data retrieved with this action is billable. See Pricing for details.    GetTSFragment: Retrieves MPEG TS fragments containing both initialization and media data for all tracks in the stream.  If the ContainerFormat is MPEG_TS, this API is used instead of GetMP4InitFragment and GetMP4MediaFragment to retrieve stream media.  Data retrieved with this action is billable. For more information, see Kinesis Video Streams pricing.      The following restrictions apply to HLS sessions:   A streaming session URL should not be shared between players. The service might throttle a session if multiple media players are sharing it. For connection limits, see Kinesis Video Streams Limits.   A Kinesis video stream can have a maximum of five active HLS streaming sessions. If a new session is created when the maximum number of sessions is already active, the oldest (earliest created) session is closed. The number of active GetMedia connections on a Kinesis video stream does not count against this limit, and the number of active HLS sessions does not count against the active GetMedia connection limit.    You can monitor the amount of data that the media player consumes by monitoring the GetMP4MediaFragment.OutgoingBytes Amazon CloudWatch metric. For information about using CloudWatch to monitor Kinesis Video Streams, see Monitoring Kinesis Video Streams. For pricing information, see Amazon Kinesis Video Streams Pricing and AWS Pricing. Charges for both HLS sessions and outgoing AWS data apply. For more information about HLS, see HTTP Live Streaming on the Apple Developer site.
      */
    def getHLSStreamingSessionURL(): awsDashSdkLib.libRequestMod.Request[GetHLSStreamingSessionURLOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getHLSStreamingSessionURL(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetHLSStreamingSessionURLOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetHLSStreamingSessionURLOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Retrieves an HTTP Live Streaming (HLS) URL for the stream. You can then open the URL in a browser or media player to view the stream contents. You must specify either the StreamName or the StreamARN. An Amazon Kinesis video stream has the following requirements for providing data through HLS:   The media must contain h.264 encoded video and, optionally, AAC encoded audio. Specifically, the codec id of track 1 should be V_MPEG/ISO/AVC. Optionally, the codec id of track 2 should be A_AAC.   Data retention must be greater than 0.   The video track of each fragment must contain codec private data in the Advanced Video Coding (AVC) for H.264 format (MPEG-4 specification ISO/IEC 14496-15). For information about adapting stream data to a given format, see NAL Adaptation Flags.   The audio track (if present) of each fragment must contain codec private data in the AAC format (AAC specification ISO/IEC 13818-7).   Kinesis Video Streams HLS sessions contain fragments in the fragmented MPEG-4 form (also called fMP4 or CMAF), rather than the MPEG-2 form (also called TS chunks, which the HLS specification also supports). For more information about HLS fragment types, see the HLS specification. The following procedure shows how to use HLS with Kinesis Video Streams:   Get an endpoint using GetDataEndpoint, specifying GET_HLS_STREAMING_SESSION_URL for the APIName parameter.   Retrieve the HLS URL using GetHLSStreamingSessionURL. Kinesis Video Streams creates an HLS streaming session to be used for accessing content in a stream using the HLS protocol. GetHLSStreamingSessionURL returns an authenticated URL (that includes an encrypted session token) for the session's HLS master playlist (the root resource needed for streaming with HLS).  Don't share or store this token where an unauthorized entity could access it. The token provides access to the content of the stream. Safeguard the token with the same measures that you would use with your AWS credentials.  The media that is made available through the playlist consists only of the requested stream, time range, and format. No other media data (such as frames outside the requested window or alternate bitrates) is made available.   Provide the URL (containing the encrypted session token) for the HLS master playlist to a media player that supports the HLS protocol. Kinesis Video Streams makes the HLS media playlist, initialization fragment, and media fragments available through the master playlist URL. The initialization fragment contains the codec private data for the stream, and other data needed to set up the video or audio decoder and renderer. The media fragments contain H.264-encoded video frames or AAC-encoded audio samples.   The media player receives the authenticated URL and requests stream metadata and media data normally. When the media player requests data, it calls the following actions:    GetHLSMasterPlaylist: Retrieves an HLS master playlist, which contains a URL for the GetHLSMediaPlaylist action for each track, and additional metadata for the media player, including estimated bitrate and resolution.    GetHLSMediaPlaylist: Retrieves an HLS media playlist, which contains a URL to access the MP4 initialization fragment with the GetMP4InitFragment action, and URLs to access the MP4 media fragments with the GetMP4MediaFragment actions. The HLS media playlist also contains metadata about the stream that the player needs to play it, such as whether the PlaybackMode is LIVE or ON_DEMAND. The HLS media playlist is typically static for sessions with a PlaybackType of ON_DEMAND. The HLS media playlist is continually updated with new fragments for sessions with a PlaybackType of LIVE. There is a distinct HLS media playlist for the video track and the audio track (if applicable) that contains MP4 media URLs for the specific track.     GetMP4InitFragment: Retrieves the MP4 initialization fragment. The media player typically loads the initialization fragment before loading any media fragments. This fragment contains the "fytp" and "moov" MP4 atoms, and the child atoms that are needed to initialize the media player decoder. The initialization fragment does not correspond to a fragment in a Kinesis video stream. It contains only the codec private data for the stream and respective track, which the media player needs to decode the media frames.    GetMP4MediaFragment: Retrieves MP4 media fragments. These fragments contain the "moof" and "mdat" MP4 atoms and their child atoms, containing the encoded fragment's media frames and their timestamps.   After the first media fragment is made available in a streaming session, any fragments that don't contain the same codec private data cause an error to be returned when those different media fragments are loaded. Therefore, the codec private data should not change between fragments in a session. This also means that the session fails if the fragments in a stream change from having only video to having both audio and video.  Data retrieved with this action is billable. See Pricing for details.    GetTSFragment: Retrieves MPEG TS fragments containing both initialization and media data for all tracks in the stream.  If the ContainerFormat is MPEG_TS, this API is used instead of GetMP4InitFragment and GetMP4MediaFragment to retrieve stream media.  Data retrieved with this action is billable. For more information, see Kinesis Video Streams pricing.      The following restrictions apply to HLS sessions:   A streaming session URL should not be shared between players. The service might throttle a session if multiple media players are sharing it. For connection limits, see Kinesis Video Streams Limits.   A Kinesis video stream can have a maximum of five active HLS streaming sessions. If a new session is created when the maximum number of sessions is already active, the oldest (earliest created) session is closed. The number of active GetMedia connections on a Kinesis video stream does not count against this limit, and the number of active HLS sessions does not count against the active GetMedia connection limit.    You can monitor the amount of data that the media player consumes by monitoring the GetMP4MediaFragment.OutgoingBytes Amazon CloudWatch metric. For information about using CloudWatch to monitor Kinesis Video Streams, see Monitoring Kinesis Video Streams. For pricing information, see Amazon Kinesis Video Streams Pricing and AWS Pricing. Charges for both HLS sessions and outgoing AWS data apply. For more information about HLS, see HTTP Live Streaming on the Apple Developer site.
      */
    def getHLSStreamingSessionURL(params: GetHLSStreamingSessionURLInput): awsDashSdkLib.libRequestMod.Request[GetHLSStreamingSessionURLOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getHLSStreamingSessionURL(
      params: GetHLSStreamingSessionURLInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetHLSStreamingSessionURLOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetHLSStreamingSessionURLOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Gets media for a list of fragments (specified by fragment number) from the archived data in an Amazon Kinesis video stream.  You must first call the GetDataEndpoint API to get an endpoint. Then send the GetMediaForFragmentList requests to this endpoint using the --endpoint-url parameter.   The following limits apply when using the GetMediaForFragmentList API:   A client can call GetMediaForFragmentList up to five times per second per stream.    Kinesis Video Streams sends media data at a rate of up to 25 megabytes per second (or 200 megabits per second) during a GetMediaForFragmentList session.   
      */
    def getMediaForFragmentList(): awsDashSdkLib.libRequestMod.Request[GetMediaForFragmentListOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getMediaForFragmentList(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetMediaForFragmentListOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetMediaForFragmentListOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Gets media for a list of fragments (specified by fragment number) from the archived data in an Amazon Kinesis video stream.  You must first call the GetDataEndpoint API to get an endpoint. Then send the GetMediaForFragmentList requests to this endpoint using the --endpoint-url parameter.   The following limits apply when using the GetMediaForFragmentList API:   A client can call GetMediaForFragmentList up to five times per second per stream.    Kinesis Video Streams sends media data at a rate of up to 25 megabytes per second (or 200 megabits per second) during a GetMediaForFragmentList session.   
      */
    def getMediaForFragmentList(params: GetMediaForFragmentListInput): awsDashSdkLib.libRequestMod.Request[GetMediaForFragmentListOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getMediaForFragmentList(
      params: GetMediaForFragmentListInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetMediaForFragmentListOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetMediaForFragmentListOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns a list of Fragment objects from the specified stream and timestamp range within the archived data. Listing fragments is eventually consistent. This means that even if the producer receives an acknowledgment that a fragment is persisted, the result might not be returned immediately from a request to ListFragments. However, results are typically available in less than one second.  You must first call the GetDataEndpoint API to get an endpoint. Then send the ListFragments requests to this endpoint using the --endpoint-url parameter.  
      */
    def listFragments(): awsDashSdkLib.libRequestMod.Request[ListFragmentsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listFragments(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListFragmentsOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListFragmentsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns a list of Fragment objects from the specified stream and timestamp range within the archived data. Listing fragments is eventually consistent. This means that even if the producer receives an acknowledgment that a fragment is persisted, the result might not be returned immediately from a request to ListFragments. However, results are typically available in less than one second.  You must first call the GetDataEndpoint API to get an endpoint. Then send the ListFragments requests to this endpoint using the --endpoint-url parameter.  
      */
    def listFragments(params: ListFragmentsInput): awsDashSdkLib.libRequestMod.Request[ListFragmentsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listFragments(
      params: ListFragmentsInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListFragmentsOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListFragmentsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  }
  
  trait _ContainerFormat extends js.Object
  
  trait _DiscontinuityMode extends js.Object
  
  trait _DisplayFragmentTimestamp extends js.Object
  
  trait _FragmentSelectorType extends js.Object
  
  trait _HLSFragmentSelectorType extends js.Object
  
  trait _PlaybackMode extends js.Object
  
  trait _apiVersion extends js.Object
  
  val TypesNs: this.type = js.native
  type ClientConfiguration = awsDashSdkLib.libServiceMod.ServiceConfigurationOptions with ClientApiVersions
  type ContainerFormat = _ContainerFormat | java.lang.String
  type ContentType = java.lang.String
  type DiscontinuityMode = _DiscontinuityMode | java.lang.String
  type DisplayFragmentTimestamp = _DisplayFragmentTimestamp | java.lang.String
  type Expires = scala.Double
  type FragmentList = js.Array[Fragment]
  type FragmentNumberList = js.Array[FragmentNumberString]
  type FragmentNumberString = java.lang.String
  type FragmentSelectorType = _FragmentSelectorType | java.lang.String
  type HLSFragmentSelectorType = _HLSFragmentSelectorType | java.lang.String
  type HLSStreamingSessionURL = java.lang.String
  type Long = scala.Double
  type PageLimit = scala.Double
  type Payload = nodeLib.Buffer | stdLib.Uint8Array | awsDashSdkLib.clientsKinesisvideoarchivedmediaMod.Blob | java.lang.String | nodeLib.streamMod.Readable
  type PlaybackMode = _PlaybackMode | java.lang.String
  type ResourceARN = java.lang.String
  type StreamName = java.lang.String
  type String = java.lang.String
  type Timestamp = stdLib.Date
  type apiVersion = _apiVersion | java.lang.String
}

