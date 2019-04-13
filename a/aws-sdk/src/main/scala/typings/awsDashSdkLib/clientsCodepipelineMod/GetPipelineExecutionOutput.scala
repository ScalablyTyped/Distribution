package typings
package awsDashSdkLib.clientsCodepipelineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetPipelineExecutionOutput extends js.Object {
  /**
    * Represents information about the execution of a pipeline.
    */
  var pipelineExecution: js.UndefOr[PipelineExecution] = js.undefined
}

object GetPipelineExecutionOutput {
  @scala.inline
  def apply(pipelineExecution: PipelineExecution = null): GetPipelineExecutionOutput = {
    val __obj = js.Dynamic.literal()
    if (pipelineExecution != null) __obj.updateDynamic("pipelineExecution")(pipelineExecution)
    __obj.asInstanceOf[GetPipelineExecutionOutput]
  }
}

