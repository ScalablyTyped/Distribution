package typings.awsDashSdk.clientsIotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JobExecution extends js.Object {
  /**
    * The estimated number of seconds that remain before the job execution status will be changed to TIMED_OUT. The timeout interval can be anywhere between 1 minute and 7 days (1 to 10080 minutes). The actual job execution timeout can occur up to 60 seconds later than the estimated duration. This value will not be included if the job execution has reached a terminal status.
    */
  var approximateSecondsBeforeTimedOut: js.UndefOr[ApproximateSecondsBeforeTimedOut] = js.undefined
  /**
    * A string (consisting of the digits "0" through "9") which identifies this particular job execution on this particular device. It can be used in commands which return or update job execution information. 
    */
  var executionNumber: js.UndefOr[ExecutionNumber] = js.undefined
  /**
    * Will be true if the job execution was canceled with the optional force parameter set to true.
    */
  var forceCanceled: js.UndefOr[Forced] = js.undefined
  /**
    * The unique identifier you assigned to the job when it was created.
    */
  var jobId: js.UndefOr[JobId] = js.undefined
  /**
    * The time, in seconds since the epoch, when the job execution was last updated.
    */
  var lastUpdatedAt: js.UndefOr[DateType] = js.undefined
  /**
    * The time, in seconds since the epoch, when the job execution was queued.
    */
  var queuedAt: js.UndefOr[DateType] = js.undefined
  /**
    * The time, in seconds since the epoch, when the job execution started.
    */
  var startedAt: js.UndefOr[DateType] = js.undefined
  /**
    * The status of the job execution (IN_PROGRESS, QUEUED, FAILED, SUCCEEDED, TIMED_OUT, CANCELED, or REJECTED).
    */
  var status: js.UndefOr[JobExecutionStatus] = js.undefined
  /**
    * A collection of name/value pairs that describe the status of the job execution.
    */
  var statusDetails: js.UndefOr[JobExecutionStatusDetails] = js.undefined
  /**
    * The ARN of the thing on which the job execution is running.
    */
  var thingArn: js.UndefOr[ThingArn] = js.undefined
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
    forceCanceled: js.UndefOr[scala.Boolean] = js.undefined,
    jobId: JobId = null,
    lastUpdatedAt: DateType = null,
    queuedAt: DateType = null,
    startedAt: DateType = null,
    status: JobExecutionStatus = null,
    statusDetails: JobExecutionStatusDetails = null,
    thingArn: ThingArn = null,
    versionNumber: Int | Double = null
  ): JobExecution = {
    val __obj = js.Dynamic.literal()
    if (approximateSecondsBeforeTimedOut != null) __obj.updateDynamic("approximateSecondsBeforeTimedOut")(approximateSecondsBeforeTimedOut.asInstanceOf[js.Any])
    if (executionNumber != null) __obj.updateDynamic("executionNumber")(executionNumber.asInstanceOf[js.Any])
    if (!js.isUndefined(forceCanceled)) __obj.updateDynamic("forceCanceled")(forceCanceled)
    if (jobId != null) __obj.updateDynamic("jobId")(jobId)
    if (lastUpdatedAt != null) __obj.updateDynamic("lastUpdatedAt")(lastUpdatedAt)
    if (queuedAt != null) __obj.updateDynamic("queuedAt")(queuedAt)
    if (startedAt != null) __obj.updateDynamic("startedAt")(startedAt)
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    if (statusDetails != null) __obj.updateDynamic("statusDetails")(statusDetails)
    if (thingArn != null) __obj.updateDynamic("thingArn")(thingArn)
    if (versionNumber != null) __obj.updateDynamic("versionNumber")(versionNumber.asInstanceOf[js.Any])
    __obj.asInstanceOf[JobExecution]
  }
}

