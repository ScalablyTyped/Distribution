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
    val __obj = js.Dynamic.literal(attributes = attributes.asInstanceOf[js.Any], callback = js.Any.fromFunction1(callback), context = context.asInstanceOf[js.Any], emit = js.Any.fromFunction2(emit), emitWithState = emitWithState.asInstanceOf[js.Any], event = event.asInstanceOf[js.Any], handler = handler.asInstanceOf[js.Any], i18n = i18n.asInstanceOf[js.Any], isOverriden = isOverriden.asInstanceOf[js.Any], locale = locale.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], on = on.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], t = js.Any.fromFunction2(t))
  
    __obj.asInstanceOf[Handler[T]]
  }
}

@JSImport("alexa-sdk", "handler")
@js.native
object handler extends js.Object {
  def apply[T /* <: Request */](event: RequestBody[T], context: Context): AlexaObject[T] = js.native
  def apply[T /* <: Request */](
    event: RequestBody[T],
    context: Context,
    callback: js.Function2[/* err */ js.Any, /* response */ js.Any, Unit]
  ): AlexaObject[T] = js.native
}

