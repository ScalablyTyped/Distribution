package typings.awsSdk.clientsRdsMod

import typings.awsSdk.awsSdkStrings.SECRETS
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type AccountQuotaList = js.Array[AccountQuota]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.sync_
  - typings.awsSdk.awsSdkStrings.async_
  - java.lang.String
*/
type ActivityStreamMode = _ActivityStreamMode | java.lang.String

type ActivityStreamModeList = js.Array[String]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.locked_
  - typings.awsSdk.awsSdkStrings.unlocked_
  - typings.awsSdk.awsSdkStrings.`locking-policy`
  - typings.awsSdk.awsSdkStrings.`unlocking-policy`
  - java.lang.String
*/
type ActivityStreamPolicyStatus = _ActivityStreamPolicyStatus | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.stopped__
  - typings.awsSdk.awsSdkStrings.starting__
  - typings.awsSdk.awsSdkStrings.started__
  - typings.awsSdk.awsSdkStrings.stopping__
  - java.lang.String
*/
type ActivityStreamStatus = _ActivityStreamStatus | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.immediate_
  - typings.awsSdk.awsSdkStrings.`pending-reboot`
  - java.lang.String
*/
type ApplyMethod = _ApplyMethod | java.lang.String

type AttributeValueList = js.Array[String]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.locked_
  - typings.awsSdk.awsSdkStrings.unlocked_
  - java.lang.String
*/
type AuditPolicyState = _AuditPolicyState | java.lang.String

type AuthScheme = SECRETS | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.full_
  - typings.awsSdk.awsSdkStrings.`all-paused`
  - java.lang.String
*/
type AutomationMode = _AutomationMode | java.lang.String

type AvailabilityZoneList = js.Array[AvailabilityZone]

type AvailabilityZones = js.Array[String]

type AvailableProcessorFeatureList = js.Array[AvailableProcessorFeature]

type AwsBackupRecoveryPointArn = java.lang.String

type Boolean = scala.Boolean

type BooleanOptional = scala.Boolean

type BucketName = java.lang.String

type CertificateList = js.Array[Certificate]

type CustomDBEngineVersionManifest = java.lang.String

type CustomEngineName = java.lang.String

type CustomEngineVersion = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.available__
  - typings.awsSdk.awsSdkStrings.inactive__
  - typings.awsSdk.awsSdkStrings.`inactive-except-restore`
  - java.lang.String
*/
type CustomEngineVersionStatus = _CustomEngineVersionStatus | java.lang.String

type DBClusterBacktrackList = js.Array[DBClusterBacktrack]

type DBClusterEndpointList = js.Array[DBClusterEndpoint]

type DBClusterIdentifier = java.lang.String

type DBClusterList = js.Array[DBCluster]

type DBClusterMemberList = js.Array[DBClusterMember]

type DBClusterOptionGroupMemberships = js.Array[DBClusterOptionGroupStatus]

type DBClusterParameterGroupList = js.Array[DBClusterParameterGroup]

type DBClusterRoles = js.Array[DBClusterRole]

type DBClusterSnapshotAttributeList = js.Array[DBClusterSnapshotAttribute]

type DBClusterSnapshotList = js.Array[DBClusterSnapshot]

type DBEngineVersionList = js.Array[DBEngineVersion]

type DBInstanceAutomatedBackupList = js.Array[DBInstanceAutomatedBackup]

type DBInstanceAutomatedBackupsReplicationList = js.Array[DBInstanceAutomatedBackupsReplication]

type DBInstanceList = js.Array[DBInstance]

type DBInstanceRoles = js.Array[DBInstanceRole]

type DBInstanceStatusInfoList = js.Array[DBInstanceStatusInfo]

type DBParameterGroupList = js.Array[DBParameterGroup]

type DBParameterGroupStatusList = js.Array[DBParameterGroupStatus]

type DBProxyEndpointList = js.Array[DBProxyEndpoint]

type DBProxyEndpointName = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.available__
  - typings.awsSdk.awsSdkStrings.modifying_
  - typings.awsSdk.awsSdkStrings.`incompatible-network`
  - typings.awsSdk.awsSdkStrings.`insufficient-resource-limits`
  - typings.awsSdk.awsSdkStrings.creating__
  - typings.awsSdk.awsSdkStrings.deleting__
  - java.lang.String
*/
type DBProxyEndpointStatus = _DBProxyEndpointStatus | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.READ_WRITE
  - typings.awsSdk.awsSdkStrings.READ_ONLY
  - java.lang.String
