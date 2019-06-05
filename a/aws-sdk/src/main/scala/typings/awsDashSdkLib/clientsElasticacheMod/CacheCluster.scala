package typings
package awsDashSdkLib.clientsElasticacheMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CacheCluster extends js.Object {
  /**
    * A flag that enables encryption at-rest when set to true. You cannot modify the value of AtRestEncryptionEnabled after the cluster is created. To enable at-rest encryption on a cluster you must set AtRestEncryptionEnabled to true when you create a cluster.  Required: Only available when creating a replication group in an Amazon VPC using redis version 3.2.6 or 4.x. Default: false 
    */
  var AtRestEncryptionEnabled: js.UndefOr[BooleanOptional] = js.undefined
  /**
    * A flag that enables using an AuthToken (password) when issuing Redis commands. Default: false 
    */
  var AuthTokenEnabled: js.UndefOr[BooleanOptional] = js.undefined
  /**
    * This parameter is currently disabled.
    */
  var AutoMinorVersionUpgrade: js.UndefOr[Boolean] = js.undefined
  /**
    * The date and time when the cluster was created.
    */
  var CacheClusterCreateTime: js.UndefOr[TStamp] = js.undefined
  /**
    * The user-supplied identifier of the cluster. This identifier is a unique key that identifies a cluster.
    */
  var CacheClusterId: js.UndefOr[String] = js.undefined
  /**
    * The current state of this cluster, one of the following values: available, creating, deleted, deleting, incompatible-network, modifying, rebooting cluster nodes, restore-failed, or snapshotting.
    */
  var CacheClusterStatus: js.UndefOr[String] = js.undefined
  /**
    * The name of the compute and memory capacity node type for the cluster. The following node types are supported by ElastiCache. Generally speaking, the current generation types provide more memory and computational power at lower cost when compared to their equivalent previous generation counterparts.   General purpose:   Current generation:   M5 node types: cache.m5.large, cache.m5.xlarge, cache.m5.2xlarge, cache.m5.4xlarge, cache.m5.12xlarge, cache.m5.24xlarge   M4 node types: cache.m4.large, cache.m4.xlarge, cache.m4.2xlarge, cache.m4.4xlarge, cache.m4.10xlarge   T2 node types: cache.t2.micro, cache.t2.small, cache.t2.medium    Previous generation: (not recommended)  T1 node types: cache.t1.micro   M1 node types: cache.m1.small, cache.m1.medium, cache.m1.large, cache.m1.xlarge   M3 node types: cache.m3.medium, cache.m3.large, cache.m3.xlarge, cache.m3.2xlarge      Compute optimized:   Previous generation: (not recommended)  C1 node types: cache.c1.xlarge      Memory optimized:   Current generation:   R5 node types: cache.r5.large, cache.r5.xlarge, cache.r5.2xlarge, cache.r5.4xlarge, cache.r5.12xlarge, cache.r5.24xlarge   R4 node types: cache.r4.large, cache.r4.xlarge, cache.r4.2xlarge, cache.r4.4xlarge, cache.r4.8xlarge, cache.r4.16xlarge    Previous generation: (not recommended)  M2 node types: cache.m2.xlarge, cache.m2.2xlarge, cache.m2.4xlarge   R3 node types: cache.r3.large, cache.r3.xlarge, cache.r3.2xlarge, cache.r3.4xlarge, cache.r3.8xlarge       Additional node type info    All current generation instance types are created in Amazon VPC by default.   Redis append-only files (AOF) are not supported for T1 or T2 instances.   Redis Multi-AZ with automatic failover is not supported on T1 instances.   Redis configuration variables appendonly and appendfsync are not supported on Redis version 2.8.22 and later.  
    */
  var CacheNodeType: js.UndefOr[String] = js.undefined
  /**
    * A list of cache nodes that are members of the cluster.
    */
  var CacheNodes: js.UndefOr[CacheNodeList] = js.undefined
  /**
    * Status of the cache parameter group.
    */
  var CacheParameterGroup: js.UndefOr[CacheParameterGroupStatus] = js.undefined
  /**
    * A list of cache security group elements, composed of name and status sub-elements.
    */
  var CacheSecurityGroups: js.UndefOr[CacheSecurityGroupMembershipList] = js.undefined
  /**
    * The name of the cache subnet group associated with the cluster.
    */
  var CacheSubnetGroupName: js.UndefOr[String] = js.undefined
  /**
    * The URL of the web page where you can download the latest ElastiCache client library.
    */
  var ClientDownloadLandingPage: js.UndefOr[String] = js.undefined
  /**
    * Represents a Memcached cluster endpoint which, if Automatic Discovery is enabled on the cluster, can be used by an application to connect to any node in the cluster. The configuration endpoint will always have .cfg in it. Example: mem-3.9dvc4r.cfg.usw2.cache.amazonaws.com:11211 
    */
  var ConfigurationEndpoint: js.UndefOr[Endpoint] = js.undefined
  /**
    * The name of the cache engine (memcached or redis) to be used for this cluster.
    */
  var Engine: js.UndefOr[String] = js.undefined
  /**
    * The version of the cache engine that is used in this cluster.
    */
  var EngineVersion: js.UndefOr[String] = js.undefined
  /**
    * Describes a notification topic and its status. Notification topics are used for publishing ElastiCache events to subscribers using Amazon Simple Notification Service (SNS). 
    */
  var NotificationConfiguration: js.UndefOr[NotificationConfiguration] = js.undefined
  /**
    * The number of cache nodes in the cluster. For clusters running Redis, this value must be 1. For clusters running Memcached, this value must be between 1 and 20.
    */
  var NumCacheNodes: js.UndefOr[IntegerOptional] = js.undefined
  var PendingModifiedValues: js.UndefOr[PendingModifiedValues] = js.undefined
  /**
    * The name of the Availability Zone in which the cluster is located or "Multiple" if the cache nodes are located in different Availability Zones.
    */
  var PreferredAvailabilityZone: js.UndefOr[String] = js.undefined
  /**
    * Specifies the weekly time range during which maintenance on the cluster is performed. It is specified as a range in the format ddd:hh24:mi-ddd:hh24:mi (24H Clock UTC). The minimum maintenance window is a 60 minute period. Valid values for ddd are:    sun     mon     tue     wed     thu     fri     sat    Example: sun:23:00-mon:01:30 
    */
  var PreferredMaintenanceWindow: js.UndefOr[String] = js.undefined
  /**
    * The replication group to which this cluster belongs. If this field is empty, the cluster is not associated with any replication group.
    */
  var ReplicationGroupId: js.UndefOr[String] = js.undefined
  /**
    * A list of VPC Security Groups associated with the cluster.
    */
  var SecurityGroups: js.UndefOr[SecurityGroupMembershipList] = js.undefined
  /**
    * The number of days for which ElastiCache retains automatic cluster snapshots before deleting them. For example, if you set SnapshotRetentionLimit to 5, a snapshot that was taken today is retained for 5 days before being deleted.   If the value of SnapshotRetentionLimit is set to zero (0), backups are turned off. 
    */
  var SnapshotRetentionLimit: js.UndefOr[IntegerOptional] = js.undefined
  /**
    * The daily time range (in UTC) during which ElastiCache begins taking a daily snapshot of your cluster. Example: 05:00-09:00 
    */
  var SnapshotWindow: js.UndefOr[String] = js.undefined
  /**
    * A flag that enables in-transit encryption when set to true. You cannot modify the value of TransitEncryptionEnabled after the cluster is created. To enable in-transit encryption on a cluster you must set TransitEncryptionEnabled to true when you create a cluster.  Required: Only available when creating a replication group in an Amazon VPC using redis version 3.2.6 or 4.x. Default: false 
    */
  var TransitEncryptionEnabled: js.UndefOr[BooleanOptional] = js.undefined
}

