package typings.awsSdk.clientsIotsitewiseMod

import org.scalablytyped.runtime.StringDictionary
import typings.awsSdk.awsSdkStrings.HIERARCHY
import typings.awsSdk.awsSdkStrings.INTERNAL_FAILURE
import typings.awsSdk.awsSdkStrings.PATH_TO_ROOT
import typings.awsSdk.awsSdkStrings.PNG
import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type ARN = java.lang.String

type AccessPolicySummaries = js.Array[AccessPolicySummary]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.AVERAGE
  - typings.awsSdk.awsSdkStrings.COUNT
  - typings.awsSdk.awsSdkStrings.MAXIMUM
  - typings.awsSdk.awsSdkStrings.MINIMUM
  - typings.awsSdk.awsSdkStrings.SUM
  - typings.awsSdk.awsSdkStrings.STANDARD_DEVIATION
  - java.lang.String
*/
type AggregateType = _AggregateType | java.lang.String

type AggregateTypes = js.Array[AggregateType]

type AggregatedDoubleValue = Double

type AggregatedValues = js.Array[AggregatedValue]

type AmazonResourceName = java.lang.String

type AssetCompositeModels = js.Array[AssetCompositeModel]

type AssetErrorCode = INTERNAL_FAILURE | java.lang.String

type AssetErrorMessage = java.lang.String

type AssetHierarchies = js.Array[AssetHierarchy]

type AssetIDs = js.Array[ID]

type AssetModelCompositeModelDefinitions = js.Array[AssetModelCompositeModelDefinition]

type AssetModelCompositeModels = js.Array[AssetModelCompositeModel]

type AssetModelHierarchies = js.Array[AssetModelHierarchy]

type AssetModelHierarchyDefinitions = js.Array[AssetModelHierarchyDefinition]

type AssetModelProperties = js.Array[AssetModelProperty]

type AssetModelPropertyDefinitions = js.Array[AssetModelPropertyDefinition]

type AssetModelPropertySummaries = js.Array[AssetModelPropertySummary]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.CREATING
  - typings.awsSdk.awsSdkStrings.ACTIVE
  - typings.awsSdk.awsSdkStrings.UPDATING
  - typings.awsSdk.awsSdkStrings.PROPAGATING
  - typings.awsSdk.awsSdkStrings.DELETING
  - typings.awsSdk.awsSdkStrings.FAILED
  - java.lang.String
*/
type AssetModelState = _AssetModelState | java.lang.String

type AssetModelSummaries = js.Array[AssetModelSummary]

type AssetProperties = js.Array[AssetProperty]

type AssetPropertyAlias = java.lang.String

type AssetPropertySummaries = js.Array[AssetPropertySummary]

type AssetPropertyValueHistory = js.Array[AssetPropertyValue]

type AssetPropertyValues = js.Array[AssetPropertyValue]

type AssetRelationshipSummaries = js.Array[AssetRelationshipSummary]

type AssetRelationshipType = HIERARCHY | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.CREATING
  - typings.awsSdk.awsSdkStrings.ACTIVE
  - typings.awsSdk.awsSdkStrings.UPDATING
  - typings.awsSdk.awsSdkStrings.DELETING
  - typings.awsSdk.awsSdkStrings.FAILED
  - java.lang.String
*/
type AssetState = _AssetState | java.lang.String

type AssetSummaries = js.Array[AssetSummary]

type AssociatedAssetsSummaries = js.Array[AssociatedAssetsSummary]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.IAM
  - typings.awsSdk.awsSdkStrings.SSO
  - java.lang.String
*/
type AuthMode = _AuthMode | java.lang.String

type BatchAssociateProjectAssetsErrors = js.Array[AssetErrorDetails]

type BatchDisassociateProjectAssetsErrors = js.Array[AssetErrorDetails]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.SUCCESS
  - typings.awsSdk.awsSdkStrings.ERROR
  - java.lang.String
*/
type BatchEntryCompletionStatus = _BatchEntryCompletionStatus | java.lang.String

type BatchGetAssetPropertyAggregatesEntries = js.Array[BatchGetAssetPropertyAggregatesEntry]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.ResourceNotFoundException
  - typings.awsSdk.awsSdkStrings.InvalidRequestException
  - typings.awsSdk.awsSdkStrings.AccessDeniedException
  - java.lang.String
*/
type BatchGetAssetPropertyAggregatesErrorCode = _BatchGetAssetPropertyAggregatesErrorCode | java.lang.String

