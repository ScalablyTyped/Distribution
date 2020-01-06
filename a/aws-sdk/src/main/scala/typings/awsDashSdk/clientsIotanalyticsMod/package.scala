package typings.awsDashSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object clientsIotanalyticsMod {
  import org.scalablytyped.runtime.StringDictionary
  import typings.awsDashSdk.awsDashSdkStrings.ERROR
  import typings.awsDashSdk.libServiceMod.ServiceConfigurationOptions
  import typings.node.Buffer
  import typings.std.Date
  import typings.std.Uint8Array

  type ActivityBatchSize = Double
  type ActivityName = String
  type AttributeName = String
  type AttributeNameMapping = StringDictionary[AttributeName]
  type AttributeNames = js.Array[AttributeName]
  type BatchPutMessageErrorEntries = js.Array[BatchPutMessageErrorEntry]
  type BucketKeyExpression = String
  type BucketName = String
  type ChannelArn = String
  type ChannelName = String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.CREATING
    - typings.awsDashSdk.awsDashSdkStrings.ACTIVE
    - typings.awsDashSdk.awsDashSdkStrings.DELETING
    - java.lang.String
  */
  type ChannelStatus = _ChannelStatus | String
  type ChannelSummaries = js.Array[ChannelSummary]
  type ClientConfiguration = ServiceConfigurationOptions with ClientApiVersions
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.ACU_1
    - typings.awsDashSdk.awsDashSdkStrings.ACU_2
    - java.lang.String
  */
  type ComputeType = _ComputeType | String
  type DatasetActionName = String
  type DatasetActionSummaries = js.Array[DatasetActionSummary]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.QUERY
    - typings.awsDashSdk.awsDashSdkStrings.CONTAINER
    - java.lang.String
  */
  type DatasetActionType = _DatasetActionType | String
  type DatasetActions = js.Array[DatasetAction]
  type DatasetArn = String
  type DatasetContentDeliveryRules = js.Array[DatasetContentDeliveryRule]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.CREATING
    - typings.awsDashSdk.awsDashSdkStrings.SUCCEEDED
    - typings.awsDashSdk.awsDashSdkStrings.FAILED
    - java.lang.String
  */
  type DatasetContentState = _DatasetContentState | String
  type DatasetContentSummaries = js.Array[DatasetContentSummary]
  type DatasetContentVersion = String
  type DatasetEntries = js.Array[DatasetEntry]
  type DatasetName = String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.CREATING
    - typings.awsDashSdk.awsDashSdkStrings.ACTIVE
    - typings.awsDashSdk.awsDashSdkStrings.DELETING
    - java.lang.String
  */
  type DatasetStatus = _DatasetStatus | String
  type DatasetSummaries = js.Array[DatasetSummary]
  type DatasetTriggers = js.Array[DatasetTrigger]
  type DatastoreArn = String
  type DatastoreName = String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.CREATING
    - typings.awsDashSdk.awsDashSdkStrings.ACTIVE
    - typings.awsDashSdk.awsDashSdkStrings.DELETING
    - java.lang.String
  */
  type DatastoreStatus = _DatastoreStatus | String
  type DatastoreSummaries = js.Array[DatastoreSummary]
  type DoubleValue = Double
  type EndTime = Date
  type EntryName = String
  type ErrorCode = String
  type ErrorMessage = String
  type FilterExpression = String
  type GlueDatabaseName = String
  type GlueTableName = String
  type Image = String
  type IncludeStatisticsFlag = Boolean
  type IotEventsInputName = String
  type LambdaName = String
  type LogResult = String
  type LoggingEnabled = Boolean
  type LoggingLevel = ERROR | String
  type MathExpression = String
  type MaxMessages = Double
  type MaxResults = Double
  type MaxVersions = Double
  type MessageId = String
  type MessagePayload = Buffer | Uint8Array | Blob | String
  type MessagePayloads = js.Array[MessagePayload]
  type Messages = js.Array[Message]
  type NextToken = String
  type OffsetSeconds = Double
  type OutputFileName = String
  type PipelineActivities = js.Array[PipelineActivity]
  type PipelineArn = String
  type PipelineName = String
  type PipelineSummaries = js.Array[PipelineSummary]
  type PresignedURI = String
  type QueryFilters = js.Array[QueryFilter]
  type Reason = String
  type ReprocessingId = String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.RUNNING
    - typings.awsDashSdk.awsDashSdkStrings.SUCCEEDED
    - typings.awsDashSdk.awsDashSdkStrings.CANCELLED
    - typings.awsDashSdk.awsDashSdkStrings.FAILED
    - java.lang.String
  */
  type ReprocessingStatus = _ReprocessingStatus | String
  type ReprocessingSummaries = js.Array[ReprocessingSummary]
  type ResourceArn = String
  type RetentionPeriodInDays = Double
  type RoleArn = String
  type S3KeyPrefix = String
  type ScheduleExpression = String
  type SizeInBytes = Double
  type SqlQuery = String
  type StartTime = Date
  type StringValue = String
  type TagKey = String
  type TagKeyList = js.Array[TagKey]
  type TagList = js.Array[Tag]
  type TagValue = String
  type TimeExpression = String
  type Timestamp = Date
  type UnlimitedRetentionPeriod = Boolean
  type UnlimitedVersioning = Boolean
  type VariableName = String
  type Variables = js.Array[Variable]
  type VolumeSizeInGB = Double
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.`2017-11-27`
    - typings.awsDashSdk.awsDashSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = _apiVersion | String
}
