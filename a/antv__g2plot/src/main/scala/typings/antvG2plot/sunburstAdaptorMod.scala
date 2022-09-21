package typings.antvG2plot

import typings.antvG2plot.adaptorMod.Params
import typings.antvG2plot.sunburstTypesMod.SunburstOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sunburstAdaptorMod {
  
  @JSImport("@antv/g2plot/lib/plots/sunburst/adaptor", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def adaptor(params: Params[SunburstOptions]): Params[SunburstOptions] = ^.asInstanceOf[js.Dynamic].applyDynamic("adaptor")(params.asInstanceOf[js.Any]).asInstanceOf[Params[SunburstOptions]]
  
  inline def axis(params: Params[SunburstOptions]): Params[SunburstOptions] = ^.asInstanceOf[js.Dynamic].applyDynamic("axis")(params.asInstanceOf[js.Any]).asInstanceOf[Params[SunburstOptions]]
  
  inline def meta(params: Params[SunburstOptions]): Params[SunburstOptions] = ^.asInstanceOf[js.Dynamic].applyDynamic("meta")(params.asInstanceOf[js.Any]).asInstanceOf[Params[SunburstOptions]]
  
  inline def tooltip(params: Params[SunburstOptions]): Params[SunburstOptions] = ^.asInstanceOf[js.Dynamic].applyDynamic("tooltip")(params.asInstanceOf[js.Any]).asInstanceOf[Params[SunburstOptions]]
}
