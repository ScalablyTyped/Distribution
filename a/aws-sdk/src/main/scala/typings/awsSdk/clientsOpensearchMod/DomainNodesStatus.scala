package typings.awsSdk.clientsOpensearchMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DomainNodesStatus extends StObject {
  
  /**
    * The Availability Zone of the node.
    */
  var AvailabilityZone: js.UndefOr[typings.awsSdk.clientsOpensearchMod.AvailabilityZone] = js.undefined
  
  /**
    * The instance type information of the node.
    */
  var InstanceType: js.UndefOr[OpenSearchPartitionInstanceType] = js.undefined
  
  /**
    * The ID of the node.
    */
  var NodeId: js.UndefOr[typings.awsSdk.clientsOpensearchMod.NodeId] = js.undefined
  
  /**
    * Indicates if the node is active or in standby.
    */
  var NodeStatus: js.UndefOr[typings.awsSdk.clientsOpensearchMod.NodeStatus] = js.undefined
  
  /**
    * Indicates whether the nodes is a data, master, or ultrawarm node.
    */
  var NodeType: js.UndefOr[typings.awsSdk.clientsOpensearchMod.NodeType] = js.undefined
  
  /**
    * The storage size of the node, in GiB.
    */
  var StorageSize: js.UndefOr[VolumeSize] = js.undefined
  
  /**
    * Indicates if the node has EBS or instance storage. 
    */
  var StorageType: js.UndefOr[StorageTypeName] = js.undefined
  
  /**
    * If the nodes has EBS storage, indicates if the volume type is GP2 or GP3. Only applicable for data nodes. 
    */
  var StorageVolumeType: js.UndefOr[VolumeType] = js.undefined
}
object DomainNodesStatus {
  
  inline def apply(): DomainNodesStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DomainNodesStatus]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DomainNodesStatus] (val x: Self) extends AnyVal {
    
    inline def setAvailabilityZone(value: AvailabilityZone): Self = StObject.set(x, "AvailabilityZone", value.asInstanceOf[js.Any])
    
    inline def setAvailabilityZoneUndefined: Self = StObject.set(x, "AvailabilityZone", js.undefined)
    
    inline def setInstanceType(value: OpenSearchPartitionInstanceType): Self = StObject.set(x, "InstanceType", value.asInstanceOf[js.Any])
    
    inline def setInstanceTypeUndefined: Self = StObject.set(x, "InstanceType", js.undefined)
    
    inline def setNodeId(value: NodeId): Self = StObject.set(x, "NodeId", value.asInstanceOf[js.Any])
    
    inline def setNodeIdUndefined: Self = StObject.set(x, "NodeId", js.undefined)
    
    inline def setNodeStatus(value: NodeStatus): Self = StObject.set(x, "NodeStatus", value.asInstanceOf[js.Any])
    
    inline def setNodeStatusUndefined: Self = StObject.set(x, "NodeStatus", js.undefined)
    
    inline def setNodeType(value: NodeType): Self = StObject.set(x, "NodeType", value.asInstanceOf[js.Any])
    
    inline def setNodeTypeUndefined: Self = StObject.set(x, "NodeType", js.undefined)
    
    inline def setStorageSize(value: VolumeSize): Self = StObject.set(x, "StorageSize", value.asInstanceOf[js.Any])
    
    inline def setStorageSizeUndefined: Self = StObject.set(x, "StorageSize", js.undefined)
    
    inline def setStorageType(value: StorageTypeName): Self = StObject.set(x, "StorageType", value.asInstanceOf[js.Any])
    
    inline def setStorageTypeUndefined: Self = StObject.set(x, "StorageType", js.undefined)
    
    inline def setStorageVolumeType(value: VolumeType): Self = StObject.set(x, "StorageVolumeType", value.asInstanceOf[js.Any])
    
    inline def setStorageVolumeTypeUndefined: Self = StObject.set(x, "StorageVolumeType", js.undefined)
  }
}
