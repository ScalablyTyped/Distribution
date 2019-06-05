package typings
package awsDashSdkLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object clientsElasticacheMod {
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.`single-az`
    - awsDashSdkLib.awsDashSdkLibStrings.`cross-az`
    - java.lang.String
  */
  type AZMode = _AZMode | java.lang.String
  type AllowedNodeGroupId = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.enabled
    - awsDashSdkLib.awsDashSdkLibStrings.disabled
    - awsDashSdkLib.awsDashSdkLibStrings.enabling
    - awsDashSdkLib.awsDashSdkLibStrings.disabling
    - java.lang.String
  */
  type AutomaticFailoverStatus = _AutomaticFailoverStatus | java.lang.String
  type AvailabilityZonesList = js.Array[String]
  type Boolean = scala.Boolean
  type BooleanOptional = scala.Boolean
  type CacheClusterList = js.Array[CacheCluster]
  type CacheEngineVersionList = js.Array[CacheEngineVersion]
  type CacheNodeIdsList = js.Array[String]
  type CacheNodeList = js.Array[CacheNode]
  type CacheNodeTypeSpecificParametersList = js.Array[CacheNodeTypeSpecificParameter]
  type CacheNodeTypeSpecificValueList = js.Array[CacheNodeTypeSpecificValue]
  type CacheParameterGroupList = js.Array[CacheParameterGroup]
  type CacheSecurityGroupMembershipList = js.Array[CacheSecurityGroupMembership]
  type CacheSecurityGroupNameList = js.Array[String]
  type CacheSecurityGroups = js.Array[CacheSecurityGroup]
  type CacheSubnetGroups = js.Array[CacheSubnetGroup]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.immediate
    - awsDashSdkLib.awsDashSdkLibStrings.`requires-reboot`
    - java.lang.String
  */
  type ChangeType = _ChangeType | java.lang.String
  type ClientConfiguration = awsDashSdkLib.libServiceMod.ServiceConfigurationOptions with ClientApiVersions
  type ClusterIdList = js.Array[String]
  type Double = scala.Double
  type EC2SecurityGroupList = js.Array[EC2SecurityGroup]
  type EventList = js.Array[Event]
  type Integer = scala.Double
  type IntegerOptional = scala.Double
  type KeyList = js.Array[String]
  type NodeGroupConfigurationList = js.Array[NodeGroupConfiguration]
  type NodeGroupList = js.Array[NodeGroup]
  type NodeGroupMemberList = js.Array[NodeGroupMember]
  type NodeGroupMemberUpdateStatusList = js.Array[NodeGroupMemberUpdateStatus]
  type NodeGroupUpdateStatusList = js.Array[NodeGroupUpdateStatus]
  type NodeGroupsToRemoveList = js.Array[AllowedNodeGroupId]
  type NodeGroupsToRetainList = js.Array[AllowedNodeGroupId]
  type NodeSnapshotList = js.Array[NodeSnapshot]
  type NodeTypeList = js.Array[String]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.system
    - awsDashSdkLib.awsDashSdkLibStrings.customer
    - java.lang.String
  */
  type NodeUpdateInitiatedBy = _NodeUpdateInitiatedBy | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.`not-applied`
    - awsDashSdkLib.awsDashSdkLibStrings.`waiting-to-start`
    - awsDashSdkLib.awsDashSdkLibStrings.`in-progress`
    - awsDashSdkLib.awsDashSdkLibStrings.stopping
    - awsDashSdkLib.awsDashSdkLibStrings.stopped
    - awsDashSdkLib.awsDashSdkLibStrings.complete
    - java.lang.String
  */
  type NodeUpdateStatus = _NodeUpdateStatus | java.lang.String
  type ParameterNameValueList = js.Array[ParameterNameValue]
  type ParametersList = js.Array[Parameter]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.enabled
    - awsDashSdkLib.awsDashSdkLibStrings.disabled
    - java.lang.String
  */
  type PendingAutomaticFailoverStatus = _PendingAutomaticFailoverStatus | java.lang.String
  type PreferredAvailabilityZoneList = js.Array[String]
  type ProcessedUpdateActionList = js.Array[ProcessedUpdateAction]
  type RecurringChargeList = js.Array[RecurringCharge]
  type RemoveReplicasList = js.Array[String]
  type ReplicaConfigurationList = js.Array[ConfigureShard]
  type ReplicationGroupIdList = js.Array[String]
  type ReplicationGroupList = js.Array[ReplicationGroup]
  type ReservedCacheNodeList = js.Array[ReservedCacheNode]
  type ReservedCacheNodesOfferingList = js.Array[ReservedCacheNodesOffering]
  type ReshardingConfigurationList = js.Array[ReshardingConfiguration]
  type SecurityGroupIdsList = js.Array[String]
  type SecurityGroupMembershipList = js.Array[SecurityGroupMembership]
  type ServiceUpdateList = js.Array[ServiceUpdate]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.critical
    - awsDashSdkLib.awsDashSdkLibStrings.important
    - awsDashSdkLib.awsDashSdkLibStrings.medium
    - awsDashSdkLib.awsDashSdkLibStrings.low
    - java.lang.String
  */
  type ServiceUpdateSeverity = _ServiceUpdateSeverity | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.available
    - awsDashSdkLib.awsDashSdkLibStrings.cancelled
    - awsDashSdkLib.awsDashSdkLibStrings.expired
    - java.lang.String
  */
  type ServiceUpdateStatus = _ServiceUpdateStatus | java.lang.String
  type ServiceUpdateStatusList = js.Array[ServiceUpdateStatus]
  type ServiceUpdateType = awsDashSdkLib.awsDashSdkLibStrings.`security-update` | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.yes
    - awsDashSdkLib.awsDashSdkLibStrings.no
    - awsDashSdkLib.awsDashSdkLibStrings.`n/a`
    - java.lang.String
  */
  type SlaMet = _SlaMet | java.lang.String
  type SnapshotArnsList = js.Array[String]
  type SnapshotList = js.Array[Snapshot]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.`cache-cluster`
    - awsDashSdkLib.awsDashSdkLibStrings.`cache-parameter-group`
    - awsDashSdkLib.awsDashSdkLibStrings.`cache-security-group`
    - awsDashSdkLib.awsDashSdkLibStrings.`cache-subnet-group`
    - awsDashSdkLib.awsDashSdkLibStrings.`replication-group`
    - java.lang.String
  */
  type SourceType = _SourceType | java.lang.String
  type String = java.lang.String
  type SubnetIdentifierList = js.Array[String]
  type SubnetList = js.Array[Subnet]
  type TStamp = stdLib.Date
  type TagList = js.Array[Tag]
  type UnprocessedUpdateActionList = js.Array[UnprocessedUpdateAction]
  type UpdateActionList = js.Array[UpdateAction]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.`not-applied`
    - awsDashSdkLib.awsDashSdkLibStrings.`waiting-to-start`
    - awsDashSdkLib.awsDashSdkLibStrings.`in-progress`
    - awsDashSdkLib.awsDashSdkLibStrings.stopping
    - awsDashSdkLib.awsDashSdkLibStrings.stopped
    - awsDashSdkLib.awsDashSdkLibStrings.complete
    - java.lang.String
  */
  type UpdateActionStatus = _UpdateActionStatus | java.lang.String
  type UpdateActionStatusList = js.Array[UpdateActionStatus]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.`2012-11-15`
    - awsDashSdkLib.awsDashSdkLibStrings.`2014-03-24`
    - awsDashSdkLib.awsDashSdkLibStrings.`2014-07-15`
    - awsDashSdkLib.awsDashSdkLibStrings.`2014-09-30`
    - awsDashSdkLib.awsDashSdkLibStrings.`2015-02-02`
    - awsDashSdkLib.awsDashSdkLibStrings.latest
    - java.lang.String
  */
  type apiVersion = _apiVersion | java.lang.String
}
