package typings.awsDashSdk.clientsCodepipelineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PollForThirdPartyJobsInput extends js.Object {
  /**
    * Represents information about an action type.
    */
  var actionTypeId: ActionTypeId
  /**
    * The maximum number of jobs to return in a poll for jobs call.
    */
  var maxBatchSize: js.UndefOr[MaxBatchSize] = js.undefined
}

object PollForThirdPartyJobsInput {
  @scala.inline
  def apply(actionTypeId: ActionTypeId, maxBatchSize: Int | Double = null): PollForThirdPartyJobsInput = {
    val __obj = js.Dynamic.literal(actionTypeId = actionTypeId)
    if (maxBatchSize != null) __obj.updateDynamic("maxBatchSize")(maxBatchSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[PollForThirdPartyJobsInput]
  }
}

