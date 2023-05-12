package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LineChartFieldWells extends StObject {
  
  /**
    * The field well configuration of a line chart.
    */
  var LineChartAggregatedFieldWells: js.UndefOr[typings.awsSdk.clientsQuicksightMod.LineChartAggregatedFieldWells] = js.undefined
}
object LineChartFieldWells {
  
  inline def apply(): LineChartFieldWells = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LineChartFieldWells]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LineChartFieldWells] (val x: Self) extends AnyVal {
    
    inline def setLineChartAggregatedFieldWells(value: LineChartAggregatedFieldWells): Self = StObject.set(x, "LineChartAggregatedFieldWells", value.asInstanceOf[js.Any])
    
    inline def setLineChartAggregatedFieldWellsUndefined: Self = StObject.set(x, "LineChartAggregatedFieldWells", js.undefined)
  }
}
