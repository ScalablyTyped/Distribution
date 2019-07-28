package typings.amapDashJsDashSdk.AMapNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PolylineOptions extends js.Object {
  var extData: js.UndefOr[js.Any] = js.undefined
  var geodesic: js.UndefOr[Boolean] = js.undefined
  var isOutline: js.UndefOr[Boolean] = js.undefined
  var map: js.UndefOr[Map] = js.undefined
  var outlineColor: js.UndefOr[String] = js.undefined
  var path: js.UndefOr[js.Array[LngLat]] = js.undefined
  var strokeColor: js.UndefOr[String] = js.undefined
  var strokeDasharray: js.UndefOr[js.Array[Double]] = js.undefined
  var strokeOpacity: js.UndefOr[Double] = js.undefined
  var strokeStyle: js.UndefOr[String] = js.undefined
  var strokeWeight: js.UndefOr[Double] = js.undefined
  var zIndex: js.UndefOr[Double] = js.undefined
}

object PolylineOptions {
  @scala.inline
  def apply(
    extData: js.Any = null,
    geodesic: js.UndefOr[Boolean] = js.undefined,
    isOutline: js.UndefOr[Boolean] = js.undefined,
    map: Map = null,
    outlineColor: String = null,
    path: js.Array[LngLat] = null,
    strokeColor: String = null,
    strokeDasharray: js.Array[Double] = null,
    strokeOpacity: Int | Double = null,
    strokeStyle: String = null,
    strokeWeight: Int | Double = null,
    zIndex: Int | Double = null
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

