package typings.awsDashSdk.clientsGlueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BatchStopJobRunError extends js.Object {
  /**
    * Specifies details about the error that was encountered.
    */
  var ErrorDetail: js.UndefOr[typings.awsDashSdk.clientsGlueMod.ErrorDetail] = js.undefined
  /**
    * The name of the job definition that is used in the job run in question.
    */
  var JobName: js.UndefOr[NameString] = js.undefined
  /**
    * The JobRunId of the job run in question.
    */
  var JobRunId: js.UndefOr[IdString] = js.undefined
}

object BatchStopJobRunError {
  @scala.inline
  def apply(ErrorDetail: ErrorDetail = null, JobName: NameString = null, JobRunId: IdString = null): BatchStopJobRunError = {
    val __obj = js.Dynamic.literal()
    if (ErrorDetail != null) __obj.updateDynamic("ErrorDetail")(ErrorDetail)
    if (JobName != null) __obj.updateDynamic("JobName")(JobName)
    if (JobRunId != null) __obj.updateDynamic("JobRunId")(JobRunId)
    __obj.asInstanceOf[BatchStopJobRunError]
  }
}

