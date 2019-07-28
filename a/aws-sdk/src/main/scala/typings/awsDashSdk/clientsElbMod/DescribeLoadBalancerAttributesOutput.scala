package typings.awsDashSdk.clientsElbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeLoadBalancerAttributesOutput extends js.Object {
  /**
    * Information about the load balancer attributes.
    */
  var LoadBalancerAttributes: js.UndefOr[typings.awsDashSdk.clientsElbMod.LoadBalancerAttributes] = js.undefined
}

object DescribeLoadBalancerAttributesOutput {
  @scala.inline
  def apply(LoadBalancerAttributes: LoadBalancerAttributes = null): DescribeLoadBalancerAttributesOutput = {
    val __obj = js.Dynamic.literal()
    if (LoadBalancerAttributes != null) __obj.updateDynamic("LoadBalancerAttributes")(LoadBalancerAttributes)
    __obj.asInstanceOf[DescribeLoadBalancerAttributesOutput]
  }
}

