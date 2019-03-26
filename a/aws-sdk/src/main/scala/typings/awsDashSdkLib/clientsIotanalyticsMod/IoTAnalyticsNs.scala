package typings
package awsDashSdkLib.clientsIotanalyticsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("aws-sdk/clients/iotanalytics", "IoTAnalytics")
@js.native
object IoTAnalyticsNs extends js.Object {
  trait AddAttributesActivity extends js.Object {
    /**
      * A list of 1-50 "AttributeNameMapping" objects that map an existing attribute to a new attribute.  The existing attributes remain in the message, so if you want to remove the originals, use "RemoveAttributeActivity". 
      */
    var attributes: AttributeNameMapping
    /**
      * The name of the 'addAttributes' activity.
      */
    var name: ActivityName
    /**
      * The next activity in the pipeline.
      */
    var next: js.UndefOr[ActivityName] = js.undefined
  }
  
  trait AttributeNameMapping
    extends /* key */ org.scalablytyped.runtime.StringDictionary[AttributeName]
  
  trait BatchPutMessageErrorEntry extends js.Object {
    /**
      * The code associated with the error.
      */
    var errorCode: js.UndefOr[ErrorCode] = js.undefined
    /**
      * The message associated with the error.
      */
    var errorMessage: js.UndefOr[ErrorMessage] = js.undefined
    /**
      * The ID of the message that caused the error. (See the value corresponding to the "messageId" key in the message object.)
      */
    var messageId: js.UndefOr[MessageId] = js.undefined
  }
  
  trait BatchPutMessageRequest extends js.Object {
    /**
      * The name of the channel where the messages are sent.
      */
    var channelName: ChannelName
    /**
      * The list of messages to be sent. Each message has format: '{ "messageId": "string", "payload": "string"}'. Note that the field names of message payloads (data) that you send to AWS IoT Analytics:   Must contain only alphanumeric characters and undescores (_); no other special characters are allowed.   Must begin with an alphabetic character or single underscore (_).   Cannot contain hyphens (-).   In regular expression terms: "^[A-Za-z_]([A-Za-z0-9]*|[A-Za-z0-9][A-Za-z0-9_]*)$".    Cannot be greater than 255 characters.   Are case-insensitive. (Fields named "foo" and "FOO" in the same payload are considered duplicates.)   For example, {"temp_01": 29} or {"_temp_01": 29} are valid, but {"temp-01": 29}, {"01_temp": 29} or {"__temp_01": 29} are invalid in message payloads. 
      */
    var messages: Messages
  }
  
  trait BatchPutMessageResponse extends js.Object {
    /**
      * A list of any errors encountered when sending the messages to the channel.
      */
    var batchPutMessageErrorEntries: js.UndefOr[BatchPutMessageErrorEntries] = js.undefined
  }
  
  trait CancelPipelineReprocessingRequest extends js.Object {
    /**
      * The name of pipeline for which data reprocessing is canceled.
      */
    var pipelineName: PipelineName
    /**
      * The ID of the reprocessing task (returned by "StartPipelineReprocessing").
      */
    var reprocessingId: ReprocessingId
  }
  
  trait CancelPipelineReprocessingResponse extends js.Object
  
  trait Channel extends js.Object {
    /**
      * The ARN of the channel.
      */
    var arn: js.UndefOr[ChannelArn] = js.undefined
    /**
      * When the channel was created.
      */
    var creationTime: js.UndefOr[Timestamp] = js.undefined
    /**
      * When the channel was last updated.
      */
    var lastUpdateTime: js.UndefOr[Timestamp] = js.undefined
    /**
      * The name of the channel.
      */
    var name: js.UndefOr[ChannelName] = js.undefined
    /**
      * How long, in days, message data is kept for the channel.
      */
    var retentionPeriod: js.UndefOr[RetentionPeriod] = js.undefined
    /**
      * The status of the channel.
      */
    var status: js.UndefOr[ChannelStatus] = js.undefined
  }
  
  trait ChannelActivity extends js.Object {
    /**
      * The name of the channel from which the messages are processed.
      */
    var channelName: ChannelName
    /**
      * The name of the 'channel' activity.
      */
    var name: ActivityName
    /**
      * The next activity in the pipeline.
      */
    var next: js.UndefOr[ActivityName] = js.undefined
  }
  
  trait ChannelStatistics extends js.Object {
    /**
      * The estimated size of the channel.
      */
    var size: js.UndefOr[EstimatedResourceSize] = js.undefined
  }
  
  trait ChannelSummary extends js.Object {
    /**
      * The name of the channel.
      */
    var channelName: js.UndefOr[ChannelName] = js.undefined
    /**
      * When the channel was created.
      */
    var creationTime: js.UndefOr[Timestamp] = js.undefined
    /**
      * The last time the channel was updated.
      */
    var lastUpdateTime: js.UndefOr[Timestamp] = js.undefined
    /**
      * The status of the channel.
      */
    var status: js.UndefOr[ChannelStatus] = js.undefined
  }
  
  trait ClientApiVersions extends js.Object {
    /**
      * A string in YYYY-MM-DD format that represents the latest possible API version that can be used in this service. Specify 'latest' to use the latest possible version.
      */
    var apiVersion: js.UndefOr[apiVersion] = js.undefined
  }
  
  trait ContainerDatasetAction extends js.Object {
    /**
      * The ARN of the role which gives permission to the system to access needed resources in order to run the "containerAction". This includes, at minimum, permission to retrieve the data set contents which are the input to the containerized application.
      */
    var executionRoleArn: RoleArn
    /**
      * The ARN of the Docker container stored in your account. The Docker container contains an application and needed support libraries and is used to generate data set contents.
      */
    var image: Image
    /**
      * Configuration of the resource which executes the "containerAction".
      */
    var resourceConfiguration: ResourceConfiguration
    /**
      * The values of variables used within the context of the execution of the containerized application (basically, parameters passed to the application). Each variable must have a name and a value given by one of "stringValue", "datasetContentVersionValue", or "outputFileUriValue".
      */
    var variables: js.UndefOr[Variables] = js.undefined
  }
  
  trait CreateChannelRequest extends js.Object {
    /**
      * The name of the channel.
      */
    var channelName: ChannelName
    /**
      * How long, in days, message data is kept for the channel.
      */
    var retentionPeriod: js.UndefOr[RetentionPeriod] = js.undefined
    /**
      * Metadata which can be used to manage the channel.
      */
    var tags: js.UndefOr[TagList] = js.undefined
  }
  
  trait CreateChannelResponse extends js.Object {
    /**
      * The ARN of the channel.
      */
    var channelArn: js.UndefOr[ChannelArn] = js.undefined
    /**
      * The name of the channel.
      */
    var channelName: js.UndefOr[ChannelName] = js.undefined
    /**
      * How long, in days, message data is kept for the channel.
      */
    var retentionPeriod: js.UndefOr[RetentionPeriod] = js.undefined
  }
  
  trait CreateDatasetContentRequest extends js.Object {
    /**
      * The name of the data set.
      */
    var datasetName: DatasetName
  }
  
  trait CreateDatasetContentResponse extends js.Object {
    /**
      * The version ID of the data set contents which are being created.
      */
    var versionId: js.UndefOr[DatasetContentVersion] = js.undefined
  }
  
  trait CreateDatasetRequest extends js.Object {
    /**
      * A list of actions that create the data set contents.
      */
    var actions: DatasetActions
    /**
      * When data set contents are created they are delivered to destinations specified here.
      */
    var contentDeliveryRules: js.UndefOr[DatasetContentDeliveryRules] = js.undefined
    /**
      * The name of the data set.
      */
    var datasetName: DatasetName
    /**
      * [Optional] How long, in days, versions of data set contents are kept for the data set. If not specified or set to null, versions of data set contents are retained for at most 90 days. The number of versions of data set contents retained is determined by the versioningConfiguration parameter. (For more information, see https://docs.aws.amazon.com/iotanalytics/latest/userguide/getting-started.html#aws-iot-analytics-dataset-versions)
      */
    var retentionPeriod: js.UndefOr[RetentionPeriod] = js.undefined
    /**
      * Metadata which can be used to manage the data set.
      */
    var tags: js.UndefOr[TagList] = js.undefined
    /**
      * A list of triggers. A trigger causes data set contents to be populated at a specified time interval or when another data set's contents are created. The list of triggers can be empty or contain up to five DataSetTrigger objects.
      */
    var triggers: js.UndefOr[DatasetTriggers] = js.undefined
    /**
      * [Optional] How many versions of data set contents are kept. If not specified or set to null, only the latest version plus the latest succeeded version (if they are different) are kept for the time period specified by the "retentionPeriod" parameter. (For more information, see https://docs.aws.amazon.com/iotanalytics/latest/userguide/getting-started.html#aws-iot-analytics-dataset-versions)
      */
    var versioningConfiguration: js.UndefOr[VersioningConfiguration] = js.undefined
  }
  
