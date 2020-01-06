package typings.awsDashSdk.clientsElbv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ModifyLoadBalancerAttributesInput extends js.Object {
  /**
    * The load balancer attributes.
    */
  var Attributes: LoadBalancerAttributes = js.native
  /**
    * The Amazon Resource Name (ARN) of the load balancer.
    */
  var LoadBalancerArn: typings.awsDashSdk.clientsElbv2Mod.LoadBalancerArn = js.native
}

object ModifyLoadBalancerAttributesInput {
  @scala.inline
  def apply(Attributes: LoadBalancerAttributes, LoadBalancerArn: LoadBalancerArn): ModifyLoadBalancerAttributesInput = {
    val __obj = js.Dynamic.literal(Attributes = Attributes.asInstanceOf[js.Any], LoadBalancerArn = LoadBalancerArn.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ModifyLoadBalancerAttributesInput]
  }
}

