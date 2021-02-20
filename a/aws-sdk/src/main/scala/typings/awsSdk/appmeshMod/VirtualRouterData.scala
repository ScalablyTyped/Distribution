package typings.awsSdk.appmeshMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VirtualRouterData extends StObject {
  
  /**
    * The name of the service mesh that the virtual router resides in.
    */
  var meshName: ResourceName = js.native
  
  /**
    * The associated metadata for the virtual router.
    */
  var metadata: ResourceMetadata = js.native
  
  /**
    * The specifications of the virtual router.
    */
  var spec: VirtualRouterSpec = js.native
  
  /**
    * The current status of the virtual router.
    */
  var status: VirtualRouterStatus = js.native
  
  /**
    * The name of the virtual router.
    */
  var virtualRouterName: ResourceName = js.native
}
object VirtualRouterData {
  
  @scala.inline
  def apply(
    meshName: ResourceName,
    metadata: ResourceMetadata,
    spec: VirtualRouterSpec,
    status: VirtualRouterStatus,
    virtualRouterName: ResourceName
  ): VirtualRouterData = {
    val __obj = js.Dynamic.literal(meshName = meshName.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], spec = spec.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], virtualRouterName = virtualRouterName.asInstanceOf[js.Any])
    __obj.asInstanceOf[VirtualRouterData]
  }
  
  @scala.inline
  implicit class VirtualRouterDataMutableBuilder[Self <: VirtualRouterData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMeshName(value: ResourceName): Self = StObject.set(x, "meshName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetadata(value: ResourceMetadata): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpec(value: VirtualRouterSpec): Self = StObject.set(x, "spec", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatus(value: VirtualRouterStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVirtualRouterName(value: ResourceName): Self = StObject.set(x, "virtualRouterName", value.asInstanceOf[js.Any])
  }
}
