package typings.antvG2plot

import typings.antvG2plot.libCoreAdaptorMod.Params
import typings.antvG2plot.libPlotsProgressTypesMod.ProgressOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libPlotsProgressAdaptorMod {
  
  @JSImport("@antv/g2plot/lib/plots/progress/adaptor", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def adaptor(params: Params[ProgressOptions]): Params[ProgressOptions] = ^.asInstanceOf[js.Dynamic].applyDynamic("adaptor")(params.asInstanceOf[js.Any]).asInstanceOf[Params[ProgressOptions]]
  
  inline def geometry(params: Params[ProgressOptions]): Params[ProgressOptions] = ^.asInstanceOf[js.Dynamic].applyDynamic("geometry")(params.asInstanceOf[js.Any]).asInstanceOf[Params[ProgressOptions]]
}
