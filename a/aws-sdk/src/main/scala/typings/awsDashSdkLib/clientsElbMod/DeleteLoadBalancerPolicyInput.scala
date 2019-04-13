package typings
package awsDashSdkLib.clientsElbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteLoadBalancerPolicyInput extends js.Object {
  /**
    * The name of the load balancer.
    */
  var LoadBalancerName: AccessPointName
  /**
    * The name of the policy.
    */
  var PolicyName: awsDashSdkLib.clientsElbMod.PolicyName
}

object DeleteLoadBalancerPolicyInput {
  @scala.inline
  def apply(LoadBalancerName: AccessPointName, PolicyName: PolicyName): DeleteLoadBalancerPolicyInput = {
    val __obj = js.Dynamic.literal(LoadBalancerName = LoadBalancerName, PolicyName = PolicyName)
  
    __obj.asInstanceOf[DeleteLoadBalancerPolicyInput]
  }
}

