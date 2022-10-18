package typings.awsSdk.clientsSnsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OptInPhoneNumberInput extends StObject {
  
  /**
    * The phone number to opt in. Use E.164 format.
    */
  var phoneNumber: PhoneNumber
}
object OptInPhoneNumberInput {
  
  inline def apply(phoneNumber: PhoneNumber): OptInPhoneNumberInput = {
    val __obj = js.Dynamic.literal(phoneNumber = phoneNumber.asInstanceOf[js.Any])
    __obj.asInstanceOf[OptInPhoneNumberInput]
  }
  
  extension [Self <: OptInPhoneNumberInput](x: Self) {
    
    inline def setPhoneNumber(value: PhoneNumber): Self = StObject.set(x, "phoneNumber", value.asInstanceOf[js.Any])
  }
}
