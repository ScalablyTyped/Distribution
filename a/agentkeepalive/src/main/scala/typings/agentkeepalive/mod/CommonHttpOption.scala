package typings.agentkeepalive.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CommonHttpOption extends js.Object {
  var freeSocketKeepAliveTimeout: js.UndefOr[Double] = js.undefined
  var freeSocketTimeout: js.UndefOr[Double] = js.undefined
  var keepAlive: js.UndefOr[Boolean] = js.undefined
  var socketActiveTTL: js.UndefOr[Double] = js.undefined
  var timeout: js.UndefOr[Double] = js.undefined
}

object CommonHttpOption {
  @scala.inline
  def apply(
    freeSocketKeepAliveTimeout: js.UndefOr[Double] = js.undefined,
    freeSocketTimeout: js.UndefOr[Double] = js.undefined,
    keepAlive: js.UndefOr[Boolean] = js.undefined,
    socketActiveTTL: js.UndefOr[Double] = js.undefined,
    timeout: js.UndefOr[Double] = js.undefined
  ): CommonHttpOption = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(freeSocketKeepAliveTimeout)) __obj.updateDynamic("freeSocketKeepAliveTimeout")(freeSocketKeepAliveTimeout.get.asInstanceOf[js.Any])
    if (!js.isUndefined(freeSocketTimeout)) __obj.updateDynamic("freeSocketTimeout")(freeSocketTimeout.get.asInstanceOf[js.Any])
    if (!js.isUndefined(keepAlive)) __obj.updateDynamic("keepAlive")(keepAlive.get.asInstanceOf[js.Any])
    if (!js.isUndefined(socketActiveTTL)) __obj.updateDynamic("socketActiveTTL")(socketActiveTTL.get.asInstanceOf[js.Any])
    if (!js.isUndefined(timeout)) __obj.updateDynamic("timeout")(timeout.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[CommonHttpOption]
  }
}

