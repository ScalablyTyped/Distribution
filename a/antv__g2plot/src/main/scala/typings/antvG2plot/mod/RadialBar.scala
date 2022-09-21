package typings.antvG2plot.mod

import typings.antvG2plot.anon.PartialRadialBarOptions
import typings.antvG2plot.radialBarTypesMod.RadialBarOptions
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@antv/g2plot", "RadialBar")
@js.native
open class RadialBar protected ()
  extends typings.antvG2plot.radialBarMod.RadialBar {
  def this(container: String, options: RadialBarOptions) = this()
  def this(container: HTMLElement, options: RadialBarOptions) = this()
}
/* static members */
object RadialBar {
  
  @JSImport("@antv/g2plot", "RadialBar")
  @js.native
  val ^ : js.Any = js.native
  
  inline def getDefaultOptions(): PartialRadialBarOptions = ^.asInstanceOf[js.Dynamic].applyDynamic("getDefaultOptions")().asInstanceOf[PartialRadialBarOptions]
}
