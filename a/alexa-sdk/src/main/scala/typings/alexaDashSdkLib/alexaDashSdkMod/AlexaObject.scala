package typings
package alexaDashSdkLib.alexaDashSdkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AlexaObject[T /* <: Request */] extends Handler[T] {
  var _callback: js.Any
  var _context: js.Any
  var _event: js.Any
  var appId: js.Any
  var dynamoDBTableName: js.Any
  var resources: js.Any
  var saveBeforeResponse: scala.Boolean
  def execute(): scala.Unit
  def registerHandlers(handlers: Handlers[T]*): js.Any
}

object AlexaObject {
  @scala.inline
  def apply[T /* <: Request */](
    _callback: js.Any,
    _context: js.Any,
    _event: js.Any,
    appId: js.Any,
    attributes: js.Any,
    callback: js.Function1[js.Any, scala.Unit],
    context: js.Any,
    dynamoDBTableName: js.Any,
    emit: js.Function2[java.lang.String, /* repeated */ js.Any, scala.Boolean],
    emitWithState: js.Any,
    event: RequestBody[T],
    execute: js.Function0[scala.Unit],
    handler: js.Any,
    i18n: js.Any,
    isOverriden: js.Any,
    locale: js.Any,
    name: js.Any,
    on: js.Any,
    registerHandlers: js.Function1[/* repeated */ Handlers[T], js.Any],
    resources: js.Any,
    response: js.Any,
    saveBeforeResponse: scala.Boolean,
    state: js.Any,
    t: js.Function2[java.lang.String, /* repeated */ js.Any, scala.Unit]
  ): AlexaObject[T] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("_callback")(_callback)
    __obj.updateDynamic("_context")(_context)
    __obj.updateDynamic("_event")(_event)
    __obj.updateDynamic("appId")(appId)
    __obj.updateDynamic("attributes")(attributes)
    __obj.updateDynamic("callback")(callback)
    __obj.updateDynamic("context")(context)
    __obj.updateDynamic("dynamoDBTableName")(dynamoDBTableName)
    __obj.updateDynamic("emit")(emit)
    __obj.updateDynamic("emitWithState")(emitWithState)
    __obj.updateDynamic("event")(event)
    __obj.updateDynamic("execute")(execute)
    __obj.updateDynamic("handler")(handler)
    __obj.updateDynamic("i18n")(i18n)
    __obj.updateDynamic("isOverriden")(isOverriden)
    __obj.updateDynamic("locale")(locale)
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("on")(on)
    __obj.updateDynamic("registerHandlers")(registerHandlers)
    __obj.updateDynamic("resources")(resources)
    __obj.updateDynamic("response")(response)
    __obj.updateDynamic("saveBeforeResponse")(saveBeforeResponse)
    __obj.updateDynamic("state")(state)
    __obj.updateDynamic("t")(t)
    __obj.asInstanceOf[AlexaObject[T]]
  }
}

