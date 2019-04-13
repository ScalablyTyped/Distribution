package typings
package awsDashSdkLib.clientsCodepipelineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ActionExecutionOutput extends js.Object {
  /**
    * Execution result information listed in the output details for an action execution.
    */
  var executionResult: js.UndefOr[ActionExecutionResult] = js.undefined
  /**
    * Details of output artifacts of the action that correspond to the action execution.
    */
  var outputArtifacts: js.UndefOr[ArtifactDetailList] = js.undefined
}

object ActionExecutionOutput {
  @scala.inline
  def apply(executionResult: ActionExecutionResult = null, outputArtifacts: ArtifactDetailList = null): ActionExecutionOutput = {
    val __obj = js.Dynamic.literal()
    if (executionResult != null) __obj.updateDynamic("executionResult")(executionResult)
    if (outputArtifacts != null) __obj.updateDynamic("outputArtifacts")(outputArtifacts)
    __obj.asInstanceOf[ActionExecutionOutput]
  }
}

