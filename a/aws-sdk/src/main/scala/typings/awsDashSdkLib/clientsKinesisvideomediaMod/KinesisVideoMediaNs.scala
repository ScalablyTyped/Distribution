package typings
package awsDashSdkLib.clientsKinesisvideomediaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("aws-sdk/clients/kinesisvideomedia", "KinesisVideoMedia")
@js.native
object KinesisVideoMediaNs extends js.Object {
  
  trait ClientApiVersions extends js.Object {
    /**
         * A string in YYYY-MM-DD format that represents the latest possible API version that can be used in this service. Specify 'latest' to use the latest possible version.
         */
    var apiVersion: js.UndefOr[apiVersion] = js.undefined
  }
  
  
  trait GetMediaInput extends js.Object {
    /**
         * Identifies the starting chunk to get from the specified stream. 
         */
    var StartSelector: StartSelector
    /**
         * The ARN of the stream from where you want to get the media content. If you don't specify the streamARN, you must specify the streamName.
         */
    var StreamARN: js.UndefOr[ResourceARN] = js.undefined
    /**
         * The Kinesis video stream name from where you want to get the media content. If you don't specify the streamName, you must specify the streamARN.
         */
    var StreamName: js.UndefOr[StreamName] = js.undefined
  }
  
  
  trait GetMediaOutput extends js.Object {
    /**
         * The content type of the requested media.
         */
    var ContentType: js.UndefOr[ContentType] = js.undefined
    /**
         *  The payload Kinesis Video Streams returns is a sequence of chunks from the specified stream. For information about the chunks, see . The chunks that Kinesis Video Streams returns in the GetMedia call also include the following additional Matroska (MKV) tags:    AWS_KINESISVIDEO_CONTINUATION_TOKEN (UTF-8 string) - In the event your GetMedia call terminates, you can use this continuation token in your next request to get the next chunk where the last request terminated.   AWS_KINESISVIDEO_MILLIS_BEHIND_NOW (UTF-8 string) - Client applications can use this tag value to determine how far behind the chunk returned in the response is from the latest chunk on the stream.    AWS_KINESISVIDEO_FRAGMENT_NUMBER - Fragment number returned in the chunk.   AWS_KINESISVIDEO_SERVER_TIMESTAMP - Server time stamp of the fragment.   AWS_KINESISVIDEO_PRODUCER_TIMESTAMP - Producer time stamp of the fragment.   The following tags will be present if an error occurs:   AWS_KINESISVIDEO_ERROR_CODE - String description of an error that caused GetMedia to stop.   AWS_KINESISVIDEO_ERROR_ID: Integer code of the error.   The error codes are as follows:   3002 - Error writing to the stream   4000 - Requested fragment is not found   4500 - Access denied for the stream's KMS key   4501 - Stream's KMS key is disabled   4502 - Validation error on the Stream's KMS key   4503 - KMS key specified in the stream is unavailable   4504 - Invalid usage of the KMS key specified in the stream   4505 - Invalid state of the KMS key specified in the stream   4506 - Unable to find the KMS key specified in the stream   5000 - Internal error  
         */
    var Payload: js.UndefOr[Payload] = js.undefined
  }
  
  
  trait StartSelector extends js.Object {
    /**
         * Specifies the fragment number from where you want the GetMedia API to start returning the fragments. 
         */
    var AfterFragmentNumber: js.UndefOr[FragmentNumberString] = js.undefined
    /**
         * Continuation token that Kinesis Video Streams returned in the previous GetMedia response. The GetMedia API then starts with the chunk identified by the continuation token.
         */
    var ContinuationToken: js.UndefOr[ContinuationToken] = js.undefined
    /**
         * Identifies the fragment on the Kinesis video stream where you want to start getting the data from.   NOW - Start with the latest chunk on the stream.   EARLIEST - Start with earliest available chunk on the stream.   FRAGMENT_NUMBER - Start with the chunk containing the specific fragment. You must also specify the StartFragmentNumber.   PRODUCER_TIMESTAMP or SERVER_TIMESTAMP - Start with the chunk containing a fragment with the specified producer or server time stamp. You specify the time stamp by adding StartTimestamp.    CONTINUATION_TOKEN - Read using the specified continuation token.     If you choose the NOW, EARLIEST, or CONTINUATION_TOKEN as the startSelectorType, you don't provide any additional information in the startSelector. 
         */
    var StartSelectorType: StartSelectorType
    /**
         * A time stamp value. This value is required if you choose the PRODUCER_TIMESTAMP or the SERVER_TIMESTAMP as the startSelectorType. The GetMedia API then starts with the chunk containing the fragment that has the specified time stamp.
         */
    var StartTimestamp: js.UndefOr[Timestamp] = js.undefined
  }
  
