package typings.antvG2plot

import typings.antvG2plot.anon.PartialLineOptions
import typings.antvG2plot.libCorePlotMod.Plot
import typings.antvG2plot.libPlotsLineTypesMod.LineOptions
import typings.std.HTMLElement
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libPlotsLineMod {
  
  @JSImport("@antv/g2plot/lib/plots/line", "Line")
  @js.native
  open class Line protected () extends Plot[LineOptions] {
    def this(container: String, options: LineOptions) = this()
    def this(container: HTMLElement, options: LineOptions) = this()
    
    /**
      * @override
      * @param data
      */
    def changeData(data: js.Array[Record[String, Any]]): Unit = js.native
  }
  /* static members */
  object Line {
    
    @JSImport("@antv/g2plot/lib/plots/line", "Line")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * 获取 折线图 默认配置项
      * 供外部使用
      */
    inline def getDefaultOptions(): PartialLineOptions = ^.asInstanceOf[js.Dynamic].applyDynamic("getDefaultOptions")().asInstanceOf[PartialLineOptions]
  }
}
