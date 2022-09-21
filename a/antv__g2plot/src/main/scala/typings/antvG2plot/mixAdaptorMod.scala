package typings.antvG2plot

import typings.antvG2plot.adaptorMod.Params
import typings.antvG2plot.mixTypesMod.MixOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mixAdaptorMod {
  
  @JSImport("@antv/g2plot/lib/plots/mix/adaptor", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def adaptor(params: Params[MixOptions]): Params[MixOptions] = ^.asInstanceOf[js.Dynamic].applyDynamic("adaptor")(params.asInstanceOf[js.Any]).asInstanceOf[Params[MixOptions]]
  
  inline def slider(params: Params[MixOptions]): Params[MixOptions] = ^.asInstanceOf[js.Dynamic].applyDynamic("slider")(params.asInstanceOf[js.Any]).asInstanceOf[Params[MixOptions]]
}
