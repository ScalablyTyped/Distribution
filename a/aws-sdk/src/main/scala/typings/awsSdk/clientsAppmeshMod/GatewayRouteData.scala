package typings.awsSdk.clientsAppmeshMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GatewayRouteData extends StObject {
  
  /**
    * The name of the gateway route.
    */
  var gatewayRouteName: ResourceName
  
  /**
    * The name of the service mesh that the resource resides in. 
    */
  var meshName: ResourceName
  
  var metadata: ResourceMetadata
  
  /**
    * The specifications of the gateway route.
    */
  var spec: GatewayRouteSpec
  
  /**
    * The status of the gateway route.
    */
  var status: GatewayRouteStatus
  
  /**
    * The virtual gateway that the gateway route is associated with.
    */
  var virtualGatewayName: ResourceName
}
object GatewayRouteData {
  
  inline def apply(
    gatewayRouteName: ResourceName,
    meshName: ResourceName,
    metadata: ResourceMetadata,
    spec: GatewayRouteSpec,
    status: GatewayRouteStatus,
    virtualGatewayName: ResourceName
  ): GatewayRouteData = {
    val __obj = js.Dynamic.literal(gatewayRouteName = gatewayRouteName.asInstanceOf[js.Any], meshName = meshName.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], spec = spec.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], virtualGatewayName = virtualGatewayName.asInstanceOf[js.Any])
    __obj.asInstanceOf[GatewayRouteData]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GatewayRouteData] (val x: Self) extends AnyVal {
    
    inline def setGatewayRouteName(value: ResourceName): Self = StObject.set(x, "gatewayRouteName", value.asInstanceOf[js.Any])
    
    inline def setMeshName(value: ResourceName): Self = StObject.set(x, "meshName", value.asInstanceOf[js.Any])
    
    inline def setMetadata(value: ResourceMetadata): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    inline def setSpec(value: GatewayRouteSpec): Self = StObject.set(x, "spec", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: GatewayRouteStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setVirtualGatewayName(value: ResourceName): Self = StObject.set(x, "virtualGatewayName", value.asInstanceOf[js.Any])
  }
}
