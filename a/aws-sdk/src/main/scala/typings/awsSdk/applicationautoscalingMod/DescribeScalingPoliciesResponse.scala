package typings.awsSdk.applicationautoscalingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeScalingPoliciesResponse extends js.Object {
  /**
    * The token required to get the next set of results. This value is null if there are no more results to return.
    */
  var NextToken: js.UndefOr[XmlString] = js.native
  /**
    * Information about the scaling policies.
    */
  var ScalingPolicies: js.UndefOr[typings.awsSdk.applicationautoscalingMod.ScalingPolicies] = js.native
}

object DescribeScalingPoliciesResponse {
  @scala.inline
  def apply(NextToken: XmlString = null, ScalingPolicies: ScalingPolicies = null): DescribeScalingPoliciesResponse = {
    val __obj = js.Dynamic.literal()
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    if (ScalingPolicies != null) __obj.updateDynamic("ScalingPolicies")(ScalingPolicies.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeScalingPoliciesResponse]
  }
}

