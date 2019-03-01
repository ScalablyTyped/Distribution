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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("attributes")(attributes)
    __obj.updateDynamic("callback")(callback)
    __obj.updateDynamic("context")(context)
    __obj.updateDynamic("emit")(emit)
    __obj.updateDynamic("emitWithState")(emitWithState)
    __obj.updateDynamic("event")(event)
    __obj.updateDynamic("handler")(handler)
    __obj.updateDynamic("i18n")(i18n)
    __obj.updateDynamic("isOverriden")(isOverriden)
    __obj.updateDynamic("locale")(locale)
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("on")(on)
    __obj.updateDynamic("response")(response)
    __obj.updateDynamic("state")(state)
    __obj.updateDynamic("t")(t)
    __obj.asInstanceOf[Handler[T]]
  }
}

