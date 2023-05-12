package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PivotTableCellConditionalFormatting extends StObject {
  
  /**
    * The field ID of the cell for conditional formatting.
    */
  var FieldId: typings.awsSdk.clientsQuicksightMod.FieldId
  
  /**
    * The scope of the cell for conditional formatting.
    */
  var Scope: js.UndefOr[PivotTableConditionalFormattingScope] = js.undefined
  
  /**
    * The text format of the cell for conditional formatting.
    */
  var TextFormat: js.UndefOr[TextConditionalFormat] = js.undefined
}
object PivotTableCellConditionalFormatting {
  
  inline def apply(FieldId: FieldId): PivotTableCellConditionalFormatting = {
    val __obj = js.Dynamic.literal(FieldId = FieldId.asInstanceOf[js.Any])
    __obj.asInstanceOf[PivotTableCellConditionalFormatting]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PivotTableCellConditionalFormatting] (val x: Self) extends AnyVal {
    
    inline def setFieldId(value: FieldId): Self = StObject.set(x, "FieldId", value.asInstanceOf[js.Any])
    
    inline def setScope(value: PivotTableConditionalFormattingScope): Self = StObject.set(x, "Scope", value.asInstanceOf[js.Any])
    
    inline def setScopeUndefined: Self = StObject.set(x, "Scope", js.undefined)
    
    inline def setTextFormat(value: TextConditionalFormat): Self = StObject.set(x, "TextFormat", value.asInstanceOf[js.Any])
    
    inline def setTextFormatUndefined: Self = StObject.set(x, "TextFormat", js.undefined)
  }
}
