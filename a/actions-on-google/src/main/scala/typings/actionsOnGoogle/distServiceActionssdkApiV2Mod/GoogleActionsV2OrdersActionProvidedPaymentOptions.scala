package typings.actionsOnGoogle.distServiceActionssdkApiV2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleActionsV2OrdersActionProvidedPaymentOptions extends StObject {
  
  /**
    * Name of the instrument displayed on the receipt.
    * Required for action-provided payment info.
    * For `PAYMENT_CARD`, this could be \"VISA-1234\".
    * For `BANK`, this could be \"Chase Checking-1234\".
    * For `LOYALTY_PROGRAM`, this could be \"Starbuck's points\".
    * For `ON_FULFILLMENT`, this could be something like \"pay on delivery\".
    */
  var displayName: js.UndefOr[String] = js.undefined
  
  /**
    * Type of payment.
    * Required.
    */
  var paymentType: js.UndefOr[GoogleActionsV2OrdersActionProvidedPaymentOptionsPaymentType] = js.undefined
}
object GoogleActionsV2OrdersActionProvidedPaymentOptions {
  
  inline def apply(): GoogleActionsV2OrdersActionProvidedPaymentOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleActionsV2OrdersActionProvidedPaymentOptions]
  }
  
  extension [Self <: GoogleActionsV2OrdersActionProvidedPaymentOptions](x: Self) {
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setPaymentType(value: GoogleActionsV2OrdersActionProvidedPaymentOptionsPaymentType): Self = StObject.set(x, "paymentType", value.asInstanceOf[js.Any])
    
    inline def setPaymentTypeUndefined: Self = StObject.set(x, "paymentType", js.undefined)
  }
}
