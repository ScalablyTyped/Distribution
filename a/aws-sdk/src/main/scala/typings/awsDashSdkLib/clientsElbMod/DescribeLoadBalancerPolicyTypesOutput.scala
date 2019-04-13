package typings
package awsDashSdkLib.clientsElbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeLoadBalancerPolicyTypesOutput extends js.Object {
  /**
    * Information about the policy types.
    */
  var PolicyTypeDescriptions: js.UndefOr[PolicyTypeDescriptions] = js.undefined
}

object DescribeLoadBalancerPolicyTypesOutput {
  @scala.inline
  def apply(PolicyTypeDescriptions: PolicyTypeDescriptions = null): DescribeLoadBalancerPolicyTypesOutput = {
    val __obj = js.Dynamic.literal()
    if (PolicyTypeDescriptions != null) __obj.updateDynamic("PolicyTypeDescriptions")(PolicyTypeDescriptions)
    __obj.asInstanceOf[DescribeLoadBalancerPolicyTypesOutput]
  }
}

