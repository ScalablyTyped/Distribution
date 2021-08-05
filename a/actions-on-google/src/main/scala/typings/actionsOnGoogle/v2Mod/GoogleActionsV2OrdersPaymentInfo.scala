package typings.actionsOnGoogle.v2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleActionsV2OrdersPaymentInfo extends StObject {
  
  /**
    * Name of the instrument displayed on the receipt.
    */
  var displayName: js.UndefOr[String] = js.undefined
  
  /**
    * Google provided payment instrument.
    */
  var googleProvidedPaymentInstrument: js.UndefOr[GoogleActionsV2OrdersPaymentInfoGoogleProvidedPaymentInstrument] = js.undefined
  
  /**
    * Type of payment.
    * Required.
    */
  var paymentType: js.UndefOr[GoogleActionsV2OrdersPaymentInfoPaymentType] = js.undefined
}
object GoogleActionsV2OrdersPaymentInfo {
  
  inline def apply(): GoogleActionsV2OrdersPaymentInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleActionsV2OrdersPaymentInfo]
  }
  
  extension [Self <: GoogleActionsV2OrdersPaymentInfo](x: Self) {
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setGoogleProvidedPaymentInstrument(value: GoogleActionsV2OrdersPaymentInfoGoogleProvidedPaymentInstrument): Self = StObject.set(x, "googleProvidedPaymentInstrument", value.asInstanceOf[js.Any])
    
    inline def setGoogleProvidedPaymentInstrumentUndefined: Self = StObject.set(x, "googleProvidedPaymentInstrument", js.undefined)
    
    inline def setPaymentType(value: GoogleActionsV2OrdersPaymentInfoPaymentType): Self = StObject.set(x, "paymentType", value.asInstanceOf[js.Any])
    
    inline def setPaymentTypeUndefined: Self = StObject.set(x, "paymentType", js.undefined)
  }
}
