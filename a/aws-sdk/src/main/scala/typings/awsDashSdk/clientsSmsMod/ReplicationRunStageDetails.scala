package typings.awsDashSdk.clientsSmsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReplicationRunStageDetails extends js.Object {
  /**
    * String describing the current stage of a replication run.
    */
  var stage: js.UndefOr[ReplicationRunStage] = js.undefined
  /**
    * String describing the progress of the current stage of a replication run.
    */
  var stageProgress: js.UndefOr[ReplicationRunStageProgress] = js.undefined
}

object ReplicationRunStageDetails {
  @scala.inline
  def apply(stage: ReplicationRunStage = null, stageProgress: ReplicationRunStageProgress = null): ReplicationRunStageDetails = {
    val __obj = js.Dynamic.literal()
    if (stage != null) __obj.updateDynamic("stage")(stage)
    if (stageProgress != null) __obj.updateDynamic("stageProgress")(stageProgress)
    __obj.asInstanceOf[ReplicationRunStageDetails]
  }
}

