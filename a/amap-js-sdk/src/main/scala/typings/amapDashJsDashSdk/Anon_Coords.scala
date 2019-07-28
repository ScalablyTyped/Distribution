package typings.amapDashJsDashSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Coords extends js.Object {
  /**
    *
    * 可点击区域组成元素数组，存放图形的像素坐标等信息，该数组元素由type决定：
    * - circle:coords格式为 [x1, y1, r]，x1，y1为圆心像素坐标，r为圆半径
    * - poly: coords格式为 [x1, y1, x2, y2 … xn, yn]，各x，y表示多边形边界像素坐标
    * - rect: coords格式为 [x1, y1, x2, y2]，x1，y1为矩形左上角像素坐标，x2，y2为矩形右下角像素坐标
    * Markshape的像素坐标是指相对于marker的左上角的像素坐标偏移量
    */
  var coords: js.UndefOr[js.Array[Double]] = js.undefined
  /**
    * 可点击区域类型，可选值：
    * - circle:圆形
    * - poly:多边形
    * - rect:矩形
    */
  var `type`: js.UndefOr[String] = js.undefined
}

object Anon_Coords {
  @scala.inline
  def apply(coords: js.Array[Double] = null, `type`: String = null): Anon_Coords = {
    val __obj = js.Dynamic.literal()
    if (coords != null) __obj.updateDynamic("coords")(coords)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Anon_Coords]
  }
}

