package typings.angularWebsocket.mod.angularAugmentingMod.websocket

import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Options available to be specified for IWebSocket.onMessage */
@js.native
trait IWebSocketMessageOptions extends js.Object {
  /** If true, each message handled will safely call `$rootScope.$digest()`. */
  var autoApply: js.UndefOr[Boolean] = js.native
  /**
    * If specified, only messages that match the filter will cause the message event
    * to be fired.
    */
  var filter: js.UndefOr[String | RegExp] = js.native
}

object IWebSocketMessageOptions {
  @scala.inline
  def apply(): IWebSocketMessageOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IWebSocketMessageOptions]
  }
  @scala.inline
  implicit class IWebSocketMessageOptionsOps[Self <: IWebSocketMessageOptions] (val x: Self) extends AnyVal {
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
    def deleteAutoApply: Self = this.set("autoApply", js.undefined)
    @scala.inline
    def setFilter(value: String | RegExp): Self = this.set("filter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFilter: Self = this.set("filter", js.undefined)
  }
  
}

