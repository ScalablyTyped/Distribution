package typings.awsSdk.clientsElasticacheMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ModifyReplicationGroupMessage extends StObject {
  
  /**
    * If true, this parameter causes the modifications in this request and any pending modifications to be applied, asynchronously and as soon as possible, regardless of the PreferredMaintenanceWindow setting for the replication group. If false, changes to the nodes in the replication group are applied on the next maintenance reboot, or the next failure reboot, whichever occurs first. Valid values: true | false  Default: false 
    */
  var ApplyImmediately: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Reserved parameter. The password used to access a password protected server. This parameter must be specified with the auth-token-update-strategy  parameter. Password constraints:   Must be only printable ASCII characters   Must be at least 16 characters and no more than 128 characters in length   Cannot contain any of the following characters: '/', '"', or '@', '%'    For more information, see AUTH password at AUTH.
    */
  var AuthToken: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies the strategy to use to update the AUTH token. This parameter must be specified with the auth-token parameter. Possible values:   Rotate   Set    For more information, see Authenticating Users with Redis AUTH 
    */
  var AuthTokenUpdateStrategy: js.UndefOr[AuthTokenUpdateStrategyType] = js.undefined
  
  /**
    *  If you are running Redis engine version 6.0 or later, set this parameter to yes if you want to opt-in to the next auto minor version upgrade campaign. This parameter is disabled for previous versions.  
    */
  var AutoMinorVersionUpgrade: js.UndefOr[BooleanOptional] = js.undefined
  
  /**
    * Determines whether a read replica is automatically promoted to read/write primary if the existing primary encounters a failure. Valid values: true | false 
    */
  var AutomaticFailoverEnabled: js.UndefOr[BooleanOptional] = js.undefined
  
  /**
    * A valid cache node type that you want to scale this replication group to.
    */
  var CacheNodeType: js.UndefOr[String] = js.undefined
  
  /**
    * The name of the cache parameter group to apply to all of the clusters in this replication group. This change is asynchronously applied as soon as possible for parameters when the ApplyImmediately parameter is specified as true for this request.
    */
  var CacheParameterGroupName: js.UndefOr[String] = js.undefined
  
  /**
    * A list of cache security group names to authorize for the clusters in this replication group. This change is asynchronously applied as soon as possible. This parameter can be used only with replication group containing clusters running outside of an Amazon Virtual Private Cloud (Amazon VPC). Constraints: Must contain no more than 255 alphanumeric characters. Must not be Default.
    */
  var CacheSecurityGroupNames: js.UndefOr[CacheSecurityGroupNameList] = js.undefined
  
  /**
    * The upgraded version of the cache engine to be run on the clusters in the replication group.  Important: You can upgrade to a newer engine version (see Selecting a Cache Engine and Version), but you cannot downgrade to an earlier engine version. If you want to use an earlier engine version, you must delete the existing replication group and create it anew with the earlier engine version. 
    */
  var EngineVersion: js.UndefOr[String] = js.undefined
  
  /**
    * The network type you choose when modifying a cluster, either ipv4 | ipv6. IPv6 is supported for workloads using Redis engine version 6.2 onward or Memcached engine version 1.6.6 on all instances built on the Nitro system.
    */
  var IpDiscovery: js.UndefOr[typings.awsSdk.clientsElasticacheMod.IpDiscovery] = js.undefined
  
  /**
    * Specifies the destination, format and type of the logs.
    */
  var LogDeliveryConfigurations: js.UndefOr[LogDeliveryConfigurationRequestList] = js.undefined
  
  /**
    * A flag to indicate MultiAZ is enabled.
    */
  var MultiAZEnabled: js.UndefOr[BooleanOptional] = js.undefined
  
  /**
    * Deprecated. This parameter is not used.
    */
  var NodeGroupId: js.UndefOr[String] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the Amazon SNS topic to which notifications are sent.  The Amazon SNS topic owner must be same as the replication group owner.  
    */
  var NotificationTopicArn: js.UndefOr[String] = js.undefined
  
  /**
    * The status of the Amazon SNS notification topic for the replication group. Notifications are sent only if the status is active. Valid values: active | inactive 
    */
  var NotificationTopicStatus: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies the weekly time range during which maintenance on the cluster is performed. It is specified as a range in the format ddd:hh24:mi-ddd:hh24:mi (24H Clock UTC). The minimum maintenance window is a 60 minute period. Valid values for ddd are:    sun     mon     tue     wed     thu     fri     sat    Example: sun:23:00-mon:01:30 
    */
  var PreferredMaintenanceWindow: js.UndefOr[String] = js.undefined
  
  /**
    * For replication groups with a single primary, if this parameter is specified, ElastiCache promotes the specified cluster in the specified replication group to the primary role. The nodes of all other clusters in the replication group are read replicas.
    */
  var PrimaryClusterId: js.UndefOr[String] = js.undefined
  
  /**
    * Removes the user group associated with this replication group.
    */
  var RemoveUserGroups: js.UndefOr[BooleanOptional] = js.undefined
  
  /**
    * A description for the replication group. Maximum length is 255 characters.
    */
  var ReplicationGroupDescription: js.UndefOr[String] = js.undefined
  
  /**
    * The identifier of the replication group to modify.
    */
  var ReplicationGroupId: String
  
  /**
    * Specifies the VPC Security Groups associated with the clusters in the replication group. This parameter can be used only with replication group containing clusters running in an Amazon Virtual Private Cloud (Amazon VPC).
    */
  var SecurityGroupIds: js.UndefOr[SecurityGroupIdsList] = js.undefined
  
  /**
    * The number of days for which ElastiCache retains automatic node group (shard) snapshots before deleting them. For example, if you set SnapshotRetentionLimit to 5, a snapshot that was taken today is retained for 5 days before being deleted.  Important If the value of SnapshotRetentionLimit is set to zero (0), backups are turned off.
    */
  var SnapshotRetentionLimit: js.UndefOr[IntegerOptional] = js.undefined
  
  /**
    * The daily time range (in UTC) during which ElastiCache begins taking a daily snapshot of the node group (shard) specified by SnapshottingClusterId. Example: 05:00-09:00  If you do not specify this parameter, ElastiCache automatically chooses an appropriate time range.
    */
  var SnapshotWindow: js.UndefOr[String] = js.undefined
  
  /**
    * The cluster ID that is used as the daily snapshot source for the replication group. This parameter cannot be set for Redis (cluster mode enabled) replication groups.
    */
  var SnapshottingClusterId: js.UndefOr[String] = js.undefined
  
  /**
    * The ID of the user group you are associating with the replication group.
    */
  var UserGroupIdsToAdd: js.UndefOr[UserGroupIdList] = js.undefined
  
  /**
    * The ID of the user group to disassociate from the replication group, meaning the users in the group no longer can access the replication group.
    */
  var UserGroupIdsToRemove: js.UndefOr[UserGroupIdList] = js.undefined
}
object ModifyReplicationGroupMessage {
  
