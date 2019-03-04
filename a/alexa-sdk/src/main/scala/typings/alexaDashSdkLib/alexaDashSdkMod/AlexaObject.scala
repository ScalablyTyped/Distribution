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
    val __obj = js.Dynamic.literal(_callback = _callback, _context = _context, _event = _event, appId = appId, attributes = attributes, callback = callback, context = context, dynamoDBTableName = dynamoDBTableName, emit = emit, emitWithState = emitWithState, event = event, execute = execute, handler = handler, i18n = i18n, isOverriden = isOverriden, locale = locale, name = name, on = on, registerHandlers = registerHandlers, resources = resources, response = response, saveBeforeResponse = saveBeforeResponse, state = state, t = t)
  
    __obj.asInstanceOf[AlexaObject[T]]
  }
}

