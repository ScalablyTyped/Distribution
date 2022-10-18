package typings.awsSdk.clientsMemorydbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClusterConfiguration extends StObject {
  
  /**
    * The description of the cluster configuration
    */
  var Description: js.UndefOr[String] = js.undefined
  
  /**
    * The Redis engine version used by the cluster
    */
  var EngineVersion: js.UndefOr[String] = js.undefined
  
  /**
    * The specified maintenance window for the cluster
    */
  var MaintenanceWindow: js.UndefOr[String] = js.undefined
  
  /**
    * The name of the cluster
    */
  var Name: js.UndefOr[String] = js.undefined
  
  /**
    * The node type used for the cluster
    */
  var NodeType: js.UndefOr[String] = js.undefined
  
  /**
    * The number of shards in the cluster
    */
  var NumShards: js.UndefOr[IntegerOptional] = js.undefined
  
  /**
    * The name of parameter group used by the cluster
    */
  var ParameterGroupName: js.UndefOr[String] = js.undefined
  
  /**
    * The port used by the cluster
    */
  var Port: js.UndefOr[IntegerOptional] = js.undefined
  
  /**
    * The list of shards in the cluster
    */
  var Shards: js.UndefOr[ShardDetails] = js.undefined
  
  /**
    * The snapshot retention limit set by the cluster
    */
  var SnapshotRetentionLimit: js.UndefOr[IntegerOptional] = js.undefined
  
  /**
    * The snapshot window set by the cluster
    */
  var SnapshotWindow: js.UndefOr[String] = js.undefined
  
  /**
    * The name of the subnet group used by the cluster
    */
  var SubnetGroupName: js.UndefOr[String] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the SNS notification topic for the cluster
    */
  var TopicArn: js.UndefOr[String] = js.undefined
  
  /**
    * The ID of the VPC the cluster belongs to
    */
  var VpcId: js.UndefOr[String] = js.undefined
}
object ClusterConfiguration {
  
  inline def apply(): ClusterConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClusterConfiguration]
  }
  
  extension [Self <: ClusterConfiguration](x: Self) {
    
    inline def setDescription(value: String): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setEngineVersion(value: String): Self = StObject.set(x, "EngineVersion", value.asInstanceOf[js.Any])
    
    inline def setEngineVersionUndefined: Self = StObject.set(x, "EngineVersion", js.undefined)
    
    inline def setMaintenanceWindow(value: String): Self = StObject.set(x, "MaintenanceWindow", value.asInstanceOf[js.Any])
    
    inline def setMaintenanceWindowUndefined: Self = StObject.set(x, "MaintenanceWindow", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    inline def setNodeType(value: String): Self = StObject.set(x, "NodeType", value.asInstanceOf[js.Any])
    
    inline def setNodeTypeUndefined: Self = StObject.set(x, "NodeType", js.undefined)
    
    inline def setNumShards(value: IntegerOptional): Self = StObject.set(x, "NumShards", value.asInstanceOf[js.Any])
    
    inline def setNumShardsUndefined: Self = StObject.set(x, "NumShards", js.undefined)
    
    inline def setParameterGroupName(value: String): Self = StObject.set(x, "ParameterGroupName", value.asInstanceOf[js.Any])
    
    inline def setParameterGroupNameUndefined: Self = StObject.set(x, "ParameterGroupName", js.undefined)
    
    inline def setPort(value: IntegerOptional): Self = StObject.set(x, "Port", value.asInstanceOf[js.Any])
    
    inline def setPortUndefined: Self = StObject.set(x, "Port", js.undefined)
    
    inline def setShards(value: ShardDetails): Self = StObject.set(x, "Shards", value.asInstanceOf[js.Any])
    
    inline def setShardsUndefined: Self = StObject.set(x, "Shards", js.undefined)
    
    inline def setShardsVarargs(value: ShardDetail*): Self = StObject.set(x, "Shards", js.Array(value*))
    
    inline def setSnapshotRetentionLimit(value: IntegerOptional): Self = StObject.set(x, "SnapshotRetentionLimit", value.asInstanceOf[js.Any])
    
    inline def setSnapshotRetentionLimitUndefined: Self = StObject.set(x, "SnapshotRetentionLimit", js.undefined)
    
    inline def setSnapshotWindow(value: String): Self = StObject.set(x, "SnapshotWindow", value.asInstanceOf[js.Any])
    
    inline def setSnapshotWindowUndefined: Self = StObject.set(x, "SnapshotWindow", js.undefined)
    
    inline def setSubnetGroupName(value: String): Self = StObject.set(x, "SubnetGroupName", value.asInstanceOf[js.Any])
    
    inline def setSubnetGroupNameUndefined: Self = StObject.set(x, "SubnetGroupName", js.undefined)
    
    inline def setTopicArn(value: String): Self = StObject.set(x, "TopicArn", value.asInstanceOf[js.Any])
    
    inline def setTopicArnUndefined: Self = StObject.set(x, "TopicArn", js.undefined)
    
    inline def setVpcId(value: String): Self = StObject.set(x, "VpcId", value.asInstanceOf[js.Any])
    
    inline def setVpcIdUndefined: Self = StObject.set(x, "VpcId", js.undefined)
  }
}
