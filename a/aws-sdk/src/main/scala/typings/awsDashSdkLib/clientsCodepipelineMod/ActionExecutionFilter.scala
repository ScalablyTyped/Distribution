package typings
package awsDashSdkLib.clientsCodepipelineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ActionExecutionFilter extends js.Object {
  /**
    * The pipeline execution ID used to filter action execution history.
    */
  var pipelineExecutionId: js.UndefOr[PipelineExecutionId] = js.undefined
}

object ActionExecutionFilter {
  @scala.inline
  def apply(pipelineExecutionId: PipelineExecutionId = null): ActionExecutionFilter = {
    val __obj = js.Dynamic.literal()
    if (pipelineExecutionId != null) __obj.updateDynamic("pipelineExecutionId")(pipelineExecutionId)
    __obj.asInstanceOf[ActionExecutionFilter]
  }
}

