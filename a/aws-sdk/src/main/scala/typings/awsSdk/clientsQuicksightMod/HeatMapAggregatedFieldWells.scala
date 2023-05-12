package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HeatMapAggregatedFieldWells extends StObject {
  
  /**
    * The columns field well of a heat map.
    */
  var Columns: js.UndefOr[HeatMapDimensionFieldList] = js.undefined
  
  /**
    * The rows field well of a heat map.
    */
  var Rows: js.UndefOr[HeatMapDimensionFieldList] = js.undefined
  
  /**
    * The values field well of a heat map.
    */
  var Values: js.UndefOr[HeatMapMeasureFieldList] = js.undefined
}
object HeatMapAggregatedFieldWells {
  
  inline def apply(): HeatMapAggregatedFieldWells = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HeatMapAggregatedFieldWells]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: HeatMapAggregatedFieldWells] (val x: Self) extends AnyVal {
    
    inline def setColumns(value: HeatMapDimensionFieldList): Self = StObject.set(x, "Columns", value.asInstanceOf[js.Any])
    
    inline def setColumnsUndefined: Self = StObject.set(x, "Columns", js.undefined)
    
    inline def setColumnsVarargs(value: DimensionField*): Self = StObject.set(x, "Columns", js.Array(value*))
    
    inline def setRows(value: HeatMapDimensionFieldList): Self = StObject.set(x, "Rows", value.asInstanceOf[js.Any])
    
    inline def setRowsUndefined: Self = StObject.set(x, "Rows", js.undefined)
    
    inline def setRowsVarargs(value: DimensionField*): Self = StObject.set(x, "Rows", js.Array(value*))
    
    inline def setValues(value: HeatMapMeasureFieldList): Self = StObject.set(x, "Values", value.asInstanceOf[js.Any])
    
    inline def setValuesUndefined: Self = StObject.set(x, "Values", js.undefined)
    
    inline def setValuesVarargs(value: MeasureField*): Self = StObject.set(x, "Values", js.Array(value*))
  }
}
