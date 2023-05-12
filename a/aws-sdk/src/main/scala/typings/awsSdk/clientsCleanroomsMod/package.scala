package typings.awsSdk.clientsCleanroomsMod

import org.scalablytyped.runtime.StringDictionary
import typings.awsSdk.awsSdkStrings.CANCELLED
import typings.awsSdk.awsSdkStrings.COUNT_DISTINCT
import typings.awsSdk.awsSdkStrings.DIRECT_QUERY
import typings.awsSdk.awsSdkStrings.QUERY_RUNNER
import typings.awsSdk.awsSdkStrings.SQL
import typings.awsSdk.awsSdkStrings.TABLE
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type AccountId = java.lang.String

type AggregateColumnColumnNamesList = js.Array[AnalysisRuleColumnName]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.SUM
  - typings.awsSdk.awsSdkStrings.SUM_DISTINCT
  - typings.awsSdk.awsSdkStrings.COUNT
  - typings.awsSdk.awsSdkStrings.COUNT_DISTINCT
  - typings.awsSdk.awsSdkStrings.AVG
  - java.lang.String
*/
type AggregateFunctionName = _AggregateFunctionName | java.lang.String

type AggregationConstraintMinimumInteger = Double

type AggregationConstraints = js.Array[AggregationConstraint]

type AggregationType = COUNT_DISTINCT | java.lang.String

type AllowedColumnList = js.Array[ColumnName]

type AnalysisMethod = DIRECT_QUERY | java.lang.String

type AnalysisRuleAggregationAggregateColumnsList = js.Array[AggregateColumn]

type AnalysisRuleColumnList = js.Array[AnalysisRuleColumnName]

type AnalysisRuleColumnName = java.lang.String

type AnalysisRuleListJoinColumnsList = js.Array[AnalysisRuleColumnName]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.AGGREGATION
  - typings.awsSdk.awsSdkStrings.LIST
  - java.lang.String
*/
type AnalysisRuleType = _AnalysisRuleType | java.lang.String

type AnalysisRuleTypeList = js.Array[AnalysisRuleType]

type BatchGetSchemaErrorList = js.Array[BatchGetSchemaError]

type Boolean = scala.Boolean

type CleanroomsArn = java.lang.String

type CollaborationArn = java.lang.String

type CollaborationDescription = java.lang.String

type CollaborationIdentifier = java.lang.String

type CollaborationName = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.ENABLED
  - typings.awsSdk.awsSdkStrings.DISABLED
  - java.lang.String
*/
type CollaborationQueryLogStatus = _CollaborationQueryLogStatus | java.lang.String

type CollaborationSummaryList = js.Array[CollaborationSummary]

type ColumnList = js.Array[Column]

type ColumnName = java.lang.String

type ColumnTypeString = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.AGGREGATION
  - typings.awsSdk.awsSdkStrings.LIST
  - java.lang.String
*/
type ConfiguredTableAnalysisRuleType = _ConfiguredTableAnalysisRuleType | java.lang.String

type ConfiguredTableAnalysisRuleTypeList = js.Array[ConfiguredTableAnalysisRuleType]

type ConfiguredTableArn = java.lang.String

type ConfiguredTableAssociationArn = java.lang.String

type ConfiguredTableAssociationIdentifier = java.lang.String

type ConfiguredTableAssociationSummaryList = js.Array[ConfiguredTableAssociationSummary]

type ConfiguredTableIdentifier = java.lang.String

type ConfiguredTableSummaryList = js.Array[ConfiguredTableSummary]

type DisplayName = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.INVITED
  - typings.awsSdk.awsSdkStrings.ACTIVE
  - java.lang.String
*/
type FilterableMemberStatus = _FilterableMemberStatus | java.lang.String

type GlueResourceName = java.lang.String

type JoinRequiredOption = QUERY_RUNNER | java.lang.String

type KeyPrefix = java.lang.String

type Long = Double

type MaxResults = Double

