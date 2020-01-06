package typings.awsDashSdk.clientsElbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AttachLoadBalancerToSubnetsOutput extends js.Object {
  /**
    * The IDs of the subnets attached to the load balancer.
    */
  var Subnets: js.UndefOr[typings.awsDashSdk.clientsElbMod.Subnets] = js.native
}

object AttachLoadBalancerToSubnetsOutput {
  @scala.inline
  def apply(Subnets: Subnets = null): AttachLoadBalancerToSubnetsOutput = {
    val __obj = js.Dynamic.literal()
    if (Subnets != null) __obj.updateDynamic("Subnets")(Subnets.asInstanceOf[js.Any])
    __obj.asInstanceOf[AttachLoadBalancerToSubnetsOutput]
  }
}

