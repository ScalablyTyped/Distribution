package typings
package awsDashSdkLib.clientsCodepipelineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PutActionRevisionOutput extends js.Object {
  /**
    * Indicates whether the artifact revision was previously used in an execution of the specified pipeline.
    */
  var newRevision: js.UndefOr[Boolean] = js.undefined
  /**
    * The ID of the current workflow state of the pipeline.
    */
  var pipelineExecutionId: js.UndefOr[PipelineExecutionId] = js.undefined
}

object PutActionRevisionOutput {
  @scala.inline
  def apply(newRevision: js.UndefOr[Boolean] = js.undefined, pipelineExecutionId: PipelineExecutionId = null): PutActionRevisionOutput = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(newRevision)) __obj.updateDynamic("newRevision")(newRevision)
    if (pipelineExecutionId != null) __obj.updateDynamic("pipelineExecutionId")(pipelineExecutionId)
    __obj.asInstanceOf[PutActionRevisionOutput]
  }
}

