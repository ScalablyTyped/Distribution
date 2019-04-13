package typings
package awsDashSdkLib.clientsDatapipelineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetPipelineDefinitionInput extends js.Object {
  /**
    * The ID of the pipeline.
    */
  var pipelineId: id
  /**
    * The version of the pipeline definition to retrieve. Set this parameter to latest (default) to use the last definition saved to the pipeline or active to use the last definition that was activated.
    */
  var version: js.UndefOr[java.lang.String] = js.undefined
}

object GetPipelineDefinitionInput {
  @scala.inline
  def apply(pipelineId: id, version: java.lang.String = null): GetPipelineDefinitionInput = {
    val __obj = js.Dynamic.literal(pipelineId = pipelineId)
    if (version != null) __obj.updateDynamic("version")(version)
    __obj.asInstanceOf[GetPipelineDefinitionInput]
  }
}

