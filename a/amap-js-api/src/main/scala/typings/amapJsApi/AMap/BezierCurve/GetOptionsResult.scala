package typings.amapJsApi.AMap.BezierCurve

import typings.amapJsApi.AMap.LngLat
import typings.amapJsApi.AMap.Map
import typings.amapJsApi.AMap.StrokeLineCap
import typings.amapJsApi.AMap.StrokeLineJoin
import typings.amapJsApi.AMap.StrokeStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetOptionsResult[ExtraData]
  extends typings.amapJsApi.AMap.Polyline.GetOptionsResult[ExtraData]

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

