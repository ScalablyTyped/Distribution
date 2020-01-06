package typings.awsDashSdk.clientsDatapipelineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ActivatePipelineInput extends js.Object {
  /**
    * A list of parameter values to pass to the pipeline at activation.
    */
  var parameterValues: js.UndefOr[ParameterValueList] = js.native
  /**
    * The ID of the pipeline.
    */
  var pipelineId: id = js.native
  /**
    * The date and time to resume the pipeline. By default, the pipeline resumes from the last completed execution.
    */
  var startTimestamp: js.UndefOr[timestamp] = js.native
}

object ActivatePipelineInput {
  @scala.inline
  def apply(pipelineId: id, parameterValues: ParameterValueList = null, startTimestamp: timestamp = null): ActivatePipelineInput = {
    val __obj = js.Dynamic.literal(pipelineId = pipelineId.asInstanceOf[js.Any])
    if (parameterValues != null) __obj.updateDynamic("parameterValues")(parameterValues.asInstanceOf[js.Any])
    if (startTimestamp != null) __obj.updateDynamic("startTimestamp")(startTimestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActivatePipelineInput]
  }
}

