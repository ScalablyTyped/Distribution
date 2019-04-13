package typings
package ajvLib.ajvMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CustomLogger extends js.Object {
  def error(args: js.Any*): js.Any
  def log(args: js.Any*): js.Any
  def warn(args: js.Any*): js.Any
}

object CustomLogger {
  @scala.inline
  def apply(
    error: /* repeated */ js.Any => js.Any,
    log: /* repeated */ js.Any => js.Any,
    warn: /* repeated */ js.Any => js.Any
  ): CustomLogger = {
    val __obj = js.Dynamic.literal(error = js.Any.fromFunction1(error), log = js.Any.fromFunction1(log), warn = js.Any.fromFunction1(warn))
  
    __obj.asInstanceOf[CustomLogger]
  }
}

