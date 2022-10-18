package typings.awsSdk.clientsChimeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetPhoneNumberResponse extends StObject {
  
  /**
    * The phone number details.
    */
  var PhoneNumber: js.UndefOr[typings.awsSdk.clientsChimeMod.PhoneNumber] = js.undefined
}
object GetPhoneNumberResponse {
  
  inline def apply(): GetPhoneNumberResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetPhoneNumberResponse]
  }
  
  extension [Self <: GetPhoneNumberResponse](x: Self) {
    
    inline def setPhoneNumber(value: PhoneNumber): Self = StObject.set(x, "PhoneNumber", value.asInstanceOf[js.Any])
    
    inline def setPhoneNumberUndefined: Self = StObject.set(x, "PhoneNumber", js.undefined)
  }
}
