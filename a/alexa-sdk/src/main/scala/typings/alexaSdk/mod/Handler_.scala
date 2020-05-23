package typings.alexaSdk.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Handler_[T /* <: Request */] extends js.Object {
  var attributes: js.Any
  var context: js.Any
  var emitWithState: js.Any
  var event: RequestBody[T]
  var handler: js.Any
  var i18n: js.Any
  var isOverriden: js.Any
  var locale: js.Any
  var name: js.Any
  var on: js.Any
  var response: ResponseBuilder
  var state: js.Any
  def callback(param: js.Any): Unit
  def emit(event: String, args: js.Any*): Boolean
  def t(token: String, args: js.Any*): Unit
}

object Handler_ {
  @scala.inline
  def apply[T](
    attributes: js.Any,
    callback: js.Any => Unit,
    context: js.Any,
    emit: (String, /* repeated */ js.Any) => Boolean,
    emitWithState: js.Any,
    event: RequestBody[T],
    handler: js.Any,
    i18n: js.Any,
    isOverriden: js.Any,
    locale: js.Any,
    name: js.Any,
    on: js.Any,
    response: ResponseBuilder,
    state: js.Any,
    t: (String, /* repeated */ js.Any) => Unit
  ): Handler_[T] = {
    val __obj = js.Dynamic.literal(attributes = attributes.asInstanceOf[js.Any], callback = js.Any.fromFunction1(callback), context = context.asInstanceOf[js.Any], emit = js.Any.fromFunction2(emit), emitWithState = emitWithState.asInstanceOf[js.Any], event = event.asInstanceOf[js.Any], handler = handler.asInstanceOf[js.Any], i18n = i18n.asInstanceOf[js.Any], isOverriden = isOverriden.asInstanceOf[js.Any], locale = locale.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], on = on.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], t = js.Any.fromFunction2(t))
    __obj.asInstanceOf[Handler_[T]]
  }
}

