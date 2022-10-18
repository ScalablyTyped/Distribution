package typings.actionsOnGoogle.distServiceActionssdkApiV2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleActionsV2OrdersLineItemSubLine extends StObject {
  
  /**
    * A generic line item (e.g. add-on).
    */
  var lineItem: js.UndefOr[GoogleActionsV2OrdersLineItem] = js.undefined
  
  /**
    * A note associated with the line item.
    */
  var note: js.UndefOr[String] = js.undefined
}
object GoogleActionsV2OrdersLineItemSubLine {
  
  inline def apply(): GoogleActionsV2OrdersLineItemSubLine = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleActionsV2OrdersLineItemSubLine]
  }
  
  extension [Self <: GoogleActionsV2OrdersLineItemSubLine](x: Self) {
    
    inline def setLineItem(value: GoogleActionsV2OrdersLineItem): Self = StObject.set(x, "lineItem", value.asInstanceOf[js.Any])
    
    inline def setLineItemUndefined: Self = StObject.set(x, "lineItem", js.undefined)
    
    inline def setNote(value: String): Self = StObject.set(x, "note", value.asInstanceOf[js.Any])
    
    inline def setNoteUndefined: Self = StObject.set(x, "note", js.undefined)
  }
}
