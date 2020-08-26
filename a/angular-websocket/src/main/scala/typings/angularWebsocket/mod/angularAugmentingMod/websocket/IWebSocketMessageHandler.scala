package typings.angularWebsocket.mod.angularAugmentingMod.websocket

import typings.std.MessageEvent
import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Type corresponding to onMessage callbacks stored in $Websocket#onMessageCallbacks instance. */
@js.native
trait IWebSocketMessageHandler extends js.Object {
  var autoApply: Boolean = js.native
  var pattern: js.UndefOr[String | RegExp] = js.native
  def fn(evt: MessageEvent): Unit = js.native
}

object IWebSocketMessageHandler {
  @scala.inline
  def apply(autoApply: Boolean, fn: MessageEvent => Unit): IWebSocketMessageHandler = {
    val __obj = js.Dynamic.literal(autoApply = autoApply.asInstanceOf[js.Any], fn = js.Any.fromFunction1(fn))
    __obj.asInstanceOf[IWebSocketMessageHandler]
  }
  @scala.inline
  implicit class IWebSocketMessageHandlerOps[Self <: IWebSocketMessageHandler] (val x: Self) extends AnyVal {
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
    def setAutoApply(value: Boolean): Self = this.set("autoApply", value.asInstanceOf[js.Any])
    @scala.inline
    def setFn(value: MessageEvent => Unit): Self = this.set("fn", js.Any.fromFunction1(value))
    @scala.inline
    def setPattern(value: String | RegExp): Self = this.set("pattern", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePattern: Self = this.set("pattern", js.undefined)
  }
  
}

