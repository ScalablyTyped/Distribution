package typings.awsDashSdk.clientsDatapipelineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PutPipelineDefinitionInput extends js.Object {
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
    * The objects that define the pipeline. These objects overwrite the existing pipeline definition.
    */
  var pipelineObjects: PipelineObjectList
}

object PutPipelineDefinitionInput {
  @scala.inline
  def apply(
    pipelineId: id,
    pipelineObjects: PipelineObjectList,
    parameterObjects: ParameterObjectList = null,
    parameterValues: ParameterValueList = null
  ): PutPipelineDefinitionInput = {
    val __obj = js.Dynamic.literal(pipelineId = pipelineId, pipelineObjects = pipelineObjects)
    if (parameterObjects != null) __obj.updateDynamic("parameterObjects")(parameterObjects)
    if (parameterValues != null) __obj.updateDynamic("parameterValues")(parameterValues)
    __obj.asInstanceOf[PutPipelineDefinitionInput]
  }
}

