package typings
package atAngularCompilerLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Error extends js.Object {
  var error: scala.Boolean
  var msg: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_Error {
  @scala.inline
  def apply(error: scala.Boolean, msg: java.lang.String = null): Anon_Error = {
    val __obj = js.Dynamic.literal(error = error)
    if (msg != null) __obj.updateDynamic("msg")(msg)
    __obj.asInstanceOf[Anon_Error]
  }
}

