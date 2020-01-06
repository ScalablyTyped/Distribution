package typings.awsDashSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object clientsElasticacheMod {
  import typings.awsDashSdk.awsDashSdkStrings.`security-update`
  import typings.awsDashSdk.libServiceMod.ServiceConfigurationOptions
  import typings.std.Date

  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.`single-az`
    - typings.awsDashSdk.awsDashSdkStrings.`cross-az`
    - java.lang.String
  */
  type AZMode = _AZMode | java.lang.String
  type AllowedNodeGroupId = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.SETTING
    - typings.awsDashSdk.awsDashSdkStrings.ROTATING
    - java.lang.String
  */
  type AuthTokenUpdateStatus = _AuthTokenUpdateStatus | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.SET
    - typings.awsDashSdk.awsDashSdkStrings.ROTATE
    - java.lang.String
  */
  type AuthTokenUpdateStrategyType = _AuthTokenUpdateStrategyType | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.enabled__
    - typings.awsDashSdk.awsDashSdkStrings.disabled__
    - typings.awsDashSdk.awsDashSdkStrings.enabling__
    - typings.awsDashSdk.awsDashSdkStrings.disabling_
    - java.lang.String
  */
  type AutomaticFailoverStatus = _AutomaticFailoverStatus | java.lang.String
  type AvailabilityZonesList = js.Array[String]
  type Boolean = scala.Boolean
  type BooleanOptional = scala.Boolean
  type CacheClusterIdList = js.Array[String]
  type CacheClusterList = js.Array[CacheCluster]
  type CacheEngineVersionList = js.Array[CacheEngineVersion]
  type CacheNodeIdsList = js.Array[String]
  type CacheNodeList = js.Array[CacheNode]
  type CacheNodeTypeSpecificParametersList = js.Array[CacheNodeTypeSpecificParameter]
  type CacheNodeTypeSpecificValueList = js.Array[CacheNodeTypeSpecificValue]
  type CacheNodeUpdateStatusList = js.Array[CacheNodeUpdateStatus]
  type CacheParameterGroupList = js.Array[CacheParameterGroup]
  type CacheSecurityGroupMembershipList = js.Array[CacheSecurityGroupMembership]
  type CacheSecurityGroupNameList = js.Array[String]
  type CacheSecurityGroups = js.Array[CacheSecurityGroup]
  type CacheSubnetGroups = js.Array[CacheSubnetGroup]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.immediate_
    - typings.awsDashSdk.awsDashSdkStrings.`requires-reboot`
    - java.lang.String
  */
  type ChangeType = _ChangeType | java.lang.String
  type ClientConfiguration = ServiceConfigurationOptions with ClientApiVersions
  type ClusterIdList = js.Array[String]
  type CustomerNodeEndpointList = js.Array[CustomerNodeEndpoint]
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
    - typings.awsDashSdk.awsDashSdkStrings.system__
    - typings.awsDashSdk.awsDashSdkStrings.customer_
    - java.lang.String
  */
  type NodeUpdateInitiatedBy = _NodeUpdateInitiatedBy | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.`not-applied`
    - typings.awsDashSdk.awsDashSdkStrings.`waiting-to-start`
    - typings.awsDashSdk.awsDashSdkStrings.`in-progress`
    - typings.awsDashSdk.awsDashSdkStrings.stopping__
    - typings.awsDashSdk.awsDashSdkStrings.stopped__
    - typings.awsDashSdk.awsDashSdkStrings.complete__
    - java.lang.String
  */
  type NodeUpdateStatus = _NodeUpdateStatus | java.lang.String
  type ParameterNameValueList = js.Array[ParameterNameValue]
  type ParametersList = js.Array[Parameter]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.enabled__
    - typings.awsDashSdk.awsDashSdkStrings.disabled__
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
    - typings.awsDashSdk.awsDashSdkStrings.critical_
    - typings.awsDashSdk.awsDashSdkStrings.important
    - typings.awsDashSdk.awsDashSdkStrings.medium__
    - typings.awsDashSdk.awsDashSdkStrings.low__
    - java.lang.String
  */
  type ServiceUpdateSeverity = _ServiceUpdateSeverity | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.available__
    - typings.awsDashSdk.awsDashSdkStrings.cancelled__
    - typings.awsDashSdk.awsDashSdkStrings.expired__
    - java.lang.String
  */
  type ServiceUpdateStatus = _ServiceUpdateStatus | java.lang.String
  type ServiceUpdateStatusList = js.Array[ServiceUpdateStatus]
  type ServiceUpdateType = `security-update` | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.yes_
    - typings.awsDashSdk.awsDashSdkStrings.no_
    - typings.awsDashSdk.awsDashSdkStrings.nSlasha
    - java.lang.String
  */
  type SlaMet = _SlaMet | java.lang.String
  type SnapshotArnsList = js.Array[String]
  type SnapshotList = js.Array[Snapshot]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.`cache-cluster`
    - typings.awsDashSdk.awsDashSdkStrings.`cache-parameter-group`
    - typings.awsDashSdk.awsDashSdkStrings.`cache-security-group`
    - typings.awsDashSdk.awsDashSdkStrings.`cache-subnet-group`
    - typings.awsDashSdk.awsDashSdkStrings.`replication-group`
    - java.lang.String
  */
  type SourceType = _SourceType | java.lang.String
  type String = java.lang.String
  type SubnetIdentifierList = js.Array[String]
  type SubnetList = js.Array[Subnet]
  type TStamp = Date
  type TagList = js.Array[Tag]
  type UnprocessedUpdateActionList = js.Array[UnprocessedUpdateAction]
  type UpdateActionList = js.Array[UpdateAction]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.`not-applied`
    - typings.awsDashSdk.awsDashSdkStrings.`waiting-to-start`
    - typings.awsDashSdk.awsDashSdkStrings.`in-progress`
    - typings.awsDashSdk.awsDashSdkStrings.stopping__
    - typings.awsDashSdk.awsDashSdkStrings.stopped__
    - typings.awsDashSdk.awsDashSdkStrings.complete__
    - java.lang.String
  */
  type UpdateActionStatus = _UpdateActionStatus | java.lang.String
  type UpdateActionStatusList = js.Array[UpdateActionStatus]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.`2012-11-15`
    - typings.awsDashSdk.awsDashSdkStrings.`2014-03-24`
    - typings.awsDashSdk.awsDashSdkStrings.`2014-07-15`
    - typings.awsDashSdk.awsDashSdkStrings.`2014-09-30`
    - typings.awsDashSdk.awsDashSdkStrings.`2015-02-02`
    - typings.awsDashSdk.awsDashSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = _apiVersion | java.lang.String
}
