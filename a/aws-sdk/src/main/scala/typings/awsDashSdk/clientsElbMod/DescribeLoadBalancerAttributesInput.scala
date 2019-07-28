package typings.awsDashSdk.clientsElbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeLoadBalancerAttributesInput extends js.Object {
  /**
    * The name of the load balancer.
    */
  var LoadBalancerName: AccessPointName
}

object DescribeLoadBalancerAttributesInput {
  @scala.inline
  def apply(LoadBalancerName: AccessPointName): DescribeLoadBalancerAttributesInput = {
    val __obj = js.Dynamic.literal(LoadBalancerName = LoadBalancerName)
  
    __obj.asInstanceOf[DescribeLoadBalancerAttributesInput]
  }
}

