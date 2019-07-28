package typings.awsDashSdk.clientsS3controlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JobListDescriptor extends js.Object {
  /**
    * A timestamp indicating when the specified job was created.
    */
  var CreationTime: js.UndefOr[JobCreationTime] = js.undefined
  /**
    * The user-specified description that was included in the specified job's Create Job request.
    */
  var Description: js.UndefOr[NonEmptyMaxLength256String] = js.undefined
  /**
    * The ID for the specified job.
    */
  var JobId: js.UndefOr[typings.awsDashSdk.clientsS3controlMod.JobId] = js.undefined
  /**
    * The operation that the specified job is configured to run on each object listed in the manifest.
    */
  var Operation: js.UndefOr[OperationName] = js.undefined
  /**
    * The current priority for the specified job.
    */
  var Priority: js.UndefOr[JobPriority] = js.undefined
  /**
    * Describes the total number of tasks that the specified job has executed, the number of tasks that succeeded, and the number of tasks that failed.
    */
  var ProgressSummary: js.UndefOr[JobProgressSummary] = js.undefined
  /**
    * The specified job's current status.
    */
  var Status: js.UndefOr[JobStatus] = js.undefined
  /**
    * A timestamp indicating when the specified job terminated. A job's termination date is the date and time when it succeeded, failed, or was canceled.
    */
  var TerminationDate: js.UndefOr[JobTerminationDate] = js.undefined
}

object JobListDescriptor {
  @scala.inline
  def apply(
    CreationTime: JobCreationTime = null,
    Description: NonEmptyMaxLength256String = null,
    JobId: JobId = null,
    Operation: OperationName = null,
    Priority: js.UndefOr[JobPriority] = js.undefined,
    ProgressSummary: JobProgressSummary = null,
    Status: JobStatus = null,
    TerminationDate: JobTerminationDate = null
  ): JobListDescriptor = {
    val __obj = js.Dynamic.literal()
    if (CreationTime != null) __obj.updateDynamic("CreationTime")(CreationTime)
    if (Description != null) __obj.updateDynamic("Description")(Description)
    if (JobId != null) __obj.updateDynamic("JobId")(JobId)
    if (Operation != null) __obj.updateDynamic("Operation")(Operation.asInstanceOf[js.Any])
    if (!js.isUndefined(Priority)) __obj.updateDynamic("Priority")(Priority)
    if (ProgressSummary != null) __obj.updateDynamic("ProgressSummary")(ProgressSummary)
    if (Status != null) __obj.updateDynamic("Status")(Status.asInstanceOf[js.Any])
    if (TerminationDate != null) __obj.updateDynamic("TerminationDate")(TerminationDate)
    __obj.asInstanceOf[JobListDescriptor]
  }
}

