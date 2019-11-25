package typings.alexaDashSdk.alexaDashSdkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SystemError extends js.Object {
  var message: String
  var `type`: SystemErrorType
}

object SystemError {
  @scala.inline
  def apply(message: String, `type`: SystemErrorType): SystemError = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SystemError]
  }
}

