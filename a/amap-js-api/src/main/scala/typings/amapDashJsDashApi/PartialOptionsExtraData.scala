package typings.amapDashJsDashApi

import typings.amapDashJsDashApi.AMap.LocationValue
import typings.amapDashJsDashApi.AMap.Map
import typings.amapDashJsDashApi.AMap.StrokeLineCap
import typings.amapDashJsDashApi.AMap.StrokeLineJoin
import typings.amapDashJsDashApi.AMap.StrokeStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<amap-js-api.AMap.BezierCurve.Options<ExtraData>> */
trait PartialOptionsExtraData[ExtraData] extends js.Object {
  var borderWeight: js.UndefOr[Double] = js.undefined
  var bubble: js.UndefOr[Boolean] = js.undefined
  var clickable: js.UndefOr[Boolean] = js.undefined
  var cursor: js.UndefOr[String] = js.undefined
  var dirColor: js.UndefOr[String] = js.undefined
  var draggable: js.UndefOr[Boolean] = js.undefined
  var extData: js.UndefOr[ExtraData] = js.undefined
  var geodesic: js.UndefOr[Boolean] = js.undefined
  var interpolateNumLimit: js.UndefOr[js.Array[Double]] = js.undefined
  var isOutline: js.UndefOr[Boolean] = js.undefined
  var lineCap: js.UndefOr[StrokeLineCap] = js.undefined
  var lineJoin: js.UndefOr[StrokeLineJoin] = js.undefined
  var map: js.UndefOr[Map] = js.undefined
  var outlineColor: js.UndefOr[String] = js.undefined
  var path: js.UndefOr[js.Array[LocationValue]] = js.undefined
  var showDir: js.UndefOr[Boolean] = js.undefined
  var strokeColor: js.UndefOr[String] = js.undefined
  var strokeDasharray: js.UndefOr[js.Array[Double]] = js.undefined
  var strokeOpacity: js.UndefOr[Double] = js.undefined
  var strokeStyle: js.UndefOr[StrokeStyle] = js.undefined
  var strokeWeight: js.UndefOr[Double] = js.undefined
  var tolerance: js.UndefOr[Double] = js.undefined
  var visible: js.UndefOr[Boolean] = js.undefined
  var zIndex: js.UndefOr[Double] = js.undefined
}

object PartialOptionsExtraData {
  @scala.inline
  def apply[ExtraData](
    borderWeight: Int | Double = null,
    bubble: js.UndefOr[Boolean] = js.undefined,
    clickable: js.UndefOr[Boolean] = js.undefined,
    cursor: String = null,
    dirColor: String = null,
    draggable: js.UndefOr[Boolean] = js.undefined,
    extData: ExtraData = null,
    geodesic: js.UndefOr[Boolean] = js.undefined,
    interpolateNumLimit: js.Array[Double] = null,
    isOutline: js.UndefOr[Boolean] = js.undefined,
    lineCap: StrokeLineCap = null,
    lineJoin: StrokeLineJoin = null,
    map: Map = null,
    outlineColor: String = null,
    path: js.Array[LocationValue] = null,
    showDir: js.UndefOr[Boolean] = js.undefined,
    strokeColor: String = null,
    strokeDasharray: js.Array[Double] = null,
    strokeOpacity: Int | Double = null,
    strokeStyle: StrokeStyle = null,
    strokeWeight: Int | Double = null,
    tolerance: Int | Double = null,
    visible: js.UndefOr[Boolean] = js.undefined,
    zIndex: Int | Double = null
  ): PartialOptionsExtraData[ExtraData] = {
    val __obj = js.Dynamic.literal()
    if (borderWeight != null) __obj.updateDynamic("borderWeight")(borderWeight.asInstanceOf[js.Any])
    if (!js.isUndefined(bubble)) __obj.updateDynamic("bubble")(bubble.asInstanceOf[js.Any])
    if (!js.isUndefined(clickable)) __obj.updateDynamic("clickable")(clickable.asInstanceOf[js.Any])
    if (cursor != null) __obj.updateDynamic("cursor")(cursor.asInstanceOf[js.Any])
    if (dirColor != null) __obj.updateDynamic("dirColor")(dirColor.asInstanceOf[js.Any])
    if (!js.isUndefined(draggable)) __obj.updateDynamic("draggable")(draggable.asInstanceOf[js.Any])
    if (extData != null) __obj.updateDynamic("extData")(extData.asInstanceOf[js.Any])
    if (!js.isUndefined(geodesic)) __obj.updateDynamic("geodesic")(geodesic.asInstanceOf[js.Any])
    if (interpolateNumLimit != null) __obj.updateDynamic("interpolateNumLimit")(interpolateNumLimit.asInstanceOf[js.Any])
    if (!js.isUndefined(isOutline)) __obj.updateDynamic("isOutline")(isOutline.asInstanceOf[js.Any])
    if (lineCap != null) __obj.updateDynamic("lineCap")(lineCap.asInstanceOf[js.Any])
    if (lineJoin != null) __obj.updateDynamic("lineJoin")(lineJoin.asInstanceOf[js.Any])
    if (map != null) __obj.updateDynamic("map")(map.asInstanceOf[js.Any])
    if (outlineColor != null) __obj.updateDynamic("outlineColor")(outlineColor.asInstanceOf[js.Any])
    if (path != null) __obj.updateDynamic("path")(path.asInstanceOf[js.Any])
    if (!js.isUndefined(showDir)) __obj.updateDynamic("showDir")(showDir.asInstanceOf[js.Any])
    if (strokeColor != null) __obj.updateDynamic("strokeColor")(strokeColor.asInstanceOf[js.Any])
    if (strokeDasharray != null) __obj.updateDynamic("strokeDasharray")(strokeDasharray.asInstanceOf[js.Any])
    if (strokeOpacity != null) __obj.updateDynamic("strokeOpacity")(strokeOpacity.asInstanceOf[js.Any])
    if (strokeStyle != null) __obj.updateDynamic("strokeStyle")(strokeStyle.asInstanceOf[js.Any])
    if (strokeWeight != null) __obj.updateDynamic("strokeWeight")(strokeWeight.asInstanceOf[js.Any])
    if (tolerance != null) __obj.updateDynamic("tolerance")(tolerance.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.asInstanceOf[js.Any])
    if (zIndex != null) __obj.updateDynamic("zIndex")(zIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialOptionsExtraData[ExtraData]]
  }
}

