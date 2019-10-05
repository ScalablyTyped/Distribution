package typings.amapDashJsDashApi.AMap

import typings.amapDashJsDashApi.Anon_X
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("AMap.Pixel")
@js.native
class Pixel protected () extends js.Object {
  /**
    * 像素坐标，确定地图上的一个像素点
    * @param x 横轴坐标
    * @param y 纵轴坐标
    * @param round 是否四舍五入
    */
  def this(x: Double, y: Double) = this()
  def this(x: Double, y: Double, round: Boolean) = this()
  // internal
  def add(offset: Anon_X): Pixel = js.native
  def add(offset: Anon_X, round: Boolean): Pixel = js.native
  def direction(): Null | Double = js.native
  /**
    * 当前像素坐标与传入像素坐标是否相等
    * @param point 目标像素坐标
    */
  def equals(point: Pixel): Boolean = js.native
  def floor(): Pixel = js.native
  /**
    * 获得X方向像素坐标
    */
  def getX(): Double = js.native
  /**
    * 获得Y方向像素坐标
    */
  def getY(): Double = js.native
  def length(): Double = js.native
  def round(): Pixel = js.native
  def toFixed(): this.type = js.native
  def toFixed(decimals: Double): this.type = js.native
}

