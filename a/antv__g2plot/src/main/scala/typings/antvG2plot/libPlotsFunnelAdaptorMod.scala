package typings.antvG2plot

import typings.antvG2plot.libCoreAdaptorMod.Params
import typings.antvG2plot.libPlotsFunnelTypesMod.FunnelOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libPlotsFunnelAdaptorMod {
  
  @JSImport("@antv/g2plot/lib/plots/funnel/adaptor", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def adaptor(params: Params[FunnelOptions]): Params[FunnelOptions] = ^.asInstanceOf[js.Dynamic].applyDynamic("adaptor")(params.asInstanceOf[js.Any]).asInstanceOf[Params[FunnelOptions]]
  
  inline def meta(params: Params[FunnelOptions]): Params[FunnelOptions] = ^.asInstanceOf[js.Dynamic].applyDynamic("meta")(params.asInstanceOf[js.Any]).asInstanceOf[Params[FunnelOptions]]
}
