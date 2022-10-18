package typings.awsSdk.clientsSnsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VerifySMSSandboxPhoneNumberInput extends StObject {
  
  /**
    * The OTP sent to the destination number from the CreateSMSSandBoxPhoneNumber call.
    */
  var OneTimePassword: OTPCode
  
  /**
    * The destination phone number to verify.
    */
  var PhoneNumber: PhoneNumberString
}
object VerifySMSSandboxPhoneNumberInput {
  
  inline def apply(OneTimePassword: OTPCode, PhoneNumber: PhoneNumberString): VerifySMSSandboxPhoneNumberInput = {
    val __obj = js.Dynamic.literal(OneTimePassword = OneTimePassword.asInstanceOf[js.Any], PhoneNumber = PhoneNumber.asInstanceOf[js.Any])
    __obj.asInstanceOf[VerifySMSSandboxPhoneNumberInput]
  }
  
  extension [Self <: VerifySMSSandboxPhoneNumberInput](x: Self) {
    
    inline def setOneTimePassword(value: OTPCode): Self = StObject.set(x, "OneTimePassword", value.asInstanceOf[js.Any])
    
    inline def setPhoneNumber(value: PhoneNumberString): Self = StObject.set(x, "PhoneNumber", value.asInstanceOf[js.Any])
  }
}
