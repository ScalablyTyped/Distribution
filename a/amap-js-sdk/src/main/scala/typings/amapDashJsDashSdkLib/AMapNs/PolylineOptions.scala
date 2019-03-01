package typings
package amapDashJsDashSdkLib.AMapNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PolylineOptions extends js.Object {
  var extData: js.UndefOr[js.Any] = js.undefined
  var geodesic: js.UndefOr[scala.Boolean] = js.undefined
  var isOutline: js.UndefOr[scala.Boolean] = js.undefined
  var map: js.UndefOr[Map] = js.undefined
  var outlineColor: js.UndefOr[java.lang.String] = js.undefined
  var path: js.UndefOr[js.Array[LngLat]] = js.undefined
  var strokeColor: js.UndefOr[java.lang.String] = js.undefined
  var strokeDasharray: js.UndefOr[js.Array[scala.Double]] = js.undefined
  var strokeOpacity: js.UndefOr[scala.Double] = js.undefined
  var strokeStyle: js.UndefOr[java.lang.String] = js.undefined
  var strokeWeight: js.UndefOr[scala.Double] = js.undefined
  var zIndex: js.UndefOr[scala.Double] = js.undefined
}

object PolylineOptions {
  @scala.inline
  def apply(
    extData: js.Any = null,
    geodesic: js.UndefOr[scala.Boolean] = js.undefined,
    isOutline: js.UndefOr[scala.Boolean] = js.undefined,
    map: Map = null,
    outlineColor: java.lang.String = null,
    path: js.Array[LngLat] = null,
    strokeColor: java.lang.String = null,
    strokeDasharray: js.Array[scala.Double] = null,
    strokeOpacity: scala.Int | scala.Double = null,
    strokeStyle: java.lang.String = null,
    strokeWeight: scala.Int | scala.Double = null,
    zIndex: scala.Int | scala.Double = null
  ): PolylineOptions = {
    val __obj = js.Dynamic.literal()
    if (extData != null) __obj.updateDynamic("extData")(extData)
    if (!js.isUndefined(geodesic)) __obj.updateDynamic("geodesic")(geodesic)
    if (!js.isUndefined(isOutline)) __obj.updateDynamic("isOutline")(isOutline)
    if (map != null) __obj.updateDynamic("map")(map)
    if (outlineColor != null) __obj.updateDynamic("outlineColor")(outlineColor)
    if (path != null) __obj.updateDynamic("path")(path)
    if (strokeColor != null) __obj.updateDynamic("strokeColor")(strokeColor)
    if (strokeDasharray != null) __obj.updateDynamic("strokeDasharray")(strokeDasharray)
    if (strokeOpacity != null) __obj.updateDynamic("strokeOpacity")(strokeOpacity.asInstanceOf[js.Any])
    if (strokeStyle != null) __obj.updateDynamic("strokeStyle")(strokeStyle)
    if (strokeWeight != null) __obj.updateDynamic("strokeWeight")(strokeWeight.asInstanceOf[js.Any])
    if (zIndex != null) __obj.updateDynamic("zIndex")(zIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[PolylineOptions]
  }
}

