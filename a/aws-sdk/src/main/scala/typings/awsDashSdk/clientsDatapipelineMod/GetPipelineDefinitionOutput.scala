package typings.awsDashSdk.clientsDatapipelineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetPipelineDefinitionOutput extends js.Object {
  /**
    * The parameter objects used in the pipeline definition.
    */
  var parameterObjects: js.UndefOr[ParameterObjectList] = js.native
  /**
    * The parameter values used in the pipeline definition.
    */
  var parameterValues: js.UndefOr[ParameterValueList] = js.native
  /**
    * The objects defined in the pipeline.
    */
  var pipelineObjects: js.UndefOr[PipelineObjectList] = js.native
}

object GetPipelineDefinitionOutput {
  @scala.inline
  def apply(
    parameterObjects: ParameterObjectList = null,
    parameterValues: ParameterValueList = null,
    pipelineObjects: PipelineObjectList = null
  ): GetPipelineDefinitionOutput = {
    val __obj = js.Dynamic.literal()
    if (parameterObjects != null) __obj.updateDynamic("parameterObjects")(parameterObjects.asInstanceOf[js.Any])
    if (parameterValues != null) __obj.updateDynamic("parameterValues")(parameterValues.asInstanceOf[js.Any])
    if (pipelineObjects != null) __obj.updateDynamic("pipelineObjects")(pipelineObjects.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetPipelineDefinitionOutput]
  }
}

