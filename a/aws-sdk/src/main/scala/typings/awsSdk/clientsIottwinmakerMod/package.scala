package typings.awsSdk.clientsIottwinmakerMod

import org.scalablytyped.runtime.StringDictionary
import typings.awsSdk.awsSdkStrings.LINEAR
import typings.awsSdk.awsSdkStrings.MATTERPORT_ERROR
import typings.awsSdk.awsSdkStrings.TABULAR
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type Boolean = scala.Boolean

type BundleName = java.lang.String

type ColumnDescriptions = js.Array[ColumnDescription]

type ColumnName = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.NODE
  - typings.awsSdk.awsSdkStrings.EDGE
  - typings.awsSdk.awsSdkStrings.VALUE
  - java.lang.String
*/
type ColumnType = _ColumnType | java.lang.String

type ComponentPropertyGroupRequests = StringDictionary[ComponentPropertyGroupRequest]

type ComponentPropertyGroupResponses = StringDictionary[ComponentPropertyGroupResponse]

type ComponentTypeId = java.lang.String

type ComponentTypeName = java.lang.String

type ComponentTypeSummaries = js.Array[ComponentTypeSummary]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.CREATE
  - typings.awsSdk.awsSdkStrings.UPDATE
  - typings.awsSdk.awsSdkStrings.DELETE
  - java.lang.String
*/
type ComponentUpdateType = _ComponentUpdateType | java.lang.String

type ComponentUpdatesMapRequest = StringDictionary[ComponentUpdateRequest]

type ComponentsMap = StringDictionary[ComponentResponse]

type ComponentsMapRequest = StringDictionary[ComponentRequest]

type Configuration = StringDictionary[Value]

type DataValueList = js.Array[DataValue]

type DataValueMap = StringDictionary[DataValue]

type Description = java.lang.String

type Double = scala.Double

type EntityId = java.lang.String

type EntityName = java.lang.String

type EntitySummaries = js.Array[EntitySummary]

type Entries = js.Array[PropertyValueEntry]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.VALIDATION_ERROR
  - typings.awsSdk.awsSdkStrings.INTERNAL_FAILURE
  - typings.awsSdk.awsSdkStrings.SYNC_INITIALIZING_ERROR
  - typings.awsSdk.awsSdkStrings.SYNC_CREATING_ERROR
  - typings.awsSdk.awsSdkStrings.SYNC_PROCESSING_ERROR
  - java.lang.String
*/
type ErrorCode = _ErrorCode | java.lang.String

type ErrorEntries = js.Array[BatchPutPropertyErrorEntry]

type ErrorMessage = java.lang.String

type Errors = js.Array[BatchPutPropertyError]

type Expression = java.lang.String

type ExtendsFrom = js.Array[ComponentTypeId]

type ExternalIdProperty = StringDictionary[String]

type FunctionsRequest = StringDictionary[FunctionRequest]

type FunctionsResponse = StringDictionary[FunctionResponse]

type GeneratedSceneMetadataMap = StringDictionary[SceneMetadataValue]

type GroupType = TABULAR | java.lang.String

type Id = java.lang.String

type IdOrArn = java.lang.String

type Integer = scala.Double

type InterpolationType = LINEAR | java.lang.String

type IntervalInSeconds = scala.Double

type LambdaArn = java.lang.String

type ListComponentTypesFilters = js.Array[ListComponentTypesFilter]

type ListEntitiesFilters = js.Array[ListEntitiesFilter]

type Long = scala.Double

type MaxResults = scala.Double

type Name = java.lang.String

type NextToken = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.ASCENDING
  - typings.awsSdk.awsSdkStrings.DESCENDING
  - java.lang.String
*/
type Order = _Order | java.lang.String

type OrderByList = js.Array[OrderBy]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.ASCENDING
  - typings.awsSdk.awsSdkStrings.DESCENDING
  - java.lang.String
*/
type OrderByTime = _OrderByTime | java.lang.String

type ParentEntityId = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.UPDATE
  - typings.awsSdk.awsSdkStrings.DELETE
  - java.lang.String
*/
type ParentEntityUpdateType = _ParentEntityUpdateType | java.lang.String

type PricingBundles = js.Array[BundleName]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.BASIC
  - typings.awsSdk.awsSdkStrings.STANDARD
  - typings.awsSdk.awsSdkStrings.TIERED_BUNDLE
  - java.lang.String
*/
type PricingMode = _PricingMode | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.TIER_1
  - typings.awsSdk.awsSdkStrings.TIER_2
  - typings.awsSdk.awsSdkStrings.TIER_3
  - typings.awsSdk.awsSdkStrings.TIER_4
  - java.lang.String
*/
type PricingTier = _PricingTier | java.lang.String

type PropertyDefinitionsRequest = StringDictionary[PropertyDefinitionRequest]

type PropertyDefinitionsResponse = StringDictionary[PropertyDefinitionResponse]

type PropertyDisplayName = java.lang.String

type PropertyFilters = js.Array[PropertyFilter]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.UPDATE
  - typings.awsSdk.awsSdkStrings.DELETE
  - typings.awsSdk.awsSdkStrings.CREATE
  - java.lang.String
