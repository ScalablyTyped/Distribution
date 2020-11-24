package typings.actionsOnGoogle.v2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleActionsTransactionsV3MerchantPaymentOption extends js.Object {
  
  /**
    * Optional. Id of the default payment method, if any.
    */
  var defaultMerchantPaymentMethodId: js.UndefOr[String] = js.native
  
  /**
    * Optional. A link to the action/merchant website for managing payment
    * method.
    */
  var managePaymentMethodUrl: js.UndefOr[String] = js.native
  
  /**
    * Required. List of payment methods provided by Action/Merchant.
    */
  var merchantPaymentMethod: js.UndefOr[js.Array[GoogleActionsTransactionsV3MerchantPaymentMethod]] = js.native
}
object GoogleActionsTransactionsV3MerchantPaymentOption {
  
  @scala.inline
  def apply(): GoogleActionsTransactionsV3MerchantPaymentOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleActionsTransactionsV3MerchantPaymentOption]
  }
  
  @scala.inline
  implicit class GoogleActionsTransactionsV3MerchantPaymentOptionOps[Self <: GoogleActionsTransactionsV3MerchantPaymentOption] (val x: Self) extends AnyVal {
    
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
    def setDefaultMerchantPaymentMethodId(value: String): Self = this.set("defaultMerchantPaymentMethodId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultMerchantPaymentMethodId: Self = this.set("defaultMerchantPaymentMethodId", js.undefined)
    
    @scala.inline
    def setManagePaymentMethodUrl(value: String): Self = this.set("managePaymentMethodUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteManagePaymentMethodUrl: Self = this.set("managePaymentMethodUrl", js.undefined)
    
    @scala.inline
    def setMerchantPaymentMethodVarargs(value: GoogleActionsTransactionsV3MerchantPaymentMethod*): Self = this.set("merchantPaymentMethod", js.Array(value :_*))
    
    @scala.inline
    def setMerchantPaymentMethod(value: js.Array[GoogleActionsTransactionsV3MerchantPaymentMethod]): Self = this.set("merchantPaymentMethod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMerchantPaymentMethod: Self = this.set("merchantPaymentMethod", js.undefined)
  }
}
