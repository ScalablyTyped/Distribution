package typings.amapJsApi.AMap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Text_[ExtraData] extends Marker[ExtraData] {
  /**
    * 标记显示的文本内容
    */
  def getText(): String = js.native
  /**
    * 设置文本样式
    * @param style 文本样式
    */
  def setStyle(style: js.Object): Unit = js.native
  /**
    * 修改文本内容
    * @param text 文本内容
    */
  def setText(text: String): Unit = js.native
}

