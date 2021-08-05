package typings.awsSdk.alexaforbusinessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PhoneNumber extends StObject {
  
  /**
    * The raw value of the phone number.
    */
  var Number: RawPhoneNumber
  
  /**
    * The type of the phone number.
    */
  var Type: PhoneNumberType
}
object PhoneNumber {
  
  inline def apply(Number: RawPhoneNumber, Type: PhoneNumberType): PhoneNumber = {
    val __obj = js.Dynamic.literal(Number = Number.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any])
    __obj.asInstanceOf[PhoneNumber]
  }
  
  extension [Self <: PhoneNumber](x: Self) {
    
    inline def setNumber(value: RawPhoneNumber): Self = StObject.set(x, "Number", value.asInstanceOf[js.Any])
    
    inline def setType(value: PhoneNumberType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
  }
}
