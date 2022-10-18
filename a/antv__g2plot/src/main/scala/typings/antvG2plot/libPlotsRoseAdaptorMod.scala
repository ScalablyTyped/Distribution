package typings.antvG2plot

import typings.antvG2plot.libCoreAdaptorMod.Params
import typings.antvG2plot.libPlotsRoseTypesMod.RoseOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libPlotsRoseAdaptorMod {
  
  @JSImport("@antv/g2plot/lib/plots/rose/adaptor", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def adaptor(params: Params[RoseOptions]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("adaptor")(params.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def legend(params: Params[RoseOptions]): Params[RoseOptions] = ^.asInstanceOf[js.Dynamic].applyDynamic("legend")(params.asInstanceOf[js.Any]).asInstanceOf[Params[RoseOptions]]
}
