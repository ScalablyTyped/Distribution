package typings
package awsDashSdkLib.clientsIotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JobExecutionSummary extends js.Object {
  /**
    * A string (consisting of the digits "0" through "9") which identifies this particular job execution on this particular device. It can be used later in commands which return or update job execution information.
    */
  var executionNumber: js.UndefOr[ExecutionNumber] = js.undefined
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
    * The status of the job execution.
    */
  var status: js.UndefOr[JobExecutionStatus] = js.undefined
}

object JobExecutionSummary {
  @scala.inline
  def apply(
    executionNumber: js.UndefOr[ExecutionNumber] = js.undefined,
    lastUpdatedAt: DateType = null,
    queuedAt: DateType = null,
    startedAt: DateType = null,
    status: JobExecutionStatus = null
  ): JobExecutionSummary = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(executionNumber)) __obj.updateDynamic("executionNumber")(executionNumber)
    if (lastUpdatedAt != null) __obj.updateDynamic("lastUpdatedAt")(lastUpdatedAt)
    if (queuedAt != null) __obj.updateDynamic("queuedAt")(queuedAt)
    if (startedAt != null) __obj.updateDynamic("startedAt")(startedAt)
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    __obj.asInstanceOf[JobExecutionSummary]
  }
}

