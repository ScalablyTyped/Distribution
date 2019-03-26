package typings
package awsDashSdkLib.clientsKinesisvideoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("aws-sdk/clients/kinesisvideo", "KinesisVideo")
@js.native
object KinesisVideoNs extends js.Object {
  trait ClientApiVersions extends js.Object {
    /**
      * A string in YYYY-MM-DD format that represents the latest possible API version that can be used in this service. Specify 'latest' to use the latest possible version.
      */
    var apiVersion: js.UndefOr[apiVersion] = js.undefined
  }
  
  trait CreateStreamInput extends js.Object {
    /**
      * The number of hours that you want to retain the data in the stream. Kinesis Video Streams retains the data in a data store that is associated with the stream. The default value is 0, indicating that the stream does not persist data. When the DataRetentionInHours value is 0, consumers can still consume the fragments that remain in the service host buffer, which has a retention time limit of 5 minutes and a retention memory limit of 200 MB. Fragments are removed from the buffer when either limit is reached.
      */
    var DataRetentionInHours: js.UndefOr[DataRetentionInHours] = js.undefined
    /**
      * The name of the device that is writing to the stream.   In the current implementation, Kinesis Video Streams does not use this name. 
      */
    var DeviceName: js.UndefOr[DeviceName] = js.undefined
    /**
      * The ID of the AWS Key Management Service (AWS KMS) key that you want Kinesis Video Streams to use to encrypt stream data. If no key ID is specified, the default, Kinesis Video-managed key (aws/kinesisvideo) is used.  For more information, see DescribeKey. 
      */
    var KmsKeyId: js.UndefOr[KmsKeyId] = js.undefined
    /**
      * The media type of the stream. Consumers of the stream can use this information when processing the stream. For more information about media types, see Media Types. If you choose to specify the MediaType, see Naming Requirements for guidelines. This parameter is optional; the default value is null (or empty in JSON).
      */
    var MediaType: js.UndefOr[MediaType] = js.undefined
    /**
      * A name for the stream that you are creating. The stream name is an identifier for the stream, and must be unique for each account and region.
      */
    var StreamName: awsDashSdkLib.clientsKinesisvideoMod.KinesisVideoNs.StreamName
    /**
      * A list of tags to associate with the specified stream. Each tag is a key-value pair (the value is optional).
      */
    var Tags: js.UndefOr[ResourceTags] = js.undefined
  }
  
  trait CreateStreamOutput extends js.Object {
    /**
      * The Amazon Resource Name (ARN) of the stream.
      */
    var StreamARN: js.UndefOr[ResourceARN] = js.undefined
  }
  
  trait DeleteStreamInput extends js.Object {
    /**
      * Optional: The version of the stream that you want to delete.  Specify the version as a safeguard to ensure that your are deleting the correct stream. To get the stream version, use the DescribeStream API. If not specified, only the CreationTime is checked before deleting the stream.
      */
    var CurrentVersion: js.UndefOr[Version] = js.undefined
    /**
      * The Amazon Resource Name (ARN) of the stream that you want to delete. 
      */
    var StreamARN: ResourceARN
  }
  
  trait DeleteStreamOutput extends js.Object
  
  trait DescribeStreamInput extends js.Object {
    /**
      * The Amazon Resource Name (ARN) of the stream.
      */
    var StreamARN: js.UndefOr[ResourceARN] = js.undefined
    /**
      * The name of the stream.
      */
    var StreamName: js.UndefOr[StreamName] = js.undefined
  }
  
  trait DescribeStreamOutput extends js.Object {
    /**
      * An object that describes the stream.
      */
    var StreamInfo: js.UndefOr[StreamInfo] = js.undefined
  }
  
  trait GetDataEndpointInput extends js.Object {
    /**
      * The name of the API action for which to get an endpoint.
      */
    var APIName: awsDashSdkLib.clientsKinesisvideoMod.KinesisVideoNs.APIName
    /**
      * The Amazon Resource Name (ARN) of the stream that you want to get the endpoint for. You must specify either this parameter or a StreamName in the request. 
      */
    var StreamARN: js.UndefOr[ResourceARN] = js.undefined
    /**
      * The name of the stream that you want to get the endpoint for. You must specify either this parameter or a StreamARN in the request.
      */
    var StreamName: js.UndefOr[StreamName] = js.undefined
  }
  
  trait GetDataEndpointOutput extends js.Object {
    /**
      * The endpoint value. To read data from the stream or to write data to it, specify this endpoint in your application.
      */
    var DataEndpoint: js.UndefOr[DataEndpoint] = js.undefined
  }
  
