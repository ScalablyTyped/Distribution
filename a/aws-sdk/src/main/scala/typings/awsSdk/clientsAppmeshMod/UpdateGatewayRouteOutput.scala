package typings.awsSdk.clientsAppmeshMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateGatewayRouteOutput extends StObject {
  
  /**
    * A full description of the gateway route that was updated.
    */
  var gatewayRoute: GatewayRouteData
}
object UpdateGatewayRouteOutput {
  
  inline def apply(gatewayRoute: GatewayRouteData): UpdateGatewayRouteOutput = {
    val __obj = js.Dynamic.literal(gatewayRoute = gatewayRoute.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateGatewayRouteOutput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateGatewayRouteOutput] (val x: Self) extends AnyVal {
    
    inline def setGatewayRoute(value: GatewayRouteData): Self = StObject.set(x, "gatewayRoute", value.asInstanceOf[js.Any])
  }
}
