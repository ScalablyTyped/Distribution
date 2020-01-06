package typings.awsDashSdk.clientsCodepipelineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RetryStageExecutionOutput extends js.Object {
  /**
    * The ID of the current workflow execution in the failed stage.
    */
  var pipelineExecutionId: js.UndefOr[PipelineExecutionId] = js.native
}

object RetryStageExecutionOutput {
  @scala.inline
  def apply(pipelineExecutionId: PipelineExecutionId = null): RetryStageExecutionOutput = {
    val __obj = js.Dynamic.literal()
    if (pipelineExecutionId != null) __obj.updateDynamic("pipelineExecutionId")(pipelineExecutionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[RetryStageExecutionOutput]
  }
}

