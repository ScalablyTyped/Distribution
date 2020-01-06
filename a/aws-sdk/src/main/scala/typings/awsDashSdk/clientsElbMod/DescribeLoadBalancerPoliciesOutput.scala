package typings.awsDashSdk.clientsElbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeLoadBalancerPoliciesOutput extends js.Object {
  /**
    * Information about the policies.
    */
  var PolicyDescriptions: js.UndefOr[typings.awsDashSdk.clientsElbMod.PolicyDescriptions] = js.native
}

object DescribeLoadBalancerPoliciesOutput {
  @scala.inline
  def apply(PolicyDescriptions: PolicyDescriptions = null): DescribeLoadBalancerPoliciesOutput = {
    val __obj = js.Dynamic.literal()
    if (PolicyDescriptions != null) __obj.updateDynamic("PolicyDescriptions")(PolicyDescriptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeLoadBalancerPoliciesOutput]
  }
}

