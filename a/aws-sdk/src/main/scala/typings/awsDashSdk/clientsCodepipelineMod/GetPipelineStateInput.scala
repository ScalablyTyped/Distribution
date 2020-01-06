package typings.awsDashSdk.clientsCodepipelineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetPipelineStateInput extends js.Object {
  /**
    * The name of the pipeline about which you want to get information.
    */
  var name: PipelineName = js.native
}

object GetPipelineStateInput {
  @scala.inline
  def apply(name: PipelineName): GetPipelineStateInput = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GetPipelineStateInput]
  }
}

