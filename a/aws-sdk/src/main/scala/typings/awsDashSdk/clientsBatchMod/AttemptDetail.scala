package typings.awsDashSdk.clientsBatchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AttemptDetail extends js.Object {
  /**
    * Details about the container in this job attempt.
    */
  var container: js.UndefOr[AttemptContainerDetail] = js.undefined
  /**
    * The Unix timestamp (in seconds and milliseconds) for when the attempt was started (when the attempt transitioned from the STARTING state to the RUNNING state).
    */
  var startedAt: js.UndefOr[Long] = js.undefined
  /**
    * A short, human-readable string to provide additional details about the current status of the job attempt.
    */
  var statusReason: js.UndefOr[String] = js.undefined
  /**
    * The Unix timestamp (in seconds and milliseconds) for when the attempt was stopped (when the attempt transitioned from the RUNNING state to a terminal state, such as SUCCEEDED or FAILED).
    */
  var stoppedAt: js.UndefOr[Long] = js.undefined
}

object AttemptDetail {
  @scala.inline
  def apply(
    container: AttemptContainerDetail = null,
    startedAt: Int | Double = null,
    statusReason: String = null,
    stoppedAt: Int | Double = null
  ): AttemptDetail = {
    val __obj = js.Dynamic.literal()
    if (container != null) __obj.updateDynamic("container")(container)
    if (startedAt != null) __obj.updateDynamic("startedAt")(startedAt.asInstanceOf[js.Any])
    if (statusReason != null) __obj.updateDynamic("statusReason")(statusReason)
    if (stoppedAt != null) __obj.updateDynamic("stoppedAt")(stoppedAt.asInstanceOf[js.Any])
    __obj.asInstanceOf[AttemptDetail]
  }
}

