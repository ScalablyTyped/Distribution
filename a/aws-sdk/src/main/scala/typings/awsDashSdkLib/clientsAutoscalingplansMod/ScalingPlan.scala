package typings
package awsDashSdkLib.clientsAutoscalingplansMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ScalingPlan extends js.Object {
  /**
    * The application source.
    */
  var ApplicationSource: awsDashSdkLib.clientsAutoscalingplansMod.ApplicationSource
  /**
    * The Unix time stamp when the scaling plan was created.
    */
  var CreationTime: js.UndefOr[TimestampType] = js.undefined
  /**
    * The scaling instructions.
    */
  var ScalingInstructions: awsDashSdkLib.clientsAutoscalingplansMod.ScalingInstructions
  /**
    * The name of the scaling plan.
    */
  var ScalingPlanName: awsDashSdkLib.clientsAutoscalingplansMod.ScalingPlanName
  /**
    * The version number of the scaling plan.
    */
  var ScalingPlanVersion: awsDashSdkLib.clientsAutoscalingplansMod.ScalingPlanVersion
  /**
    * The status of the scaling plan.    Active - The scaling plan is active.    ActiveWithProblems - The scaling plan is active, but the scaling configuration for one or more resources could not be applied.    CreationInProgress - The scaling plan is being created.    CreationFailed - The scaling plan could not be created.    DeletionInProgress - The scaling plan is being deleted.    DeletionFailed - The scaling plan could not be deleted.    UpdateInProgress - The scaling plan is being updated.    UpdateFailed - The scaling plan could not be updated.  
    */
  var StatusCode: ScalingPlanStatusCode
  /**
    * A simple message about the current status of the scaling plan.
    */
  var StatusMessage: js.UndefOr[XmlString] = js.undefined
  /**
    * The Unix time stamp when the scaling plan entered the current status.
    */
  var StatusStartTime: js.UndefOr[TimestampType] = js.undefined
}

object ScalingPlan {
  @scala.inline
  def apply(
    ApplicationSource: ApplicationSource,
    ScalingInstructions: ScalingInstructions,
    ScalingPlanName: ScalingPlanName,
    ScalingPlanVersion: ScalingPlanVersion,
    StatusCode: ScalingPlanStatusCode,
    CreationTime: TimestampType = null,
    StatusMessage: XmlString = null,
    StatusStartTime: TimestampType = null
  ): ScalingPlan = {
    val __obj = js.Dynamic.literal(ApplicationSource = ApplicationSource, ScalingInstructions = ScalingInstructions, ScalingPlanName = ScalingPlanName, ScalingPlanVersion = ScalingPlanVersion, StatusCode = StatusCode.asInstanceOf[js.Any])
    if (CreationTime != null) __obj.updateDynamic("CreationTime")(CreationTime)
    if (StatusMessage != null) __obj.updateDynamic("StatusMessage")(StatusMessage)
    if (StatusStartTime != null) __obj.updateDynamic("StatusStartTime")(StatusStartTime)
    __obj.asInstanceOf[ScalingPlan]
  }
}

