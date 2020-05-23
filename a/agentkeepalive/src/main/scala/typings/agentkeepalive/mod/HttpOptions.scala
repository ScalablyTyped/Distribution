package typings.agentkeepalive.mod

import typings.node.httpMod.AgentOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.agentkeepalive.mod.CommonHttpOption because var conflicts: keepAlive, timeout. Inlined freeSocketTimeout, freeSocketKeepAliveTimeout, socketActiveTTL */ trait HttpOptions extends AgentOptions {
  var freeSocketKeepAliveTimeout: js.UndefOr[Double] = js.undefined
  var freeSocketTimeout: js.UndefOr[Double] = js.undefined
  var socketActiveTTL: js.UndefOr[Double] = js.undefined
}

object HttpOptions {
  @scala.inline
  def apply(
    freeSocketKeepAliveTimeout: js.UndefOr[Double] = js.undefined,
    freeSocketTimeout: js.UndefOr[Double] = js.undefined,
    keepAlive: js.UndefOr[Boolean] = js.undefined,
    keepAliveMsecs: js.UndefOr[Double] = js.undefined,
    maxFreeSockets: js.UndefOr[Double] = js.undefined,
    maxSockets: js.UndefOr[Double] = js.undefined,
    socketActiveTTL: js.UndefOr[Double] = js.undefined,
    timeout: js.UndefOr[Double] = js.undefined
  ): HttpOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(freeSocketKeepAliveTimeout)) __obj.updateDynamic("freeSocketKeepAliveTimeout")(freeSocketKeepAliveTimeout.get.asInstanceOf[js.Any])
    if (!js.isUndefined(freeSocketTimeout)) __obj.updateDynamic("freeSocketTimeout")(freeSocketTimeout.get.asInstanceOf[js.Any])
    if (!js.isUndefined(keepAlive)) __obj.updateDynamic("keepAlive")(keepAlive.get.asInstanceOf[js.Any])
    if (!js.isUndefined(keepAliveMsecs)) __obj.updateDynamic("keepAliveMsecs")(keepAliveMsecs.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maxFreeSockets)) __obj.updateDynamic("maxFreeSockets")(maxFreeSockets.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maxSockets)) __obj.updateDynamic("maxSockets")(maxSockets.get.asInstanceOf[js.Any])
    if (!js.isUndefined(socketActiveTTL)) __obj.updateDynamic("socketActiveTTL")(socketActiveTTL.get.asInstanceOf[js.Any])
    if (!js.isUndefined(timeout)) __obj.updateDynamic("timeout")(timeout.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[HttpOptions]
  }
}

