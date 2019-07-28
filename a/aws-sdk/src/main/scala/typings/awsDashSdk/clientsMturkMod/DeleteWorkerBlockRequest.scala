package typings.awsDashSdk.clientsMturkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteWorkerBlockRequest extends js.Object {
  /**
    * A message that explains the reason for unblocking the Worker. The Worker does not see this message.
    */
  var Reason: js.UndefOr[String] = js.undefined
  /**
    * The ID of the Worker to unblock.
    */
  var WorkerId: CustomerId
}

object DeleteWorkerBlockRequest {
  @scala.inline
  def apply(WorkerId: CustomerId, Reason: String = null): DeleteWorkerBlockRequest = {
    val __obj = js.Dynamic.literal(WorkerId = WorkerId)
    if (Reason != null) __obj.updateDynamic("Reason")(Reason)
    __obj.asInstanceOf[DeleteWorkerBlockRequest]
  }
}