type MemberAbilities = js.Array[MemberAbility]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.CAN_QUERY
  - typings.awsSdk.awsSdkStrings.CAN_RECEIVE_RESULTS
  - java.lang.String
*/
type MemberAbility = _MemberAbility | java.lang.String

type MemberList = js.Array[MemberSpecification]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.INVITED
  - typings.awsSdk.awsSdkStrings.ACTIVE
  - typings.awsSdk.awsSdkStrings.LEFT
  - typings.awsSdk.awsSdkStrings.REMOVED
  - java.lang.String
*/
type MemberStatus = _MemberStatus | java.lang.String

type MemberSummaryList = js.Array[MemberSummary]

type MembershipArn = java.lang.String

type MembershipIdentifier = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.ENABLED
  - typings.awsSdk.awsSdkStrings.DISABLED
  - java.lang.String
*/
type MembershipQueryLogStatus = _MembershipQueryLogStatus | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.ACTIVE
  - typings.awsSdk.awsSdkStrings.REMOVED
  - typings.awsSdk.awsSdkStrings.COLLABORATION_DELETED
  - java.lang.String
*/
type MembershipStatus = _MembershipStatus | java.lang.String

type MembershipSummaryList = js.Array[MembershipSummary]

type PaginationToken = java.lang.String

type ProtectedQueryIdentifier = java.lang.String

type ProtectedQueryS3OutputConfigurationBucketString = java.lang.String

type ProtectedQuerySQLParametersQueryStringString = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.SUBMITTED
  - typings.awsSdk.awsSdkStrings.STARTED
  - typings.awsSdk.awsSdkStrings.CANCELLED
  - typings.awsSdk.awsSdkStrings.CANCELLING
  - typings.awsSdk.awsSdkStrings.FAILED
  - typings.awsSdk.awsSdkStrings.SUCCESS
  - typings.awsSdk.awsSdkStrings.TIMED_OUT
  - java.lang.String
*/
type ProtectedQueryStatus = _ProtectedQueryStatus | java.lang.String

type ProtectedQuerySummaryList = js.Array[ProtectedQuerySummary]

type ProtectedQueryType = SQL | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.CSV
  - typings.awsSdk.awsSdkStrings.PARQUET
  - java.lang.String
*/
type ResultFormat = _ResultFormat | java.lang.String

type RoleArn = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.TRUNC
  - typings.awsSdk.awsSdkStrings.ABS
  - typings.awsSdk.awsSdkStrings.CEILING
  - typings.awsSdk.awsSdkStrings.FLOOR
  - typings.awsSdk.awsSdkStrings.LN
  - typings.awsSdk.awsSdkStrings.LOG
  - typings.awsSdk.awsSdkStrings.ROUND
  - typings.awsSdk.awsSdkStrings.SQRT
  - typings.awsSdk.awsSdkStrings.CAST
  - typings.awsSdk.awsSdkStrings.LOWER
  - typings.awsSdk.awsSdkStrings.RTRIM
  - typings.awsSdk.awsSdkStrings.UPPER
  - typings.awsSdk.awsSdkStrings.COALESCE
  - java.lang.String
*/
type ScalarFunctions = _ScalarFunctions | java.lang.String

type ScalarFunctionsList = js.Array[ScalarFunctions]

type SchemaList = js.Array[Schema]

type SchemaSummaryList = js.Array[SchemaSummary]

type SchemaType = TABLE | java.lang.String

type String = java.lang.String

type TableAlias = java.lang.String

type TableAliasList = js.Array[TableAlias]

type TableDescription = java.lang.String

type TagKey = java.lang.String

type TagKeys = js.Array[TagKey]

type TagMap = StringDictionary[TagValue]

type TagValue = java.lang.String

type TargetProtectedQueryStatus = CANCELLED | java.lang.String

type Timestamp = js.Date

type UUID = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.`2022-02-17`
  - typings.awsSdk.awsSdkStrings.latest_
  - java.lang.String
*/
type apiVersion = _apiVersion | java.lang.String
