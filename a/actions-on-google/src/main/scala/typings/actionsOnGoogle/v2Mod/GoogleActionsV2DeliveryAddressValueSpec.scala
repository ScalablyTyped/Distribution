package typings.actionsOnGoogle.v2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleActionsV2DeliveryAddressValueSpec extends js.Object {
  
  /**
    * Configuration for delivery address dialog.
    */
  var addressOptions: js.UndefOr[GoogleActionsV2DeliveryAddressValueSpecAddressOptions] = js.native
}
object GoogleActionsV2DeliveryAddressValueSpec {
  
  @scala.inline
  def apply(): GoogleActionsV2DeliveryAddressValueSpec = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleActionsV2DeliveryAddressValueSpec]
  }
  
  @scala.inline
  implicit class GoogleActionsV2DeliveryAddressValueSpecOps[Self <: GoogleActionsV2DeliveryAddressValueSpec] (val x: Self) extends AnyVal {
    
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
    def setAddressOptions(value: GoogleActionsV2DeliveryAddressValueSpecAddressOptions): Self = this.set("addressOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAddressOptions: Self = this.set("addressOptions", js.undefined)
  }
}
