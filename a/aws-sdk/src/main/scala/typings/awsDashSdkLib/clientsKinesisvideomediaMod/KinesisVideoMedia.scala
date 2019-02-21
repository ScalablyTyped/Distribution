package typings
package awsDashSdkLib.clientsKinesisvideomediaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait KinesisVideoMedia
  extends awsDashSdkLib.libServiceMod.Service {
  @JSName("config")
  var config_KinesisVideoMedia: awsDashSdkLib.libConfigMod.ConfigBase with awsDashSdkLib.clientsKinesisvideomediaMod.KinesisVideoMediaNs.ClientConfiguration = js.native
  /**
    *  Use this API to retrieve media content from a Kinesis video stream. In the request, you identify the stream name or stream Amazon Resource Name (ARN), and the starting chunk. Kinesis Video Streams then returns a stream of chunks in order by fragment number.  You must first call the GetDataEndpoint API to get an endpoint. Then send the GetMedia requests to this endpoint using the --endpoint-url parameter.   When you put media data (fragments) on a stream, Kinesis Video Streams stores each incoming fragment and related metadata in what is called a "chunk." For more information, see . The GetMedia API returns a stream of these chunks starting from the chunk that you specify in the request.  The following limits apply when using the GetMedia API:   A client can call GetMedia up to five times per second per stream.    Kinesis Video Streams sends media data at a rate of up to 25 megabytes per second (or 200 megabits per second) during a GetMedia session.   
    */
  def getMedia(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsKinesisvideomediaMod.KinesisVideoMediaNs.GetMediaOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getMedia(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsKinesisvideomediaMod.KinesisVideoMediaNs.GetMediaOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsKinesisvideomediaMod.KinesisVideoMediaNs.GetMediaOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    *  Use this API to retrieve media content from a Kinesis video stream. In the request, you identify the stream name or stream Amazon Resource Name (ARN), and the starting chunk. Kinesis Video Streams then returns a stream of chunks in order by fragment number.  You must first call the GetDataEndpoint API to get an endpoint. Then send the GetMedia requests to this endpoint using the --endpoint-url parameter.   When you put media data (fragments) on a stream, Kinesis Video Streams stores each incoming fragment and related metadata in what is called a "chunk." For more information, see . The GetMedia API returns a stream of these chunks starting from the chunk that you specify in the request.  The following limits apply when using the GetMedia API:   A client can call GetMedia up to five times per second per stream.    Kinesis Video Streams sends media data at a rate of up to 25 megabytes per second (or 200 megabits per second) during a GetMedia session.   
    */
  def getMedia(params: awsDashSdkLib.clientsKinesisvideomediaMod.KinesisVideoMediaNs.GetMediaInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsKinesisvideomediaMod.KinesisVideoMediaNs.GetMediaOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getMedia(
    params: awsDashSdkLib.clientsKinesisvideomediaMod.KinesisVideoMediaNs.GetMediaInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsKinesisvideomediaMod.KinesisVideoMediaNs.GetMediaOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsKinesisvideomediaMod.KinesisVideoMediaNs.GetMediaOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
}

