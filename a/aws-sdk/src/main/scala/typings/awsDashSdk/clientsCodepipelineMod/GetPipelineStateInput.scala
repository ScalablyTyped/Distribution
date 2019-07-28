package typings.awsDashSdk.clientsCodepipelineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetPipelineStateInput extends js.Object {
  /**
    * The name of the pipeline about which you want to get information.
    */
  var name: PipelineName
}

object GetPipelineStateInput {
  @scala.inline
  def apply(name: PipelineName): GetPipelineStateInput = {
    val __obj = js.Dynamic.literal(name = name)
  
    __obj.asInstanceOf[GetPipelineStateInput]
  }
}

