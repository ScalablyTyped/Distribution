package typings.antvG2plot

import typings.antvG2plot.anon.PickLineOptionsisStack
import typings.antvG2plot.libCoreAdaptorMod.Params
import typings.antvG2plot.libPlotsLineTypesMod.LineOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libPlotsLineAdaptorMod {
  
  @JSImport("@antv/g2plot/lib/plots/line/adaptor", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def adaptor(params: Params[LineOptions]): Params[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("adaptor")(params.asInstanceOf[js.Any]).asInstanceOf[Params[Any]]
  
  inline def adjust(params: Params[PickLineOptionsisStack]): Params[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("adjust")(params.asInstanceOf[js.Any]).asInstanceOf[Params[Any]]
  
  inline def axis(params: Params[LineOptions]): Params[LineOptions] = ^.asInstanceOf[js.Dynamic].applyDynamic("axis")(params.asInstanceOf[js.Any]).asInstanceOf[Params[LineOptions]]
  
  inline def legend(params: Params[LineOptions]): Params[LineOptions] = ^.asInstanceOf[js.Dynamic].applyDynamic("legend")(params.asInstanceOf[js.Any]).asInstanceOf[Params[LineOptions]]
  
  inline def meta(params: Params[LineOptions]): Params[LineOptions] = ^.asInstanceOf[js.Dynamic].applyDynamic("meta")(params.asInstanceOf[js.Any]).asInstanceOf[Params[LineOptions]]
}
