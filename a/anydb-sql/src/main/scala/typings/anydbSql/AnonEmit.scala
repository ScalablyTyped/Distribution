package typings.anydbSql

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonEmit extends js.Object {
  def emit(`type`: String, args: js.Any*): Unit
  def on(eventName: String, handler: js.Function): Unit
}

object AnonEmit {
  @scala.inline
  def apply(emit: (String, /* repeated */ js.Any) => Unit, on: (String, js.Function) => Unit): AnonEmit = {
    val __obj = js.Dynamic.literal(emit = js.Any.fromFunction2(emit), on = js.Any.fromFunction2(on))
    __obj.asInstanceOf[AnonEmit]
  }
}

