package typings.actionsOnGoogle.v2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleActionsOrdersV3OrderContents extends StObject {
  
  /**
    * List of order line items.
    * At least 1 line_item is required and at-most 50 is allowed.
    * All line items must belong to same vertical.
    */
  var lineItems: js.UndefOr[js.Array[GoogleActionsOrdersV3LineItem]] = js.native
}
object GoogleActionsOrdersV3OrderContents {
  
  @scala.inline
  def apply(): GoogleActionsOrdersV3OrderContents = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleActionsOrdersV3OrderContents]
  }
  
  @scala.inline
  implicit class GoogleActionsOrdersV3OrderContentsMutableBuilder[Self <: GoogleActionsOrdersV3OrderContents] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLineItems(value: js.Array[GoogleActionsOrdersV3LineItem]): Self = StObject.set(x, "lineItems", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLineItemsUndefined: Self = StObject.set(x, "lineItems", js.undefined)
    
    @scala.inline
    def setLineItemsVarargs(value: GoogleActionsOrdersV3LineItem*): Self = StObject.set(x, "lineItems", js.Array(value :_*))
  }
}
