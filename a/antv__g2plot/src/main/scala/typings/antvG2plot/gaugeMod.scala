package typings.antvG2plot

import typings.antvG2plot.anon.PartialGaugeOptions
import typings.antvG2plot.gaugeTypesMod.GaugeOptions
import typings.antvG2plot.plotMod.Plot
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object gaugeMod {
  
  @JSImport("@antv/g2plot/lib/plots/gauge", "Gauge")
  @js.native
  open class Gauge protected () extends Plot[GaugeOptions] {
    def this(container: String, options: GaugeOptions) = this()
    def this(container: HTMLElement, options: GaugeOptions) = this()
    
    /**
      * 更新数据
      * @param percent
      */
    def changeData(percent: Double): Unit = js.native
  }
  /* static members */
  object Gauge {
    
    @JSImport("@antv/g2plot/lib/plots/gauge", "Gauge")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * 获取 仪表盘 默认配置项
      * 供外部使用
      */
    inline def getDefaultOptions(): PartialGaugeOptions = ^.asInstanceOf[js.Dynamic].applyDynamic("getDefaultOptions")().asInstanceOf[PartialGaugeOptions]
  }
}
