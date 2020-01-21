package typings.angularCompiler

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonError extends js.Object {
  var error: Boolean
  var msg: js.UndefOr[String] = js.undefined
}

object AnonError {
  @scala.inline
  def apply(error: Boolean, msg: String = null): AnonError = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any])
    if (msg != null) __obj.updateDynamic("msg")(msg.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonError]
  }
}

