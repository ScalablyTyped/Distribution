package typings.antvG2plot.mod

import typings.antvG2plot.anon.PartialBarOptions
import typings.antvG2plot.barTypesMod.BarOptions
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@antv/g2plot", "Bar")
@js.native
open class Bar protected ()
  extends typings.antvG2plot.barMod.Bar {
  def this(container: String, options: BarOptions) = this()
  def this(container: HTMLElement, options: BarOptions) = this()
}
/* static members */
object Bar {
  
  @JSImport("@antv/g2plot", "Bar")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * 获取 条形图 默认配置项
    * 供外部使用
    */
  inline def getDefaultOptions(): PartialBarOptions = ^.asInstanceOf[js.Dynamic].applyDynamic("getDefaultOptions")().asInstanceOf[PartialBarOptions]
}
