package typings.awsSdk.appmeshMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HttpGatewayRoute extends js.Object {
  
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
  implicit class HttpGatewayRouteOps[Self <: HttpGatewayRoute] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAction(value: HttpGatewayRouteAction): Self = this.set("action", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMatch(value: HttpGatewayRouteMatch): Self = this.set("match", value.asInstanceOf[js.Any])
  }
}
