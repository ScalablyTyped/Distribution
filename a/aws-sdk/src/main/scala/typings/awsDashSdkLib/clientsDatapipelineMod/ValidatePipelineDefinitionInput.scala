package typings
package awsDashSdkLib.clientsDatapipelineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ValidatePipelineDefinitionInput extends js.Object {
  /**
    * The parameter objects used with the pipeline.
    */
  var parameterObjects: js.UndefOr[ParameterObjectList] = js.undefined
  /**
    * The parameter values used with the pipeline.
    */
  var parameterValues: js.UndefOr[ParameterValueList] = js.undefined
  /**
    * The ID of the pipeline.
    */
  var pipelineId: id
  /**
    * The objects that define the pipeline changes to validate against the pipeline.
    */
  var pipelineObjects: PipelineObjectList
}

object ValidatePipelineDefinitionInput {
  @scala.inline
  def apply(
    pipelineId: id,
    pipelineObjects: PipelineObjectList,
    parameterObjects: ParameterObjectList = null,
    parameterValues: ParameterValueList = null
  ): ValidatePipelineDefinitionInput = {
    val __obj = js.Dynamic.literal(pipelineId = pipelineId, pipelineObjects = pipelineObjects)
    if (parameterObjects != null) __obj.updateDynamic("parameterObjects")(parameterObjects)
    if (parameterValues != null) __obj.updateDynamic("parameterValues")(parameterValues)
    __obj.asInstanceOf[ValidatePipelineDefinitionInput]
  }
}

