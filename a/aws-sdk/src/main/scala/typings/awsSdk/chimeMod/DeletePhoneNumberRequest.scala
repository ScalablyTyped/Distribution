package typings.awsSdk.chimeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeletePhoneNumberRequest extends StObject {
  
  /**
    * The phone number ID.
    */
  var PhoneNumberId: String
}
object DeletePhoneNumberRequest {
  
  inline def apply(PhoneNumberId: String): DeletePhoneNumberRequest = {
    val __obj = js.Dynamic.literal(PhoneNumberId = PhoneNumberId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeletePhoneNumberRequest]
  }
  
  extension [Self <: DeletePhoneNumberRequest](x: Self) {
    
    inline def setPhoneNumberId(value: String): Self = StObject.set(x, "PhoneNumberId", value.asInstanceOf[js.Any])
  }
}
