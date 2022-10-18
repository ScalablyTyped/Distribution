package typings.antvG2plot.mod

import typings.antvG2plot.anon.PartialSankeyOptions
import typings.antvG2plot.libPlotsSankeyTypesMod.SankeyOptions
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@antv/g2plot", "Sankey")
@js.native
open class Sankey protected ()
  extends typings.antvG2plot.libPlotsSankeyMod.Sankey {
  def this(container: String, options: SankeyOptions) = this()
  def this(container: HTMLElement, options: SankeyOptions) = this()
}
/* static members */
object Sankey {
  
  @JSImport("@antv/g2plot", "Sankey")
  @js.native
  val ^ : js.Any = js.native
  
  inline def getDefaultOptions(): PartialSankeyOptions = ^.asInstanceOf[js.Dynamic].applyDynamic("getDefaultOptions")().asInstanceOf[PartialSankeyOptions]
}
