package typings.awsSdk.batchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AttemptDetail extends js.Object {
  /**
    * Details about the container in this job attempt.
    */
  var container: js.UndefOr[AttemptContainerDetail] = js.native
  /**
    * The Unix timestamp (in seconds and milliseconds) for when the attempt was started (when the attempt transitioned from the STARTING state to the RUNNING state).
    */
  var startedAt: js.UndefOr[Long] = js.native
  /**
    * A short, human-readable string to provide additional details about the current status of the job attempt.
    */
  var statusReason: js.UndefOr[String] = js.native
  /**
    * The Unix timestamp (in seconds and milliseconds) for when the attempt was stopped (when the attempt transitioned from the RUNNING state to a terminal state, such as SUCCEEDED or FAILED).
    */
  var stoppedAt: js.UndefOr[Long] = js.native
}

object AttemptDetail {
  @scala.inline
  def apply(
    container: AttemptContainerDetail = null,
    startedAt: js.UndefOr[Long] = js.undefined,
    statusReason: String = null,
    stoppedAt: js.UndefOr[Long] = js.undefined
  ): AttemptDetail = {
    val __obj = js.Dynamic.literal()
    if (container != null) __obj.updateDynamic("container")(container.asInstanceOf[js.Any])
    if (!js.isUndefined(startedAt)) __obj.updateDynamic("startedAt")(startedAt.get.asInstanceOf[js.Any])
    if (statusReason != null) __obj.updateDynamic("statusReason")(statusReason.asInstanceOf[js.Any])
    if (!js.isUndefined(stoppedAt)) __obj.updateDynamic("stoppedAt")(stoppedAt.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[AttemptDetail]
  }
}

