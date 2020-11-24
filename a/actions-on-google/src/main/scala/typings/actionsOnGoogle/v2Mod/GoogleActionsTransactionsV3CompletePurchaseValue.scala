package typings.actionsOnGoogle.v2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleActionsTransactionsV3CompletePurchaseValue extends js.Object {
  
  /**
    * A unique order identifier for the transaction. This identifier corresponds
    * to the Google provided order ID.
    */
  var orderId: js.UndefOr[String] = js.native
  
  /**
    * Status of current purchase.
    */
  var purchaseStatus: js.UndefOr[GoogleActionsTransactionsV3CompletePurchaseValuePurchaseStatus] = js.native
  
  /**
    * A opaque token that uniquely identifies a purchase for a given item and
    * user pair.
    */
  var purchaseToken: js.UndefOr[String] = js.native
}
object GoogleActionsTransactionsV3CompletePurchaseValue {
  
  @scala.inline
  def apply(): GoogleActionsTransactionsV3CompletePurchaseValue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleActionsTransactionsV3CompletePurchaseValue]
  }
  
  @scala.inline
  implicit class GoogleActionsTransactionsV3CompletePurchaseValueOps[Self <: GoogleActionsTransactionsV3CompletePurchaseValue] (val x: Self) extends AnyVal {
    
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
    def setOrderId(value: String): Self = this.set("orderId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOrderId: Self = this.set("orderId", js.undefined)
    
    @scala.inline
    def setPurchaseStatus(value: GoogleActionsTransactionsV3CompletePurchaseValuePurchaseStatus): Self = this.set("purchaseStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePurchaseStatus: Self = this.set("purchaseStatus", js.undefined)
    
    @scala.inline
    def setPurchaseToken(value: String): Self = this.set("purchaseToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePurchaseToken: Self = this.set("purchaseToken", js.undefined)
  }
}
