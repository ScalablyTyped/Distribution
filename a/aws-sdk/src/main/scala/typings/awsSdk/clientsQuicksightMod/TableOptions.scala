package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TableOptions extends StObject {
  
  /**
    * The table cell style of table cells.
    */
  var CellStyle: js.UndefOr[TableCellStyle] = js.undefined
  
  /**
    * The table cell style of a table header.
    */
  var HeaderStyle: js.UndefOr[TableCellStyle] = js.undefined
  
  /**
    * The orientation (vertical, horizontal) for a table.
    */
  var Orientation: js.UndefOr[TableOrientation] = js.undefined
  
  /**
    * The row alternate color options (widget status, row alternate colors) for a table.
    */
  var RowAlternateColorOptions: js.UndefOr[typings.awsSdk.clientsQuicksightMod.RowAlternateColorOptions] = js.undefined
}
object TableOptions {
  
  inline def apply(): TableOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TableOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TableOptions] (val x: Self) extends AnyVal {
    
    inline def setCellStyle(value: TableCellStyle): Self = StObject.set(x, "CellStyle", value.asInstanceOf[js.Any])
    
    inline def setCellStyleUndefined: Self = StObject.set(x, "CellStyle", js.undefined)
    
    inline def setHeaderStyle(value: TableCellStyle): Self = StObject.set(x, "HeaderStyle", value.asInstanceOf[js.Any])
    
    inline def setHeaderStyleUndefined: Self = StObject.set(x, "HeaderStyle", js.undefined)
    
    inline def setOrientation(value: TableOrientation): Self = StObject.set(x, "Orientation", value.asInstanceOf[js.Any])
    
    inline def setOrientationUndefined: Self = StObject.set(x, "Orientation", js.undefined)
    
    inline def setRowAlternateColorOptions(value: RowAlternateColorOptions): Self = StObject.set(x, "RowAlternateColorOptions", value.asInstanceOf[js.Any])
    
    inline def setRowAlternateColorOptionsUndefined: Self = StObject.set(x, "RowAlternateColorOptions", js.undefined)
  }
}
