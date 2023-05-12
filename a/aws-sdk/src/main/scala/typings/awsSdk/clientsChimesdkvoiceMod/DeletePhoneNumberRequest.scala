package typings.awsSdk.clientsChimesdkvoiceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeletePhoneNumberRequest extends StObject {
  
  /**
    * The phone number ID.
    */
  var PhoneNumberId: SensitiveNonEmptyString
}
object DeletePhoneNumberRequest {
  
  inline def apply(PhoneNumberId: SensitiveNonEmptyString): DeletePhoneNumberRequest = {
    val __obj = js.Dynamic.literal(PhoneNumberId = PhoneNumberId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeletePhoneNumberRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeletePhoneNumberRequest] (val x: Self) extends AnyVal {
    
    inline def setPhoneNumberId(value: SensitiveNonEmptyString): Self = StObject.set(x, "PhoneNumberId", value.asInstanceOf[js.Any])
  }
}
