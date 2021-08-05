package typings.actionsOnGoogle.v2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleActionsOrdersV3OrderContents extends StObject {
  
  /**
    * List of order line items.
    * At least 1 line_item is required and at-most 50 is allowed.
    * All line items must belong to same vertical.
    */
  var lineItems: js.UndefOr[js.Array[GoogleActionsOrdersV3LineItem]] = js.undefined
}
object GoogleActionsOrdersV3OrderContents {
  
  inline def apply(): GoogleActionsOrdersV3OrderContents = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleActionsOrdersV3OrderContents]
  }
  
  extension [Self <: GoogleActionsOrdersV3OrderContents](x: Self) {
    
    inline def setLineItems(value: js.Array[GoogleActionsOrdersV3LineItem]): Self = StObject.set(x, "lineItems", value.asInstanceOf[js.Any])
    
    inline def setLineItemsUndefined: Self = StObject.set(x, "lineItems", js.undefined)
    
    inline def setLineItemsVarargs(value: GoogleActionsOrdersV3LineItem*): Self = StObject.set(x, "lineItems", js.Array(value :_*))
  }
}
