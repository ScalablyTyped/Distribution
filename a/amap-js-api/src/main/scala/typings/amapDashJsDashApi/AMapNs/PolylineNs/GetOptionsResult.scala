package typings.amapDashJsDashApi.AMapNs.PolylineNs

import typings.amapDashJsDashApi.AMapNs.LngLat
import typings.amapDashJsDashApi.AMapNs.Map
import typings.amapDashJsDashApi.AMapNs.StrokeLineCap
import typings.amapDashJsDashApi.AMapNs.StrokeLineJoin
import typings.amapDashJsDashApi.AMapNs.StrokeStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetOptionsResult[ExtraData]
  extends typings.amapDashJsDashApi.AMapNs.ShapeOverlayNs.GetOptionsResult[ExtraData] {
  /**
    * 描边的宽度
    */
  var borderWeight: Double
  /**
    * 方向箭头颜色
    */
  var dirColor: String
  /**
    * 方向箭头图片
    */
  var dirImg: String
  /**
    * 是否绘制成大地线
    */
  var geodesic: Boolean
  /**
    * 线条是否带描边
    */
  var isOutline: Boolean
  /**
    * 折线两端线帽的绘制样式
    */
  var lineCap: StrokeLineCap
  /**
    * 折线拐点的绘制样式
    */
  var lineJoin: StrokeLineJoin
  /**
    * 线条描边颜色
    */
  var outlineColor: String
  /**
    * 折线的节点数组
    */
  var path: js.Array[LngLat]
  /**
    * 是否延路径显示方向箭头
    */
  var showDir: Boolean
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
    path: js.Array[LngLat],
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

