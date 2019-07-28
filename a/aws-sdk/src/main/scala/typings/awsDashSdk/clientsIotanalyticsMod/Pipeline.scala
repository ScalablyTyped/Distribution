package typings.awsDashSdk.clientsIotanalyticsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Pipeline extends js.Object {
  /**
    * The activities that perform transformations on the messages.
    */
  var activities: js.UndefOr[PipelineActivities] = js.undefined
  /**
    * The ARN of the pipeline.
    */
  var arn: js.UndefOr[PipelineArn] = js.undefined
  /**
    * When the pipeline was created.
    */
  var creationTime: js.UndefOr[Timestamp] = js.undefined
  /**
    * The last time the pipeline was updated.
    */
  var lastUpdateTime: js.UndefOr[Timestamp] = js.undefined
  /**
    * The name of the pipeline.
    */
  var name: js.UndefOr[PipelineName] = js.undefined
  /**
    * A summary of information about the pipeline reprocessing.
    */
  var reprocessingSummaries: js.UndefOr[ReprocessingSummaries] = js.undefined
}

object Pipeline {
  @scala.inline
  def apply(
    activities: PipelineActivities = null,
    arn: PipelineArn = null,
    creationTime: Timestamp = null,
    lastUpdateTime: Timestamp = null,
    name: PipelineName = null,
    reprocessingSummaries: ReprocessingSummaries = null
  ): Pipeline = {
    val __obj = js.Dynamic.literal()
    if (activities != null) __obj.updateDynamic("activities")(activities)
    if (arn != null) __obj.updateDynamic("arn")(arn)
    if (creationTime != null) __obj.updateDynamic("creationTime")(creationTime)
    if (lastUpdateTime != null) __obj.updateDynamic("lastUpdateTime")(lastUpdateTime)
    if (name != null) __obj.updateDynamic("name")(name)
    if (reprocessingSummaries != null) __obj.updateDynamic("reprocessingSummaries")(reprocessingSummaries)
    __obj.asInstanceOf[Pipeline]
  }
}

