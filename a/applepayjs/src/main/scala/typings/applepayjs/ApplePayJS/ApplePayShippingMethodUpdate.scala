package typings.applepayjs.ApplePayJS

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Updated transaction details resulting from a change in shipping method.
  */
trait ApplePayShippingMethodUpdate extends StObject {
  
  /**
    * An optional list of updated line items.
    */
  var newLineItems: js.UndefOr[js.Array[ApplePayLineItem]] = js.undefined
  
  /**
    * The new total resulting from a change in the shipping method.
    */
  var newTotal: ApplePayLineItem
}
object ApplePayShippingMethodUpdate {
  
  inline def apply(newTotal: ApplePayLineItem): ApplePayShippingMethodUpdate = {
    val __obj = js.Dynamic.literal(newTotal = newTotal.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplePayShippingMethodUpdate]
  }
  
  extension [Self <: ApplePayShippingMethodUpdate](x: Self) {
    
    inline def setNewLineItems(value: js.Array[ApplePayLineItem]): Self = StObject.set(x, "newLineItems", value.asInstanceOf[js.Any])
    
    inline def setNewLineItemsUndefined: Self = StObject.set(x, "newLineItems", js.undefined)
    
    inline def setNewLineItemsVarargs(value: ApplePayLineItem*): Self = StObject.set(x, "newLineItems", js.Array(value :_*))
    
    inline def setNewTotal(value: ApplePayLineItem): Self = StObject.set(x, "newTotal", value.asInstanceOf[js.Any])
  }
}
