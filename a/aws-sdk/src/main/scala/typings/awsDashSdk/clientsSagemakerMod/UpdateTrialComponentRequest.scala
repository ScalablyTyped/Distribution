package typings.awsDashSdk.clientsSagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateTrialComponentRequest extends js.Object {
  /**
    * The name of the component as displayed. The name doesn't need to be unique. If DisplayName isn't specified, TrialComponentName is displayed.
    */
  var DisplayName: js.UndefOr[ExperimentEntityName] = js.native
  /**
    * When the component ended.
    */
  var EndTime: js.UndefOr[Timestamp] = js.native
  /**
    * Replaces all of the component's input artifacts with the specified artifacts.
    */
  var InputArtifacts: js.UndefOr[TrialComponentArtifacts] = js.native
  /**
    * The input artifacts to remove from the component.
    */
  var InputArtifactsToRemove: js.UndefOr[ListTrialComponentKey256] = js.native
  /**
    * Replaces all of the component's output artifacts with the specified artifacts.
    */
  var OutputArtifacts: js.UndefOr[TrialComponentArtifacts] = js.native
  /**
    * The output artifacts to remove from the component.
    */
  var OutputArtifactsToRemove: js.UndefOr[ListTrialComponentKey256] = js.native
  /**
    * Replaces all of the component's hyperparameters with the specified hyperparameters.
    */
  var Parameters: js.UndefOr[TrialComponentParameters] = js.native
  /**
    * The hyperparameters to remove from the component.
    */
  var ParametersToRemove: js.UndefOr[ListTrialComponentKey256] = js.native
  /**
    * When the component started.
    */
  var StartTime: js.UndefOr[Timestamp] = js.native
  /**
    * The new status of the component.
    */
  var Status: js.UndefOr[TrialComponentStatus] = js.native
  /**
    * The name of the component to update.
    */
  var TrialComponentName: ExperimentEntityName = js.native
}

object UpdateTrialComponentRequest {
  @scala.inline
  def apply(
    TrialComponentName: ExperimentEntityName,
    DisplayName: ExperimentEntityName = null,
    EndTime: Timestamp = null,
    InputArtifacts: TrialComponentArtifacts = null,
    InputArtifactsToRemove: ListTrialComponentKey256 = null,
    OutputArtifacts: TrialComponentArtifacts = null,
    OutputArtifactsToRemove: ListTrialComponentKey256 = null,
    Parameters: TrialComponentParameters = null,
    ParametersToRemove: ListTrialComponentKey256 = null,
    StartTime: Timestamp = null,
    Status: TrialComponentStatus = null
  ): UpdateTrialComponentRequest = {
    val __obj = js.Dynamic.literal(TrialComponentName = TrialComponentName.asInstanceOf[js.Any])
    if (DisplayName != null) __obj.updateDynamic("DisplayName")(DisplayName.asInstanceOf[js.Any])
    if (EndTime != null) __obj.updateDynamic("EndTime")(EndTime.asInstanceOf[js.Any])
    if (InputArtifacts != null) __obj.updateDynamic("InputArtifacts")(InputArtifacts.asInstanceOf[js.Any])
    if (InputArtifactsToRemove != null) __obj.updateDynamic("InputArtifactsToRemove")(InputArtifactsToRemove.asInstanceOf[js.Any])
    if (OutputArtifacts != null) __obj.updateDynamic("OutputArtifacts")(OutputArtifacts.asInstanceOf[js.Any])
    if (OutputArtifactsToRemove != null) __obj.updateDynamic("OutputArtifactsToRemove")(OutputArtifactsToRemove.asInstanceOf[js.Any])
    if (Parameters != null) __obj.updateDynamic("Parameters")(Parameters.asInstanceOf[js.Any])
    if (ParametersToRemove != null) __obj.updateDynamic("ParametersToRemove")(ParametersToRemove.asInstanceOf[js.Any])
    if (StartTime != null) __obj.updateDynamic("StartTime")(StartTime.asInstanceOf[js.Any])
    if (Status != null) __obj.updateDynamic("Status")(Status.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateTrialComponentRequest]
  }
}

