package typings.awsSdk.clientsAppmeshMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteGatewayRouteOutput extends StObject {
  
  /**
    * The gateway route that was deleted.
    */
  var gatewayRoute: GatewayRouteData
}
object DeleteGatewayRouteOutput {
  
  inline def apply(gatewayRoute: GatewayRouteData): DeleteGatewayRouteOutput = {
    val __obj = js.Dynamic.literal(gatewayRoute = gatewayRoute.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteGatewayRouteOutput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteGatewayRouteOutput] (val x: Self) extends AnyVal {
    
    inline def setGatewayRoute(value: GatewayRouteData): Self = StObject.set(x, "gatewayRoute", value.asInstanceOf[js.Any])
  }
}
