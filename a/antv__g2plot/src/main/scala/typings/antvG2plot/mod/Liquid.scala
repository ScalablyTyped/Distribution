package typings.antvG2plot.mod

import typings.antvG2plot.anon.PartialLiquidOptions
import typings.antvG2plot.libPlotsLiquidTypesMod.LiquidOptions
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@antv/g2plot", "Liquid")
@js.native
open class Liquid protected ()
  extends typings.antvG2plot.libPlotsLiquidMod.Liquid {
  def this(container: String, options: LiquidOptions) = this()
  def this(container: HTMLElement, options: LiquidOptions) = this()
}
/* static members */
object Liquid {
  
  @JSImport("@antv/g2plot", "Liquid")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * 获取 饼图 默认配置项
    * 供外部使用
    */
  inline def getDefaultOptions(): PartialLiquidOptions = ^.asInstanceOf[js.Dynamic].applyDynamic("getDefaultOptions")().asInstanceOf[PartialLiquidOptions]
}
