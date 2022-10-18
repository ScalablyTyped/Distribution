package typings.awsSdk.clientsChimeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BatchUpdateUserRequest extends StObject {
  
  /**
    * The Amazon Chime account ID.
    */
  var AccountId: NonEmptyString
  
  /**
    * The request containing the user IDs and details to update.
    */
  var UpdateUserRequestItems: UpdateUserRequestItemList
}
object BatchUpdateUserRequest {
  
  inline def apply(AccountId: NonEmptyString, UpdateUserRequestItems: UpdateUserRequestItemList): BatchUpdateUserRequest = {
    val __obj = js.Dynamic.literal(AccountId = AccountId.asInstanceOf[js.Any], UpdateUserRequestItems = UpdateUserRequestItems.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchUpdateUserRequest]
  }
  
  extension [Self <: BatchUpdateUserRequest](x: Self) {
    
    inline def setAccountId(value: NonEmptyString): Self = StObject.set(x, "AccountId", value.asInstanceOf[js.Any])
    
    inline def setUpdateUserRequestItems(value: UpdateUserRequestItemList): Self = StObject.set(x, "UpdateUserRequestItems", value.asInstanceOf[js.Any])
    
    inline def setUpdateUserRequestItemsVarargs(value: UpdateUserRequestItem*): Self = StObject.set(x, "UpdateUserRequestItems", js.Array(value*))
  }
}
