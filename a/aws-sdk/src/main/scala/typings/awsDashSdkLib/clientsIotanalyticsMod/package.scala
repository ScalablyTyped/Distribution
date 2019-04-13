package typings
package awsDashSdkLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object clientsIotanalyticsMod {
  type ActivityBatchSize = scala.Double
  type ActivityName = java.lang.String
  type AttributeName = java.lang.String
  type AttributeNameMapping = org.scalablytyped.runtime.StringDictionary[AttributeName]
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
  type MessagePayload = nodeLib.Buffer | stdLib.Uint8Array | Blob | java.lang.String
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
