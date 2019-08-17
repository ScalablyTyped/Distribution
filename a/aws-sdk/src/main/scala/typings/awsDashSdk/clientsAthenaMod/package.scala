package typings.awsDashSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object clientsAthenaMod {
  import typings.awsDashSdk.libServiceMod.ServiceConfigurationOptions
  import typings.std.Date

  type AmazonResourceName = java.lang.String
  type Boolean = scala.Boolean
  type BoxedBoolean = scala.Boolean
  type BytesScannedCutoffValue = Double
  type ClientConfiguration = ServiceConfigurationOptions with ClientApiVersions
  type ColumnInfoList = js.Array[ColumnInfo]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.NOT_NULL
    - typings.awsDashSdk.awsDashSdkStrings.NULLABLE
    - typings.awsDashSdk.awsDashSdkStrings.UNKNOWN
    - java.lang.String
  */
  type ColumnNullable = _ColumnNullable | java.lang.String
  type DatabaseString = java.lang.String
  type DescriptionString = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.SSE_S3
    - typings.awsDashSdk.awsDashSdkStrings.SSE_KMS
    - typings.awsDashSdk.awsDashSdkStrings.CSE_KMS
    - java.lang.String
  */
  type EncryptionOption = _EncryptionOption | java.lang.String
  type ErrorCode = java.lang.String
  type ErrorMessage = java.lang.String
  type IdempotencyToken = java.lang.String
  type Integer = Double
  type Long = Double
  type MaxNamedQueriesCount = Double
  type MaxQueryExecutionsCount = Double
  type MaxQueryResults = Double
  type MaxTagsCount = Double
  type MaxWorkGroupsCount = Double
  type NameString = java.lang.String
  type NamedQueryId = java.lang.String
  type NamedQueryIdList = js.Array[NamedQueryId]
  type NamedQueryList = js.Array[NamedQuery]
  type QueryExecutionId = java.lang.String
  type QueryExecutionIdList = js.Array[QueryExecutionId]
  type QueryExecutionList = js.Array[QueryExecution]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.QUEUED
    - typings.awsDashSdk.awsDashSdkStrings.RUNNING
    - typings.awsDashSdk.awsDashSdkStrings.SUCCEEDED
    - typings.awsDashSdk.awsDashSdkStrings.FAILED
    - typings.awsDashSdk.awsDashSdkStrings.CANCELLED
    - java.lang.String
  */
  type QueryExecutionState = _QueryExecutionState | java.lang.String
  type QueryString = java.lang.String
  type RowList = js.Array[Row]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.DDL
    - typings.awsDashSdk.awsDashSdkStrings.DML
    - typings.awsDashSdk.awsDashSdkStrings.UTILITY
    - java.lang.String
  */
  type StatementType = _StatementType | java.lang.String
  type String = java.lang.String
  type TagKey = java.lang.String
  type TagKeyList = js.Array[TagKey]
  type TagList = js.Array[Tag]
  type TagValue = java.lang.String
  type Token = java.lang.String
  type UnprocessedNamedQueryIdList = js.Array[UnprocessedNamedQueryId]
  type UnprocessedQueryExecutionIdList = js.Array[UnprocessedQueryExecutionId]
  type WorkGroupDescriptionString = java.lang.String
  type WorkGroupName = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.ENABLED
    - typings.awsDashSdk.awsDashSdkStrings.DISABLED
    - java.lang.String
  */
  type WorkGroupState = _WorkGroupState | java.lang.String
  type WorkGroupsList = js.Array[WorkGroupSummary]
  type _Date = Date
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.`2017-05-18`
    - typings.awsDashSdk.awsDashSdkStrings.latest
    - java.lang.String
  */
  type apiVersion = _apiVersion | java.lang.String
  type datumList = js.Array[Datum]
  type datumString = java.lang.String
}