  trait CreateDatasetResponse extends js.Object {
    /**
      * The ARN of the data set.
      */
    var datasetArn: js.UndefOr[DatasetArn] = js.undefined
    /**
      * The name of the data set.
      */
    var datasetName: js.UndefOr[DatasetName] = js.undefined
    /**
      * How long, in days, data set contents are kept for the data set.
      */
    var retentionPeriod: js.UndefOr[RetentionPeriod] = js.undefined
  }
  
  trait CreateDatastoreRequest extends js.Object {
    /**
      * The name of the data store.
      */
    var datastoreName: DatastoreName
    /**
      * How long, in days, message data is kept for the data store.
      */
    var retentionPeriod: js.UndefOr[RetentionPeriod] = js.undefined
    /**
      * Metadata which can be used to manage the data store.
      */
    var tags: js.UndefOr[TagList] = js.undefined
  }
  
  trait CreateDatastoreResponse extends js.Object {
    /**
      * The ARN of the data store.
      */
    var datastoreArn: js.UndefOr[DatastoreArn] = js.undefined
    /**
      * The name of the data store.
      */
    var datastoreName: js.UndefOr[DatastoreName] = js.undefined
    /**
      * How long, in days, message data is kept for the data store.
      */
    var retentionPeriod: js.UndefOr[RetentionPeriod] = js.undefined
  }
  
  trait CreatePipelineRequest extends js.Object {
    /**
      * A list of "PipelineActivity" objects. Activities perform transformations on your messages, such as removing, renaming or adding message attributes; filtering messages based on attribute values; invoking your Lambda functions on messages for advanced processing; or performing mathematical transformations to normalize device data. The list can be 2-25 PipelineActivity objects and must contain both a channel and a datastore activity. Each entry in the list must contain only one activity, for example:  pipelineActivities = [ { "channel": { ... } }, { "lambda": { ... } }, ... ] 
      */
    var pipelineActivities: PipelineActivities
    /**
      * The name of the pipeline.
      */
    var pipelineName: PipelineName
    /**
      * Metadata which can be used to manage the pipeline.
      */
    var tags: js.UndefOr[TagList] = js.undefined
  }
  
  trait CreatePipelineResponse extends js.Object {
    /**
      * The ARN of the pipeline.
      */
    var pipelineArn: js.UndefOr[PipelineArn] = js.undefined
    /**
      * The name of the pipeline.
      */
    var pipelineName: js.UndefOr[PipelineName] = js.undefined
  }
  
  trait Dataset extends js.Object {
    /**
      * The "DatasetAction" objects that automatically create the data set contents.
      */
    var actions: js.UndefOr[DatasetActions] = js.undefined
    /**
      * The ARN of the data set.
      */
    var arn: js.UndefOr[DatasetArn] = js.undefined
    /**
      * When data set contents are created they are delivered to destinations specified here.
      */
    var contentDeliveryRules: js.UndefOr[DatasetContentDeliveryRules] = js.undefined
    /**
      * When the data set was created.
      */
    var creationTime: js.UndefOr[Timestamp] = js.undefined
    /**
      * The last time the data set was updated.
      */
    var lastUpdateTime: js.UndefOr[Timestamp] = js.undefined
    /**
      * The name of the data set.
      */
    var name: js.UndefOr[DatasetName] = js.undefined
    /**
      * [Optional] How long, in days, message data is kept for the data set.
      */
    var retentionPeriod: js.UndefOr[RetentionPeriod] = js.undefined
    /**
      * The status of the data set.
      */
    var status: js.UndefOr[DatasetStatus] = js.undefined
    /**
      * The "DatasetTrigger" objects that specify when the data set is automatically updated.
      */
    var triggers: js.UndefOr[DatasetTriggers] = js.undefined
    /**
      * [Optional] How many versions of data set contents are kept. If not specified or set to null, only the latest version plus the latest succeeded version (if they are different) are kept for the time period specified by the "retentionPeriod" parameter. (For more information, see https://docs.aws.amazon.com/iotanalytics/latest/userguide/getting-started.html#aws-iot-analytics-dataset-versions)
      */
    var versioningConfiguration: js.UndefOr[VersioningConfiguration] = js.undefined
  }
  
  trait DatasetAction extends js.Object {
    /**
      * The name of the data set action by which data set contents are automatically created.
      */
    var actionName: js.UndefOr[DatasetActionName] = js.undefined
    /**
      * Information which allows the system to run a containerized application in order to create the data set contents. The application must be in a Docker container along with any needed support libraries.
      */
    var containerAction: js.UndefOr[ContainerDatasetAction] = js.undefined
    /**
      * An "SqlQueryDatasetAction" object that uses an SQL query to automatically create data set contents.
      */
    var queryAction: js.UndefOr[SqlQueryDatasetAction] = js.undefined
  }
  
  trait DatasetActionSummary extends js.Object {
    /**
      * The name of the action which automatically creates the data set's contents.
      */
    var actionName: js.UndefOr[DatasetActionName] = js.undefined
    /**
      * The type of action by which the data set's contents are automatically created.
      */
    var actionType: js.UndefOr[DatasetActionType] = js.undefined
  }
  
  trait DatasetContentDeliveryDestination extends js.Object {
    /**
      * Configuration information for delivery of data set contents to AWS IoT Events.
      */
    var iotEventsDestinationConfiguration: js.UndefOr[IotEventsDestinationConfiguration] = js.undefined
  }
  
  trait DatasetContentDeliveryRule extends js.Object {
    /**
      * The destination to which data set contents are delivered.
      */
    var destination: DatasetContentDeliveryDestination
    /**
      * The name of the data set content delivery rules entry.
      */
    var entryName: js.UndefOr[EntryName] = js.undefined
  }
  
  trait DatasetContentStatus extends js.Object {
    /**
      * The reason the data set contents are in this state.
      */
    var reason: js.UndefOr[Reason] = js.undefined
    /**
      * The state of the data set contents. Can be one of "READY", "CREATING", "SUCCEEDED" or "FAILED".
      */
    var state: js.UndefOr[DatasetContentState] = js.undefined
  }
  
  trait DatasetContentSummary extends js.Object {
    /**
      * The actual time the creation of the data set contents was started.
      */
    var creationTime: js.UndefOr[Timestamp] = js.undefined
    /**
      * The time the creation of the data set contents was scheduled to start.
      */
    var scheduleTime: js.UndefOr[Timestamp] = js.undefined
    /**
      * The status of the data set contents.
      */
    var status: js.UndefOr[DatasetContentStatus] = js.undefined
    /**
      * The version of the data set contents.
      */
    var version: js.UndefOr[DatasetContentVersion] = js.undefined
  }
  
  trait DatasetContentVersionValue extends js.Object {
    /**
      * The name of the data set whose latest contents are used as input to the notebook or application.
      */
    var datasetName: DatasetName
  }
  
  trait DatasetEntry extends js.Object {
    /**
      * The pre-signed URI of the data set item.
      */
    var dataURI: js.UndefOr[PresignedURI] = js.undefined
    /**
      * The name of the data set item.
      */
    var entryName: js.UndefOr[EntryName] = js.undefined
  }
  
  trait DatasetSummary extends js.Object {
    /**
      * A list of "DataActionSummary" objects.
      */
    var actions: js.UndefOr[DatasetActionSummaries] = js.undefined
    /**
      * The time the data set was created.
      */
    var creationTime: js.UndefOr[Timestamp] = js.undefined
    /**
      * The name of the data set.
      */
    var datasetName: js.UndefOr[DatasetName] = js.undefined
    /**
      * The last time the data set was updated.
      */
    var lastUpdateTime: js.UndefOr[Timestamp] = js.undefined
    /**
      * The status of the data set.
      */
    var status: js.UndefOr[DatasetStatus] = js.undefined
    /**
      * A list of triggers. A trigger causes data set content to be populated at a specified time interval or when another data set is populated. The list of triggers can be empty or contain up to five DataSetTrigger objects
      */
    var triggers: js.UndefOr[DatasetTriggers] = js.undefined
  }
  
  trait DatasetTrigger extends js.Object {
    /**
      * The data set whose content creation triggers the creation of this data set's contents.
      */
    var dataset: js.UndefOr[TriggeringDataset] = js.undefined
    /**
      * The "Schedule" when the trigger is initiated.
      */
    var schedule: js.UndefOr[Schedule] = js.undefined
  }
  
