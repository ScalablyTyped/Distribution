package typings
package awsDashSdkLib.clientsKinesisvideoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait KinesisVideo
  extends awsDashSdkLib.libServiceMod.Service {
  @JSName("config")
  var config_KinesisVideo: awsDashSdkLib.libConfigMod.ConfigBase with ClientConfiguration = js.native
  /**
    * Creates a new Kinesis video stream.  When you create a new stream, Kinesis Video Streams assigns it a version number. When you change the stream's metadata, Kinesis Video Streams updates the version.   CreateStream is an asynchronous operation. For information about how the service works, see How it Works.  You must have permissions for the KinesisVideo:CreateStream action.
    */
  def createStream(): awsDashSdkLib.libRequestMod.Request[CreateStreamOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createStream(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateStreamOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateStreamOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates a new Kinesis video stream.  When you create a new stream, Kinesis Video Streams assigns it a version number. When you change the stream's metadata, Kinesis Video Streams updates the version.   CreateStream is an asynchronous operation. For information about how the service works, see How it Works.  You must have permissions for the KinesisVideo:CreateStream action.
    */
  def createStream(params: CreateStreamInput): awsDashSdkLib.libRequestMod.Request[CreateStreamOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createStream(
    params: CreateStreamInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateStreamOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateStreamOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes a Kinesis video stream and the data contained in the stream.  This method marks the stream for deletion, and makes the data in the stream inaccessible immediately.    To ensure that you have the latest version of the stream before deleting it, you can specify the stream version. Kinesis Video Streams assigns a version to each stream. When you update a stream, Kinesis Video Streams assigns a new version number. To get the latest stream version, use the DescribeStream API.  This operation requires permission for the KinesisVideo:DeleteStream action.
    */
  def deleteStream(): awsDashSdkLib.libRequestMod.Request[DeleteStreamOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteStream(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DeleteStreamOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DeleteStreamOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes a Kinesis video stream and the data contained in the stream.  This method marks the stream for deletion, and makes the data in the stream inaccessible immediately.    To ensure that you have the latest version of the stream before deleting it, you can specify the stream version. Kinesis Video Streams assigns a version to each stream. When you update a stream, Kinesis Video Streams assigns a new version number. To get the latest stream version, use the DescribeStream API.  This operation requires permission for the KinesisVideo:DeleteStream action.
    */
  def deleteStream(params: DeleteStreamInput): awsDashSdkLib.libRequestMod.Request[DeleteStreamOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteStream(
    params: DeleteStreamInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DeleteStreamOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DeleteStreamOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns the most current information about the specified stream. You must specify either the StreamName or the StreamARN. 
    */
  def describeStream(): awsDashSdkLib.libRequestMod.Request[DescribeStreamOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeStream(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeStreamOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeStreamOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns the most current information about the specified stream. You must specify either the StreamName or the StreamARN. 
    */
  def describeStream(params: DescribeStreamInput): awsDashSdkLib.libRequestMod.Request[DescribeStreamOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeStream(
    params: DescribeStreamInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeStreamOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeStreamOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Gets an endpoint for a specified stream for either reading or writing. Use this endpoint in your application to read from the specified stream (using the GetMedia or GetMediaForFragmentList operations) or write to it (using the PutMedia operation).   The returned endpoint does not have the API name appended. The client needs to add the API name to the returned endpoint.  In the request, specify the stream either by StreamName or StreamARN.
    */
  def getDataEndpoint(): awsDashSdkLib.libRequestMod.Request[GetDataEndpointOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getDataEndpoint(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetDataEndpointOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetDataEndpointOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Gets an endpoint for a specified stream for either reading or writing. Use this endpoint in your application to read from the specified stream (using the GetMedia or GetMediaForFragmentList operations) or write to it (using the PutMedia operation).   The returned endpoint does not have the API name appended. The client needs to add the API name to the returned endpoint.  In the request, specify the stream either by StreamName or StreamARN.
    */
  def getDataEndpoint(params: GetDataEndpointInput): awsDashSdkLib.libRequestMod.Request[GetDataEndpointOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getDataEndpoint(
    params: GetDataEndpointInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetDataEndpointOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetDataEndpointOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns an array of StreamInfo objects. Each object describes a stream. To retrieve only streams that satisfy a specific condition, you can specify a StreamNameCondition. 
    */
  def listStreams(): awsDashSdkLib.libRequestMod.Request[ListStreamsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listStreams(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListStreamsOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListStreamsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns an array of StreamInfo objects. Each object describes a stream. To retrieve only streams that satisfy a specific condition, you can specify a StreamNameCondition. 
    */
  def listStreams(params: ListStreamsInput): awsDashSdkLib.libRequestMod.Request[ListStreamsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listStreams(
    params: ListStreamsInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListStreamsOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListStreamsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns a list of tags associated with the specified stream. In the request, you must specify either the StreamName or the StreamARN. 
    */
  def listTagsForStream(): awsDashSdkLib.libRequestMod.Request[ListTagsForStreamOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listTagsForStream(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListTagsForStreamOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListTagsForStreamOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns a list of tags associated with the specified stream. In the request, you must specify either the StreamName or the StreamARN. 
    */
  def listTagsForStream(params: ListTagsForStreamInput): awsDashSdkLib.libRequestMod.Request[ListTagsForStreamOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listTagsForStream(
    params: ListTagsForStreamInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListTagsForStreamOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListTagsForStreamOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Adds one or more tags to a stream. A tag is a key-value pair (the value is optional) that you can define and assign to AWS resources. If you specify a tag that already exists, the tag value is replaced with the value that you specify in the request. For more information, see Using Cost Allocation Tags in the AWS Billing and Cost Management User Guide.  You must provide either the StreamName or the StreamARN. This operation requires permission for the KinesisVideo:TagStream action. Kinesis video streams support up to 50 tags.
    */
  def tagStream(): awsDashSdkLib.libRequestMod.Request[TagStreamOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def tagStream(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ TagStreamOutput, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[TagStreamOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Adds one or more tags to a stream. A tag is a key-value pair (the value is optional) that you can define and assign to AWS resources. If you specify a tag that already exists, the tag value is replaced with the value that you specify in the request. For more information, see Using Cost Allocation Tags in the AWS Billing and Cost Management User Guide.  You must provide either the StreamName or the StreamARN. This operation requires permission for the KinesisVideo:TagStream action. Kinesis video streams support up to 50 tags.
    */
  def tagStream(params: TagStreamInput): awsDashSdkLib.libRequestMod.Request[TagStreamOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def tagStream(
    params: TagStreamInput,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ TagStreamOutput, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[TagStreamOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Removes one or more tags from a stream. In the request, specify only a tag key or keys; don't specify the value. If you specify a tag key that does not exist, it's ignored. In the request, you must provide the StreamName or StreamARN.
    */
  def untagStream(): awsDashSdkLib.libRequestMod.Request[UntagStreamOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def untagStream(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ UntagStreamOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[UntagStreamOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Removes one or more tags from a stream. In the request, specify only a tag key or keys; don't specify the value. If you specify a tag key that does not exist, it's ignored. In the request, you must provide the StreamName or StreamARN.
    */
  def untagStream(params: UntagStreamInput): awsDashSdkLib.libRequestMod.Request[UntagStreamOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def untagStream(
    params: UntagStreamInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ UntagStreamOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[UntagStreamOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    *  Increases or decreases the stream's data retention period by the value that you specify. To indicate whether you want to increase or decrease the data retention period, specify the Operation parameter in the request body. In the request, you must specify either the StreamName or the StreamARN.   The retention period that you specify replaces the current value.  This operation requires permission for the KinesisVideo:UpdateDataRetention action. Changing the data retention period affects the data in the stream as follows:   If the data retention period is increased, existing data is retained for the new retention period. For example, if the data retention period is increased from one hour to seven hours, all existing data is retained for seven hours.   If the data retention period is decreased, existing data is retained for the new retention period. For example, if the data retention period is decreased from seven hours to one hour, all existing data is retained for one hour, and any data older than one hour is deleted immediately.  
    */
  def updateDataRetention(): awsDashSdkLib.libRequestMod.Request[UpdateDataRetentionOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def updateDataRetention(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ UpdateDataRetentionOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[UpdateDataRetentionOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    *  Increases or decreases the stream's data retention period by the value that you specify. To indicate whether you want to increase or decrease the data retention period, specify the Operation parameter in the request body. In the request, you must specify either the StreamName or the StreamARN.   The retention period that you specify replaces the current value.  This operation requires permission for the KinesisVideo:UpdateDataRetention action. Changing the data retention period affects the data in the stream as follows:   If the data retention period is increased, existing data is retained for the new retention period. For example, if the data retention period is increased from one hour to seven hours, all existing data is retained for seven hours.   If the data retention period is decreased, existing data is retained for the new retention period. For example, if the data retention period is decreased from seven hours to one hour, all existing data is retained for one hour, and any data older than one hour is deleted immediately.  
    */
  def updateDataRetention(params: UpdateDataRetentionInput): awsDashSdkLib.libRequestMod.Request[UpdateDataRetentionOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def updateDataRetention(
    params: UpdateDataRetentionInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ UpdateDataRetentionOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[UpdateDataRetentionOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Updates stream metadata, such as the device name and media type. You must provide the stream name or the Amazon Resource Name (ARN) of the stream. To make sure that you have the latest version of the stream before updating it, you can specify the stream version. Kinesis Video Streams assigns a version to each stream. When you update a stream, Kinesis Video Streams assigns a new version number. To get the latest stream version, use the DescribeStream API.   UpdateStream is an asynchronous operation, and takes time to complete.
    */
  def updateStream(): awsDashSdkLib.libRequestMod.Request[UpdateStreamOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def updateStream(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ UpdateStreamOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[UpdateStreamOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Updates stream metadata, such as the device name and media type. You must provide the stream name or the Amazon Resource Name (ARN) of the stream. To make sure that you have the latest version of the stream before updating it, you can specify the stream version. Kinesis Video Streams assigns a version to each stream. When you update a stream, Kinesis Video Streams assigns a new version number. To get the latest stream version, use the DescribeStream API.   UpdateStream is an asynchronous operation, and takes time to complete.
    */
  def updateStream(params: UpdateStreamInput): awsDashSdkLib.libRequestMod.Request[UpdateStreamOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def updateStream(
    params: UpdateStreamInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ UpdateStreamOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[UpdateStreamOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
}

