package typings.awsDashSdk.clientsCodepipelineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdatePipelineInput extends js.Object {
  /**
    * The name of the pipeline to be updated.
    */
  var pipeline: PipelineDeclaration = js.native
}

object UpdatePipelineInput {
  @scala.inline
  def apply(pipeline: PipelineDeclaration): UpdatePipelineInput = {
    val __obj = js.Dynamic.literal(pipeline = pipeline.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[UpdatePipelineInput]
  }
}

