package typings.awsDashSdk.clientsCodepipelineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StageExecution extends js.Object {
  /**
    * The ID of the pipeline execution associated with the stage.
    */
  var pipelineExecutionId: PipelineExecutionId
  /**
    * The status of the stage, or for a completed stage, the last status of the stage.
    */
  var status: StageExecutionStatus
}

object StageExecution {
  @scala.inline
  def apply(pipelineExecutionId: PipelineExecutionId, status: StageExecutionStatus): StageExecution = {
    val __obj = js.Dynamic.literal(pipelineExecutionId = pipelineExecutionId, status = status.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[StageExecution]
  }
}

