package typings.antvG2plot

import typings.antvG2plot.anon.PartialProgressOptions
import typings.antvG2plot.libCorePlotMod.Plot
import typings.antvG2plot.libPlotsProgressTypesMod.ProgressOptions
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libPlotsProgressMod {
  
  @JSImport("@antv/g2plot/lib/plots/progress", "Progress")
  @js.native
  open class Progress protected () extends Plot[ProgressOptions] {
    def this(container: String, options: ProgressOptions) = this()
    def this(container: HTMLElement, options: ProgressOptions) = this()
    
    /**
      * 更新数据
      * @param percent
      */
    def changeData(percent: Double): Unit = js.native
  }
  /* static members */
  object Progress {
    
    @JSImport("@antv/g2plot/lib/plots/progress", "Progress")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * 获取 仪表盘 默认配置项
      * 供外部使用
      */
    inline def getDefaultOptions(): PartialProgressOptions = ^.asInstanceOf[js.Dynamic].applyDynamic("getDefaultOptions")().asInstanceOf[PartialProgressOptions]
  }
}
