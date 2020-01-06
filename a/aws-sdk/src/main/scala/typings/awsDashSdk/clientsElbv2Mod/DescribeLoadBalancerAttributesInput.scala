package typings.awsDashSdk.clientsElbv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeLoadBalancerAttributesInput extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the load balancer.
    */
  var LoadBalancerArn: typings.awsDashSdk.clientsElbv2Mod.LoadBalancerArn = js.native
}

object DescribeLoadBalancerAttributesInput {
  @scala.inline
  def apply(LoadBalancerArn: LoadBalancerArn): DescribeLoadBalancerAttributesInput = {
    val __obj = js.Dynamic.literal(LoadBalancerArn = LoadBalancerArn.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DescribeLoadBalancerAttributesInput]
  }
}

