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
trait IWebSocketConfigOptions extends js.Object {
  var binaryType: js.UndefOr[blob | arraybuffer] = js.undefined
  var initialTimeout: js.UndefOr[Double] = js.undefined
  var maxTimeout: js.UndefOr[Double] = js.undefined
  var reconnectIfNotNormalClose: js.UndefOr[Boolean] = js.undefined
  var rootScopeFailOver: js.UndefOr[Boolean] = js.undefined
  var scope: js.UndefOr[IScope] = js.undefined
  var useApplyAsync: js.UndefOr[Boolean] = js.undefined
}

object IWebSocketConfigOptions {
  @scala.inline
  def apply(
    binaryType: blob | arraybuffer = null,
    initialTimeout: js.UndefOr[Double] = js.undefined,
    maxTimeout: js.UndefOr[Double] = js.undefined,
    reconnectIfNotNormalClose: js.UndefOr[Boolean] = js.undefined,
    rootScopeFailOver: js.UndefOr[Boolean] = js.undefined,
    scope: IScope = null,
    useApplyAsync: js.UndefOr[Boolean] = js.undefined
  ): IWebSocketConfigOptions = {
    val __obj = js.Dynamic.literal()
    if (binaryType != null) __obj.updateDynamic("binaryType")(binaryType.asInstanceOf[js.Any])
    if (!js.isUndefined(initialTimeout)) __obj.updateDynamic("initialTimeout")(initialTimeout.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maxTimeout)) __obj.updateDynamic("maxTimeout")(maxTimeout.get.asInstanceOf[js.Any])
    if (!js.isUndefined(reconnectIfNotNormalClose)) __obj.updateDynamic("reconnectIfNotNormalClose")(reconnectIfNotNormalClose.get.asInstanceOf[js.Any])
    if (!js.isUndefined(rootScopeFailOver)) __obj.updateDynamic("rootScopeFailOver")(rootScopeFailOver.get.asInstanceOf[js.Any])
    if (scope != null) __obj.updateDynamic("scope")(scope.asInstanceOf[js.Any])
    if (!js.isUndefined(useApplyAsync)) __obj.updateDynamic("useApplyAsync")(useApplyAsync.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[IWebSocketConfigOptions]
  }
}

