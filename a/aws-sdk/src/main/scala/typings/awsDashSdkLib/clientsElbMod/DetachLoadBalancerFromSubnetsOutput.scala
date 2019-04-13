package typings
package awsDashSdkLib.clientsElbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DetachLoadBalancerFromSubnetsOutput extends js.Object {
  /**
    * The IDs of the remaining subnets for the load balancer.
    */
  var Subnets: js.UndefOr[Subnets] = js.undefined
}

object DetachLoadBalancerFromSubnetsOutput {
  @scala.inline
  def apply(Subnets: Subnets = null): DetachLoadBalancerFromSubnetsOutput = {
    val __obj = js.Dynamic.literal()
    if (Subnets != null) __obj.updateDynamic("Subnets")(Subnets)
    __obj.asInstanceOf[DetachLoadBalancerFromSubnetsOutput]
  }
}

