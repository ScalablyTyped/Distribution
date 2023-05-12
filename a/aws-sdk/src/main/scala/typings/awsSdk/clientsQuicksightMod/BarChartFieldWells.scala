package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BarChartFieldWells extends StObject {
  
  /**
    * The aggregated field wells of a bar chart.
    */
  var BarChartAggregatedFieldWells: js.UndefOr[typings.awsSdk.clientsQuicksightMod.BarChartAggregatedFieldWells] = js.undefined
}
object BarChartFieldWells {
  
  inline def apply(): BarChartFieldWells = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BarChartFieldWells]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BarChartFieldWells] (val x: Self) extends AnyVal {
    
    inline def setBarChartAggregatedFieldWells(value: BarChartAggregatedFieldWells): Self = StObject.set(x, "BarChartAggregatedFieldWells", value.asInstanceOf[js.Any])
    
    inline def setBarChartAggregatedFieldWellsUndefined: Self = StObject.set(x, "BarChartAggregatedFieldWells", js.undefined)
  }
}
