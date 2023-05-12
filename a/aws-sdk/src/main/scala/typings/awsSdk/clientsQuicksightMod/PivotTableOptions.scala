package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PivotTableOptions extends StObject {
  
  /**
    * The table cell style of cells.
    */
  var CellStyle: js.UndefOr[TableCellStyle] = js.undefined
  
  /**
    * The visibility setting of a pivot table's collapsed row dimension fields. If the value of this structure is HIDDEN, all collapsed columns in a pivot table are automatically hidden. The default value is VISIBLE.
    */
  var CollapsedRowDimensionsVisibility: js.UndefOr[Visibility] = js.undefined
  
  /**
    * The table cell style of the column header.
    */
  var ColumnHeaderStyle: js.UndefOr[TableCellStyle] = js.undefined
  
  /**
    * The visibility of the column names.
    */
  var ColumnNamesVisibility: js.UndefOr[Visibility] = js.undefined
  
  /**
    * The metric placement (row, column) options.
    */
  var MetricPlacement: js.UndefOr[PivotTableMetricPlacement] = js.undefined
  
  /**
    * The row alternate color options (widget status, row alternate colors).
    */
  var RowAlternateColorOptions: js.UndefOr[typings.awsSdk.clientsQuicksightMod.RowAlternateColorOptions] = js.undefined
  
  /**
    * The table cell style of row field names.
    */
  var RowFieldNamesStyle: js.UndefOr[TableCellStyle] = js.undefined
  
  /**
    * The table cell style of the row headers.
    */
  var RowHeaderStyle: js.UndefOr[TableCellStyle] = js.undefined
  
  /**
    * The visibility of the single metric options.
    */
  var SingleMetricVisibility: js.UndefOr[Visibility] = js.undefined
  
  /**
    * Determines the visibility of the pivot table.
    */
  var ToggleButtonsVisibility: js.UndefOr[Visibility] = js.undefined
}
object PivotTableOptions {
  
  inline def apply(): PivotTableOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PivotTableOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PivotTableOptions] (val x: Self) extends AnyVal {
    
    inline def setCellStyle(value: TableCellStyle): Self = StObject.set(x, "CellStyle", value.asInstanceOf[js.Any])
    
    inline def setCellStyleUndefined: Self = StObject.set(x, "CellStyle", js.undefined)
    
    inline def setCollapsedRowDimensionsVisibility(value: Visibility): Self = StObject.set(x, "CollapsedRowDimensionsVisibility", value.asInstanceOf[js.Any])
    
    inline def setCollapsedRowDimensionsVisibilityUndefined: Self = StObject.set(x, "CollapsedRowDimensionsVisibility", js.undefined)
    
    inline def setColumnHeaderStyle(value: TableCellStyle): Self = StObject.set(x, "ColumnHeaderStyle", value.asInstanceOf[js.Any])
    
    inline def setColumnHeaderStyleUndefined: Self = StObject.set(x, "ColumnHeaderStyle", js.undefined)
    
    inline def setColumnNamesVisibility(value: Visibility): Self = StObject.set(x, "ColumnNamesVisibility", value.asInstanceOf[js.Any])
    
    inline def setColumnNamesVisibilityUndefined: Self = StObject.set(x, "ColumnNamesVisibility", js.undefined)
    
    inline def setMetricPlacement(value: PivotTableMetricPlacement): Self = StObject.set(x, "MetricPlacement", value.asInstanceOf[js.Any])
    
    inline def setMetricPlacementUndefined: Self = StObject.set(x, "MetricPlacement", js.undefined)
    
    inline def setRowAlternateColorOptions(value: RowAlternateColorOptions): Self = StObject.set(x, "RowAlternateColorOptions", value.asInstanceOf[js.Any])
    
    inline def setRowAlternateColorOptionsUndefined: Self = StObject.set(x, "RowAlternateColorOptions", js.undefined)
    
    inline def setRowFieldNamesStyle(value: TableCellStyle): Self = StObject.set(x, "RowFieldNamesStyle", value.asInstanceOf[js.Any])
    
    inline def setRowFieldNamesStyleUndefined: Self = StObject.set(x, "RowFieldNamesStyle", js.undefined)
    
    inline def setRowHeaderStyle(value: TableCellStyle): Self = StObject.set(x, "RowHeaderStyle", value.asInstanceOf[js.Any])
    
    inline def setRowHeaderStyleUndefined: Self = StObject.set(x, "RowHeaderStyle", js.undefined)
    
    inline def setSingleMetricVisibility(value: Visibility): Self = StObject.set(x, "SingleMetricVisibility", value.asInstanceOf[js.Any])
    
    inline def setSingleMetricVisibilityUndefined: Self = StObject.set(x, "SingleMetricVisibility", js.undefined)
    
    inline def setToggleButtonsVisibility(value: Visibility): Self = StObject.set(x, "ToggleButtonsVisibility", value.asInstanceOf[js.Any])
    
    inline def setToggleButtonsVisibilityUndefined: Self = StObject.set(x, "ToggleButtonsVisibility", js.undefined)
  }
}
