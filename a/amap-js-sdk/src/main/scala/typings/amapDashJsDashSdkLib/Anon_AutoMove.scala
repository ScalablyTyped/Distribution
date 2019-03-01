package typings
package amapDashJsDashSdkLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AutoMove extends js.Object {
  var autoMove: js.UndefOr[scala.Boolean] = js.undefined
  var closeWhenClickMap: js.UndefOr[scala.Boolean] = js.undefined
  var content: js.UndefOr[java.lang.String | stdLib.HTMLElement] = js.undefined
  var isCustom: js.UndefOr[scala.Boolean] = js.undefined
  var offset: js.UndefOr[amapDashJsDashSdkLib.AMapNs.Pixel] = js.undefined
  var position: js.UndefOr[amapDashJsDashSdkLib.AMapNs.LngLat] = js.undefined
  var showShadow: js.UndefOr[scala.Boolean] = js.undefined
  var size: js.UndefOr[amapDashJsDashSdkLib.AMapNs.Size] = js.undefined
}

object Anon_AutoMove {
  @scala.inline
  def apply(
    autoMove: js.UndefOr[scala.Boolean] = js.undefined,
    closeWhenClickMap: js.UndefOr[scala.Boolean] = js.undefined,
    content: java.lang.String | stdLib.HTMLElement = null,
    isCustom: js.UndefOr[scala.Boolean] = js.undefined,
    offset: amapDashJsDashSdkLib.AMapNs.Pixel = null,
    position: amapDashJsDashSdkLib.AMapNs.LngLat = null,
    showShadow: js.UndefOr[scala.Boolean] = js.undefined,
    size: amapDashJsDashSdkLib.AMapNs.Size = null
  ): Anon_AutoMove = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoMove)) __obj.updateDynamic("autoMove")(autoMove)
    if (!js.isUndefined(closeWhenClickMap)) __obj.updateDynamic("closeWhenClickMap")(closeWhenClickMap)
    if (content != null) __obj.updateDynamic("content")(content.asInstanceOf[js.Any])
    if (!js.isUndefined(isCustom)) __obj.updateDynamic("isCustom")(isCustom)
    if (offset != null) __obj.updateDynamic("offset")(offset)
    if (position != null) __obj.updateDynamic("position")(position)
    if (!js.isUndefined(showShadow)) __obj.updateDynamic("showShadow")(showShadow)
    if (size != null) __obj.updateDynamic("size")(size)
    __obj.asInstanceOf[Anon_AutoMove]
  }
}

