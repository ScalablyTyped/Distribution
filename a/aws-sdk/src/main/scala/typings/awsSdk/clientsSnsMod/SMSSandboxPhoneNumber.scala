package typings.awsSdk.clientsSnsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SMSSandboxPhoneNumber extends StObject {
  
  /**
    * The destination phone number.
    */
  var PhoneNumber: js.UndefOr[PhoneNumberString] = js.undefined
  
  /**
    * The destination phone number's verification status.
    */
  var Status: js.UndefOr[SMSSandboxPhoneNumberVerificationStatus] = js.undefined
}
object SMSSandboxPhoneNumber {
  
  inline def apply(): SMSSandboxPhoneNumber = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SMSSandboxPhoneNumber]
  }
  
  extension [Self <: SMSSandboxPhoneNumber](x: Self) {
    
    inline def setPhoneNumber(value: PhoneNumberString): Self = StObject.set(x, "PhoneNumber", value.asInstanceOf[js.Any])
    
    inline def setPhoneNumberUndefined: Self = StObject.set(x, "PhoneNumber", js.undefined)
    
    inline def setStatus(value: SMSSandboxPhoneNumberVerificationStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
  }
}
