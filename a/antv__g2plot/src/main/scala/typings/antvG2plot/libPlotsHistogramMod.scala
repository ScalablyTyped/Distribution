package typings.antvG2plot

import typings.antvG2plot.anon.PartialHistogramOptions
import typings.antvG2plot.libCorePlotMod.Plot
import typings.antvG2plot.libPlotsHistogramTypesMod.HistogramOptions
import typings.std.HTMLElement
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libPlotsHistogramMod {
  
  @JSImport("@antv/g2plot/lib/plots/histogram", "Histogram")
  @js.native
  open class Histogram protected () extends Plot[HistogramOptions] {
    def this(container: String, options: HistogramOptions) = this()
    def this(container: HTMLElement, options: HistogramOptions) = this()
    
    def changeData(data: js.Array[Record[String, Any]]): Unit = js.native
  }
  /* static members */
  object Histogram {
    
    @JSImport("@antv/g2plot/lib/plots/histogram", "Histogram")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * 获取 默认配置项
      * 供外部使用
      */
    inline def getDefaultOptions(): PartialHistogramOptions = ^.asInstanceOf[js.Dynamic].applyDynamic("getDefaultOptions")().asInstanceOf[PartialHistogramOptions]
  }
}
