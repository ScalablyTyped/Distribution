package typings
package awsDashSdkLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object clientsGlueMod {
  type ActionList = js.Array[Action]
  type AttemptCount = scala.Double
  type BatchDeletePartitionValueList = js.Array[PartitionValueList]
  type BatchDeleteTableNameList = js.Array[NameString]
  type BatchDeleteTableVersionList = js.Array[VersionString]
  type BatchGetPartitionValueList = js.Array[PartitionValueList]
  type BatchStopJobRunErrorList = js.Array[BatchStopJobRunError]
  type BatchStopJobRunJobRunIdList = js.Array[IdString]
  type BatchStopJobRunSuccessfulSubmissionList = js.Array[BatchStopJobRunSuccessfulSubmission]
  type Boolean = scala.Boolean
  type BooleanNullable = scala.Boolean
  type BooleanValue = scala.Boolean
  type BoundedPartitionValueList = js.Array[ValueString]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.DISABLED
    - awsDashSdkLib.awsDashSdkLibStrings.`SSE-KMS`
    - java.lang.String
  */
  type CatalogEncryptionMode = _CatalogEncryptionMode | java.lang.String
  type CatalogEntries = js.Array[CatalogEntry]
  type CatalogIdString = java.lang.String
  type Classification = java.lang.String
  type ClassifierList = js.Array[Classifier]
  type ClassifierNameList = js.Array[NameString]
  type ClientConfiguration = awsDashSdkLib.libServiceMod.ServiceConfigurationOptions with ClientApiVersions
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.DISABLED
    - awsDashSdkLib.awsDashSdkLibStrings.`SSE-KMS`
    - java.lang.String
  */
  type CloudWatchEncryptionMode = _CloudWatchEncryptionMode | java.lang.String
  type CodeGenArgName = java.lang.String
  type CodeGenArgValue = java.lang.String
  type CodeGenIdentifier = java.lang.String
  type CodeGenNodeArgs = js.Array[CodeGenNodeArg]
  type CodeGenNodeType = java.lang.String
  type ColumnList = js.Array[Column]
  type ColumnTypeString = java.lang.String
  type ColumnValueStringList = js.Array[ColumnValuesString]
  type ColumnValuesString = java.lang.String
  type CommentString = java.lang.String
  type ConditionList = js.Array[Condition]
  type ConnectionList = js.Array[Connection]
  type ConnectionName = java.lang.String
  type ConnectionProperties = org.scalablytyped.runtime.StringDictionary[ValueString]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.HOST
    - awsDashSdkLib.awsDashSdkLibStrings.PORT
    - awsDashSdkLib.awsDashSdkLibStrings.USERNAME
    - awsDashSdkLib.awsDashSdkLibStrings.PASSWORD
    - awsDashSdkLib.awsDashSdkLibStrings.ENCRYPTED_PASSWORD
    - awsDashSdkLib.awsDashSdkLibStrings.JDBC_DRIVER_JAR_URI
    - awsDashSdkLib.awsDashSdkLibStrings.JDBC_DRIVER_CLASS_NAME
    - awsDashSdkLib.awsDashSdkLibStrings.JDBC_ENGINE
    - awsDashSdkLib.awsDashSdkLibStrings.JDBC_ENGINE_VERSION
    - awsDashSdkLib.awsDashSdkLibStrings.CONFIG_FILES
    - awsDashSdkLib.awsDashSdkLibStrings.INSTANCE_ID
    - awsDashSdkLib.awsDashSdkLibStrings.JDBC_CONNECTION_URL
    - awsDashSdkLib.awsDashSdkLibStrings.JDBC_ENFORCE_SSL
    - java.lang.String
  */
  type ConnectionPropertyKey = _ConnectionPropertyKey | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.JDBC
    - awsDashSdkLib.awsDashSdkLibStrings.SFTP
    - java.lang.String
  */
  type ConnectionType = _ConnectionType | java.lang.String
  type CrawlerConfiguration = java.lang.String
  type CrawlerList = js.Array[Crawler]
  type CrawlerMetricsList = js.Array[CrawlerMetrics]
  type CrawlerNameList = js.Array[NameString]
  type CrawlerSecurityConfiguration = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.READY
    - awsDashSdkLib.awsDashSdkLibStrings.RUNNING
    - awsDashSdkLib.awsDashSdkLibStrings.STOPPING
    - java.lang.String
  */
  type CrawlerState = _CrawlerState | java.lang.String
  type CronExpression = java.lang.String
  type CsvColumnDelimiter = java.lang.String
  type CsvHeader = js.Array[NameString]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.UNKNOWN
    - awsDashSdkLib.awsDashSdkLibStrings.PRESENT
    - awsDashSdkLib.awsDashSdkLibStrings.ABSENT
    - java.lang.String
  */
  type CsvHeaderOption = _CsvHeaderOption | java.lang.String
  type CsvQuoteSymbol = java.lang.String
  type CustomPatterns = java.lang.String
  type DagEdges = js.Array[CodeGenEdge]
  type DagNodes = js.Array[CodeGenNode]
  type DatabaseList = js.Array[Database]
  type DatabaseName = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.LOG
    - awsDashSdkLib.awsDashSdkLibStrings.DELETE_FROM_DATABASE
    - awsDashSdkLib.awsDashSdkLibStrings.DEPRECATE_IN_DATABASE
    - java.lang.String
  */
  type DeleteBehavior = _DeleteBehavior | java.lang.String
  type DeleteConnectionNameList = js.Array[NameString]
  type DescriptionString = java.lang.String
  type DescriptionStringRemovable = java.lang.String
  type DevEndpointList = js.Array[DevEndpoint]
  type DevEndpointNameList = js.Array[NameString]
  type DevEndpointNames = js.Array[GenericString]
  type DynamoDBTargetList = js.Array[DynamoDBTarget]
  type ErrorByName = org.scalablytyped.runtime.StringDictionary[ErrorDetail]
  type ErrorString = java.lang.String
  type ExecutionTime = scala.Double
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.MUST_EXIST
    - awsDashSdkLib.awsDashSdkLibStrings.NOT_EXIST
    - awsDashSdkLib.awsDashSdkLibStrings.NONE
    - java.lang.String
  */
  type ExistCondition = _ExistCondition | java.lang.String
  type FieldType = java.lang.String
  type FilterString = java.lang.String
  type FormatString = java.lang.String
  type GenericMap = org.scalablytyped.runtime.StringDictionary[GenericString]
  type GenericString = java.lang.String
  type GetTableVersionsList = js.Array[TableVersion]
  type GlueResourceArn = java.lang.String
  type GrokPattern = java.lang.String
  type HashString = java.lang.String
  type IdString = java.lang.String
  type Integer = scala.Double
  type IntegerFlag = scala.Double
  type IntegerValue = scala.Double
  type JdbcTargetList = js.Array[JdbcTarget]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.DISABLED
    - awsDashSdkLib.awsDashSdkLibStrings.`CSE-KMS`
    - java.lang.String
  */
  type JobBookmarksEncryptionMode = _JobBookmarksEncryptionMode | java.lang.String
  type JobList = js.Array[Job]
  type JobName = java.lang.String
  type JobNameList = js.Array[NameString]
  type JobRunList = js.Array[JobRun]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.STARTING
    - awsDashSdkLib.awsDashSdkLibStrings.RUNNING
    - awsDashSdkLib.awsDashSdkLibStrings.STOPPING
    - awsDashSdkLib.awsDashSdkLibStrings.STOPPED
    - awsDashSdkLib.awsDashSdkLibStrings.SUCCEEDED
    - awsDashSdkLib.awsDashSdkLibStrings.FAILED
    - awsDashSdkLib.awsDashSdkLibStrings.TIMEOUT
    - java.lang.String
  */
  type JobRunState = _JobRunState | java.lang.String
  type JsonPath = java.lang.String
  type JsonValue = java.lang.String
  type KeyString = java.lang.String
  type KmsKeyArn = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.PYTHON
    - awsDashSdkLib.awsDashSdkLibStrings.SCALA
    - java.lang.String
  */
  type Language = _Language | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.SUCCEEDED
    - awsDashSdkLib.awsDashSdkLibStrings.CANCELLED
    - awsDashSdkLib.awsDashSdkLibStrings.FAILED
    - java.lang.String
  */
  type LastCrawlStatus = _LastCrawlStatus | java.lang.String
  type LocationMap = org.scalablytyped.runtime.StringDictionary[ColumnValuesString]
  type LocationString = java.lang.String
  type LogGroup = java.lang.String
  type LogStream = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.AND
    - awsDashSdkLib.awsDashSdkLibStrings.ANY
    - java.lang.String
  */
  type Logical = _Logical | java.lang.String
  type LogicalOperator = awsDashSdkLib.awsDashSdkLibStrings.EQUALS | java.lang.String
  type MapValue = org.scalablytyped.runtime.StringDictionary[GenericString]
  type MappingList = js.Array[MappingEntry]
  type MatchCriteria = js.Array[NameString]
  type MaxConcurrentRuns = scala.Double
  type MaxRetries = scala.Double
  type MessagePrefix = java.lang.String
  type MillisecondsCount = scala.Double
  type NameString = java.lang.String
  type NameStringList = js.Array[NameString]
  type NonNegativeDouble = scala.Double
  type NonNegativeInteger = scala.Double
  type NotifyDelayAfter = scala.Double
  type NullableBoolean = scala.Boolean
  type NullableDouble = scala.Double
  type NullableInteger = scala.Double
  type OrderList = js.Array[Order]
  type PageSize = scala.Double
  type ParametersMap = org.scalablytyped.runtime.StringDictionary[ParametersMapValue]
  type ParametersMapValue = java.lang.String
  type PartitionErrors = js.Array[PartitionError]
  type PartitionInputList = js.Array[PartitionInput]
  type PartitionList = js.Array[Partition]
  type Path = java.lang.String
  type PathList = js.Array[Path]
  type PolicyJsonString = java.lang.String
  type PredecessorList = js.Array[Predecessor]
  type PredicateString = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.USER
    - awsDashSdkLib.awsDashSdkLibStrings.ROLE
    - awsDashSdkLib.awsDashSdkLibStrings.GROUP
    - java.lang.String
  */
  type PrincipalType = _PrincipalType | java.lang.String
  type PublicKeysList = js.Array[GenericString]
  type PythonScript = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.JAR
    - awsDashSdkLib.awsDashSdkLibStrings.FILE
    - awsDashSdkLib.awsDashSdkLibStrings.ARCHIVE
    - java.lang.String
  */
  type ResourceType = _ResourceType | java.lang.String
  type ResourceUriList = js.Array[ResourceUri]
  type Role = java.lang.String
  type RoleArn = java.lang.String
  type RoleString = java.lang.String
  type RowTag = java.lang.String
  type S3EncryptionList = js.Array[S3Encryption]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.DISABLED
    - awsDashSdkLib.awsDashSdkLibStrings.`SSE-KMS`
    - awsDashSdkLib.awsDashSdkLibStrings.`SSE-S3`
    - java.lang.String
  */
  type S3EncryptionMode = _S3EncryptionMode | java.lang.String
  type S3TargetList = js.Array[S3Target]
  type ScalaCode = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.SCHEDULED
    - awsDashSdkLib.awsDashSdkLibStrings.NOT_SCHEDULED
    - awsDashSdkLib.awsDashSdkLibStrings.TRANSITIONING
    - java.lang.String
  */
  type ScheduleState = _ScheduleState | java.lang.String
  type SchemaPathString = java.lang.String
  type ScriptLocationString = java.lang.String
  type SecurityConfigurationList = js.Array[SecurityConfiguration]
  type SecurityGroupIdList = js.Array[NameString]
  type StringList = js.Array[GenericString]
  type TableErrors = js.Array[TableError]
  type TableList = js.Array[Table]
  type TableName = java.lang.String
  type TablePrefix = java.lang.String
  type TableTypeString = java.lang.String
  type TableVersionErrors = js.Array[TableVersionError]
  type TagKey = java.lang.String
  type TagKeysList = js.Array[TagKey]
  type TagValue = java.lang.String
  type TagsMap = org.scalablytyped.runtime.StringDictionary[TagValue]
  type Timeout = scala.Double
  type Timestamp = stdLib.Date
  type TimestampValue = stdLib.Date
  type Token = java.lang.String
  type TotalSegmentsInteger = scala.Double
  type TriggerList = js.Array[Trigger]
  type TriggerNameList = js.Array[NameString]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.CREATING
    - awsDashSdkLib.awsDashSdkLibStrings.CREATED
    - awsDashSdkLib.awsDashSdkLibStrings.ACTIVATING
    - awsDashSdkLib.awsDashSdkLibStrings.ACTIVATED
    - awsDashSdkLib.awsDashSdkLibStrings.DEACTIVATING
    - awsDashSdkLib.awsDashSdkLibStrings.DEACTIVATED
    - awsDashSdkLib.awsDashSdkLibStrings.DELETING
    - awsDashSdkLib.awsDashSdkLibStrings.UPDATING
    - java.lang.String
  */
  type TriggerState = _TriggerState | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.SCHEDULED
    - awsDashSdkLib.awsDashSdkLibStrings.CONDITIONAL
    - awsDashSdkLib.awsDashSdkLibStrings.ON_DEMAND
    - java.lang.String
  */
  type TriggerType = _TriggerType | java.lang.String
  type URI = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.LOG
    - awsDashSdkLib.awsDashSdkLibStrings.UPDATE_IN_DATABASE
    - java.lang.String
  */
  type UpdateBehavior = _UpdateBehavior | java.lang.String
  type UriString = java.lang.String
  type UserDefinedFunctionList = js.Array[UserDefinedFunction]
  type ValueString = java.lang.String
  type ValueStringList = js.Array[ValueString]
  type VersionId = scala.Double
  type VersionString = java.lang.String
  type ViewTextString = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.Standard
    - awsDashSdkLib.awsDashSdkLibStrings.GDOT1X
    - awsDashSdkLib.awsDashSdkLibStrings.GDOT2X
    - java.lang.String
  */
  type WorkerType = _WorkerType | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.`2017-03-31`
    - awsDashSdkLib.awsDashSdkLibStrings.latest
    - java.lang.String
  */
  type apiVersion = _apiVersion | java.lang.String
}
