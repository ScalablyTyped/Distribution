package typings.awsSdk.clientsAppmeshMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VirtualNodeData extends StObject {
  
  /**
    * The name of the service mesh that the virtual node resides in.
    */
  var meshName: ResourceName
  
  /**
    * The associated metadata for the virtual node.
    */
  var metadata: ResourceMetadata
  
  /**
    * The specifications of the virtual node.
    */
  var spec: VirtualNodeSpec
  
  /**
    * The current status for the virtual node.
    */
  var status: VirtualNodeStatus
  
  /**
    * The name of the virtual node.
    */
  var virtualNodeName: ResourceName
}
object VirtualNodeData {
  
  inline def apply(
    meshName: ResourceName,
    metadata: ResourceMetadata,
    spec: VirtualNodeSpec,
    status: VirtualNodeStatus,
    virtualNodeName: ResourceName
  ): VirtualNodeData = {
    val __obj = js.Dynamic.literal(meshName = meshName.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], spec = spec.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], virtualNodeName = virtualNodeName.asInstanceOf[js.Any])
    __obj.asInstanceOf[VirtualNodeData]
  }
  
  extension [Self <: VirtualNodeData](x: Self) {
    
    inline def setMeshName(value: ResourceName): Self = StObject.set(x, "meshName", value.asInstanceOf[js.Any])
    
    inline def setMetadata(value: ResourceMetadata): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    inline def setSpec(value: VirtualNodeSpec): Self = StObject.set(x, "spec", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: VirtualNodeStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setVirtualNodeName(value: ResourceName): Self = StObject.set(x, "virtualNodeName", value.asInstanceOf[js.Any])
  }
}
