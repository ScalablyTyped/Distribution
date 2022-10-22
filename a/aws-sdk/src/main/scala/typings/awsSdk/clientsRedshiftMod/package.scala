package typings.awsSdk.clientsRedshiftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type AccountsWithRestoreAccessList = js.Array[AccountWithRestoreAccess]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.`restore-cluster`
  - typings.awsSdk.awsSdkStrings.`recommend-node-config`
  - typings.awsSdk.awsSdkStrings.`resize-cluster`
  - java.lang.String
*/
type ActionType = _ActionType | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.enabled__
  - typings.awsSdk.awsSdkStrings.disabled__
  - typings.awsSdk.awsSdkStrings.auto__
  - java.lang.String
*/
type AquaConfigurationStatus = _AquaConfigurationStatus | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.enabled__
  - typings.awsSdk.awsSdkStrings.disabled__
  - typings.awsSdk.awsSdkStrings.applying_
  - java.lang.String
*/
type AquaStatus = _AquaStatus | java.lang.String

type AssociatedClusterList = js.Array[ClusterAssociatedToSchedule]

type AttributeList = js.Array[AccountAttribute]

type AttributeNameList = js.Array[String]

type AttributeValueList = js.Array[AttributeValueTarget]

type AuthenticationProfileList = js.Array[AuthenticationProfile]

type AuthenticationProfileNameString = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.Authorized_
  - typings.awsSdk.awsSdkStrings.Revoking
  - java.lang.String
*/
type AuthorizationStatus = _AuthorizationStatus | java.lang.String

type AvailabilityZoneList = js.Array[AvailabilityZone]

type BatchSnapshotOperationErrorList = js.Array[SnapshotErrorMessage]

type BatchSnapshotOperationErrors = js.Array[SnapshotErrorMessage]

type Boolean = scala.Boolean

type BooleanOptional = scala.Boolean

type ClusterDbRevisionsList = js.Array[ClusterDbRevision]

type ClusterIamRoleList = js.Array[ClusterIamRole]

type ClusterList = js.Array[Cluster]

type ClusterNodesList = js.Array[ClusterNode]

type ClusterParameterGroupStatusList = js.Array[ClusterParameterGroupStatus]

type ClusterParameterStatusList = js.Array[ClusterParameterStatus]

type ClusterSecurityGroupMembershipList = js.Array[ClusterSecurityGroupMembership]

type ClusterSecurityGroupNameList = js.Array[String]

type ClusterSecurityGroups = js.Array[ClusterSecurityGroup]

type ClusterSubnetGroups = js.Array[ClusterSubnetGroup]

type ClusterVersionList = js.Array[ClusterVersion]

type DataShareAssociationList = js.Array[DataShareAssociation]

type DataShareList = js.Array[DataShare]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.ACTIVE
  - typings.awsSdk.awsSdkStrings.PENDING_AUTHORIZATION
  - typings.awsSdk.awsSdkStrings.AUTHORIZED
  - typings.awsSdk.awsSdkStrings.DEAUTHORIZED
  - typings.awsSdk.awsSdkStrings.REJECTED
  - typings.awsSdk.awsSdkStrings.AVAILABLE
  - java.lang.String
*/
type DataShareStatus = _DataShareStatus | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.ACTIVE
  - typings.awsSdk.awsSdkStrings.AVAILABLE
  - java.lang.String
*/
type DataShareStatusForConsumer = _DataShareStatusForConsumer | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.ACTIVE
  - typings.awsSdk.awsSdkStrings.AUTHORIZED
  - typings.awsSdk.awsSdkStrings.PENDING_AUTHORIZATION
  - typings.awsSdk.awsSdkStrings.DEAUTHORIZED
  - typings.awsSdk.awsSdkStrings.REJECTED
  - java.lang.String
*/
type DataShareStatusForProducer = _DataShareStatusForProducer | java.lang.String

type DbGroupList = js.Array[String]

type DeferredMaintenanceWindowsList = js.Array[DeferredMaintenanceWindow]

type DeleteClusterSnapshotMessageList = js.Array[DeleteClusterSnapshotMessage]

type Double = scala.Double

type DoubleOptional = scala.Double

type EC2SecurityGroupList = js.Array[EC2SecurityGroup]

type EligibleTracksToUpdateList = js.Array[UpdateTarget]

type EndpointAccesses = js.Array[EndpointAccess]

type EndpointAuthorizations = js.Array[EndpointAuthorization]

type EventCategoriesList = js.Array[String]

type EventCategoriesMapList = js.Array[EventCategoriesMap]

type EventInfoMapList = js.Array[EventInfoMap]

type EventList = js.Array[Event]

type EventSubscriptionsList = js.Array[EventSubscription]