type BatchGetAssetPropertyAggregatesErrorEntries = js.Array[BatchGetAssetPropertyAggregatesErrorEntry]

type BatchGetAssetPropertyAggregatesMaxResults = Double

type BatchGetAssetPropertyAggregatesSkippedEntries = js.Array[BatchGetAssetPropertyAggregatesSkippedEntry]

type BatchGetAssetPropertyAggregatesSuccessEntries = js.Array[BatchGetAssetPropertyAggregatesSuccessEntry]

type BatchGetAssetPropertyValueEntries = js.Array[BatchGetAssetPropertyValueEntry]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.ResourceNotFoundException
  - typings.awsSdk.awsSdkStrings.InvalidRequestException
  - typings.awsSdk.awsSdkStrings.AccessDeniedException
  - java.lang.String
*/
type BatchGetAssetPropertyValueErrorCode = _BatchGetAssetPropertyValueErrorCode | java.lang.String

type BatchGetAssetPropertyValueErrorEntries = js.Array[BatchGetAssetPropertyValueErrorEntry]

type BatchGetAssetPropertyValueHistoryEntries = js.Array[BatchGetAssetPropertyValueHistoryEntry]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.ResourceNotFoundException
  - typings.awsSdk.awsSdkStrings.InvalidRequestException
  - typings.awsSdk.awsSdkStrings.AccessDeniedException
  - java.lang.String
*/
type BatchGetAssetPropertyValueHistoryErrorCode = _BatchGetAssetPropertyValueHistoryErrorCode | java.lang.String

type BatchGetAssetPropertyValueHistoryErrorEntries = js.Array[BatchGetAssetPropertyValueHistoryErrorEntry]

type BatchGetAssetPropertyValueHistoryMaxResults = Double

type BatchGetAssetPropertyValueHistorySkippedEntries = js.Array[BatchGetAssetPropertyValueHistorySkippedEntry]

type BatchGetAssetPropertyValueHistorySuccessEntries = js.Array[BatchGetAssetPropertyValueHistorySuccessEntry]

type BatchGetAssetPropertyValueSkippedEntries = js.Array[BatchGetAssetPropertyValueSkippedEntry]

type BatchGetAssetPropertyValueSuccessEntries = js.Array[BatchGetAssetPropertyValueSuccessEntry]

type BatchPutAssetPropertyErrorEntries = js.Array[BatchPutAssetPropertyErrorEntry]

type BatchPutAssetPropertyErrors = js.Array[BatchPutAssetPropertyError]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.ResourceNotFoundException
  - typings.awsSdk.awsSdkStrings.InvalidRequestException
  - typings.awsSdk.awsSdkStrings.InternalFailureException
  - typings.awsSdk.awsSdkStrings.ServiceUnavailableException
  - typings.awsSdk.awsSdkStrings.ThrottlingException
  - typings.awsSdk.awsSdkStrings.LimitExceededException
  - typings.awsSdk.awsSdkStrings.ConflictingOperationException
  - typings.awsSdk.awsSdkStrings.TimestampOutOfRangeException
  - typings.awsSdk.awsSdkStrings.AccessDeniedException
  - java.lang.String
*/
type BatchPutAssetPropertyValueErrorCode = _BatchPutAssetPropertyValueErrorCode | java.lang.String

type Bucket = java.lang.String

type CapabilityConfiguration = java.lang.String

type CapabilityNamespace = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.IN_SYNC
  - typings.awsSdk.awsSdkStrings.OUT_OF_SYNC
  - typings.awsSdk.awsSdkStrings.SYNC_FAILED
  - typings.awsSdk.awsSdkStrings.UNKNOWN
  - java.lang.String
*/
type CapabilitySyncStatus = _CapabilitySyncStatus | java.lang.String

type ClientToken = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.ALIAS
  - typings.awsSdk.awsSdkStrings.ASSET_ID
  - typings.awsSdk.awsSdkStrings.PROPERTY_ID
  - typings.awsSdk.awsSdkStrings.DATA_TYPE
  - typings.awsSdk.awsSdkStrings.TIMESTAMP_SECONDS
  - typings.awsSdk.awsSdkStrings.TIMESTAMP_NANO_OFFSET
  - typings.awsSdk.awsSdkStrings.QUALITY
  - typings.awsSdk.awsSdkStrings.VALUE
  - java.lang.String
*/
type ColumnName = _ColumnName | java.lang.String

