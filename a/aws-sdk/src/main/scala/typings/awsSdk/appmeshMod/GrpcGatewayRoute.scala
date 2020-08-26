package typings.awsSdk.appmeshMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GrpcGatewayRoute extends js.Object {
  /**
    * An object that represents the action to take if a match is determined.
    */
  var action: GrpcGatewayRouteAction = js.native
  /**
    * An object that represents the criteria for determining a request match.
    */
  var `match`: GrpcGatewayRouteMatch = js.native
}

object GrpcGatewayRoute {
  @scala.inline
  def apply(action: GrpcGatewayRouteAction, `match`: GrpcGatewayRouteMatch): GrpcGatewayRoute = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any])
    __obj.updateDynamic("match")(`match`.asInstanceOf[js.Any])
    __obj.asInstanceOf[GrpcGatewayRoute]
  }
  @scala.inline
  implicit class GrpcGatewayRouteOps[Self <: GrpcGatewayRoute] (val x: Self) extends AnyVal {
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
    def setAction(value: GrpcGatewayRouteAction): Self = this.set("action", value.asInstanceOf[js.Any])
    @scala.inline
    def setMatch(value: GrpcGatewayRouteMatch): Self = this.set("match", value.asInstanceOf[js.Any])
  }
  
}

