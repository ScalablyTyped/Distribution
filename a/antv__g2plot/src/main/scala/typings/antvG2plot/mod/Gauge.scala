package typings.antvG2plot.mod

import typings.antvG2plot.anon.PartialGaugeOptions
import typings.antvG2plot.libPlotsGaugeTypesMod.GaugeOptions
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@antv/g2plot", "Gauge")
@js.native
open class Gauge protected ()
  extends typings.antvG2plot.libPlotsGaugeMod.Gauge {
  def this(container: String, options: GaugeOptions) = this()
  def this(container: HTMLElement, options: GaugeOptions) = this()
}
/* static members */
object Gauge {
  
  @JSImport("@antv/g2plot", "Gauge")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * 获取 仪表盘 默认配置项
    * 供外部使用
    */
  inline def getDefaultOptions(): PartialGaugeOptions = ^.asInstanceOf[js.Dynamic].applyDynamic("getDefaultOptions")().asInstanceOf[PartialGaugeOptions]
}
