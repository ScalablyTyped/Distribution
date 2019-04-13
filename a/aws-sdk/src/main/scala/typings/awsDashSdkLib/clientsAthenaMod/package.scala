package typings
package awsDashSdkLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object clientsAthenaMod {
  type AmazonResourceName = java.lang.String
  type Boolean = scala.Boolean
  type BoxedBoolean = scala.Boolean
  type BytesScannedCutoffValue = scala.Double
  type ClientConfiguration = awsDashSdkLib.libServiceMod.ServiceConfigurationOptions with ClientApiVersions
  type ColumnInfoList = js.Array[ColumnInfo]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.NOT_NULL
    - awsDashSdkLib.awsDashSdkLibStrings.NULLABLE
    - awsDashSdkLib.awsDashSdkLibStrings.UNKNOWN
    - java.lang.String
  */
  type ColumnNullable = _ColumnNullable | java.lang.String
  type DatabaseString = java.lang.String
  type DescriptionString = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.SSE_S3
    - awsDashSdkLib.awsDashSdkLibStrings.SSE_KMS
    - awsDashSdkLib.awsDashSdkLibStrings.CSE_KMS
    - java.lang.String
  */
  type EncryptionOption = _EncryptionOption | java.lang.String
  type ErrorCode = java.lang.String
  type ErrorMessage = java.lang.String
  type IdempotencyToken = java.lang.String
  type Integer = scala.Double
  type Long = scala.Double
  type MaxNamedQueriesCount = scala.Double
  type MaxQueryExecutionsCount = scala.Double
  type MaxQueryResults = scala.Double
  type MaxTagsCount = scala.Double
  type MaxWorkGroupsCount = scala.Double
  type NameString = java.lang.String
  type NamedQueryId = java.lang.String
  type NamedQueryIdList = js.Array[NamedQueryId]
  type NamedQueryList = js.Array[NamedQuery]
  type QueryExecutionId = java.lang.String
  type QueryExecutionIdList = js.Array[QueryExecutionId]
  type QueryExecutionList = js.Array[QueryExecution]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.QUEUED
    - awsDashSdkLib.awsDashSdkLibStrings.RUNNING
    - awsDashSdkLib.awsDashSdkLibStrings.SUCCEEDED
    - awsDashSdkLib.awsDashSdkLibStrings.FAILED
    - awsDashSdkLib.awsDashSdkLibStrings.CANCELLED
    - java.lang.String
  */
  type QueryExecutionState = _QueryExecutionState | java.lang.String
  type QueryString = java.lang.String
  type RowList = js.Array[Row]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.DDL
    - awsDashSdkLib.awsDashSdkLibStrings.DML
    - awsDashSdkLib.awsDashSdkLibStrings.UTILITY
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
    - awsDashSdkLib.awsDashSdkLibStrings.ENABLED
    - awsDashSdkLib.awsDashSdkLibStrings.DISABLED
    - java.lang.String
  */
  type WorkGroupState = _WorkGroupState | java.lang.String
  type WorkGroupsList = js.Array[WorkGroupSummary]
  type _Date = stdLib.Date
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.`2017-05-18`
    - awsDashSdkLib.awsDashSdkLibStrings.latest
    - java.lang.String
  */
  type apiVersion = _apiVersion | java.lang.String
  type datumList = js.Array[Datum]
  type datumString = java.lang.String
}
