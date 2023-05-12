package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TableAggregatedFieldWells extends StObject {
  
  /**
    * The group by field well for a pivot table. Values are grouped by group by fields.
    */
  var GroupBy: js.UndefOr[DimensionFieldList] = js.undefined
  
  /**
    * The values field well for a pivot table. Values are aggregated based on group by fields.
    */
  var Values: js.UndefOr[MeasureFieldList] = js.undefined
}
object TableAggregatedFieldWells {
  
  inline def apply(): TableAggregatedFieldWells = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TableAggregatedFieldWells]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TableAggregatedFieldWells] (val x: Self) extends AnyVal {
    
    inline def setGroupBy(value: DimensionFieldList): Self = StObject.set(x, "GroupBy", value.asInstanceOf[js.Any])
    
    inline def setGroupByUndefined: Self = StObject.set(x, "GroupBy", js.undefined)
    
    inline def setGroupByVarargs(value: DimensionField*): Self = StObject.set(x, "GroupBy", js.Array(value*))
    
    inline def setValues(value: MeasureFieldList): Self = StObject.set(x, "Values", value.asInstanceOf[js.Any])
    
    inline def setValuesUndefined: Self = StObject.set(x, "Values", js.undefined)
    
    inline def setValuesVarargs(value: MeasureField*): Self = StObject.set(x, "Values", js.Array(value*))
  }
}
