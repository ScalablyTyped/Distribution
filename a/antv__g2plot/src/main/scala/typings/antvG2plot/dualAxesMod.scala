package typings.antvG2plot

import typings.antvG2plot.dualAxesTypesMod.DualAxesOptions
import typings.antvG2plot.plotMod.Plot
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dualAxesMod {
  
  @JSImport("@antv/g2plot/lib/plots/dual-axes", "DualAxes")
  @js.native
  open class DualAxes protected () extends Plot[DualAxesOptions] {
    def this(container: String, options: DualAxesOptions) = this()
    def this(container: HTMLElement, options: DualAxesOptions) = this()
  }
}
