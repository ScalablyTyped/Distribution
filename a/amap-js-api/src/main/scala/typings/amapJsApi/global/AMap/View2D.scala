package typings.amapJsApi.global.AMap

import typings.amapJsApi.AMap.View2D.Options
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("AMap.View2D")
@js.native
/**
  * 二维地图显示视口，用于定义二维地图静态显示属性
  * @param options 选项
  */
open class View2D ()
  extends StObject
     with typings.amapJsApi.AMap.EventEmitter {
  def this(options: Options) = this()
}
