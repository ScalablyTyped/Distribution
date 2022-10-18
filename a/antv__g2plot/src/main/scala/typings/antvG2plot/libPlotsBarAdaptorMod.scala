package typings.antvG2plot

import typings.antvG2plot.libCoreAdaptorMod.Params
import typings.antvG2plot.libPlotsBarTypesMod.BarOptions
import typings.antvG2plot.libPlotsColumnTypesMod.ColumnOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libPlotsBarAdaptorMod {
  
  @JSImport("@antv/g2plot/lib/plots/bar/adaptor", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def adaptor(params: Params[BarOptions]): Params[BarOptions] = ^.asInstanceOf[js.Dynamic].applyDynamic("adaptor")(params.asInstanceOf[js.Any]).asInstanceOf[Params[BarOptions]]
  
  inline def geometry(params: Params[BarOptions]): Params[BarOptions] = ^.asInstanceOf[js.Dynamic].applyDynamic("geometry")(params.asInstanceOf[js.Any]).asInstanceOf[Params[BarOptions]]
  
  inline def meta(params: Params[ColumnOptions]): Params[ColumnOptions] = ^.asInstanceOf[js.Dynamic].applyDynamic("meta")(params.asInstanceOf[js.Any]).asInstanceOf[Params[ColumnOptions]]
}
