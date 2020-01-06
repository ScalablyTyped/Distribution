package typings.awsDashSdk.clientsDatapipelineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribePipelinesInput extends js.Object {
  /**
    * The IDs of the pipelines to describe. You can pass as many as 25 identifiers in a single call. To obtain pipeline IDs, call ListPipelines.
    */
  var pipelineIds: idList = js.native
}

object DescribePipelinesInput {
  @scala.inline
  def apply(pipelineIds: idList): DescribePipelinesInput = {
    val __obj = js.Dynamic.literal(pipelineIds = pipelineIds.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DescribePipelinesInput]
  }
}

