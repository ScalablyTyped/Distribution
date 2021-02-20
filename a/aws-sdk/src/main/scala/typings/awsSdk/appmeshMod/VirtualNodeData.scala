package typings.awsSdk.appmeshMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VirtualNodeData extends StObject {
  
  /**
    * The name of the service mesh that the virtual node resides in.
    */
  var meshName: ResourceName = js.native
  
  /**
    * The associated metadata for the virtual node.
    */
  var metadata: ResourceMetadata = js.native
  
  /**
    * The specifications of the virtual node.
    */
  var spec: VirtualNodeSpec = js.native
  
  /**
    * The current status for the virtual node.
    */
  var status: VirtualNodeStatus = js.native
  
  /**
    * The name of the virtual node.
    */
  var virtualNodeName: ResourceName = js.native
}
object VirtualNodeData {
  
  @scala.inline
  def apply(
    meshName: ResourceName,
    metadata: ResourceMetadata,
    spec: VirtualNodeSpec,
    status: VirtualNodeStatus,
    virtualNodeName: ResourceName
  ): VirtualNodeData = {
    val __obj = js.Dynamic.literal(meshName = meshName.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], spec = spec.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], virtualNodeName = virtualNodeName.asInstanceOf[js.Any])
    __obj.asInstanceOf[VirtualNodeData]
  }
  
  @scala.inline
  implicit class VirtualNodeDataMutableBuilder[Self <: VirtualNodeData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMeshName(value: ResourceName): Self = StObject.set(x, "meshName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetadata(value: ResourceMetadata): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpec(value: VirtualNodeSpec): Self = StObject.set(x, "spec", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatus(value: VirtualNodeStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVirtualNodeName(value: ResourceName): Self = StObject.set(x, "virtualNodeName", value.asInstanceOf[js.Any])
  }
}
