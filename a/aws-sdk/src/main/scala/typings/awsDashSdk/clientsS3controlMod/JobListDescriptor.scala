package typings.awsDashSdk.clientsS3controlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JobListDescriptor extends js.Object {
  /**
    * A timestamp indicating when the specified job was created.
    */
  var CreationTime: js.UndefOr[JobCreationTime] = js.native
  /**
    * The user-specified description that was included in the specified job's Create Job request.
    */
  var Description: js.UndefOr[NonEmptyMaxLength256String] = js.native
  /**
    * The ID for the specified job.
    */
  var JobId: js.UndefOr[typings.awsDashSdk.clientsS3controlMod.JobId] = js.native
  /**
    * The operation that the specified job is configured to run on each object listed in the manifest.
    */
  var Operation: js.UndefOr[OperationName] = js.native
  /**
    * The current priority for the specified job.
    */
  var Priority: js.UndefOr[JobPriority] = js.native
  /**
    * Describes the total number of tasks that the specified job has executed, the number of tasks that succeeded, and the number of tasks that failed.
    */
  var ProgressSummary: js.UndefOr[JobProgressSummary] = js.native
  /**
    * The specified job's current status.
    */
  var Status: js.UndefOr[JobStatus] = js.native
  /**
    * A timestamp indicating when the specified job terminated. A job's termination date is the date and time when it succeeded, failed, or was canceled.
    */
  var TerminationDate: js.UndefOr[JobTerminationDate] = js.native
}

object JobListDescriptor {
  @scala.inline
  def apply(
    CreationTime: JobCreationTime = null,
    Description: NonEmptyMaxLength256String = null,
    JobId: JobId = null,
    Operation: OperationName = null,
    Priority: Int | Double = null,
    ProgressSummary: JobProgressSummary = null,
    Status: JobStatus = null,
    TerminationDate: JobTerminationDate = null
  ): JobListDescriptor = {
    val __obj = js.Dynamic.literal()
    if (CreationTime != null) __obj.updateDynamic("CreationTime")(CreationTime.asInstanceOf[js.Any])
    if (Description != null) __obj.updateDynamic("Description")(Description.asInstanceOf[js.Any])
    if (JobId != null) __obj.updateDynamic("JobId")(JobId.asInstanceOf[js.Any])
    if (Operation != null) __obj.updateDynamic("Operation")(Operation.asInstanceOf[js.Any])
    if (Priority != null) __obj.updateDynamic("Priority")(Priority.asInstanceOf[js.Any])
    if (ProgressSummary != null) __obj.updateDynamic("ProgressSummary")(ProgressSummary.asInstanceOf[js.Any])
    if (Status != null) __obj.updateDynamic("Status")(Status.asInstanceOf[js.Any])
    if (TerminationDate != null) __obj.updateDynamic("TerminationDate")(TerminationDate.asInstanceOf[js.Any])
    __obj.asInstanceOf[JobListDescriptor]
  }
}

