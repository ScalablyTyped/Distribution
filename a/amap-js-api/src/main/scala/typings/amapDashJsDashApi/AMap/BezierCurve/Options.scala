package typings.amapDashJsDashApi.AMap.BezierCurve

import typings.amapDashJsDashApi.AMap.LocationValue
import typings.amapDashJsDashApi.AMap.Map
import typings.amapDashJsDashApi.AMap.StrokeLineCap
import typings.amapDashJsDashApi.AMap.StrokeLineJoin
import typings.amapDashJsDashApi.AMap.StrokeStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined amap-js-api.AMap.Merge<amap-js-api.AMap.Polyline.Options<ExtraData>, {  path  :std.Array<std.Array<number | string | std.Array<string | number>>>,   tolerance ? :number,   interpolateNumLimit ? :[number]}> */
trait Options[ExtraData] extends js.Object {
  /**
    * 描边的宽度
    */
  var borderWeight: js.UndefOr[Double] = js.undefined
  /**
    * 事件是否穿透到地图
    */
  var bubble: js.UndefOr[Boolean] = js.undefined
  /**
    * 是否支持点击
    */
  var clickable: js.UndefOr[Boolean] = js.undefined
  /**
    * 鼠标悬停时的鼠标样式
    */
  var cursor: js.UndefOr[String] = js.undefined
  /**
    * 方向箭头颜色
    */
  var dirColor: js.UndefOr[String] = js.undefined
  /**
    * 是否支持拖拽
    */
  var draggable: js.UndefOr[Boolean] = js.undefined
  /**
    * 自定义数据
    */
  var extData: js.UndefOr[ExtraData] = js.undefined
  /**
    * 是否绘制成大地线
    */
  var geodesic: js.UndefOr[Boolean] = js.undefined
  var interpolateNumLimit: js.UndefOr[js.Array[Double]] = js.undefined
  /**
    * 线条是否带描边
    */
  var isOutline: js.UndefOr[Boolean] = js.undefined
  /**
    * 折线两端线帽的绘制样式
    */
  var lineCap: js.UndefOr[StrokeLineCap] = js.undefined
  /**
    * 折线拐点的绘制样式
    */
  var lineJoin: js.UndefOr[StrokeLineJoin] = js.undefined
  /**
    * 所属地图
    */
  var map: js.UndefOr[Map] = js.undefined
  /**
    * 线条描边颜色
    */
  var outlineColor: js.UndefOr[String] = js.undefined
  // internal
  /**
    * 折线的节点数组
    */
  /**
    * 贝瑟尔曲线的路径
    */
  var path: js.UndefOr[
    js.Array[LocationValue] with (js.Array[js.Array[Double | String | (js.Array[String | Double])]])
  ] = js.undefined
  /**
    * 是否延路径显示方向箭头
    */
  var showDir: js.UndefOr[Boolean] = js.undefined
  /**
    * 描边线条颜色
    */
  var strokeColor: js.UndefOr[String] = js.undefined
  /**
    * 虚线间隔
    */
  var strokeDasharray: js.UndefOr[js.Array[Double]] = js.undefined
  /**
    * 描边线条透明度
    */
  var strokeOpacity: js.UndefOr[Double] = js.undefined
  /**
    * 描边样式
    */
  var strokeStyle: js.UndefOr[StrokeStyle] = js.undefined
  /**
    * 描边宽度
    */
  var strokeWeight: js.UndefOr[Double] = js.undefined
  // internal
  var tolerance: js.UndefOr[Double] = js.undefined
  /**
    * 是否可见
    */
  var visible: js.UndefOr[Boolean] = js.undefined
  /**
    * 覆盖物层级
    */
  var zIndex: js.UndefOr[Double] = js.undefined
}

object Options {
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
    path: js.Array[LocationValue] with (js.Array[js.Array[Double | String | (js.Array[String | Double])]]) = null,
    showDir: js.UndefOr[Boolean] = js.undefined,
    strokeColor: String = null,
    strokeDasharray: js.Array[Double] = null,
    strokeOpacity: Int | Double = null,
    strokeStyle: StrokeStyle = null,
    strokeWeight: Int | Double = null,
    tolerance: Int | Double = null,
    visible: js.UndefOr[Boolean] = js.undefined,
    zIndex: Int | Double = null
  ): Options[ExtraData] = {
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
    __obj.asInstanceOf[Options[ExtraData]]
  }
}