  trait Datastore extends js.Object {
    /**
      * The ARN of the data store.
      */
    var arn: js.UndefOr[DatastoreArn] = js.undefined
    /**
      * When the data store was created.
      */
    var creationTime: js.UndefOr[Timestamp] = js.undefined
    /**
      * The last time the data store was updated.
      */
    var lastUpdateTime: js.UndefOr[Timestamp] = js.undefined
    /**
      * The name of the data store.
      */
    var name: js.UndefOr[DatastoreName] = js.undefined
    /**
      * How long, in days, message data is kept for the data store.
      */
    var retentionPeriod: js.UndefOr[RetentionPeriod] = js.undefined
    /**
      * The status of a data store:  CREATING  The data store is being created.  ACTIVE  The data store has been created and can be used.  DELETING  The data store is being deleted.  
      */
    var status: js.UndefOr[DatastoreStatus] = js.undefined
  }
  
  trait DatastoreActivity extends js.Object {
    /**
      * The name of the data store where processed messages are stored.
      */
    var datastoreName: DatastoreName
    /**
      * The name of the 'datastore' activity.
      */
    var name: ActivityName
  }
  
  trait DatastoreStatistics extends js.Object {
    /**
      * The estimated size of the data store.
      */
    var size: js.UndefOr[EstimatedResourceSize] = js.undefined
  }
  
  trait DatastoreSummary extends js.Object {
    /**
      * When the data store was created.
      */
    var creationTime: js.UndefOr[Timestamp] = js.undefined
    /**
      * The name of the data store.
      */
    var datastoreName: js.UndefOr[DatastoreName] = js.undefined
    /**
      * The last time the data store was updated.
      */
    var lastUpdateTime: js.UndefOr[Timestamp] = js.undefined
    /**
      * The status of the data store.
      */
    var status: js.UndefOr[DatastoreStatus] = js.undefined
  }
  
  trait DeleteChannelRequest extends js.Object {
    /**
      * The name of the channel to delete.
      */
    var channelName: ChannelName
  }
  
  trait DeleteDatasetContentRequest extends js.Object {
    /**
      * The name of the data set whose content is deleted.
      */
    var datasetName: DatasetName
    /**
      * The version of the data set whose content is deleted. You can also use the strings "$LATEST" or "$LATEST_SUCCEEDED" to delete the latest or latest successfully completed data set. If not specified, "$LATEST_SUCCEEDED" is the default.
      */
    var versionId: js.UndefOr[DatasetContentVersion] = js.undefined
  }
  
  trait DeleteDatasetRequest extends js.Object {
    /**
      * The name of the data set to delete.
      */
    var datasetName: DatasetName
  }
  
  trait DeleteDatastoreRequest extends js.Object {
    /**
      * The name of the data store to delete.
      */
    var datastoreName: DatastoreName
  }
  
  trait DeletePipelineRequest extends js.Object {
    /**
      * The name of the pipeline to delete.
      */
    var pipelineName: PipelineName
  }
  
  trait DeltaTime extends js.Object {
    /**
      * The number of seconds of estimated "in flight" lag time of message data. When you create data set contents using message data from a specified time frame, some message data may still be "in flight" when processing begins, and so will not arrive in time to be processed. Use this field to make allowances for the "in flight" time of your message data, so that data not processed from a previous time frame will be included with the next time frame. Without this, missed message data would be excluded from processing during the next time frame as well, because its timestamp places it within the previous time frame.
      */
    var offsetSeconds: OffsetSeconds
    /**
      * An expression by which the time of the message data may be determined. This may be the name of a timestamp field, or a SQL expression which is used to derive the time the message data was generated.
      */
    var timeExpression: TimeExpression
  }
  
  trait DescribeChannelRequest extends js.Object {
    /**
      * The name of the channel whose information is retrieved.
      */
    var channelName: ChannelName
    /**
      * If true, additional statistical information about the channel is included in the response.
      */
    var includeStatistics: js.UndefOr[IncludeStatisticsFlag] = js.undefined
  }
  
  trait DescribeChannelResponse extends js.Object {
    /**
      * An object that contains information about the channel.
      */
    var channel: js.UndefOr[Channel] = js.undefined
    /**
      * Statistics about the channel. Included if the 'includeStatistics' parameter is set to true in the request.
      */
    var statistics: js.UndefOr[ChannelStatistics] = js.undefined
  }
  
  trait DescribeDatasetRequest extends js.Object {
    /**
      * The name of the data set whose information is retrieved.
      */
    var datasetName: DatasetName
  }
  
  trait DescribeDatasetResponse extends js.Object {
    /**
      * An object that contains information about the data set.
      */
    var dataset: js.UndefOr[Dataset] = js.undefined
  }
  
  trait DescribeDatastoreRequest extends js.Object {
    /**
      * The name of the data store
      */
    var datastoreName: DatastoreName
    /**
      * If true, additional statistical information about the datastore is included in the response.
      */
    var includeStatistics: js.UndefOr[IncludeStatisticsFlag] = js.undefined
  }
  
  trait DescribeDatastoreResponse extends js.Object {
    /**
      * Information about the data store.
      */
    var datastore: js.UndefOr[Datastore] = js.undefined
    /**
      * Additional statistical information about the data store. Included if the 'includeStatistics' parameter is set to true in the request.
      */
    var statistics: js.UndefOr[DatastoreStatistics] = js.undefined
  }
  
  trait DescribeLoggingOptionsRequest extends js.Object
  
  trait DescribeLoggingOptionsResponse extends js.Object {
    /**
      * The current settings of the AWS IoT Analytics logging options.
      */
    var loggingOptions: js.UndefOr[LoggingOptions] = js.undefined
  }
  
  trait DescribePipelineRequest extends js.Object {
    /**
      * The name of the pipeline whose information is retrieved.
      */
    var pipelineName: PipelineName
  }
  
  trait DescribePipelineResponse extends js.Object {
    /**
      * A "Pipeline" object that contains information about the pipeline.
      */
    var pipeline: js.UndefOr[Pipeline] = js.undefined
  }
  
  trait DeviceRegistryEnrichActivity extends js.Object {
    /**
      * The name of the attribute that is added to the message.
      */
    var attribute: AttributeName
    /**
      * The name of the 'deviceRegistryEnrich' activity.
      */
    var name: ActivityName
    /**
      * The next activity in the pipeline.
      */
    var next: js.UndefOr[ActivityName] = js.undefined
    /**
      * The ARN of the role that allows access to the device's registry information.
      */
    var roleArn: RoleArn
    /**
      * The name of the IoT device whose registry information is added to the message.
      */
    var thingName: AttributeName
  }
  
  trait DeviceShadowEnrichActivity extends js.Object {
    /**
      * The name of the attribute that is added to the message.
      */
    var attribute: AttributeName
    /**
      * The name of the 'deviceShadowEnrich' activity.
      */
    var name: ActivityName
    /**
      * The next activity in the pipeline.
      */
    var next: js.UndefOr[ActivityName] = js.undefined
    /**
      * The ARN of the role that allows access to the device's shadow.
      */
    var roleArn: RoleArn
    /**
      * The name of the IoT device whose shadow information is added to the message.
      */
    var thingName: AttributeName
  }
  
  trait EstimatedResourceSize extends js.Object {
    /**
      * The time when the estimate of the size of the resource was made.
      */
    var estimatedOn: js.UndefOr[Timestamp] = js.undefined
    /**
      * The estimated size of the resource in bytes.
      */
    var estimatedSizeInBytes: js.UndefOr[SizeInBytes] = js.undefined
  }
  
  trait FilterActivity extends js.Object {
    /**
      * An expression that looks like a SQL WHERE clause that must return a Boolean value.
      */
    var filter: FilterExpression
    /**
      * The name of the 'filter' activity.
      */
    var name: ActivityName
    /**
      * The next activity in the pipeline.
      */
    var next: js.UndefOr[ActivityName] = js.undefined
  }
  
  trait GetDatasetContentRequest extends js.Object {
    /**
      * The name of the data set whose contents are retrieved.
      */
    var datasetName: DatasetName
    /**
      * The version of the data set whose contents are retrieved. You can also use the strings "$LATEST" or "$LATEST_SUCCEEDED" to retrieve the contents of the latest or latest successfully completed data set. If not specified, "$LATEST_SUCCEEDED" is the default.
      */
    var versionId: js.UndefOr[DatasetContentVersion] = js.undefined
  }
  
