package typings.awsDashSdk.clientsAutoscalingplansMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeScalingPlanResourcesRequest extends js.Object {
  /**
    * The maximum number of scalable resources to return. The value must be between 1 and 50. The default value is 50.
    */
  var MaxResults: js.UndefOr[typings.awsDashSdk.clientsAutoscalingplansMod.MaxResults] = js.undefined
  /**
    * The token for the next set of results.
    */
  var NextToken: js.UndefOr[typings.awsDashSdk.clientsAutoscalingplansMod.NextToken] = js.undefined
  /**
    * The name of the scaling plan.
    */
  var ScalingPlanName: typings.awsDashSdk.clientsAutoscalingplansMod.ScalingPlanName
  /**
    * The version number of the scaling plan.
    */
  var ScalingPlanVersion: typings.awsDashSdk.clientsAutoscalingplansMod.ScalingPlanVersion
}

object DescribeScalingPlanResourcesRequest {
  @scala.inline
  def apply(
    ScalingPlanName: ScalingPlanName,
    ScalingPlanVersion: ScalingPlanVersion,
    MaxResults: Int | Double = null,
    NextToken: NextToken = null
  ): DescribeScalingPlanResourcesRequest = {
    val __obj = js.Dynamic.literal(ScalingPlanName = ScalingPlanName, ScalingPlanVersion = ScalingPlanVersion)
    if (MaxResults != null) __obj.updateDynamic("MaxResults")(MaxResults.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    __obj.asInstanceOf[DescribeScalingPlanResourcesRequest]
  }
}

