package typings.antvG2plot

import typings.antvG2plot.libCorePlotMod.Plot
import typings.antvG2plot.libPlotsTemplateTypesMod.TemplateOptions
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libPlotsTemplateMod {
  
  @JSImport("@antv/g2plot/lib/plots/_template", "Template")
  @js.native
  open class Template protected () extends Plot[TemplateOptions] {
    def this(container: String, options: TemplateOptions) = this()
    def this(container: HTMLElement, options: TemplateOptions) = this()
  }
}
