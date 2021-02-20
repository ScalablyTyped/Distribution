package typings.awsSdk.chimeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DisassociatePhoneNumberFromUserRequest extends StObject {
  
  /**
    * The Amazon Chime account ID.
    */
  var AccountId: String = js.native
  
  /**
    * The user ID.
    */
  var UserId: String = js.native
}
object DisassociatePhoneNumberFromUserRequest {
  
  @scala.inline
  def apply(AccountId: String, UserId: String): DisassociatePhoneNumberFromUserRequest = {
    val __obj = js.Dynamic.literal(AccountId = AccountId.asInstanceOf[js.Any], UserId = UserId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DisassociatePhoneNumberFromUserRequest]
  }
  
  @scala.inline
  implicit class DisassociatePhoneNumberFromUserRequestMutableBuilder[Self <: DisassociatePhoneNumberFromUserRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccountId(value: String): Self = StObject.set(x, "AccountId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserId(value: String): Self = StObject.set(x, "UserId", value.asInstanceOf[js.Any])
  }
}
