package typings.awsDashSdk.clientsAutoscalingplansMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeScalingPlansResponse extends js.Object {
  /**
    * The token required to get the next set of results. This value is null if there are no more results to return.
    */
  var NextToken: js.UndefOr[typings.awsDashSdk.clientsAutoscalingplansMod.NextToken] = js.native
  /**
    * Information about the scaling plans.
    */
  var ScalingPlans: js.UndefOr[typings.awsDashSdk.clientsAutoscalingplansMod.ScalingPlans] = js.native
}

object DescribeScalingPlansResponse {
  @scala.inline
  def apply(NextToken: NextToken = null, ScalingPlans: ScalingPlans = null): DescribeScalingPlansResponse = {
    val __obj = js.Dynamic.literal()
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    if (ScalingPlans != null) __obj.updateDynamic("ScalingPlans")(ScalingPlans.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeScalingPlansResponse]
  }
}

