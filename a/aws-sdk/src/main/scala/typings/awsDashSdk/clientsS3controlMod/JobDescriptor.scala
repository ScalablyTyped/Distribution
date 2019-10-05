package typings.awsDashSdk.clientsS3controlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JobDescriptor extends js.Object {
  /**
    * Indicates whether confirmation is required before Amazon S3 begins running the specified job. Confirmation is required only for jobs created through the Amazon S3 console.
    */
  var ConfirmationRequired: js.UndefOr[typings.awsDashSdk.clientsS3controlMod.ConfirmationRequired] = js.undefined
  /**
    * A timestamp indicating when this job was created.
    */
  var CreationTime: js.UndefOr[JobCreationTime] = js.undefined
  /**
    * The description for this job, if one was provided in this job's Create Job request.
    */
  var Description: js.UndefOr[NonEmptyMaxLength256String] = js.undefined
  /**
    * If the specified job failed, this field contains information describing the failure.
    */
  var FailureReasons: js.UndefOr[JobFailureList] = js.undefined
  /**
    * The Amazon Resource Name (ARN) for this job.
    */
  var JobArn: js.UndefOr[typings.awsDashSdk.clientsS3controlMod.JobArn] = js.undefined
  /**
    * The ID for the specified job.
    */
  var JobId: js.UndefOr[typings.awsDashSdk.clientsS3controlMod.JobId] = js.undefined
  /**
    * The configuration information for the specified job's manifest object.
    */
  var Manifest: js.UndefOr[JobManifest] = js.undefined
  /**
    * The operation that the specified job is configured to execute on the objects listed in the manifest.
    */
  var Operation: js.UndefOr[JobOperation] = js.undefined
  /**
    * The priority of the specified job.
    */
  var Priority: js.UndefOr[JobPriority] = js.undefined
  /**
    * Describes the total number of tasks that the specified job has executed, the number of tasks that succeeded, and the number of tasks that failed.
    */
  var ProgressSummary: js.UndefOr[JobProgressSummary] = js.undefined
  /**
    * Contains the configuration information for the job-completion report if you requested one in the Create Job request.
    */
  var Report: js.UndefOr[JobReport] = js.undefined
  /**
    * The Amazon Resource Name (ARN) for the Identity and Access Management (IAM) Role assigned to execute the tasks for this job.
    */
  var RoleArn: js.UndefOr[IAMRoleArn] = js.undefined
  /**
    * The current status of the specified job.
    */
  var Status: js.UndefOr[JobStatus] = js.undefined
  /**
    * 
    */
  var StatusUpdateReason: js.UndefOr[JobStatusUpdateReason] = js.undefined
  /**
    * The reason why the specified job was suspended. A job is only suspended if you create it through the Amazon S3 console. When you create the job, it enters the Suspended state to await confirmation before running. After you confirm the job, it automatically exits the Suspended state.
    */
  var SuspendedCause: js.UndefOr[typings.awsDashSdk.clientsS3controlMod.SuspendedCause] = js.undefined
  /**
    * The timestamp when this job was suspended, if it has been suspended.
    */
  var SuspendedDate: js.UndefOr[typings.awsDashSdk.clientsS3controlMod.SuspendedDate] = js.undefined
  /**
    * A timestamp indicating when this job terminated. A job's termination date is the date and time when it succeeded, failed, or was canceled.
    */
  var TerminationDate: js.UndefOr[JobTerminationDate] = js.undefined
}

object JobDescriptor {
  @scala.inline
  def apply(
    ConfirmationRequired: js.UndefOr[scala.Boolean] = js.undefined,
    CreationTime: JobCreationTime = null,
    Description: NonEmptyMaxLength256String = null,
    FailureReasons: JobFailureList = null,
    JobArn: JobArn = null,
    JobId: JobId = null,
    Manifest: JobManifest = null,
    Operation: JobOperation = null,
    Priority: Int | Double = null,
    ProgressSummary: JobProgressSummary = null,
    Report: JobReport = null,
    RoleArn: IAMRoleArn = null,
    Status: JobStatus = null,
    StatusUpdateReason: JobStatusUpdateReason = null,
    SuspendedCause: SuspendedCause = null,
    SuspendedDate: SuspendedDate = null,
    TerminationDate: JobTerminationDate = null
  ): JobDescriptor = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(ConfirmationRequired)) __obj.updateDynamic("ConfirmationRequired")(ConfirmationRequired)
    if (CreationTime != null) __obj.updateDynamic("CreationTime")(CreationTime)
    if (Description != null) __obj.updateDynamic("Description")(Description)
    if (FailureReasons != null) __obj.updateDynamic("FailureReasons")(FailureReasons)
    if (JobArn != null) __obj.updateDynamic("JobArn")(JobArn)
    if (JobId != null) __obj.updateDynamic("JobId")(JobId)
    if (Manifest != null) __obj.updateDynamic("Manifest")(Manifest)
    if (Operation != null) __obj.updateDynamic("Operation")(Operation)
    if (Priority != null) __obj.updateDynamic("Priority")(Priority.asInstanceOf[js.Any])
    if (ProgressSummary != null) __obj.updateDynamic("ProgressSummary")(ProgressSummary)
    if (Report != null) __obj.updateDynamic("Report")(Report)
    if (RoleArn != null) __obj.updateDynamic("RoleArn")(RoleArn)
    if (Status != null) __obj.updateDynamic("Status")(Status.asInstanceOf[js.Any])
    if (StatusUpdateReason != null) __obj.updateDynamic("StatusUpdateReason")(StatusUpdateReason)
    if (SuspendedCause != null) __obj.updateDynamic("SuspendedCause")(SuspendedCause)
    if (SuspendedDate != null) __obj.updateDynamic("SuspendedDate")(SuspendedDate)
    if (TerminationDate != null) __obj.updateDynamic("TerminationDate")(TerminationDate)
    __obj.asInstanceOf[JobDescriptor]
  }
}

