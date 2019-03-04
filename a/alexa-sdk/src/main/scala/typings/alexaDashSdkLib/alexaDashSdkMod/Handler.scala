package typings
package alexaDashSdkLib.alexaDashSdkMod

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
  def callback(param: js.Any): scala.Unit
  def emit(event: java.lang.String, args: js.Any*): scala.Boolean
  def t(token: java.lang.String, args: js.Any*): scala.Unit
}

object Handler {
  @scala.inline
  def apply[T /* <: Request */](
    attributes: js.Any,
    callback: js.Function1[js.Any, scala.Unit],
    context: js.Any,
    emit: js.Function2[java.lang.String, /* repeated */ js.Any, scala.Boolean],
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
    t: js.Function2[java.lang.String, /* repeated */ js.Any, scala.Unit]
  ): Handler[T] = {
    val __obj = js.Dynamic.literal(attributes = attributes, callback = callback, context = context, emit = emit, emitWithState = emitWithState, event = event, handler = handler, i18n = i18n, isOverriden = isOverriden, locale = locale, name = name, on = on, response = response, state = state, t = t)
  
    __obj.asInstanceOf[Handler[T]]
  }
}

