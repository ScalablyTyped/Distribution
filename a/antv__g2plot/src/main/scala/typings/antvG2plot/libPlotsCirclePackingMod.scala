package typings.antvG2plot

import typings.antvG2plot.anon.PartialCirclePackingOptio
import typings.antvG2plot.libCorePlotMod.Plot
import typings.antvG2plot.libPlotsCirclePackingTypesMod.CirclePackingOptions
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libPlotsCirclePackingMod {
  
  @JSImport("@antv/g2plot/lib/plots/circle-packing", "CirclePacking")
  @js.native
  open class CirclePacking protected () extends Plot[CirclePackingOptions] {
    def this(container: String, options: CirclePackingOptions) = this()
    def this(container: HTMLElement, options: CirclePackingOptions) = this()
  }
  /* static members */
  object CirclePacking {
    
    @JSImport("@antv/g2plot/lib/plots/circle-packing", "CirclePacking")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * 获取 面积图 默认配置项
      * 供外部使用
      */
    inline def getDefaultOptions(): PartialCirclePackingOptio = ^.asInstanceOf[js.Dynamic].applyDynamic("getDefaultOptions")().asInstanceOf[PartialCirclePackingOptio]
  }
}
