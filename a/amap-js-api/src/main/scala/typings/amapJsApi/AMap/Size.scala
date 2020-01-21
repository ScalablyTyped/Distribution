package typings.amapJsApi.AMap

import typings.amapJsApi.AnonX
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
  def contains(size: AnonX): Boolean = js.native
  /**
    * 获得高度
    */
  def getHeight(): Double = js.native
  /**
    * 获得宽度
    */
  def getWidth(): Double = js.native
}

