package typings.actionsOnGoogle.v2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleActionsTransactionsV3CompletePurchaseValue extends StObject {
  
  /**
    * A unique order identifier for the transaction. This identifier corresponds
    * to the Google provided order ID.
    */
  var orderId: js.UndefOr[String] = js.undefined
  
  /**
    * Status of current purchase.
    */
  var purchaseStatus: js.UndefOr[GoogleActionsTransactionsV3CompletePurchaseValuePurchaseStatus] = js.undefined
  
  /**
    * A opaque token that uniquely identifies a purchase for a given item and
    * user pair.
    */
  var purchaseToken: js.UndefOr[String] = js.undefined
}
object GoogleActionsTransactionsV3CompletePurchaseValue {
  
  inline def apply(): GoogleActionsTransactionsV3CompletePurchaseValue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleActionsTransactionsV3CompletePurchaseValue]
  }
  
  extension [Self <: GoogleActionsTransactionsV3CompletePurchaseValue](x: Self) {
    
    inline def setOrderId(value: String): Self = StObject.set(x, "orderId", value.asInstanceOf[js.Any])
    
    inline def setOrderIdUndefined: Self = StObject.set(x, "orderId", js.undefined)
    
    inline def setPurchaseStatus(value: GoogleActionsTransactionsV3CompletePurchaseValuePurchaseStatus): Self = StObject.set(x, "purchaseStatus", value.asInstanceOf[js.Any])
    
    inline def setPurchaseStatusUndefined: Self = StObject.set(x, "purchaseStatus", js.undefined)
    
    inline def setPurchaseToken(value: String): Self = StObject.set(x, "purchaseToken", value.asInstanceOf[js.Any])
    
    inline def setPurchaseTokenUndefined: Self = StObject.set(x, "purchaseToken", js.undefined)
  }
}
