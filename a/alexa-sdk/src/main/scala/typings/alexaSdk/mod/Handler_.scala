package typings.alexaSdk.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Handler_[T /* <: Request */] extends js.Object {
  var attributes: js.Any = js.native
  var context: js.Any = js.native
  var emitWithState: js.Any = js.native
  var event: RequestBody[T] = js.native
  var handler: js.Any = js.native
  var i18n: js.Any = js.native
  var isOverriden: js.Any = js.native
  var locale: js.Any = js.native
  var name: js.Any = js.native
  var on: js.Any = js.native
  var response: ResponseBuilder = js.native
  var state: js.Any = js.native
  def callback(param: js.Any): Unit = js.native
  def emit(event: String, args: js.Any*): Boolean = js.native
  def t(token: String, args: js.Any*): Unit = js.native
}

object Handler_ {
  @scala.inline
  def apply[/* <: typings.alexaSdk.mod.Request */ T](
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
  @scala.inline
  implicit class Handler_Ops[Self <: Handler_[_], /* <: typings.alexaSdk.mod.Request */ T] (val x: Self with Handler_[T]) extends AnyVal {
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
    def setAttributes(value: js.Any): Self = this.set("attributes", value.asInstanceOf[js.Any])
    @scala.inline
    def setCallback(value: js.Any => Unit): Self = this.set("callback", js.Any.fromFunction1(value))
    @scala.inline
    def setContext(value: js.Any): Self = this.set("context", value.asInstanceOf[js.Any])
    @scala.inline
    def setEmit(value: (String, /* repeated */ js.Any) => Boolean): Self = this.set("emit", js.Any.fromFunction2(value))
    @scala.inline
    def setEmitWithState(value: js.Any): Self = this.set("emitWithState", value.asInstanceOf[js.Any])
    @scala.inline
    def setEvent(value: RequestBody[T]): Self = this.set("event", value.asInstanceOf[js.Any])
    @scala.inline
    def setHandler(value: js.Any): Self = this.set("handler", value.asInstanceOf[js.Any])
    @scala.inline
    def setI18n(value: js.Any): Self = this.set("i18n", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsOverriden(value: js.Any): Self = this.set("isOverriden", value.asInstanceOf[js.Any])
    @scala.inline
    def setLocale(value: js.Any): Self = this.set("locale", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: js.Any): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setOn(value: js.Any): Self = this.set("on", value.asInstanceOf[js.Any])
    @scala.inline
    def setResponse(value: ResponseBuilder): Self = this.set("response", value.asInstanceOf[js.Any])
    @scala.inline
    def setState(value: js.Any): Self = this.set("state", value.asInstanceOf[js.Any])
    @scala.inline
    def setT(value: (String, /* repeated */ js.Any) => Unit): Self = this.set("t", js.Any.fromFunction2(value))
  }
  
}

