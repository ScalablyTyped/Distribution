package typings.awsSdk.autoscalingplansMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateScalingPlanResponse extends js.Object {
  /**
    * The version number of the scaling plan. This value is always 1. Currently, you cannot specify multiple scaling plan versions.
    */
  var ScalingPlanVersion: typings.awsSdk.autoscalingplansMod.ScalingPlanVersion = js.native
}

object CreateScalingPlanResponse {
  @scala.inline
  def apply(ScalingPlanVersion: ScalingPlanVersion): CreateScalingPlanResponse = {
    val __obj = js.Dynamic.literal(ScalingPlanVersion = ScalingPlanVersion.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateScalingPlanResponse]
  }
}

