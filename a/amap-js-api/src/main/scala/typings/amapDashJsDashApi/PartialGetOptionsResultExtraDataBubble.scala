package typings.amapDashJsDashApi

import typings.amapDashJsDashApi.AMapNs.LngLat
import typings.amapDashJsDashApi.AMapNs.Map
import typings.amapDashJsDashApi.AMapNs.StrokeLineJoin
import typings.amapDashJsDashApi.AMapNs.StrokeStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<amap-js-api.AMap.Circle.GetOptionsResult<ExtraData>> */
trait PartialGetOptionsResultExtraDataBubble[ExtraData] extends js.Object {
  var bubble: js.UndefOr[Boolean] = js.undefined
  var center: js.UndefOr[LngLat] = js.undefined
  var clickable: js.UndefOr[Boolean] = js.undefined
  var extData: js.UndefOr[ExtraData | js.Object] = js.undefined
  var fillColor: js.UndefOr[String] = js.undefined
  var fillOpacity: js.UndefOr[Double] = js.undefined
  var lineJoin: js.UndefOr[StrokeLineJoin] = js.undefined
  var map: js.UndefOr[Map] = js.undefined
  var path: js.UndefOr[js.Array[js.Array[LngLat] | LngLat]] = js.undefined
  var radius: js.UndefOr[Double] = js.undefined
  var strokeColor: js.UndefOr[String] = js.undefined
  var strokeDasharray: js.UndefOr[js.Array[Double]] = js.undefined
  var strokeOpacity: js.UndefOr[Double] = js.undefined
  var strokeStyle: js.UndefOr[StrokeStyle] = js.undefined
  var strokeWeight: js.UndefOr[Double] = js.undefined
  var texture: js.UndefOr[String] = js.undefined
  var zIndex: js.UndefOr[Double] = js.undefined
}

object PartialGetOptionsResultExtraDataBubble {
  @scala.inline
  def apply[ExtraData](
    bubble: js.UndefOr[Boolean] = js.undefined,
    center: LngLat = null,
    clickable: js.UndefOr[Boolean] = js.undefined,
    extData: ExtraData | js.Object = null,
    fillColor: String = null,
    fillOpacity: Int | Double = null,
    lineJoin: StrokeLineJoin = null,
    map: Map = null,
    path: js.Array[js.Array[LngLat] | LngLat] = null,
    radius: Int | Double = null,
    strokeColor: String = null,
    strokeDasharray: js.Array[Double] = null,
    strokeOpacity: Int | Double = null,
    strokeStyle: StrokeStyle = null,
    strokeWeight: Int | Double = null,
    texture: String = null,
    zIndex: Int | Double = null
  ): PartialGetOptionsResultExtraDataBubble[ExtraData] = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(bubble)) __obj.updateDynamic("bubble")(bubble)
    if (center != null) __obj.updateDynamic("center")(center)
    if (!js.isUndefined(clickable)) __obj.updateDynamic("clickable")(clickable)
    if (extData != null) __obj.updateDynamic("extData")(extData.asInstanceOf[js.Any])
    if (fillColor != null) __obj.updateDynamic("fillColor")(fillColor)
    if (fillOpacity != null) __obj.updateDynamic("fillOpacity")(fillOpacity.asInstanceOf[js.Any])
    if (lineJoin != null) __obj.updateDynamic("lineJoin")(lineJoin)
    if (map != null) __obj.updateDynamic("map")(map)
    if (path != null) __obj.updateDynamic("path")(path)
    if (radius != null) __obj.updateDynamic("radius")(radius.asInstanceOf[js.Any])
    if (strokeColor != null) __obj.updateDynamic("strokeColor")(strokeColor)
    if (strokeDasharray != null) __obj.updateDynamic("strokeDasharray")(strokeDasharray)
    if (strokeOpacity != null) __obj.updateDynamic("strokeOpacity")(strokeOpacity.asInstanceOf[js.Any])
    if (strokeStyle != null) __obj.updateDynamic("strokeStyle")(strokeStyle)
    if (strokeWeight != null) __obj.updateDynamic("strokeWeight")(strokeWeight.asInstanceOf[js.Any])
    if (texture != null) __obj.updateDynamic("texture")(texture)
    if (zIndex != null) __obj.updateDynamic("zIndex")(zIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialGetOptionsResultExtraDataBubble[ExtraData]]
  }
}

