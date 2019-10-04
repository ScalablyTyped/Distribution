package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteQueuedReservedInstancesError extends js.Object {
  /**
    * The error code.
    */
  var Code: js.UndefOr[DeleteQueuedReservedInstancesErrorCode] = js.undefined
  /**
    * The error message.
    */
  var Message: js.UndefOr[String] = js.undefined
}

object DeleteQueuedReservedInstancesError {
  @scala.inline
  def apply(Code: DeleteQueuedReservedInstancesErrorCode = null, Message: String = null): DeleteQueuedReservedInstancesError = {
    val __obj = js.Dynamic.literal()
    if (Code != null) __obj.updateDynamic("Code")(Code.asInstanceOf[js.Any])
    if (Message != null) __obj.updateDynamic("Message")(Message)
    __obj.asInstanceOf[DeleteQueuedReservedInstancesError]
  }
}

