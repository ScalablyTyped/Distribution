package typings.awsDashSdk.clientsCodepipelineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ActionExecutionOutput extends js.Object {
  /**
    * Execution result information listed in the output details for an action execution.
    */
  var executionResult: js.UndefOr[ActionExecutionResult] = js.native
  /**
    * Details of output artifacts of the action that correspond to the action execution.
    */
  var outputArtifacts: js.UndefOr[ArtifactDetailList] = js.native
  /**
    * The outputVariables field shows the key-value pairs that were output as part of that execution.
    */
  var outputVariables: js.UndefOr[OutputVariablesMap] = js.native
}

object ActionExecutionOutput {
  @scala.inline
  def apply(
    executionResult: ActionExecutionResult = null,
    outputArtifacts: ArtifactDetailList = null,
    outputVariables: OutputVariablesMap = null
  ): ActionExecutionOutput = {
    val __obj = js.Dynamic.literal()
    if (executionResult != null) __obj.updateDynamic("executionResult")(executionResult.asInstanceOf[js.Any])
    if (outputArtifacts != null) __obj.updateDynamic("outputArtifacts")(outputArtifacts.asInstanceOf[js.Any])
    if (outputVariables != null) __obj.updateDynamic("outputVariables")(outputVariables.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActionExecutionOutput]
  }
}

