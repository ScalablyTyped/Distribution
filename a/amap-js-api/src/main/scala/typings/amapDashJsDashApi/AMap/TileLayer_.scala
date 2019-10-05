package typings.amapDashJsDashApi.AMap

import typings.amapDashJsDashApi.AMap.TileLayer.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("AMap.TileLayer")
@js.native
/**
  * 切片图层
  * @param options 图层选项
  */
class TileLayer_ () extends Layer {
  def this(options: Options) = this()
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

