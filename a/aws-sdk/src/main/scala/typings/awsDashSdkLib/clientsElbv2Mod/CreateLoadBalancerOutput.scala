package typings
package awsDashSdkLib.clientsElbv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateLoadBalancerOutput extends js.Object {
  /**
    * Information about the load balancer.
    */
  var LoadBalancers: js.UndefOr[LoadBalancers] = js.undefined
}

object CreateLoadBalancerOutput {
  @scala.inline
  def apply(LoadBalancers: LoadBalancers = null): CreateLoadBalancerOutput = {
    val __obj = js.Dynamic.literal()
    if (LoadBalancers != null) __obj.updateDynamic("LoadBalancers")(LoadBalancers)
    __obj.asInstanceOf[CreateLoadBalancerOutput]
  }
}

