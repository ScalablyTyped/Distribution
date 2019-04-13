package typings
package awsDashSdkLib.clientsDatapipelineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetPipelineDefinitionOutput extends js.Object {
  /**
    * The parameter objects used in the pipeline definition.
    */
  var parameterObjects: js.UndefOr[ParameterObjectList] = js.undefined
  /**
    * The parameter values used in the pipeline definition.
    */
  var parameterValues: js.UndefOr[ParameterValueList] = js.undefined
  /**
    * The objects defined in the pipeline.
    */
  var pipelineObjects: js.UndefOr[PipelineObjectList] = js.undefined
}

object GetPipelineDefinitionOutput {
  @scala.inline
  def apply(
    parameterObjects: ParameterObjectList = null,
    parameterValues: ParameterValueList = null,
    pipelineObjects: PipelineObjectList = null
  ): GetPipelineDefinitionOutput = {
    val __obj = js.Dynamic.literal()
    if (parameterObjects != null) __obj.updateDynamic("parameterObjects")(parameterObjects)
    if (parameterValues != null) __obj.updateDynamic("parameterValues")(parameterValues)
    if (pipelineObjects != null) __obj.updateDynamic("pipelineObjects")(pipelineObjects)
    __obj.asInstanceOf[GetPipelineDefinitionOutput]
  }
}

