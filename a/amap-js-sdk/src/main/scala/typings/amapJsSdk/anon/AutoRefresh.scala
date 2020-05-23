package typings.amapJsSdk.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AutoRefresh extends js.Object {
  var autoRefresh: js.UndefOr[Boolean] = js.undefined
  var detectRetina: js.UndefOr[Boolean] = js.undefined
  var interval: js.UndefOr[Double] = js.undefined
  var map: typings.amapJsSdk.AMap.Map
  var opacity: js.UndefOr[Double] = js.undefined
  var zIndex: js.UndefOr[Double] = js.undefined
  var zooms: js.UndefOr[js.Array[Double]] = js.undefined
}

object AutoRefresh {
  @scala.inline
  def apply(
    map: typings.amapJsSdk.AMap.Map,
    autoRefresh: js.UndefOr[Boolean] = js.undefined,
    detectRetina: js.UndefOr[Boolean] = js.undefined,
    interval: js.UndefOr[Double] = js.undefined,
    opacity: js.UndefOr[Double] = js.undefined,
    zIndex: js.UndefOr[Double] = js.undefined,
    zooms: js.Array[Double] = null
  ): AutoRefresh = {
    val __obj = js.Dynamic.literal(map = map.asInstanceOf[js.Any])
    if (!js.isUndefined(autoRefresh)) __obj.updateDynamic("autoRefresh")(autoRefresh.get.asInstanceOf[js.Any])
    if (!js.isUndefined(detectRetina)) __obj.updateDynamic("detectRetina")(detectRetina.get.asInstanceOf[js.Any])
    if (!js.isUndefined(interval)) __obj.updateDynamic("interval")(interval.get.asInstanceOf[js.Any])
    if (!js.isUndefined(opacity)) __obj.updateDynamic("opacity")(opacity.get.asInstanceOf[js.Any])
    if (!js.isUndefined(zIndex)) __obj.updateDynamic("zIndex")(zIndex.get.asInstanceOf[js.Any])
    if (zooms != null) __obj.updateDynamic("zooms")(zooms.asInstanceOf[js.Any])
    __obj.asInstanceOf[AutoRefresh]
  }
}

