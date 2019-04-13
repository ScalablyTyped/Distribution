package typings
package awsDashSdkLib.clientsIotjobsdataplaneMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetPendingJobExecutionsResponse extends js.Object {
  /**
    * A list of JobExecutionSummary objects with status IN_PROGRESS.
    */
  var inProgressJobs: js.UndefOr[JobExecutionSummaryList] = js.undefined
  /**
    * A list of JobExecutionSummary objects with status QUEUED.
    */
  var queuedJobs: js.UndefOr[JobExecutionSummaryList] = js.undefined
}

object GetPendingJobExecutionsResponse {
  @scala.inline
  def apply(inProgressJobs: JobExecutionSummaryList = null, queuedJobs: JobExecutionSummaryList = null): GetPendingJobExecutionsResponse = {
    val __obj = js.Dynamic.literal()
    if (inProgressJobs != null) __obj.updateDynamic("inProgressJobs")(inProgressJobs)
    if (queuedJobs != null) __obj.updateDynamic("queuedJobs")(queuedJobs)
    __obj.asInstanceOf[GetPendingJobExecutionsResponse]
  }
}

