package typings.awsSdk.clientsAthenaMod

import org.scalablytyped.runtime.StringDictionary
import typings.awsSdk.awsSdkStrings.BUCKET_OWNER_FULL_CONTROL
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type AmazonResourceName = java.lang.String

type AwsAccountId = java.lang.String

type Boolean = scala.Boolean

type BoxedBoolean = scala.Boolean

type BytesScannedCutoffValue = Double

type CatalogNameString = java.lang.String

type ColumnInfoList = js.Array[ColumnInfo]

type ColumnList = js.Array[Column]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.NOT_NULL
  - typings.awsSdk.awsSdkStrings.NULLABLE
  - typings.awsSdk.awsSdkStrings.UNKNOWN
  - java.lang.String
*/
type ColumnNullable = _ColumnNullable | java.lang.String

type CommentString = java.lang.String

type DataCatalogSummaryList = js.Array[DataCatalogSummary]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.LAMBDA
  - typings.awsSdk.awsSdkStrings.GLUE
  - typings.awsSdk.awsSdkStrings.HIVE
  - java.lang.String
*/
type DataCatalogType = _DataCatalogType | java.lang.String

type DatabaseList = js.Array[Database]

type DatabaseString = java.lang.String

type Date = js.Date

type DescriptionString = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.SSE_S3
  - typings.awsSdk.awsSdkStrings.SSE_KMS
  - typings.awsSdk.awsSdkStrings.CSE_KMS
  - java.lang.String
*/
type EncryptionOption = _EncryptionOption | java.lang.String

type EngineVersionsList = js.Array[EngineVersion]

type ErrorCategory = Double

type ErrorCode = java.lang.String

type ErrorMessage = java.lang.String

type ErrorType = Double

type ExecutionParameter = java.lang.String

type ExecutionParameters = js.Array[ExecutionParameter]

type ExpressionString = java.lang.String

type IdempotencyToken = java.lang.String

type Integer = Double

type KeyString = java.lang.String

type Long = Double

type MaxDataCatalogsCount = Double

type MaxDatabasesCount = Double

type MaxEngineVersionsCount = Double

type MaxNamedQueriesCount = Double

type MaxPreparedStatementsCount = Double

type MaxQueryExecutionsCount = Double

type MaxQueryResults = Double

type MaxTableMetadataCount = Double

type MaxTagsCount = Double

type MaxWorkGroupsCount = Double

type NameString = java.lang.String

type NamedQueryDescriptionString = java.lang.String

type NamedQueryId = java.lang.String

type NamedQueryIdList = js.Array[NamedQueryId]

type NamedQueryList = js.Array[NamedQuery]

type ParametersMap = StringDictionary[ParametersMapValue]

type ParametersMapValue = java.lang.String

type PreparedStatementDetailsList = js.Array[PreparedStatement]

type PreparedStatementNameList = js.Array[StatementName]

type PreparedStatementsList = js.Array[PreparedStatementSummary]

type QueryExecutionId = java.lang.String

type QueryExecutionIdList = js.Array[QueryExecutionId]

type QueryExecutionList = js.Array[QueryExecution]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.QUEUED
  - typings.awsSdk.awsSdkStrings.RUNNING
  - typings.awsSdk.awsSdkStrings.SUCCEEDED
  - typings.awsSdk.awsSdkStrings.FAILED
  - typings.awsSdk.awsSdkStrings.CANCELLED
  - java.lang.String
*/
type QueryExecutionState = _QueryExecutionState | java.lang.String

type QueryStagePlanNodes = js.Array[QueryStagePlanNode]

type QueryStages = js.Array[QueryStage]

type QueryString = java.lang.String

type ResultOutputLocation = java.lang.String

type RowList = js.Array[Row]

type S3AclOption = BUCKET_OWNER_FULL_CONTROL | java.lang.String

type StatementName = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.DDL
  - typings.awsSdk.awsSdkStrings.DML
  - typings.awsSdk.awsSdkStrings.UTILITY
  - java.lang.String
*/
type StatementType = _StatementType | java.lang.String

type String = java.lang.String

type StringList = js.Array[String]

type TableMetadataList = js.Array[TableMetadata]

type TableTypeString = java.lang.String

type TagKey = java.lang.String

type TagKeyList = js.Array[TagKey]

type TagList = js.Array[Tag]

type TagValue = java.lang.String

type Timestamp = js.Date

type Token = java.lang.String

type TypeString = java.lang.String

type UnprocessedNamedQueryIdList = js.Array[UnprocessedNamedQueryId]

type UnprocessedPreparedStatementNameList = js.Array[UnprocessedPreparedStatementName]

type UnprocessedQueryExecutionIdList = js.Array[UnprocessedQueryExecutionId]

type WorkGroupDescriptionString = java.lang.String

type WorkGroupName = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.ENABLED
  - typings.awsSdk.awsSdkStrings.DISABLED
  - java.lang.String
*/
type WorkGroupState = _WorkGroupState | java.lang.String

type WorkGroupsList = js.Array[WorkGroupSummary]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.`2017-05-18`
  - typings.awsSdk.awsSdkStrings.latest_
  - java.lang.String
*/
type apiVersion = _apiVersion | java.lang.String

type datumList = js.Array[Datum]

type datumString = java.lang.String
