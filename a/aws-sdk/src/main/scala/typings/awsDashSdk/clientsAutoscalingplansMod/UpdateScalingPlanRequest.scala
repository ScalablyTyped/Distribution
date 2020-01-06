package typings.awsDashSdk.clientsAutoscalingplansMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateScalingPlanRequest extends js.Object {
  /**
    * A CloudFormation stack or set of tags.
    */
  var ApplicationSource: js.UndefOr[typings.awsDashSdk.clientsAutoscalingplansMod.ApplicationSource] = js.native
  /**
    * The scaling instructions.
    */
  var ScalingInstructions: js.UndefOr[typings.awsDashSdk.clientsAutoscalingplansMod.ScalingInstructions] = js.native
  /**
    * The name of the scaling plan.
    */
  var ScalingPlanName: typings.awsDashSdk.clientsAutoscalingplansMod.ScalingPlanName = js.native
  /**
    * The version number of the scaling plan.
    */
  var ScalingPlanVersion: typings.awsDashSdk.clientsAutoscalingplansMod.ScalingPlanVersion = js.native
}

object UpdateScalingPlanRequest {
  @scala.inline
  def apply(
    ScalingPlanName: ScalingPlanName,
    ScalingPlanVersion: ScalingPlanVersion,
    ApplicationSource: ApplicationSource = null,
    ScalingInstructions: ScalingInstructions = null
  ): UpdateScalingPlanRequest = {
    val __obj = js.Dynamic.literal(ScalingPlanName = ScalingPlanName.asInstanceOf[js.Any], ScalingPlanVersion = ScalingPlanVersion.asInstanceOf[js.Any])
    if (ApplicationSource != null) __obj.updateDynamic("ApplicationSource")(ApplicationSource.asInstanceOf[js.Any])
    if (ScalingInstructions != null) __obj.updateDynamic("ScalingInstructions")(ScalingInstructions.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateScalingPlanRequest]
  }
}

