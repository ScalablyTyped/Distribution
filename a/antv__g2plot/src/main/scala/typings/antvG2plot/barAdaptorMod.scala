package typings.antvG2plot

import typings.antvG2plot.adaptorMod.Params
import typings.antvG2plot.barTypesMod.BarOptions
import typings.antvG2plot.columnTypesMod.ColumnOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object barAdaptorMod {
  
  @JSImport("@antv/g2plot/lib/plots/bar/adaptor", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def adaptor(params: Params[BarOptions]): Params[BarOptions] = ^.asInstanceOf[js.Dynamic].applyDynamic("adaptor")(params.asInstanceOf[js.Any]).asInstanceOf[Params[BarOptions]]
  
  inline def geometry(params: Params[BarOptions]): Params[BarOptions] = ^.asInstanceOf[js.Dynamic].applyDynamic("geometry")(params.asInstanceOf[js.Any]).asInstanceOf[Params[BarOptions]]
  
  inline def meta(params: Params[ColumnOptions]): Params[ColumnOptions] = ^.asInstanceOf[js.Dynamic].applyDynamic("meta")(params.asInstanceOf[js.Any]).asInstanceOf[Params[ColumnOptions]]
}
