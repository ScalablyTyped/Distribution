package typings.amapDashJsDashApi.AMapNs

import typings.amapDashJsDashApi.AMapNs.RectangleNs.Options
import typings.amapDashJsDashApi.PartialOptionsany
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("AMap.Rectangle")
@js.native
/**
  * 矩形
  * @param options 选项
  */
class Rectangle[ExtraData] () extends Polygon[ExtraData] {
  def this(options: Options[ExtraData]) = this()
  /**
    * 获取矩形范围
    * @param bounds 矩形的范围
    * @param preventEvent 阻止触发事件
    */
  def setBounds(bounds: Bounds): Unit = js.native
  def setBounds(bounds: Bounds, preventEvent: Boolean): Unit = js.native
  /**
    * 	修改矩形属性
    * @param options 属性
    */
  def setOptions(options: PartialOptionsany): Unit = js.native
}

