package typings.analyticsNode.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Enable extends js.Object {
  var enable: js.UndefOr[Boolean] = js.undefined
  var flushAt: js.UndefOr[Double] = js.undefined
  var flushInterval: js.UndefOr[Double] = js.undefined
  var host: js.UndefOr[String] = js.undefined
  var timeout: js.UndefOr[Double | String] = js.undefined
}

object Enable {
  @scala.inline
  def apply(
    enable: js.UndefOr[Boolean] = js.undefined,
    flushAt: js.UndefOr[Double] = js.undefined,
    flushInterval: js.UndefOr[Double] = js.undefined,
    host: String = null,
    timeout: Double | String = null
  ): Enable = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(enable)) __obj.updateDynamic("enable")(enable.get.asInstanceOf[js.Any])
    if (!js.isUndefined(flushAt)) __obj.updateDynamic("flushAt")(flushAt.get.asInstanceOf[js.Any])
    if (!js.isUndefined(flushInterval)) __obj.updateDynamic("flushInterval")(flushInterval.get.asInstanceOf[js.Any])
    if (host != null) __obj.updateDynamic("host")(host.asInstanceOf[js.Any])
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[Enable]
  }
}

