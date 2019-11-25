package typings.amapDashJsDashSdk

import typings.amapDashJsDashSdk.AMap.Map
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AutoRefresh extends js.Object {
  var autoRefresh: js.UndefOr[Boolean] = js.undefined
  var detectRetina: js.UndefOr[Boolean] = js.undefined
  var interval: js.UndefOr[Double] = js.undefined
  var map: Map
  var opacity: js.UndefOr[Double] = js.undefined
  var zIndex: js.UndefOr[Double] = js.undefined
  var zooms: js.UndefOr[js.Array[Double]] = js.undefined
}

object Anon_AutoRefresh {
  @scala.inline
  def apply(
    map: Map,
    autoRefresh: js.UndefOr[Boolean] = js.undefined,
    detectRetina: js.UndefOr[Boolean] = js.undefined,
    interval: Int | Double = null,
    opacity: Int | Double = null,
    zIndex: Int | Double = null,
    zooms: js.Array[Double] = null
  ): Anon_AutoRefresh = {
    val __obj = js.Dynamic.literal(map = map.asInstanceOf[js.Any])
    if (!js.isUndefined(autoRefresh)) __obj.updateDynamic("autoRefresh")(autoRefresh.asInstanceOf[js.Any])
    if (!js.isUndefined(detectRetina)) __obj.updateDynamic("detectRetina")(detectRetina.asInstanceOf[js.Any])
    if (interval != null) __obj.updateDynamic("interval")(interval.asInstanceOf[js.Any])
    if (opacity != null) __obj.updateDynamic("opacity")(opacity.asInstanceOf[js.Any])
    if (zIndex != null) __obj.updateDynamic("zIndex")(zIndex.asInstanceOf[js.Any])
    if (zooms != null) __obj.updateDynamic("zooms")(zooms.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_AutoRefresh]
  }
}

