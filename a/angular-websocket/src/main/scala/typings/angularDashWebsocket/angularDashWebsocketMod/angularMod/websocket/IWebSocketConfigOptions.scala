package typings.angularDashWebsocket.angularDashWebsocketMod.angularMod.websocket

import typings.angular.angularMod.IScope
import typings.angularDashWebsocket.angularDashWebsocketStrings.arraybuffer
import typings.angularDashWebsocket.angularDashWebsocketStrings.blob
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
    initialTimeout: Int | Double = null,
    maxTimeout: Int | Double = null,
    reconnectIfNotNormalClose: js.UndefOr[Boolean] = js.undefined,
    rootScopeFailOver: js.UndefOr[Boolean] = js.undefined,
    scope: IScope = null,
    useApplyAsync: js.UndefOr[Boolean] = js.undefined
  ): IWebSocketConfigOptions = {
    val __obj = js.Dynamic.literal()
    if (binaryType != null) __obj.updateDynamic("binaryType")(binaryType.asInstanceOf[js.Any])
    if (initialTimeout != null) __obj.updateDynamic("initialTimeout")(initialTimeout.asInstanceOf[js.Any])
    if (maxTimeout != null) __obj.updateDynamic("maxTimeout")(maxTimeout.asInstanceOf[js.Any])
    if (!js.isUndefined(reconnectIfNotNormalClose)) __obj.updateDynamic("reconnectIfNotNormalClose")(reconnectIfNotNormalClose.asInstanceOf[js.Any])
    if (!js.isUndefined(rootScopeFailOver)) __obj.updateDynamic("rootScopeFailOver")(rootScopeFailOver.asInstanceOf[js.Any])
    if (scope != null) __obj.updateDynamic("scope")(scope.asInstanceOf[js.Any])
    if (!js.isUndefined(useApplyAsync)) __obj.updateDynamic("useApplyAsync")(useApplyAsync.asInstanceOf[js.Any])
    __obj.asInstanceOf[IWebSocketConfigOptions]
  }
}

