package typings.awsSdk.chimeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetPhoneNumberRequest extends StObject {
  
  /**
    * The phone number ID.
    */
  var PhoneNumberId: String
}
object GetPhoneNumberRequest {
  
  inline def apply(PhoneNumberId: String): GetPhoneNumberRequest = {
    val __obj = js.Dynamic.literal(PhoneNumberId = PhoneNumberId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetPhoneNumberRequest]
  }
  
  extension [Self <: GetPhoneNumberRequest](x: Self) {
    
    inline def setPhoneNumberId(value: String): Self = StObject.set(x, "PhoneNumberId", value.asInstanceOf[js.Any])
  }
}
