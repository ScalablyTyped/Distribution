package typings
package angularDashWebsocketLib.angularDashWebsocketMod.angularMod.websocketNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Options available to be specified for IWebSocketProvider.
  */
trait IWebSocketConfigOptions extends js.Object {
  var binaryType: js.UndefOr[
    angularDashWebsocketLib.angularDashWebsocketLibStrings.blob | angularDashWebsocketLib.angularDashWebsocketLibStrings.arraybuffer
  ] = js.undefined
  var initialTimeout: js.UndefOr[scala.Double] = js.undefined
  var maxTimeout: js.UndefOr[scala.Double] = js.undefined
  var reconnectIfNotNormalClose: js.UndefOr[scala.Boolean] = js.undefined
  var rootScopeFailOver: js.UndefOr[scala.Boolean] = js.undefined
  var scope: js.UndefOr[angularLib.angularMod.angularNs.IScope] = js.undefined
  var useApplyAsync: js.UndefOr[scala.Boolean] = js.undefined
}

object IWebSocketConfigOptions {
  @scala.inline
  def apply(
    binaryType: angularDashWebsocketLib.angularDashWebsocketLibStrings.blob | angularDashWebsocketLib.angularDashWebsocketLibStrings.arraybuffer = null,
    initialTimeout: scala.Int | scala.Double = null,
    maxTimeout: scala.Int | scala.Double = null,
    reconnectIfNotNormalClose: js.UndefOr[scala.Boolean] = js.undefined,
    rootScopeFailOver: js.UndefOr[scala.Boolean] = js.undefined,
    scope: angularLib.angularMod.angularNs.IScope = null,
    useApplyAsync: js.UndefOr[scala.Boolean] = js.undefined
  ): IWebSocketConfigOptions = {
    val __obj = js.Dynamic.literal()
    if (binaryType != null) __obj.updateDynamic("binaryType")(binaryType.asInstanceOf[js.Any])
    if (initialTimeout != null) __obj.updateDynamic("initialTimeout")(initialTimeout.asInstanceOf[js.Any])
    if (maxTimeout != null) __obj.updateDynamic("maxTimeout")(maxTimeout.asInstanceOf[js.Any])
    if (!js.isUndefined(reconnectIfNotNormalClose)) __obj.updateDynamic("reconnectIfNotNormalClose")(reconnectIfNotNormalClose)
    if (!js.isUndefined(rootScopeFailOver)) __obj.updateDynamic("rootScopeFailOver")(rootScopeFailOver)
    if (scope != null) __obj.updateDynamic("scope")(scope)
    if (!js.isUndefined(useApplyAsync)) __obj.updateDynamic("useApplyAsync")(useApplyAsync)
    __obj.asInstanceOf[IWebSocketConfigOptions]
  }
}

