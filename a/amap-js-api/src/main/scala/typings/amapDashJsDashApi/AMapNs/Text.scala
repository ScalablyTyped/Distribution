package typings.amapDashJsDashApi.AMapNs

import typings.amapDashJsDashApi.AMapNs.TextNs.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("AMap.Text")
@js.native
/**
  * 纯文本标记
  * @param options 选项
  */
class Text[ExtraData] () extends Marker[ExtraData] {
  def this(options: Options) = this()
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

