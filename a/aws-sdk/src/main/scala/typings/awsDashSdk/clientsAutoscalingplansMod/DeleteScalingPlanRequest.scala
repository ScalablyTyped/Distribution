package typings.awsDashSdk.clientsAutoscalingplansMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteScalingPlanRequest extends js.Object {
  /**
    * The name of the scaling plan.
    */
  var ScalingPlanName: typings.awsDashSdk.clientsAutoscalingplansMod.ScalingPlanName
  /**
    * The version number of the scaling plan.
    */
  var ScalingPlanVersion: typings.awsDashSdk.clientsAutoscalingplansMod.ScalingPlanVersion
}

object DeleteScalingPlanRequest {
  @scala.inline
  def apply(ScalingPlanName: ScalingPlanName, ScalingPlanVersion: ScalingPlanVersion): DeleteScalingPlanRequest = {
    val __obj = js.Dynamic.literal(ScalingPlanName = ScalingPlanName, ScalingPlanVersion = ScalingPlanVersion)
  
    __obj.asInstanceOf[DeleteScalingPlanRequest]
  }
}

