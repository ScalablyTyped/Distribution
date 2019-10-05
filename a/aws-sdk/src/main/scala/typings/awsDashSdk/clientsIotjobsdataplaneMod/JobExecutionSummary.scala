package typings.awsDashSdk.clientsIotjobsdataplaneMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JobExecutionSummary extends js.Object {
  /**
    * A number that identifies a particular job execution on a particular device.
    */
  var executionNumber: js.UndefOr[ExecutionNumber] = js.undefined
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
    * The time, in milliseconds since the epoch, when the job execution started.
    */
  var startedAt: js.UndefOr[StartedAt] = js.undefined
  /**
    * The version of the job execution. Job execution versions are incremented each time AWS IoT Jobs receives an update from a device.
    */
  var versionNumber: js.UndefOr[VersionNumber] = js.undefined
}

object JobExecutionSummary {
  @scala.inline
  def apply(
    executionNumber: Int | Double = null,
    jobId: JobId = null,
    lastUpdatedAt: Int | Double = null,
    queuedAt: Int | Double = null,
    startedAt: Int | Double = null,
    versionNumber: Int | Double = null
  ): JobExecutionSummary = {
    val __obj = js.Dynamic.literal()
    if (executionNumber != null) __obj.updateDynamic("executionNumber")(executionNumber.asInstanceOf[js.Any])
    if (jobId != null) __obj.updateDynamic("jobId")(jobId)
    if (lastUpdatedAt != null) __obj.updateDynamic("lastUpdatedAt")(lastUpdatedAt.asInstanceOf[js.Any])
    if (queuedAt != null) __obj.updateDynamic("queuedAt")(queuedAt.asInstanceOf[js.Any])
    if (startedAt != null) __obj.updateDynamic("startedAt")(startedAt.asInstanceOf[js.Any])
    if (versionNumber != null) __obj.updateDynamic("versionNumber")(versionNumber.asInstanceOf[js.Any])
    __obj.asInstanceOf[JobExecutionSummary]
  }
}

