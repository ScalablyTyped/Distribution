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

