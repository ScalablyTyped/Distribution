package typings.antvG2plot

import typings.antvG2plot.adaptorMod.Params
import typings.antvG2plot.funnelTypesMod.FunnelOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object compareMod {
  
  @JSImport("@antv/g2plot/lib/plots/funnel/geometries/compare", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def compareFunnel(params: Params[FunnelOptions]): Params[FunnelOptions] = ^.asInstanceOf[js.Dynamic].applyDynamic("compareFunnel")(params.asInstanceOf[js.Any]).asInstanceOf[Params[FunnelOptions]]
}
