package typings.alexaDashSdk.alexaDashSdkMod

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
  var saveBeforeResponse: Boolean
  def execute(): Unit
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
    callback: js.Any => Unit,
    context: js.Any,
    dynamoDBTableName: js.Any,
    emit: (String, /* repeated */ js.Any) => Boolean,
    emitWithState: js.Any,
    event: RequestBody[T],
    execute: () => Unit,
    handler: js.Any,
    i18n: js.Any,
    isOverriden: js.Any,
    locale: js.Any,
    name: js.Any,
    on: js.Any,
    registerHandlers: /* repeated */ Handlers[T] => js.Any,
    resources: js.Any,
    response: js.Any,
    saveBeforeResponse: Boolean,
    state: js.Any,
    t: (String, /* repeated */ js.Any) => Unit
  ): AlexaObject[T] = {
    val __obj = js.Dynamic.literal(_callback = _callback, _context = _context, _event = _event, appId = appId, attributes = attributes, callback = js.Any.fromFunction1(callback), context = context, dynamoDBTableName = dynamoDBTableName, emit = js.Any.fromFunction2(emit), emitWithState = emitWithState, event = event, execute = js.Any.fromFunction0(execute), handler = handler, i18n = i18n, isOverriden = isOverriden, locale = locale, name = name, on = on, registerHandlers = js.Any.fromFunction1(registerHandlers), resources = resources, response = response, saveBeforeResponse = saveBeforeResponse, state = state, t = js.Any.fromFunction2(t))
  
    __obj.asInstanceOf[AlexaObject[T]]
  }
}

