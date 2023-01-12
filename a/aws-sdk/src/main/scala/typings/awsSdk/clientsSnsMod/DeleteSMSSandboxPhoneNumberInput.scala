package typings.awsSdk.clientsSnsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteSMSSandboxPhoneNumberInput extends StObject {
  
  /**
    * The destination phone number to delete.
    */
  var PhoneNumber: PhoneNumberString
}
object DeleteSMSSandboxPhoneNumberInput {
  
  inline def apply(PhoneNumber: PhoneNumberString): DeleteSMSSandboxPhoneNumberInput = {
    val __obj = js.Dynamic.literal(PhoneNumber = PhoneNumber.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteSMSSandboxPhoneNumberInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteSMSSandboxPhoneNumberInput] (val x: Self) extends AnyVal {
    
    inline def setPhoneNumber(value: PhoneNumberString): Self = StObject.set(x, "PhoneNumber", value.asInstanceOf[js.Any])
  }
}