  trait ListStreamsInput extends js.Object {
    /**
      * The maximum number of streams to return in the response. The default is 10,000.
      */
    var MaxResults: js.UndefOr[ListStreamsInputLimit] = js.undefined
    /**
      * If you specify this parameter, when the result of a ListStreams operation is truncated, the call returns the NextToken in the response. To get another batch of streams, provide this token in your next request.
      */
    var NextToken: js.UndefOr[NextToken] = js.undefined
    /**
      * Optional: Returns only streams that satisfy a specific condition. Currently, you can specify only the prefix of a stream name as a condition. 
      */
    var StreamNameCondition: js.UndefOr[StreamNameCondition] = js.undefined
  }
  
  trait ListStreamsOutput extends js.Object {
    /**
      * If the response is truncated, the call returns this element with a token. To get the next batch of streams, use this token in your next request. 
      */
    var NextToken: js.UndefOr[NextToken] = js.undefined
    /**
      * An array of StreamInfo objects.
      */
    var StreamInfoList: js.UndefOr[StreamInfoList] = js.undefined
  }
  
  trait ListTagsForStreamInput extends js.Object {
    /**
      * If you specify this parameter and the result of a ListTagsForStream call is truncated, the response includes a token that you can use in the next request to fetch the next batch of tags.
      */
    var NextToken: js.UndefOr[NextToken] = js.undefined
    /**
      * The Amazon Resource Name (ARN) of the stream that you want to list tags for.
      */
    var StreamARN: js.UndefOr[ResourceARN] = js.undefined
    /**
      * The name of the stream that you want to list tags for.
      */
    var StreamName: js.UndefOr[StreamName] = js.undefined
  }
  
  trait ListTagsForStreamOutput extends js.Object {
    /**
      * If you specify this parameter and the result of a ListTags call is truncated, the response includes a token that you can use in the next request to fetch the next set of tags.
      */
    var NextToken: js.UndefOr[NextToken] = js.undefined
    /**
      * A map of tag keys and values associated with the specified stream.
      */
    var Tags: js.UndefOr[ResourceTags] = js.undefined
  }
  
  trait ResourceTags
    extends /* key */ org.scalablytyped.runtime.StringDictionary[TagValue]
  
  trait StreamInfo extends js.Object {
    /**
      * A time stamp that indicates when the stream was created.
      */
    var CreationTime: js.UndefOr[Timestamp] = js.undefined
    /**
      * How long the stream retains data, in hours.
      */
    var DataRetentionInHours: js.UndefOr[DataRetentionInHours] = js.undefined
    /**
      * The name of the device that is associated with the stream.
      */
    var DeviceName: js.UndefOr[DeviceName] = js.undefined
    /**
      * The ID of the AWS Key Management Service (AWS KMS) key that Kinesis Video Streams uses to encrypt data on the stream.
      */
    var KmsKeyId: js.UndefOr[KmsKeyId] = js.undefined
    /**
      * The MediaType of the stream. 
      */
    var MediaType: js.UndefOr[MediaType] = js.undefined
    /**
      * The status of the stream.
      */
    var Status: js.UndefOr[Status] = js.undefined
    /**
      * The Amazon Resource Name (ARN) of the stream.
      */
    var StreamARN: js.UndefOr[ResourceARN] = js.undefined
    /**
      * The name of the stream.
      */
    var StreamName: js.UndefOr[StreamName] = js.undefined
    /**
      * The version of the stream.
      */
    var Version: js.UndefOr[Version] = js.undefined
  }
  
  trait StreamNameCondition extends js.Object {
    /**
      * A comparison operator. Currently, you can specify only the BEGINS_WITH operator, which finds streams whose names start with a given prefix.
      */
    var ComparisonOperator: js.UndefOr[ComparisonOperator] = js.undefined
    /**
      * A value to compare.
      */
    var ComparisonValue: js.UndefOr[StreamName] = js.undefined
  }
  
  trait TagStreamInput extends js.Object {
    /**
      * The Amazon Resource Name (ARN) of the resource that you want to add the tag or tags to.
      */
    var StreamARN: js.UndefOr[ResourceARN] = js.undefined
    /**
      * The name of the stream that you want to add the tag or tags to.
      */
    var StreamName: js.UndefOr[StreamName] = js.undefined
    /**
      * A list of tags to associate with the specified stream. Each tag is a key-value pair (the value is optional).
      */
    var Tags: ResourceTags
  }
  
  trait TagStreamOutput extends js.Object
  
