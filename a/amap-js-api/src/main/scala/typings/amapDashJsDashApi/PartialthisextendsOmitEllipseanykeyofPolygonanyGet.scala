package typings.amapDashJsDashApi

import typings.amapDashJsDashApi.AMap.LngLat
import typings.amapDashJsDashApi.AMap.Map
import typings.amapDashJsDashApi.AMap.StrokeLineJoin
import typings.amapDashJsDashApi.AMap.StrokeStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<this extends amap-js-api.AMap.Omit<amap-js-api.AMap.Ellipse<any>, keyof amap-js-api.AMap.Polygon<any>> ? amap-js-api.AMap.Ellipse.GetOptionsResult<ExtraData> : this extends amap-js-api.AMap.Omit<amap-js-api.AMap.Rectangle<any>, keyof amap-js-api.AMap.Polygon<any>> ? amap-js-api.AMap.Rectangle.GetOptionsResult<ExtraData> : amap-js-api.AMap.Polygon.GetOptionsResult<ExtraData>> */
trait PartialthisextendsOmitEllipseanykeyofPolygonanyGet[ExtraData] extends js.Object {
  var bubble: js.UndefOr[Boolean] = js.undefined
  var clickable: js.UndefOr[Boolean] = js.undefined
  var extData: js.UndefOr[ExtraData | js.Object] = js.undefined
  var fillColor: js.UndefOr[String] = js.undefined
  var fillOpacity: js.UndefOr[Double] = js.undefined
  var lineJoin: js.UndefOr[StrokeLineJoin] = js.undefined
  var map: js.UndefOr[Map] = js.undefined
  var path: js.UndefOr[js.Array[js.Array[LngLat] | LngLat]] = js.undefined
  var strokeColor: js.UndefOr[String] = js.undefined
  var strokeDasharray: js.UndefOr[js.Array[Double]] = js.undefined
  var strokeOpacity: js.UndefOr[Double] = js.undefined
  var strokeStyle: js.UndefOr[StrokeStyle] = js.undefined
  var strokeWeight: js.UndefOr[Double] = js.undefined
  var texture: js.UndefOr[String] = js.undefined
  var zIndex: js.UndefOr[Double] = js.undefined
}

object PartialthisextendsOmitEllipseanykeyofPolygonanyGet {
  @scala.inline
  def apply[ExtraData](
    bubble: js.UndefOr[Boolean] = js.undefined,
    clickable: js.UndefOr[Boolean] = js.undefined,
    extData: ExtraData | js.Object = null,
    fillColor: String = null,
    fillOpacity: Int | Double = null,
    lineJoin: StrokeLineJoin = null,
    map: Map = null,
    path: js.Array[js.Array[LngLat] | LngLat] = null,
    strokeColor: String = null,
    strokeDasharray: js.Array[Double] = null,
    strokeOpacity: Int | Double = null,
    strokeStyle: StrokeStyle = null,
    strokeWeight: Int | Double = null,
    texture: String = null,
    zIndex: Int | Double = null
  ): PartialthisextendsOmitEllipseanykeyofPolygonanyGet[ExtraData] = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(bubble)) __obj.updateDynamic("bubble")(bubble.asInstanceOf[js.Any])
    if (!js.isUndefined(clickable)) __obj.updateDynamic("clickable")(clickable.asInstanceOf[js.Any])
    if (extData != null) __obj.updateDynamic("extData")(extData.asInstanceOf[js.Any])
    if (fillColor != null) __obj.updateDynamic("fillColor")(fillColor.asInstanceOf[js.Any])
    if (fillOpacity != null) __obj.updateDynamic("fillOpacity")(fillOpacity.asInstanceOf[js.Any])
    if (lineJoin != null) __obj.updateDynamic("lineJoin")(lineJoin.asInstanceOf[js.Any])
    if (map != null) __obj.updateDynamic("map")(map.asInstanceOf[js.Any])
    if (path != null) __obj.updateDynamic("path")(path.asInstanceOf[js.Any])
    if (strokeColor != null) __obj.updateDynamic("strokeColor")(strokeColor.asInstanceOf[js.Any])
    if (strokeDasharray != null) __obj.updateDynamic("strokeDasharray")(strokeDasharray.asInstanceOf[js.Any])
    if (strokeOpacity != null) __obj.updateDynamic("strokeOpacity")(strokeOpacity.asInstanceOf[js.Any])
    if (strokeStyle != null) __obj.updateDynamic("strokeStyle")(strokeStyle.asInstanceOf[js.Any])
    if (strokeWeight != null) __obj.updateDynamic("strokeWeight")(strokeWeight.asInstanceOf[js.Any])
    if (texture != null) __obj.updateDynamic("texture")(texture.asInstanceOf[js.Any])
    if (zIndex != null) __obj.updateDynamic("zIndex")(zIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialthisextendsOmitEllipseanykeyofPolygonanyGet[ExtraData]]
  }
}

