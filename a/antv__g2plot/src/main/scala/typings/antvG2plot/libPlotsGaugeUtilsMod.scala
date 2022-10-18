package typings.antvG2plot

import typings.antvG2plot.libPlotsGaugeTypesMod.GaugeRangeData
import typings.antvG2plot.libPlotsGaugeTypesMod.Range
import typings.antvG2plot.libTypesCommonMod.Data
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libPlotsGaugeUtilsMod {
  
  @JSImport("@antv/g2plot/lib/plots/gauge/utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getIndicatorData(percent: Double): Data = ^.asInstanceOf[js.Dynamic].applyDynamic("getIndicatorData")(percent.asInstanceOf[js.Any]).asInstanceOf[Data]
  
  inline def getRangeData(percent: Double): GaugeRangeData = ^.asInstanceOf[js.Dynamic].applyDynamic("getRangeData")(percent.asInstanceOf[js.Any]).asInstanceOf[GaugeRangeData]
  inline def getRangeData(percent: Double, range: js.UndefOr[Range]): GaugeRangeData = (^.asInstanceOf[js.Dynamic].applyDynamic("getRangeData")(percent.asInstanceOf[js.Any], range.asInstanceOf[js.Any])).asInstanceOf[GaugeRangeData]
  
  inline def processRangeData(range: js.Array[Double], percent: Double): GaugeRangeData = (^.asInstanceOf[js.Dynamic].applyDynamic("processRangeData")(range.asInstanceOf[js.Any], percent.asInstanceOf[js.Any])).asInstanceOf[GaugeRangeData]
}