type ColumnNames = js.Array[ColumnName]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.EDGE
  - typings.awsSdk.awsSdkStrings.CLOUD
  - java.lang.String
*/
type ComputeLocation = _ComputeLocation | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.ACTIVE
  - typings.awsSdk.awsSdkStrings.UPDATE_IN_PROGRESS
  - typings.awsSdk.awsSdkStrings.UPDATE_FAILED
  - java.lang.String
*/
type ConfigurationState = _ConfigurationState | java.lang.String

type CoreDeviceThingName = java.lang.String

type DashboardDefinition = java.lang.String

type DashboardSummaries = js.Array[DashboardSummary]

type DefaultValue = java.lang.String

type Description = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.INCOMPATIBLE_COMPUTE_LOCATION
  - typings.awsSdk.awsSdkStrings.INCOMPATIBLE_FORWARDING_CONFIGURATION
  - java.lang.String
*/
type DetailedErrorCode = _DetailedErrorCode | java.lang.String

type DetailedErrorMessage = java.lang.String

type DetailedErrors = js.Array[DetailedError]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.ENABLED
  - typings.awsSdk.awsSdkStrings.DISABLED
  - java.lang.String
*/
type DisassociatedDataStorageState = _DisassociatedDataStorageState | java.lang.String

type Email = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.SITEWISE_DEFAULT_ENCRYPTION
  - typings.awsSdk.awsSdkStrings.KMS_BASED_ENCRYPTION
  - java.lang.String
*/
type EncryptionType = _EncryptionType | java.lang.String

type EntryId = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.VALIDATION_ERROR
  - typings.awsSdk.awsSdkStrings.INTERNAL_FAILURE
  - java.lang.String
*/
type ErrorCode = _ErrorCode | java.lang.String

type ErrorMessage = java.lang.String

type ExcludeProperties = Boolean

type Expression = java.lang.String

type ExpressionVariables = js.Array[ExpressionVariable]

type Files = js.Array[File]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.DISABLED
  - typings.awsSdk.awsSdkStrings.ENABLED
  - java.lang.String
*/
type ForwardingConfigState = _ForwardingConfigState | java.lang.String

type GatewayCapabilitySummaries = js.Array[GatewayCapabilitySummary]

type GatewaySummaries = js.Array[GatewaySummary]

type ID = java.lang.String

type IDs = js.Array[ID]

type IdentityId = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.USER
  - typings.awsSdk.awsSdkStrings.GROUP
  - typings.awsSdk.awsSdkStrings.IAM
  - java.lang.String
*/
type IdentityType = _IdentityType | java.lang.String

type ImageFileData = Buffer | js.typedarray.Uint8Array | Blob | java.lang.String

type ImageFileType = PNG | java.lang.String

type InterpolatedAssetPropertyValues = js.Array[InterpolatedAssetPropertyValue]

type InterpolationType = java.lang.String

type Interval = java.lang.String

type IntervalInSeconds = Double

type IntervalWindowInSeconds = Double

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.PENDING
  - typings.awsSdk.awsSdkStrings.CANCELLED
  - typings.awsSdk.awsSdkStrings.RUNNING
  - typings.awsSdk.awsSdkStrings.COMPLETED
  - typings.awsSdk.awsSdkStrings.FAILED
  - typings.awsSdk.awsSdkStrings.COMPLETED_WITH_FAILURES
  - java.lang.String
*/
type JobStatus = _JobStatus | java.lang.String

type JobSummaries = js.Array[JobSummary]

type KmsKeyId = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.ALL
  - typings.awsSdk.awsSdkStrings.BASE
  - java.lang.String
*/
type ListAssetModelPropertiesFilter = _ListAssetModelPropertiesFilter | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.ALL
  - typings.awsSdk.awsSdkStrings.BASE
  - java.lang.String
*/
type ListAssetPropertiesFilter = _ListAssetPropertiesFilter | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.ALL
  - typings.awsSdk.awsSdkStrings.TOP_LEVEL
  - java.lang.String
*/
type ListAssetsFilter = _ListAssetsFilter | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.ALL
  - typings.awsSdk.awsSdkStrings.PENDING
  - typings.awsSdk.awsSdkStrings.RUNNING
  - typings.awsSdk.awsSdkStrings.CANCELLED
  - typings.awsSdk.awsSdkStrings.FAILED
  - typings.awsSdk.awsSdkStrings.COMPLETED_WITH_FAILURES
  - typings.awsSdk.awsSdkStrings.COMPLETED
  - java.lang.String
