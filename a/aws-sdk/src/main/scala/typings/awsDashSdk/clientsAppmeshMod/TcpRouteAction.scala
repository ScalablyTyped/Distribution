package typings.awsDashSdk.clientsAppmeshMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TcpRouteAction extends js.Object {
  /**
    * The targets that traffic is routed to when a request matches the route. You can specify
    one or more targets and their relative weights to distribute traffic with.
    */
  var weightedTargets: WeightedTargets
}

object TcpRouteAction {
  @scala.inline
  def apply(weightedTargets: WeightedTargets): TcpRouteAction = {
    val __obj = js.Dynamic.literal(weightedTargets = weightedTargets)
  
    __obj.asInstanceOf[TcpRouteAction]
  }
}

