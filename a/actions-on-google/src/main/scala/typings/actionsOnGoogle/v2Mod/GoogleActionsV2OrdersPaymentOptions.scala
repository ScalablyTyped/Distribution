package typings.actionsOnGoogle.v2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleActionsV2OrdersPaymentOptions extends js.Object {
  
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
  implicit class GoogleActionsV2OrdersPaymentOptionsOps[Self <: GoogleActionsV2OrdersPaymentOptions] (val x: Self) extends AnyVal {
    
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
    def setActionProvidedOptions(value: GoogleActionsV2OrdersActionProvidedPaymentOptions): Self = this.set("actionProvidedOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteActionProvidedOptions: Self = this.set("actionProvidedOptions", js.undefined)
    
    @scala.inline
    def setGoogleProvidedOptions(value: GoogleActionsV2OrdersGoogleProvidedPaymentOptions): Self = this.set("googleProvidedOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGoogleProvidedOptions: Self = this.set("googleProvidedOptions", js.undefined)
  }
}
