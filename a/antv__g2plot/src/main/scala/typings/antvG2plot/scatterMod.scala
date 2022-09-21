package typings.antvG2plot

import typings.antvG2plot.anon.PartialScatterOptions
import typings.antvG2plot.plotMod.Plot
import typings.antvG2plot.scatterTypesMod.ScatterOptions
import typings.std.HTMLElement
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object scatterMod {
  
  @JSImport("@antv/g2plot/lib/plots/scatter", "Scatter")
  @js.native
  open class Scatter protected () extends Plot[ScatterOptions] {
    def this(container: String, options: ScatterOptions) = this()
    def this(container: HTMLElement, options: ScatterOptions) = this()
    
    /**
      * @override
      * @param data
      */
    def changeData(data: js.Array[Record[String, Any]]): Unit = js.native
  }
  /* static members */
  object Scatter {
    
    @JSImport("@antv/g2plot/lib/plots/scatter", "Scatter")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * 获取 散点图 默认配置项
      * 供外部使用
      */
    inline def getDefaultOptions(): PartialScatterOptions = ^.asInstanceOf[js.Dynamic].applyDynamic("getDefaultOptions")().asInstanceOf[PartialScatterOptions]
  }
}
