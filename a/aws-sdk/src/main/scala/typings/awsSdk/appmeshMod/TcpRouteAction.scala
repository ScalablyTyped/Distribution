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
}

