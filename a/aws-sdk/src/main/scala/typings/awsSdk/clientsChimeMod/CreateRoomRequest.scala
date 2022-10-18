package typings.awsSdk.clientsChimeMod

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
  var ClientRequestToken: js.UndefOr[typings.awsSdk.clientsChimeMod.ClientRequestToken] = js.undefined
  
  /**
    * The room name.
    */
  var Name: SensitiveString
}
object CreateRoomRequest {
  
  inline def apply(AccountId: NonEmptyString, Name: SensitiveString): CreateRoomRequest = {
    val __obj = js.Dynamic.literal(AccountId = AccountId.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateRoomRequest]
  }
  
  extension [Self <: CreateRoomRequest](x: Self) {
    
    inline def setAccountId(value: NonEmptyString): Self = StObject.set(x, "AccountId", value.asInstanceOf[js.Any])
    
    inline def setClientRequestToken(value: ClientRequestToken): Self = StObject.set(x, "ClientRequestToken", value.asInstanceOf[js.Any])
    
    inline def setClientRequestTokenUndefined: Self = StObject.set(x, "ClientRequestToken", js.undefined)
    
    inline def setName(value: SensitiveString): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
  }
}
