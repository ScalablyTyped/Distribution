package typings.awsDashSdk.clientsIotanalyticsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribePipelineRequest extends js.Object {
  /**
    * The name of the pipeline whose information is retrieved.
    */
  var pipelineName: PipelineName
}

object DescribePipelineRequest {
  @scala.inline
  def apply(pipelineName: PipelineName): DescribePipelineRequest = {
    val __obj = js.Dynamic.literal(pipelineName = pipelineName)
  
    __obj.asInstanceOf[DescribePipelineRequest]
  }
}

