package typings.anydbDashSql

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Args extends js.Object {
  def emit(`type`: String, args: js.Any*): Unit
  def on(eventName: String, handler: js.Function): Unit
}

object Anon_Args {
  @scala.inline
  def apply(emit: (String, /* repeated */ js.Any) => Unit, on: (String, js.Function) => Unit): Anon_Args = {
    val __obj = js.Dynamic.literal(emit = js.Any.fromFunction2(emit), on = js.Any.fromFunction2(on))
  
    __obj.asInstanceOf[Anon_Args]
  }
}

