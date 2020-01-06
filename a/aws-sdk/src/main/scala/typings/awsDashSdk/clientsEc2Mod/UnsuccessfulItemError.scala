package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UnsuccessfulItemError extends js.Object {
  /**
    * The error code.
    */
  var Code: js.UndefOr[String] = js.native
  /**
    * The error message accompanying the error code.
    */
  var Message: js.UndefOr[String] = js.native
}

object UnsuccessfulItemError {
  @scala.inline
  def apply(Code: String = null, Message: String = null): UnsuccessfulItemError = {
    val __obj = js.Dynamic.literal()
    if (Code != null) __obj.updateDynamic("Code")(Code.asInstanceOf[js.Any])
    if (Message != null) __obj.updateDynamic("Message")(Message.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnsuccessfulItemError]
  }
}

