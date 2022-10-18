package typings.antvG2plot

import typings.antvG2plot.libCoreAdaptorMod.Params
import typings.antvG2plot.libPlotsVennTypesMod.VennOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libPlotsVennAdaptorMod {
  
  @JSImport("@antv/g2plot/lib/plots/venn/adaptor", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@antv/g2plot/lib/plots/venn/adaptor", "LEGEND_SPACE")
  @js.native
  val LEGEND_SPACE: /* 40 */ Double = js.native
  
  inline def adaptor(params: Params[VennOptions]): Params[VennOptions] = ^.asInstanceOf[js.Dynamic].applyDynamic("adaptor")(params.asInstanceOf[js.Any]).asInstanceOf[Params[VennOptions]]
  
  inline def axis(params: Params[VennOptions]): Params[VennOptions] = ^.asInstanceOf[js.Dynamic].applyDynamic("axis")(params.asInstanceOf[js.Any]).asInstanceOf[Params[VennOptions]]
  
  inline def legend(params: Params[VennOptions]): Params[VennOptions] = ^.asInstanceOf[js.Dynamic].applyDynamic("legend")(params.asInstanceOf[js.Any]).asInstanceOf[Params[VennOptions]]
}
