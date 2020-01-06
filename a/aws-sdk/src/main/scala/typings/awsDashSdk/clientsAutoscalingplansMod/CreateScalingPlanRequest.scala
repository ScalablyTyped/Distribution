package typings.awsDashSdk.clientsAutoscalingplansMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateScalingPlanRequest extends js.Object {
  /**
    * A CloudFormation stack or set of tags. You can create one scaling plan per application source.
    */
  var ApplicationSource: typings.awsDashSdk.clientsAutoscalingplansMod.ApplicationSource = js.native
  /**
    * The scaling instructions.
    */
  var ScalingInstructions: typings.awsDashSdk.clientsAutoscalingplansMod.ScalingInstructions = js.native
  /**
    * The name of the scaling plan. Names cannot contain vertical bars, colons, or forward slashes.
    */
  var ScalingPlanName: typings.awsDashSdk.clientsAutoscalingplansMod.ScalingPlanName = js.native
}

object CreateScalingPlanRequest {
  @scala.inline
  def apply(
    ApplicationSource: ApplicationSource,
    ScalingInstructions: ScalingInstructions,
    ScalingPlanName: ScalingPlanName
  ): CreateScalingPlanRequest = {
    val __obj = js.Dynamic.literal(ApplicationSource = ApplicationSource.asInstanceOf[js.Any], ScalingInstructions = ScalingInstructions.asInstanceOf[js.Any], ScalingPlanName = ScalingPlanName.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[CreateScalingPlanRequest]
  }
}

