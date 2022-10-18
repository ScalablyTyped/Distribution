package typings.antvG2plot.mod

import typings.antvG2plot.anon.PartialPieOptions
import typings.antvG2plot.libPlotsPieTypesMod.PieOptions
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@antv/g2plot", "Pie")
@js.native
open class Pie protected ()
  extends typings.antvG2plot.libPlotsPieMod.Pie {
  def this(container: String, options: PieOptions) = this()
  def this(container: HTMLElement, options: PieOptions) = this()
}
/* static members */
object Pie {
  
  @JSImport("@antv/g2plot", "Pie")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * 获取 饼图 默认配置项
    * 供外部使用
    */
  inline def getDefaultOptions(): PartialPieOptions = ^.asInstanceOf[js.Dynamic].applyDynamic("getDefaultOptions")().asInstanceOf[PartialPieOptions]
}
