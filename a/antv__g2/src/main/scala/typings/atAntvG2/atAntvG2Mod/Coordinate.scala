package typings.atAntvG2.atAntvG2Mod

import typings.atAntvG2.atAntvG2Strings.x
import typings.atAntvG2.atAntvG2Strings.y
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Coordinate extends js.Object {
  /**
    * 坐标系转置，将 x 或者 y 的起始、结束值倒置。
    */
  def reflect(): Coordinate = js.native
  @JSName("reflect")
  def reflect_x(xy: x): Coordinate = js.native
  @JSName("reflect")
  def reflect_y(xy: y): Coordinate = js.native
  /**
    * 坐标系旋转，angle 表示旋转的度数，单位为角度。
    */
  def rotate(angle: Double): Coordinate = js.native
  /**
    * 坐标系缩放，sx 代表 x 方向缩放比例，sy 代表 y 方向缩放比例，单位为数值。
    */
  def scale(sx: Double, sy: Double): Coordinate = js.native
  /**
    * 将坐标系 x 轴和 y 轴转置。
    */
  def transpose(): Coordinate = js.native
}

