package typings.angularWebsocket.mod.angularAugmentingMod.websocket

import typings.angular.mod.IScope
import typings.angularWebsocket.angularWebsocketStrings.arraybuffer
import typings.angularWebsocket.angularWebsocketStrings.blob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Options available to be specified for IWebSocketProvider.
  */
@js.native
trait IWebSocketConfigOptions extends js.Object {
  var binaryType: js.UndefOr[blob | arraybuffer] = js.native
  var initialTimeout: js.UndefOr[Double] = js.native
  var maxTimeout: js.UndefOr[Double] = js.native
  var reconnectIfNotNormalClose: js.UndefOr[Boolean] = js.native
  var rootScopeFailOver: js.UndefOr[Boolean] = js.native
  var scope: js.UndefOr[IScope] = js.native
  var useApplyAsync: js.UndefOr[Boolean] = js.native
}

object IWebSocketConfigOptions {
  @scala.inline
  def apply(): IWebSocketConfigOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IWebSocketConfigOptions]
  }
  @scala.inline
  implicit class IWebSocketConfigOptionsOps[Self <: IWebSocketConfigOptions] (val x: Self) extends AnyVal {
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
    def setBinaryType(value: blob | arraybuffer): Self = this.set("binaryType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBinaryType: Self = this.set("binaryType", js.undefined)
    @scala.inline
    def setInitialTimeout(value: Double): Self = this.set("initialTimeout", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInitialTimeout: Self = this.set("initialTimeout", js.undefined)
    @scala.inline
    def setMaxTimeout(value: Double): Self = this.set("maxTimeout", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxTimeout: Self = this.set("maxTimeout", js.undefined)
    @scala.inline
    def setReconnectIfNotNormalClose(value: Boolean): Self = this.set("reconnectIfNotNormalClose", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReconnectIfNotNormalClose: Self = this.set("reconnectIfNotNormalClose", js.undefined)
    @scala.inline
    def setRootScopeFailOver(value: Boolean): Self = this.set("rootScopeFailOver", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRootScopeFailOver: Self = this.set("rootScopeFailOver", js.undefined)
    @scala.inline
    def setScope(value: IScope): Self = this.set("scope", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScope: Self = this.set("scope", js.undefined)
    @scala.inline
    def setUseApplyAsync(value: Boolean): Self = this.set("useApplyAsync", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUseApplyAsync: Self = this.set("useApplyAsync", js.undefined)
  }
  
}

