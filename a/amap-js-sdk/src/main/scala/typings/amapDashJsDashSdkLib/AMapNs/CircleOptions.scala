package typings
package amapDashJsDashSdkLib.AMapNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CircleOptions extends js.Object {
  var center: LngLat
  var extData: js.UndefOr[js.Any] = js.undefined
  var fillColor: js.UndefOr[java.lang.String] = js.undefined
  var fillOpacity: js.UndefOr[java.lang.String] = js.undefined
  var map: Map
  var radius: js.UndefOr[scala.Double] = js.undefined
  var strokeColor: js.UndefOr[java.lang.String] = js.undefined
  var strokeDasharray: js.UndefOr[js.Array[scala.Double]] = js.undefined
  var strokeOpacity: js.UndefOr[scala.Double] = js.undefined
  var strokeStyle: js.UndefOr[java.lang.String] = js.undefined
  var zIndex: js.UndefOr[scala.Double] = js.undefined
}

object CircleOptions {
  @scala.inline
  def apply(
    center: LngLat,
    map: Map,
    extData: js.Any = null,
    fillColor: java.lang.String = null,
    fillOpacity: java.lang.String = null,
    radius: scala.Int | scala.Double = null,
    strokeColor: java.lang.String = null,
    strokeDasharray: js.Array[scala.Double] = null,
    strokeOpacity: scala.Int | scala.Double = null,
    strokeStyle: java.lang.String = null,
    zIndex: scala.Int | scala.Double = null
  ): CircleOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("center")(center)
    __obj.updateDynamic("map")(map)
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

