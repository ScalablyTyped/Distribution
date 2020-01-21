package typings.amapJsApiScale.AMap

import typings.amapJsApi.AMap.EventEmitter
import typings.amapJsApi.AMap.Pixel
import typings.amapJsApiScale.AMap.Scale.Options
import typings.std.Position
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * 比例尺插件
  */
@JSGlobal("AMap.Scale")
@js.native
class Scale_ () extends EventEmitter {
  def this(options: Options) = this()
  /**
    * 相对于地图容器左上角的偏移量
    */
  var offset: Pixel = js.native
  /**
    * 控件停靠位置
    */
  var position: Position = js.native
  /**
    * 是否可见
    */
  var visible: Boolean = js.native
  /**
    * 隐藏比例尺
    */
  def hide(): Unit = js.native
  /**
    * 显示比例尺
    */
  def show(): Unit = js.native
}

