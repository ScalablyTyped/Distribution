package typings.applepayjs.ApplePayJS

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Updated transaction details resulting from a change in payment method.
  */
@js.native
trait ApplePayPaymentMethodUpdate extends js.Object {
  
  /**
    * An optional list of line items.
    */
  var newLineItems: js.UndefOr[js.Array[ApplePayLineItem]] = js.native
  
  /**
    * The new total resulting from a change in the payment method.
    */
  var newTotal: ApplePayLineItem = js.native
}
object ApplePayPaymentMethodUpdate {
  
  @scala.inline
  def apply(newTotal: ApplePayLineItem): ApplePayPaymentMethodUpdate = {
    val __obj = js.Dynamic.literal(newTotal = newTotal.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplePayPaymentMethodUpdate]
  }
  
  @scala.inline
  implicit class ApplePayPaymentMethodUpdateOps[Self <: ApplePayPaymentMethodUpdate] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setNewTotal(value: ApplePayLineItem): Self = this.set("newTotal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNewLineItemsVarargs(value: ApplePayLineItem*): Self = this.set("newLineItems", js.Array(value :_*))
    
    @scala.inline
    def setNewLineItems(value: js.Array[ApplePayLineItem]): Self = this.set("newLineItems", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNewLineItems: Self = this.set("newLineItems", js.undefined)
  }
}
