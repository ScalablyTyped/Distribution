package typings
package awsDashSdkLib.clientsIotanalyticsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeletePipelineRequest extends js.Object {
  /**
    * The name of the pipeline to delete.
    */
  var pipelineName: PipelineName
}

object DeletePipelineRequest {
  @scala.inline
  def apply(pipelineName: PipelineName): DeletePipelineRequest = {
    val __obj = js.Dynamic.literal(pipelineName = pipelineName)
  
    __obj.asInstanceOf[DeletePipelineRequest]
  }
}

