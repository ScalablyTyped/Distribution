package typings.awsSdk.clientsLakeformationMod

import org.scalablytyped.runtime.StringDictionary
import typings.node.bufferMod.global.Buffer
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type AccessKeyIdString = java.lang.String

type AuditContextString = java.lang.String

type AuthorizedSessionTagValueList = js.Array[NameString]

type BatchPermissionsFailureList = js.Array[BatchPermissionsFailureEntry]

type BatchPermissionsRequestEntryList = js.Array[BatchPermissionsRequestEntry]

type BooleanNullable = Boolean

type CatalogIdString = java.lang.String

type ColumnLFTagsList = js.Array[ColumnLFTag]

type ColumnNames = js.Array[NameString]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.EQ
  - typings.awsSdk.awsSdkStrings.NE
  - typings.awsSdk.awsSdkStrings.LE
  - typings.awsSdk.awsSdkStrings.LT
  - typings.awsSdk.awsSdkStrings.GE
  - typings.awsSdk.awsSdkStrings.GT
  - typings.awsSdk.awsSdkStrings.CONTAINS
  - typings.awsSdk.awsSdkStrings.NOT_CONTAINS
  - typings.awsSdk.awsSdkStrings.BEGINS_WITH
  - typings.awsSdk.awsSdkStrings.IN
  - typings.awsSdk.awsSdkStrings.BETWEEN
  - java.lang.String
*/
type ComparisonOperator = _ComparisonOperator | java.lang.String

type CredentialTimeoutDurationSecondInteger = Double

type DataCellsFilterList = js.Array[DataCellsFilter]

type DataLakePrincipalList = js.Array[DataLakePrincipal]

type DataLakePrincipalString = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.CATALOG
  - typings.awsSdk.awsSdkStrings.DATABASE
  - typings.awsSdk.awsSdkStrings.TABLE
  - typings.awsSdk.awsSdkStrings.DATA_LOCATION
  - typings.awsSdk.awsSdkStrings.LF_TAG
  - typings.awsSdk.awsSdkStrings.LF_TAG_POLICY
  - typings.awsSdk.awsSdkStrings.LF_TAG_POLICY_DATABASE
  - typings.awsSdk.awsSdkStrings.LF_TAG_POLICY_TABLE
  - java.lang.String
*/
type DataLakeResourceType = _DataLakeResourceType | java.lang.String

type DatabaseLFTagsList = js.Array[TaggedDatabase]

type DateTime = js.Date

type DescriptionString = java.lang.String

type ETagString = java.lang.String

type ErrorMessageString = java.lang.String

type ExpirationTimestamp = js.Date

type Expression = js.Array[LFTag]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.RESOURCE_ARN
  - typings.awsSdk.awsSdkStrings.ROLE_ARN
  - typings.awsSdk.awsSdkStrings.LAST_MODIFIED
  - java.lang.String
*/
type FieldNameString = _FieldNameString | java.lang.String

type FilterConditionList = js.Array[FilterCondition]

type GetQueryStateRequestQueryIdString = java.lang.String

type GetQueryStatisticsRequestQueryIdString = java.lang.String

type GetWorkUnitResultsRequestQueryIdString = java.lang.String

type GetWorkUnitResultsRequestWorkUnitIdLong = Double

type GetWorkUnitsRequestQueryIdString = java.lang.String

type IAMRoleArn = java.lang.String

type IAMSAMLProviderArn = java.lang.String

type Identifier = java.lang.String

type Integer = Double

type KeyString = java.lang.String

type LFTagErrors = js.Array[LFTagError]

type LFTagKey = java.lang.String

type LFTagValue = java.lang.String

type LFTagsList = js.Array[LFTagPair]

type LastModifiedTimestamp = js.Date

type MessageString = java.lang.String

type NameString = java.lang.String

type NullableBoolean = Boolean

type NumberOfBytes = Double

type NumberOfItems = Double

type NumberOfMilliseconds = Double

type ObjectSize = Double

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.COMPACTION
  - typings.awsSdk.awsSdkStrings.GARBAGE_COLLECTION
  - typings.awsSdk.awsSdkStrings.ALL
  - java.lang.String
*/
type OptimizerType = _OptimizerType | java.lang.String

type PageSize = Double

type ParametersMap = StringDictionary[ParametersMapValue]

type ParametersMapValue = java.lang.String

type PartitionValueString = java.lang.String

type PartitionValuesList = js.Array[PartitionValueString]

