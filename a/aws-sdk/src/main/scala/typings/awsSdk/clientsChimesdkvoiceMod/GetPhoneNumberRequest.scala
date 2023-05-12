package typings.awsSdk.clientsChimesdkvoiceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetPhoneNumberRequest extends StObject {
  
  /**
    * The phone number ID.
    */
  var PhoneNumberId: SensitiveNonEmptyString
}
object GetPhoneNumberRequest {
  
  inline def apply(PhoneNumberId: SensitiveNonEmptyString): GetPhoneNumberRequest = {
    val __obj = js.Dynamic.literal(PhoneNumberId = PhoneNumberId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetPhoneNumberRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetPhoneNumberRequest] (val x: Self) extends AnyVal {
    
    inline def setPhoneNumberId(value: SensitiveNonEmptyString): Self = StObject.set(x, "PhoneNumberId", value.asInstanceOf[js.Any])
  }
}
