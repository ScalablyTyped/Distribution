package typings.awsDashSdk.clientsIotanalyticsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CancelPipelineReprocessingRequest extends js.Object {
  /**
    * The name of pipeline for which data reprocessing is canceled.
    */
  var pipelineName: PipelineName
  /**
    * The ID of the reprocessing task (returned by "StartPipelineReprocessing").
    */
  var reprocessingId: ReprocessingId
}

object CancelPipelineReprocessingRequest {
  @scala.inline
  def apply(pipelineName: PipelineName, reprocessingId: ReprocessingId): CancelPipelineReprocessingRequest = {
    val __obj = js.Dynamic.literal(pipelineName = pipelineName, reprocessingId = reprocessingId)
  
    __obj.asInstanceOf[CancelPipelineReprocessingRequest]
  }
}

