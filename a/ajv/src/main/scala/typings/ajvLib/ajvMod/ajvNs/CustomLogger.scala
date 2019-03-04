package typings
package ajvLib.ajvMod.ajvNs

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
    error: js.Function1[/* repeated */ js.Any, js.Any],
    log: js.Function1[/* repeated */ js.Any, js.Any],
    warn: js.Function1[/* repeated */ js.Any, js.Any]
  ): CustomLogger = {
    val __obj = js.Dynamic.literal(error = error, log = log, warn = warn)
  
    __obj.asInstanceOf[CustomLogger]
  }
}

