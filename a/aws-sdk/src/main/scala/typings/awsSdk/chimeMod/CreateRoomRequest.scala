package typings.awsSdk.chimeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateRoomRequest extends StObject {
  
  /**
    * The Amazon Chime account ID.
    */
  var AccountId: NonEmptyString
  
  /**
    * The idempotency token for the request.
    */
  var ClientRequestToken: js.UndefOr[typings.awsSdk.chimeMod.ClientRequestToken] = js.undefined
  
  /**
    * The room name.
    */
  var Name: SensitiveString
}
object CreateRoomRequest {
  
  @scala.inline
  def apply(AccountId: NonEmptyString, Name: SensitiveString): CreateRoomRequest = {
    val __obj = js.Dynamic.literal(AccountId = AccountId.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateRoomRequest]
  }
  
  @scala.inline
  implicit class CreateRoomRequestMutableBuilder[Self <: CreateRoomRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccountId(value: NonEmptyString): Self = StObject.set(x, "AccountId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientRequestToken(value: ClientRequestToken): Self = StObject.set(x, "ClientRequestToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientRequestTokenUndefined: Self = StObject.set(x, "ClientRequestToken", js.undefined)
    
    @scala.inline
    def setName(value: SensitiveString): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
  }
}
