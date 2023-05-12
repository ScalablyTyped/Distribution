package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PieChartFieldWells extends StObject {
  
  /**
    * The field well configuration of a pie chart.
    */
  var PieChartAggregatedFieldWells: js.UndefOr[typings.awsSdk.clientsQuicksightMod.PieChartAggregatedFieldWells] = js.undefined
}
object PieChartFieldWells {
  
  inline def apply(): PieChartFieldWells = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PieChartFieldWells]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PieChartFieldWells] (val x: Self) extends AnyVal {
    
    inline def setPieChartAggregatedFieldWells(value: PieChartAggregatedFieldWells): Self = StObject.set(x, "PieChartAggregatedFieldWells", value.asInstanceOf[js.Any])
    
    inline def setPieChartAggregatedFieldWellsUndefined: Self = StObject.set(x, "PieChartAggregatedFieldWells", js.undefined)
  }
}
