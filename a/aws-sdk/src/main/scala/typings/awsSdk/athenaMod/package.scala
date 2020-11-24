package typings.awsSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object athenaMod {
  
  type AmazonResourceName = java.lang.String
  
  type Boolean = scala.Boolean
  
  type BoxedBoolean = scala.Boolean
  
  type BytesScannedCutoffValue = scala.Double
  
  type CatalogNameString = java.lang.String
  
  type ClientConfiguration = typings.awsSdk.serviceMod.ServiceConfigurationOptions with typings.awsSdk.athenaMod.ClientApiVersions
  
  type ColumnInfoList = js.Array[typings.awsSdk.athenaMod.ColumnInfo]
  
  type ColumnList = js.Array[typings.awsSdk.athenaMod.Column]
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.NOT_NULL
    - typings.awsSdk.awsSdkStrings.NULLABLE
    - typings.awsSdk.awsSdkStrings.UNKNOWN
    - java.lang.String
  */
  type ColumnNullable = typings.awsSdk.athenaMod._ColumnNullable | java.lang.String
  
  type CommentString = java.lang.String
  
  type DataCatalogSummaryList = js.Array[typings.awsSdk.athenaMod.DataCatalogSummary]
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.LAMBDA
    - typings.awsSdk.awsSdkStrings.GLUE
    - typings.awsSdk.awsSdkStrings.HIVE
    - java.lang.String
  */
  type DataCatalogType = typings.awsSdk.athenaMod._DataCatalogType | java.lang.String
  
  type DatabaseList = js.Array[typings.awsSdk.athenaMod.Database]
  
  type DatabaseString = java.lang.String
  
  type Date = typings.std.Date
  
  type DescriptionString = java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.SSE_S3
    - typings.awsSdk.awsSdkStrings.SSE_KMS
    - typings.awsSdk.awsSdkStrings.CSE_KMS
    - java.lang.String
  */
  type EncryptionOption = typings.awsSdk.athenaMod._EncryptionOption | java.lang.String
  
  type ErrorCode = java.lang.String
  
  type ErrorMessage = java.lang.String
  
  type ExpressionString = java.lang.String
  
  type IdempotencyToken = java.lang.String
  
  type Integer = scala.Double
  
  type KeyString = java.lang.String
  
  type Long = scala.Double
  
  type MaxDataCatalogsCount = scala.Double
  
  type MaxDatabasesCount = scala.Double
  
  type MaxNamedQueriesCount = scala.Double
  
  type MaxQueryExecutionsCount = scala.Double
  
  type MaxQueryResults = scala.Double
  
  type MaxTableMetadataCount = scala.Double
  
  type MaxTagsCount = scala.Double
  
  type MaxWorkGroupsCount = scala.Double
  
  type NameString = java.lang.String
  
  type NamedQueryId = java.lang.String
  
  type NamedQueryIdList = js.Array[typings.awsSdk.athenaMod.NamedQueryId]
  
  type NamedQueryList = js.Array[typings.awsSdk.athenaMod.NamedQuery]
  
  type ParametersMap = org.scalablytyped.runtime.StringDictionary[typings.awsSdk.athenaMod.ParametersMapValue]
  
  type ParametersMapValue = java.lang.String
  
  type QueryExecutionId = java.lang.String
  
  type QueryExecutionIdList = js.Array[typings.awsSdk.athenaMod.QueryExecutionId]
  
  type QueryExecutionList = js.Array[typings.awsSdk.athenaMod.QueryExecution]
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.QUEUED
    - typings.awsSdk.awsSdkStrings.RUNNING
    - typings.awsSdk.awsSdkStrings.SUCCEEDED
    - typings.awsSdk.awsSdkStrings.FAILED
    - typings.awsSdk.awsSdkStrings.CANCELLED
    - java.lang.String
  */
  type QueryExecutionState = typings.awsSdk.athenaMod._QueryExecutionState | java.lang.String
  
  type QueryString = java.lang.String
  
  type RowList = js.Array[typings.awsSdk.athenaMod.Row]
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.DDL
    - typings.awsSdk.awsSdkStrings.DML
    - typings.awsSdk.awsSdkStrings.UTILITY
    - java.lang.String
  */
  type StatementType = typings.awsSdk.athenaMod._StatementType | java.lang.String
  
  type String = java.lang.String
  
  type TableMetadataList = js.Array[typings.awsSdk.athenaMod.TableMetadata]
  
  type TableTypeString = java.lang.String
  
  type TagKey = java.lang.String
  
  type TagKeyList = js.Array[typings.awsSdk.athenaMod.TagKey]
  
  type TagList = js.Array[typings.awsSdk.athenaMod.Tag]
  
  type TagValue = java.lang.String
  
  type Timestamp = typings.std.Date
  
  type Token = java.lang.String
  
  type TypeString = java.lang.String
  
  type UnprocessedNamedQueryIdList = js.Array[typings.awsSdk.athenaMod.UnprocessedNamedQueryId]
  
  type UnprocessedQueryExecutionIdList = js.Array[typings.awsSdk.athenaMod.UnprocessedQueryExecutionId]
  
  type WorkGroupDescriptionString = java.lang.String
  
  type WorkGroupName = java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.ENABLED
    - typings.awsSdk.awsSdkStrings.DISABLED
    - java.lang.String
  */
  type WorkGroupState = typings.awsSdk.athenaMod._WorkGroupState | java.lang.String
  
  type WorkGroupsList = js.Array[typings.awsSdk.athenaMod.WorkGroupSummary]
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.`2017-05-18`
    - typings.awsSdk.awsSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = typings.awsSdk.athenaMod._apiVersion | java.lang.String
  
  type datumList = js.Array[typings.awsSdk.athenaMod.Datum]
  
  type datumString = java.lang.String
}
