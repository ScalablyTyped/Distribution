package typings.antvG2plot

import typings.antvG2plot.libCoreAdaptorMod.Params
import typings.antvG2plot.libPlotsLiquidTypesMod.LiquidOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libPlotsLiquidAdaptorMod {
  
  @JSImport("@antv/g2plot/lib/plots/liquid/adaptor", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def adaptor(params: Params[LiquidOptions]): Params[LiquidOptions] = ^.asInstanceOf[js.Dynamic].applyDynamic("adaptor")(params.asInstanceOf[js.Any]).asInstanceOf[Params[LiquidOptions]]
  
  inline def statistic(params: Params[LiquidOptions]): Params[LiquidOptions] = ^.asInstanceOf[js.Dynamic].applyDynamic("statistic")(params.asInstanceOf[js.Any]).asInstanceOf[Params[LiquidOptions]]
  inline def statistic(params: Params[LiquidOptions], updated: Boolean): Params[LiquidOptions] = (^.asInstanceOf[js.Dynamic].applyDynamic("statistic")(params.asInstanceOf[js.Any], updated.asInstanceOf[js.Any])).asInstanceOf[Params[LiquidOptions]]
}
