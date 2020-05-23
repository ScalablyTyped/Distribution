package typings.amapJsApi.AMap

import typings.amapJsApi.anon.PartialOptionsany
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Rectangle_[ExtraData] extends Polygon[ExtraData] {
  /**
    * 获取矩形范围
    * @param bounds 矩形的范围
    * @param preventEvent 阻止触发事件
    */
  def setBounds(bounds: Bounds): Unit = js.native
  def setBounds(bounds: Bounds, preventEvent: Boolean): Unit = js.native
  /**
    *     修改矩形属性
    * @param options 属性
    */
  def setOptions(options: PartialOptionsany): Unit = js.native
}

