package typings.amapDashJsDashSdk

import typings.amapDashJsDashSdk.AMap.Marker
import typings.amapDashJsDashSdk.AMap.Pixel
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
    if (!js.isUndefined(autoPosition)) __obj.updateDynamic("autoPosition")(autoPosition.asInstanceOf[js.Any])
    if (!js.isUndefined(direction)) __obj.updateDynamic("direction")(direction.asInstanceOf[js.Any])
    if (!js.isUndefined(liteStyle)) __obj.updateDynamic("liteStyle")(liteStyle.asInstanceOf[js.Any])
    if (!js.isUndefined(locate)) __obj.updateDynamic("locate")(locate.asInstanceOf[js.Any])
    if (locationMarker != null) __obj.updateDynamic("locationMarker")(locationMarker.asInstanceOf[js.Any])
    if (!js.isUndefined(noIpLocate)) __obj.updateDynamic("noIpLocate")(noIpLocate.asInstanceOf[js.Any])
    if (offset != null) __obj.updateDynamic("offset")(offset.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (!js.isUndefined(ruler)) __obj.updateDynamic("ruler")(ruler.asInstanceOf[js.Any])
    if (!js.isUndefined(useNative)) __obj.updateDynamic("useNative")(useNative.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_AutoPosition]
  }
}

