package typings.alexaSdk.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AlexaObject[T /* <: Request */] extends Handler_[T] {
  var _callback: js.Any = js.native
  var _context: js.Any = js.native
  var _event: js.Any = js.native
  var appId: js.Any = js.native
  var dynamoDBTableName: js.Any = js.native
  var resources: js.Any = js.native
  var saveBeforeResponse: Boolean = js.native
  def execute(): Unit = js.native
  def registerHandlers(handlers: Handlers[T]*): js.Any = js.native
}

object AlexaObject {
  @scala.inline
  def apply[/* <: typings.alexaSdk.mod.Request */ T](
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
  @scala.inline
  implicit class AlexaObjectOps[Self <: AlexaObject[_], /* <: typings.alexaSdk.mod.Request */ T] (val x: Self with AlexaObject[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def set_callback(value: js.Any): Self = this.set("_callback", value.asInstanceOf[js.Any])
    @scala.inline
    def set_context(value: js.Any): Self = this.set("_context", value.asInstanceOf[js.Any])
    @scala.inline
    def set_event(value: js.Any): Self = this.set("_event", value.asInstanceOf[js.Any])
    @scala.inline
    def setAppId(value: js.Any): Self = this.set("appId", value.asInstanceOf[js.Any])
    @scala.inline
    def setDynamoDBTableName(value: js.Any): Self = this.set("dynamoDBTableName", value.asInstanceOf[js.Any])
    @scala.inline
    def setExecute(value: () => Unit): Self = this.set("execute", js.Any.fromFunction0(value))
    @scala.inline
    def setRegisterHandlers(value: /* repeated */ Handlers[T] => js.Any): Self = this.set("registerHandlers", js.Any.fromFunction1(value))
    @scala.inline
    def setResources(value: js.Any): Self = this.set("resources", value.asInstanceOf[js.Any])
    @scala.inline
    def setSaveBeforeResponse(value: Boolean): Self = this.set("saveBeforeResponse", value.asInstanceOf[js.Any])
  }
  
}

