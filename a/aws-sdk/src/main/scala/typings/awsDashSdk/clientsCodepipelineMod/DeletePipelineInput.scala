package typings.awsDashSdk.clientsCodepipelineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeletePipelineInput extends js.Object {
  /**
    * The name of the pipeline to be deleted.
    */
  var name: PipelineName = js.native
}

object DeletePipelineInput {
  @scala.inline
  def apply(name: PipelineName): DeletePipelineInput = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DeletePipelineInput]
  }
}

