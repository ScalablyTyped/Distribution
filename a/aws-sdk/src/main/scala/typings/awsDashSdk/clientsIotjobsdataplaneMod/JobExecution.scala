package typings.awsDashSdk.clientsIotjobsdataplaneMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JobExecution extends js.Object {
  /**
    * The estimated number of seconds that remain before the job execution status will be changed to TIMED_OUT.
    */
  var approximateSecondsBeforeTimedOut: js.UndefOr[ApproximateSecondsBeforeTimedOut] = js.undefined
  /**
    * A number that identifies a particular job execution on a particular device. It can be used later in commands that return or update job execution information.
    */
  var executionNumber: js.UndefOr[ExecutionNumber] = js.undefined
  /**
    * The content of the job document.
    */
  var jobDocument: js.UndefOr[JobDocument] = js.undefined
  /**
    * The unique identifier you assigned to this job when it was created.
    */
  var jobId: js.UndefOr[JobId] = js.undefined
  /**
    * The time, in milliseconds since the epoch, when the job execution was last updated. 
    */
  var lastUpdatedAt: js.UndefOr[LastUpdatedAt] = js.undefined
  /**
    * The time, in milliseconds since the epoch, when the job execution was enqueued.
    */
  var queuedAt: js.UndefOr[QueuedAt] = js.undefined
  /**
    * The time, in milliseconds since the epoch, when the job execution was started.
    */
  var startedAt: js.UndefOr[StartedAt] = js.undefined
  /**
    * The status of the job execution. Can be one of: "QUEUED", "IN_PROGRESS", "FAILED", "SUCCESS", "CANCELED", "REJECTED", or "REMOVED".
    */
  var status: js.UndefOr[JobExecutionStatus] = js.undefined
  /**
    * A collection of name/value pairs that describe the status of the job execution.
    */
  var statusDetails: js.UndefOr[DetailsMap] = js.undefined
  /**
    * The name of the thing that is executing the job.
    */
  var thingName: js.UndefOr[ThingName] = js.undefined
  /**
    * The version of the job execution. Job execution versions are incremented each time they are updated by a device.
    */
  var versionNumber: js.UndefOr[VersionNumber] = js.undefined
}

object JobExecution {
  @scala.inline
  def apply(
    approximateSecondsBeforeTimedOut: Int | Double = null,
    executionNumber: Int | Double = null,
    jobDocument: JobDocument = null,
    jobId: JobId = null,
    lastUpdatedAt: Int | Double = null,
    queuedAt: Int | Double = null,
    startedAt: Int | Double = null,
    status: JobExecutionStatus = null,
    statusDetails: DetailsMap = null,
    thingName: ThingName = null,
    versionNumber: Int | Double = null
  ): JobExecution = {
    val __obj = js.Dynamic.literal()
    if (approximateSecondsBeforeTimedOut != null) __obj.updateDynamic("approximateSecondsBeforeTimedOut")(approximateSecondsBeforeTimedOut.asInstanceOf[js.Any])
    if (executionNumber != null) __obj.updateDynamic("executionNumber")(executionNumber.asInstanceOf[js.Any])
    if (jobDocument != null) __obj.updateDynamic("jobDocument")(jobDocument)
    if (jobId != null) __obj.updateDynamic("jobId")(jobId)
    if (lastUpdatedAt != null) __obj.updateDynamic("lastUpdatedAt")(lastUpdatedAt.asInstanceOf[js.Any])
    if (queuedAt != null) __obj.updateDynamic("queuedAt")(queuedAt.asInstanceOf[js.Any])
    if (startedAt != null) __obj.updateDynamic("startedAt")(startedAt.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    if (statusDetails != null) __obj.updateDynamic("statusDetails")(statusDetails)
    if (thingName != null) __obj.updateDynamic("thingName")(thingName)
    if (versionNumber != null) __obj.updateDynamic("versionNumber")(versionNumber.asInstanceOf[js.Any])
    __obj.asInstanceOf[JobExecution]
  }
}

