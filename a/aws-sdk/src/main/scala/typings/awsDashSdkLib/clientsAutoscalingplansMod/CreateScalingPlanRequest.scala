package typings
package awsDashSdkLib.clientsAutoscalingplansMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateScalingPlanRequest extends js.Object {
  /**
    * A CloudFormation stack or set of tags. You can create one scaling plan per application source.
    */
  var ApplicationSource: awsDashSdkLib.clientsAutoscalingplansMod.ApplicationSource
  /**
    * The scaling instructions.
    */
  var ScalingInstructions: awsDashSdkLib.clientsAutoscalingplansMod.ScalingInstructions
  /**
    * The name of the scaling plan. Names cannot contain vertical bars, colons, or forward slashes.
    */
  var ScalingPlanName: awsDashSdkLib.clientsAutoscalingplansMod.ScalingPlanName
}

object CreateScalingPlanRequest {
  @scala.inline
  def apply(
    ApplicationSource: ApplicationSource,
    ScalingInstructions: ScalingInstructions,
    ScalingPlanName: ScalingPlanName
  ): CreateScalingPlanRequest = {
    val __obj = js.Dynamic.literal(ApplicationSource = ApplicationSource, ScalingInstructions = ScalingInstructions, ScalingPlanName = ScalingPlanName)
  
    __obj.asInstanceOf[CreateScalingPlanRequest]
  }
}

