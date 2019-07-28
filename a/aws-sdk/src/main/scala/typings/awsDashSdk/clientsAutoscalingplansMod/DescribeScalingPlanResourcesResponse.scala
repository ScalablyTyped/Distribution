package typings.awsDashSdk.clientsAutoscalingplansMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeScalingPlanResourcesResponse extends js.Object {
  /**
    * The token required to get the next set of results. This value is null if there are no more results to return.
    */
  var NextToken: js.UndefOr[typings.awsDashSdk.clientsAutoscalingplansMod.NextToken] = js.undefined
  /**
    * Information about the scalable resources.
    */
  var ScalingPlanResources: js.UndefOr[typings.awsDashSdk.clientsAutoscalingplansMod.ScalingPlanResources] = js.undefined
}

object DescribeScalingPlanResourcesResponse {
  @scala.inline
  def apply(NextToken: NextToken = null, ScalingPlanResources: ScalingPlanResources = null): DescribeScalingPlanResourcesResponse = {
    val __obj = js.Dynamic.literal()
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    if (ScalingPlanResources != null) __obj.updateDynamic("ScalingPlanResources")(ScalingPlanResources)
    __obj.asInstanceOf[DescribeScalingPlanResourcesResponse]
  }
}

