package typings.actionsOnGoogle.v2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleActionsV2StructuredResponse extends StObject {
  
  /**
    * App provides an order update (e.g.
    * Receipt) after receiving the order.
    */
  var orderUpdate: js.UndefOr[GoogleActionsV2OrdersOrderUpdate] = js.native
  
  /**
    * App provides an order update in API v3 format after receiving the order.
    */
  var orderUpdateV3: js.UndefOr[GoogleActionsOrdersV3OrderUpdate] = js.native
}
object GoogleActionsV2StructuredResponse {
  
  @scala.inline
  def apply(): GoogleActionsV2StructuredResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleActionsV2StructuredResponse]
  }
  
  @scala.inline
  implicit class GoogleActionsV2StructuredResponseMutableBuilder[Self <: GoogleActionsV2StructuredResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOrderUpdate(value: GoogleActionsV2OrdersOrderUpdate): Self = StObject.set(x, "orderUpdate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrderUpdateUndefined: Self = StObject.set(x, "orderUpdate", js.undefined)
    
    @scala.inline
    def setOrderUpdateV3(value: GoogleActionsOrdersV3OrderUpdate): Self = StObject.set(x, "orderUpdateV3", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrderUpdateV3Undefined: Self = StObject.set(x, "orderUpdateV3", js.undefined)
  }
}
