package typings.applepayjs.ApplePayJS

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Updated transaction details resulting from a change in payment method.
  */
trait ApplePayPaymentMethodUpdate extends StObject {
  
  /**
    * An optional list of line items.
    */
  var newLineItems: js.UndefOr[js.Array[ApplePayLineItem]] = js.undefined
  
  /**
    * The new total resulting from a change in the payment method.
    */
  var newTotal: ApplePayLineItem
}
object ApplePayPaymentMethodUpdate {
  
  @scala.inline
  def apply(newTotal: ApplePayLineItem): ApplePayPaymentMethodUpdate = {
    val __obj = js.Dynamic.literal(newTotal = newTotal.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplePayPaymentMethodUpdate]
  }
  
  @scala.inline
  implicit class ApplePayPaymentMethodUpdateMutableBuilder[Self <: ApplePayPaymentMethodUpdate] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNewLineItems(value: js.Array[ApplePayLineItem]): Self = StObject.set(x, "newLineItems", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNewLineItemsUndefined: Self = StObject.set(x, "newLineItems", js.undefined)
    
    @scala.inline
    def setNewLineItemsVarargs(value: ApplePayLineItem*): Self = StObject.set(x, "newLineItems", js.Array(value :_*))
    
    @scala.inline
    def setNewTotal(value: ApplePayLineItem): Self = StObject.set(x, "newTotal", value.asInstanceOf[js.Any])
  }
}
