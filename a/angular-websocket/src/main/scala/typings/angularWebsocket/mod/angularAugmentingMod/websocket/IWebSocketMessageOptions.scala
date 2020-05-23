package typings.angularWebsocket.mod.angularAugmentingMod.websocket

import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Options available to be specified for IWebSocket.onMessage */
trait IWebSocketMessageOptions extends js.Object {
  /** If true, each message handled will safely call `$rootScope.$digest()`. */
  var autoApply: js.UndefOr[Boolean] = js.undefined
  /**
    * If specified, only messages that match the filter will cause the message event
    * to be fired.
    */
  var filter: js.UndefOr[String | RegExp] = js.undefined
}

object IWebSocketMessageOptions {
  @scala.inline
  def apply(autoApply: js.UndefOr[Boolean] = js.undefined, filter: String | RegExp = null): IWebSocketMessageOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoApply)) __obj.updateDynamic("autoApply")(autoApply.get.asInstanceOf[js.Any])
    if (filter != null) __obj.updateDynamic("filter")(filter.asInstanceOf[js.Any])
    __obj.asInstanceOf[IWebSocketMessageOptions]
  }
}

