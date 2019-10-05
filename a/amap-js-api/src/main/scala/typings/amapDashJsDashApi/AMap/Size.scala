package typings.amapDashJsDashApi.AMap

import typings.amapDashJsDashApi.Anon_X
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("AMap.Size")
@js.native
class Size protected () extends js.Object {
  /**
    * 地物对象的像素尺寸
    * @param width 宽度像素
    * @param height 长度像素
    */
  def this(width: Double, height: Double) = this()
  // internal
  def contains(size: Anon_X): Boolean = js.native
  /**
    * 获得高度
    */
  def getHeight(): Double = js.native
  /**
    * 获得宽度
    */
  def getWidth(): Double = js.native
}

