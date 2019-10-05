package typings.awsDashSdk.clientsAutoscalingplansMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeScalingPlansRequest extends js.Object {
  /**
    * The sources for the applications (up to 10). If you specify scaling plan names, you cannot specify application sources.
    */
  var ApplicationSources: js.UndefOr[typings.awsDashSdk.clientsAutoscalingplansMod.ApplicationSources] = js.undefined
  /**
    * The maximum number of scalable resources to return. This value can be between 1 and 50. The default value is 50.
    */
  var MaxResults: js.UndefOr[typings.awsDashSdk.clientsAutoscalingplansMod.MaxResults] = js.undefined
  /**
    * The token for the next set of results.
    */
  var NextToken: js.UndefOr[typings.awsDashSdk.clientsAutoscalingplansMod.NextToken] = js.undefined
  /**
    * The names of the scaling plans (up to 10). If you specify application sources, you cannot specify scaling plan names.
    */
  var ScalingPlanNames: js.UndefOr[typings.awsDashSdk.clientsAutoscalingplansMod.ScalingPlanNames] = js.undefined
  /**
    * The version number of the scaling plan. If you specify a scaling plan version, you must also specify a scaling plan name.
    */
  var ScalingPlanVersion: js.UndefOr[typings.awsDashSdk.clientsAutoscalingplansMod.ScalingPlanVersion] = js.undefined
}

object DescribeScalingPlansRequest {
  @scala.inline
  def apply(
    ApplicationSources: ApplicationSources = null,
    MaxResults: Int | Double = null,
    NextToken: NextToken = null,
    ScalingPlanNames: ScalingPlanNames = null,
    ScalingPlanVersion: Int | Double = null
  ): DescribeScalingPlansRequest = {
    val __obj = js.Dynamic.literal()
    if (ApplicationSources != null) __obj.updateDynamic("ApplicationSources")(ApplicationSources)
    if (MaxResults != null) __obj.updateDynamic("MaxResults")(MaxResults.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    if (ScalingPlanNames != null) __obj.updateDynamic("ScalingPlanNames")(ScalingPlanNames)
    if (ScalingPlanVersion != null) __obj.updateDynamic("ScalingPlanVersion")(ScalingPlanVersion.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeScalingPlansRequest]
  }
}

