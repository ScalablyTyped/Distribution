package typings.awsSdk.appmeshMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GrpcGatewayRoute extends StObject {
  
  /**
    * An object that represents the action to take if a match is determined.
    */
  var action: GrpcGatewayRouteAction
  
  /**
    * An object that represents the criteria for determining a request match.
    */
  var `match`: GrpcGatewayRouteMatch
}
object GrpcGatewayRoute {
  
  @scala.inline
  def apply(action: GrpcGatewayRouteAction, `match`: GrpcGatewayRouteMatch): GrpcGatewayRoute = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any])
    __obj.updateDynamic("match")(`match`.asInstanceOf[js.Any])
    __obj.asInstanceOf[GrpcGatewayRoute]
  }
  
  @scala.inline
  implicit class GrpcGatewayRouteMutableBuilder[Self <: GrpcGatewayRoute] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAction(value: GrpcGatewayRouteAction): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMatch(value: GrpcGatewayRouteMatch): Self = StObject.set(x, "match", value.asInstanceOf[js.Any])
  }
}
