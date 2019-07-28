package typings.awsDashSdk.clientsMturkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateWorkerBlockRequest extends js.Object {
  /**
    * A message explaining the reason for blocking the Worker. This parameter enables you to keep track of your Workers. The Worker does not see this message.
    */
  var Reason: String
  /**
    * The ID of the Worker to block.
    */
  var WorkerId: CustomerId
}

object CreateWorkerBlockRequest {
  @scala.inline
  def apply(Reason: String, WorkerId: CustomerId): CreateWorkerBlockRequest = {
    val __obj = js.Dynamic.literal(Reason = Reason, WorkerId = WorkerId)
  
    __obj.asInstanceOf[CreateWorkerBlockRequest]
  }
}

