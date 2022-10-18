package typings.awsSdk.clientsAppmeshMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VirtualGatewayData extends StObject {
  
  /**
    * The name of the service mesh that the virtual gateway resides in.
    */
  var meshName: ResourceName
  
  var metadata: ResourceMetadata
  
  /**
    * The specifications of the virtual gateway.
    */
  var spec: VirtualGatewaySpec
  
  /**
    * The current status of the virtual gateway.
    */
  var status: VirtualGatewayStatus
  
  /**
    * The name of the virtual gateway.
    */
  var virtualGatewayName: ResourceName
}
object VirtualGatewayData {
  
  inline def apply(
    meshName: ResourceName,
    metadata: ResourceMetadata,
    spec: VirtualGatewaySpec,
    status: VirtualGatewayStatus,
    virtualGatewayName: ResourceName
  ): VirtualGatewayData = {
    val __obj = js.Dynamic.literal(meshName = meshName.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], spec = spec.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], virtualGatewayName = virtualGatewayName.asInstanceOf[js.Any])
    __obj.asInstanceOf[VirtualGatewayData]
  }
  
  extension [Self <: VirtualGatewayData](x: Self) {
    
    inline def setMeshName(value: ResourceName): Self = StObject.set(x, "meshName", value.asInstanceOf[js.Any])
    
    inline def setMetadata(value: ResourceMetadata): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    inline def setSpec(value: VirtualGatewaySpec): Self = StObject.set(x, "spec", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: VirtualGatewayStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setVirtualGatewayName(value: ResourceName): Self = StObject.set(x, "virtualGatewayName", value.asInstanceOf[js.Any])
  }
}