  trait GetDatasetContentResponse extends js.Object {
    /**
      * A list of "DatasetEntry" objects.
      */
    var entries: js.UndefOr[DatasetEntries] = js.undefined
    /**
      * The status of the data set content.
      */
    var status: js.UndefOr[DatasetContentStatus] = js.undefined
    /**
      * The time when the request was made.
      */
    var timestamp: js.UndefOr[Timestamp] = js.undefined
  }
  
  trait IotEventsDestinationConfiguration extends js.Object {
    /**
      * The name of the AWS IoT Events input to which data set contents are delivered.
      */
    var inputName: IotEventsInputName
    /**
      * The ARN of the role which grants AWS IoT Analytics permission to deliver data set contents to an AWS IoT Events input.
      */
    var roleArn: RoleArn
  }
  
  trait LambdaActivity extends js.Object {
    /**
      * The number of messages passed to the Lambda function for processing. The AWS Lambda function must be able to process all of these messages within five minutes, which is the maximum timeout duration for Lambda functions.
      */
    var batchSize: ActivityBatchSize
    /**
      * The name of the Lambda function that is run on the message.
      */
    var lambdaName: LambdaName
    /**
      * The name of the 'lambda' activity.
      */
    var name: ActivityName
    /**
      * The next activity in the pipeline.
      */
    var next: js.UndefOr[ActivityName] = js.undefined
  }
  
  trait ListChannelsRequest extends js.Object {
    /**
      * The maximum number of results to return in this request. The default value is 100.
      */
    var maxResults: js.UndefOr[MaxResults] = js.undefined
    /**
      * The token for the next set of results.
      */
    var nextToken: js.UndefOr[NextToken] = js.undefined
  }
  
  trait ListChannelsResponse extends js.Object {
    /**
      * A list of "ChannelSummary" objects.
      */
    var channelSummaries: js.UndefOr[ChannelSummaries] = js.undefined
    /**
      * The token to retrieve the next set of results, or null if there are no more results.
      */
    var nextToken: js.UndefOr[NextToken] = js.undefined
  }
  
  trait ListDatasetContentsRequest extends js.Object {
    /**
      * The name of the data set whose contents information you want to list.
      */
    var datasetName: DatasetName
    /**
      * The maximum number of results to return in this request.
      */
    var maxResults: js.UndefOr[MaxResults] = js.undefined
    /**
      * The token for the next set of results.
      */
    var nextToken: js.UndefOr[NextToken] = js.undefined
    /**
      * A filter to limit results to those data set contents whose creation is scheduled before the given time. See the field triggers.schedule in the CreateDataset request. (timestamp)
      */
    var scheduledBefore: js.UndefOr[Timestamp] = js.undefined
    /**
      * A filter to limit results to those data set contents whose creation is scheduled on or after the given time. See the field triggers.schedule in the CreateDataset request. (timestamp)
      */
    var scheduledOnOrAfter: js.UndefOr[Timestamp] = js.undefined
  }
  
  trait ListDatasetContentsResponse extends js.Object {
    /**
      * Summary information about data set contents that have been created.
      */
    var datasetContentSummaries: js.UndefOr[DatasetContentSummaries] = js.undefined
    /**
      * The token to retrieve the next set of results, or null if there are no more results.
      */
    var nextToken: js.UndefOr[NextToken] = js.undefined
  }
  
  trait ListDatasetsRequest extends js.Object {
    /**
      * The maximum number of results to return in this request. The default value is 100.
      */
    var maxResults: js.UndefOr[MaxResults] = js.undefined
    /**
      * The token for the next set of results.
      */
    var nextToken: js.UndefOr[NextToken] = js.undefined
  }
  
  trait ListDatasetsResponse extends js.Object {
    /**
      * A list of "DatasetSummary" objects.
      */
    var datasetSummaries: js.UndefOr[DatasetSummaries] = js.undefined
    /**
      * The token to retrieve the next set of results, or null if there are no more results.
      */
    var nextToken: js.UndefOr[NextToken] = js.undefined
  }
  
  trait ListDatastoresRequest extends js.Object {
    /**
      * The maximum number of results to return in this request. The default value is 100.
      */
    var maxResults: js.UndefOr[MaxResults] = js.undefined
    /**
      * The token for the next set of results.
      */
    var nextToken: js.UndefOr[NextToken] = js.undefined
  }
  
  trait ListDatastoresResponse extends js.Object {
    /**
      * A list of "DatastoreSummary" objects.
      */
    var datastoreSummaries: js.UndefOr[DatastoreSummaries] = js.undefined
    /**
      * The token to retrieve the next set of results, or null if there are no more results.
      */
    var nextToken: js.UndefOr[NextToken] = js.undefined
  }
  
  trait ListPipelinesRequest extends js.Object {
    /**
      * The maximum number of results to return in this request. The default value is 100.
      */
    var maxResults: js.UndefOr[MaxResults] = js.undefined
    /**
      * The token for the next set of results.
      */
    var nextToken: js.UndefOr[NextToken] = js.undefined
  }
  
  trait ListPipelinesResponse extends js.Object {
    /**
      * The token to retrieve the next set of results, or null if there are no more results.
      */
    var nextToken: js.UndefOr[NextToken] = js.undefined
    /**
      * A list of "PipelineSummary" objects.
      */
    var pipelineSummaries: js.UndefOr[PipelineSummaries] = js.undefined
  }
  
  trait ListTagsForResourceRequest extends js.Object {
    /**
      * The ARN of the resource whose tags you want to list.
      */
    var resourceArn: ResourceArn
  }
  
  trait ListTagsForResourceResponse extends js.Object {
    /**
      * The tags (metadata) which you have assigned to the resource.
      */
    var tags: js.UndefOr[TagList] = js.undefined
  }
  
  trait LoggingOptions extends js.Object {
    /**
      * If true, logging is enabled for AWS IoT Analytics.
      */
    var enabled: LoggingEnabled
    /**
      * The logging level. Currently, only "ERROR" is supported.
      */
    var level: LoggingLevel
    /**
      * The ARN of the role that grants permission to AWS IoT Analytics to perform logging.
      */
    var roleArn: RoleArn
  }
  
  trait MathActivity extends js.Object {
    /**
      * The name of the attribute that contains the result of the math operation.
      */
    var attribute: AttributeName
    /**
      * An expression that uses one or more existing attributes and must return an integer value.
      */
    var math: MathExpression
    /**
      * The name of the 'math' activity.
      */
    var name: ActivityName
    /**
      * The next activity in the pipeline.
      */
    var next: js.UndefOr[ActivityName] = js.undefined
  }
  
  trait Message extends js.Object {
    /**
      * The ID you wish to assign to the message. Each "messageId" must be unique within each batch sent.
      */
    var messageId: MessageId
    /**
      * The payload of the message. This may be a JSON string or a Base64-encoded string representing binary data (in which case you must decode it by means of a pipeline activity).
      */
    var payload: MessagePayload
  }
  
  trait OutputFileUriValue extends js.Object {
    /**
      * The URI of the location where data set contents are stored, usually the URI of a file in an S3 bucket.
      */
    var fileName: OutputFileName
  }
  
  trait Pipeline extends js.Object {
    /**
      * The activities that perform transformations on the messages.
      */
    var activities: js.UndefOr[PipelineActivities] = js.undefined
    /**
      * The ARN of the pipeline.
      */
    var arn: js.UndefOr[PipelineArn] = js.undefined
    /**
      * When the pipeline was created.
      */
    var creationTime: js.UndefOr[Timestamp] = js.undefined
    /**
      * The last time the pipeline was updated.
      */
    var lastUpdateTime: js.UndefOr[Timestamp] = js.undefined
    /**
      * The name of the pipeline.
      */
    var name: js.UndefOr[PipelineName] = js.undefined
    /**
      * A summary of information about the pipeline reprocessing.
      */
    var reprocessingSummaries: js.UndefOr[ReprocessingSummaries] = js.undefined
  }
  
