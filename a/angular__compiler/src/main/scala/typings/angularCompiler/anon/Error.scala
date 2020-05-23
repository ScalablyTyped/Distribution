package typings.angularCompiler.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Error extends js.Object {
  var error: Boolean
  var msg: js.UndefOr[String] = js.undefined
}

object Error {
  @scala.inline
  def apply(error: Boolean, msg: String = null): Error = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any])
    if (msg != null) __obj.updateDynamic("msg")(msg.asInstanceOf[js.Any])
    __obj.asInstanceOf[Error]
  }
}

