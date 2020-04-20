package typings.amapJsApi.AMap.Polyline

import typings.amapJsApi.AMap.LngLat
import typings.amapJsApi.AMap.Map
import typings.amapJsApi.AMap.StrokeLineCap
import typings.amapJsApi.AMap.StrokeLineJoin
import typings.amapJsApi.AMap.StrokeStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetOptionsResult[ExtraData]
  extends typings.amapJsApi.AMap.ShapeOverlay.GetOptionsResult[ExtraData] {
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
    val __obj = js.Dynamic.literal(borderWeight = borderWeight.asInstanceOf[js.Any], bubble = bubble.asInstanceOf[js.Any], clickable = clickable.asInstanceOf[js.Any], dirColor = dirColor.asInstanceOf[js.Any], dirImg = dirImg.asInstanceOf[js.Any], extData = extData.asInstanceOf[js.Any], geodesic = geodesic.asInstanceOf[js.Any], isOutline = isOutline.asInstanceOf[js.Any], lineCap = lineCap.asInstanceOf[js.Any], lineJoin = lineJoin.asInstanceOf[js.Any], map = map.asInstanceOf[js.Any], outlineColor = outlineColor.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], showDir = showDir.asInstanceOf[js.Any], strokeColor = strokeColor.asInstanceOf[js.Any], strokeDasharray = strokeDasharray.asInstanceOf[js.Any], strokeOpacity = strokeOpacity.asInstanceOf[js.Any], strokeStyle = strokeStyle.asInstanceOf[js.Any], strokeWeight = strokeWeight.asInstanceOf[js.Any], zIndex = zIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetOptionsResult[ExtraData]]
  }
}

