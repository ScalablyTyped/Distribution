package typings.awsSdk.clientsMemorydbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateClusterRequest extends StObject {
  
  /**
    * The name of the Access Control List to associate with the cluster.
    */
  var ACLName: typings.awsSdk.clientsMemorydbMod.ACLName
  
  /**
    * When set to true, the cluster will automatically receive minor engine version upgrades after launch.
    */
  var AutoMinorVersionUpgrade: js.UndefOr[BooleanOptional] = js.undefined
  
  /**
    * The name of the cluster. This value must be unique as it also serves as the cluster identifier.
    */
  var ClusterName: String
  
  /**
    * Enables data tiering. Data tiering is only supported for clusters using the r6gd node type. This parameter must be set when using r6gd nodes. For more information, see Data tiering.
    */
  var DataTiering: js.UndefOr[BooleanOptional] = js.undefined
  
  /**
    * An optional description of the cluster.
    */
  var Description: js.UndefOr[String] = js.undefined
  
  /**
    * The version number of the Redis engine to be used for the cluster.
    */
  var EngineVersion: js.UndefOr[String] = js.undefined
  
  /**
    * The ID of the KMS key used to encrypt the cluster.
    */
  var KmsKeyId: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies the weekly time range during which maintenance on the cluster is performed. It is specified as a range in the format ddd:hh24:mi-ddd:hh24:mi (24H Clock UTC). The minimum maintenance window is a 60 minute period. Valid values for ddd are:    sun     mon     tue     wed     thu     fri     sat    Example: sun:23:00-mon:01:30 
    */
  var MaintenanceWindow: js.UndefOr[String] = js.undefined
  
  /**
    * The compute and memory capacity of the nodes in the cluster.
    */
  var NodeType: String
  
  /**
    * The number of replicas to apply to each shard. The default value is 1. The maximum is 5. 
    */
  var NumReplicasPerShard: js.UndefOr[IntegerOptional] = js.undefined
  
  /**
    * The number of shards the cluster will contain. The default value is 1. 
    */
  var NumShards: js.UndefOr[IntegerOptional] = js.undefined
  
  /**
    * The name of the parameter group associated with the cluster.
    */
  var ParameterGroupName: js.UndefOr[String] = js.undefined
  
  /**
    * The port number on which each of the nodes accepts connections.
    */
  var Port: js.UndefOr[IntegerOptional] = js.undefined
  
  /**
    * A list of security group names to associate with this cluster.
    */
  var SecurityGroupIds: js.UndefOr[SecurityGroupIdsList] = js.undefined
  
  /**
    * A list of Amazon Resource Names (ARN) that uniquely identify the RDB snapshot files stored in Amazon S3. The snapshot files are used to populate the new cluster. The Amazon S3 object name in the ARN cannot contain any commas.
    */
  var SnapshotArns: js.UndefOr[SnapshotArnsList] = js.undefined
  
  /**
    * The name of a snapshot from which to restore data into the new cluster. The snapshot status changes to restoring while the new cluster is being created.
    */
  var SnapshotName: js.UndefOr[String] = js.undefined
  
  /**
    * The number of days for which MemoryDB retains automatic snapshots before deleting them. For example, if you set SnapshotRetentionLimit to 5, a snapshot that was taken today is retained for 5 days before being deleted.
    */
  var SnapshotRetentionLimit: js.UndefOr[IntegerOptional] = js.undefined
  
  /**
    * The daily time range (in UTC) during which MemoryDB begins taking a daily snapshot of your shard.  Example: 05:00-09:00  If you do not specify this parameter, MemoryDB automatically chooses an appropriate time range.
    */
  var SnapshotWindow: js.UndefOr[String] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the Amazon Simple Notification Service (SNS) topic to which notifications are sent.
    */
  var SnsTopicArn: js.UndefOr[String] = js.undefined
  
  /**
    * The name of the subnet group to be used for the cluster.
    */
  var SubnetGroupName: js.UndefOr[String] = js.undefined
  
  /**
    * A flag to enable in-transit encryption on the cluster.
    */
  var TLSEnabled: js.UndefOr[BooleanOptional] = js.undefined
  
  /**
    * A list of tags to be added to this resource. Tags are comma-separated key,value pairs (e.g. Key=myKey, Value=myKeyValue. You can include multiple tags as shown following: Key=myKey, Value=myKeyValue Key=mySecondKey, Value=mySecondKeyValue.
    */
  var Tags: js.UndefOr[TagList] = js.undefined
}
object CreateClusterRequest {
  
  inline def apply(ACLName: ACLName, ClusterName: String, NodeType: String): CreateClusterRequest = {
    val __obj = js.Dynamic.literal(ACLName = ACLName.asInstanceOf[js.Any], ClusterName = ClusterName.asInstanceOf[js.Any], NodeType = NodeType.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateClusterRequest]
  }
  
  extension [Self <: CreateClusterRequest](x: Self) {
    
    inline def setACLName(value: ACLName): Self = StObject.set(x, "ACLName", value.asInstanceOf[js.Any])
    
