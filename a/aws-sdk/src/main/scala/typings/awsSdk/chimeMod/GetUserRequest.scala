package typings.awsSdk.chimeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetUserRequest extends StObject {
  
  /**
    * The Amazon Chime account ID.
    */
  var AccountId: NonEmptyString
  
  /**
    * The user ID.
    */
  var UserId: NonEmptyString
}
object GetUserRequest {
  
  @scala.inline
  def apply(AccountId: NonEmptyString, UserId: NonEmptyString): GetUserRequest = {
    val __obj = js.Dynamic.literal(AccountId = AccountId.asInstanceOf[js.Any], UserId = UserId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetUserRequest]
  }
  
  @scala.inline
  implicit class GetUserRequestMutableBuilder[Self <: GetUserRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccountId(value: NonEmptyString): Self = StObject.set(x, "AccountId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserId(value: NonEmptyString): Self = StObject.set(x, "UserId", value.asInstanceOf[js.Any])
  }
}
