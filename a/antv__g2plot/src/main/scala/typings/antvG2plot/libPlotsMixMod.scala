package typings.antvG2plot

import typings.antvG2plot.libCorePlotMod.Plot
import typings.antvG2plot.libPlotsMixTypesMod.MixOptions
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libPlotsMixMod {
  
  @JSImport("@antv/g2plot/lib/plots/mix", "Mix")
  @js.native
  open class Mix protected () extends Plot[MixOptions] {
    def this(container: String, options: MixOptions) = this()
    def this(container: HTMLElement, options: MixOptions) = this()
  }
}
