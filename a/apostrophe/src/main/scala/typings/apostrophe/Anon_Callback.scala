package typings.apostrophe

import typings.apostrophe.apostropheMod.AposObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Callback extends js.Object {
  def form(
    req: js.Any,
    data: js.Any,
    name: String,
    `object`: AposObject,
    field: js.Any,
    callback: js.Function0[_]
  ): Unit
  def string(
    req: js.Any,
    data: js.Any,
    name: String,
    `object`: AposObject,
    field: js.Any,
    callback: js.Function0[_]
  ): Unit
}

object Anon_Callback {
  @scala.inline
  def apply(
    form: (js.Any, js.Any, String, AposObject, js.Any, js.Function0[_]) => Unit,
    string: (js.Any, js.Any, String, AposObject, js.Any, js.Function0[_]) => Unit
  ): Anon_Callback = {
    val __obj = js.Dynamic.literal(form = js.Any.fromFunction6(form), string = js.Any.fromFunction6(string))
  
    __obj.asInstanceOf[Anon_Callback]
  }
}

