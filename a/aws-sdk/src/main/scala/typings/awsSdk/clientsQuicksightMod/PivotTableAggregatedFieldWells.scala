package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PivotTableAggregatedFieldWells extends StObject {
  
  /**
    * The columns field well for a pivot table. Values are grouped by columns fields.
    */
  var Columns: js.UndefOr[PivotTableDimensionList] = js.undefined
  
  /**
    * The rows field well for a pivot table. Values are grouped by rows fields.
    */
  var Rows: js.UndefOr[PivotTableDimensionList] = js.undefined
  
  /**
    * The values field well for a pivot table. Values are aggregated based on rows and columns fields.
    */
  var Values: js.UndefOr[PivotMeasureFieldList] = js.undefined
}
object PivotTableAggregatedFieldWells {
  
  inline def apply(): PivotTableAggregatedFieldWells = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PivotTableAggregatedFieldWells]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PivotTableAggregatedFieldWells] (val x: Self) extends AnyVal {
    
    inline def setColumns(value: PivotTableDimensionList): Self = StObject.set(x, "Columns", value.asInstanceOf[js.Any])
    
    inline def setColumnsUndefined: Self = StObject.set(x, "Columns", js.undefined)
    
    inline def setColumnsVarargs(value: DimensionField*): Self = StObject.set(x, "Columns", js.Array(value*))
    
    inline def setRows(value: PivotTableDimensionList): Self = StObject.set(x, "Rows", value.asInstanceOf[js.Any])
    
    inline def setRowsUndefined: Self = StObject.set(x, "Rows", js.undefined)
    
    inline def setRowsVarargs(value: DimensionField*): Self = StObject.set(x, "Rows", js.Array(value*))
    
    inline def setValues(value: PivotMeasureFieldList): Self = StObject.set(x, "Values", value.asInstanceOf[js.Any])
    
    inline def setValuesUndefined: Self = StObject.set(x, "Values", js.undefined)
    
    inline def setValuesVarargs(value: MeasureField*): Self = StObject.set(x, "Values", js.Array(value*))
  }
}