  @js.native
  trait Types
    extends awsDashSdkLib.libServiceMod.Service {
    @JSName("config")
    var config_Types: awsDashSdkLib.libConfigMod.ConfigBase with ClientConfiguration = js.native
    /**
       *  Use this API to retrieve media content from a Kinesis video stream. In the request, you identify stream name or stream Amazon Resource Name (ARN), and the starting chunk. Kinesis Video Streams then returns a stream of chunks in order by fragment number.   You must first call the GetDataEndpoint API to get an endpoint to which you can then send the GetMedia requests.   When you put media data (fragments) on a stream, Kinesis Video Streams stores each incoming fragment and related metadata in what is called a "chunk." For more information, see . The GetMedia API returns a stream of these chunks starting from the chunk that you specify in the request.  The following limits apply when using the GetMedia API:   A client can call GetMedia up to five times per second per stream.    Kinesis Video Streams sends media data at a rate of up to 25 megabytes per second (or 200 megabits per second) during a GetMedia session.   
       */
    def getMedia(): awsDashSdkLib.libRequestMod.Request[GetMediaOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       *  Use this API to retrieve media content from a Kinesis video stream. In the request, you identify stream name or stream Amazon Resource Name (ARN), and the starting chunk. Kinesis Video Streams then returns a stream of chunks in order by fragment number.   You must first call the GetDataEndpoint API to get an endpoint to which you can then send the GetMedia requests.   When you put media data (fragments) on a stream, Kinesis Video Streams stores each incoming fragment and related metadata in what is called a "chunk." For more information, see . The GetMedia API returns a stream of these chunks starting from the chunk that you specify in the request.  The following limits apply when using the GetMedia API:   A client can call GetMedia up to five times per second per stream.    Kinesis Video Streams sends media data at a rate of up to 25 megabytes per second (or 200 megabits per second) during a GetMedia session.   
       */
    def getMedia(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ GetMediaOutput, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[GetMediaOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       *  Use this API to retrieve media content from a Kinesis video stream. In the request, you identify stream name or stream Amazon Resource Name (ARN), and the starting chunk. Kinesis Video Streams then returns a stream of chunks in order by fragment number.   You must first call the GetDataEndpoint API to get an endpoint to which you can then send the GetMedia requests.   When you put media data (fragments) on a stream, Kinesis Video Streams stores each incoming fragment and related metadata in what is called a "chunk." For more information, see . The GetMedia API returns a stream of these chunks starting from the chunk that you specify in the request.  The following limits apply when using the GetMedia API:   A client can call GetMedia up to five times per second per stream.    Kinesis Video Streams sends media data at a rate of up to 25 megabytes per second (or 200 megabits per second) during a GetMedia session.   
       */
    def getMedia(params: GetMediaInput): awsDashSdkLib.libRequestMod.Request[GetMediaOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       *  Use this API to retrieve media content from a Kinesis video stream. In the request, you identify stream name or stream Amazon Resource Name (ARN), and the starting chunk. Kinesis Video Streams then returns a stream of chunks in order by fragment number.   You must first call the GetDataEndpoint API to get an endpoint to which you can then send the GetMedia requests.   When you put media data (fragments) on a stream, Kinesis Video Streams stores each incoming fragment and related metadata in what is called a "chunk." For more information, see . The GetMedia API returns a stream of these chunks starting from the chunk that you specify in the request.  The following limits apply when using the GetMedia API:   A client can call GetMedia up to five times per second per stream.    Kinesis Video Streams sends media data at a rate of up to 25 megabytes per second (or 200 megabits per second) during a GetMedia session.   
       */
    def getMedia(
      params: GetMediaInput,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ GetMediaOutput, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[GetMediaOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  }
  
  val TypesNs: this.type = js.native
  type ClientConfiguration = awsDashSdkLib.libServiceMod.ServiceConfigurationOptions with ClientApiVersions
  type ContentType = java.lang.String
  type ContinuationToken = java.lang.String
  type FragmentNumberString = java.lang.String
  type Payload = nodeLib.Buffer | stdLib.Uint8Array | awsDashSdkLib.clientsKinesisvideomediaMod.Blob | java.lang.String | nodeLib.streamMod.Readable
  type ResourceARN = java.lang.String
  type StartSelectorType = awsDashSdkLib.awsDashSdkLibStrings.FRAGMENT_NUMBER | awsDashSdkLib.awsDashSdkLibStrings.SERVER_TIMESTAMP | awsDashSdkLib.awsDashSdkLibStrings.PRODUCER_TIMESTAMP | awsDashSdkLib.awsDashSdkLibStrings.NOW | awsDashSdkLib.awsDashSdkLibStrings.EARLIEST | awsDashSdkLib.awsDashSdkLibStrings.CONTINUATION_TOKEN | java.lang.String
  type StreamName = java.lang.String
  type Timestamp = stdLib.Date
  type apiVersion = awsDashSdkLib.awsDashSdkLibStrings.`2017-09-30` | awsDashSdkLib.awsDashSdkLibStrings.latest | java.lang.String
}

