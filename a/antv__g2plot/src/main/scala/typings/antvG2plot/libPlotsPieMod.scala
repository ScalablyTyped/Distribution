package typings.antvG2plot

import typings.antvG2plot.anon.PartialPieOptions
import typings.antvG2plot.libCorePlotMod.Plot
import typings.antvG2plot.libPlotsPieTypesMod.PieOptions
import typings.std.HTMLElement
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libPlotsPieMod {
  
  @JSImport("@antv/g2plot/lib/plots/pie", "Pie")
  @js.native
  open class Pie protected () extends Plot[PieOptions] {
    def this(container: String, options: PieOptions) = this()
    def this(container: HTMLElement, options: PieOptions) = this()
    
    /**
      * 更新数据
      * @param data
      */
    def changeData(data: js.Array[Record[String, Any]]): Unit = js.native
  }
  /* static members */
  object Pie {
    
    @JSImport("@antv/g2plot/lib/plots/pie", "Pie")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * 获取 饼图 默认配置项
      * 供外部使用
      */
    inline def getDefaultOptions(): PartialPieOptions = ^.asInstanceOf[js.Dynamic].applyDynamic("getDefaultOptions")().asInstanceOf[PartialPieOptions]
  }
}
