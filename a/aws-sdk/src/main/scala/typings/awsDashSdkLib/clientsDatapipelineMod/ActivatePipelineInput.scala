package typings
package awsDashSdkLib.clientsDatapipelineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ActivatePipelineInput extends js.Object {
  /**
    * A list of parameter values to pass to the pipeline at activation.
    */
  var parameterValues: js.UndefOr[ParameterValueList] = js.undefined
  /**
    * The ID of the pipeline.
    */
  var pipelineId: id
  /**
    * The date and time to resume the pipeline. By default, the pipeline resumes from the last completed execution.
    */
  var startTimestamp: js.UndefOr[timestamp] = js.undefined
}

object ActivatePipelineInput {
  @scala.inline
  def apply(pipelineId: id, parameterValues: ParameterValueList = null, startTimestamp: timestamp = null): ActivatePipelineInput = {
    val __obj = js.Dynamic.literal(pipelineId = pipelineId)
    if (parameterValues != null) __obj.updateDynamic("parameterValues")(parameterValues)
    if (startTimestamp != null) __obj.updateDynamic("startTimestamp")(startTimestamp)
    __obj.asInstanceOf[ActivatePipelineInput]
  }
}

