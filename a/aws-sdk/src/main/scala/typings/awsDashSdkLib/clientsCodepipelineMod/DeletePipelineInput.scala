package typings
package awsDashSdkLib.clientsCodepipelineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeletePipelineInput extends js.Object {
  /**
    * The name of the pipeline to be deleted.
    */
  var name: PipelineName
}

object DeletePipelineInput {
  @scala.inline
  def apply(name: PipelineName): DeletePipelineInput = {
    val __obj = js.Dynamic.literal(name = name)
  
    __obj.asInstanceOf[DeletePipelineInput]
  }
}

