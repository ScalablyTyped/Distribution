package typings.amapDashJsDashApi.AMap.BezierCurve

import typings.amapDashJsDashApi.AMap.Map
import typings.amapDashJsDashApi.AMap.StrokeLineCap
import typings.amapDashJsDashApi.AMap.StrokeLineJoin
import typings.amapDashJsDashApi.AMap.StrokeStyle
import typings.amapDashJsDashApi.LngLatcontrolPointsArrayLngLat
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetOptionsResult[ExtraData]
  extends typings.amapDashJsDashApi.AMap.Polyline.GetOptionsResult[ExtraData] {
  /**
    * 贝瑟尔曲线的路径
    */
  @JSName("path")
  var path_GetOptionsResult: js.Array[LngLatcontrolPointsArrayLngLat]
}

object GetOptionsResult {
  @scala.inline
  def apply[ExtraData](
    borderWeight: Double,
    bubble: Boolean,
    clickable: Boolean,
    dirColor: String,
    dirImg: String,
    extData: ExtraData | js.Object,
    geodesic: Boolean,
    isOutline: Boolean,
    lineCap: StrokeLineCap,
    lineJoin: StrokeLineJoin,
    map: Map,
    outlineColor: String,
    path: js.Array[LngLatcontrolPointsArrayLngLat],
    showDir: Boolean,
    strokeColor: String,
    strokeDasharray: js.Array[Double],
    strokeOpacity: Double,
    strokeStyle: StrokeStyle,
    strokeWeight: Double,
    zIndex: Double
  ): GetOptionsResult[ExtraData] = {
    val __obj = js.Dynamic.literal(borderWeight = borderWeight, bubble = bubble, clickable = clickable, dirColor = dirColor, dirImg = dirImg, extData = extData.asInstanceOf[js.Any], geodesic = geodesic, isOutline = isOutline, lineCap = lineCap, lineJoin = lineJoin, map = map, outlineColor = outlineColor, path = path, showDir = showDir, strokeColor = strokeColor, strokeDasharray = strokeDasharray, strokeOpacity = strokeOpacity, strokeStyle = strokeStyle, strokeWeight = strokeWeight, zIndex = zIndex)
  
    __obj.asInstanceOf[GetOptionsResult[ExtraData]]
  }
}

