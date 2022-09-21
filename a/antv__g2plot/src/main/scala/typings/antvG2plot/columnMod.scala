package typings.antvG2plot

import typings.antvG2plot.anon.PartialColumnOptions
import typings.antvG2plot.columnTypesMod.ColumnOptions
import typings.antvG2plot.plotMod.Plot
import typings.std.HTMLElement
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object columnMod {
  
  @JSImport("@antv/g2plot/lib/plots/column", "Column")
  @js.native
  open class Column protected () extends Plot[ColumnOptions] {
    def this(container: String, options: ColumnOptions) = this()
    def this(container: HTMLElement, options: ColumnOptions) = this()
    
    /**
      * @override
      */
    def changeData(data: js.Array[Record[String, Any]]): Unit = js.native
  }
  /* static members */
  object Column {
    
    @JSImport("@antv/g2plot/lib/plots/column", "Column")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * 获取 柱形图 默认配置项
      * 供外部使用
      */
    inline def getDefaultOptions(): PartialColumnOptions = ^.asInstanceOf[js.Dynamic].applyDynamic("getDefaultOptions")().asInstanceOf[PartialColumnOptions]
  }
}
