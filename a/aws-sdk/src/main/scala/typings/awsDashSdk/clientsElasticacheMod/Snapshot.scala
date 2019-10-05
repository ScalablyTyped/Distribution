package typings.awsDashSdk.clientsElasticacheMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Snapshot extends js.Object {
  /**
    * This parameter is currently disabled.
    */
  var AutoMinorVersionUpgrade: js.UndefOr[Boolean] = js.undefined
  /**
    * Indicates the status of Multi-AZ with automatic failover for the source Redis replication group. Amazon ElastiCache for Redis does not support Multi-AZ with automatic failover on:   Redis versions earlier than 2.8.6.   Redis (cluster mode disabled): T1 node types.   Redis (cluster mode enabled): T1 node types.  
    */
  var AutomaticFailover: js.UndefOr[AutomaticFailoverStatus] = js.undefined
  /**
    * The date and time when the source cluster was created.
    */
  var CacheClusterCreateTime: js.UndefOr[TStamp] = js.undefined
  /**
    * The user-supplied identifier of the source cluster.
    */
  var CacheClusterId: js.UndefOr[String] = js.undefined
  /**
    * The name of the compute and memory capacity node type for the source cluster. The following node types are supported by ElastiCache. Generally speaking, the current generation types provide more memory and computational power at lower cost when compared to their equivalent previous generation counterparts.   General purpose:   Current generation:   M5 node types: cache.m5.large, cache.m5.xlarge, cache.m5.2xlarge, cache.m5.4xlarge, cache.m5.12xlarge, cache.m5.24xlarge   M4 node types: cache.m4.large, cache.m4.xlarge, cache.m4.2xlarge, cache.m4.4xlarge, cache.m4.10xlarge   T2 node types: cache.t2.micro, cache.t2.small, cache.t2.medium    Previous generation: (not recommended)  T1 node types: cache.t1.micro   M1 node types: cache.m1.small, cache.m1.medium, cache.m1.large, cache.m1.xlarge   M3 node types: cache.m3.medium, cache.m3.large, cache.m3.xlarge, cache.m3.2xlarge      Compute optimized:   Previous generation: (not recommended)  C1 node types: cache.c1.xlarge      Memory optimized:   Current generation:   R5 node types: cache.r5.large, cache.r5.xlarge, cache.r5.2xlarge, cache.r5.4xlarge, cache.r5.12xlarge, cache.r5.24xlarge   R4 node types: cache.r4.large, cache.r4.xlarge, cache.r4.2xlarge, cache.r4.4xlarge, cache.r4.8xlarge, cache.r4.16xlarge    Previous generation: (not recommended)  M2 node types: cache.m2.xlarge, cache.m2.2xlarge, cache.m2.4xlarge   R3 node types: cache.r3.large, cache.r3.xlarge, cache.r3.2xlarge, cache.r3.4xlarge, cache.r3.8xlarge       Additional node type info    All current generation instance types are created in Amazon VPC by default.   Redis append-only files (AOF) are not supported for T1 or T2 instances.   Redis Multi-AZ with automatic failover is not supported on T1 instances.   Redis configuration variables appendonly and appendfsync are not supported on Redis version 2.8.22 and later.  
    */
  var CacheNodeType: js.UndefOr[String] = js.undefined
  /**
    * The cache parameter group that is associated with the source cluster.
    */
  var CacheParameterGroupName: js.UndefOr[String] = js.undefined
  /**
    * The name of the cache subnet group associated with the source cluster.
    */
  var CacheSubnetGroupName: js.UndefOr[String] = js.undefined
  /**
    * The name of the cache engine (memcached or redis) used by the source cluster.
    */
  var Engine: js.UndefOr[String] = js.undefined
  /**
    * The version of the cache engine version that is used by the source cluster.
    */
  var EngineVersion: js.UndefOr[String] = js.undefined
  /**
    * The ID of the KMS key used to encrypt the snapshot.
    */
  var KmsKeyId: js.UndefOr[String] = js.undefined
  /**
    * A list of the cache nodes in the source cluster.
    */
  var NodeSnapshots: js.UndefOr[NodeSnapshotList] = js.undefined
  /**
    * The number of cache nodes in the source cluster. For clusters running Redis, this value must be 1. For clusters running Memcached, this value must be between 1 and 20.
    */
  var NumCacheNodes: js.UndefOr[IntegerOptional] = js.undefined
  /**
    * The number of node groups (shards) in this snapshot. When restoring from a snapshot, the number of node groups (shards) in the snapshot and in the restored replication group must be the same.
    */
  var NumNodeGroups: js.UndefOr[IntegerOptional] = js.undefined
  /**
    * The port number used by each cache nodes in the source cluster.
    */
  var Port: js.UndefOr[IntegerOptional] = js.undefined
  /**
    * The name of the Availability Zone in which the source cluster is located.
    */
  var PreferredAvailabilityZone: js.UndefOr[String] = js.undefined
  /**
    * Specifies the weekly time range during which maintenance on the cluster is performed. It is specified as a range in the format ddd:hh24:mi-ddd:hh24:mi (24H Clock UTC). The minimum maintenance window is a 60 minute period. Valid values for ddd are:    sun     mon     tue     wed     thu     fri     sat    Example: sun:23:00-mon:01:30 
    */
  var PreferredMaintenanceWindow: js.UndefOr[String] = js.undefined
  /**
    * A description of the source replication group.
    */
  var ReplicationGroupDescription: js.UndefOr[String] = js.undefined
  /**
    * The unique identifier of the source replication group.
    */
  var ReplicationGroupId: js.UndefOr[String] = js.undefined
  /**
    * The name of a snapshot. For an automatic snapshot, the name is system-generated. For a manual snapshot, this is the user-provided name.
    */
  var SnapshotName: js.UndefOr[String] = js.undefined
  /**
    * For an automatic snapshot, the number of days for which ElastiCache retains the snapshot before deleting it. For manual snapshots, this field reflects the SnapshotRetentionLimit for the source cluster when the snapshot was created. This field is otherwise ignored: Manual snapshots do not expire, and can only be deleted using the DeleteSnapshot operation.   Important If the value of SnapshotRetentionLimit is set to zero (0), backups are turned off.
    */
  var SnapshotRetentionLimit: js.UndefOr[IntegerOptional] = js.undefined
  /**
    * Indicates whether the snapshot is from an automatic backup (automated) or was created manually (manual).
    */
  var SnapshotSource: js.UndefOr[String] = js.undefined
  /**
    * The status of the snapshot. Valid values: creating | available | restoring | copying | deleting.
    */
  var SnapshotStatus: js.UndefOr[String] = js.undefined
  /**
    * The daily time range during which ElastiCache takes daily snapshots of the source cluster.
    */
  var SnapshotWindow: js.UndefOr[String] = js.undefined
  /**
    * The Amazon Resource Name (ARN) for the topic used by the source cluster for publishing notifications.
    */
  var TopicArn: js.UndefOr[String] = js.undefined
  /**
    * The Amazon Virtual Private Cloud identifier (VPC ID) of the cache subnet group for the source cluster.
    */
  var VpcId: js.UndefOr[String] = js.undefined
}

