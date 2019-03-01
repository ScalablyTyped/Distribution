package typings
package analyticsDashNodeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Enable extends js.Object {
  var enable: js.UndefOr[scala.Boolean] = js.undefined
  var flushAt: js.UndefOr[scala.Double] = js.undefined
  var flushInterval: js.UndefOr[scala.Double] = js.undefined
  var host: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_Enable {
  @scala.inline
  def apply(
    enable: js.UndefOr[scala.Boolean] = js.undefined,
    flushAt: scala.Int | scala.Double = null,
    flushInterval: scala.Int | scala.Double = null,
    host: java.lang.String = null
  ): Anon_Enable = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(enable)) __obj.updateDynamic("enable")(enable)
    if (flushAt != null) __obj.updateDynamic("flushAt")(flushAt.asInstanceOf[js.Any])
    if (flushInterval != null) __obj.updateDynamic("flushInterval")(flushInterval.asInstanceOf[js.Any])
    if (host != null) __obj.updateDynamic("host")(host)
    __obj.asInstanceOf[Anon_Enable]
  }
}

