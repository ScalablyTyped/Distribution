package typings
package awsDashSdkLib.clientsCodepipelineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdatePipelineInput extends js.Object {
  /**
    * The name of the pipeline to be updated.
    */
  var pipeline: PipelineDeclaration
}

object UpdatePipelineInput {
  @scala.inline
  def apply(pipeline: PipelineDeclaration): UpdatePipelineInput = {
    val __obj = js.Dynamic.literal(pipeline = pipeline)
  
    __obj.asInstanceOf[UpdatePipelineInput]
  }
}

