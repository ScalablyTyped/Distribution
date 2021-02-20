package typings.antvG2.mod

import typings.antvG2.antvG2Strings.x
import typings.antvG2.antvG2Strings.y
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Coordinate extends StObject {
  
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
