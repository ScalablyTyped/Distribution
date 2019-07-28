package typings.awsDashSdk.clientsElbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateLoadBalancerPolicyInput extends js.Object {
  /**
    * The name of the load balancer.
    */
  var LoadBalancerName: AccessPointName
  /**
    * The policy attributes.
    */
  var PolicyAttributes: js.UndefOr[typings.awsDashSdk.clientsElbMod.PolicyAttributes] = js.undefined
  /**
    * The name of the load balancer policy to be created. This name must be unique within the set of policies for this load balancer.
    */
  var PolicyName: typings.awsDashSdk.clientsElbMod.PolicyName
  /**
    * The name of the base policy type. To get the list of policy types, use DescribeLoadBalancerPolicyTypes.
    */
  var PolicyTypeName: typings.awsDashSdk.clientsElbMod.PolicyTypeName
}

object CreateLoadBalancerPolicyInput {
  @scala.inline
  def apply(
    LoadBalancerName: AccessPointName,
    PolicyName: PolicyName,
    PolicyTypeName: PolicyTypeName,
    PolicyAttributes: PolicyAttributes = null
  ): CreateLoadBalancerPolicyInput = {
    val __obj = js.Dynamic.literal(LoadBalancerName = LoadBalancerName, PolicyName = PolicyName, PolicyTypeName = PolicyTypeName)
    if (PolicyAttributes != null) __obj.updateDynamic("PolicyAttributes")(PolicyAttributes)
    __obj.asInstanceOf[CreateLoadBalancerPolicyInput]
  }
}

