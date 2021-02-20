package typings.actionsOnGoogle.v2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleActionsV2OrdersPaymentInfo extends StObject {
  
  /**
    * Name of the instrument displayed on the receipt.
    */
  var displayName: js.UndefOr[String] = js.native
  
  /**
    * Google provided payment instrument.
    */
  var googleProvidedPaymentInstrument: js.UndefOr[GoogleActionsV2OrdersPaymentInfoGoogleProvidedPaymentInstrument] = js.native
  
  /**
    * Type of payment.
    * Required.
    */
  var paymentType: js.UndefOr[GoogleActionsV2OrdersPaymentInfoPaymentType] = js.native
}
object GoogleActionsV2OrdersPaymentInfo {
  
  @scala.inline
  def apply(): GoogleActionsV2OrdersPaymentInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleActionsV2OrdersPaymentInfo]
  }
  
  @scala.inline
  implicit class GoogleActionsV2OrdersPaymentInfoMutableBuilder[Self <: GoogleActionsV2OrdersPaymentInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    @scala.inline
    def setGoogleProvidedPaymentInstrument(value: GoogleActionsV2OrdersPaymentInfoGoogleProvidedPaymentInstrument): Self = StObject.set(x, "googleProvidedPaymentInstrument", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGoogleProvidedPaymentInstrumentUndefined: Self = StObject.set(x, "googleProvidedPaymentInstrument", js.undefined)
    
    @scala.inline
    def setPaymentType(value: GoogleActionsV2OrdersPaymentInfoPaymentType): Self = StObject.set(x, "paymentType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPaymentTypeUndefined: Self = StObject.set(x, "paymentType", js.undefined)
  }
}
