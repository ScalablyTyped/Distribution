package typings.alexaDashSdk.alexaDashSdkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Handler[T /* <: Request */] extends js.Object {
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

object Handler {
  @scala.inline
  def apply[T /* <: Request */](
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
  ): Handler[T] = {
    val __obj = js.Dynamic.literal(attributes = attributes, callback = js.Any.fromFunction1(callback), context = context, emit = js.Any.fromFunction2(emit), emitWithState = emitWithState, event = event, handler = handler, i18n = i18n, isOverriden = isOverriden, locale = locale, name = name, on = on, response = response, state = state, t = js.Any.fromFunction2(t))
  
    __obj.asInstanceOf[Handler[T]]
  }
}

