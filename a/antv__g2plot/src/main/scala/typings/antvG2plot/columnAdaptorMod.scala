package typings.antvG2plot

import typings.antvG2plot.adaptorMod.Params
import typings.antvG2plot.columnTypesMod.ColumnOptions
import typings.antvG2plot.typesCommonMod.Options
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object columnAdaptorMod {
  
  @JSImport("@antv/g2plot/lib/plots/column/adaptor", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def adaptor(params: Params[ColumnOptions]): Params[Options] = ^.asInstanceOf[js.Dynamic].applyDynamic("adaptor")(params.asInstanceOf[js.Any]).asInstanceOf[Params[Options]]
  inline def adaptor(params: Params[ColumnOptions], isBar: Boolean): Params[Options] = (^.asInstanceOf[js.Dynamic].applyDynamic("adaptor")(params.asInstanceOf[js.Any], isBar.asInstanceOf[js.Any])).asInstanceOf[Params[Options]]
  
  inline def legend(params: Params[ColumnOptions]): Params[ColumnOptions] = ^.asInstanceOf[js.Dynamic].applyDynamic("legend")(params.asInstanceOf[js.Any]).asInstanceOf[Params[ColumnOptions]]
  
  inline def meta(params: Params[ColumnOptions]): Params[ColumnOptions] = ^.asInstanceOf[js.Dynamic].applyDynamic("meta")(params.asInstanceOf[js.Any]).asInstanceOf[Params[ColumnOptions]]
}
