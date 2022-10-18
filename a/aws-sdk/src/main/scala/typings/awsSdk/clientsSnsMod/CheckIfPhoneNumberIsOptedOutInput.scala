package typings.awsSdk.clientsSnsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CheckIfPhoneNumberIsOptedOutInput extends StObject {
  
  /**
    * The phone number for which you want to check the opt out status.
    */
  var phoneNumber: PhoneNumber
}
object CheckIfPhoneNumberIsOptedOutInput {
  
  inline def apply(phoneNumber: PhoneNumber): CheckIfPhoneNumberIsOptedOutInput = {
    val __obj = js.Dynamic.literal(phoneNumber = phoneNumber.asInstanceOf[js.Any])
    __obj.asInstanceOf[CheckIfPhoneNumberIsOptedOutInput]
  }
  
  extension [Self <: CheckIfPhoneNumberIsOptedOutInput](x: Self) {
    
    inline def setPhoneNumber(value: PhoneNumber): Self = StObject.set(x, "phoneNumber", value.asInstanceOf[js.Any])
  }
}
