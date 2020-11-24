package typings.awsSdk.chimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BatchUpdatePhoneNumberRequest extends js.Object {
  
  /**
    * The request containing the phone number IDs and product types or calling names to update.
    */
  var UpdatePhoneNumberRequestItems: UpdatePhoneNumberRequestItemList = js.native
}
object BatchUpdatePhoneNumberRequest {
  
  @scala.inline
  def apply(UpdatePhoneNumberRequestItems: UpdatePhoneNumberRequestItemList): BatchUpdatePhoneNumberRequest = {
    val __obj = js.Dynamic.literal(UpdatePhoneNumberRequestItems = UpdatePhoneNumberRequestItems.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchUpdatePhoneNumberRequest]
  }
  
  @scala.inline
  implicit class BatchUpdatePhoneNumberRequestOps[Self <: BatchUpdatePhoneNumberRequest] (val x: Self) extends AnyVal {
    
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
    def setUpdatePhoneNumberRequestItemsVarargs(value: UpdatePhoneNumberRequestItem*): Self = this.set("UpdatePhoneNumberRequestItems", js.Array(value :_*))
    
    @scala.inline
    def setUpdatePhoneNumberRequestItems(value: UpdatePhoneNumberRequestItemList): Self = this.set("UpdatePhoneNumberRequestItems", value.asInstanceOf[js.Any])
  }
}
