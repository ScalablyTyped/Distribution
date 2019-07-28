package typings.awsDashSdk.clientsElbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SetLoadBalancerPoliciesOfListenerInput extends js.Object {
  /**
    * The name of the load balancer.
    */
  var LoadBalancerName: AccessPointName
  /**
    * The external port of the load balancer.
    */
  var LoadBalancerPort: AccessPointPort
  /**
    * The names of the policies. This list must include all policies to be enabled. If you omit a policy that is currently enabled, it is disabled. If the list is empty, all current policies are disabled.
    */
  var PolicyNames: typings.awsDashSdk.clientsElbMod.PolicyNames
}

object SetLoadBalancerPoliciesOfListenerInput {
  @scala.inline
  def apply(LoadBalancerName: AccessPointName, LoadBalancerPort: AccessPointPort, PolicyNames: PolicyNames): SetLoadBalancerPoliciesOfListenerInput = {
    val __obj = js.Dynamic.literal(LoadBalancerName = LoadBalancerName, LoadBalancerPort = LoadBalancerPort, PolicyNames = PolicyNames)
  
    __obj.asInstanceOf[SetLoadBalancerPoliciesOfListenerInput]
  }
}

