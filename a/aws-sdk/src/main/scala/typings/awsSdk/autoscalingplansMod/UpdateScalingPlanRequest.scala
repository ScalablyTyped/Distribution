package typings.awsSdk.autoscalingplansMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateScalingPlanRequest extends js.Object {
  /**
    * A CloudFormation stack or set of tags.
    */
  var ApplicationSource: js.UndefOr[typings.awsSdk.autoscalingplansMod.ApplicationSource] = js.native
  /**
    * The scaling instructions.
    */
  var ScalingInstructions: js.UndefOr[typings.awsSdk.autoscalingplansMod.ScalingInstructions] = js.native
  /**
    * The name of the scaling plan.
    */
  var ScalingPlanName: typings.awsSdk.autoscalingplansMod.ScalingPlanName = js.native
  /**
    * The version number of the scaling plan.
    */
  var ScalingPlanVersion: typings.awsSdk.autoscalingplansMod.ScalingPlanVersion = js.native
}

object UpdateScalingPlanRequest {
  @scala.inline
  def apply(ScalingPlanName: ScalingPlanName, ScalingPlanVersion: ScalingPlanVersion): UpdateScalingPlanRequest = {
    val __obj = js.Dynamic.literal(ScalingPlanName = ScalingPlanName.asInstanceOf[js.Any], ScalingPlanVersion = ScalingPlanVersion.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateScalingPlanRequest]
  }
  @scala.inline
  implicit class UpdateScalingPlanRequestOps[Self <: UpdateScalingPlanRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setScalingPlanName(value: ScalingPlanName): Self = this.set("ScalingPlanName", value.asInstanceOf[js.Any])
    @scala.inline
    def setScalingPlanVersion(value: ScalingPlanVersion): Self = this.set("ScalingPlanVersion", value.asInstanceOf[js.Any])
    @scala.inline
    def setApplicationSource(value: ApplicationSource): Self = this.set("ApplicationSource", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteApplicationSource: Self = this.set("ApplicationSource", js.undefined)
    @scala.inline
    def setScalingInstructionsVarargs(value: ScalingInstruction*): Self = this.set("ScalingInstructions", js.Array(value :_*))
    @scala.inline
    def setScalingInstructions(value: ScalingInstructions): Self = this.set("ScalingInstructions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScalingInstructions: Self = this.set("ScalingInstructions", js.undefined)
  }
  
}

