package typings
package amapDashJsDashSdkLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AutoRefresh extends js.Object {
  var autoRefresh: js.UndefOr[scala.Boolean] = js.undefined
  var detectRetina: js.UndefOr[scala.Boolean] = js.undefined
  var interval: js.UndefOr[scala.Double] = js.undefined
  var map: amapDashJsDashSdkLib.AMapNs.Map
  var opacity: js.UndefOr[scala.Double] = js.undefined
  var zIndex: js.UndefOr[scala.Double] = js.undefined
  var zooms: js.UndefOr[js.Array[scala.Double]] = js.undefined
}

object Anon_AutoRefresh {
  @scala.inline
  def apply(
    map: amapDashJsDashSdkLib.AMapNs.Map,
    autoRefresh: js.UndefOr[scala.Boolean] = js.undefined,
    detectRetina: js.UndefOr[scala.Boolean] = js.undefined,
    interval: scala.Int | scala.Double = null,
    opacity: scala.Int | scala.Double = null,
    zIndex: scala.Int | scala.Double = null,
    zooms: js.Array[scala.Double] = null
  ): Anon_AutoRefresh = {
    val __obj = js.Dynamic.literal(map = map)
    if (!js.isUndefined(autoRefresh)) __obj.updateDynamic("autoRefresh")(autoRefresh)
    if (!js.isUndefined(detectRetina)) __obj.updateDynamic("detectRetina")(detectRetina)
    if (interval != null) __obj.updateDynamic("interval")(interval.asInstanceOf[js.Any])
    if (opacity != null) __obj.updateDynamic("opacity")(opacity.asInstanceOf[js.Any])
    if (zIndex != null) __obj.updateDynamic("zIndex")(zIndex.asInstanceOf[js.Any])
    if (zooms != null) __obj.updateDynamic("zooms")(zooms)
    __obj.asInstanceOf[Anon_AutoRefresh]
  }
}

