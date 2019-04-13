package typings
package awsDashSdkLib.clientsAppmeshMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HttpRouteAction extends js.Object {
  /**
    * The targets that traffic is routed to when a request matches the route. You can specify
    one or more targets and their relative weights to distribute traffic with.
    */
  var weightedTargets: WeightedTargets
}

object HttpRouteAction {
  @scala.inline
  def apply(weightedTargets: WeightedTargets): HttpRouteAction = {
    val __obj = js.Dynamic.literal(weightedTargets = weightedTargets)
  
    __obj.asInstanceOf[HttpRouteAction]
  }
}

