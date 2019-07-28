package typings.awsDashSdk.clientsIotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JobExecutionSummaryForThing extends js.Object {
  /**
    * Contains a subset of information about a job execution.
    */
  var jobExecutionSummary: js.UndefOr[JobExecutionSummary] = js.undefined
  /**
    * The unique identifier you assigned to this job when it was created.
    */
  var jobId: js.UndefOr[JobId] = js.undefined
}

object JobExecutionSummaryForThing {
  @scala.inline
  def apply(jobExecutionSummary: JobExecutionSummary = null, jobId: JobId = null): JobExecutionSummaryForThing = {
    val __obj = js.Dynamic.literal()
    if (jobExecutionSummary != null) __obj.updateDynamic("jobExecutionSummary")(jobExecutionSummary)
    if (jobId != null) __obj.updateDynamic("jobId")(jobId)
    __obj.asInstanceOf[JobExecutionSummaryForThing]
  }
}

