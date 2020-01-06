package typings.awsDashSdk.clientsAutoscalingplansMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeScalingPlanResourcesResponse extends js.Object {
  /**
    * The token required to get the next set of results. This value is null if there are no more results to return.
    */
  var NextToken: js.UndefOr[typings.awsDashSdk.clientsAutoscalingplansMod.NextToken] = js.native
  /**
    * Information about the scalable resources.
    */
  var ScalingPlanResources: js.UndefOr[typings.awsDashSdk.clientsAutoscalingplansMod.ScalingPlanResources] = js.native
}

object DescribeScalingPlanResourcesResponse {
  @scala.inline
  def apply(NextToken: NextToken = null, ScalingPlanResources: ScalingPlanResources = null): DescribeScalingPlanResourcesResponse = {
    val __obj = js.Dynamic.literal()
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    if (ScalingPlanResources != null) __obj.updateDynamic("ScalingPlanResources")(ScalingPlanResources.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeScalingPlanResourcesResponse]
  }
}

