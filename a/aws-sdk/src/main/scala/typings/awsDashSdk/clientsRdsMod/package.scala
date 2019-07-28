package typings.awsDashSdk

import typings.awsDashSdk.libServiceMod.ServiceConfigurationOptions
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object clientsRdsMod {
  type AccountQuotaList = js.Array[AccountQuota]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.sync
    - typings.awsDashSdk.awsDashSdkStrings.async
    - java.lang.String
  */
  type ActivityStreamMode = _ActivityStreamMode | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.stopped
    - typings.awsDashSdk.awsDashSdkStrings.starting
    - typings.awsDashSdk.awsDashSdkStrings.started
    - typings.awsDashSdk.awsDashSdkStrings.stopping
    - java.lang.String
  */
  type ActivityStreamStatus = _ActivityStreamStatus | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.immediate
    - typings.awsDashSdk.awsDashSdkStrings.`pending-reboot`
    - java.lang.String
  */
  type ApplyMethod = _ApplyMethod | java.lang.String
  type AttributeValueList = js.Array[String]
  type AvailabilityZoneList = js.Array[AvailabilityZone]
  type AvailabilityZones = js.Array[String]
  type AvailableProcessorFeatureList = js.Array[AvailableProcessorFeature]
  type Boolean = scala.Boolean
  type BooleanOptional = scala.Boolean
  type CertificateList = js.Array[Certificate]
  type ClientConfiguration = ServiceConfigurationOptions with ClientApiVersions
  type DBClusterBacktrackList = js.Array[DBClusterBacktrack]
  type DBClusterEndpointList = js.Array[DBClusterEndpoint]
  type DBClusterList = js.Array[DBCluster]
  type DBClusterMemberList = js.Array[DBClusterMember]
  type DBClusterOptionGroupMemberships = js.Array[DBClusterOptionGroupStatus]
  type DBClusterParameterGroupList = js.Array[DBClusterParameterGroup]
  type DBClusterRoles = js.Array[DBClusterRole]
  type DBClusterSnapshotAttributeList = js.Array[DBClusterSnapshotAttribute]
  type DBClusterSnapshotList = js.Array[DBClusterSnapshot]
  type DBEngineVersionList = js.Array[DBEngineVersion]
  type DBInstanceAutomatedBackupList = js.Array[DBInstanceAutomatedBackup]
  type DBInstanceList = js.Array[DBInstance]
  type DBInstanceRoles = js.Array[DBInstanceRole]
  type DBInstanceStatusInfoList = js.Array[DBInstanceStatusInfo]
  type DBParameterGroupList = js.Array[DBParameterGroup]
  type DBParameterGroupStatusList = js.Array[DBParameterGroupStatus]
  type DBSecurityGroupMembershipList = js.Array[DBSecurityGroupMembership]
  type DBSecurityGroupNameList = js.Array[String]
  type DBSecurityGroups = js.Array[DBSecurityGroup]
  type DBSnapshotAttributeList = js.Array[DBSnapshotAttribute]
  type DBSnapshotList = js.Array[DBSnapshot]
  type DBSubnetGroups = js.Array[DBSubnetGroup]
  type DescribeDBLogFilesList = js.Array[DescribeDBLogFilesDetails]
  type DomainMembershipList = js.Array[DomainMembership]
  type Double = scala.Double
  type DoubleOptional = scala.Double
  type DoubleRangeList = js.Array[DoubleRange]
  type EC2SecurityGroupList = js.Array[EC2SecurityGroup]
  type EngineModeList = js.Array[String]
  type EventCategoriesList = js.Array[String]
  type EventCategoriesMapList = js.Array[EventCategoriesMap]
  type EventList = js.Array[Event]
  type EventSubscriptionsList = js.Array[EventSubscription]
  type FeatureNameList = js.Array[String]
  type FilterList = js.Array[Filter]
  type FilterValueList = js.Array[String]
  type GlobalClusterList = js.Array[GlobalCluster]
  type GlobalClusterMemberList = js.Array[GlobalClusterMember]
  type IPRangeList = js.Array[IPRange]
  type Integer = scala.Double
  type IntegerOptional = scala.Double
  type KeyList = js.Array[String]
  type LogTypeList = js.Array[String]
  type Long = scala.Double
  type LongOptional = scala.Double
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
  type ReservedDBInstanceList = js.Array[ReservedDBInstance]
  type ReservedDBInstancesOfferingList = js.Array[ReservedDBInstancesOffering]
  type SourceIdsList = js.Array[String]
  type SourceRegionList = js.Array[SourceRegion]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.`db-instance`
    - typings.awsDashSdk.awsDashSdkStrings.`db-parameter-group`
    - typings.awsDashSdk.awsDashSdkStrings.`db-security-group`
    - typings.awsDashSdk.awsDashSdkStrings.`db-snapshot`
    - typings.awsDashSdk.awsDashSdkStrings.`db-cluster`
    - typings.awsDashSdk.awsDashSdkStrings.`db-cluster-snapshot`
    - java.lang.String
  */
  type SourceType = _SourceType | java.lang.String
  type String = java.lang.String
  type StringList = js.Array[String]
  type SubnetIdentifierList = js.Array[String]
  type SubnetList = js.Array[Subnet]
  type SupportedCharacterSetsList = js.Array[CharacterSet]
  type SupportedTimezonesList = js.Array[Timezone]
  type TStamp = Date
  type TagList = js.Array[Tag]
  type ValidStorageOptionsList = js.Array[ValidStorageOptions]
  type ValidUpgradeTargetList = js.Array[UpgradeTarget]
  type VpcSecurityGroupIdList = js.Array[String]
  type VpcSecurityGroupMembershipList = js.Array[VpcSecurityGroupMembership]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.`2013-01-10`
    - typings.awsDashSdk.awsDashSdkStrings.`2013-02-12`
    - typings.awsDashSdk.awsDashSdkStrings.`2013-09-09`
    - typings.awsDashSdk.awsDashSdkStrings.`2014-09-01`
    - typings.awsDashSdk.awsDashSdkStrings.`2014-10-31`
    - typings.awsDashSdk.awsDashSdkStrings.latest
    - java.lang.String
  */
  type apiVersion = _apiVersion | java.lang.String
}