  @js.native
  trait Types
    extends awsDashSdkLib.libServiceMod.Service {
    @JSName("config")
    var config_Types: awsDashSdkLib.libConfigMod.ConfigBase with ClientConfiguration = js.native
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
  
  trait UntagStreamInput extends js.Object {
    /**
      * The Amazon Resource Name (ARN) of the stream that you want to remove tags from.
      */
    var StreamARN: js.UndefOr[ResourceARN] = js.undefined
    /**
      * The name of the stream that you want to remove tags from.
      */
    var StreamName: js.UndefOr[StreamName] = js.undefined
    /**
      * A list of the keys of the tags that you want to remove.
      */
    var TagKeyList: awsDashSdkLib.clientsKinesisvideoMod.KinesisVideoNs.TagKeyList
  }
  
  trait UntagStreamOutput extends js.Object
  
  trait UpdateDataRetentionInput extends js.Object {
    /**
      * The version of the stream whose retention period you want to change. To get the version, call either the DescribeStream or the ListStreams API.
      */
    var CurrentVersion: Version
    /**
      * The retention period, in hours. The value you specify replaces the current value. The maximum value for this parameter is 87600 (ten years).
      */
    var DataRetentionChangeInHours: awsDashSdkLib.clientsKinesisvideoMod.KinesisVideoNs.DataRetentionChangeInHours
    /**
      * Indicates whether you want to increase or decrease the retention period.
      */
    var Operation: UpdateDataRetentionOperation
    /**
      * The Amazon Resource Name (ARN) of the stream whose retention period you want to change.
      */
    var StreamARN: js.UndefOr[ResourceARN] = js.undefined
    /**
      * The name of the stream whose retention period you want to change.
      */
    var StreamName: js.UndefOr[StreamName] = js.undefined
  }
  
  trait UpdateDataRetentionOutput extends js.Object
  
  trait UpdateStreamInput extends js.Object {
    /**
      * The version of the stream whose metadata you want to update.
      */
    var CurrentVersion: Version
    /**
      * The name of the device that is writing to the stream.    In the current implementation, Kinesis Video Streams does not use this name.  
      */
    var DeviceName: js.UndefOr[DeviceName] = js.undefined
    /**
      * The stream's media type. Use MediaType to specify the type of content that the stream contains to the consumers of the stream. For more information about media types, see Media Types. If you choose to specify the MediaType, see Naming Requirements. To play video on the console, you must specify the correct video type. For example, if the video in the stream is H.264, specify video/h264 as the MediaType.
      */
    var MediaType: js.UndefOr[MediaType] = js.undefined
    /**
      * The ARN of the stream whose metadata you want to update.
      */
    var StreamARN: js.UndefOr[ResourceARN] = js.undefined
    /**
      * The name of the stream whose metadata you want to update. The stream name is an identifier for the stream, and must be unique for each account and region.
      */
    var StreamName: js.UndefOr[StreamName] = js.undefined
  }
  
  trait UpdateStreamOutput extends js.Object
  
  trait _APIName extends js.Object
  
  trait _Status extends js.Object
  
  trait _UpdateDataRetentionOperation extends js.Object
  
  trait _apiVersion extends js.Object
  
  val TypesNs: this.type = js.native
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.PUT_MEDIA
    - awsDashSdkLib.awsDashSdkLibStrings.GET_MEDIA
    - awsDashSdkLib.awsDashSdkLibStrings.LIST_FRAGMENTS
    - awsDashSdkLib.awsDashSdkLibStrings.GET_MEDIA_FOR_FRAGMENT_LIST
    - awsDashSdkLib.awsDashSdkLibStrings.GET_HLS_STREAMING_SESSION_URL
    - java.lang.String
  */
  type APIName = _APIName | java.lang.String
  type ClientConfiguration = awsDashSdkLib.libServiceMod.ServiceConfigurationOptions with ClientApiVersions
  type ComparisonOperator = awsDashSdkLib.awsDashSdkLibStrings.BEGINS_WITH | java.lang.String
  type DataEndpoint = java.lang.String
  type DataRetentionChangeInHours = scala.Double
  type DataRetentionInHours = scala.Double
  type DeviceName = java.lang.String
  type KmsKeyId = java.lang.String
  type ListStreamsInputLimit = scala.Double
  type MediaType = java.lang.String
  type NextToken = java.lang.String
  type ResourceARN = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.CREATING
    - awsDashSdkLib.awsDashSdkLibStrings.ACTIVE
    - awsDashSdkLib.awsDashSdkLibStrings.UPDATING
    - awsDashSdkLib.awsDashSdkLibStrings.DELETING
    - java.lang.String
  */
  type Status = _Status | java.lang.String
  type StreamInfoList = js.Array[StreamInfo]
  type StreamName = java.lang.String
  type TagKey = java.lang.String
  type TagKeyList = js.Array[TagKey]
  type TagValue = java.lang.String
  type Timestamp = stdLib.Date
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.INCREASE_DATA_RETENTION
    - awsDashSdkLib.awsDashSdkLibStrings.DECREASE_DATA_RETENTION
    - java.lang.String
  */
  type UpdateDataRetentionOperation = _UpdateDataRetentionOperation | java.lang.String
  type Version = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.`2017-09-30`
    - awsDashSdkLib.awsDashSdkLibStrings.latest
    - java.lang.String
  */
  type apiVersion = _apiVersion | java.lang.String
}

