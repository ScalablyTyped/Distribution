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
    response: ResponseBuilder,
    saveBeforeResponse: Boolean,
    state: js.Any,
    t: (String, /* repeated */ js.Any) => Unit
  ): AlexaObject[T] = {
    val __obj = js.Dynamic.literal(_callback = _callback.asInstanceOf[js.Any], _context = _context.asInstanceOf[js.Any], _event = _event.asInstanceOf[js.Any], appId = appId.asInstanceOf[js.Any], attributes = attributes.asInstanceOf[js.Any], callback = js.Any.fromFunction1(callback), context = context.asInstanceOf[js.Any], dynamoDBTableName = dynamoDBTableName.asInstanceOf[js.Any], emit = js.Any.fromFunction2(emit), emitWithState = emitWithState.asInstanceOf[js.Any], event = event.asInstanceOf[js.Any], execute = js.Any.fromFunction0(execute), handler = handler.asInstanceOf[js.Any], i18n = i18n.asInstanceOf[js.Any], isOverriden = isOverriden.asInstanceOf[js.Any], locale = locale.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], on = on.asInstanceOf[js.Any], registerHandlers = js.Any.fromFunction1(registerHandlers), resources = resources.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any], saveBeforeResponse = saveBeforeResponse.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], t = js.Any.fromFunction2(t))
  
    __obj.asInstanceOf[AlexaObject[T]]
  }
}

