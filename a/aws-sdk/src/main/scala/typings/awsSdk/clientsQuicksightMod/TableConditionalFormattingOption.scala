package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TableConditionalFormattingOption extends StObject {
  
  /**
    * The cell conditional formatting option for a table.
    */
  var Cell: js.UndefOr[TableCellConditionalFormatting] = js.undefined
  
  /**
    * The row conditional formatting option for a table.
    */
  var Row: js.UndefOr[TableRowConditionalFormatting] = js.undefined
}
object TableConditionalFormattingOption {
  
  inline def apply(): TableConditionalFormattingOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TableConditionalFormattingOption]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TableConditionalFormattingOption] (val x: Self) extends AnyVal {
    
    inline def setCell(value: TableCellConditionalFormatting): Self = StObject.set(x, "Cell", value.asInstanceOf[js.Any])
    
    inline def setCellUndefined: Self = StObject.set(x, "Cell", js.undefined)
    
    inline def setRow(value: TableRowConditionalFormatting): Self = StObject.set(x, "Row", value.asInstanceOf[js.Any])
    
    inline def setRowUndefined: Self = StObject.set(x, "Row", js.undefined)
  }
}
