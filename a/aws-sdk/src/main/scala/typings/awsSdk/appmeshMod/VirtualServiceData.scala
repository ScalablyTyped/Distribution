package typings.awsSdk.appmeshMod

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
  
  @scala.inline
  def apply(
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
  implicit class VirtualServiceDataMutableBuilder[Self <: VirtualServiceData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMeshName(value: ResourceName): Self = StObject.set(x, "meshName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetadata(value: ResourceMetadata): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpec(value: VirtualServiceSpec): Self = StObject.set(x, "spec", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatus(value: VirtualServiceStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVirtualServiceName(value: ServiceName): Self = StObject.set(x, "virtualServiceName", value.asInstanceOf[js.Any])
  }
}
