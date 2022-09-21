package typings.antvG2plot

import typings.antvG2plot.adaptorMod.Params
import typings.antvG2plot.lineTypesMod.LineOptions
import typings.antvG2plot.typesCommonMod.Options
import typings.antvG2plot.typesMod.AreaOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object areaAdaptorMod {
  
  @JSImport("@antv/g2plot/lib/plots/area/adaptor", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def adaptor(params: Params[AreaOptions]): Params[Options] = ^.asInstanceOf[js.Dynamic].applyDynamic("adaptor")(params.asInstanceOf[js.Any]).asInstanceOf[Params[Options]]
  
  inline def meta(params: Params[LineOptions]): Params[LineOptions] = ^.asInstanceOf[js.Dynamic].applyDynamic("meta")(params.asInstanceOf[js.Any]).asInstanceOf[Params[LineOptions]]
}
