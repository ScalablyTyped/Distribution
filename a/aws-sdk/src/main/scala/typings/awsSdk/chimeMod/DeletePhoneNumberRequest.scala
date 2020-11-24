package typings.awsSdk.chimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeletePhoneNumberRequest extends js.Object {
  
  /**
    * The phone number ID.
    */
  var PhoneNumberId: String = js.native
}
object DeletePhoneNumberRequest {
  
  @scala.inline
  def apply(PhoneNumberId: String): DeletePhoneNumberRequest = {
    val __obj = js.Dynamic.literal(PhoneNumberId = PhoneNumberId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeletePhoneNumberRequest]
  }
  
  @scala.inline
  implicit class DeletePhoneNumberRequestOps[Self <: DeletePhoneNumberRequest] (val x: Self) extends AnyVal {
    
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
    def setPhoneNumberId(value: String): Self = this.set("PhoneNumberId", value.asInstanceOf[js.Any])
  }
}
