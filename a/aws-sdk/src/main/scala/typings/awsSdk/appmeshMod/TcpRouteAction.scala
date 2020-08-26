package typings.awsSdk.appmeshMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TcpRouteAction extends js.Object {
  /**
    * An object that represents the targets that traffic is routed to when a request matches the route.
    */
  var weightedTargets: WeightedTargets = js.native
}

object TcpRouteAction {
  @scala.inline
  def apply(weightedTargets: WeightedTargets): TcpRouteAction = {
    val __obj = js.Dynamic.literal(weightedTargets = weightedTargets.asInstanceOf[js.Any])
    __obj.asInstanceOf[TcpRouteAction]
  }
  @scala.inline
  implicit class TcpRouteActionOps[Self <: TcpRouteAction] (val x: Self) extends AnyVal {
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
    def setWeightedTargetsVarargs(value: WeightedTarget*): Self = this.set("weightedTargets", js.Array(value :_*))
    @scala.inline
    def setWeightedTargets(value: WeightedTargets): Self = this.set("weightedTargets", value.asInstanceOf[js.Any])
  }
  
}

