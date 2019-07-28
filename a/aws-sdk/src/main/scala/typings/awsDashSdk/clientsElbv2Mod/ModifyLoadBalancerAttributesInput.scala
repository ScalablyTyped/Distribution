package typings.awsDashSdk.clientsElbv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ModifyLoadBalancerAttributesInput extends js.Object {
  /**
    * The load balancer attributes.
    */
  var Attributes: LoadBalancerAttributes
  /**
    * The Amazon Resource Name (ARN) of the load balancer.
    */
  var LoadBalancerArn: typings.awsDashSdk.clientsElbv2Mod.LoadBalancerArn
}

object ModifyLoadBalancerAttributesInput {
  @scala.inline
  def apply(Attributes: LoadBalancerAttributes, LoadBalancerArn: LoadBalancerArn): ModifyLoadBalancerAttributesInput = {
    val __obj = js.Dynamic.literal(Attributes = Attributes, LoadBalancerArn = LoadBalancerArn)
  
    __obj.asInstanceOf[ModifyLoadBalancerAttributesInput]
  }
}

