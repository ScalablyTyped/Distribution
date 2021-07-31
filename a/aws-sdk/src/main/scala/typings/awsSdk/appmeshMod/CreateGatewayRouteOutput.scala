package typings.awsSdk.appmeshMod

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
  
  @scala.inline
  def apply(gatewayRoute: GatewayRouteData): CreateGatewayRouteOutput = {
    val __obj = js.Dynamic.literal(gatewayRoute = gatewayRoute.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateGatewayRouteOutput]
  }
  
  @scala.inline
  implicit class CreateGatewayRouteOutputMutableBuilder[Self <: CreateGatewayRouteOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGatewayRoute(value: GatewayRouteData): Self = StObject.set(x, "gatewayRoute", value.asInstanceOf[js.Any])
  }
}
