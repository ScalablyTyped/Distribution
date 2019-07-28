package typings.awsDashSdk.clientsIotanalyticsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StartPipelineReprocessingRequest extends js.Object {
  /**
    * The end time (exclusive) of raw message data that is reprocessed.
    */
  var endTime: js.UndefOr[EndTime] = js.undefined
  /**
    * The name of the pipeline on which to start reprocessing.
    */
  var pipelineName: PipelineName
  /**
    * The start time (inclusive) of raw message data that is reprocessed.
    */
  var startTime: js.UndefOr[StartTime] = js.undefined
}

object StartPipelineReprocessingRequest {
  @scala.inline
  def apply(pipelineName: PipelineName, endTime: EndTime = null, startTime: StartTime = null): StartPipelineReprocessingRequest = {
    val __obj = js.Dynamic.literal(pipelineName = pipelineName)
    if (endTime != null) __obj.updateDynamic("endTime")(endTime)
    if (startTime != null) __obj.updateDynamic("startTime")(startTime)
    __obj.asInstanceOf[StartPipelineReprocessingRequest]
  }
}

