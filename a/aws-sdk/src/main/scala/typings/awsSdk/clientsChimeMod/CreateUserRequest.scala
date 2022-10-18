package typings.awsSdk.clientsChimeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateUserRequest extends StObject {
  
  /**
    * The Amazon Chime account ID.
    */
  var AccountId: NonEmptyString
  
  /**
    * The user's email address.
    */
  var Email: js.UndefOr[EmailAddress] = js.undefined
  
  /**
    * The user type.
    */
  var UserType: js.UndefOr[typings.awsSdk.clientsChimeMod.UserType] = js.undefined
  
  /**
    * The user name.
    */
  var Username: js.UndefOr[String] = js.undefined
}
object CreateUserRequest {
  
  inline def apply(AccountId: NonEmptyString): CreateUserRequest = {
    val __obj = js.Dynamic.literal(AccountId = AccountId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateUserRequest]
  }
  
  extension [Self <: CreateUserRequest](x: Self) {
    
    inline def setAccountId(value: NonEmptyString): Self = StObject.set(x, "AccountId", value.asInstanceOf[js.Any])
    
    inline def setEmail(value: EmailAddress): Self = StObject.set(x, "Email", value.asInstanceOf[js.Any])
    
    inline def setEmailUndefined: Self = StObject.set(x, "Email", js.undefined)
    
    inline def setUserType(value: UserType): Self = StObject.set(x, "UserType", value.asInstanceOf[js.Any])
    
    inline def setUserTypeUndefined: Self = StObject.set(x, "UserType", js.undefined)
    
    inline def setUsername(value: String): Self = StObject.set(x, "Username", value.asInstanceOf[js.Any])
    
    inline def setUsernameUndefined: Self = StObject.set(x, "Username", js.undefined)
  }
}