*/
type DBProxyEndpointTargetRole = _DBProxyEndpointTargetRole | java.lang.String

type DBProxyList = js.Array[DBProxy]

type DBProxyName = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.available__
  - typings.awsSdk.awsSdkStrings.modifying_
  - typings.awsSdk.awsSdkStrings.`incompatible-network`
  - typings.awsSdk.awsSdkStrings.`insufficient-resource-limits`
  - typings.awsSdk.awsSdkStrings.creating__
  - typings.awsSdk.awsSdkStrings.deleting__
  - typings.awsSdk.awsSdkStrings.suspended__
  - typings.awsSdk.awsSdkStrings.suspending_
  - typings.awsSdk.awsSdkStrings.reactivating
  - java.lang.String
*/
type DBProxyStatus = _DBProxyStatus | java.lang.String

type DBSecurityGroupMembershipList = js.Array[DBSecurityGroupMembership]

type DBSecurityGroupNameList = js.Array[String]

type DBSecurityGroups = js.Array[DBSecurityGroup]

type DBSnapshotAttributeList = js.Array[DBSnapshotAttribute]

type DBSnapshotList = js.Array[DBSnapshot]

type DBSubnetGroups = js.Array[DBSubnetGroup]

type DescribeDBLogFilesList = js.Array[DescribeDBLogFilesDetails]

type Description = java.lang.String

type DomainMembershipList = js.Array[DomainMembership]

type Double = scala.Double

type DoubleOptional = scala.Double

type DoubleRangeList = js.Array[DoubleRange]

type EC2SecurityGroupList = js.Array[EC2SecurityGroup]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.MYSQL
  - typings.awsSdk.awsSdkStrings.POSTGRESQL
  - typings.awsSdk.awsSdkStrings.SQLSERVER
  - java.lang.String
*/
type EngineFamily = _EngineFamily | java.lang.String

type EngineModeList = js.Array[String]

type EventCategoriesList = js.Array[String]

type EventCategoriesMapList = js.Array[EventCategoriesMap]

type EventList = js.Array[Event]

type EventSubscriptionsList = js.Array[EventSubscription]

type ExportTasksList = js.Array[ExportTask]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.pending__
  - typings.awsSdk.awsSdkStrings.`failing-over`
  - typings.awsSdk.awsSdkStrings.cancelling__
  - java.lang.String
*/
type FailoverStatus = _FailoverStatus | java.lang.String

type FeatureNameList = js.Array[String]

type FilterList = js.Array[Filter]

type FilterValueList = js.Array[String]

type GlobalClusterIdentifier = java.lang.String

type GlobalClusterList = js.Array[GlobalCluster]

type GlobalClusterMemberList = js.Array[GlobalClusterMember]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.DISABLED
  - typings.awsSdk.awsSdkStrings.REQUIRED
  - typings.awsSdk.awsSdkStrings.ENABLED
  - java.lang.String
*/
type IAMAuthMode = _IAMAuthMode | java.lang.String

type IPRangeList = js.Array[IPRange]

type Integer = scala.Double

type IntegerOptional = scala.Double

type KeyList = js.Array[String]

type KmsKeyIdOrArn = java.lang.String

type LogTypeList = js.Array[String]

type Long = scala.Double

type LongOptional = scala.Double

type MaxRecords = scala.Double

type MinimumEngineVersionPerAllowedValueList = js.Array[MinimumEngineVersionPerAllowedValue]

type OptionConfigurationList = js.Array[OptionConfiguration]

type OptionGroupMembershipList = js.Array[OptionGroupMembership]

type OptionGroupOptionSettingsList = js.Array[OptionGroupOptionSetting]

type OptionGroupOptionVersionsList = js.Array[OptionVersion]

type OptionGroupOptionsList = js.Array[OptionGroupOption]

type OptionGroupsList = js.Array[OptionGroup]

type OptionNamesList = js.Array[String]

type OptionSettingConfigurationList = js.Array[OptionSetting]

type OptionSettingsList = js.Array[OptionSetting]

type OptionsConflictsWith = js.Array[String]

type OptionsDependedOn = js.Array[String]

type OptionsList = js.Array[Option]

type OrderableDBInstanceOptionsList = js.Array[OrderableDBInstanceOption]

type ParametersList = js.Array[Parameter]

type PendingMaintenanceActionDetails = js.Array[PendingMaintenanceAction]

type PendingMaintenanceActions = js.Array[ResourcePendingMaintenanceActions]

