package typings.awsSdk.appmeshMod

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
  
  @scala.inline
  def apply(gatewayRoute: GatewayRouteData): UpdateGatewayRouteOutput = {
    val __obj = js.Dynamic.literal(gatewayRoute = gatewayRoute.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateGatewayRouteOutput]
  }
  
  @scala.inline
  implicit class UpdateGatewayRouteOutputMutableBuilder[Self <: UpdateGatewayRouteOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGatewayRoute(value: GatewayRouteData): Self = StObject.set(x, "gatewayRoute", value.asInstanceOf[js.Any])
  }
}
