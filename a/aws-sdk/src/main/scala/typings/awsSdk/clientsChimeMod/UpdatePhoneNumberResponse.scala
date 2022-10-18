package typings.awsSdk.clientsChimeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdatePhoneNumberResponse extends StObject {
  
  /**
    * The updated phone number details.
    */
  var PhoneNumber: js.UndefOr[typings.awsSdk.clientsChimeMod.PhoneNumber] = js.undefined
}
object UpdatePhoneNumberResponse {
  
  inline def apply(): UpdatePhoneNumberResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdatePhoneNumberResponse]
  }
  
  extension [Self <: UpdatePhoneNumberResponse](x: Self) {
    
    inline def setPhoneNumber(value: PhoneNumber): Self = StObject.set(x, "PhoneNumber", value.asInstanceOf[js.Any])
    
    inline def setPhoneNumberUndefined: Self = StObject.set(x, "PhoneNumber", js.undefined)
  }
}
