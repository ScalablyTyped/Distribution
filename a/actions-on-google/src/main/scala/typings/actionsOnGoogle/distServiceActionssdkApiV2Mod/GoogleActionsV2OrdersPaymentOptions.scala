package typings.actionsOnGoogle.distServiceActionssdkApiV2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleActionsV2OrdersPaymentOptions extends StObject {
  
  /**
    * Info for an Action-provided payment instrument for display on receipt.
    */
  var actionProvidedOptions: js.UndefOr[GoogleActionsV2OrdersActionProvidedPaymentOptions] = js.undefined
  
  /**
    * Requirements for Google provided payment instrument.
    */
  var googleProvidedOptions: js.UndefOr[GoogleActionsV2OrdersGoogleProvidedPaymentOptions] = js.undefined
}
object GoogleActionsV2OrdersPaymentOptions {
  
  inline def apply(): GoogleActionsV2OrdersPaymentOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleActionsV2OrdersPaymentOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GoogleActionsV2OrdersPaymentOptions] (val x: Self) extends AnyVal {
    
    inline def setActionProvidedOptions(value: GoogleActionsV2OrdersActionProvidedPaymentOptions): Self = StObject.set(x, "actionProvidedOptions", value.asInstanceOf[js.Any])
    
    inline def setActionProvidedOptionsUndefined: Self = StObject.set(x, "actionProvidedOptions", js.undefined)
    
    inline def setGoogleProvidedOptions(value: GoogleActionsV2OrdersGoogleProvidedPaymentOptions): Self = StObject.set(x, "googleProvidedOptions", value.asInstanceOf[js.Any])
    
    inline def setGoogleProvidedOptionsUndefined: Self = StObject.set(x, "googleProvidedOptions", js.undefined)
  }
}
