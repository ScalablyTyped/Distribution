package typings.amapJsApi.anon

import typings.amapJsApi.AMap.LngLat
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined amap-js-api.AMap.Omit<amap-js-api.AMap.BezierCurve<any>, keyof amap-js-api.AMap.Polyline<any>> */
@js.native
trait OmitBezierCurveanykeyofPo extends js.Object {
  @JSName("getInterpolateLngLats")
  var getInterpolateLngLats_Original: js.Function0[js.Array[LngLat]] = js.native
  @JSName("getSerializedPath")
  var getSerializedPath_Original: js.Function0[js.Array[js.Array[Double]]] = js.native
  def getInterpolateLngLats(): js.Array[LngLat] = js.native
  def getSerializedPath(): js.Array[js.Array[Double]] = js.native
}

