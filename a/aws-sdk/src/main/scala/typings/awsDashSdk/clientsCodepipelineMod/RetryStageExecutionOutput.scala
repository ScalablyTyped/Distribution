package typings.awsDashSdk.clientsCodepipelineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RetryStageExecutionOutput extends js.Object {
  /**
    * The ID of the current workflow execution in the failed stage.
    */
  var pipelineExecutionId: js.UndefOr[PipelineExecutionId] = js.undefined
}

object RetryStageExecutionOutput {
  @scala.inline
  def apply(pipelineExecutionId: PipelineExecutionId = null): RetryStageExecutionOutput = {
    val __obj = js.Dynamic.literal()
    if (pipelineExecutionId != null) __obj.updateDynamic("pipelineExecutionId")(pipelineExecutionId)
    __obj.asInstanceOf[RetryStageExecutionOutput]
  }
}

