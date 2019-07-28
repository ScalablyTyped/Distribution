package typings.awsDashSdk.clientsElbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeLoadBalancerPolicyTypesInput extends js.Object {
  /**
    * The names of the policy types. If no names are specified, describes all policy types defined by Elastic Load Balancing.
    */
  var PolicyTypeNames: js.UndefOr[typings.awsDashSdk.clientsElbMod.PolicyTypeNames] = js.undefined
}

object DescribeLoadBalancerPolicyTypesInput {
  @scala.inline
  def apply(PolicyTypeNames: PolicyTypeNames = null): DescribeLoadBalancerPolicyTypesInput = {
    val __obj = js.Dynamic.literal()
    if (PolicyTypeNames != null) __obj.updateDynamic("PolicyTypeNames")(PolicyTypeNames)
    __obj.asInstanceOf[DescribeLoadBalancerPolicyTypesInput]
  }
}

