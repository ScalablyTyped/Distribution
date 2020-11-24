package typings.awsSdk.chimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BatchDeletePhoneNumberRequest extends js.Object {
  
  /**
    * List of phone number IDs.
    */
  var PhoneNumberIds: NonEmptyStringList = js.native
}
object BatchDeletePhoneNumberRequest {
  
  @scala.inline
  def apply(PhoneNumberIds: NonEmptyStringList): BatchDeletePhoneNumberRequest = {
    val __obj = js.Dynamic.literal(PhoneNumberIds = PhoneNumberIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchDeletePhoneNumberRequest]
  }
  
  @scala.inline
  implicit class BatchDeletePhoneNumberRequestOps[Self <: BatchDeletePhoneNumberRequest] (val x: Self) extends AnyVal {
    
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
    def setPhoneNumberIdsVarargs(value: String*): Self = this.set("PhoneNumberIds", js.Array(value :_*))
    
    @scala.inline
    def setPhoneNumberIds(value: NonEmptyStringList): Self = this.set("PhoneNumberIds", value.asInstanceOf[js.Any])
  }
}
