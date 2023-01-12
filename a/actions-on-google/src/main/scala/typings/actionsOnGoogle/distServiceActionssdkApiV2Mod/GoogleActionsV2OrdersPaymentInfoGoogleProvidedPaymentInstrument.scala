package typings.actionsOnGoogle.distServiceActionssdkApiV2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleActionsV2OrdersPaymentInfoGoogleProvidedPaymentInstrument extends StObject {
  
  /**
    * If requested by integrator, billing address for the instrument in use
    * will be included.
    */
  var billingAddress: js.UndefOr[GoogleTypePostalAddress] = js.undefined
  
  /**
    * Google provided payment instrument.
    */
  var instrumentToken: js.UndefOr[String] = js.undefined
}
object GoogleActionsV2OrdersPaymentInfoGoogleProvidedPaymentInstrument {
  
  inline def apply(): GoogleActionsV2OrdersPaymentInfoGoogleProvidedPaymentInstrument = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleActionsV2OrdersPaymentInfoGoogleProvidedPaymentInstrument]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GoogleActionsV2OrdersPaymentInfoGoogleProvidedPaymentInstrument] (val x: Self) extends AnyVal {
    
    inline def setBillingAddress(value: GoogleTypePostalAddress): Self = StObject.set(x, "billingAddress", value.asInstanceOf[js.Any])
    
    inline def setBillingAddressUndefined: Self = StObject.set(x, "billingAddress", js.undefined)
    
    inline def setInstrumentToken(value: String): Self = StObject.set(x, "instrumentToken", value.asInstanceOf[js.Any])
    
    inline def setInstrumentTokenUndefined: Self = StObject.set(x, "instrumentToken", js.undefined)
  }
}
