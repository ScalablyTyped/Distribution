package typings.antvG2plot

import typings.antvG2plot.adaptorMod.Params
import typings.antvG2plot.circlePackingTypesMod.CirclePackingOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object circlePackingAdaptorMod {
  
  @JSImport("@antv/g2plot/lib/plots/circle-packing/adaptor", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def adaptor(params: Params[CirclePackingOptions]): Params[CirclePackingOptions] = ^.asInstanceOf[js.Dynamic].applyDynamic("adaptor")(params.asInstanceOf[js.Any]).asInstanceOf[Params[CirclePackingOptions]]
  
  inline def meta(params: Params[CirclePackingOptions]): Params[CirclePackingOptions] = ^.asInstanceOf[js.Dynamic].applyDynamic("meta")(params.asInstanceOf[js.Any]).asInstanceOf[Params[CirclePackingOptions]]
}
