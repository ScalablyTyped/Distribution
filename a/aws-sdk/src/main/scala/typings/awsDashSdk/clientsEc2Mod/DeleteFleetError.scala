package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteFleetError extends js.Object {
  /**
    * The error code.
    */
  var Code: js.UndefOr[DeleteFleetErrorCode] = js.undefined
  /**
    * The description for the error code.
    */
  var Message: js.UndefOr[String] = js.undefined
}

object DeleteFleetError {
  @scala.inline
  def apply(Code: DeleteFleetErrorCode = null, Message: String = null): DeleteFleetError = {
    val __obj = js.Dynamic.literal()
    if (Code != null) __obj.updateDynamic("Code")(Code.asInstanceOf[js.Any])
    if (Message != null) __obj.updateDynamic("Message")(Message)
    __obj.asInstanceOf[DeleteFleetError]
  }
}

