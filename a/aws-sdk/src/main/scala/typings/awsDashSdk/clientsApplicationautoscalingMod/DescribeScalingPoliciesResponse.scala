package typings.awsDashSdk.clientsApplicationautoscalingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeScalingPoliciesResponse extends js.Object {
  /**
    * The token required to get the next set of results. This value is null if there are no more results to return.
    */
  var NextToken: js.UndefOr[XmlString] = js.undefined
  /**
    * Information about the scaling policies.
    */
  var ScalingPolicies: js.UndefOr[typings.awsDashSdk.clientsApplicationautoscalingMod.ScalingPolicies] = js.undefined
}

object DescribeScalingPoliciesResponse {
  @scala.inline
  def apply(NextToken: XmlString = null, ScalingPolicies: ScalingPolicies = null): DescribeScalingPoliciesResponse = {
    val __obj = js.Dynamic.literal()
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    if (ScalingPolicies != null) __obj.updateDynamic("ScalingPolicies")(ScalingPolicies)
    __obj.asInstanceOf[DescribeScalingPoliciesResponse]
  }
}

