package typings.antvG2plot

import typings.antvG2plot.libCoreAdaptorMod.Params
import typings.antvG2plot.libPlotsScatterTypesMod.ScatterOptions
import typings.antvG2plot.libTypesCommonMod.Options
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libPlotsScatterAdaptorMod {
  
  @JSImport("@antv/g2plot/lib/plots/scatter/adaptor", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def adaptor(params: Params[ScatterOptions]): Params[Options] = ^.asInstanceOf[js.Dynamic].applyDynamic("adaptor")(params.asInstanceOf[js.Any]).asInstanceOf[Params[Options]]
  
  inline def meta(params: Params[ScatterOptions]): Params[ScatterOptions] = ^.asInstanceOf[js.Dynamic].applyDynamic("meta")(params.asInstanceOf[js.Any]).asInstanceOf[Params[ScatterOptions]]
  
  inline def tooltip(params: Params[ScatterOptions]): Params[ScatterOptions] = ^.asInstanceOf[js.Dynamic].applyDynamic("tooltip")(params.asInstanceOf[js.Any]).asInstanceOf[Params[ScatterOptions]]
  
  inline def transformOptions(options: ScatterOptions): ScatterOptions = ^.asInstanceOf[js.Dynamic].applyDynamic("transformOptions")(options.asInstanceOf[js.Any]).asInstanceOf[ScatterOptions]
}
