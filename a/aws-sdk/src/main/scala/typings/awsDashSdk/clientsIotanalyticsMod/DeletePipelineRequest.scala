package typings.awsDashSdk.clientsIotanalyticsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeletePipelineRequest extends js.Object {
  /**
    * The name of the pipeline to delete.
    */
  var pipelineName: PipelineName = js.native
}

object DeletePipelineRequest {
  @scala.inline
  def apply(pipelineName: PipelineName): DeletePipelineRequest = {
    val __obj = js.Dynamic.literal(pipelineName = pipelineName.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DeletePipelineRequest]
  }
}