*/
type PropertyGroupUpdateType = _PropertyGroupUpdateType | java.lang.String

type PropertyGroupsRequest = StringDictionary[PropertyGroupRequest]

type PropertyGroupsResponse = StringDictionary[PropertyGroupResponse]

type PropertyLatestValueMap = StringDictionary[PropertyLatestValue]

type PropertyNames = js.Array[Name]

type PropertyRequests = StringDictionary[PropertyRequest]

type PropertyResponses = StringDictionary[PropertyResponse]

type PropertyTableValue = StringDictionary[DataValue]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.UPDATE
  - typings.awsSdk.awsSdkStrings.DELETE
  - typings.awsSdk.awsSdkStrings.CREATE
  - java.lang.String
*/
type PropertyUpdateType = _PropertyUpdateType | java.lang.String

type PropertyValueList = js.Array[PropertyValueHistory]

type PropertyValues = js.Array[PropertyValue]

type QueryServiceMaxResults = scala.Double

type QueryStatement = java.lang.String

type RequiredProperties = js.Array[Name]

type RoleArn = java.lang.String

type RowData = js.Array[QueryResultValue]

type Rows = js.Array[Row]

type S3Location = java.lang.String

type S3Url = java.lang.String

type SceneCapabilities = js.Array[SceneCapability]

type SceneCapability = java.lang.String

type SceneErrorCode = MATTERPORT_ERROR | java.lang.String

type SceneMetadataMap = StringDictionary[SceneMetadataValue]

type SceneMetadataValue = java.lang.String

type SceneSummaries = js.Array[SceneSummary]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.ENTITY
  - typings.awsSdk.awsSdkStrings.WORKSPACE
  - java.lang.String
*/
type Scope = _Scope | java.lang.String

type SelectedPropertyList = js.Array[String]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.CREATING
  - typings.awsSdk.awsSdkStrings.UPDATING
  - typings.awsSdk.awsSdkStrings.DELETING
  - typings.awsSdk.awsSdkStrings.ACTIVE
  - typings.awsSdk.awsSdkStrings.ERROR
  - java.lang.String
*/
type State = _State | java.lang.String

type String = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.CREATING
  - typings.awsSdk.awsSdkStrings.INITIALIZING
  - typings.awsSdk.awsSdkStrings.ACTIVE
  - typings.awsSdk.awsSdkStrings.DELETING
  - typings.awsSdk.awsSdkStrings.ERROR
  - java.lang.String
*/
type SyncJobState = _SyncJobState | java.lang.String

type SyncJobSummaries = js.Array[SyncJobSummary]

type SyncResourceFilters = js.Array[SyncResourceFilter]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.INITIALIZING
  - typings.awsSdk.awsSdkStrings.PROCESSING
  - typings.awsSdk.awsSdkStrings.DELETED
  - typings.awsSdk.awsSdkStrings.IN_SYNC
  - typings.awsSdk.awsSdkStrings.ERROR
  - java.lang.String
*/
type SyncResourceState = _SyncResourceState | java.lang.String

type SyncResourceSummaries = js.Array[SyncResourceSummary]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.ENTITY
  - typings.awsSdk.awsSdkStrings.COMPONENT_TYPE
  - java.lang.String
*/
type SyncResourceType = _SyncResourceType | java.lang.String

type SyncSource = java.lang.String

type TabularPropertyValue = js.Array[PropertyTableValue]

type TabularPropertyValues = js.Array[TabularPropertyValue]

type TagKey = java.lang.String

type TagKeyList = js.Array[TagKey]

type TagMap = StringDictionary[TagValue]

type TagValue = java.lang.String

type Time = java.lang.String

type Timestamp = js.Date

type TwinMakerArn = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.RELATIONSHIP
  - typings.awsSdk.awsSdkStrings.STRING
  - typings.awsSdk.awsSdkStrings.LONG
  - typings.awsSdk.awsSdkStrings.BOOLEAN
  - typings.awsSdk.awsSdkStrings.INTEGER
  - typings.awsSdk.awsSdkStrings.DOUBLE
  - typings.awsSdk.awsSdkStrings.LIST
  - typings.awsSdk.awsSdkStrings.MAP
  - java.lang.String
*/
type Type = _Type | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.DEFAULT
  - typings.awsSdk.awsSdkStrings.PRICING_TIER_UPDATE
  - typings.awsSdk.awsSdkStrings.ENTITY_COUNT_UPDATE
  - typings.awsSdk.awsSdkStrings.PRICING_MODE_UPDATE
  - typings.awsSdk.awsSdkStrings.OVERWRITTEN
  - java.lang.String
*/
type UpdateReason = _UpdateReason | java.lang.String

type Value = java.lang.String

type Values = js.Array[PropertyValue]

type WorkspaceSummaries = js.Array[WorkspaceSummary]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.`2021-11-29`
  - typings.awsSdk.awsSdkStrings.latest_
  - java.lang.String
*/
type apiVersion = _apiVersion | java.lang.String
