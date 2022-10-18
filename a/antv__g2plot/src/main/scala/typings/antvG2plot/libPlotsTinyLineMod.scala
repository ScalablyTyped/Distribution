package typings.antvG2plot

import typings.antvG2plot.anon.PartialTinyLineOptions
import typings.antvG2plot.libCorePlotMod.Plot
import typings.antvG2plot.libPlotsTinyLineTypesMod.TinyLineOptions
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libPlotsTinyLineMod {
  
  @JSImport("@antv/g2plot/lib/plots/tiny-line", "TinyLine")
  @js.native
  open class TinyLine protected () extends Plot[TinyLineOptions] {
    def this(container: String, options: TinyLineOptions) = this()
    def this(container: HTMLElement, options: TinyLineOptions) = this()
    
    /**
      * @override
      * @param data
      */
    def changeData(data: js.Array[Double]): Unit = js.native
  }
  /* static members */
  object TinyLine {
    
    @JSImport("@antv/g2plot/lib/plots/tiny-line", "TinyLine")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * 获取默认配置项
      * 供外部使用
      */
    inline def getDefaultOptions(): PartialTinyLineOptions = ^.asInstanceOf[js.Dynamic].applyDynamic("getDefaultOptions")().asInstanceOf[PartialTinyLineOptions]
  }
}