type PartitionedTableObjectsList = js.Array[PartitionObjects]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.ALL
  - typings.awsSdk.awsSdkStrings.SELECT
  - typings.awsSdk.awsSdkStrings.ALTER
  - typings.awsSdk.awsSdkStrings.DROP
  - typings.awsSdk.awsSdkStrings.DELETE
  - typings.awsSdk.awsSdkStrings.INSERT
  - typings.awsSdk.awsSdkStrings.DESCRIBE
  - typings.awsSdk.awsSdkStrings.CREATE_DATABASE
  - typings.awsSdk.awsSdkStrings.CREATE_TABLE
  - typings.awsSdk.awsSdkStrings.DATA_LOCATION_ACCESS
  - typings.awsSdk.awsSdkStrings.CREATE_TAG
  - typings.awsSdk.awsSdkStrings.ASSOCIATE
  - java.lang.String
*/
type Permission = _Permission | java.lang.String

type PermissionList = js.Array[Permission]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.COLUMN_PERMISSION
  - typings.awsSdk.awsSdkStrings.CELL_FILTER_PERMISSION
  - java.lang.String
*/
type PermissionType = _PermissionType | java.lang.String

type PermissionTypeList = js.Array[PermissionType]

type PredicateString = java.lang.String

type PrincipalPermissionsList = js.Array[PrincipalPermissions]

type PrincipalResourcePermissionsList = js.Array[PrincipalResourcePermissions]

type QueryIdString = java.lang.String

type QueryParameterMap = StringDictionary[String]

type QueryPlanningContextDatabaseNameString = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.PENDING
  - typings.awsSdk.awsSdkStrings.WORKUNITS_AVAILABLE
  - typings.awsSdk.awsSdkStrings.ERROR
  - typings.awsSdk.awsSdkStrings.FINISHED
  - typings.awsSdk.awsSdkStrings.EXPIRED
  - java.lang.String
*/
type QueryStateString = _QueryStateString | java.lang.String

type RAMResourceShareArn = java.lang.String

type ResourceArnString = java.lang.String

type ResourceInfoList = js.Array[ResourceInfo]

type ResourceShareList = js.Array[RAMResourceShareArn]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.FOREIGN
  - typings.awsSdk.awsSdkStrings.ALL
  - java.lang.String
*/
type ResourceShareType = _ResourceShareType | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.DATABASE
  - typings.awsSdk.awsSdkStrings.TABLE
  - java.lang.String
*/
type ResourceType = _ResourceType | java.lang.String

type Result = java.lang.String

type ResultStream = Buffer | js.typedarray.Uint8Array | Blob | java.lang.String | Readable

type SAMLAssertionString = java.lang.String

type SearchPageSize = Double

type SecretAccessKeyString = java.lang.String

type SessionTokenString = java.lang.String

type StorageOptimizerConfig = StringDictionary[StorageOptimizerConfigValue]

type StorageOptimizerConfigKey = java.lang.String

type StorageOptimizerConfigMap = StringDictionary[StorageOptimizerConfig]

type StorageOptimizerConfigValue = java.lang.String

type StorageOptimizerList = js.Array[StorageOptimizer]

type String = java.lang.String

type StringValue = java.lang.String

type StringValueList = js.Array[StringValue]

type SyntheticGetWorkUnitResultsRequestWorkUnitTokenString = java.lang.String

type SyntheticStartQueryPlanningRequestQueryString = java.lang.String

type TableLFTagsList = js.Array[TaggedTable]

type TableObjectList = js.Array[TableObject]

type TagValueList = js.Array[LFTagValue]

type Timestamp = js.Date

type Token = java.lang.String

type TokenString = java.lang.String

type TransactionDescriptionList = js.Array[TransactionDescription]

type TransactionIdString = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.ACTIVE
  - typings.awsSdk.awsSdkStrings.COMMITTED
  - typings.awsSdk.awsSdkStrings.ABORTED
  - typings.awsSdk.awsSdkStrings.COMMIT_IN_PROGRESS
  - java.lang.String
*/
type TransactionStatus = _TransactionStatus | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.ALL
  - typings.awsSdk.awsSdkStrings.COMPLETED
  - typings.awsSdk.awsSdkStrings.ACTIVE
  - typings.awsSdk.awsSdkStrings.COMMITTED
  - typings.awsSdk.awsSdkStrings.ABORTED
  - java.lang.String
*/
type TransactionStatusFilter = _TransactionStatusFilter | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.READ_AND_WRITE
  - typings.awsSdk.awsSdkStrings.READ_ONLY
  - java.lang.String
*/
type TransactionType = _TransactionType | java.lang.String

type TrueFalseString = java.lang.String

type TrustedResourceOwners = js.Array[CatalogIdString]

type URI = java.lang.String

type ValueString = java.lang.String

type ValueStringList = js.Array[ValueString]

type VirtualObjectList = js.Array[VirtualObject]

type WorkUnitIdLong = Double

type WorkUnitRangeList = js.Array[WorkUnitRange]

type WorkUnitTokenString = java.lang.String

type WriteOperationList = js.Array[WriteOperation]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.`2017-03-31`
  - typings.awsSdk.awsSdkStrings.latest_
  - java.lang.String
*/
type apiVersion = _apiVersion | java.lang.String