    inline def setAutoMinorVersionUpgrade(value: BooleanOptional): Self = StObject.set(x, "AutoMinorVersionUpgrade", value.asInstanceOf[js.Any])
    
    inline def setAutoMinorVersionUpgradeUndefined: Self = StObject.set(x, "AutoMinorVersionUpgrade", js.undefined)
    
    inline def setClusterName(value: String): Self = StObject.set(x, "ClusterName", value.asInstanceOf[js.Any])
    
    inline def setDataTiering(value: BooleanOptional): Self = StObject.set(x, "DataTiering", value.asInstanceOf[js.Any])
    
    inline def setDataTieringUndefined: Self = StObject.set(x, "DataTiering", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setEngineVersion(value: String): Self = StObject.set(x, "EngineVersion", value.asInstanceOf[js.Any])
    
    inline def setEngineVersionUndefined: Self = StObject.set(x, "EngineVersion", js.undefined)
    
    inline def setKmsKeyId(value: String): Self = StObject.set(x, "KmsKeyId", value.asInstanceOf[js.Any])
    
    inline def setKmsKeyIdUndefined: Self = StObject.set(x, "KmsKeyId", js.undefined)
    
    inline def setMaintenanceWindow(value: String): Self = StObject.set(x, "MaintenanceWindow", value.asInstanceOf[js.Any])
    
    inline def setMaintenanceWindowUndefined: Self = StObject.set(x, "MaintenanceWindow", js.undefined)
    
    inline def setNodeType(value: String): Self = StObject.set(x, "NodeType", value.asInstanceOf[js.Any])
    
    inline def setNumReplicasPerShard(value: IntegerOptional): Self = StObject.set(x, "NumReplicasPerShard", value.asInstanceOf[js.Any])
    
    inline def setNumReplicasPerShardUndefined: Self = StObject.set(x, "NumReplicasPerShard", js.undefined)
    
    inline def setNumShards(value: IntegerOptional): Self = StObject.set(x, "NumShards", value.asInstanceOf[js.Any])
    
    inline def setNumShardsUndefined: Self = StObject.set(x, "NumShards", js.undefined)
    
    inline def setParameterGroupName(value: String): Self = StObject.set(x, "ParameterGroupName", value.asInstanceOf[js.Any])
    
    inline def setParameterGroupNameUndefined: Self = StObject.set(x, "ParameterGroupName", js.undefined)
    
    inline def setPort(value: IntegerOptional): Self = StObject.set(x, "Port", value.asInstanceOf[js.Any])
    
    inline def setPortUndefined: Self = StObject.set(x, "Port", js.undefined)
    
    inline def setSecurityGroupIds(value: SecurityGroupIdsList): Self = StObject.set(x, "SecurityGroupIds", value.asInstanceOf[js.Any])
    
    inline def setSecurityGroupIdsUndefined: Self = StObject.set(x, "SecurityGroupIds", js.undefined)
    
    inline def setSecurityGroupIdsVarargs(value: String*): Self = StObject.set(x, "SecurityGroupIds", js.Array(value*))
    
    inline def setSnapshotArns(value: SnapshotArnsList): Self = StObject.set(x, "SnapshotArns", value.asInstanceOf[js.Any])
    
    inline def setSnapshotArnsUndefined: Self = StObject.set(x, "SnapshotArns", js.undefined)
    
    inline def setSnapshotArnsVarargs(value: String*): Self = StObject.set(x, "SnapshotArns", js.Array(value*))
    
    inline def setSnapshotName(value: String): Self = StObject.set(x, "SnapshotName", value.asInstanceOf[js.Any])
    
    inline def setSnapshotNameUndefined: Self = StObject.set(x, "SnapshotName", js.undefined)
    
    inline def setSnapshotRetentionLimit(value: IntegerOptional): Self = StObject.set(x, "SnapshotRetentionLimit", value.asInstanceOf[js.Any])
    
    inline def setSnapshotRetentionLimitUndefined: Self = StObject.set(x, "SnapshotRetentionLimit", js.undefined)
    
    inline def setSnapshotWindow(value: String): Self = StObject.set(x, "SnapshotWindow", value.asInstanceOf[js.Any])
    
    inline def setSnapshotWindowUndefined: Self = StObject.set(x, "SnapshotWindow", js.undefined)
    
    inline def setSnsTopicArn(value: String): Self = StObject.set(x, "SnsTopicArn", value.asInstanceOf[js.Any])
    
    inline def setSnsTopicArnUndefined: Self = StObject.set(x, "SnsTopicArn", js.undefined)
    
    inline def setSubnetGroupName(value: String): Self = StObject.set(x, "SubnetGroupName", value.asInstanceOf[js.Any])
    
    inline def setSubnetGroupNameUndefined: Self = StObject.set(x, "SubnetGroupName", js.undefined)
    
    inline def setTLSEnabled(value: BooleanOptional): Self = StObject.set(x, "TLSEnabled", value.asInstanceOf[js.Any])
    
    inline def setTLSEnabledUndefined: Self = StObject.set(x, "TLSEnabled", js.undefined)
    
    inline def setTags(value: TagList): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value*))
  }
}