  inline def apply(ReplicationGroupId: String): ModifyReplicationGroupMessage = {
    val __obj = js.Dynamic.literal(ReplicationGroupId = ReplicationGroupId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModifyReplicationGroupMessage]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ModifyReplicationGroupMessage] (val x: Self) extends AnyVal {
    
    inline def setApplyImmediately(value: Boolean): Self = StObject.set(x, "ApplyImmediately", value.asInstanceOf[js.Any])
    
    inline def setApplyImmediatelyUndefined: Self = StObject.set(x, "ApplyImmediately", js.undefined)
    
    inline def setAuthToken(value: String): Self = StObject.set(x, "AuthToken", value.asInstanceOf[js.Any])
    
    inline def setAuthTokenUndefined: Self = StObject.set(x, "AuthToken", js.undefined)
    
    inline def setAuthTokenUpdateStrategy(value: AuthTokenUpdateStrategyType): Self = StObject.set(x, "AuthTokenUpdateStrategy", value.asInstanceOf[js.Any])
    
    inline def setAuthTokenUpdateStrategyUndefined: Self = StObject.set(x, "AuthTokenUpdateStrategy", js.undefined)
    
    inline def setAutoMinorVersionUpgrade(value: BooleanOptional): Self = StObject.set(x, "AutoMinorVersionUpgrade", value.asInstanceOf[js.Any])
    
    inline def setAutoMinorVersionUpgradeUndefined: Self = StObject.set(x, "AutoMinorVersionUpgrade", js.undefined)
    
    inline def setAutomaticFailoverEnabled(value: BooleanOptional): Self = StObject.set(x, "AutomaticFailoverEnabled", value.asInstanceOf[js.Any])
    
    inline def setAutomaticFailoverEnabledUndefined: Self = StObject.set(x, "AutomaticFailoverEnabled", js.undefined)
    
    inline def setCacheNodeType(value: String): Self = StObject.set(x, "CacheNodeType", value.asInstanceOf[js.Any])
    
    inline def setCacheNodeTypeUndefined: Self = StObject.set(x, "CacheNodeType", js.undefined)
    
    inline def setCacheParameterGroupName(value: String): Self = StObject.set(x, "CacheParameterGroupName", value.asInstanceOf[js.Any])
    
    inline def setCacheParameterGroupNameUndefined: Self = StObject.set(x, "CacheParameterGroupName", js.undefined)
    
    inline def setCacheSecurityGroupNames(value: CacheSecurityGroupNameList): Self = StObject.set(x, "CacheSecurityGroupNames", value.asInstanceOf[js.Any])
    
    inline def setCacheSecurityGroupNamesUndefined: Self = StObject.set(x, "CacheSecurityGroupNames", js.undefined)
    
    inline def setCacheSecurityGroupNamesVarargs(value: String*): Self = StObject.set(x, "CacheSecurityGroupNames", js.Array(value*))
    
    inline def setEngineVersion(value: String): Self = StObject.set(x, "EngineVersion", value.asInstanceOf[js.Any])
    
    inline def setEngineVersionUndefined: Self = StObject.set(x, "EngineVersion", js.undefined)
    
    inline def setIpDiscovery(value: IpDiscovery): Self = StObject.set(x, "IpDiscovery", value.asInstanceOf[js.Any])
    
    inline def setIpDiscoveryUndefined: Self = StObject.set(x, "IpDiscovery", js.undefined)
    
    inline def setLogDeliveryConfigurations(value: LogDeliveryConfigurationRequestList): Self = StObject.set(x, "LogDeliveryConfigurations", value.asInstanceOf[js.Any])
    
    inline def setLogDeliveryConfigurationsUndefined: Self = StObject.set(x, "LogDeliveryConfigurations", js.undefined)
    
    inline def setLogDeliveryConfigurationsVarargs(value: LogDeliveryConfigurationRequest*): Self = StObject.set(x, "LogDeliveryConfigurations", js.Array(value*))
    
    inline def setMultiAZEnabled(value: BooleanOptional): Self = StObject.set(x, "MultiAZEnabled", value.asInstanceOf[js.Any])
    
    inline def setMultiAZEnabledUndefined: Self = StObject.set(x, "MultiAZEnabled", js.undefined)
    
    inline def setNodeGroupId(value: String): Self = StObject.set(x, "NodeGroupId", value.asInstanceOf[js.Any])
    
    inline def setNodeGroupIdUndefined: Self = StObject.set(x, "NodeGroupId", js.undefined)
    
    inline def setNotificationTopicArn(value: String): Self = StObject.set(x, "NotificationTopicArn", value.asInstanceOf[js.Any])
    
    inline def setNotificationTopicArnUndefined: Self = StObject.set(x, "NotificationTopicArn", js.undefined)
    
    inline def setNotificationTopicStatus(value: String): Self = StObject.set(x, "NotificationTopicStatus", value.asInstanceOf[js.Any])
    
    inline def setNotificationTopicStatusUndefined: Self = StObject.set(x, "NotificationTopicStatus", js.undefined)
    
    inline def setPreferredMaintenanceWindow(value: String): Self = StObject.set(x, "PreferredMaintenanceWindow", value.asInstanceOf[js.Any])
    
    inline def setPreferredMaintenanceWindowUndefined: Self = StObject.set(x, "PreferredMaintenanceWindow", js.undefined)
    
    inline def setPrimaryClusterId(value: String): Self = StObject.set(x, "PrimaryClusterId", value.asInstanceOf[js.Any])
    
    inline def setPrimaryClusterIdUndefined: Self = StObject.set(x, "PrimaryClusterId", js.undefined)
    
    inline def setRemoveUserGroups(value: BooleanOptional): Self = StObject.set(x, "RemoveUserGroups", value.asInstanceOf[js.Any])
    
    inline def setRemoveUserGroupsUndefined: Self = StObject.set(x, "RemoveUserGroups", js.undefined)
    
    inline def setReplicationGroupDescription(value: String): Self = StObject.set(x, "ReplicationGroupDescription", value.asInstanceOf[js.Any])
    
    inline def setReplicationGroupDescriptionUndefined: Self = StObject.set(x, "ReplicationGroupDescription", js.undefined)
    
    inline def setReplicationGroupId(value: String): Self = StObject.set(x, "ReplicationGroupId", value.asInstanceOf[js.Any])
    
    inline def setSecurityGroupIds(value: SecurityGroupIdsList): Self = StObject.set(x, "SecurityGroupIds", value.asInstanceOf[js.Any])
    
    inline def setSecurityGroupIdsUndefined: Self = StObject.set(x, "SecurityGroupIds", js.undefined)
    
    inline def setSecurityGroupIdsVarargs(value: String*): Self = StObject.set(x, "SecurityGroupIds", js.Array(value*))
    
    inline def setSnapshotRetentionLimit(value: IntegerOptional): Self = StObject.set(x, "SnapshotRetentionLimit", value.asInstanceOf[js.Any])
    
    inline def setSnapshotRetentionLimitUndefined: Self = StObject.set(x, "SnapshotRetentionLimit", js.undefined)
    
    inline def setSnapshotWindow(value: String): Self = StObject.set(x, "SnapshotWindow", value.asInstanceOf[js.Any])
    
    inline def setSnapshotWindowUndefined: Self = StObject.set(x, "SnapshotWindow", js.undefined)
    
    inline def setSnapshottingClusterId(value: String): Self = StObject.set(x, "SnapshottingClusterId", value.asInstanceOf[js.Any])
    
    inline def setSnapshottingClusterIdUndefined: Self = StObject.set(x, "SnapshottingClusterId", js.undefined)
    
    inline def setUserGroupIdsToAdd(value: UserGroupIdList): Self = StObject.set(x, "UserGroupIdsToAdd", value.asInstanceOf[js.Any])
    
    inline def setUserGroupIdsToAddUndefined: Self = StObject.set(x, "UserGroupIdsToAdd", js.undefined)
    
    inline def setUserGroupIdsToAddVarargs(value: UserGroupId*): Self = StObject.set(x, "UserGroupIdsToAdd", js.Array(value*))
    
    inline def setUserGroupIdsToRemove(value: UserGroupIdList): Self = StObject.set(x, "UserGroupIdsToRemove", value.asInstanceOf[js.Any])
    
    inline def setUserGroupIdsToRemoveUndefined: Self = StObject.set(x, "UserGroupIdsToRemove", js.undefined)
    
    inline def setUserGroupIdsToRemoveVarargs(value: UserGroupId*): Self = StObject.set(x, "UserGroupIdsToRemove", js.Array(value*))
  }
}
