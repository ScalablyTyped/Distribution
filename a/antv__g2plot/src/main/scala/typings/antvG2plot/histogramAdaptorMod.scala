package typings.antvG2plot

import typings.antvG2plot.adaptorMod.Params
import typings.antvG2plot.histogramTypesMod.HistogramOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object histogramAdaptorMod {
  
  @JSImport("@antv/g2plot/lib/plots/histogram/adaptor", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def adaptor(params: Params[HistogramOptions]): Params[HistogramOptions] = ^.asInstanceOf[js.Dynamic].applyDynamic("adaptor")(params.asInstanceOf[js.Any]).asInstanceOf[Params[HistogramOptions]]
}