type HsmClientCertificateList = js.Array[HsmClientCertificate]

type HsmConfigurationList = js.Array[HsmConfiguration]

type IPRangeList = js.Array[IPRange]

type IamRoleArnList = js.Array[String]

type ImportTablesCompleted = js.Array[String]

type ImportTablesInProgress = js.Array[String]

type ImportTablesNotStarted = js.Array[String]

type Integer = scala.Double

type IntegerOptional = scala.Double

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.s3_
  - typings.awsSdk.awsSdkStrings.cloudwatch__
  - java.lang.String
*/
type LogDestinationType = _LogDestinationType | java.lang.String

type LogTypeList = js.Array[String]

type Long = scala.Double

type LongOptional = scala.Double

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.standard__
  - typings.awsSdk.awsSdkStrings.`high-performance`
  - java.lang.String
*/
type Mode = _Mode | java.lang.String

type NetworkInterfaceList = js.Array[NetworkInterface]

type NodeConfigurationOptionList = js.Array[NodeConfigurationOption]

type NodeConfigurationOptionsFilterList = js.Array[NodeConfigurationOptionsFilter]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.NodeType
  - typings.awsSdk.awsSdkStrings.NumberOfNodes
  - typings.awsSdk.awsSdkStrings.EstimatedDiskUtilizationPercent
  - typings.awsSdk.awsSdkStrings.Mode
  - java.lang.String
*/
type NodeConfigurationOptionsFilterName = _NodeConfigurationOptionsFilterName | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.eq__
  - typings.awsSdk.awsSdkStrings.lt_
  - typings.awsSdk.awsSdkStrings.gt_
  - typings.awsSdk.awsSdkStrings.le_
  - typings.awsSdk.awsSdkStrings.ge_
  - typings.awsSdk.awsSdkStrings.in__
  - typings.awsSdk.awsSdkStrings.between_
  - java.lang.String
*/
type OperatorType = _OperatorType | java.lang.String

type OrderableClusterOptionsList = js.Array[OrderableClusterOption]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.static__
  - typings.awsSdk.awsSdkStrings.dynamic__
  - java.lang.String
*/
type ParameterApplyType = _ParameterApplyType | java.lang.String

type ParameterGroupList = js.Array[ClusterParameterGroup]

type ParametersList = js.Array[Parameter]

type PartnerIntegrationAccountId = java.lang.String

type PartnerIntegrationClusterIdentifier = java.lang.String

type PartnerIntegrationDatabaseName = java.lang.String

type PartnerIntegrationInfoList = js.Array[PartnerIntegrationInfo]

type PartnerIntegrationPartnerName = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.Active_
  - typings.awsSdk.awsSdkStrings.Inactive_
  - typings.awsSdk.awsSdkStrings.RuntimeFailure
  - typings.awsSdk.awsSdkStrings.ConnectionFailure
  - java.lang.String
*/
type PartnerIntegrationStatus = _PartnerIntegrationStatus | java.lang.String

type PartnerIntegrationStatusMessage = java.lang.String

type PendingActionsList = js.Array[String]

type RecurringChargeList = js.Array[RecurringCharge]

type ReservedNodeConfigurationOptionList = js.Array[ReservedNodeConfigurationOption]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.`restore-cluster`
  - typings.awsSdk.awsSdkStrings.`resize-cluster`
  - java.lang.String
*/
type ReservedNodeExchangeActionType = _ReservedNodeExchangeActionType | java.lang.String

type ReservedNodeExchangeStatusList = js.Array[ReservedNodeExchangeStatus]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.REQUESTED
  - typings.awsSdk.awsSdkStrings.PENDING
  - typings.awsSdk.awsSdkStrings.IN_PROGRESS
  - typings.awsSdk.awsSdkStrings.RETRYING
  - typings.awsSdk.awsSdkStrings.SUCCEEDED
  - typings.awsSdk.awsSdkStrings.FAILED
  - java.lang.String
*/
type ReservedNodeExchangeStatusType = _ReservedNodeExchangeStatusType | java.lang.String

type ReservedNodeList = js.Array[ReservedNode]

type ReservedNodeOfferingList = js.Array[ReservedNodeOffering]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.Regular_
  - typings.awsSdk.awsSdkStrings.Upgradable
  - java.lang.String
*/
type ReservedNodeOfferingType = _ReservedNodeOfferingType | java.lang.String

type RestorableNodeTypeList = js.Array[String]

type RevisionTargetsList = js.Array[RevisionTarget]

type ScheduleDefinitionList = js.Array[String]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.MODIFYING
  - typings.awsSdk.awsSdkStrings.ACTIVE
  - typings.awsSdk.awsSdkStrings.FAILED
  - java.lang.String
