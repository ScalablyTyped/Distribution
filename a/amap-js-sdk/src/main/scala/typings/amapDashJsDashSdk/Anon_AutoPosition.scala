package typings.amapDashJsDashSdk

import typings.amapDashJsDashSdk.AMapNs.Marker
import typings.amapDashJsDashSdk.AMapNs.Pixel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AutoPosition extends js.Object {
  var autoPosition: js.UndefOr[Boolean] = js.undefined
  var direction: js.UndefOr[Boolean] = js.undefined
  var liteStyle: js.UndefOr[Boolean] = js.undefined
  var locate: js.UndefOr[Boolean] = js.undefined
  var locationMarker: js.UndefOr[Marker] = js.undefined
  var noIpLocate: js.UndefOr[Boolean] = js.undefined
  var offset: js.UndefOr[Pixel] = js.undefined
  var position: js.UndefOr[String] = js.undefined
  var ruler: js.UndefOr[Boolean] = js.undefined
  var useNative: js.UndefOr[Boolean] = js.undefined
}

object Anon_AutoPosition {
  @scala.inline
  def apply(
    autoPosition: js.UndefOr[Boolean] = js.undefined,
    direction: js.UndefOr[Boolean] = js.undefined,
    liteStyle: js.UndefOr[Boolean] = js.undefined,
    locate: js.UndefOr[Boolean] = js.undefined,
    locationMarker: Marker = null,
    noIpLocate: js.UndefOr[Boolean] = js.undefined,
    offset: Pixel = null,
    position: String = null,
    ruler: js.UndefOr[Boolean] = js.undefined,
    useNative: js.UndefOr[Boolean] = js.undefined
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

