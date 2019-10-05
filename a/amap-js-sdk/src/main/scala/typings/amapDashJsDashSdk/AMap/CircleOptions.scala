package typings.amapDashJsDashSdk.AMap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CircleOptions extends js.Object {
  var center: LngLat
  var extData: js.UndefOr[js.Any] = js.undefined
  var fillColor: js.UndefOr[String] = js.undefined
  var fillOpacity: js.UndefOr[String] = js.undefined
  var map: Map
  var radius: js.UndefOr[Double] = js.undefined
  var strokeColor: js.UndefOr[String] = js.undefined
  var strokeDasharray: js.UndefOr[js.Array[Double]] = js.undefined
  var strokeOpacity: js.UndefOr[Double] = js.undefined
  var strokeStyle: js.UndefOr[String] = js.undefined
  var zIndex: js.UndefOr[Double] = js.undefined
}

object CircleOptions {
  @scala.inline
  def apply(
    center: LngLat,
    map: Map,
    extData: js.Any = null,
    fillColor: String = null,
    fillOpacity: String = null,
    radius: Int | Double = null,
    strokeColor: String = null,
    strokeDasharray: js.Array[Double] = null,
    strokeOpacity: Int | Double = null,
    strokeStyle: String = null,
    zIndex: Int | Double = null
  ): CircleOptions = {
    val __obj = js.Dynamic.literal(center = center, map = map)
    if (extData != null) __obj.updateDynamic("extData")(extData)
    if (fillColor != null) __obj.updateDynamic("fillColor")(fillColor)
    if (fillOpacity != null) __obj.updateDynamic("fillOpacity")(fillOpacity)
    if (radius != null) __obj.updateDynamic("radius")(radius.asInstanceOf[js.Any])
    if (strokeColor != null) __obj.updateDynamic("strokeColor")(strokeColor)
    if (strokeDasharray != null) __obj.updateDynamic("strokeDasharray")(strokeDasharray)
    if (strokeOpacity != null) __obj.updateDynamic("strokeOpacity")(strokeOpacity.asInstanceOf[js.Any])
    if (strokeStyle != null) __obj.updateDynamic("strokeStyle")(strokeStyle)
    if (zIndex != null) __obj.updateDynamic("zIndex")(zIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[CircleOptions]
  }
}

