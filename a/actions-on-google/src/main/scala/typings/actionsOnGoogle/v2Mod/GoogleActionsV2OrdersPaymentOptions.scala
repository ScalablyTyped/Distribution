package typings.actionsOnGoogle.v2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleActionsV2OrdersPaymentOptions extends StObject {
  
  /**
    * Info for an Action-provided payment instrument for display on receipt.
    */
  var actionProvidedOptions: js.UndefOr[GoogleActionsV2OrdersActionProvidedPaymentOptions] = js.native
  
  /**
    * Requirements for Google provided payment instrument.
    */
  var googleProvidedOptions: js.UndefOr[GoogleActionsV2OrdersGoogleProvidedPaymentOptions] = js.native
}
object GoogleActionsV2OrdersPaymentOptions {
  
  @scala.inline
  def apply(): GoogleActionsV2OrdersPaymentOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleActionsV2OrdersPaymentOptions]
  }
  
  @scala.inline
  implicit class GoogleActionsV2OrdersPaymentOptionsMutableBuilder[Self <: GoogleActionsV2OrdersPaymentOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActionProvidedOptions(value: GoogleActionsV2OrdersActionProvidedPaymentOptions): Self = StObject.set(x, "actionProvidedOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActionProvidedOptionsUndefined: Self = StObject.set(x, "actionProvidedOptions", js.undefined)
    
    @scala.inline
    def setGoogleProvidedOptions(value: GoogleActionsV2OrdersGoogleProvidedPaymentOptions): Self = StObject.set(x, "googleProvidedOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGoogleProvidedOptionsUndefined: Self = StObject.set(x, "googleProvidedOptions", js.undefined)
  }
}