type ProcessorFeatureList = js.Array[ProcessorFeature]

type RangeList = js.Array[Range]

type ReadReplicaDBClusterIdentifierList = js.Array[String]

type ReadReplicaDBInstanceIdentifierList = js.Array[String]

type ReadReplicaIdentifierList = js.Array[String]

type ReadersArnList = js.Array[String]

type RecurringChargeList = js.Array[RecurringCharge]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.`open-read-only`
  - typings.awsSdk.awsSdkStrings.mounted
  - java.lang.String
*/
type ReplicaMode = _ReplicaMode | java.lang.String

type ReservedDBInstanceList = js.Array[ReservedDBInstance]

type ReservedDBInstancesOfferingList = js.Array[ReservedDBInstancesOffering]

type SourceIdsList = js.Array[String]

type SourceRegionList = js.Array[SourceRegion]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.`db-instance`
  - typings.awsSdk.awsSdkStrings.`db-parameter-group`
  - typings.awsSdk.awsSdkStrings.`db-security-group`
  - typings.awsSdk.awsSdkStrings.`db-snapshot`
  - typings.awsSdk.awsSdkStrings.`db-cluster`
  - typings.awsSdk.awsSdkStrings.`db-cluster-snapshot`
  - typings.awsSdk.awsSdkStrings.`custom-engine-version`
  - typings.awsSdk.awsSdkStrings.`db-proxy`
  - java.lang.String
*/
type SourceType = _SourceType | java.lang.String

type String = java.lang.String

type String255 = java.lang.String

type StringList = js.Array[String]

type SubnetIdentifierList = js.Array[String]

type SubnetList = js.Array[Subnet]

type SupportedCharacterSetsList = js.Array[CharacterSet]

type SupportedTimezonesList = js.Array[Timezone]

type TStamp = js.Date

type TagList = js.Array[Tag]

type TargetGroupList = js.Array[DBProxyTargetGroup]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.UNREACHABLE
  - typings.awsSdk.awsSdkStrings.CONNECTION_FAILED
  - typings.awsSdk.awsSdkStrings.AUTH_FAILURE
  - typings.awsSdk.awsSdkStrings.PENDING_PROXY_CAPACITY
  - typings.awsSdk.awsSdkStrings.INVALID_REPLICATION_STATE
  - java.lang.String
*/
type TargetHealthReason = _TargetHealthReason | java.lang.String

type TargetList = js.Array[DBProxyTarget]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.READ_WRITE
  - typings.awsSdk.awsSdkStrings.READ_ONLY
  - typings.awsSdk.awsSdkStrings.UNKNOWN
  - java.lang.String
*/
type TargetRole = _TargetRole | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.REGISTERING
  - typings.awsSdk.awsSdkStrings.AVAILABLE
  - typings.awsSdk.awsSdkStrings.UNAVAILABLE
  - java.lang.String
*/
type TargetState = _TargetState | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.RDS_INSTANCE
  - typings.awsSdk.awsSdkStrings.RDS_SERVERLESS_ENDPOINT
  - typings.awsSdk.awsSdkStrings.TRACKED_CLUSTER
  - java.lang.String
*/
type TargetType = _TargetType | java.lang.String

type UserAuthConfigInfoList = js.Array[UserAuthConfigInfo]

type UserAuthConfigList = js.Array[UserAuthConfig]

type ValidStorageOptionsList = js.Array[ValidStorageOptions]

type ValidUpgradeTargetList = js.Array[UpgradeTarget]

type VpcSecurityGroupIdList = js.Array[String]

type VpcSecurityGroupMembershipList = js.Array[VpcSecurityGroupMembership]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.enabled__
  - typings.awsSdk.awsSdkStrings.disabled__
  - typings.awsSdk.awsSdkStrings.enabling__
  - typings.awsSdk.awsSdkStrings.disabling_
  - typings.awsSdk.awsSdkStrings.unknown__
  - java.lang.String
*/
type WriteForwardingStatus = _WriteForwardingStatus | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.`2013-01-10`
  - typings.awsSdk.awsSdkStrings.`2013-02-12`
  - typings.awsSdk.awsSdkStrings.`2013-09-09`
  - typings.awsSdk.awsSdkStrings.`2014-09-01`
  - typings.awsSdk.awsSdkStrings.`2014-10-31`
  - typings.awsSdk.awsSdkStrings.latest_
  - java.lang.String
*/
type apiVersion = _apiVersion | java.lang.String
