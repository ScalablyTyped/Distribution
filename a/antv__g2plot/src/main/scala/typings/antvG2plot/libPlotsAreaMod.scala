package typings.antvG2plot

import typings.antvG2plot.anon.PartialAreaOptions
import typings.antvG2plot.libCorePlotMod.Plot
import typings.antvG2plot.libPlotsAreaTypesMod.AreaOptions
import typings.std.HTMLElement
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libPlotsAreaMod {
  
  @JSImport("@antv/g2plot/lib/plots/area", "Area")
  @js.native
  open class Area protected () extends Plot[AreaOptions] {
    def this(container: String, options: AreaOptions) = this()
    def this(container: HTMLElement, options: AreaOptions) = this()
    
    /**
      * @override
      * @param data
      */
    def changeData(data: js.Array[Record[String, Any]]): Unit = js.native
  }
  /* static members */
  object Area {
    
    @JSImport("@antv/g2plot/lib/plots/area", "Area")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * 获取 面积图 默认配置项
      * 供外部使用
      */
    inline def getDefaultOptions(): PartialAreaOptions = ^.asInstanceOf[js.Dynamic].applyDynamic("getDefaultOptions")().asInstanceOf[PartialAreaOptions]
  }
}
