package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PivotTableConditionalFormattingOption extends StObject {
  
  /**
    * The cell conditional formatting option for a pivot table.
    */
  var Cell: js.UndefOr[PivotTableCellConditionalFormatting] = js.undefined
}
object PivotTableConditionalFormattingOption {
  
  inline def apply(): PivotTableConditionalFormattingOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PivotTableConditionalFormattingOption]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PivotTableConditionalFormattingOption] (val x: Self) extends AnyVal {
    
    inline def setCell(value: PivotTableCellConditionalFormatting): Self = StObject.set(x, "Cell", value.asInstanceOf[js.Any])
    
    inline def setCellUndefined: Self = StObject.set(x, "Cell", js.undefined)
  }
}
