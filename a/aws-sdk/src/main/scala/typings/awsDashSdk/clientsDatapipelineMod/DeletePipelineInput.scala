package typings.awsDashSdk.clientsDatapipelineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeletePipelineInput extends js.Object {
  /**
    * The ID of the pipeline.
    */
  var pipelineId: id
}

object DeletePipelineInput {
  @scala.inline
  def apply(pipelineId: id): DeletePipelineInput = {
    val __obj = js.Dynamic.literal(pipelineId = pipelineId)
  
    __obj.asInstanceOf[DeletePipelineInput]
  }
}

