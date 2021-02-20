package typings.awsSdk.chimeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BatchUpdateUserRequest extends StObject {
  
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
  implicit class BatchUpdateUserRequestMutableBuilder[Self <: BatchUpdateUserRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccountId(value: NonEmptyString): Self = StObject.set(x, "AccountId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdateUserRequestItems(value: UpdateUserRequestItemList): Self = StObject.set(x, "UpdateUserRequestItems", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdateUserRequestItemsVarargs(value: UpdateUserRequestItem*): Self = StObject.set(x, "UpdateUserRequestItems", js.Array(value :_*))
  }
}
