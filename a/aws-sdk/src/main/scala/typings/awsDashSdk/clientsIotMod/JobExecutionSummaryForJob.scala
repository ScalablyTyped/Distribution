package typings.awsDashSdk.clientsIotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JobExecutionSummaryForJob extends js.Object {
  /**
    * Contains a subset of information about a job execution.
    */
  var jobExecutionSummary: js.UndefOr[JobExecutionSummary] = js.undefined
  /**
    * The ARN of the thing on which the job execution is running.
    */
  var thingArn: js.UndefOr[ThingArn] = js.undefined
}

object JobExecutionSummaryForJob {
  @scala.inline
  def apply(jobExecutionSummary: JobExecutionSummary = null, thingArn: ThingArn = null): JobExecutionSummaryForJob = {
    val __obj = js.Dynamic.literal()
    if (jobExecutionSummary != null) __obj.updateDynamic("jobExecutionSummary")(jobExecutionSummary)
    if (thingArn != null) __obj.updateDynamic("thingArn")(thingArn)
    __obj.asInstanceOf[JobExecutionSummaryForJob]
  }
}

