package typings.antvG2plot

import typings.antvG2plot.anon.PartialFunnelOptions
import typings.antvG2plot.funnelTypesMod.FunnelOptions
import typings.antvG2plot.plotMod.Plot
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object funnelMod {
  
  @JSImport("@antv/g2plot/lib/plots/funnel", "FUNNEL_CONVERSATION_FIELD")
  @js.native
  val FUNNEL_CONVERSATION_FIELD: /* "$$conversion$$" */ String = js.native
  
  @JSImport("@antv/g2plot/lib/plots/funnel", "Funnel")
  @js.native
  open class Funnel protected () extends Plot[FunnelOptions] {
    def this(container: String, options: FunnelOptions) = this()
    def this(container: HTMLElement, options: FunnelOptions) = this()
  }
  /* static members */
  object Funnel {
    
    @JSImport("@antv/g2plot/lib/plots/funnel", "Funnel")
    @js.native
    val ^ : js.Any = js.native
    
    /** 漏斗 转化率 字段 */
    @JSImport("@antv/g2plot/lib/plots/funnel", "Funnel.CONVERSATION_FIELD")
    @js.native
    def CONVERSATION_FIELD: String = js.native
    inline def CONVERSATION_FIELD_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CONVERSATION_FIELD")(x.asInstanceOf[js.Any])
    
    /** 漏斗 百分比 字段 */
    @JSImport("@antv/g2plot/lib/plots/funnel", "Funnel.PERCENT_FIELD")
    @js.native
    def PERCENT_FIELD: String = js.native
    inline def PERCENT_FIELD_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PERCENT_FIELD")(x.asInstanceOf[js.Any])
    
    /** 漏斗 总转换率百分比 字段 */
    @JSImport("@antv/g2plot/lib/plots/funnel", "Funnel.TOTAL_PERCENT_FIELD")
    @js.native
    def TOTAL_PERCENT_FIELD: String = js.native
    inline def TOTAL_PERCENT_FIELD_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TOTAL_PERCENT_FIELD")(x.asInstanceOf[js.Any])
    
    inline def getDefaultOptions(): PartialFunnelOptions = ^.asInstanceOf[js.Dynamic].applyDynamic("getDefaultOptions")().asInstanceOf[PartialFunnelOptions]
  }
}
