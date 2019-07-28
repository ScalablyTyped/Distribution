package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResponseError extends js.Object {
  /**
    * The error code.
    */
  var Code: js.UndefOr[LaunchTemplateErrorCode] = js.undefined
  /**
    * The error message, if applicable.
    */
  var Message: js.UndefOr[String] = js.undefined
}

object ResponseError {
  @scala.inline
  def apply(Code: LaunchTemplateErrorCode = null, Message: String = null): ResponseError = {
    val __obj = js.Dynamic.literal()
    if (Code != null) __obj.updateDynamic("Code")(Code.asInstanceOf[js.Any])
    if (Message != null) __obj.updateDynamic("Message")(Message)
    __obj.asInstanceOf[ResponseError]
  }
}

