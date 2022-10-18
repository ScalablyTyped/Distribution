package typings.awsSdk.clientsAppmeshMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GrpcGatewayRouteAction extends StObject {
  
  /**
    * The gateway route action to rewrite.
    */
  var rewrite: js.UndefOr[GrpcGatewayRouteRewrite] = js.undefined
  
  /**
    * An object that represents the target that traffic is routed to when a request matches the gateway route.
    */
  var target: GatewayRouteTarget
}
object GrpcGatewayRouteAction {
  
  inline def apply(target: GatewayRouteTarget): GrpcGatewayRouteAction = {
    val __obj = js.Dynamic.literal(target = target.asInstanceOf[js.Any])
    __obj.asInstanceOf[GrpcGatewayRouteAction]
  }
  
  extension [Self <: GrpcGatewayRouteAction](x: Self) {
    
    inline def setRewrite(value: GrpcGatewayRouteRewrite): Self = StObject.set(x, "rewrite", value.asInstanceOf[js.Any])
    
    inline def setRewriteUndefined: Self = StObject.set(x, "rewrite", js.undefined)
    
    inline def setTarget(value: GatewayRouteTarget): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
  }
}
