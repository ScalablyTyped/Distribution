package typings.awsDashSdk.clientsAutoscalingplansMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateScalingPlanRequest extends js.Object {
  /**
    * A CloudFormation stack or set of tags.
    */
  var ApplicationSource: js.UndefOr[typings.awsDashSdk.clientsAutoscalingplansMod.ApplicationSource] = js.undefined
  /**
    * The scaling instructions.
    */
  var ScalingInstructions: js.UndefOr[typings.awsDashSdk.clientsAutoscalingplansMod.ScalingInstructions] = js.undefined
  /**
    * The name of the scaling plan.
    */
  var ScalingPlanName: typings.awsDashSdk.clientsAutoscalingplansMod.ScalingPlanName
  /**
    * The version number of the scaling plan.
    */
  var ScalingPlanVersion: typings.awsDashSdk.clientsAutoscalingplansMod.ScalingPlanVersion
}

object UpdateScalingPlanRequest {
  @scala.inline
  def apply(
    ScalingPlanName: ScalingPlanName,
    ScalingPlanVersion: ScalingPlanVersion,
    ApplicationSource: ApplicationSource = null,
    ScalingInstructions: ScalingInstructions = null
  ): UpdateScalingPlanRequest = {
    val __obj = js.Dynamic.literal(ScalingPlanName = ScalingPlanName, ScalingPlanVersion = ScalingPlanVersion)
    if (ApplicationSource != null) __obj.updateDynamic("ApplicationSource")(ApplicationSource)
    if (ScalingInstructions != null) __obj.updateDynamic("ScalingInstructions")(ScalingInstructions)
    __obj.asInstanceOf[UpdateScalingPlanRequest]
  }
}

