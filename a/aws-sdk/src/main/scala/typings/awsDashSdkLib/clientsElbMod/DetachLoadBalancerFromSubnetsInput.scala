package typings
package awsDashSdkLib.clientsElbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DetachLoadBalancerFromSubnetsInput extends js.Object {
  /**
    * The name of the load balancer.
    */
  var LoadBalancerName: AccessPointName
  /**
    * The IDs of the subnets.
    */
  var Subnets: awsDashSdkLib.clientsElbMod.Subnets
}

object DetachLoadBalancerFromSubnetsInput {
  @scala.inline
  def apply(LoadBalancerName: AccessPointName, Subnets: Subnets): DetachLoadBalancerFromSubnetsInput = {
    val __obj = js.Dynamic.literal(LoadBalancerName = LoadBalancerName, Subnets = Subnets)
  
    __obj.asInstanceOf[DetachLoadBalancerFromSubnetsInput]
  }
}

