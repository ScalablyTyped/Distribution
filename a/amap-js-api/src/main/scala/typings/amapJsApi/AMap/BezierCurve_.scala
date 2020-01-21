package typings.amapJsApi.AMap

import typings.amapJsApi.AMap.BezierCurve.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("AMap.BezierCurve")
@js.native
class BezierCurve_[ExtraData] protected () extends Polyline[ExtraData] {
  /**
    * 贝瑟尔曲线
    * @param options 覆盖物选项
    */
  def this(options: Options[ExtraData]) = this()
  // internal
  def getInterpolateLngLats(): js.Array[LngLat] = js.native
  def getSerializedPath(): js.Array[js.Array[Double]] = js.native
}