object CacheCluster {
  @scala.inline
  def apply(
    AtRestEncryptionEnabled: js.UndefOr[BooleanOptional] = js.undefined,
    AuthTokenEnabled: js.UndefOr[BooleanOptional] = js.undefined,
    AutoMinorVersionUpgrade: js.UndefOr[Boolean] = js.undefined,
    CacheClusterCreateTime: TStamp = null,
    CacheClusterId: String = null,
    CacheClusterStatus: String = null,
    CacheNodeType: String = null,
    CacheNodes: CacheNodeList = null,
    CacheParameterGroup: CacheParameterGroupStatus = null,
    CacheSecurityGroups: CacheSecurityGroupMembershipList = null,
    CacheSubnetGroupName: String = null,
    ClientDownloadLandingPage: String = null,
    ConfigurationEndpoint: Endpoint = null,
    Engine: String = null,
    EngineVersion: String = null,
    NotificationConfiguration: NotificationConfiguration = null,
    NumCacheNodes: js.UndefOr[IntegerOptional] = js.undefined,
    PendingModifiedValues: PendingModifiedValues = null,
    PreferredAvailabilityZone: String = null,
    PreferredMaintenanceWindow: String = null,
    ReplicationGroupId: String = null,
    SecurityGroups: SecurityGroupMembershipList = null,
    SnapshotRetentionLimit: js.UndefOr[IntegerOptional] = js.undefined,
    SnapshotWindow: String = null,
    TransitEncryptionEnabled: js.UndefOr[BooleanOptional] = js.undefined
  ): CacheCluster = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(AtRestEncryptionEnabled)) __obj.updateDynamic("AtRestEncryptionEnabled")(AtRestEncryptionEnabled)
    if (!js.isUndefined(AuthTokenEnabled)) __obj.updateDynamic("AuthTokenEnabled")(AuthTokenEnabled)
    if (!js.isUndefined(AutoMinorVersionUpgrade)) __obj.updateDynamic("AutoMinorVersionUpgrade")(AutoMinorVersionUpgrade)
    if (CacheClusterCreateTime != null) __obj.updateDynamic("CacheClusterCreateTime")(CacheClusterCreateTime)
    if (CacheClusterId != null) __obj.updateDynamic("CacheClusterId")(CacheClusterId)
    if (CacheClusterStatus != null) __obj.updateDynamic("CacheClusterStatus")(CacheClusterStatus)
    if (CacheNodeType != null) __obj.updateDynamic("CacheNodeType")(CacheNodeType)
    if (CacheNodes != null) __obj.updateDynamic("CacheNodes")(CacheNodes)
    if (CacheParameterGroup != null) __obj.updateDynamic("CacheParameterGroup")(CacheParameterGroup)
    if (CacheSecurityGroups != null) __obj.updateDynamic("CacheSecurityGroups")(CacheSecurityGroups)
    if (CacheSubnetGroupName != null) __obj.updateDynamic("CacheSubnetGroupName")(CacheSubnetGroupName)
    if (ClientDownloadLandingPage != null) __obj.updateDynamic("ClientDownloadLandingPage")(ClientDownloadLandingPage)
    if (ConfigurationEndpoint != null) __obj.updateDynamic("ConfigurationEndpoint")(ConfigurationEndpoint)
    if (Engine != null) __obj.updateDynamic("Engine")(Engine)
    if (EngineVersion != null) __obj.updateDynamic("EngineVersion")(EngineVersion)
    if (NotificationConfiguration != null) __obj.updateDynamic("NotificationConfiguration")(NotificationConfiguration)
    if (!js.isUndefined(NumCacheNodes)) __obj.updateDynamic("NumCacheNodes")(NumCacheNodes)
    if (PendingModifiedValues != null) __obj.updateDynamic("PendingModifiedValues")(PendingModifiedValues)
    if (PreferredAvailabilityZone != null) __obj.updateDynamic("PreferredAvailabilityZone")(PreferredAvailabilityZone)
    if (PreferredMaintenanceWindow != null) __obj.updateDynamic("PreferredMaintenanceWindow")(PreferredMaintenanceWindow)
    if (ReplicationGroupId != null) __obj.updateDynamic("ReplicationGroupId")(ReplicationGroupId)
    if (SecurityGroups != null) __obj.updateDynamic("SecurityGroups")(SecurityGroups)
    if (!js.isUndefined(SnapshotRetentionLimit)) __obj.updateDynamic("SnapshotRetentionLimit")(SnapshotRetentionLimit)
    if (SnapshotWindow != null) __obj.updateDynamic("SnapshotWindow")(SnapshotWindow)
    if (!js.isUndefined(TransitEncryptionEnabled)) __obj.updateDynamic("TransitEncryptionEnabled")(TransitEncryptionEnabled)
    __obj.asInstanceOf[CacheCluster]
  }
}

