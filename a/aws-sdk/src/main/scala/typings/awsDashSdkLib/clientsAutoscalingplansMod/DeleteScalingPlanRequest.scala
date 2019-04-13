package typings
package awsDashSdkLib.clientsAutoscalingplansMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteScalingPlanRequest extends js.Object {
  /**
    * The name of the scaling plan.
    */
  var ScalingPlanName: awsDashSdkLib.clientsAutoscalingplansMod.ScalingPlanName
  /**
    * The version number of the scaling plan.
    */
  var ScalingPlanVersion: awsDashSdkLib.clientsAutoscalingplansMod.ScalingPlanVersion
}

object DeleteScalingPlanRequest {
  @scala.inline
  def apply(ScalingPlanName: ScalingPlanName, ScalingPlanVersion: ScalingPlanVersion): DeleteScalingPlanRequest = {
    val __obj = js.Dynamic.literal(ScalingPlanName = ScalingPlanName, ScalingPlanVersion = ScalingPlanVersion)
  
    __obj.asInstanceOf[DeleteScalingPlanRequest]
  }
}

