package typings.amapJsApiScale.AMap

import typings.amapJsApi.AMap.EventEmitter
import typings.amapJsApi.AMap.Pixel
import typings.amapJsApiScale.AMap.Scale.Position
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * 比例尺插件
  */
@js.native
trait Scale_ extends EventEmitter {
  
  /**
    * 隐藏比例尺
    */
  def hide(): Unit = js.native
  
  /**
    * 相对于地图容器左上角的偏移量
    */
  var offset: Pixel = js.native
  
  /**
    * 控件停靠位置
    */
  var position: Position = js.native
  
  /**
    * 显示比例尺
    */
  def show(): Unit = js.native
  
  /**
    * 是否可见
    */
  var visible: Boolean = js.native
}
