package typings.awsSdk.appmeshMod

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
  
  @scala.inline
  def apply(gatewayRoute: GatewayRouteData): DeleteGatewayRouteOutput = {
    val __obj = js.Dynamic.literal(gatewayRoute = gatewayRoute.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteGatewayRouteOutput]
  }
  
  @scala.inline
  implicit class DeleteGatewayRouteOutputMutableBuilder[Self <: DeleteGatewayRouteOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGatewayRoute(value: GatewayRouteData): Self = StObject.set(x, "gatewayRoute", value.asInstanceOf[js.Any])
  }
}
