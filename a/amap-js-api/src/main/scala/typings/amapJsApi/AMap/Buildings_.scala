package typings.amapJsApi.AMap

import typings.amapJsApi.AMap.Buildings.Options
import typings.amapJsApi.AMap.Buildings.Style
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("AMap.Buildings")
@js.native
/**
  * 楼块图层，单独展示矢量化的楼块图层
  * @param opts 图层选项
  */
class Buildings_ () extends Layer {
  def this(opts: Options) = this()
  /**
    * 按区域设置楼块的颜色
    * @param style 颜色设置
    */
  def setStyle(style: Style): Unit = js.native
}

