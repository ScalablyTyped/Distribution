package typings.agentkeepalive.agentkeepaliveMod

import typings.node.httpMod.AgentOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HttpOptions extends AgentOptions {
  var freeSocketKeepAliveTimeout: js.UndefOr[Double] = js.undefined
  var freeSocketTimeout: js.UndefOr[Double] = js.undefined
  var socketActiveTTL: js.UndefOr[Double] = js.undefined
}

object HttpOptions {
  @scala.inline
  def apply(
    freeSocketKeepAliveTimeout: Int | Double = null,
    freeSocketTimeout: Int | Double = null,
    keepAlive: js.UndefOr[Boolean] = js.undefined,
    keepAliveMsecs: Int | Double = null,
    maxFreeSockets: Int | Double = null,
    maxSockets: Int | Double = null,
    socketActiveTTL: Int | Double = null,
    timeout: Int | Double = null
  ): HttpOptions = {
    val __obj = js.Dynamic.literal()
    if (freeSocketKeepAliveTimeout != null) __obj.updateDynamic("freeSocketKeepAliveTimeout")(freeSocketKeepAliveTimeout.asInstanceOf[js.Any])
    if (freeSocketTimeout != null) __obj.updateDynamic("freeSocketTimeout")(freeSocketTimeout.asInstanceOf[js.Any])
    if (!js.isUndefined(keepAlive)) __obj.updateDynamic("keepAlive")(keepAlive)
    if (keepAliveMsecs != null) __obj.updateDynamic("keepAliveMsecs")(keepAliveMsecs.asInstanceOf[js.Any])
    if (maxFreeSockets != null) __obj.updateDynamic("maxFreeSockets")(maxFreeSockets.asInstanceOf[js.Any])
    if (maxSockets != null) __obj.updateDynamic("maxSockets")(maxSockets.asInstanceOf[js.Any])
    if (socketActiveTTL != null) __obj.updateDynamic("socketActiveTTL")(socketActiveTTL.asInstanceOf[js.Any])
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[HttpOptions]
  }
}

