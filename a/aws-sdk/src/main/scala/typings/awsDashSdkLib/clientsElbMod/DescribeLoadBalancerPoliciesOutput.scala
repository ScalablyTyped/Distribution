package typings
package awsDashSdkLib.clientsElbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeLoadBalancerPoliciesOutput extends js.Object {
  /**
    * Information about the policies.
    */
  var PolicyDescriptions: js.UndefOr[PolicyDescriptions] = js.undefined
}

object DescribeLoadBalancerPoliciesOutput {
  @scala.inline
  def apply(PolicyDescriptions: PolicyDescriptions = null): DescribeLoadBalancerPoliciesOutput = {
    val __obj = js.Dynamic.literal()
    if (PolicyDescriptions != null) __obj.updateDynamic("PolicyDescriptions")(PolicyDescriptions)
    __obj.asInstanceOf[DescribeLoadBalancerPoliciesOutput]
  }
}

