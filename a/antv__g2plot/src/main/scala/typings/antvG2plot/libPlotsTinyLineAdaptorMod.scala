package typings.antvG2plot

import typings.antvG2plot.libCoreAdaptorMod.Params
import typings.antvG2plot.libPlotsTinyAreaTypesMod.TinyAreaOptions
import typings.antvG2plot.libPlotsTinyLineTypesMod.TinyLineOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libPlotsTinyLineAdaptorMod {
  
  @JSImport("@antv/g2plot/lib/plots/tiny-line/adaptor", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def adaptor(params: Params[TinyLineOptions]): Params[TinyLineOptions] = ^.asInstanceOf[js.Dynamic].applyDynamic("adaptor")(params.asInstanceOf[js.Any]).asInstanceOf[Params[TinyLineOptions]]
  
  inline def meta(params: Params[TinyAreaOptions]): Params[TinyAreaOptions] = ^.asInstanceOf[js.Dynamic].applyDynamic("meta")(params.asInstanceOf[js.Any]).asInstanceOf[Params[TinyAreaOptions]]
}
