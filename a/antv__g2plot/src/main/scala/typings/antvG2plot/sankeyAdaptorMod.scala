package typings.antvG2plot

import typings.antvG2plot.adaptorMod.Params
import typings.antvG2plot.sankeyTypesMod.SankeyOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sankeyAdaptorMod {
  
  @JSImport("@antv/g2plot/lib/plots/sankey/adaptor", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def adaptor(params: Params[SankeyOptions]): Params[SankeyOptions] = ^.asInstanceOf[js.Dynamic].applyDynamic("adaptor")(params.asInstanceOf[js.Any]).asInstanceOf[Params[SankeyOptions]]
  
  inline def animation(params: Params[SankeyOptions]): Params[SankeyOptions] = ^.asInstanceOf[js.Dynamic].applyDynamic("animation")(params.asInstanceOf[js.Any]).asInstanceOf[Params[SankeyOptions]]
  
  inline def nodeDraggable(params: Params[SankeyOptions]): Params[SankeyOptions] = ^.asInstanceOf[js.Dynamic].applyDynamic("nodeDraggable")(params.asInstanceOf[js.Any]).asInstanceOf[Params[SankeyOptions]]
}
