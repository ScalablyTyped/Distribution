package typings.awsDashSdk.clientsDatapipelineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PutPipelineDefinitionInput extends js.Object {
  /**
    * The parameter objects used with the pipeline.
    */
  var parameterObjects: js.UndefOr[ParameterObjectList] = js.native
  /**
    * The parameter values used with the pipeline.
    */
  var parameterValues: js.UndefOr[ParameterValueList] = js.native
  /**
    * The ID of the pipeline.
    */
  var pipelineId: id = js.native
  /**
    * The objects that define the pipeline. These objects overwrite the existing pipeline definition.
    */
  var pipelineObjects: PipelineObjectList = js.native
}

object PutPipelineDefinitionInput {
  @scala.inline
  def apply(
    pipelineId: id,
    pipelineObjects: PipelineObjectList,
    parameterObjects: ParameterObjectList = null,
    parameterValues: ParameterValueList = null
  ): PutPipelineDefinitionInput = {
    val __obj = js.Dynamic.literal(pipelineId = pipelineId.asInstanceOf[js.Any], pipelineObjects = pipelineObjects.asInstanceOf[js.Any])
    if (parameterObjects != null) __obj.updateDynamic("parameterObjects")(parameterObjects.asInstanceOf[js.Any])
    if (parameterValues != null) __obj.updateDynamic("parameterValues")(parameterValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutPipelineDefinitionInput]
  }
}

