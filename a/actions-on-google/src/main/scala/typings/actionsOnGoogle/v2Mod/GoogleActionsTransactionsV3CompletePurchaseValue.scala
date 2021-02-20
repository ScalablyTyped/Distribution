package typings.actionsOnGoogle.v2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleActionsTransactionsV3CompletePurchaseValue extends StObject {
  
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
  implicit class GoogleActionsTransactionsV3CompletePurchaseValueMutableBuilder[Self <: GoogleActionsTransactionsV3CompletePurchaseValue] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOrderId(value: String): Self = StObject.set(x, "orderId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrderIdUndefined: Self = StObject.set(x, "orderId", js.undefined)
    
    @scala.inline
    def setPurchaseStatus(value: GoogleActionsTransactionsV3CompletePurchaseValuePurchaseStatus): Self = StObject.set(x, "purchaseStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPurchaseStatusUndefined: Self = StObject.set(x, "purchaseStatus", js.undefined)
    
    @scala.inline
    def setPurchaseToken(value: String): Self = StObject.set(x, "purchaseToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPurchaseTokenUndefined: Self = StObject.set(x, "purchaseToken", js.undefined)
  }
}
