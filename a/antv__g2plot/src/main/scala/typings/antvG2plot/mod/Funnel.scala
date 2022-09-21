package typings.antvG2plot.mod

import typings.antvG2plot.anon.PartialFunnelOptions
import typings.antvG2plot.funnelTypesMod.FunnelOptions
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@antv/g2plot", "Funnel")
@js.native
open class Funnel protected ()
  extends typings.antvG2plot.funnelMod.Funnel {
  def this(container: String, options: FunnelOptions) = this()
  def this(container: HTMLElement, options: FunnelOptions) = this()
}
/* static members */
object Funnel {
  
  @JSImport("@antv/g2plot", "Funnel")
  @js.native
  val ^ : js.Any = js.native
  
  /** 漏斗 转化率 字段 */
  @JSImport("@antv/g2plot", "Funnel.CONVERSATION_FIELD")
  @js.native
  def CONVERSATION_FIELD: String = js.native
  inline def CONVERSATION_FIELD_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CONVERSATION_FIELD")(x.asInstanceOf[js.Any])
  
  /** 漏斗 百分比 字段 */
  @JSImport("@antv/g2plot", "Funnel.PERCENT_FIELD")
  @js.native
  def PERCENT_FIELD: String = js.native
  inline def PERCENT_FIELD_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PERCENT_FIELD")(x.asInstanceOf[js.Any])
  
  /** 漏斗 总转换率百分比 字段 */
  @JSImport("@antv/g2plot", "Funnel.TOTAL_PERCENT_FIELD")
  @js.native
  def TOTAL_PERCENT_FIELD: String = js.native
  inline def TOTAL_PERCENT_FIELD_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TOTAL_PERCENT_FIELD")(x.asInstanceOf[js.Any])
  
  inline def getDefaultOptions(): PartialFunnelOptions = ^.asInstanceOf[js.Dynamic].applyDynamic("getDefaultOptions")().asInstanceOf[PartialFunnelOptions]
}
