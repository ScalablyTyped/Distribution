package typings.awsDashSdk.clientsElbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DetachLoadBalancerFromSubnetsInput extends js.Object {
  /**
    * The name of the load balancer.
    */
  var LoadBalancerName: AccessPointName = js.native
  /**
    * The IDs of the subnets.
    */
  var Subnets: typings.awsDashSdk.clientsElbMod.Subnets = js.native
}

object DetachLoadBalancerFromSubnetsInput {
  @scala.inline
  def apply(LoadBalancerName: AccessPointName, Subnets: Subnets): DetachLoadBalancerFromSubnetsInput = {
    val __obj = js.Dynamic.literal(LoadBalancerName = LoadBalancerName.asInstanceOf[js.Any], Subnets = Subnets.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DetachLoadBalancerFromSubnetsInput]
  }
}

