package typings.actionsOnGoogle.v2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleActionsV2DeliveryAddressValue extends js.Object {
  
  /**
    * Contains delivery address only when user agrees to share the delivery
    * address.
    */
  var location: js.UndefOr[GoogleActionsV2Location] = js.native
  
  /**
    * User's decision regarding the request.
    */
  var userDecision: js.UndefOr[GoogleActionsV2DeliveryAddressValueUserDecision] = js.native
}
object GoogleActionsV2DeliveryAddressValue {
  
  @scala.inline
  def apply(): GoogleActionsV2DeliveryAddressValue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleActionsV2DeliveryAddressValue]
  }
  
  @scala.inline
  implicit class GoogleActionsV2DeliveryAddressValueOps[Self <: GoogleActionsV2DeliveryAddressValue] (val x: Self) extends AnyVal {
    
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
    def setLocation(value: GoogleActionsV2Location): Self = this.set("location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocation: Self = this.set("location", js.undefined)
    
    @scala.inline
    def setUserDecision(value: GoogleActionsV2DeliveryAddressValueUserDecision): Self = this.set("userDecision", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUserDecision: Self = this.set("userDecision", js.undefined)
  }
}
