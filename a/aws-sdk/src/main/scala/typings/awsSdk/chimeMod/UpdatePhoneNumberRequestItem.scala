package typings.awsSdk.chimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdatePhoneNumberRequestItem extends js.Object {
  
  /**
    * The outbound calling name to update.
    */
  var CallingName: js.UndefOr[typings.awsSdk.chimeMod.CallingName] = js.native
  
  /**
    * The phone number ID to update.
    */
  var PhoneNumberId: NonEmptyString = js.native
  
  /**
    * The product type to update.
    */
  var ProductType: js.UndefOr[PhoneNumberProductType] = js.native
}
object UpdatePhoneNumberRequestItem {
  
  @scala.inline
  def apply(PhoneNumberId: NonEmptyString): UpdatePhoneNumberRequestItem = {
    val __obj = js.Dynamic.literal(PhoneNumberId = PhoneNumberId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdatePhoneNumberRequestItem]
  }
  
  @scala.inline
  implicit class UpdatePhoneNumberRequestItemOps[Self <: UpdatePhoneNumberRequestItem] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setPhoneNumberId(value: NonEmptyString): Self = this.set("PhoneNumberId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCallingName(value: CallingName): Self = this.set("CallingName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCallingName: Self = this.set("CallingName", js.undefined)
    
    @scala.inline
    def setProductType(value: PhoneNumberProductType): Self = this.set("ProductType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProductType: Self = this.set("ProductType", js.undefined)
  }
}
