package typings.awsDashSdk.clientsElbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AttachLoadBalancerToSubnetsInput extends js.Object {
  /**
    * The name of the load balancer.
    */
  var LoadBalancerName: AccessPointName
  /**
    * The IDs of the subnets to add. You can add only one subnet per Availability Zone.
    */
  var Subnets: typings.awsDashSdk.clientsElbMod.Subnets
}

object AttachLoadBalancerToSubnetsInput {
  @scala.inline
  def apply(LoadBalancerName: AccessPointName, Subnets: Subnets): AttachLoadBalancerToSubnetsInput = {
    val __obj = js.Dynamic.literal(LoadBalancerName = LoadBalancerName, Subnets = Subnets)
  
    __obj.asInstanceOf[AttachLoadBalancerToSubnetsInput]
  }
}

