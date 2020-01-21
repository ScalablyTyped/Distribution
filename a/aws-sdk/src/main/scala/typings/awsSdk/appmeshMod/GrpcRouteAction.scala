package typings.awsSdk.appmeshMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GrpcRouteAction extends js.Object {
  /**
    * An object that represents the targets that traffic is routed to when a request matches the route.
    */
  var weightedTargets: WeightedTargets = js.native
}

object GrpcRouteAction {
  @scala.inline
  def apply(weightedTargets: WeightedTargets): GrpcRouteAction = {
    val __obj = js.Dynamic.literal(weightedTargets = weightedTargets.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GrpcRouteAction]
  }
}

