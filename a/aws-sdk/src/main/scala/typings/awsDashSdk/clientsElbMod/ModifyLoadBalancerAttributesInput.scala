package typings.awsDashSdk.clientsElbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ModifyLoadBalancerAttributesInput extends js.Object {
  /**
    * The attributes for the load balancer.
    */
  var LoadBalancerAttributes: typings.awsDashSdk.clientsElbMod.LoadBalancerAttributes
  /**
    * The name of the load balancer.
    */
  var LoadBalancerName: AccessPointName
}

object ModifyLoadBalancerAttributesInput {
  @scala.inline
  def apply(LoadBalancerAttributes: LoadBalancerAttributes, LoadBalancerName: AccessPointName): ModifyLoadBalancerAttributesInput = {
    val __obj = js.Dynamic.literal(LoadBalancerAttributes = LoadBalancerAttributes, LoadBalancerName = LoadBalancerName)
  
    __obj.asInstanceOf[ModifyLoadBalancerAttributesInput]
  }
}

