package typings
package awsDashSdkLib.clientsGlueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BatchStopJobRunSuccessfulSubmission extends js.Object {
  /**
    * The name of the job definition used in the job run that was stopped.
    */
  var JobName: js.UndefOr[NameString] = js.undefined
  /**
    * The JobRunId of the job run that was stopped.
    */
  var JobRunId: js.UndefOr[IdString] = js.undefined
}

object BatchStopJobRunSuccessfulSubmission {
  @scala.inline
  def apply(JobName: NameString = null, JobRunId: IdString = null): BatchStopJobRunSuccessfulSubmission = {
    val __obj = js.Dynamic.literal()
    if (JobName != null) __obj.updateDynamic("JobName")(JobName)
    if (JobRunId != null) __obj.updateDynamic("JobRunId")(JobRunId)
    __obj.asInstanceOf[BatchStopJobRunSuccessfulSubmission]
  }
}