  trait PipelineActivity extends js.Object {
    /**
      * Adds other attributes based on existing attributes in the message.
      */
    var addAttributes: js.UndefOr[AddAttributesActivity] = js.undefined
    /**
      * Determines the source of the messages to be processed.
      */
    var channel: js.UndefOr[ChannelActivity] = js.undefined
    /**
      * Specifies where to store the processed message data.
      */
    var datastore: js.UndefOr[DatastoreActivity] = js.undefined
    /**
      * Adds data from the AWS IoT device registry to your message.
      */
    var deviceRegistryEnrich: js.UndefOr[DeviceRegistryEnrichActivity] = js.undefined
    /**
      * Adds information from the AWS IoT Device Shadows service to a message.
      */
    var deviceShadowEnrich: js.UndefOr[DeviceShadowEnrichActivity] = js.undefined
    /**
      * Filters a message based on its attributes.
      */
    var filter: js.UndefOr[FilterActivity] = js.undefined
    /**
      * Runs a Lambda function to modify the message.
      */
    var lambda: js.UndefOr[LambdaActivity] = js.undefined
    /**
      * Computes an arithmetic expression using the message's attributes and adds it to the message.
      */
    var math: js.UndefOr[MathActivity] = js.undefined
    /**
      * Removes attributes from a message.
      */
    var removeAttributes: js.UndefOr[RemoveAttributesActivity] = js.undefined
    /**
      * Creates a new message using only the specified attributes from the original message. 
      */
    var selectAttributes: js.UndefOr[SelectAttributesActivity] = js.undefined
  }
  
  trait PipelineSummary extends js.Object {
    /**
      * When the pipeline was created.
      */
    var creationTime: js.UndefOr[Timestamp] = js.undefined
    /**
      * When the pipeline was last updated.
      */
    var lastUpdateTime: js.UndefOr[Timestamp] = js.undefined
    /**
      * The name of the pipeline.
      */
    var pipelineName: js.UndefOr[PipelineName] = js.undefined
    /**
      * A summary of information about the pipeline reprocessing.
      */
    var reprocessingSummaries: js.UndefOr[ReprocessingSummaries] = js.undefined
  }
  
  trait PutLoggingOptionsRequest extends js.Object {
    /**
      * The new values of the AWS IoT Analytics logging options.
      */
    var loggingOptions: LoggingOptions
  }
  
  trait QueryFilter extends js.Object {
    /**
      * Used to limit data to that which has arrived since the last execution of the action.
      */
    var deltaTime: js.UndefOr[DeltaTime] = js.undefined
  }
  
  trait RemoveAttributesActivity extends js.Object {
    /**
      * A list of 1-50 attributes to remove from the message.
      */
    var attributes: AttributeNames
    /**
      * The name of the 'removeAttributes' activity.
      */
    var name: ActivityName
    /**
      * The next activity in the pipeline.
      */
    var next: js.UndefOr[ActivityName] = js.undefined
  }
  
  trait ReprocessingSummary extends js.Object {
    /**
      * The time the pipeline reprocessing was created.
      */
    var creationTime: js.UndefOr[Timestamp] = js.undefined
    /**
      * The 'reprocessingId' returned by "StartPipelineReprocessing".
      */
    var id: js.UndefOr[ReprocessingId] = js.undefined
    /**
      * The status of the pipeline reprocessing.
      */
    var status: js.UndefOr[ReprocessingStatus] = js.undefined
  }
  
  trait ResourceConfiguration extends js.Object {
    /**
      * The type of the compute resource used to execute the "containerAction". Possible values are: ACU_1 (vCPU=4, memory=16GiB) or ACU_2 (vCPU=8, memory=32GiB).
      */
    var computeType: ComputeType
    /**
      * The size (in GB) of the persistent storage available to the resource instance used to execute the "containerAction" (min: 1, max: 50).
      */
    var volumeSizeInGB: VolumeSizeInGB
  }
  
  trait RetentionPeriod extends js.Object {
    /**
      * The number of days that message data is kept. The "unlimited" parameter must be false.
      */
    var numberOfDays: js.UndefOr[RetentionPeriodInDays] = js.undefined
    /**
      * If true, message data is kept indefinitely.
      */
    var unlimited: js.UndefOr[UnlimitedRetentionPeriod] = js.undefined
  }
  
  trait RunPipelineActivityRequest extends js.Object {
    /**
      * The sample message payloads on which the pipeline activity is run.
      */
    var payloads: MessagePayloads
    /**
      * The pipeline activity that is run. This must not be a 'channel' activity or a 'datastore' activity because these activities are used in a pipeline only to load the original message and to store the (possibly) transformed message. If a 'lambda' activity is specified, only short-running Lambda functions (those with a timeout of less than 30 seconds or less) can be used.
      */
    var pipelineActivity: PipelineActivity
  }
  
  trait RunPipelineActivityResponse extends js.Object {
    /**
      * In case the pipeline activity fails, the log message that is generated.
      */
    var logResult: js.UndefOr[LogResult] = js.undefined
    /**
      * The enriched or transformed sample message payloads as base64-encoded strings. (The results of running the pipeline activity on each input sample message payload, encoded in base64.)
      */
    var payloads: js.UndefOr[MessagePayloads] = js.undefined
  }
  
  trait SampleChannelDataRequest extends js.Object {
    /**
      * The name of the channel whose message samples are retrieved.
      */
    var channelName: ChannelName
    /**
      * The end of the time window from which sample messages are retrieved.
      */
    var endTime: js.UndefOr[EndTime] = js.undefined
    /**
      * The number of sample messages to be retrieved. The limit is 10, the default is also 10.
      */
    var maxMessages: js.UndefOr[MaxMessages] = js.undefined
    /**
      * The start of the time window from which sample messages are retrieved.
      */
    var startTime: js.UndefOr[StartTime] = js.undefined
  }
  
  trait SampleChannelDataResponse extends js.Object {
    /**
      * The list of message samples. Each sample message is returned as a base64-encoded string.
      */
    var payloads: js.UndefOr[MessagePayloads] = js.undefined
  }
  
  trait Schedule extends js.Object {
    /**
      * The expression that defines when to trigger an update. For more information, see  Schedule Expressions for Rules in the Amazon CloudWatch Events User Guide.
      */
    var expression: js.UndefOr[ScheduleExpression] = js.undefined
  }
  
  trait SelectAttributesActivity extends js.Object {
    /**
      * A list of the attributes to select from the message.
      */
    var attributes: AttributeNames
    /**
      * The name of the 'selectAttributes' activity.
      */
    var name: ActivityName
    /**
      * The next activity in the pipeline.
      */
    var next: js.UndefOr[ActivityName] = js.undefined
  }
  
  trait SqlQueryDatasetAction extends js.Object {
    /**
      * Pre-filters applied to message data.
      */
    var filters: js.UndefOr[QueryFilters] = js.undefined
    /**
      * A SQL query string.
      */
    var sqlQuery: SqlQuery
  }
  
  trait StartPipelineReprocessingRequest extends js.Object {
    /**
      * The end time (exclusive) of raw message data that is reprocessed.
      */
    var endTime: js.UndefOr[EndTime] = js.undefined
    /**
      * The name of the pipeline on which to start reprocessing.
      */
    var pipelineName: PipelineName
    /**
      * The start time (inclusive) of raw message data that is reprocessed.
      */
    var startTime: js.UndefOr[StartTime] = js.undefined
  }
  
  trait StartPipelineReprocessingResponse extends js.Object {
    /**
      * The ID of the pipeline reprocessing activity that was started.
      */
    var reprocessingId: js.UndefOr[ReprocessingId] = js.undefined
  }
  
  trait Tag extends js.Object {
    /**
      * The tag's key.
      */
    var key: TagKey
    /**
      * The tag's value.
      */
    var value: TagValue
  }
  
  trait TagResourceRequest extends js.Object {
    /**
      * The ARN of the resource whose tags you want to modify.
      */
    var resourceArn: ResourceArn
    /**
      * The new or modified tags for the resource.
      */
    var tags: TagList
  }
  
  trait TagResourceResponse extends js.Object
  
  trait TriggeringDataset extends js.Object {
    /**
      * The name of the data set whose content generation triggers the new data set content generation.
      */
    var name: DatasetName
  }
  
