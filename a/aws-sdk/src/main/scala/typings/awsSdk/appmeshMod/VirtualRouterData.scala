package typings.awsSdk.appmeshMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VirtualRouterData extends StObject {
  
  /**
    * The name of the service mesh that the virtual router resides in.
    */
  var meshName: ResourceName
  
  /**
    * The associated metadata for the virtual router.
    */
  var metadata: ResourceMetadata
  
  /**
    * The specifications of the virtual router.
    */
  var spec: VirtualRouterSpec
  
  /**
    * The current status of the virtual router.
    */
  var status: VirtualRouterStatus
  
  /**
    * The name of the virtual router.
    */
  var virtualRouterName: ResourceName
}
object VirtualRouterData {
  
  inline def apply(
    meshName: ResourceName,
    metadata: ResourceMetadata,
    spec: VirtualRouterSpec,
    status: VirtualRouterStatus,
    virtualRouterName: ResourceName
  ): VirtualRouterData = {
    val __obj = js.Dynamic.literal(meshName = meshName.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], spec = spec.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], virtualRouterName = virtualRouterName.asInstanceOf[js.Any])
    __obj.asInstanceOf[VirtualRouterData]
  }
  
  extension [Self <: VirtualRouterData](x: Self) {
    
    inline def setMeshName(value: ResourceName): Self = StObject.set(x, "meshName", value.asInstanceOf[js.Any])
    
    inline def setMetadata(value: ResourceMetadata): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    inline def setSpec(value: VirtualRouterSpec): Self = StObject.set(x, "spec", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: VirtualRouterStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setVirtualRouterName(value: ResourceName): Self = StObject.set(x, "virtualRouterName", value.asInstanceOf[js.Any])
  }
}
