package typings.awsDashSdk.clientsCodepipelineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StartPipelineExecutionOutput extends js.Object {
  /**
    * The unique system-generated ID of the pipeline execution that was started.
    */
  var pipelineExecutionId: js.UndefOr[PipelineExecutionId] = js.undefined
}

object StartPipelineExecutionOutput {
  @scala.inline
  def apply(pipelineExecutionId: PipelineExecutionId = null): StartPipelineExecutionOutput = {
    val __obj = js.Dynamic.literal()
    if (pipelineExecutionId != null) __obj.updateDynamic("pipelineExecutionId")(pipelineExecutionId)
    __obj.asInstanceOf[StartPipelineExecutionOutput]
  }
}