*/
type ListBulkImportJobsFilter = _ListBulkImportJobsFilter | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.ASSOCIATED
  - typings.awsSdk.awsSdkStrings.DISASSOCIATED
  - java.lang.String
*/
type ListTimeSeriesType = _ListTimeSeriesType | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.ERROR
  - typings.awsSdk.awsSdkStrings.INFO
  - typings.awsSdk.awsSdkStrings.OFF
  - java.lang.String
*/
type LoggingLevel = _LoggingLevel | java.lang.String

type Macro = java.lang.String

type MaxInterpolatedResults = Double

type MaxResults = Double

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.INTERNAL_FAILURE
  - typings.awsSdk.awsSdkStrings.VALIDATION_ERROR
  - typings.awsSdk.awsSdkStrings.LIMIT_EXCEEDED
  - java.lang.String
*/
type MonitorErrorCode = _MonitorErrorCode | java.lang.String

type MonitorErrorMessage = java.lang.String

type Name = java.lang.String

type NextToken = java.lang.String

type NumberOfDays = Double

type Offset = java.lang.String

type OffsetInNanos = Double

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.ADMINISTRATOR
  - typings.awsSdk.awsSdkStrings.VIEWER
  - java.lang.String
*/
type Permission = _Permission | java.lang.String

type PortalClientId = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.CREATING
  - typings.awsSdk.awsSdkStrings.UPDATING
  - typings.awsSdk.awsSdkStrings.DELETING
  - typings.awsSdk.awsSdkStrings.ACTIVE
  - typings.awsSdk.awsSdkStrings.FAILED
  - java.lang.String
*/
type PortalState = _PortalState | java.lang.String

type PortalSummaries = js.Array[PortalSummary]

type ProjectSummaries = js.Array[ProjectSummary]

type PropertyAlias = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.STRING
  - typings.awsSdk.awsSdkStrings.INTEGER
  - typings.awsSdk.awsSdkStrings.DOUBLE
  - typings.awsSdk.awsSdkStrings.BOOLEAN
  - typings.awsSdk.awsSdkStrings.STRUCT
  - java.lang.String
*/
type PropertyDataType = _PropertyDataType | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.ENABLED
  - typings.awsSdk.awsSdkStrings.DISABLED
  - java.lang.String
*/
type PropertyNotificationState = _PropertyNotificationState | java.lang.String

type PropertyNotificationTopic = java.lang.String

type PropertyUnit = java.lang.String

type PropertyValueBooleanValue = Boolean

type PropertyValueDoubleValue = Double

type PropertyValueIntegerValue = Double

type PropertyValueStringValue = java.lang.String

type PutAssetPropertyValueEntries = js.Array[PutAssetPropertyValueEntry]

type Qualities = js.Array[Quality]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.GOOD
  - typings.awsSdk.awsSdkStrings.BAD
  - typings.awsSdk.awsSdkStrings.UNCERTAIN
  - java.lang.String
*/
type Quality = _Quality | java.lang.String

type Resolution = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.PORTAL
  - typings.awsSdk.awsSdkStrings.PROJECT
  - java.lang.String
*/
type ResourceType = _ResourceType | java.lang.String

type SSOApplicationId = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.SITEWISE_DEFAULT_STORAGE
  - typings.awsSdk.awsSdkStrings.MULTI_LAYER_STORAGE
  - java.lang.String
*/
type StorageType = _StorageType | java.lang.String

type String = java.lang.String

type TagKey = java.lang.String

type TagKeyList = js.Array[TagKey]

type TagMap = StringDictionary[TagValue]

type TagValue = java.lang.String

type TimeInSeconds = Double

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.ASCENDING
  - typings.awsSdk.awsSdkStrings.DESCENDING
  - java.lang.String
*/
type TimeOrdering = _TimeOrdering | java.lang.String

type TimeSeriesId = java.lang.String

type TimeSeriesSummaries = js.Array[TimeSeriesSummary]

type Timestamp = js.Date

type Timestamps = js.Array[TimeInNanos]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.PARENT
  - typings.awsSdk.awsSdkStrings.CHILD
  - java.lang.String
*/
type TraversalDirection = _TraversalDirection | java.lang.String

type TraversalType = PATH_TO_ROOT | java.lang.String

type Unlimited = Boolean

type Url = java.lang.String

type VariableName = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.`2019-12-02`
  - typings.awsSdk.awsSdkStrings.latest_
  - java.lang.String
*/
type apiVersion = _apiVersion | java.lang.String
