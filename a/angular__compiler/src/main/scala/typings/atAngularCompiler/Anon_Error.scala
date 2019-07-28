package typings.atAngularCompiler

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Error extends js.Object {
  var error: Boolean
  var msg: js.UndefOr[String] = js.undefined
}

object Anon_Error {
  @scala.inline
  def apply(error: Boolean, msg: String = null): Anon_Error = {
    val __obj = js.Dynamic.literal(error = error)
    if (msg != null) __obj.updateDynamic("msg")(msg)
    __obj.asInstanceOf[Anon_Error]
  }
}

