package typings
package amapDashJsDashSdkLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AutoPosition extends js.Object {
  var autoPosition: js.UndefOr[scala.Boolean] = js.undefined
  var direction: js.UndefOr[scala.Boolean] = js.undefined
  var liteStyle: js.UndefOr[scala.Boolean] = js.undefined
  var locate: js.UndefOr[scala.Boolean] = js.undefined
  var locationMarker: js.UndefOr[amapDashJsDashSdkLib.AMapNs.Marker] = js.undefined
  var noIpLocate: js.UndefOr[scala.Boolean] = js.undefined
  var offset: js.UndefOr[amapDashJsDashSdkLib.AMapNs.Pixel] = js.undefined
  var position: js.UndefOr[java.lang.String] = js.undefined
  var ruler: js.UndefOr[scala.Boolean] = js.undefined
  var useNative: js.UndefOr[scala.Boolean] = js.undefined
}

object Anon_AutoPosition {
  @scala.inline
  def apply(
    autoPosition: js.UndefOr[scala.Boolean] = js.undefined,
    direction: js.UndefOr[scala.Boolean] = js.undefined,
    liteStyle: js.UndefOr[scala.Boolean] = js.undefined,
    locate: js.UndefOr[scala.Boolean] = js.undefined,
    locationMarker: amapDashJsDashSdkLib.AMapNs.Marker = null,
    noIpLocate: js.UndefOr[scala.Boolean] = js.undefined,
    offset: amapDashJsDashSdkLib.AMapNs.Pixel = null,
    position: java.lang.String = null,
    ruler: js.UndefOr[scala.Boolean] = js.undefined,
    useNative: js.UndefOr[scala.Boolean] = js.undefined
  ): Anon_AutoPosition = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoPosition)) __obj.updateDynamic("autoPosition")(autoPosition)
    if (!js.isUndefined(direction)) __obj.updateDynamic("direction")(direction)
    if (!js.isUndefined(liteStyle)) __obj.updateDynamic("liteStyle")(liteStyle)
    if (!js.isUndefined(locate)) __obj.updateDynamic("locate")(locate)
    if (locationMarker != null) __obj.updateDynamic("locationMarker")(locationMarker)
    if (!js.isUndefined(noIpLocate)) __obj.updateDynamic("noIpLocate")(noIpLocate)
    if (offset != null) __obj.updateDynamic("offset")(offset)
    if (position != null) __obj.updateDynamic("position")(position)
    if (!js.isUndefined(ruler)) __obj.updateDynamic("ruler")(ruler)
    if (!js.isUndefined(useNative)) __obj.updateDynamic("useNative")(useNative)
    __obj.asInstanceOf[Anon_AutoPosition]
  }
}

