package typings.antvG2plot

import typings.antvG2plot.anon.PartialRingProgressOption
import typings.antvG2plot.plotMod.Plot
import typings.antvG2plot.ringProgressTypesMod.RingProgressOptions
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ringProgressMod {
  
  @JSImport("@antv/g2plot/lib/plots/ring-progress", "RingProgress")
  @js.native
  open class RingProgress protected () extends Plot[RingProgressOptions] {
    def this(container: String, options: RingProgressOptions) = this()
    def this(container: HTMLElement, options: RingProgressOptions) = this()
    
    /**
      * 更新数据
      * @param percent
      */
    def changeData(percent: Double): Unit = js.native
  }
  /* static members */
  object RingProgress {
    
    @JSImport("@antv/g2plot/lib/plots/ring-progress", "RingProgress")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * 获取默认配置项
      * 供外部使用
      */
    inline def getDefaultOptions(): PartialRingProgressOption = ^.asInstanceOf[js.Dynamic].applyDynamic("getDefaultOptions")().asInstanceOf[PartialRingProgressOption]
  }
}
