package typings.antvG2plot

import typings.antvG2plot.anon.PartialRoseOptions
import typings.antvG2plot.plotMod.Plot
import typings.antvG2plot.roseTypesMod.RoseOptions
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object roseMod {
  
  @JSImport("@antv/g2plot/lib/plots/rose", "Rose")
  @js.native
  open class Rose protected () extends Plot[RoseOptions] {
    def this(container: String, options: RoseOptions) = this()
    def this(container: HTMLElement, options: RoseOptions) = this()
  }
  /* static members */
  object Rose {
    
    @JSImport("@antv/g2plot/lib/plots/rose", "Rose")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * 获取 玫瑰图 默认配置项
      * 供外部使用
      */
    inline def getDefaultOptions(): PartialRoseOptions = ^.asInstanceOf[js.Dynamic].applyDynamic("getDefaultOptions")().asInstanceOf[PartialRoseOptions]
  }
}
