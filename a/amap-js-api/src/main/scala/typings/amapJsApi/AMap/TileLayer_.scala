package typings.amapJsApi.AMap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TileLayer_ extends Layer {
  
  /**
    * 获取当前图层所有切片号
    */
  def getTiles(): js.Array[String] = js.native
  
  /**
    * 重新加载此图层
    */
  def reload(): Unit = js.native
  
  /**
    * 设置图层的取图地址
    * @param url 取图地址
    */
  def setTileUrl(url: String): Unit = js.native
  def setTileUrl(url: js.Function3[/* x */ Double, /* y */ Double, /* level */ Double, String]): Unit = js.native
}
