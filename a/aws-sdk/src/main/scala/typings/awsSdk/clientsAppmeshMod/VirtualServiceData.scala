package typings.awsSdk.clientsAppmeshMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VirtualServiceData extends StObject {
  
  /**
    * The name of the service mesh that the virtual service resides in.
    */
  var meshName: ResourceName
  
  var metadata: ResourceMetadata
  
  /**
    * The specifications of the virtual service.
    */
  var spec: VirtualServiceSpec
  
  /**
    * The current status of the virtual service.
    */
  var status: VirtualServiceStatus
  
  /**
    * The name of the virtual service.
    */
  var virtualServiceName: ServiceName
}
object VirtualServiceData {
  
  inline def apply(
    meshName: ResourceName,
    metadata: ResourceMetadata,
    spec: VirtualServiceSpec,
    status: VirtualServiceStatus,
    virtualServiceName: ServiceName
  ): VirtualServiceData = {
    val __obj = js.Dynamic.literal(meshName = meshName.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], spec = spec.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], virtualServiceName = virtualServiceName.asInstanceOf[js.Any])
    __obj.asInstanceOf[VirtualServiceData]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: VirtualServiceData] (val x: Self) extends AnyVal {
    
    inline def setMeshName(value: ResourceName): Self = StObject.set(x, "meshName", value.asInstanceOf[js.Any])
    
    inline def setMetadata(value: ResourceMetadata): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    inline def setSpec(value: VirtualServiceSpec): Self = StObject.set(x, "spec", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: VirtualServiceStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setVirtualServiceName(value: ServiceName): Self = StObject.set(x, "virtualServiceName", value.asInstanceOf[js.Any])
  }
}
