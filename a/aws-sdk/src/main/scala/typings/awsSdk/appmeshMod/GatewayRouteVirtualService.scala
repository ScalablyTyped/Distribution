package typings.awsSdk.appmeshMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GatewayRouteVirtualService extends StObject {
  
  /**
    * The name of the virtual service that traffic is routed to.
    */
  var virtualServiceName: ResourceName
}
object GatewayRouteVirtualService {
  
  inline def apply(virtualServiceName: ResourceName): GatewayRouteVirtualService = {
    val __obj = js.Dynamic.literal(virtualServiceName = virtualServiceName.asInstanceOf[js.Any])
    __obj.asInstanceOf[GatewayRouteVirtualService]
  }
  
  extension [Self <: GatewayRouteVirtualService](x: Self) {
    
    inline def setVirtualServiceName(value: ResourceName): Self = StObject.set(x, "virtualServiceName", value.asInstanceOf[js.Any])
  }
}
