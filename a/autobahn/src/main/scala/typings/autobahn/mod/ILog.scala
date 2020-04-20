package typings.autobahn.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ILog extends js.Object {
  def debug(args: js.Any*): Unit
}

object ILog {
  @scala.inline
  def apply(debug: /* repeated */ js.Any => Unit): ILog = {
    val __obj = js.Dynamic.literal(debug = js.Any.fromFunction1(debug))
    __obj.asInstanceOf[ILog]
  }
}

