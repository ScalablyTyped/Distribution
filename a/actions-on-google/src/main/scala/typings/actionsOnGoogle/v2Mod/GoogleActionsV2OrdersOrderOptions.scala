package typings.actionsOnGoogle.v2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleActionsV2OrdersOrderOptions extends js.Object {
  
  /**
    * The app can request customer info by setting this field.
    * If set, the corresponding field will show up in ProposedOrderCard for
    * user's confirmation.
    */
  var customerInfoOptions: js.UndefOr[GoogleActionsV2OrdersCustomerInfoOptions] = js.native
  
  /**
    * If true, delivery address is required for the associated Order.
    */
  var requestDeliveryAddress: js.UndefOr[Boolean] = js.native
}
object GoogleActionsV2OrdersOrderOptions {
  
  @scala.inline
  def apply(): GoogleActionsV2OrdersOrderOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleActionsV2OrdersOrderOptions]
  }
  
  @scala.inline
  implicit class GoogleActionsV2OrdersOrderOptionsOps[Self <: GoogleActionsV2OrdersOrderOptions] (val x: Self) extends AnyVal {
    
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
    def setCustomerInfoOptions(value: GoogleActionsV2OrdersCustomerInfoOptions): Self = this.set("customerInfoOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCustomerInfoOptions: Self = this.set("customerInfoOptions", js.undefined)
    
    @scala.inline
    def setRequestDeliveryAddress(value: Boolean): Self = this.set("requestDeliveryAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRequestDeliveryAddress: Self = this.set("requestDeliveryAddress", js.undefined)
  }
}
