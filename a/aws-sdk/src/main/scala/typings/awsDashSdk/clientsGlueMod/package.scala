package typings.awsDashSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object clientsGlueMod {
  import org.scalablytyped.runtime.StringDictionary
  import typings.awsDashSdk.awsDashSdkStrings.EQUALS
  import typings.awsDashSdk.awsDashSdkStrings.FIND_MATCHES
  import typings.awsDashSdk.libServiceMod.ServiceConfigurationOptions
  import typings.std.Date

  type ActionList = js.Array[Action]
  type AttemptCount = Double
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
    - typings.awsDashSdk.awsDashSdkStrings.DISABLED
    - typings.awsDashSdk.awsDashSdkStrings.`SSE-KMS`
    - java.lang.String
  */
  type CatalogEncryptionMode = _CatalogEncryptionMode | String
  type CatalogEntries = js.Array[CatalogEntry]
  type CatalogIdString = String
  type CatalogTablesList = js.Array[NameString]
  type CatalogTargetList = js.Array[CatalogTarget]
  type Classification = String
  type ClassifierList = js.Array[Classifier]
  type ClassifierNameList = js.Array[NameString]
  type ClientConfiguration = ServiceConfigurationOptions with ClientApiVersions
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.DISABLED
    - typings.awsDashSdk.awsDashSdkStrings.`SSE-KMS`
    - java.lang.String
  */
  type CloudWatchEncryptionMode = _CloudWatchEncryptionMode | String
  type CodeGenArgName = String
  type CodeGenArgValue = String
  type CodeGenIdentifier = String
  type CodeGenNodeArgs = js.Array[CodeGenNodeArg]
  type CodeGenNodeType = String
  type ColumnList = js.Array[Column]
  type ColumnNameString = String
  type ColumnTypeString = String
  type ColumnValueStringList = js.Array[ColumnValuesString]
  type ColumnValuesString = String
  type CommentString = String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.EQUALS
    - typings.awsDashSdk.awsDashSdkStrings.GREATER_THAN
    - typings.awsDashSdk.awsDashSdkStrings.LESS_THAN
    - typings.awsDashSdk.awsDashSdkStrings.GREATER_THAN_EQUALS
    - typings.awsDashSdk.awsDashSdkStrings.LESS_THAN_EQUALS
    - java.lang.String
  */
  type Comparator = _Comparator | String
  type ConditionList = js.Array[Condition]
  type ConnectionList = js.Array[Connection]
  type ConnectionName = String
  type ConnectionProperties = StringDictionary[ValueString]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.HOST
    - typings.awsDashSdk.awsDashSdkStrings.PORT
    - typings.awsDashSdk.awsDashSdkStrings.USERNAME
    - typings.awsDashSdk.awsDashSdkStrings.PASSWORD
    - typings.awsDashSdk.awsDashSdkStrings.ENCRYPTED_PASSWORD
    - typings.awsDashSdk.awsDashSdkStrings.JDBC_DRIVER_JAR_URI
    - typings.awsDashSdk.awsDashSdkStrings.JDBC_DRIVER_CLASS_NAME
    - typings.awsDashSdk.awsDashSdkStrings.JDBC_ENGINE
    - typings.awsDashSdk.awsDashSdkStrings.JDBC_ENGINE_VERSION
    - typings.awsDashSdk.awsDashSdkStrings.CONFIG_FILES
    - typings.awsDashSdk.awsDashSdkStrings.INSTANCE_ID
    - typings.awsDashSdk.awsDashSdkStrings.JDBC_CONNECTION_URL
    - typings.awsDashSdk.awsDashSdkStrings.JDBC_ENFORCE_SSL
    - typings.awsDashSdk.awsDashSdkStrings.CUSTOM_JDBC_CERT
    - typings.awsDashSdk.awsDashSdkStrings.SKIP_CUSTOM_JDBC_CERT_VALIDATION
    - typings.awsDashSdk.awsDashSdkStrings.CUSTOM_JDBC_CERT_STRING
    - java.lang.String
  */
  type ConnectionPropertyKey = _ConnectionPropertyKey | String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.JDBC
    - typings.awsDashSdk.awsDashSdkStrings.SFTP
    - java.lang.String
  */
  type ConnectionType = _ConnectionType | String
  type CrawlList = js.Array[Crawl]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.RUNNING
    - typings.awsDashSdk.awsDashSdkStrings.SUCCEEDED
    - typings.awsDashSdk.awsDashSdkStrings.CANCELLED
    - typings.awsDashSdk.awsDashSdkStrings.FAILED
    - java.lang.String
  */
  type CrawlState = _CrawlState | String
  type CrawlerConfiguration = String
  type CrawlerList = js.Array[Crawler]
  type CrawlerMetricsList = js.Array[CrawlerMetrics]
  type CrawlerNameList = js.Array[NameString]
  type CrawlerSecurityConfiguration = String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.READY
    - typings.awsDashSdk.awsDashSdkStrings.RUNNING
    - typings.awsDashSdk.awsDashSdkStrings.STOPPING
    - java.lang.String
  */
  type CrawlerState = _CrawlerState | String
  type CronExpression = String
  type CsvColumnDelimiter = String
  type CsvHeader = js.Array[NameString]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.UNKNOWN
    - typings.awsDashSdk.awsDashSdkStrings.PRESENT
    - typings.awsDashSdk.awsDashSdkStrings.ABSENT
    - java.lang.String
  */
  type CsvHeaderOption = _CsvHeaderOption | String
  type CsvQuoteSymbol = String
  type CustomPatterns = String
  type DagEdges = js.Array[CodeGenEdge]
  type DagNodes = js.Array[CodeGenNode]
  type DataLakePrincipalString = String
  type DatabaseList = js.Array[Database]
  type DatabaseName = String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.LOG
    - typings.awsDashSdk.awsDashSdkStrings.DELETE_FROM_DATABASE
    - typings.awsDashSdk.awsDashSdkStrings.DEPRECATE_IN_DATABASE
    - java.lang.String
  */
  type DeleteBehavior = _DeleteBehavior | String
  type DeleteConnectionNameList = js.Array[NameString]
  type DescriptionString = String
  type DescriptionStringRemovable = String
  type DevEndpointList = js.Array[DevEndpoint]
  type DevEndpointNameList = js.Array[NameString]
  type DevEndpointNames = js.Array[GenericString]
  type DynamoDBTargetList = js.Array[DynamoDBTarget]
  type EdgeList = js.Array[Edge]
  type ErrorByName = StringDictionary[ErrorDetail]
  type ErrorString = String
  type ExecutionTime = Double
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.MUST_EXIST
    - typings.awsDashSdk.awsDashSdkStrings.NOT_EXIST
    - typings.awsDashSdk.awsDashSdkStrings.NONE
    - java.lang.String
  */
  type ExistCondition = _ExistCondition | String
  type FieldType = String
  type FilterString = String
  type FormatString = String
  type GenericBoundedDouble = Double
  type GenericMap = StringDictionary[GenericString]
  type GenericString = String
  type GetTableVersionsList = js.Array[TableVersion]
  type GlueResourceArn = String
  type GlueTables = js.Array[GlueTable]
  type GlueVersionString = String
  type GrokPattern = String
  type HashString = String
  type IdString = String
  type Integer = Double
  type IntegerFlag = Double
  type IntegerValue = Double
  type JdbcTargetList = js.Array[JdbcTarget]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.DISABLED
    - typings.awsDashSdk.awsDashSdkStrings.`CSE-KMS`
    - java.lang.String
  */
  type JobBookmarksEncryptionMode = _JobBookmarksEncryptionMode | String
  type JobList = js.Array[Job]
  type JobName = String
  type JobNameList = js.Array[NameString]
  type JobRunList = js.Array[JobRun]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.STARTING
    - typings.awsDashSdk.awsDashSdkStrings.RUNNING
    - typings.awsDashSdk.awsDashSdkStrings.STOPPING
    - typings.awsDashSdk.awsDashSdkStrings.STOPPED
    - typings.awsDashSdk.awsDashSdkStrings.SUCCEEDED
    - typings.awsDashSdk.awsDashSdkStrings.FAILED
    - typings.awsDashSdk.awsDashSdkStrings.TIMEOUT
    - java.lang.String
  */
  type JobRunState = _JobRunState | String
  type JsonPath = String
  type JsonValue = String
  type KeyString = String
  type KmsKeyArn = String
  type LabelCount = Double
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.PYTHON
    - typings.awsDashSdk.awsDashSdkStrings.SCALA
    - java.lang.String
  */
  type Language = _Language | String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.SUCCEEDED
    - typings.awsDashSdk.awsDashSdkStrings.CANCELLED
    - typings.awsDashSdk.awsDashSdkStrings.FAILED
    - java.lang.String
  */
  type LastCrawlStatus = _LastCrawlStatus | String
  type LocationMap = StringDictionary[ColumnValuesString]
  type LocationString = String
  type LogGroup = String
  type LogStream = String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.AND
    - typings.awsDashSdk.awsDashSdkStrings.ANY
    - java.lang.String
  */
  type Logical = _Logical | String
  type LogicalOperator = EQUALS | String
  type MapValue = StringDictionary[GenericString]
  type MappingList = js.Array[MappingEntry]
  type MatchCriteria = js.Array[NameString]
  type MaxConcurrentRuns = Double
  type MaxRetries = Double
  type MessagePrefix = String
  type MillisecondsCount = Double
  type NameString = String
  type NameStringList = js.Array[NameString]
  type NodeList = js.Array[Node]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.CRAWLER
    - typings.awsDashSdk.awsDashSdkStrings.JOB
    - typings.awsDashSdk.awsDashSdkStrings.TRIGGER
    - java.lang.String
  */
  type NodeType = _NodeType | String
  type NonNegativeDouble = Double
  type NonNegativeInteger = Double
  type NotifyDelayAfter = Double
  type NullableBoolean = scala.Boolean
  type NullableDouble = Double
  type NullableInteger = Double
  type OrchestrationStringList = js.Array[GenericString]
  type OrderList = js.Array[Order]
  type PageSize = Double
  type PaginationToken = String
  type ParametersMap = StringDictionary[ParametersMapValue]
  type ParametersMapValue = String
  type PartitionErrors = js.Array[PartitionError]
  type PartitionInputList = js.Array[PartitionInput]
  type PartitionList = js.Array[Partition]
  type Path = String
  type PathList = js.Array[Path]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.ALL
    - typings.awsDashSdk.awsDashSdkStrings.SELECT
    - typings.awsDashSdk.awsDashSdkStrings.ALTER
    - typings.awsDashSdk.awsDashSdkStrings.DROP
    - typings.awsDashSdk.awsDashSdkStrings.DELETE
    - typings.awsDashSdk.awsDashSdkStrings.INSERT
    - typings.awsDashSdk.awsDashSdkStrings.CREATE_DATABASE
    - typings.awsDashSdk.awsDashSdkStrings.CREATE_TABLE
    - typings.awsDashSdk.awsDashSdkStrings.DATA_LOCATION_ACCESS
    - java.lang.String
  */
  type Permission = _Permission | String
  type PermissionList = js.Array[Permission]
  type PolicyJsonString = String
  type PredecessorList = js.Array[Predecessor]
  type PredicateString = String
  type PrincipalPermissionsList = js.Array[PrincipalPermissions]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.USER
    - typings.awsDashSdk.awsDashSdkStrings.ROLE
    - typings.awsDashSdk.awsDashSdkStrings.GROUP
    - java.lang.String
  */
  type PrincipalType = _PrincipalType | String
  type PublicKeysList = js.Array[GenericString]
  type PythonScript = String
  type PythonVersionString = String
  type RecordsCount = Double
  type ReplaceBoolean = scala.Boolean
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.JAR
    - typings.awsDashSdk.awsDashSdkStrings.FILE
    - typings.awsDashSdk.awsDashSdkStrings.ARCHIVE
    - java.lang.String
  */
  type ResourceType = _ResourceType | String
  type ResourceUriList = js.Array[ResourceUri]
  type Role = String
  type RoleArn = String
  type RoleString = String
  type RowTag = String
  type RunId = String
  type S3EncryptionList = js.Array[S3Encryption]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.DISABLED
    - typings.awsDashSdk.awsDashSdkStrings.`SSE-KMS`
    - typings.awsDashSdk.awsDashSdkStrings.`SSE-S3`
    - java.lang.String
  */
  type S3EncryptionMode = _S3EncryptionMode | String
  type S3TargetList = js.Array[S3Target]
  type ScalaCode = String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.SCHEDULED
    - typings.awsDashSdk.awsDashSdkStrings.NOT_SCHEDULED
    - typings.awsDashSdk.awsDashSdkStrings.TRANSITIONING
    - java.lang.String
  */
  type ScheduleState = _ScheduleState | String
  type SchemaPathString = String
  type ScriptLocationString = String
  type SearchPropertyPredicates = js.Array[PropertyPredicate]
  type SecurityConfigurationList = js.Array[SecurityConfiguration]
  type SecurityGroupIdList = js.Array[NameString]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.ASC
    - typings.awsDashSdk.awsDashSdkStrings.DESC
    - java.lang.String
  */
  type Sort = _Sort | String
  type SortCriteria = js.Array[SortCriterion]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.DESCENDING
    - typings.awsDashSdk.awsDashSdkStrings.ASCENDING
    - java.lang.String
  */
  type SortDirectionType = _SortDirectionType | String
  type StringList = js.Array[GenericString]
  type TableErrors = js.Array[TableError]
  type TableList = js.Array[Table]
  type TableName = String
  type TablePrefix = String
  type TableTypeString = String
  type TableVersionErrors = js.Array[TableVersionError]
  type TagKey = String
  type TagKeysList = js.Array[TagKey]
  type TagValue = String
  type TagsMap = StringDictionary[TagValue]
  type TaskRunList = js.Array[TaskRun]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.TASK_RUN_TYPE
    - typings.awsDashSdk.awsDashSdkStrings.STATUS
    - typings.awsDashSdk.awsDashSdkStrings.STARTED
    - java.lang.String
  */
  type TaskRunSortColumnType = _TaskRunSortColumnType | String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.STARTING
    - typings.awsDashSdk.awsDashSdkStrings.RUNNING
    - typings.awsDashSdk.awsDashSdkStrings.STOPPING
    - typings.awsDashSdk.awsDashSdkStrings.STOPPED
    - typings.awsDashSdk.awsDashSdkStrings.SUCCEEDED
    - typings.awsDashSdk.awsDashSdkStrings.FAILED
    - typings.awsDashSdk.awsDashSdkStrings.TIMEOUT
    - java.lang.String
  */
  type TaskStatusType = _TaskStatusType | String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.EVALUATION
    - typings.awsDashSdk.awsDashSdkStrings.LABELING_SET_GENERATION
    - typings.awsDashSdk.awsDashSdkStrings.IMPORT_LABELS
    - typings.awsDashSdk.awsDashSdkStrings.EXPORT_LABELS
    - typings.awsDashSdk.awsDashSdkStrings.FIND_MATCHES
    - java.lang.String
  */
  type TaskType = _TaskType | String
  type Timeout = Double
  type Timestamp = Date
  type TimestampValue = Date
  type Token = String
  type TotalSegmentsInteger = Double
  type TransformList = js.Array[MLTransform]
  type TransformSchema = js.Array[SchemaColumn]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.NAME
    - typings.awsDashSdk.awsDashSdkStrings.TRANSFORM_TYPE
    - typings.awsDashSdk.awsDashSdkStrings.STATUS
    - typings.awsDashSdk.awsDashSdkStrings.CREATED
    - typings.awsDashSdk.awsDashSdkStrings.LAST_MODIFIED
    - java.lang.String
  */
  type TransformSortColumnType = _TransformSortColumnType | String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.NOT_READY
    - typings.awsDashSdk.awsDashSdkStrings.READY
    - typings.awsDashSdk.awsDashSdkStrings.DELETING
    - java.lang.String
  */
  type TransformStatusType = _TransformStatusType | String
  type TransformType = FIND_MATCHES | String
  type TriggerList = js.Array[Trigger]
  type TriggerNameList = js.Array[NameString]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.CREATING
    - typings.awsDashSdk.awsDashSdkStrings.CREATED
    - typings.awsDashSdk.awsDashSdkStrings.ACTIVATING
    - typings.awsDashSdk.awsDashSdkStrings.ACTIVATED
    - typings.awsDashSdk.awsDashSdkStrings.DEACTIVATING
    - typings.awsDashSdk.awsDashSdkStrings.DEACTIVATED
    - typings.awsDashSdk.awsDashSdkStrings.DELETING
    - typings.awsDashSdk.awsDashSdkStrings.UPDATING
    - java.lang.String
  */
  type TriggerState = _TriggerState | String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.SCHEDULED
    - typings.awsDashSdk.awsDashSdkStrings.CONDITIONAL
    - typings.awsDashSdk.awsDashSdkStrings.ON_DEMAND
    - java.lang.String
  */
  type TriggerType = _TriggerType | String
  type URI = String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.LOG
    - typings.awsDashSdk.awsDashSdkStrings.UPDATE_IN_DATABASE
    - java.lang.String
  */
  type UpdateBehavior = _UpdateBehavior | String
  type UriString = String
  type UserDefinedFunctionList = js.Array[UserDefinedFunction]
  type ValueString = String
  type ValueStringList = js.Array[ValueString]
  type VersionId = Double
  type VersionString = String
  type ViewTextString = String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.Standard
    - typings.awsDashSdk.awsDashSdkStrings.GDOT1X
    - typings.awsDashSdk.awsDashSdkStrings.GDOT2X
    - java.lang.String
  */
  type WorkerType = _WorkerType | String
  type WorkflowNames = js.Array[NameString]
  type WorkflowRunProperties = StringDictionary[GenericString]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.RUNNING
    - typings.awsDashSdk.awsDashSdkStrings.COMPLETED
    - java.lang.String
  */
  type WorkflowRunStatus = _WorkflowRunStatus | String
  type WorkflowRuns = js.Array[WorkflowRun]
  type Workflows = js.Array[Workflow]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.`2017-03-31`
    - typings.awsDashSdk.awsDashSdkStrings.latest
    - java.lang.String
  */
  type apiVersion = _apiVersion | String
}
