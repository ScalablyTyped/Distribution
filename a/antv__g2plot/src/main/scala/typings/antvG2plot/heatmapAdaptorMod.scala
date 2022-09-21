package typings.antvG2plot

import typings.antvG2plot.adaptorMod.Params
import typings.antvG2plot.heatmapTypesMod.HeatmapOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object heatmapAdaptorMod {
  
  @JSImport("@antv/g2plot/lib/plots/heatmap/adaptor", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def adaptor(params: Params[HeatmapOptions]): Params[HeatmapOptions] = ^.asInstanceOf[js.Dynamic].applyDynamic("adaptor")(params.asInstanceOf[js.Any]).asInstanceOf[Params[HeatmapOptions]]
}
