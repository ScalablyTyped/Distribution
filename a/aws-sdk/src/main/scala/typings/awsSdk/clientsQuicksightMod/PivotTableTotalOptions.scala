package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PivotTableTotalOptions extends StObject {
  
  /**
    * The column subtotal options.
    */
  var ColumnSubtotalOptions: js.UndefOr[SubtotalOptions] = js.undefined
  
  /**
    * The column total options.
    */
  var ColumnTotalOptions: js.UndefOr[PivotTotalOptions] = js.undefined
  
  /**
    * The row subtotal options.
    */
  var RowSubtotalOptions: js.UndefOr[SubtotalOptions] = js.undefined
  
  /**
    * The row total options.
    */
  var RowTotalOptions: js.UndefOr[PivotTotalOptions] = js.undefined
}
object PivotTableTotalOptions {
  
  inline def apply(): PivotTableTotalOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PivotTableTotalOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PivotTableTotalOptions] (val x: Self) extends AnyVal {
    
    inline def setColumnSubtotalOptions(value: SubtotalOptions): Self = StObject.set(x, "ColumnSubtotalOptions", value.asInstanceOf[js.Any])
    
    inline def setColumnSubtotalOptionsUndefined: Self = StObject.set(x, "ColumnSubtotalOptions", js.undefined)
    
    inline def setColumnTotalOptions(value: PivotTotalOptions): Self = StObject.set(x, "ColumnTotalOptions", value.asInstanceOf[js.Any])
    
    inline def setColumnTotalOptionsUndefined: Self = StObject.set(x, "ColumnTotalOptions", js.undefined)
    
    inline def setRowSubtotalOptions(value: SubtotalOptions): Self = StObject.set(x, "RowSubtotalOptions", value.asInstanceOf[js.Any])
    
    inline def setRowSubtotalOptionsUndefined: Self = StObject.set(x, "RowSubtotalOptions", js.undefined)
    
    inline def setRowTotalOptions(value: PivotTotalOptions): Self = StObject.set(x, "RowTotalOptions", value.asInstanceOf[js.Any])
    
    inline def setRowTotalOptionsUndefined: Self = StObject.set(x, "RowTotalOptions", js.undefined)
  }
}
