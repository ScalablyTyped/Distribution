package typings.antvG2plot

import typings.antvG2plot.libCoreAdaptorMod.Params
import typings.antvG2plot.libPlotsRadialBarTypesMod.RadialBarOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libPlotsRadialBarAdaptorMod {
  
  @JSImport("@antv/g2plot/lib/plots/radial-bar/adaptor", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def adaptor(params: Params[RadialBarOptions]): Params[RadialBarOptions] = ^.asInstanceOf[js.Dynamic].applyDynamic("adaptor")(params.asInstanceOf[js.Any]).asInstanceOf[Params[RadialBarOptions]]
  
  inline def axis(params: Params[RadialBarOptions]): Params[RadialBarOptions] = ^.asInstanceOf[js.Dynamic].applyDynamic("axis")(params.asInstanceOf[js.Any]).asInstanceOf[Params[RadialBarOptions]]
  
  inline def meta(params: Params[RadialBarOptions]): Params[RadialBarOptions] = ^.asInstanceOf[js.Dynamic].applyDynamic("meta")(params.asInstanceOf[js.Any]).asInstanceOf[Params[RadialBarOptions]]
}
