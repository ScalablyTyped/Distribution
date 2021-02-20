package typings.awsSdk.appmeshMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HttpGatewayRoute extends StObject {
  
  /**
    * An object that represents the action to take if a match is determined.
    */
  var action: HttpGatewayRouteAction = js.native
  
  /**
    * An object that represents the criteria for determining a request match.
    */
  var `match`: HttpGatewayRouteMatch = js.native
}
object HttpGatewayRoute {
  
  @scala.inline
  def apply(action: HttpGatewayRouteAction, `match`: HttpGatewayRouteMatch): HttpGatewayRoute = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any])
    __obj.updateDynamic("match")(`match`.asInstanceOf[js.Any])
    __obj.asInstanceOf[HttpGatewayRoute]
  }
  
  @scala.inline
  implicit class HttpGatewayRouteMutableBuilder[Self <: HttpGatewayRoute] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAction(value: HttpGatewayRouteAction): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMatch(value: HttpGatewayRouteMatch): Self = StObject.set(x, "match", value.asInstanceOf[js.Any])
  }
}