object Snapshot {
  @scala.inline
  def apply(
    AutoMinorVersionUpgrade: js.UndefOr[scala.Boolean] = js.undefined,
    AutomaticFailover: AutomaticFailoverStatus = null,
    CacheClusterCreateTime: TStamp = null,
    CacheClusterId: String = null,
    CacheNodeType: String = null,
    CacheParameterGroupName: String = null,
    CacheSubnetGroupName: String = null,
    Engine: String = null,
    EngineVersion: String = null,
    KmsKeyId: String = null,
    NodeSnapshots: NodeSnapshotList = null,
    NumCacheNodes: Int | scala.Double = null,
    NumNodeGroups: Int | scala.Double = null,
    Port: Int | scala.Double = null,
    PreferredAvailabilityZone: String = null,
    PreferredMaintenanceWindow: String = null,
    ReplicationGroupDescription: String = null,
    ReplicationGroupId: String = null,
    SnapshotName: String = null,
    SnapshotRetentionLimit: Int | scala.Double = null,
    SnapshotSource: String = null,
    SnapshotStatus: String = null,
    SnapshotWindow: String = null,
    TopicArn: String = null,
    VpcId: String = null
  ): Snapshot = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(AutoMinorVersionUpgrade)) __obj.updateDynamic("AutoMinorVersionUpgrade")(AutoMinorVersionUpgrade)
    if (AutomaticFailover != null) __obj.updateDynamic("AutomaticFailover")(AutomaticFailover.asInstanceOf[js.Any])
    if (CacheClusterCreateTime != null) __obj.updateDynamic("CacheClusterCreateTime")(CacheClusterCreateTime)
    if (CacheClusterId != null) __obj.updateDynamic("CacheClusterId")(CacheClusterId)
    if (CacheNodeType != null) __obj.updateDynamic("CacheNodeType")(CacheNodeType)
    if (CacheParameterGroupName != null) __obj.updateDynamic("CacheParameterGroupName")(CacheParameterGroupName)
    if (CacheSubnetGroupName != null) __obj.updateDynamic("CacheSubnetGroupName")(CacheSubnetGroupName)
    if (Engine != null) __obj.updateDynamic("Engine")(Engine)
    if (EngineVersion != null) __obj.updateDynamic("EngineVersion")(EngineVersion)
    if (KmsKeyId != null) __obj.updateDynamic("KmsKeyId")(KmsKeyId)
    if (NodeSnapshots != null) __obj.updateDynamic("NodeSnapshots")(NodeSnapshots)
    if (NumCacheNodes != null) __obj.updateDynamic("NumCacheNodes")(NumCacheNodes.asInstanceOf[js.Any])
    if (NumNodeGroups != null) __obj.updateDynamic("NumNodeGroups")(NumNodeGroups.asInstanceOf[js.Any])
    if (Port != null) __obj.updateDynamic("Port")(Port.asInstanceOf[js.Any])
    if (PreferredAvailabilityZone != null) __obj.updateDynamic("PreferredAvailabilityZone")(PreferredAvailabilityZone)
    if (PreferredMaintenanceWindow != null) __obj.updateDynamic("PreferredMaintenanceWindow")(PreferredMaintenanceWindow)
    if (ReplicationGroupDescription != null) __obj.updateDynamic("ReplicationGroupDescription")(ReplicationGroupDescription)
    if (ReplicationGroupId != null) __obj.updateDynamic("ReplicationGroupId")(ReplicationGroupId)
    if (SnapshotName != null) __obj.updateDynamic("SnapshotName")(SnapshotName)
    if (SnapshotRetentionLimit != null) __obj.updateDynamic("SnapshotRetentionLimit")(SnapshotRetentionLimit.asInstanceOf[js.Any])
    if (SnapshotSource != null) __obj.updateDynamic("SnapshotSource")(SnapshotSource)
    if (SnapshotStatus != null) __obj.updateDynamic("SnapshotStatus")(SnapshotStatus)
    if (SnapshotWindow != null) __obj.updateDynamic("SnapshotWindow")(SnapshotWindow)
    if (TopicArn != null) __obj.updateDynamic("TopicArn")(TopicArn)
    if (VpcId != null) __obj.updateDynamic("VpcId")(VpcId)
    __obj.asInstanceOf[Snapshot]
  }
}

