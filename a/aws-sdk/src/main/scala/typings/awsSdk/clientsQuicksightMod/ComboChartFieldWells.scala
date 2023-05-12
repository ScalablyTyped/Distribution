package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ComboChartFieldWells extends StObject {
  
  /**
    * The aggregated field wells of a combo chart. Combo charts only have aggregated field wells. Columns in a combo chart are aggregated by category.
    */
  var ComboChartAggregatedFieldWells: js.UndefOr[typings.awsSdk.clientsQuicksightMod.ComboChartAggregatedFieldWells] = js.undefined
}
object ComboChartFieldWells {
  
  inline def apply(): ComboChartFieldWells = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ComboChartFieldWells]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ComboChartFieldWells] (val x: Self) extends AnyVal {
    
    inline def setComboChartAggregatedFieldWells(value: ComboChartAggregatedFieldWells): Self = StObject.set(x, "ComboChartAggregatedFieldWells", value.asInstanceOf[js.Any])
    
    inline def setComboChartAggregatedFieldWellsUndefined: Self = StObject.set(x, "ComboChartAggregatedFieldWells", js.undefined)
  }
}
