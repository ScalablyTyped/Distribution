package typings.awsSdk.chimeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RestorePhoneNumberRequest extends StObject {
  
  /**
    * The phone number.
    */
  var PhoneNumberId: NonEmptyString
}
object RestorePhoneNumberRequest {
  
  inline def apply(PhoneNumberId: NonEmptyString): RestorePhoneNumberRequest = {
    val __obj = js.Dynamic.literal(PhoneNumberId = PhoneNumberId.asInstanceOf[js.Any])
    __obj.asInstanceOf[RestorePhoneNumberRequest]
  }
  
  extension [Self <: RestorePhoneNumberRequest](x: Self) {
    
    inline def setPhoneNumberId(value: NonEmptyString): Self = StObject.set(x, "PhoneNumberId", value.asInstanceOf[js.Any])
  }
}
