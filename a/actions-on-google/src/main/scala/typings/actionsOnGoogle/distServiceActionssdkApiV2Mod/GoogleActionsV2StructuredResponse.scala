package typings.actionsOnGoogle.distServiceActionssdkApiV2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleActionsV2StructuredResponse extends StObject {
  
  /**
    * App provides an order update (e.g.
    * Receipt) after receiving the order.
    */
  var orderUpdate: js.UndefOr[GoogleActionsV2OrdersOrderUpdate] = js.undefined
  
  /**
    * App provides an order update in API v3 format after receiving the order.
    */
  var orderUpdateV3: js.UndefOr[GoogleActionsOrdersV3OrderUpdate] = js.undefined
}
object GoogleActionsV2StructuredResponse {
  
  inline def apply(): GoogleActionsV2StructuredResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleActionsV2StructuredResponse]
  }
  
  extension [Self <: GoogleActionsV2StructuredResponse](x: Self) {
    
    inline def setOrderUpdate(value: GoogleActionsV2OrdersOrderUpdate): Self = StObject.set(x, "orderUpdate", value.asInstanceOf[js.Any])
    
    inline def setOrderUpdateUndefined: Self = StObject.set(x, "orderUpdate", js.undefined)
    
    inline def setOrderUpdateV3(value: GoogleActionsOrdersV3OrderUpdate): Self = StObject.set(x, "orderUpdateV3", value.asInstanceOf[js.Any])
    
    inline def setOrderUpdateV3Undefined: Self = StObject.set(x, "orderUpdateV3", js.undefined)
  }
}
