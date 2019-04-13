package typings
package awsDashSdkLib.clientsCodepipelineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreatePipelineInput extends js.Object {
  /**
    * Represents the structure of actions and stages to be performed in the pipeline. 
    */
  var pipeline: PipelineDeclaration
}

object CreatePipelineInput {
  @scala.inline
  def apply(pipeline: PipelineDeclaration): CreatePipelineInput = {
    val __obj = js.Dynamic.literal(pipeline = pipeline)
  
    __obj.asInstanceOf[CreatePipelineInput]
  }
}

