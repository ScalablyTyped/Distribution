package typings.awsSdk.clientsAppmeshMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateGatewayRouteOutput extends StObject {
  
  /**
    * The full description of your gateway route following the create call.
    */
  var gatewayRoute: GatewayRouteData
}
object CreateGatewayRouteOutput {
  
  inline def apply(gatewayRoute: GatewayRouteData): CreateGatewayRouteOutput = {
    val __obj = js.Dynamic.literal(gatewayRoute = gatewayRoute.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateGatewayRouteOutput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateGatewayRouteOutput] (val x: Self) extends AnyVal {
    
    inline def setGatewayRoute(value: GatewayRouteData): Self = StObject.set(x, "gatewayRoute", value.asInstanceOf[js.Any])
  }
}
