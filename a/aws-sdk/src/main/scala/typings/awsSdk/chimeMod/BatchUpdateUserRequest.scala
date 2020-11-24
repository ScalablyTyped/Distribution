package typings.awsSdk.chimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BatchUpdateUserRequest extends js.Object {
  
  /**
    * The Amazon Chime account ID.
    */
  var AccountId: NonEmptyString = js.native
  
  /**
    * The request containing the user IDs and details to update.
    */
  var UpdateUserRequestItems: UpdateUserRequestItemList = js.native
}
object BatchUpdateUserRequest {
  
  @scala.inline
  def apply(AccountId: NonEmptyString, UpdateUserRequestItems: UpdateUserRequestItemList): BatchUpdateUserRequest = {
    val __obj = js.Dynamic.literal(AccountId = AccountId.asInstanceOf[js.Any], UpdateUserRequestItems = UpdateUserRequestItems.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchUpdateUserRequest]
  }
  
  @scala.inline
  implicit class BatchUpdateUserRequestOps[Self <: BatchUpdateUserRequest] (val x: Self) extends AnyVal {
    
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
    def setAccountId(value: NonEmptyString): Self = this.set("AccountId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdateUserRequestItemsVarargs(value: UpdateUserRequestItem*): Self = this.set("UpdateUserRequestItems", js.Array(value :_*))
    
    @scala.inline
    def setUpdateUserRequestItems(value: UpdateUserRequestItemList): Self = this.set("UpdateUserRequestItems", value.asInstanceOf[js.Any])
  }
}
