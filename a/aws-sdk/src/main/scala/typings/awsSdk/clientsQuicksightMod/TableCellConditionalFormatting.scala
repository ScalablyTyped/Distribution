package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TableCellConditionalFormatting extends StObject {
  
  /**
    * The field ID of the cell for conditional formatting.
    */
  var FieldId: typings.awsSdk.clientsQuicksightMod.FieldId
  
  /**
    * The text format of the cell for conditional formatting.
    */
  var TextFormat: js.UndefOr[TextConditionalFormat] = js.undefined
}
object TableCellConditionalFormatting {
  
  inline def apply(FieldId: FieldId): TableCellConditionalFormatting = {
    val __obj = js.Dynamic.literal(FieldId = FieldId.asInstanceOf[js.Any])
    __obj.asInstanceOf[TableCellConditionalFormatting]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TableCellConditionalFormatting] (val x: Self) extends AnyVal {
    
    inline def setFieldId(value: FieldId): Self = StObject.set(x, "FieldId", value.asInstanceOf[js.Any])
    
    inline def setTextFormat(value: TextConditionalFormat): Self = StObject.set(x, "TextFormat", value.asInstanceOf[js.Any])
    
    inline def setTextFormatUndefined: Self = StObject.set(x, "TextFormat", js.undefined)
  }
}
