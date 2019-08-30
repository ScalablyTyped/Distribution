package typings.awsDashSdk.clientsElasticacheMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReplicationGroup extends js.Object {
  /**
    * A flag that enables encryption at-rest when set to true. You cannot modify the value of AtRestEncryptionEnabled after the cluster is created. To enable encryption at-rest on a cluster you must set AtRestEncryptionEnabled to true when you create a cluster.  Required: Only available when creating a replication group in an Amazon VPC using redis version 3.2.6, 4.x or later. Default: false 
    */
  var AtRestEncryptionEnabled: js.UndefOr[BooleanOptional] = js.undefined
  /**
    * A flag that enables using an AuthToken (password) when issuing Redis commands. Default: false 
    */
  var AuthTokenEnabled: js.UndefOr[BooleanOptional] = js.undefined
  /**
    * Indicates the status of Multi-AZ with automatic failover for this Redis replication group. Amazon ElastiCache for Redis does not support Multi-AZ with automatic failover on:   Redis versions earlier than 2.8.6.   Redis (cluster mode disabled): T1 node types.   Redis (cluster mode enabled): T1 node types.  
    */
  var AutomaticFailover: js.UndefOr[AutomaticFailoverStatus] = js.undefined
  /**
    * The name of the compute and memory capacity node type for each node in the replication group.
    */
  var CacheNodeType: js.UndefOr[String] = js.undefined
  /**
    * A flag indicating whether or not this replication group is cluster enabled; i.e., whether its data can be partitioned across multiple shards (API/CLI: node groups). Valid values: true | false 
    */
  var ClusterEnabled: js.UndefOr[BooleanOptional] = js.undefined
  /**
    * The configuration endpoint for this replication group. Use the configuration endpoint to connect to this replication group.
    */
  var ConfigurationEndpoint: js.UndefOr[Endpoint] = js.undefined
  /**
    * The user supplied description of the replication group.
    */
  var Description: js.UndefOr[String] = js.undefined
  /**
    * The ID of the KMS key used to encrypt the disk in the cluster.
    */
  var KmsKeyId: js.UndefOr[String] = js.undefined
  /**
    * The names of all the cache clusters that are part of this replication group.
    */
  var MemberClusters: js.UndefOr[ClusterIdList] = js.undefined
  /**
    * A list of node groups in this replication group. For Redis (cluster mode disabled) replication groups, this is a single-element list. For Redis (cluster mode enabled) replication groups, the list contains an entry for each node group (shard).
    */
  var NodeGroups: js.UndefOr[NodeGroupList] = js.undefined
  /**
    * A group of settings to be applied to the replication group, either immediately or during the next maintenance window.
    */
  var PendingModifiedValues: js.UndefOr[ReplicationGroupPendingModifiedValues] = js.undefined
  /**
    * The identifier for the replication group.
    */
  var ReplicationGroupId: js.UndefOr[String] = js.undefined
  /**
    * The number of days for which ElastiCache retains automatic cluster snapshots before deleting them. For example, if you set SnapshotRetentionLimit to 5, a snapshot that was taken today is retained for 5 days before being deleted.   If the value of SnapshotRetentionLimit is set to zero (0), backups are turned off. 
    */
  var SnapshotRetentionLimit: js.UndefOr[IntegerOptional] = js.undefined
  /**
    * The daily time range (in UTC) during which ElastiCache begins taking a daily snapshot of your node group (shard). Example: 05:00-09:00  If you do not specify this parameter, ElastiCache automatically chooses an appropriate time range.  This parameter is only valid if the Engine parameter is redis. 
    */
  var SnapshotWindow: js.UndefOr[String] = js.undefined
  /**
    * The cluster ID that is used as the daily snapshot source for the replication group.
    */
  var SnapshottingClusterId: js.UndefOr[String] = js.undefined
  /**
    * The current state of this replication group - creating, available, modifying, deleting, create-failed, snapshotting.
    */
  var Status: js.UndefOr[String] = js.undefined
  /**
    * A flag that enables in-transit encryption when set to true. You cannot modify the value of TransitEncryptionEnabled after the cluster is created. To enable in-transit encryption on a cluster you must set TransitEncryptionEnabled to true when you create a cluster.  Required: Only available when creating a replication group in an Amazon VPC using redis version 3.2.6, 4.x or later. Default: false 
    */
  var TransitEncryptionEnabled: js.UndefOr[BooleanOptional] = js.undefined
}

object ReplicationGroup {
  @scala.inline
  def apply(
    AtRestEncryptionEnabled: js.UndefOr[BooleanOptional] = js.undefined,
    AuthTokenEnabled: js.UndefOr[BooleanOptional] = js.undefined,
    AutomaticFailover: AutomaticFailoverStatus = null,
    CacheNodeType: String = null,
    ClusterEnabled: js.UndefOr[BooleanOptional] = js.undefined,
    ConfigurationEndpoint: Endpoint = null,
    Description: String = null,
    KmsKeyId: String = null,
    MemberClusters: ClusterIdList = null,
    NodeGroups: NodeGroupList = null,
    PendingModifiedValues: ReplicationGroupPendingModifiedValues = null,
    ReplicationGroupId: String = null,
    SnapshotRetentionLimit: js.UndefOr[IntegerOptional] = js.undefined,
    SnapshotWindow: String = null,
    SnapshottingClusterId: String = null,
    Status: String = null,
    TransitEncryptionEnabled: js.UndefOr[BooleanOptional] = js.undefined
  ): ReplicationGroup = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(AtRestEncryptionEnabled)) __obj.updateDynamic("AtRestEncryptionEnabled")(AtRestEncryptionEnabled)
    if (!js.isUndefined(AuthTokenEnabled)) __obj.updateDynamic("AuthTokenEnabled")(AuthTokenEnabled)
    if (AutomaticFailover != null) __obj.updateDynamic("AutomaticFailover")(AutomaticFailover.asInstanceOf[js.Any])
    if (CacheNodeType != null) __obj.updateDynamic("CacheNodeType")(CacheNodeType)
    if (!js.isUndefined(ClusterEnabled)) __obj.updateDynamic("ClusterEnabled")(ClusterEnabled)
    if (ConfigurationEndpoint != null) __obj.updateDynamic("ConfigurationEndpoint")(ConfigurationEndpoint)
    if (Description != null) __obj.updateDynamic("Description")(Description)
    if (KmsKeyId != null) __obj.updateDynamic("KmsKeyId")(KmsKeyId)
    if (MemberClusters != null) __obj.updateDynamic("MemberClusters")(MemberClusters)
    if (NodeGroups != null) __obj.updateDynamic("NodeGroups")(NodeGroups)
    if (PendingModifiedValues != null) __obj.updateDynamic("PendingModifiedValues")(PendingModifiedValues)
    if (ReplicationGroupId != null) __obj.updateDynamic("ReplicationGroupId")(ReplicationGroupId)
    if (!js.isUndefined(SnapshotRetentionLimit)) __obj.updateDynamic("SnapshotRetentionLimit")(SnapshotRetentionLimit)
    if (SnapshotWindow != null) __obj.updateDynamic("SnapshotWindow")(SnapshotWindow)
    if (SnapshottingClusterId != null) __obj.updateDynamic("SnapshottingClusterId")(SnapshottingClusterId)
    if (Status != null) __obj.updateDynamic("Status")(Status)
    if (!js.isUndefined(TransitEncryptionEnabled)) __obj.updateDynamic("TransitEncryptionEnabled")(TransitEncryptionEnabled)
    __obj.asInstanceOf[ReplicationGroup]
  }
}

