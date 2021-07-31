package typings.awsSdk.appmeshMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HttpGatewayRouteAction extends StObject {
  
  /**
    * An object that represents the target that traffic is routed to when a request matches the gateway route.
    */
  var target: GatewayRouteTarget
}
object HttpGatewayRouteAction {
  
  @scala.inline
  def apply(target: GatewayRouteTarget): HttpGatewayRouteAction = {
    val __obj = js.Dynamic.literal(target = target.asInstanceOf[js.Any])
    __obj.asInstanceOf[HttpGatewayRouteAction]
  }
  
  @scala.inline
  implicit class HttpGatewayRouteActionMutableBuilder[Self <: HttpGatewayRouteAction] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTarget(value: GatewayRouteTarget): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
  }
}
