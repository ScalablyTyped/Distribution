package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FunnelChartAggregatedFieldWells extends StObject {
  
  /**
    * The category field wells of a funnel chart. Values are grouped by category fields.
    */
  var Category: js.UndefOr[FunnelChartDimensionFieldList] = js.undefined
  
  /**
    * The value field wells of a funnel chart. Values are aggregated based on categories.
    */
  var Values: js.UndefOr[FunnelChartMeasureFieldList] = js.undefined
}
object FunnelChartAggregatedFieldWells {
  
  inline def apply(): FunnelChartAggregatedFieldWells = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FunnelChartAggregatedFieldWells]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FunnelChartAggregatedFieldWells] (val x: Self) extends AnyVal {
    
    inline def setCategory(value: FunnelChartDimensionFieldList): Self = StObject.set(x, "Category", value.asInstanceOf[js.Any])
    
    inline def setCategoryUndefined: Self = StObject.set(x, "Category", js.undefined)
    
    inline def setCategoryVarargs(value: DimensionField*): Self = StObject.set(x, "Category", js.Array(value*))
    
    inline def setValues(value: FunnelChartMeasureFieldList): Self = StObject.set(x, "Values", value.asInstanceOf[js.Any])
    
    inline def setValuesUndefined: Self = StObject.set(x, "Values", js.undefined)
    
    inline def setValuesVarargs(value: MeasureField*): Self = StObject.set(x, "Values", js.Array(value*))
  }
}