  @js.native
  trait Types
    extends awsDashSdkLib.libServiceMod.Service {
    @JSName("config")
    var config_Types: awsDashSdkLib.libConfigMod.ConfigBase with ClientConfiguration = js.native
    /**
      * Sends messages to a channel.
      */
    def batchPutMessage(): awsDashSdkLib.libRequestMod.Request[BatchPutMessageResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def batchPutMessage(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ BatchPutMessageResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[BatchPutMessageResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Sends messages to a channel.
      */
    def batchPutMessage(params: BatchPutMessageRequest): awsDashSdkLib.libRequestMod.Request[BatchPutMessageResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def batchPutMessage(
      params: BatchPutMessageRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ BatchPutMessageResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[BatchPutMessageResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Cancels the reprocessing of data through the pipeline.
      */
    def cancelPipelineReprocessing(): awsDashSdkLib.libRequestMod.Request[CancelPipelineReprocessingResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def cancelPipelineReprocessing(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CancelPipelineReprocessingResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CancelPipelineReprocessingResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Cancels the reprocessing of data through the pipeline.
      */
    def cancelPipelineReprocessing(params: CancelPipelineReprocessingRequest): awsDashSdkLib.libRequestMod.Request[CancelPipelineReprocessingResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def cancelPipelineReprocessing(
      params: CancelPipelineReprocessingRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CancelPipelineReprocessingResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CancelPipelineReprocessingResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Creates a channel. A channel collects data from an MQTT topic and archives the raw, unprocessed messages before publishing the data to a pipeline.
      */
    def createChannel(): awsDashSdkLib.libRequestMod.Request[CreateChannelResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def createChannel(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateChannelResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateChannelResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Creates a channel. A channel collects data from an MQTT topic and archives the raw, unprocessed messages before publishing the data to a pipeline.
      */
    def createChannel(params: CreateChannelRequest): awsDashSdkLib.libRequestMod.Request[CreateChannelResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def createChannel(
      params: CreateChannelRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateChannelResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateChannelResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Creates a data set. A data set stores data retrieved from a data store by applying a "queryAction" (a SQL query) or a "containerAction" (executing a containerized application). This operation creates the skeleton of a data set. The data set can be populated manually by calling "CreateDatasetContent" or automatically according to a "trigger" you specify.
      */
    def createDataset(): awsDashSdkLib.libRequestMod.Request[CreateDatasetResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def createDataset(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateDatasetResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateDatasetResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Creates a data set. A data set stores data retrieved from a data store by applying a "queryAction" (a SQL query) or a "containerAction" (executing a containerized application). This operation creates the skeleton of a data set. The data set can be populated manually by calling "CreateDatasetContent" or automatically according to a "trigger" you specify.
      */
    def createDataset(params: CreateDatasetRequest): awsDashSdkLib.libRequestMod.Request[CreateDatasetResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def createDataset(
      params: CreateDatasetRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateDatasetResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateDatasetResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Creates the content of a data set by applying a "queryAction" (a SQL query) or a "containerAction" (executing a containerized application).
      */
    def createDatasetContent(): awsDashSdkLib.libRequestMod.Request[CreateDatasetContentResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def createDatasetContent(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateDatasetContentResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateDatasetContentResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Creates the content of a data set by applying a "queryAction" (a SQL query) or a "containerAction" (executing a containerized application).
      */
    def createDatasetContent(params: CreateDatasetContentRequest): awsDashSdkLib.libRequestMod.Request[CreateDatasetContentResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def createDatasetContent(
      params: CreateDatasetContentRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateDatasetContentResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateDatasetContentResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Creates a data store, which is a repository for messages.
      */
    def createDatastore(): awsDashSdkLib.libRequestMod.Request[CreateDatastoreResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def createDatastore(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateDatastoreResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateDatastoreResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Creates a data store, which is a repository for messages.
      */
    def createDatastore(params: CreateDatastoreRequest): awsDashSdkLib.libRequestMod.Request[CreateDatastoreResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def createDatastore(
      params: CreateDatastoreRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateDatastoreResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateDatastoreResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Creates a pipeline. A pipeline consumes messages from one or more channels and allows you to process the messages before storing them in a data store. You must specify both a channel and a datastore activity and, optionally, as many as 23 additional activities in the pipelineActivities array.
      */
    def createPipeline(): awsDashSdkLib.libRequestMod.Request[CreatePipelineResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def createPipeline(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreatePipelineResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreatePipelineResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Creates a pipeline. A pipeline consumes messages from one or more channels and allows you to process the messages before storing them in a data store. You must specify both a channel and a datastore activity and, optionally, as many as 23 additional activities in the pipelineActivities array.
      */
    def createPipeline(params: CreatePipelineRequest): awsDashSdkLib.libRequestMod.Request[CreatePipelineResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def createPipeline(
      params: CreatePipelineRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreatePipelineResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreatePipelineResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Deletes the specified channel.
      */
    def deleteChannel(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteChannel(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Deletes the specified channel.
      */
    def deleteChannel(params: DeleteChannelRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteChannel(
      params: DeleteChannelRequest,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Deletes the specified data set. You do not have to delete the content of the data set before you perform this operation.
      */
    def deleteDataset(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteDataset(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Deletes the specified data set. You do not have to delete the content of the data set before you perform this operation.
      */
    def deleteDataset(params: DeleteDatasetRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteDataset(
      params: DeleteDatasetRequest,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Deletes the content of the specified data set.
      */
    def deleteDatasetContent(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteDatasetContent(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Deletes the content of the specified data set.
      */
    def deleteDatasetContent(params: DeleteDatasetContentRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteDatasetContent(
      params: DeleteDatasetContentRequest,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Deletes the specified data store.
      */
    def deleteDatastore(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteDatastore(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Deletes the specified data store.
      */
    def deleteDatastore(params: DeleteDatastoreRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteDatastore(
      params: DeleteDatastoreRequest,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Deletes the specified pipeline.
      */
    def deletePipeline(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deletePipeline(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Deletes the specified pipeline.
      */
    def deletePipeline(params: DeletePipelineRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deletePipeline(
      params: DeletePipelineRequest,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Retrieves information about a channel.
      */
    def describeChannel(): awsDashSdkLib.libRequestMod.Request[DescribeChannelResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeChannel(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeChannelResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeChannelResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Retrieves information about a channel.
      */
    def describeChannel(params: DescribeChannelRequest): awsDashSdkLib.libRequestMod.Request[DescribeChannelResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeChannel(
      params: DescribeChannelRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeChannelResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeChannelResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Retrieves information about a data set.
      */
    def describeDataset(): awsDashSdkLib.libRequestMod.Request[DescribeDatasetResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeDataset(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeDatasetResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeDatasetResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Retrieves information about a data set.
      */
    def describeDataset(params: DescribeDatasetRequest): awsDashSdkLib.libRequestMod.Request[DescribeDatasetResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeDataset(
      params: DescribeDatasetRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeDatasetResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeDatasetResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Retrieves information about a data store.
      */
    def describeDatastore(): awsDashSdkLib.libRequestMod.Request[DescribeDatastoreResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeDatastore(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeDatastoreResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeDatastoreResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Retrieves information about a data store.
      */
    def describeDatastore(params: DescribeDatastoreRequest): awsDashSdkLib.libRequestMod.Request[DescribeDatastoreResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeDatastore(
      params: DescribeDatastoreRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeDatastoreResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeDatastoreResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Retrieves the current settings of the AWS IoT Analytics logging options.
      */
    def describeLoggingOptions(): awsDashSdkLib.libRequestMod.Request[DescribeLoggingOptionsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeLoggingOptions(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeLoggingOptionsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeLoggingOptionsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Retrieves the current settings of the AWS IoT Analytics logging options.
      */
    def describeLoggingOptions(params: DescribeLoggingOptionsRequest): awsDashSdkLib.libRequestMod.Request[DescribeLoggingOptionsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeLoggingOptions(
      params: DescribeLoggingOptionsRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeLoggingOptionsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeLoggingOptionsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Retrieves information about a pipeline.
      */
    def describePipeline(): awsDashSdkLib.libRequestMod.Request[DescribePipelineResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describePipeline(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribePipelineResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribePipelineResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Retrieves information about a pipeline.
      */
    def describePipeline(params: DescribePipelineRequest): awsDashSdkLib.libRequestMod.Request[DescribePipelineResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describePipeline(
      params: DescribePipelineRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribePipelineResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribePipelineResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Retrieves the contents of a data set as pre-signed URIs.
      */
    def getDatasetContent(): awsDashSdkLib.libRequestMod.Request[GetDatasetContentResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getDatasetContent(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetDatasetContentResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetDatasetContentResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Retrieves the contents of a data set as pre-signed URIs.
      */
    def getDatasetContent(params: GetDatasetContentRequest): awsDashSdkLib.libRequestMod.Request[GetDatasetContentResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getDatasetContent(
      params: GetDatasetContentRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetDatasetContentResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetDatasetContentResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Retrieves a list of channels.
      */
    def listChannels(): awsDashSdkLib.libRequestMod.Request[ListChannelsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listChannels(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListChannelsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListChannelsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Retrieves a list of channels.
      */
    def listChannels(params: ListChannelsRequest): awsDashSdkLib.libRequestMod.Request[ListChannelsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listChannels(
      params: ListChannelsRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListChannelsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListChannelsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Lists information about data set contents that have been created.
      */
    def listDatasetContents(): awsDashSdkLib.libRequestMod.Request[ListDatasetContentsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listDatasetContents(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListDatasetContentsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListDatasetContentsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Lists information about data set contents that have been created.
      */
    def listDatasetContents(params: ListDatasetContentsRequest): awsDashSdkLib.libRequestMod.Request[ListDatasetContentsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listDatasetContents(
      params: ListDatasetContentsRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListDatasetContentsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListDatasetContentsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Retrieves information about data sets.
      */
    def listDatasets(): awsDashSdkLib.libRequestMod.Request[ListDatasetsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listDatasets(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListDatasetsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListDatasetsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Retrieves information about data sets.
      */
    def listDatasets(params: ListDatasetsRequest): awsDashSdkLib.libRequestMod.Request[ListDatasetsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listDatasets(
      params: ListDatasetsRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListDatasetsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListDatasetsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Retrieves a list of data stores.
      */
    def listDatastores(): awsDashSdkLib.libRequestMod.Request[ListDatastoresResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listDatastores(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListDatastoresResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListDatastoresResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Retrieves a list of data stores.
      */
    def listDatastores(params: ListDatastoresRequest): awsDashSdkLib.libRequestMod.Request[ListDatastoresResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listDatastores(
      params: ListDatastoresRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListDatastoresResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListDatastoresResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Retrieves a list of pipelines.
      */
    def listPipelines(): awsDashSdkLib.libRequestMod.Request[ListPipelinesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listPipelines(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListPipelinesResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListPipelinesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Retrieves a list of pipelines.
      */
    def listPipelines(params: ListPipelinesRequest): awsDashSdkLib.libRequestMod.Request[ListPipelinesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listPipelines(
      params: ListPipelinesRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListPipelinesResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListPipelinesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Lists the tags (metadata) which you have assigned to the resource.
      */
    def listTagsForResource(): awsDashSdkLib.libRequestMod.Request[ListTagsForResourceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listTagsForResource(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListTagsForResourceResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListTagsForResourceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Lists the tags (metadata) which you have assigned to the resource.
      */
    def listTagsForResource(params: ListTagsForResourceRequest): awsDashSdkLib.libRequestMod.Request[ListTagsForResourceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listTagsForResource(
      params: ListTagsForResourceRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListTagsForResourceResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListTagsForResourceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Sets or updates the AWS IoT Analytics logging options. Note that if you update the value of any loggingOptions field, it takes up to one minute for the change to take effect. Also, if you change the policy attached to the role you specified in the roleArn field (for example, to correct an invalid policy) it takes up to 5 minutes for that change to take effect. 
      */
    def putLoggingOptions(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def putLoggingOptions(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Sets or updates the AWS IoT Analytics logging options. Note that if you update the value of any loggingOptions field, it takes up to one minute for the change to take effect. Also, if you change the policy attached to the role you specified in the roleArn field (for example, to correct an invalid policy) it takes up to 5 minutes for that change to take effect. 
      */
    def putLoggingOptions(params: PutLoggingOptionsRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def putLoggingOptions(
      params: PutLoggingOptionsRequest,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Simulates the results of running a pipeline activity on a message payload.
      */
    def runPipelineActivity(): awsDashSdkLib.libRequestMod.Request[RunPipelineActivityResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def runPipelineActivity(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ RunPipelineActivityResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[RunPipelineActivityResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Simulates the results of running a pipeline activity on a message payload.
      */
    def runPipelineActivity(params: RunPipelineActivityRequest): awsDashSdkLib.libRequestMod.Request[RunPipelineActivityResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def runPipelineActivity(
      params: RunPipelineActivityRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ RunPipelineActivityResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[RunPipelineActivityResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Retrieves a sample of messages from the specified channel ingested during the specified timeframe. Up to 10 messages can be retrieved.
      */
    def sampleChannelData(): awsDashSdkLib.libRequestMod.Request[SampleChannelDataResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def sampleChannelData(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ SampleChannelDataResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[SampleChannelDataResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Retrieves a sample of messages from the specified channel ingested during the specified timeframe. Up to 10 messages can be retrieved.
      */
    def sampleChannelData(params: SampleChannelDataRequest): awsDashSdkLib.libRequestMod.Request[SampleChannelDataResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def sampleChannelData(
      params: SampleChannelDataRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ SampleChannelDataResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[SampleChannelDataResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Starts the reprocessing of raw message data through the pipeline.
      */
    def startPipelineReprocessing(): awsDashSdkLib.libRequestMod.Request[StartPipelineReprocessingResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def startPipelineReprocessing(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ StartPipelineReprocessingResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[StartPipelineReprocessingResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Starts the reprocessing of raw message data through the pipeline.
      */
    def startPipelineReprocessing(params: StartPipelineReprocessingRequest): awsDashSdkLib.libRequestMod.Request[StartPipelineReprocessingResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def startPipelineReprocessing(
      params: StartPipelineReprocessingRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ StartPipelineReprocessingResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[StartPipelineReprocessingResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Adds to or modifies the tags of the given resource. Tags are metadata which can be used to manage a resource.
      */
    def tagResource(): awsDashSdkLib.libRequestMod.Request[TagResourceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def tagResource(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ TagResourceResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[TagResourceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Adds to or modifies the tags of the given resource. Tags are metadata which can be used to manage a resource.
      */
    def tagResource(params: TagResourceRequest): awsDashSdkLib.libRequestMod.Request[TagResourceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def tagResource(
      params: TagResourceRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ TagResourceResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[TagResourceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Removes the given tags (metadata) from the resource.
      */
    def untagResource(): awsDashSdkLib.libRequestMod.Request[UntagResourceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def untagResource(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ UntagResourceResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[UntagResourceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Removes the given tags (metadata) from the resource.
      */
    def untagResource(params: UntagResourceRequest): awsDashSdkLib.libRequestMod.Request[UntagResourceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def untagResource(
      params: UntagResourceRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ UntagResourceResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[UntagResourceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Updates the settings of a channel.
      */
    def updateChannel(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def updateChannel(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Updates the settings of a channel.
      */
    def updateChannel(params: UpdateChannelRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def updateChannel(
      params: UpdateChannelRequest,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Updates the settings of a data set.
      */
    def updateDataset(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def updateDataset(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Updates the settings of a data set.
      */
    def updateDataset(params: UpdateDatasetRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def updateDataset(
      params: UpdateDatasetRequest,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Updates the settings of a data store.
      */
    def updateDatastore(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def updateDatastore(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Updates the settings of a data store.
      */
    def updateDatastore(params: UpdateDatastoreRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def updateDatastore(
      params: UpdateDatastoreRequest,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Updates the settings of a pipeline. You must specify both a channel and a datastore activity and, optionally, as many as 23 additional activities in the pipelineActivities array.
      */
    def updatePipeline(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def updatePipeline(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Updates the settings of a pipeline. You must specify both a channel and a datastore activity and, optionally, as many as 23 additional activities in the pipelineActivities array.
      */
    def updatePipeline(params: UpdatePipelineRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def updatePipeline(
      params: UpdatePipelineRequest,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  }
  
  trait UntagResourceRequest extends js.Object {
    /**
      * The ARN of the resource whose tags you want to remove.
      */
    var resourceArn: ResourceArn
    /**
      * The keys of those tags which you want to remove.
      */
    var tagKeys: TagKeyList
  }
  
  trait UntagResourceResponse extends js.Object
  
  trait UpdateChannelRequest extends js.Object {
    /**
      * The name of the channel to be updated.
      */
    var channelName: ChannelName
    /**
      * How long, in days, message data is kept for the channel.
      */
    var retentionPeriod: js.UndefOr[RetentionPeriod] = js.undefined
  }
  
  trait UpdateDatasetRequest extends js.Object {
    /**
      * A list of "DatasetAction" objects.
      */
    var actions: DatasetActions
    /**
      * When data set contents are created they are delivered to destinations specified here.
      */
    var contentDeliveryRules: js.UndefOr[DatasetContentDeliveryRules] = js.undefined
    /**
      * The name of the data set to update.
      */
    var datasetName: DatasetName
    /**
      * How long, in days, data set contents are kept for the data set.
      */
    var retentionPeriod: js.UndefOr[RetentionPeriod] = js.undefined
    /**
      * A list of "DatasetTrigger" objects. The list can be empty or can contain up to five DataSetTrigger objects.
      */
    var triggers: js.UndefOr[DatasetTriggers] = js.undefined
    /**
      * [Optional] How many versions of data set contents are kept. If not specified or set to null, only the latest version plus the latest succeeded version (if they are different) are kept for the time period specified by the "retentionPeriod" parameter. (For more information, see https://docs.aws.amazon.com/iotanalytics/latest/userguide/getting-started.html#aws-iot-analytics-dataset-versions)
      */
    var versioningConfiguration: js.UndefOr[VersioningConfiguration] = js.undefined
  }
  
  trait UpdateDatastoreRequest extends js.Object {
    /**
      * The name of the data store to be updated.
      */
    var datastoreName: DatastoreName
    /**
      * How long, in days, message data is kept for the data store.
      */
    var retentionPeriod: js.UndefOr[RetentionPeriod] = js.undefined
  }
  
  trait UpdatePipelineRequest extends js.Object {
    /**
      * A list of "PipelineActivity" objects. Activities perform transformations on your messages, such as removing, renaming or adding message attributes; filtering messages based on attribute values; invoking your Lambda functions on messages for advanced processing; or performing mathematical transformations to normalize device data. The list can be 2-25 PipelineActivity objects and must contain both a channel and a datastore activity. Each entry in the list must contain only one activity, for example:  pipelineActivities = [ { "channel": { ... } }, { "lambda": { ... } }, ... ] 
      */
    var pipelineActivities: PipelineActivities
    /**
      * The name of the pipeline to update.
      */
    var pipelineName: PipelineName
  }
  
  trait Variable extends js.Object {
    /**
      * The value of the variable as a structure that specifies a data set content version.
      */
    var datasetContentVersionValue: js.UndefOr[DatasetContentVersionValue] = js.undefined
    /**
      * The value of the variable as a double (numeric).
      */
    var doubleValue: js.UndefOr[DoubleValue] = js.undefined
    /**
      * The name of the variable.
      */
    var name: VariableName
    /**
      * The value of the variable as a structure that specifies an output file URI.
      */
    var outputFileUriValue: js.UndefOr[OutputFileUriValue] = js.undefined
    /**
      * The value of the variable as a string.
      */
    var stringValue: js.UndefOr[StringValue] = js.undefined
  }
  
  trait VersioningConfiguration extends js.Object {
    /**
      * How many versions of data set contents will be kept. The "unlimited" parameter must be false.
      */
    var maxVersions: js.UndefOr[MaxVersions] = js.undefined
    /**
      * If true, unlimited versions of data set contents will be kept.
      */
    var unlimited: js.UndefOr[UnlimitedVersioning] = js.undefined
  }
  
  trait _ChannelStatus extends js.Object
  
  trait _ComputeType extends js.Object
  
  trait _DatasetActionType extends js.Object
  
  trait _DatasetContentState extends js.Object
  
  trait _DatasetStatus extends js.Object
  
  trait _DatastoreStatus extends js.Object
  
  trait _ReprocessingStatus extends js.Object
  
  trait _apiVersion extends js.Object
  
  val TypesNs: this.type = js.native
  type ActivityBatchSize = scala.Double
  type ActivityName = java.lang.String
  type AttributeName = java.lang.String
  type AttributeNames = js.Array[AttributeName]
  type BatchPutMessageErrorEntries = js.Array[BatchPutMessageErrorEntry]
  type ChannelArn = java.lang.String
  type ChannelName = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.CREATING
    - awsDashSdkLib.awsDashSdkLibStrings.ACTIVE
    - awsDashSdkLib.awsDashSdkLibStrings.DELETING
    - java.lang.String
  */
  type ChannelStatus = _ChannelStatus | java.lang.String
  type ChannelSummaries = js.Array[ChannelSummary]
  type ClientConfiguration = awsDashSdkLib.libServiceMod.ServiceConfigurationOptions with ClientApiVersions
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.ACU_1
    - awsDashSdkLib.awsDashSdkLibStrings.ACU_2
    - java.lang.String
  */
  type ComputeType = _ComputeType | java.lang.String
  type DatasetActionName = java.lang.String
  type DatasetActionSummaries = js.Array[DatasetActionSummary]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.QUERY
    - awsDashSdkLib.awsDashSdkLibStrings.CONTAINER
    - java.lang.String
  */
  type DatasetActionType = _DatasetActionType | java.lang.String
  type DatasetActions = js.Array[DatasetAction]
  type DatasetArn = java.lang.String
  type DatasetContentDeliveryRules = js.Array[DatasetContentDeliveryRule]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.CREATING
    - awsDashSdkLib.awsDashSdkLibStrings.SUCCEEDED
    - awsDashSdkLib.awsDashSdkLibStrings.FAILED
    - java.lang.String
  */
  type DatasetContentState = _DatasetContentState | java.lang.String
  type DatasetContentSummaries = js.Array[DatasetContentSummary]
  type DatasetContentVersion = java.lang.String
  type DatasetEntries = js.Array[DatasetEntry]
  type DatasetName = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.CREATING
    - awsDashSdkLib.awsDashSdkLibStrings.ACTIVE
    - awsDashSdkLib.awsDashSdkLibStrings.DELETING
    - java.lang.String
  */
  type DatasetStatus = _DatasetStatus | java.lang.String
  type DatasetSummaries = js.Array[DatasetSummary]
  type DatasetTriggers = js.Array[DatasetTrigger]
  type DatastoreArn = java.lang.String
  type DatastoreName = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.CREATING
    - awsDashSdkLib.awsDashSdkLibStrings.ACTIVE
    - awsDashSdkLib.awsDashSdkLibStrings.DELETING
    - java.lang.String
  */
  type DatastoreStatus = _DatastoreStatus | java.lang.String
  type DatastoreSummaries = js.Array[DatastoreSummary]
  type DoubleValue = scala.Double
  type EndTime = stdLib.Date
  type EntryName = java.lang.String
  type ErrorCode = java.lang.String
  type ErrorMessage = java.lang.String
  type FilterExpression = java.lang.String
  type Image = java.lang.String
  type IncludeStatisticsFlag = scala.Boolean
  type IotEventsInputName = java.lang.String
  type LambdaName = java.lang.String
  type LogResult = java.lang.String
  type LoggingEnabled = scala.Boolean
  type LoggingLevel = awsDashSdkLib.awsDashSdkLibStrings.ERROR | java.lang.String
  type MathExpression = java.lang.String
  type MaxMessages = scala.Double
  type MaxResults = scala.Double
  type MaxVersions = scala.Double
  type MessageId = java.lang.String
  type MessagePayload = nodeLib.Buffer | stdLib.Uint8Array | awsDashSdkLib.clientsIotanalyticsMod.Blob | java.lang.String
  type MessagePayloads = js.Array[MessagePayload]
  type Messages = js.Array[Message]
  type NextToken = java.lang.String
  type OffsetSeconds = scala.Double
  type OutputFileName = java.lang.String
  type PipelineActivities = js.Array[PipelineActivity]
  type PipelineArn = java.lang.String
  type PipelineName = java.lang.String
  type PipelineSummaries = js.Array[PipelineSummary]
  type PresignedURI = java.lang.String
  type QueryFilters = js.Array[QueryFilter]
  type Reason = java.lang.String
  type ReprocessingId = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.RUNNING
    - awsDashSdkLib.awsDashSdkLibStrings.SUCCEEDED
    - awsDashSdkLib.awsDashSdkLibStrings.CANCELLED
    - awsDashSdkLib.awsDashSdkLibStrings.FAILED
    - java.lang.String
  */
  type ReprocessingStatus = _ReprocessingStatus | java.lang.String
  type ReprocessingSummaries = js.Array[ReprocessingSummary]
  type ResourceArn = java.lang.String
  type RetentionPeriodInDays = scala.Double
  type RoleArn = java.lang.String
  type ScheduleExpression = java.lang.String
  type SizeInBytes = scala.Double
  type SqlQuery = java.lang.String
  type StartTime = stdLib.Date
  type StringValue = java.lang.String
  type TagKey = java.lang.String
  type TagKeyList = js.Array[TagKey]
  type TagList = js.Array[Tag]
  type TagValue = java.lang.String
  type TimeExpression = java.lang.String
  type Timestamp = stdLib.Date
  type UnlimitedRetentionPeriod = scala.Boolean
  type UnlimitedVersioning = scala.Boolean
  type VariableName = java.lang.String
  type Variables = js.Array[Variable]
  type VolumeSizeInGB = scala.Double
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.`2017-11-27`
    - awsDashSdkLib.awsDashSdkLibStrings.latest
    - java.lang.String
  */
  type apiVersion = _apiVersion | java.lang.String
}

