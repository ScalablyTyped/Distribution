package typings
package awsDashSdkLib.clientsAutoscalingplansMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeScalingPlansResponse extends js.Object {
  /**
    * The token required to get the next set of results. This value is null if there are no more results to return.
    */
  var NextToken: js.UndefOr[NextToken] = js.undefined
  /**
    * Information about the scaling plans.
    */
  var ScalingPlans: js.UndefOr[ScalingPlans] = js.undefined
}

object DescribeScalingPlansResponse {
  @scala.inline
  def apply(NextToken: NextToken = null, ScalingPlans: ScalingPlans = null): DescribeScalingPlansResponse = {
    val __obj = js.Dynamic.literal()
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    if (ScalingPlans != null) __obj.updateDynamic("ScalingPlans")(ScalingPlans)
    __obj.asInstanceOf[DescribeScalingPlansResponse]
  }
}

