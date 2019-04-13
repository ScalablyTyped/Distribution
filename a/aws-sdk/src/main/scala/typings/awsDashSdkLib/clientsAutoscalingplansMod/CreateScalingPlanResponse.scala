package typings
package awsDashSdkLib.clientsAutoscalingplansMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateScalingPlanResponse extends js.Object {
  /**
    * The version number of the scaling plan. This value is always 1. Currently, you cannot specify multiple scaling plan versions.
    */
  var ScalingPlanVersion: awsDashSdkLib.clientsAutoscalingplansMod.ScalingPlanVersion
}

object CreateScalingPlanResponse {
  @scala.inline
  def apply(ScalingPlanVersion: ScalingPlanVersion): CreateScalingPlanResponse = {
    val __obj = js.Dynamic.literal(ScalingPlanVersion = ScalingPlanVersion)
  
    __obj.asInstanceOf[CreateScalingPlanResponse]
  }
}