*/
type ScheduleState = _ScheduleState | java.lang.String

type ScheduledActionFilterList = js.Array[ScheduledActionFilter]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.`cluster-identifier`
  - typings.awsSdk.awsSdkStrings.`iam-role`
  - java.lang.String
*/
type ScheduledActionFilterName = _ScheduledActionFilterName | java.lang.String

type ScheduledActionList = js.Array[ScheduledAction]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.ACTIVE
  - typings.awsSdk.awsSdkStrings.DISABLED
  - java.lang.String
*/
type ScheduledActionState = _ScheduledActionState | java.lang.String

type ScheduledActionTimeList = js.Array[js.Date]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.ResizeCluster
  - typings.awsSdk.awsSdkStrings.PauseCluster
  - typings.awsSdk.awsSdkStrings.ResumeCluster
  - java.lang.String
*/
type ScheduledActionTypeValues = _ScheduledActionTypeValues | java.lang.String

type ScheduledSnapshotTimeList = js.Array[js.Date]

type SensitiveString = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.SOURCE_TYPE
  - typings.awsSdk.awsSdkStrings.TOTAL_SIZE
  - typings.awsSdk.awsSdkStrings.CREATE_TIME
  - java.lang.String
*/
type SnapshotAttributeToSortBy = _SnapshotAttributeToSortBy | java.lang.String

type SnapshotCopyGrantList = js.Array[SnapshotCopyGrant]

type SnapshotIdentifierList = js.Array[String]

type SnapshotList = js.Array[Snapshot]

type SnapshotScheduleList = js.Array[SnapshotSchedule]

type SnapshotSortingEntityList = js.Array[SnapshotSortingEntity]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.ASC
  - typings.awsSdk.awsSdkStrings.DESC
  - java.lang.String
*/
type SortByOrder = _SortByOrder | java.lang.String

type SourceIdsList = js.Array[String]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.cluster_
  - typings.awsSdk.awsSdkStrings.`cluster-parameter-group`
  - typings.awsSdk.awsSdkStrings.`cluster-security-group`
  - typings.awsSdk.awsSdkStrings.`cluster-snapshot`
  - typings.awsSdk.awsSdkStrings.`scheduled-action`
  - java.lang.String
*/
type SourceType = _SourceType | java.lang.String

type String = java.lang.String

type SubnetIdentifierList = js.Array[String]

type SubnetList = js.Array[Subnet]

type SupportedOperationList = js.Array[SupportedOperation]

type SupportedPlatformsList = js.Array[SupportedPlatform]

type TStamp = js.Date

type TableRestoreStatusList = js.Array[TableRestoreStatus]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.PENDING
  - typings.awsSdk.awsSdkStrings.IN_PROGRESS
  - typings.awsSdk.awsSdkStrings.SUCCEEDED
  - typings.awsSdk.awsSdkStrings.FAILED
  - typings.awsSdk.awsSdkStrings.CANCELED
  - java.lang.String
*/
type TableRestoreStatusType = _TableRestoreStatusType | java.lang.String

type TagKeyList = js.Array[String]

type TagList = js.Array[Tag]

type TagValueList = js.Array[String]

type TaggedResourceList = js.Array[TaggedResource]

type TrackList = js.Array[MaintenanceTrack]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.log_
  - typings.awsSdk.awsSdkStrings.`emit-metric`
  - typings.awsSdk.awsSdkStrings.disable_
  - java.lang.String
*/
type UsageLimitBreachAction = _UsageLimitBreachAction | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.spectrum
  - typings.awsSdk.awsSdkStrings.`concurrency-scaling`
  - typings.awsSdk.awsSdkStrings.`cross-region-datasharing`
  - java.lang.String
*/
type UsageLimitFeatureType = _UsageLimitFeatureType | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.time_
  - typings.awsSdk.awsSdkStrings.`data-scanned`
  - java.lang.String
*/
type UsageLimitLimitType = _UsageLimitLimitType | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.daily__
  - typings.awsSdk.awsSdkStrings.weekly__
  - typings.awsSdk.awsSdkStrings.monthly__
  - java.lang.String
*/
type UsageLimitPeriod = _UsageLimitPeriod | java.lang.String

type UsageLimits = js.Array[UsageLimit]

type ValueStringList = js.Array[String]

type VpcEndpointsList = js.Array[VpcEndpoint]

type VpcIdentifierList = js.Array[String]

type VpcSecurityGroupIdList = js.Array[String]

type VpcSecurityGroupMembershipList = js.Array[VpcSecurityGroupMembership]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.`2012-12-01`
  - typings.awsSdk.awsSdkStrings.latest_
  - java.lang.String
*/
type apiVersion = _apiVersion | java.lang.String
