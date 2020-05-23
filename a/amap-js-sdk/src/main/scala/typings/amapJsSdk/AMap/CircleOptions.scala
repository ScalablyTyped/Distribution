package typings.amapJsSdk.AMap

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
    radius: js.UndefOr[Double] = js.undefined,
    strokeColor: String = null,
    strokeDasharray: js.Array[Double] = null,
    strokeOpacity: js.UndefOr[Double] = js.undefined,
    strokeStyle: String = null,
    zIndex: js.UndefOr[Double] = js.undefined
  ): CircleOptions = {
    val __obj = js.Dynamic.literal(center = center.asInstanceOf[js.Any], map = map.asInstanceOf[js.Any])
    if (extData != null) __obj.updateDynamic("extData")(extData.asInstanceOf[js.Any])
    if (fillColor != null) __obj.updateDynamic("fillColor")(fillColor.asInstanceOf[js.Any])
    if (fillOpacity != null) __obj.updateDynamic("fillOpacity")(fillOpacity.asInstanceOf[js.Any])
    if (!js.isUndefined(radius)) __obj.updateDynamic("radius")(radius.get.asInstanceOf[js.Any])
    if (strokeColor != null) __obj.updateDynamic("strokeColor")(strokeColor.asInstanceOf[js.Any])
    if (strokeDasharray != null) __obj.updateDynamic("strokeDasharray")(strokeDasharray.asInstanceOf[js.Any])
    if (!js.isUndefined(strokeOpacity)) __obj.updateDynamic("strokeOpacity")(strokeOpacity.get.asInstanceOf[js.Any])
    if (strokeStyle != null) __obj.updateDynamic("strokeStyle")(strokeStyle.asInstanceOf[js.Any])
    if (!js.isUndefined(zIndex)) __obj.updateDynamic("zIndex")(zIndex.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[CircleOptions]
  }
}

