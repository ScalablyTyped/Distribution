package typings.awsDashSdk.clientsIotanalyticsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PipelineSummary extends js.Object {
  /**
    * When the pipeline was created.
    */
  var creationTime: js.UndefOr[Timestamp] = js.undefined
  /**
    * When the pipeline was last updated.
    */
  var lastUpdateTime: js.UndefOr[Timestamp] = js.undefined
  /**
    * The name of the pipeline.
    */
  var pipelineName: js.UndefOr[PipelineName] = js.undefined
  /**
    * A summary of information about the pipeline reprocessing.
    */
  var reprocessingSummaries: js.UndefOr[ReprocessingSummaries] = js.undefined
}

object PipelineSummary {
  @scala.inline
  def apply(
    creationTime: Timestamp = null,
    lastUpdateTime: Timestamp = null,
    pipelineName: PipelineName = null,
    reprocessingSummaries: ReprocessingSummaries = null
  ): PipelineSummary = {
    val __obj = js.Dynamic.literal()
    if (creationTime != null) __obj.updateDynamic("creationTime")(creationTime)
    if (lastUpdateTime != null) __obj.updateDynamic("lastUpdateTime")(lastUpdateTime)
    if (pipelineName != null) __obj.updateDynamic("pipelineName")(pipelineName)
    if (reprocessingSummaries != null) __obj.updateDynamic("reprocessingSummaries")(reprocessingSummaries)
    __obj.asInstanceOf[PipelineSummary]
  }
}

