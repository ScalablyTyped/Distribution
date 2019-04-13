package typings
package awsDashSdkLib.clientsGameliftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeScalingPoliciesOutput extends js.Object {
  /**
    * Token that indicates where to resume retrieving results on the next call to this action. If no token is returned, these results represent the end of the list.
    */
  var NextToken: js.UndefOr[NonZeroAndMaxString] = js.undefined
  /**
    * Collection of objects containing the scaling policies matching the request.
    */
  var ScalingPolicies: js.UndefOr[ScalingPolicyList] = js.undefined
}

object DescribeScalingPoliciesOutput {
  @scala.inline
  def apply(NextToken: NonZeroAndMaxString = null, ScalingPolicies: ScalingPolicyList = null): DescribeScalingPoliciesOutput = {
    val __obj = js.Dynamic.literal()
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    if (ScalingPolicies != null) __obj.updateDynamic("ScalingPolicies")(ScalingPolicies)
    __obj.asInstanceOf[DescribeScalingPoliciesOutput]
  }
}

