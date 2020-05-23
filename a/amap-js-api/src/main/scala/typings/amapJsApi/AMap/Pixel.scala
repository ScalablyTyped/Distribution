package typings.amapJsApi.AMap

import typings.amapJsApi.anon.X
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Pixel extends js.Object {
  // internal
  def add(offset: X): Pixel = js.native
  def add(offset: X, round: Boolean): Pixel = js.native
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

