package typings.awsSdk.clientsKinesisvideoMod

import typings.awsSdk.libConfigBaseMod.ConfigBase
import typings.awsSdk.libErrorMod.AWSError
import typings.awsSdk.libRequestMod.Request
import typings.awsSdk.libServiceMod.Service
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait KinesisVideo extends Service {
  
  @JSName("config")
  var config_KinesisVideo: ConfigBase & ClientConfiguration = js.native
  
  /**
    * Creates a signaling channel.   CreateSignalingChannel is an asynchronous operation.
    */
  def createSignalingChannel(): Request[CreateSignalingChannelOutput, AWSError] = js.native
  def createSignalingChannel(callback: js.Function2[/* err */ AWSError, /* data */ CreateSignalingChannelOutput, Unit]): Request[CreateSignalingChannelOutput, AWSError] = js.native
  /**
    * Creates a signaling channel.   CreateSignalingChannel is an asynchronous operation.
    */
  def createSignalingChannel(params: CreateSignalingChannelInput): Request[CreateSignalingChannelOutput, AWSError] = js.native
  def createSignalingChannel(
    params: CreateSignalingChannelInput,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateSignalingChannelOutput, Unit]
  ): Request[CreateSignalingChannelOutput, AWSError] = js.native
  
  /**
    * Creates a new Kinesis video stream.  When you create a new stream, Kinesis Video Streams assigns it a version number. When you change the stream's metadata, Kinesis Video Streams updates the version.   CreateStream is an asynchronous operation. For information about how the service works, see How it Works.  You must have permissions for the KinesisVideo:CreateStream action.
    */
  def createStream(): Request[CreateStreamOutput, AWSError] = js.native
  def createStream(callback: js.Function2[/* err */ AWSError, /* data */ CreateStreamOutput, Unit]): Request[CreateStreamOutput, AWSError] = js.native
  /**
    * Creates a new Kinesis video stream.  When you create a new stream, Kinesis Video Streams assigns it a version number. When you change the stream's metadata, Kinesis Video Streams updates the version.   CreateStream is an asynchronous operation. For information about how the service works, see How it Works.  You must have permissions for the KinesisVideo:CreateStream action.
    */
  def createStream(params: CreateStreamInput): Request[CreateStreamOutput, AWSError] = js.native
  def createStream(
    params: CreateStreamInput,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateStreamOutput, Unit]
  ): Request[CreateStreamOutput, AWSError] = js.native
  
  /**
    * Deletes a specified signaling channel. DeleteSignalingChannel is an asynchronous operation. If you don't specify the channel's current version, the most recent version is deleted.
    */
  def deleteSignalingChannel(): Request[DeleteSignalingChannelOutput, AWSError] = js.native
  def deleteSignalingChannel(callback: js.Function2[/* err */ AWSError, /* data */ DeleteSignalingChannelOutput, Unit]): Request[DeleteSignalingChannelOutput, AWSError] = js.native
  /**
    * Deletes a specified signaling channel. DeleteSignalingChannel is an asynchronous operation. If you don't specify the channel's current version, the most recent version is deleted.
    */
  def deleteSignalingChannel(params: DeleteSignalingChannelInput): Request[DeleteSignalingChannelOutput, AWSError] = js.native
  def deleteSignalingChannel(
    params: DeleteSignalingChannelInput,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteSignalingChannelOutput, Unit]
  ): Request[DeleteSignalingChannelOutput, AWSError] = js.native
  
  /**
    * Deletes a Kinesis video stream and the data contained in the stream.  This method marks the stream for deletion, and makes the data in the stream inaccessible immediately.    To ensure that you have the latest version of the stream before deleting it, you can specify the stream version. Kinesis Video Streams assigns a version to each stream. When you update a stream, Kinesis Video Streams assigns a new version number. To get the latest stream version, use the DescribeStream API.  This operation requires permission for the KinesisVideo:DeleteStream action.
    */
  def deleteStream(): Request[DeleteStreamOutput, AWSError] = js.native
  def deleteStream(callback: js.Function2[/* err */ AWSError, /* data */ DeleteStreamOutput, Unit]): Request[DeleteStreamOutput, AWSError] = js.native
  /**
    * Deletes a Kinesis video stream and the data contained in the stream.  This method marks the stream for deletion, and makes the data in the stream inaccessible immediately.    To ensure that you have the latest version of the stream before deleting it, you can specify the stream version. Kinesis Video Streams assigns a version to each stream. When you update a stream, Kinesis Video Streams assigns a new version number. To get the latest stream version, use the DescribeStream API.  This operation requires permission for the KinesisVideo:DeleteStream action.
    */
  def deleteStream(params: DeleteStreamInput): Request[DeleteStreamOutput, AWSError] = js.native
  def deleteStream(
    params: DeleteStreamInput,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteStreamOutput, Unit]
  ): Request[DeleteStreamOutput, AWSError] = js.native
  
  /**
    * Describes a stream’s edge configuration that was set using the StartEdgeConfigurationUpdate API. Use this API to get the status of the configuration if the configuration is in sync with the Edge Agent.
    */
  def describeEdgeConfiguration(): Request[DescribeEdgeConfigurationOutput, AWSError] = js.native
  def describeEdgeConfiguration(callback: js.Function2[/* err */ AWSError, /* data */ DescribeEdgeConfigurationOutput, Unit]): Request[DescribeEdgeConfigurationOutput, AWSError] = js.native
  /**
    * Describes a stream’s edge configuration that was set using the StartEdgeConfigurationUpdate API. Use this API to get the status of the configuration if the configuration is in sync with the Edge Agent.
    */
  def describeEdgeConfiguration(params: DescribeEdgeConfigurationInput): Request[DescribeEdgeConfigurationOutput, AWSError] = js.native
  def describeEdgeConfiguration(
    params: DescribeEdgeConfigurationInput,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeEdgeConfigurationOutput, Unit]
  ): Request[DescribeEdgeConfigurationOutput, AWSError] = js.native
  
  /**
    * Gets the ImageGenerationConfiguration for a given Kinesis video stream.
    */
  def describeImageGenerationConfiguration(): Request[DescribeImageGenerationConfigurationOutput, AWSError] = js.native
  def describeImageGenerationConfiguration(
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeImageGenerationConfigurationOutput, Unit]
  ): Request[DescribeImageGenerationConfigurationOutput, AWSError] = js.native
  /**
    * Gets the ImageGenerationConfiguration for a given Kinesis video stream.
    */
  def describeImageGenerationConfiguration(params: DescribeImageGenerationConfigurationInput): Request[DescribeImageGenerationConfigurationOutput, AWSError] = js.native
  def describeImageGenerationConfiguration(
    params: DescribeImageGenerationConfigurationInput,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeImageGenerationConfigurationOutput, Unit]
  ): Request[DescribeImageGenerationConfigurationOutput, AWSError] = js.native
  
  /**
    * Returns the most current information about the stream. Either streamName or streamARN should be provided in the input. Returns the most current information about the stream. The streamName or streamARN should be provided in the input.
    */
  def describeMappedResourceConfiguration(): Request[DescribeMappedResourceConfigurationOutput, AWSError] = js.native
  def describeMappedResourceConfiguration(
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeMappedResourceConfigurationOutput, Unit]
  ): Request[DescribeMappedResourceConfigurationOutput, AWSError] = js.native
  /**
    * Returns the most current information about the stream. Either streamName or streamARN should be provided in the input. Returns the most current information about the stream. The streamName or streamARN should be provided in the input.
    */
  def describeMappedResourceConfiguration(params: DescribeMappedResourceConfigurationInput): Request[DescribeMappedResourceConfigurationOutput, AWSError] = js.native
  def describeMappedResourceConfiguration(
    params: DescribeMappedResourceConfigurationInput,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeMappedResourceConfigurationOutput, Unit]
  ): Request[DescribeMappedResourceConfigurationOutput, AWSError] = js.native
  
  /**
    * Returns the most current information about the channel. Specify the ChannelName or ChannelARN in the input.
    */
  def describeMediaStorageConfiguration(): Request[DescribeMediaStorageConfigurationOutput, AWSError] = js.native
  def describeMediaStorageConfiguration(
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeMediaStorageConfigurationOutput, Unit]
  ): Request[DescribeMediaStorageConfigurationOutput, AWSError] = js.native
  /**
    * Returns the most current information about the channel. Specify the ChannelName or ChannelARN in the input.
    */
  def describeMediaStorageConfiguration(params: DescribeMediaStorageConfigurationInput): Request[DescribeMediaStorageConfigurationOutput, AWSError] = js.native
  def describeMediaStorageConfiguration(
    params: DescribeMediaStorageConfigurationInput,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeMediaStorageConfigurationOutput, Unit]
  ): Request[DescribeMediaStorageConfigurationOutput, AWSError] = js.native
  
  /**
    * Gets the NotificationConfiguration for a given Kinesis video stream.
    */
  def describeNotificationConfiguration(): Request[DescribeNotificationConfigurationOutput, AWSError] = js.native
  def describeNotificationConfiguration(
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeNotificationConfigurationOutput, Unit]
  ): Request[DescribeNotificationConfigurationOutput, AWSError] = js.native
  /**
    * Gets the NotificationConfiguration for a given Kinesis video stream.
    */
  def describeNotificationConfiguration(params: DescribeNotificationConfigurationInput): Request[DescribeNotificationConfigurationOutput, AWSError] = js.native
  def describeNotificationConfiguration(
    params: DescribeNotificationConfigurationInput,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeNotificationConfigurationOutput, Unit]
  ): Request[DescribeNotificationConfigurationOutput, AWSError] = js.native
  
  /**
    * Returns the most current information about the signaling channel. You must specify either the name or the Amazon Resource Name (ARN) of the channel that you want to describe.
    */
  def describeSignalingChannel(): Request[DescribeSignalingChannelOutput, AWSError] = js.native
  def describeSignalingChannel(callback: js.Function2[/* err */ AWSError, /* data */ DescribeSignalingChannelOutput, Unit]): Request[DescribeSignalingChannelOutput, AWSError] = js.native
  /**
    * Returns the most current information about the signaling channel. You must specify either the name or the Amazon Resource Name (ARN) of the channel that you want to describe.
    */
  def describeSignalingChannel(params: DescribeSignalingChannelInput): Request[DescribeSignalingChannelOutput, AWSError] = js.native
  def describeSignalingChannel(
    params: DescribeSignalingChannelInput,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeSignalingChannelOutput, Unit]
  ): Request[DescribeSignalingChannelOutput, AWSError] = js.native
  
  /**
    * Returns the most current information about the specified stream. You must specify either the StreamName or the StreamARN. 
    */
  def describeStream(): Request[DescribeStreamOutput, AWSError] = js.native
  def describeStream(callback: js.Function2[/* err */ AWSError, /* data */ DescribeStreamOutput, Unit]): Request[DescribeStreamOutput, AWSError] = js.native
  /**
    * Returns the most current information about the specified stream. You must specify either the StreamName or the StreamARN. 
    */
  def describeStream(params: DescribeStreamInput): Request[DescribeStreamOutput, AWSError] = js.native
  def describeStream(
    params: DescribeStreamInput,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeStreamOutput, Unit]
  ): Request[DescribeStreamOutput, AWSError] = js.native
  
  /**
    * Gets an endpoint for a specified stream for either reading or writing. Use this endpoint in your application to read from the specified stream (using the GetMedia or GetMediaForFragmentList operations) or write to it (using the PutMedia operation).   The returned endpoint does not have the API name appended. The client needs to add the API name to the returned endpoint.  In the request, specify the stream either by StreamName or StreamARN.
    */
  def getDataEndpoint(): Request[GetDataEndpointOutput, AWSError] = js.native
  def getDataEndpoint(callback: js.Function2[/* err */ AWSError, /* data */ GetDataEndpointOutput, Unit]): Request[GetDataEndpointOutput, AWSError] = js.native
  /**
    * Gets an endpoint for a specified stream for either reading or writing. Use this endpoint in your application to read from the specified stream (using the GetMedia or GetMediaForFragmentList operations) or write to it (using the PutMedia operation).   The returned endpoint does not have the API name appended. The client needs to add the API name to the returned endpoint.  In the request, specify the stream either by StreamName or StreamARN.
    */
  def getDataEndpoint(params: GetDataEndpointInput): Request[GetDataEndpointOutput, AWSError] = js.native
  def getDataEndpoint(
    params: GetDataEndpointInput,
    callback: js.Function2[/* err */ AWSError, /* data */ GetDataEndpointOutput, Unit]
  ): Request[GetDataEndpointOutput, AWSError] = js.native
  
  /**
    * Provides an endpoint for the specified signaling channel to send and receive messages. This API uses the SingleMasterChannelEndpointConfiguration input parameter, which consists of the Protocols and Role properties.  Protocols is used to determine the communication mechanism. For example, if you specify WSS as the protocol, this API produces a secure websocket endpoint. If you specify HTTPS as the protocol, this API generates an HTTPS endpoint.   Role determines the messaging permissions. A MASTER role results in this API generating an endpoint that a client can use to communicate with any of the viewers on the channel. A VIEWER role results in this API generating an endpoint that a client can use to communicate only with a MASTER. 
    */
  def getSignalingChannelEndpoint(): Request[GetSignalingChannelEndpointOutput, AWSError] = js.native
  def getSignalingChannelEndpoint(callback: js.Function2[/* err */ AWSError, /* data */ GetSignalingChannelEndpointOutput, Unit]): Request[GetSignalingChannelEndpointOutput, AWSError] = js.native
  /**
    * Provides an endpoint for the specified signaling channel to send and receive messages. This API uses the SingleMasterChannelEndpointConfiguration input parameter, which consists of the Protocols and Role properties.  Protocols is used to determine the communication mechanism. For example, if you specify WSS as the protocol, this API produces a secure websocket endpoint. If you specify HTTPS as the protocol, this API generates an HTTPS endpoint.   Role determines the messaging permissions. A MASTER role results in this API generating an endpoint that a client can use to communicate with any of the viewers on the channel. A VIEWER role results in this API generating an endpoint that a client can use to communicate only with a MASTER. 
    */
  def getSignalingChannelEndpoint(params: GetSignalingChannelEndpointInput): Request[GetSignalingChannelEndpointOutput, AWSError] = js.native
  def getSignalingChannelEndpoint(
    params: GetSignalingChannelEndpointInput,
    callback: js.Function2[/* err */ AWSError, /* data */ GetSignalingChannelEndpointOutput, Unit]
  ): Request[GetSignalingChannelEndpointOutput, AWSError] = js.native
  
  /**
    * Returns an array of ChannelInfo objects. Each object describes a signaling channel. To retrieve only those channels that satisfy a specific condition, you can specify a ChannelNameCondition.
    */
  def listSignalingChannels(): Request[ListSignalingChannelsOutput, AWSError] = js.native
  def listSignalingChannels(callback: js.Function2[/* err */ AWSError, /* data */ ListSignalingChannelsOutput, Unit]): Request[ListSignalingChannelsOutput, AWSError] = js.native
  /**
    * Returns an array of ChannelInfo objects. Each object describes a signaling channel. To retrieve only those channels that satisfy a specific condition, you can specify a ChannelNameCondition.
    */
  def listSignalingChannels(params: ListSignalingChannelsInput): Request[ListSignalingChannelsOutput, AWSError] = js.native
  def listSignalingChannels(
    params: ListSignalingChannelsInput,
    callback: js.Function2[/* err */ AWSError, /* data */ ListSignalingChannelsOutput, Unit]
  ): Request[ListSignalingChannelsOutput, AWSError] = js.native
  
  /**
    * Returns an array of StreamInfo objects. Each object describes a stream. To retrieve only streams that satisfy a specific condition, you can specify a StreamNameCondition. 
    */
  def listStreams(): Request[ListStreamsOutput, AWSError] = js.native
  def listStreams(callback: js.Function2[/* err */ AWSError, /* data */ ListStreamsOutput, Unit]): Request[ListStreamsOutput, AWSError] = js.native
  /**
    * Returns an array of StreamInfo objects. Each object describes a stream. To retrieve only streams that satisfy a specific condition, you can specify a StreamNameCondition. 
    */
  def listStreams(params: ListStreamsInput): Request[ListStreamsOutput, AWSError] = js.native
  def listStreams(
    params: ListStreamsInput,
    callback: js.Function2[/* err */ AWSError, /* data */ ListStreamsOutput, Unit]
  ): Request[ListStreamsOutput, AWSError] = js.native
  
  /**
    * Returns a list of tags associated with the specified signaling channel.
    */
  def listTagsForResource(): Request[ListTagsForResourceOutput, AWSError] = js.native
  def listTagsForResource(callback: js.Function2[/* err */ AWSError, /* data */ ListTagsForResourceOutput, Unit]): Request[ListTagsForResourceOutput, AWSError] = js.native
  /**
    * Returns a list of tags associated with the specified signaling channel.
    */
  def listTagsForResource(params: ListTagsForResourceInput): Request[ListTagsForResourceOutput, AWSError] = js.native
  def listTagsForResource(
    params: ListTagsForResourceInput,
    callback: js.Function2[/* err */ AWSError, /* data */ ListTagsForResourceOutput, Unit]
  ): Request[ListTagsForResourceOutput, AWSError] = js.native
  
  /**
    * Returns a list of tags associated with the specified stream. In the request, you must specify either the StreamName or the StreamARN. 
    */
  def listTagsForStream(): Request[ListTagsForStreamOutput, AWSError] = js.native
  def listTagsForStream(callback: js.Function2[/* err */ AWSError, /* data */ ListTagsForStreamOutput, Unit]): Request[ListTagsForStreamOutput, AWSError] = js.native
  /**
    * Returns a list of tags associated with the specified stream. In the request, you must specify either the StreamName or the StreamARN. 
    */
  def listTagsForStream(params: ListTagsForStreamInput): Request[ListTagsForStreamOutput, AWSError] = js.native
  def listTagsForStream(
    params: ListTagsForStreamInput,
    callback: js.Function2[/* err */ AWSError, /* data */ ListTagsForStreamOutput, Unit]
  ): Request[ListTagsForStreamOutput, AWSError] = js.native
  
  /**
    * An asynchronous API that updates a stream’s existing edge configuration. The Kinesis Video Stream will sync the stream’s edge configuration with the Edge Agent IoT Greengrass component that runs on an IoT Hub Device, setup at your premise. The time to sync can vary and depends on the connectivity of the Hub Device. The SyncStatus will be updated as the edge configuration is acknowledged, and synced with the Edge Agent.  If this API is invoked for the first time, a new edge configuration will be created for the stream, and the sync status will be set to SYNCING. You will have to wait for the sync status to reach a terminal state such as: IN_SYNC, or SYNC_FAILED, before using this API again. If you invoke this API during the syncing process, a ResourceInUseException will be thrown. The connectivity of the stream’s edge configuration and the Edge Agent will be retried for 15 minutes. After 15 minutes, the status will transition into the SYNC_FAILED state.
    */
  def startEdgeConfigurationUpdate(): Request[StartEdgeConfigurationUpdateOutput, AWSError] = js.native
  def startEdgeConfigurationUpdate(callback: js.Function2[/* err */ AWSError, /* data */ StartEdgeConfigurationUpdateOutput, Unit]): Request[StartEdgeConfigurationUpdateOutput, AWSError] = js.native
  /**
    * An asynchronous API that updates a stream’s existing edge configuration. The Kinesis Video Stream will sync the stream’s edge configuration with the Edge Agent IoT Greengrass component that runs on an IoT Hub Device, setup at your premise. The time to sync can vary and depends on the connectivity of the Hub Device. The SyncStatus will be updated as the edge configuration is acknowledged, and synced with the Edge Agent.  If this API is invoked for the first time, a new edge configuration will be created for the stream, and the sync status will be set to SYNCING. You will have to wait for the sync status to reach a terminal state such as: IN_SYNC, or SYNC_FAILED, before using this API again. If you invoke this API during the syncing process, a ResourceInUseException will be thrown. The connectivity of the stream’s edge configuration and the Edge Agent will be retried for 15 minutes. After 15 minutes, the status will transition into the SYNC_FAILED state.
    */
  def startEdgeConfigurationUpdate(params: StartEdgeConfigurationUpdateInput): Request[StartEdgeConfigurationUpdateOutput, AWSError] = js.native
  def startEdgeConfigurationUpdate(
    params: StartEdgeConfigurationUpdateInput,
    callback: js.Function2[/* err */ AWSError, /* data */ StartEdgeConfigurationUpdateOutput, Unit]
  ): Request[StartEdgeConfigurationUpdateOutput, AWSError] = js.native
  
  /**
    * Adds one or more tags to a signaling channel. A tag is a key-value pair (the value is optional) that you can define and assign to Amazon Web Services resources. If you specify a tag that already exists, the tag value is replaced with the value that you specify in the request. For more information, see Using Cost Allocation Tags in the Billing and Cost Management and Cost Management User Guide.
    */
  def tagResource(): Request[TagResourceOutput, AWSError] = js.native
  def tagResource(callback: js.Function2[/* err */ AWSError, /* data */ TagResourceOutput, Unit]): Request[TagResourceOutput, AWSError] = js.native
  /**
    * Adds one or more tags to a signaling channel. A tag is a key-value pair (the value is optional) that you can define and assign to Amazon Web Services resources. If you specify a tag that already exists, the tag value is replaced with the value that you specify in the request. For more information, see Using Cost Allocation Tags in the Billing and Cost Management and Cost Management User Guide.
    */
  def tagResource(params: TagResourceInput): Request[TagResourceOutput, AWSError] = js.native
  def tagResource(
    params: TagResourceInput,
    callback: js.Function2[/* err */ AWSError, /* data */ TagResourceOutput, Unit]
  ): Request[TagResourceOutput, AWSError] = js.native
  
  /**
    * Adds one or more tags to a stream. A tag is a key-value pair (the value is optional) that you can define and assign to Amazon Web Services resources. If you specify a tag that already exists, the tag value is replaced with the value that you specify in the request. For more information, see Using Cost Allocation Tags in the Billing and Cost Management and Cost Management User Guide.  You must provide either the StreamName or the StreamARN. This operation requires permission for the KinesisVideo:TagStream action. A Kinesis video stream can support up to 50 tags.
    */
  def tagStream(): Request[TagStreamOutput, AWSError] = js.native
  def tagStream(callback: js.Function2[/* err */ AWSError, /* data */ TagStreamOutput, Unit]): Request[TagStreamOutput, AWSError] = js.native
  /**
    * Adds one or more tags to a stream. A tag is a key-value pair (the value is optional) that you can define and assign to Amazon Web Services resources. If you specify a tag that already exists, the tag value is replaced with the value that you specify in the request. For more information, see Using Cost Allocation Tags in the Billing and Cost Management and Cost Management User Guide.  You must provide either the StreamName or the StreamARN. This operation requires permission for the KinesisVideo:TagStream action. A Kinesis video stream can support up to 50 tags.
    */
  def tagStream(params: TagStreamInput): Request[TagStreamOutput, AWSError] = js.native
  def tagStream(
    params: TagStreamInput,
    callback: js.Function2[/* err */ AWSError, /* data */ TagStreamOutput, Unit]
  ): Request[TagStreamOutput, AWSError] = js.native
  
  /**
    * Removes one or more tags from a signaling channel. In the request, specify only a tag key or keys; don't specify the value. If you specify a tag key that does not exist, it's ignored.
    */
  def untagResource(): Request[UntagResourceOutput, AWSError] = js.native
  def untagResource(callback: js.Function2[/* err */ AWSError, /* data */ UntagResourceOutput, Unit]): Request[UntagResourceOutput, AWSError] = js.native
  /**
    * Removes one or more tags from a signaling channel. In the request, specify only a tag key or keys; don't specify the value. If you specify a tag key that does not exist, it's ignored.
    */
  def untagResource(params: UntagResourceInput): Request[UntagResourceOutput, AWSError] = js.native
  def untagResource(
    params: UntagResourceInput,
    callback: js.Function2[/* err */ AWSError, /* data */ UntagResourceOutput, Unit]
  ): Request[UntagResourceOutput, AWSError] = js.native
  
  /**
    * Removes one or more tags from a stream. In the request, specify only a tag key or keys; don't specify the value. If you specify a tag key that does not exist, it's ignored. In the request, you must provide the StreamName or StreamARN.
    */
  def untagStream(): Request[UntagStreamOutput, AWSError] = js.native
  def untagStream(callback: js.Function2[/* err */ AWSError, /* data */ UntagStreamOutput, Unit]): Request[UntagStreamOutput, AWSError] = js.native
  /**
    * Removes one or more tags from a stream. In the request, specify only a tag key or keys; don't specify the value. If you specify a tag key that does not exist, it's ignored. In the request, you must provide the StreamName or StreamARN.
    */
  def untagStream(params: UntagStreamInput): Request[UntagStreamOutput, AWSError] = js.native
  def untagStream(
    params: UntagStreamInput,
    callback: js.Function2[/* err */ AWSError, /* data */ UntagStreamOutput, Unit]
  ): Request[UntagStreamOutput, AWSError] = js.native
  
  /**
    *  Increases or decreases the stream's data retention period by the value that you specify. To indicate whether you want to increase or decrease the data retention period, specify the Operation parameter in the request body. In the request, you must specify either the StreamName or the StreamARN.   The retention period that you specify replaces the current value.  This operation requires permission for the KinesisVideo:UpdateDataRetention action. Changing the data retention period affects the data in the stream as follows:   If the data retention period is increased, existing data is retained for the new retention period. For example, if the data retention period is increased from one hour to seven hours, all existing data is retained for seven hours.   If the data retention period is decreased, existing data is retained for the new retention period. For example, if the data retention period is decreased from seven hours to one hour, all existing data is retained for one hour, and any data older than one hour is deleted immediately.  
    */
  def updateDataRetention(): Request[UpdateDataRetentionOutput, AWSError] = js.native
  def updateDataRetention(callback: js.Function2[/* err */ AWSError, /* data */ UpdateDataRetentionOutput, Unit]): Request[UpdateDataRetentionOutput, AWSError] = js.native
  /**
    *  Increases or decreases the stream's data retention period by the value that you specify. To indicate whether you want to increase or decrease the data retention period, specify the Operation parameter in the request body. In the request, you must specify either the StreamName or the StreamARN.   The retention period that you specify replaces the current value.  This operation requires permission for the KinesisVideo:UpdateDataRetention action. Changing the data retention period affects the data in the stream as follows:   If the data retention period is increased, existing data is retained for the new retention period. For example, if the data retention period is increased from one hour to seven hours, all existing data is retained for seven hours.   If the data retention period is decreased, existing data is retained for the new retention period. For example, if the data retention period is decreased from seven hours to one hour, all existing data is retained for one hour, and any data older than one hour is deleted immediately.  
    */
  def updateDataRetention(params: UpdateDataRetentionInput): Request[UpdateDataRetentionOutput, AWSError] = js.native
  def updateDataRetention(
    params: UpdateDataRetentionInput,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateDataRetentionOutput, Unit]
  ): Request[UpdateDataRetentionOutput, AWSError] = js.native
  
  /**
    * Updates the StreamInfo and ImageProcessingConfiguration fields.
    */
  def updateImageGenerationConfiguration(): Request[UpdateImageGenerationConfigurationOutput, AWSError] = js.native
  def updateImageGenerationConfiguration(
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateImageGenerationConfigurationOutput, Unit]
  ): Request[UpdateImageGenerationConfigurationOutput, AWSError] = js.native
  /**
    * Updates the StreamInfo and ImageProcessingConfiguration fields.
    */
  def updateImageGenerationConfiguration(params: UpdateImageGenerationConfigurationInput): Request[UpdateImageGenerationConfigurationOutput, AWSError] = js.native
  def updateImageGenerationConfiguration(
    params: UpdateImageGenerationConfigurationInput,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateImageGenerationConfigurationOutput, Unit]
  ): Request[UpdateImageGenerationConfigurationOutput, AWSError] = js.native
  
  /**
    * Associates a SignalingChannel to a stream to store the media. There are two signaling modes that can specified :   If the StorageStatus is disabled, no data will be stored, and the StreamARN parameter will not be needed.    If the StorageStatus is enabled, the data will be stored in the StreamARN provided.   
    */
  def updateMediaStorageConfiguration(): Request[UpdateMediaStorageConfigurationOutput, AWSError] = js.native
  def updateMediaStorageConfiguration(callback: js.Function2[/* err */ AWSError, /* data */ UpdateMediaStorageConfigurationOutput, Unit]): Request[UpdateMediaStorageConfigurationOutput, AWSError] = js.native
  /**
    * Associates a SignalingChannel to a stream to store the media. There are two signaling modes that can specified :   If the StorageStatus is disabled, no data will be stored, and the StreamARN parameter will not be needed.    If the StorageStatus is enabled, the data will be stored in the StreamARN provided.   
    */
  def updateMediaStorageConfiguration(params: UpdateMediaStorageConfigurationInput): Request[UpdateMediaStorageConfigurationOutput, AWSError] = js.native
  def updateMediaStorageConfiguration(
    params: UpdateMediaStorageConfigurationInput,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateMediaStorageConfigurationOutput, Unit]
  ): Request[UpdateMediaStorageConfigurationOutput, AWSError] = js.native
  
  /**
    * Updates the notification information for a stream.
    */
  def updateNotificationConfiguration(): Request[UpdateNotificationConfigurationOutput, AWSError] = js.native
  def updateNotificationConfiguration(callback: js.Function2[/* err */ AWSError, /* data */ UpdateNotificationConfigurationOutput, Unit]): Request[UpdateNotificationConfigurationOutput, AWSError] = js.native
  /**
    * Updates the notification information for a stream.
    */
  def updateNotificationConfiguration(params: UpdateNotificationConfigurationInput): Request[UpdateNotificationConfigurationOutput, AWSError] = js.native
  def updateNotificationConfiguration(
    params: UpdateNotificationConfigurationInput,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateNotificationConfigurationOutput, Unit]
  ): Request[UpdateNotificationConfigurationOutput, AWSError] = js.native
  
  /**
    * Updates the existing signaling channel. This is an asynchronous operation and takes time to complete.  If the MessageTtlSeconds value is updated (either increased or reduced), it only applies to new messages sent via this channel after it's been updated. Existing messages are still expired as per the previous MessageTtlSeconds value.
    */
  def updateSignalingChannel(): Request[UpdateSignalingChannelOutput, AWSError] = js.native
  def updateSignalingChannel(callback: js.Function2[/* err */ AWSError, /* data */ UpdateSignalingChannelOutput, Unit]): Request[UpdateSignalingChannelOutput, AWSError] = js.native
  /**
    * Updates the existing signaling channel. This is an asynchronous operation and takes time to complete.  If the MessageTtlSeconds value is updated (either increased or reduced), it only applies to new messages sent via this channel after it's been updated. Existing messages are still expired as per the previous MessageTtlSeconds value.
    */
  def updateSignalingChannel(params: UpdateSignalingChannelInput): Request[UpdateSignalingChannelOutput, AWSError] = js.native
  def updateSignalingChannel(
    params: UpdateSignalingChannelInput,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateSignalingChannelOutput, Unit]
  ): Request[UpdateSignalingChannelOutput, AWSError] = js.native
  
  /**
    * Updates stream metadata, such as the device name and media type. You must provide the stream name or the Amazon Resource Name (ARN) of the stream. To make sure that you have the latest version of the stream before updating it, you can specify the stream version. Kinesis Video Streams assigns a version to each stream. When you update a stream, Kinesis Video Streams assigns a new version number. To get the latest stream version, use the DescribeStream API.   UpdateStream is an asynchronous operation, and takes time to complete.
    */
  def updateStream(): Request[UpdateStreamOutput, AWSError] = js.native
  def updateStream(callback: js.Function2[/* err */ AWSError, /* data */ UpdateStreamOutput, Unit]): Request[UpdateStreamOutput, AWSError] = js.native
  /**
    * Updates stream metadata, such as the device name and media type. You must provide the stream name or the Amazon Resource Name (ARN) of the stream. To make sure that you have the latest version of the stream before updating it, you can specify the stream version. Kinesis Video Streams assigns a version to each stream. When you update a stream, Kinesis Video Streams assigns a new version number. To get the latest stream version, use the DescribeStream API.   UpdateStream is an asynchronous operation, and takes time to complete.
    */
  def updateStream(params: UpdateStreamInput): Request[UpdateStreamOutput, AWSError] = js.native
  def updateStream(
    params: UpdateStreamInput,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateStreamOutput, Unit]
  ): Request[UpdateStreamOutput, AWSError] = js.native
}
