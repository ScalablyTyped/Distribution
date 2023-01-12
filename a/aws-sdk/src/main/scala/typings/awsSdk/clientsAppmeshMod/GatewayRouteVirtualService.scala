package typings.awsSdk.clientsAppmeshMod

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
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GatewayRouteVirtualService] (val x: Self) extends AnyVal {
    
    inline def setVirtualServiceName(value: ResourceName): Self = StObject.set(x, "virtualServiceName", value.asInstanceOf[js.Any])
  }
}
