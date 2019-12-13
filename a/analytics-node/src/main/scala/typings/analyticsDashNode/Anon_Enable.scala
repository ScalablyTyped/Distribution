package typings.analyticsDashNode

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Enable extends js.Object {
  var enable: js.UndefOr[Boolean] = js.undefined
  var flushAt: js.UndefOr[Double] = js.undefined
  var flushInterval: js.UndefOr[Double] = js.undefined
  var host: js.UndefOr[String] = js.undefined
  var timeout: js.UndefOr[Double | String] = js.undefined
}

object Anon_Enable {
  @scala.inline
  def apply(
    enable: js.UndefOr[Boolean] = js.undefined,
    flushAt: Int | Double = null,
    flushInterval: Int | Double = null,
    host: String = null,
    timeout: Double | String = null
  ): Anon_Enable = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(enable)) __obj.updateDynamic("enable")(enable.asInstanceOf[js.Any])
    if (flushAt != null) __obj.updateDynamic("flushAt")(flushAt.asInstanceOf[js.Any])
    if (flushInterval != null) __obj.updateDynamic("flushInterval")(flushInterval.asInstanceOf[js.Any])
    if (host != null) __obj.updateDynamic("host")(host.asInstanceOf[js.Any])
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Enable]
  }
}

