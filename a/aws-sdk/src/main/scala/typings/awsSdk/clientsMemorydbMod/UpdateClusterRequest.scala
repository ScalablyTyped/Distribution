package typings.awsSdk.clientsMemorydbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateClusterRequest extends StObject {
  
  /**
    * The Access Control List that is associated with the cluster
    */
  var ACLName: js.UndefOr[typings.awsSdk.clientsMemorydbMod.ACLName] = js.undefined
  
  /**
    * The name of the cluster to update
    */
  var ClusterName: String
  
  /**
    * The description of the cluster to update
    */
  var Description: js.UndefOr[String] = js.undefined
  
  /**
    * The upgraded version of the engine to be run on the nodes. You can upgrade to a newer engine version, but you cannot downgrade to an earlier engine version. If you want to use an earlier engine version, you must delete the existing cluster and create it anew with the earlier engine version.
    */
  var EngineVersion: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies the weekly time range during which maintenance on the cluster is performed. It is specified as a range in the format ddd:hh24:mi-ddd:hh24:mi (24H Clock UTC). The minimum maintenance window is a 60 minute period. Valid values for ddd are:    sun     mon     tue     wed     thu     fri     sat    Example: sun:23:00-mon:01:30 
    */
  var MaintenanceWindow: js.UndefOr[String] = js.undefined
  
  /**
    * A valid node type that you want to scale this cluster up or down to.
    */
  var NodeType: js.UndefOr[String] = js.undefined
  
  /**
    * The name of the parameter group to update
    */
  var ParameterGroupName: js.UndefOr[String] = js.undefined
  
  /**
    * The number of replicas that will reside in each shard
    */
  var ReplicaConfiguration: js.UndefOr[ReplicaConfigurationRequest] = js.undefined
  
  /**
    * The SecurityGroupIds to update
    */
  var SecurityGroupIds: js.UndefOr[SecurityGroupIdsList] = js.undefined
  
  /**
    * The number of shards in the cluster
    */
  var ShardConfiguration: js.UndefOr[ShardConfigurationRequest] = js.undefined
  
  /**
    * The number of days for which MemoryDB retains automatic cluster snapshots before deleting them. For example, if you set SnapshotRetentionLimit to 5, a snapshot that was taken today is retained for 5 days before being deleted.
    */
  var SnapshotRetentionLimit: js.UndefOr[IntegerOptional] = js.undefined
  
  /**
    * The daily time range (in UTC) during which MemoryDB begins taking a daily snapshot of your cluster.
    */
  var SnapshotWindow: js.UndefOr[String] = js.undefined
  
  /**
    * The SNS topic ARN to update
    */
  var SnsTopicArn: js.UndefOr[String] = js.undefined
  
  /**
    * The status of the Amazon SNS notification topic. Notifications are sent only if the status is active.
    */
  var SnsTopicStatus: js.UndefOr[String] = js.undefined
}
object UpdateClusterRequest {
  
  inline def apply(ClusterName: String): UpdateClusterRequest = {
    val __obj = js.Dynamic.literal(ClusterName = ClusterName.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateClusterRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateClusterRequest] (val x: Self) extends AnyVal {
    
    inline def setACLName(value: ACLName): Self = StObject.set(x, "ACLName", value.asInstanceOf[js.Any])
    
    inline def setACLNameUndefined: Self = StObject.set(x, "ACLName", js.undefined)
    
    inline def setClusterName(value: String): Self = StObject.set(x, "ClusterName", value.asInstanceOf[js.Any])
    
    inline def setDescription(value: String): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setEngineVersion(value: String): Self = StObject.set(x, "EngineVersion", value.asInstanceOf[js.Any])
    
    inline def setEngineVersionUndefined: Self = StObject.set(x, "EngineVersion", js.undefined)
    
    inline def setMaintenanceWindow(value: String): Self = StObject.set(x, "MaintenanceWindow", value.asInstanceOf[js.Any])
    
    inline def setMaintenanceWindowUndefined: Self = StObject.set(x, "MaintenanceWindow", js.undefined)
    
    inline def setNodeType(value: String): Self = StObject.set(x, "NodeType", value.asInstanceOf[js.Any])
    
    inline def setNodeTypeUndefined: Self = StObject.set(x, "NodeType", js.undefined)
    
    inline def setParameterGroupName(value: String): Self = StObject.set(x, "ParameterGroupName", value.asInstanceOf[js.Any])
    
    inline def setParameterGroupNameUndefined: Self = StObject.set(x, "ParameterGroupName", js.undefined)
    
    inline def setReplicaConfiguration(value: ReplicaConfigurationRequest): Self = StObject.set(x, "ReplicaConfiguration", value.asInstanceOf[js.Any])
    
    inline def setReplicaConfigurationUndefined: Self = StObject.set(x, "ReplicaConfiguration", js.undefined)
    
    inline def setSecurityGroupIds(value: SecurityGroupIdsList): Self = StObject.set(x, "SecurityGroupIds", value.asInstanceOf[js.Any])
    
    inline def setSecurityGroupIdsUndefined: Self = StObject.set(x, "SecurityGroupIds", js.undefined)
    
    inline def setSecurityGroupIdsVarargs(value: String*): Self = StObject.set(x, "SecurityGroupIds", js.Array(value*))
    
    inline def setShardConfiguration(value: ShardConfigurationRequest): Self = StObject.set(x, "ShardConfiguration", value.asInstanceOf[js.Any])
    
    inline def setShardConfigurationUndefined: Self = StObject.set(x, "ShardConfiguration", js.undefined)
    
    inline def setSnapshotRetentionLimit(value: IntegerOptional): Self = StObject.set(x, "SnapshotRetentionLimit", value.asInstanceOf[js.Any])
    
    inline def setSnapshotRetentionLimitUndefined: Self = StObject.set(x, "SnapshotRetentionLimit", js.undefined)
    
    inline def setSnapshotWindow(value: String): Self = StObject.set(x, "SnapshotWindow", value.asInstanceOf[js.Any])
    
    inline def setSnapshotWindowUndefined: Self = StObject.set(x, "SnapshotWindow", js.undefined)
    
    inline def setSnsTopicArn(value: String): Self = StObject.set(x, "SnsTopicArn", value.asInstanceOf[js.Any])
    
    inline def setSnsTopicArnUndefined: Self = StObject.set(x, "SnsTopicArn", js.undefined)
    
    inline def setSnsTopicStatus(value: String): Self = StObject.set(x, "SnsTopicStatus", value.asInstanceOf[js.Any])
    
    inline def setSnsTopicStatusUndefined: Self = StObject.set(x, "SnsTopicStatus", js.undefined)
  }
}
