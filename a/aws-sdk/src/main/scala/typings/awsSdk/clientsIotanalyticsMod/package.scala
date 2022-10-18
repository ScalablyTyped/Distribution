package typings.awsSdk.clientsIotanalyticsMod

import org.scalablytyped.runtime.StringDictionary
import typings.awsSdk.awsSdkStrings.ERROR
import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


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
  - typings.awsSdk.awsSdkStrings.CREATING
  - typings.awsSdk.awsSdkStrings.ACTIVE
  - typings.awsSdk.awsSdkStrings.DELETING
  - java.lang.String
*/
type ChannelStatus = _ChannelStatus | String

type ChannelSummaries = js.Array[ChannelSummary]

type ColumnDataType = String

type ColumnName = String

type Columns = js.Array[Column]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.ACU_1
  - typings.awsSdk.awsSdkStrings.ACU_2
  - java.lang.String
*/
type ComputeType = _ComputeType | String

type DatasetActionName = String

type DatasetActionSummaries = js.Array[DatasetActionSummary]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.QUERY
  - typings.awsSdk.awsSdkStrings.CONTAINER
  - java.lang.String
*/
type DatasetActionType = _DatasetActionType | String

type DatasetActions = js.Array[DatasetAction]

type DatasetArn = String

type DatasetContentDeliveryRules = js.Array[DatasetContentDeliveryRule]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.CREATING
  - typings.awsSdk.awsSdkStrings.SUCCEEDED
  - typings.awsSdk.awsSdkStrings.FAILED
  - java.lang.String
*/
type DatasetContentState = _DatasetContentState | String

type DatasetContentSummaries = js.Array[DatasetContentSummary]

type DatasetContentVersion = String

type DatasetEntries = js.Array[DatasetEntry]

type DatasetName = String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.CREATING
  - typings.awsSdk.awsSdkStrings.ACTIVE
  - typings.awsSdk.awsSdkStrings.DELETING
  - java.lang.String
*/
type DatasetStatus = _DatasetStatus | String

type DatasetSummaries = js.Array[DatasetSummary]

type DatasetTriggers = js.Array[DatasetTrigger]

type DatastoreArn = String

type DatastoreName = String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.CREATING
  - typings.awsSdk.awsSdkStrings.ACTIVE
  - typings.awsSdk.awsSdkStrings.DELETING
  - java.lang.String
*/
type DatastoreStatus = _DatastoreStatus | String

type DatastoreSummaries = js.Array[DatastoreSummary]

type DoubleValue = Double

type EndTime = js.Date

type EntryName = String

type ErrorCode = String

type ErrorMessage = String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.JSON
  - typings.awsSdk.awsSdkStrings.PARQUET
  - java.lang.String
*/
type FileFormatType = _FileFormatType | String

type FilterExpression = String

type GlueDatabaseName = String

type GlueTableName = String

type Image = String

type IncludeStatisticsFlag = Boolean

type IotEventsInputName = String

type LambdaName = String

type LateDataRuleName = String

type LateDataRules = js.Array[LateDataRule]

type LogResult = String

type LoggingEnabled = Boolean

type LoggingLevel = ERROR | String

type MathExpression = String

type MaxMessages = Double

type MaxResults = Double

type MaxVersions = Double

type MessageId = String

type MessagePayload = Buffer | js.typedarray.Uint8Array | Blob | String

type MessagePayloads = js.Array[MessagePayload]

type Messages = js.Array[Message]

type NextToken = String

type OffsetSeconds = Double

type OutputFileName = String

type PartitionAttributeName = String

type Partitions = js.Array[DatastorePartition]

type PipelineActivities = js.Array[PipelineActivity]

type PipelineArn = String

type PipelineName = String

type PipelineSummaries = js.Array[PipelineSummary]

type PresignedURI = String

type QueryFilters = js.Array[QueryFilter]

type Reason = String

type ReprocessingId = String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.RUNNING
  - typings.awsSdk.awsSdkStrings.SUCCEEDED
  - typings.awsSdk.awsSdkStrings.CANCELLED
  - typings.awsSdk.awsSdkStrings.FAILED
  - java.lang.String
*/
type ReprocessingStatus = _ReprocessingStatus | String

type ReprocessingSummaries = js.Array[ReprocessingSummary]

type ResourceArn = String

type RetentionPeriodInDays = Double

type RoleArn = String

type S3KeyPrefix = String

type S3PathChannelMessage = String

type S3PathChannelMessages = js.Array[S3PathChannelMessage]

type ScheduleExpression = String

type SessionTimeoutInMinutes = Double

type SizeInBytes = Double

type SqlQuery = String

type StartTime = js.Date

type StringValue = String

type TagKey = String

type TagKeyList = js.Array[TagKey]

type TagList = js.Array[Tag]

type TagValue = String

type TimeExpression = String

type Timestamp = js.Date

type TimestampFormat = String

type UnlimitedRetentionPeriod = Boolean

type UnlimitedVersioning = Boolean

type VariableName = String

type Variables = js.Array[Variable]

type VolumeSizeInGB = Double

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.`2017-11-27`
  - typings.awsSdk.awsSdkStrings.latest_
  - java.lang.String
*/
type apiVersion = _apiVersion | String
