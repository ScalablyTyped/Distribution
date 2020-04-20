package typings.apostrophe

import typings.apostrophe.mod.AposObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonForm extends js.Object {
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

object AnonForm {
  @scala.inline
  def apply(
    form: (js.Any, js.Any, String, AposObject, js.Any, js.Function0[_]) => Unit,
    string: (js.Any, js.Any, String, AposObject, js.Any, js.Function0[_]) => Unit
  ): AnonForm = {
    val __obj = js.Dynamic.literal(form = js.Any.fromFunction6(form), string = js.Any.fromFunction6(string))
    __obj.asInstanceOf[AnonForm]
  }
}

