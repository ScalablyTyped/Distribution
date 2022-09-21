package typings.antvG2plot

import typings.antvG2plot.adaptorMod.Params
import typings.antvG2plot.progressTypesMod.ProgressOptions
import typings.antvG2plot.ringProgressTypesMod.RingProgressOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ringProgressAdaptorMod {
  
  @JSImport("@antv/g2plot/lib/plots/ring-progress/adaptor", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def adaptor(params: Params[RingProgressOptions]): Params[ProgressOptions] = ^.asInstanceOf[js.Dynamic].applyDynamic("adaptor")(params.asInstanceOf[js.Any]).asInstanceOf[Params[ProgressOptions]]
  
  inline def statistic(params: Params[RingProgressOptions]): Params[RingProgressOptions] = ^.asInstanceOf[js.Dynamic].applyDynamic("statistic")(params.asInstanceOf[js.Any]).asInstanceOf[Params[RingProgressOptions]]
  inline def statistic(params: Params[RingProgressOptions], updated: Boolean): Params[RingProgressOptions] = (^.asInstanceOf[js.Dynamic].applyDynamic("statistic")(params.asInstanceOf[js.Any], updated.asInstanceOf[js.Any])).asInstanceOf[Params[RingProgressOptions]]
}
