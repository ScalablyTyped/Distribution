package typings.antvG2plot.mod

import typings.antvG2plot.anon.PartialWaterfallOptions
import typings.antvG2plot.libPlotsWaterfallTypesMod.WaterfallOptions
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@antv/g2plot", "Waterfall")
@js.native
open class Waterfall protected ()
  extends typings.antvG2plot.libPlotsWaterfallMod.Waterfall {
  def this(container: String, options: WaterfallOptions) = this()
  def this(container: HTMLElement, options: WaterfallOptions) = this()
}
/* static members */
object Waterfall {
  
  @JSImport("@antv/g2plot", "Waterfall")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * 获取 瀑布图 默认配置项
    * 供外部使用
    */
  inline def getDefaultOptions(): PartialWaterfallOptions = ^.asInstanceOf[js.Dynamic].applyDynamic("getDefaultOptions")().asInstanceOf[PartialWaterfallOptions]
}
