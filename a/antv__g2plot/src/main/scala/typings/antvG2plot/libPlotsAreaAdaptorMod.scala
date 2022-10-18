package typings.antvG2plot

import typings.antvG2plot.libCoreAdaptorMod.Params
import typings.antvG2plot.libPlotsAreaTypesMod.AreaOptions
import typings.antvG2plot.libPlotsLineTypesMod.LineOptions
import typings.antvG2plot.libTypesCommonMod.Options
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libPlotsAreaAdaptorMod {
  
  @JSImport("@antv/g2plot/lib/plots/area/adaptor", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def adaptor(params: Params[AreaOptions]): Params[Options] = ^.asInstanceOf[js.Dynamic].applyDynamic("adaptor")(params.asInstanceOf[js.Any]).asInstanceOf[Params[Options]]
  
  inline def meta(params: Params[LineOptions]): Params[LineOptions] = ^.asInstanceOf[js.Dynamic].applyDynamic("meta")(params.asInstanceOf[js.Any]).asInstanceOf[Params[LineOptions]]
}
