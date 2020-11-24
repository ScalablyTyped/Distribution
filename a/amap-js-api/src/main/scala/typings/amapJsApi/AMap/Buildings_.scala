package typings.amapJsApi.AMap

import typings.amapJsApi.AMap.Buildings.Style
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Buildings_ extends Layer {
  
  /**
    * 按区域设置楼块的颜色
    * @param style 颜色设置
    */
  def setStyle(style: Style): Unit = js.native
}
