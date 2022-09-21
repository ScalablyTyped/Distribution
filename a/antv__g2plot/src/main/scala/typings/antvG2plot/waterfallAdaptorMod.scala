package typings.antvG2plot

import typings.antvG2plot.adaptorMod.Params
import typings.antvG2plot.waterfallTypesMod.WaterfallOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object waterfallAdaptorMod {
  
  @JSImport("@antv/g2plot/lib/plots/waterfall/adaptor", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def adaptor(params: Params[WaterfallOptions]): Params[WaterfallOptions] = ^.asInstanceOf[js.Dynamic].applyDynamic("adaptor")(params.asInstanceOf[js.Any]).asInstanceOf[Params[WaterfallOptions]]
  
  inline def tooltip(params: Params[WaterfallOptions]): Params[WaterfallOptions] = ^.asInstanceOf[js.Dynamic].applyDynamic("tooltip")(params.asInstanceOf[js.Any]).asInstanceOf[Params[WaterfallOptions]]
}
