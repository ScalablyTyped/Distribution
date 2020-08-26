package typings.awsSdk.appmeshMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HttpGatewayRouteAction extends js.Object {
  /**
    * An object that represents the target that traffic is routed to when a request matches the gateway route.
    */
  var target: GatewayRouteTarget = js.native
}

object HttpGatewayRouteAction {
  @scala.inline
  def apply(target: GatewayRouteTarget): HttpGatewayRouteAction = {
    val __obj = js.Dynamic.literal(target = target.asInstanceOf[js.Any])
    __obj.asInstanceOf[HttpGatewayRouteAction]
  }
  @scala.inline
  implicit class HttpGatewayRouteActionOps[Self <: HttpGatewayRouteAction] (val x: Self) extends AnyVal {
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
    def setTarget(value: GatewayRouteTarget): Self = this.set("target", value.asInstanceOf[js.Any])
  }
  
}

