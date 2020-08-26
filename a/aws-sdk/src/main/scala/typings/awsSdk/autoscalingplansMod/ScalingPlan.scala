package typings.awsSdk.autoscalingplansMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ScalingPlan extends js.Object {
  /**
    * The application source.
    */
  var ApplicationSource: typings.awsSdk.autoscalingplansMod.ApplicationSource = js.native
  /**
    * The Unix time stamp when the scaling plan was created.
    */
  var CreationTime: js.UndefOr[TimestampType] = js.native
  /**
    * The scaling instructions.
    */
  var ScalingInstructions: typings.awsSdk.autoscalingplansMod.ScalingInstructions = js.native
  /**
    * The name of the scaling plan.
    */
  var ScalingPlanName: typings.awsSdk.autoscalingplansMod.ScalingPlanName = js.native
  /**
    * The version number of the scaling plan.
    */
  var ScalingPlanVersion: typings.awsSdk.autoscalingplansMod.ScalingPlanVersion = js.native
  /**
    * The status of the scaling plan.    Active - The scaling plan is active.    ActiveWithProblems - The scaling plan is active, but the scaling configuration for one or more resources could not be applied.    CreationInProgress - The scaling plan is being created.    CreationFailed - The scaling plan could not be created.    DeletionInProgress - The scaling plan is being deleted.    DeletionFailed - The scaling plan could not be deleted.    UpdateInProgress - The scaling plan is being updated.    UpdateFailed - The scaling plan could not be updated.  
    */
  var StatusCode: ScalingPlanStatusCode = js.native
  /**
    * A simple message about the current status of the scaling plan.
    */
  var StatusMessage: js.UndefOr[XmlString] = js.native
  /**
    * The Unix time stamp when the scaling plan entered the current status.
    */
  var StatusStartTime: js.UndefOr[TimestampType] = js.native
}

object ScalingPlan {
  @scala.inline
  def apply(
    ApplicationSource: ApplicationSource,
    ScalingInstructions: ScalingInstructions,
    ScalingPlanName: ScalingPlanName,
    ScalingPlanVersion: ScalingPlanVersion,
    StatusCode: ScalingPlanStatusCode
  ): ScalingPlan = {
    val __obj = js.Dynamic.literal(ApplicationSource = ApplicationSource.asInstanceOf[js.Any], ScalingInstructions = ScalingInstructions.asInstanceOf[js.Any], ScalingPlanName = ScalingPlanName.asInstanceOf[js.Any], ScalingPlanVersion = ScalingPlanVersion.asInstanceOf[js.Any], StatusCode = StatusCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScalingPlan]
  }
  @scala.inline
  implicit class ScalingPlanOps[Self <: ScalingPlan] (val x: Self) extends AnyVal {
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
    def setApplicationSource(value: ApplicationSource): Self = this.set("ApplicationSource", value.asInstanceOf[js.Any])
    @scala.inline
    def setScalingInstructionsVarargs(value: ScalingInstruction*): Self = this.set("ScalingInstructions", js.Array(value :_*))
    @scala.inline
    def setScalingInstructions(value: ScalingInstructions): Self = this.set("ScalingInstructions", value.asInstanceOf[js.Any])
    @scala.inline
    def setScalingPlanName(value: ScalingPlanName): Self = this.set("ScalingPlanName", value.asInstanceOf[js.Any])
    @scala.inline
    def setScalingPlanVersion(value: ScalingPlanVersion): Self = this.set("ScalingPlanVersion", value.asInstanceOf[js.Any])
    @scala.inline
    def setStatusCode(value: ScalingPlanStatusCode): Self = this.set("StatusCode", value.asInstanceOf[js.Any])
    @scala.inline
    def setCreationTime(value: TimestampType): Self = this.set("CreationTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreationTime: Self = this.set("CreationTime", js.undefined)
    @scala.inline
    def setStatusMessage(value: XmlString): Self = this.set("StatusMessage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatusMessage: Self = this.set("StatusMessage", js.undefined)
    @scala.inline
    def setStatusStartTime(value: TimestampType): Self = this.set("StatusStartTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatusStartTime: Self = this.set("StatusStartTime", js.undefined)
  }
  
}

