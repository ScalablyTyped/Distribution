package typings.awsDashSdk.clientsIotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ErrorInfo extends js.Object {
  /**
    * The error code.
    */
  var code: js.UndefOr[Code] = js.undefined
  /**
    * The error message.
    */
  var message: js.UndefOr[OTAUpdateErrorMessage] = js.undefined
}

object ErrorInfo {
  @scala.inline
  def apply(code: Code = null, message: OTAUpdateErrorMessage = null): ErrorInfo = {
    val __obj = js.Dynamic.literal()
    if (code != null) __obj.updateDynamic("code")(code)
    if (message != null) __obj.updateDynamic("message")(message)
    __obj.asInstanceOf[ErrorInfo]
  }
}

