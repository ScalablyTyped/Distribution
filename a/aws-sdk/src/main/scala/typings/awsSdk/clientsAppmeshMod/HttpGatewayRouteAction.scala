package typings.awsSdk.clientsAppmeshMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HttpGatewayRouteAction extends StObject {
  
  /**
    * The gateway route action to rewrite.
    */
  var rewrite: js.UndefOr[HttpGatewayRouteRewrite] = js.undefined
  
  /**
    * An object that represents the target that traffic is routed to when a request matches the gateway route.
    */
  var target: GatewayRouteTarget
}
object HttpGatewayRouteAction {
  
  inline def apply(target: GatewayRouteTarget): HttpGatewayRouteAction = {
    val __obj = js.Dynamic.literal(target = target.asInstanceOf[js.Any])
    __obj.asInstanceOf[HttpGatewayRouteAction]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: HttpGatewayRouteAction] (val x: Self) extends AnyVal {
    
    inline def setRewrite(value: HttpGatewayRouteRewrite): Self = StObject.set(x, "rewrite", value.asInstanceOf[js.Any])
    
    inline def setRewriteUndefined: Self = StObject.set(x, "rewrite", js.undefined)
    
    inline def setTarget(value: GatewayRouteTarget): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
  }
}
