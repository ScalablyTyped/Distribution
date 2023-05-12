package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SubtotalOptions extends StObject {
  
  /**
    * The custom label string for the subtotal cells.
    */
  var CustomLabel: js.UndefOr[String] = js.undefined
  
  /**
    * The field level (all, custom, last) for the subtotal cells.
    */
  var FieldLevel: js.UndefOr[PivotTableSubtotalLevel] = js.undefined
  
  /**
    * The optional configuration of subtotal cells.
    */
  var FieldLevelOptions: js.UndefOr[PivotTableFieldSubtotalOptionsList] = js.undefined
  
  /**
    * The cell styling options for the subtotals of header cells.
    */
  var MetricHeaderCellStyle: js.UndefOr[TableCellStyle] = js.undefined
  
  /**
    * The cell styling options for the subtotal cells.
    */
  var TotalCellStyle: js.UndefOr[TableCellStyle] = js.undefined
  
  /**
    * The visibility configuration for the subtotal cells.
    */
  var TotalsVisibility: js.UndefOr[Visibility] = js.undefined
  
  /**
    * The cell styling options for the subtotals of value cells.
    */
  var ValueCellStyle: js.UndefOr[TableCellStyle] = js.undefined
}
object SubtotalOptions {
  
  inline def apply(): SubtotalOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SubtotalOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SubtotalOptions] (val x: Self) extends AnyVal {
    
    inline def setCustomLabel(value: String): Self = StObject.set(x, "CustomLabel", value.asInstanceOf[js.Any])
    
    inline def setCustomLabelUndefined: Self = StObject.set(x, "CustomLabel", js.undefined)
    
    inline def setFieldLevel(value: PivotTableSubtotalLevel): Self = StObject.set(x, "FieldLevel", value.asInstanceOf[js.Any])
    
    inline def setFieldLevelOptions(value: PivotTableFieldSubtotalOptionsList): Self = StObject.set(x, "FieldLevelOptions", value.asInstanceOf[js.Any])
    
    inline def setFieldLevelOptionsUndefined: Self = StObject.set(x, "FieldLevelOptions", js.undefined)
    
    inline def setFieldLevelOptionsVarargs(value: PivotTableFieldSubtotalOptions*): Self = StObject.set(x, "FieldLevelOptions", js.Array(value*))
    
    inline def setFieldLevelUndefined: Self = StObject.set(x, "FieldLevel", js.undefined)
    
    inline def setMetricHeaderCellStyle(value: TableCellStyle): Self = StObject.set(x, "MetricHeaderCellStyle", value.asInstanceOf[js.Any])
    
    inline def setMetricHeaderCellStyleUndefined: Self = StObject.set(x, "MetricHeaderCellStyle", js.undefined)
    
    inline def setTotalCellStyle(value: TableCellStyle): Self = StObject.set(x, "TotalCellStyle", value.asInstanceOf[js.Any])
    
    inline def setTotalCellStyleUndefined: Self = StObject.set(x, "TotalCellStyle", js.undefined)
    
    inline def setTotalsVisibility(value: Visibility): Self = StObject.set(x, "TotalsVisibility", value.asInstanceOf[js.Any])
    
    inline def setTotalsVisibilityUndefined: Self = StObject.set(x, "TotalsVisibility", js.undefined)
    
    inline def setValueCellStyle(value: TableCellStyle): Self = StObject.set(x, "ValueCellStyle", value.asInstanceOf[js.Any])
    
    inline def setValueCellStyleUndefined: Self = StObject.set(x, "ValueCellStyle", js.undefined)
  }
}
