package typings.awsSdk.clientsChimeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AssociatePhoneNumberWithUserRequest extends StObject {
  
  /**
    * The Amazon Chime account ID.
    */
  var AccountId: String
  
  /**
    * The phone number, in E.164 format.
    */
  var E164PhoneNumber: typings.awsSdk.clientsChimeMod.E164PhoneNumber
  
  /**
    * The user ID.
    */
  var UserId: String
}
object AssociatePhoneNumberWithUserRequest {
  
  inline def apply(AccountId: String, E164PhoneNumber: E164PhoneNumber, UserId: String): AssociatePhoneNumberWithUserRequest = {
    val __obj = js.Dynamic.literal(AccountId = AccountId.asInstanceOf[js.Any], E164PhoneNumber = E164PhoneNumber.asInstanceOf[js.Any], UserId = UserId.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssociatePhoneNumberWithUserRequest]
  }
  
  extension [Self <: AssociatePhoneNumberWithUserRequest](x: Self) {
    
    inline def setAccountId(value: String): Self = StObject.set(x, "AccountId", value.asInstanceOf[js.Any])
    
    inline def setE164PhoneNumber(value: E164PhoneNumber): Self = StObject.set(x, "E164PhoneNumber", value.asInstanceOf[js.Any])
    
    inline def setUserId(value: String): Self = StObject.set(x, "UserId", value.asInstanceOf[js.Any])
  }
}
