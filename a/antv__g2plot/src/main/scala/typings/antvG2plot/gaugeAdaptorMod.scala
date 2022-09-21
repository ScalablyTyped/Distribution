package typings.antvG2plot

import typings.antvG2plot.adaptorMod.Params
import typings.antvG2plot.gaugeTypesMod.GaugeOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object gaugeAdaptorMod {
  
  @JSImport("@antv/g2plot/lib/plots/gauge/adaptor", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def adaptor(params: Params[GaugeOptions]): Params[GaugeOptions] = ^.asInstanceOf[js.Dynamic].applyDynamic("adaptor")(params.asInstanceOf[js.Any]).asInstanceOf[Params[GaugeOptions]]
  
  /**
    * 统计指标文档
    * @param params
    */
  inline def statistic(params: Params[GaugeOptions]): Params[GaugeOptions] = ^.asInstanceOf[js.Dynamic].applyDynamic("statistic")(params.asInstanceOf[js.Any]).asInstanceOf[Params[GaugeOptions]]
  inline def statistic(params: Params[GaugeOptions], updated: Boolean): Params[GaugeOptions] = (^.asInstanceOf[js.Dynamic].applyDynamic("statistic")(params.asInstanceOf[js.Any], updated.asInstanceOf[js.Any])).asInstanceOf[Params[GaugeOptions]]
}
