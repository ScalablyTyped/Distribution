package typings.awsDashSdk.clientsElbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateLoadBalancerPolicyInput extends js.Object {
  /**
    * The name of the load balancer.
    */
  var LoadBalancerName: AccessPointName = js.native
  /**
    * The policy attributes.
    */
  var PolicyAttributes: js.UndefOr[typings.awsDashSdk.clientsElbMod.PolicyAttributes] = js.native
  /**
    * The name of the load balancer policy to be created. This name must be unique within the set of policies for this load balancer.
    */
  var PolicyName: typings.awsDashSdk.clientsElbMod.PolicyName = js.native
  /**
    * The name of the base policy type. To get the list of policy types, use DescribeLoadBalancerPolicyTypes.
    */
  var PolicyTypeName: typings.awsDashSdk.clientsElbMod.PolicyTypeName = js.native
}

object CreateLoadBalancerPolicyInput {
  @scala.inline
  def apply(
    LoadBalancerName: AccessPointName,
    PolicyName: PolicyName,
    PolicyTypeName: PolicyTypeName,
    PolicyAttributes: PolicyAttributes = null
  ): CreateLoadBalancerPolicyInput = {
    val __obj = js.Dynamic.literal(LoadBalancerName = LoadBalancerName.asInstanceOf[js.Any], PolicyName = PolicyName.asInstanceOf[js.Any], PolicyTypeName = PolicyTypeName.asInstanceOf[js.Any])
    if (PolicyAttributes != null) __obj.updateDynamic("PolicyAttributes")(PolicyAttributes.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateLoadBalancerPolicyInput]
  }
}

