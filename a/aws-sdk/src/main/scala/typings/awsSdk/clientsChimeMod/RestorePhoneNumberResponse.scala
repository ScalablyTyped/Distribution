package typings.awsSdk.clientsChimeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RestorePhoneNumberResponse extends StObject {
  
  /**
    * The phone number details.
    */
  var PhoneNumber: js.UndefOr[typings.awsSdk.clientsChimeMod.PhoneNumber] = js.undefined
}
object RestorePhoneNumberResponse {
  
  inline def apply(): RestorePhoneNumberResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RestorePhoneNumberResponse]
  }
  
  extension [Self <: RestorePhoneNumberResponse](x: Self) {
    
    inline def setPhoneNumber(value: PhoneNumber): Self = StObject.set(x, "PhoneNumber", value.asInstanceOf[js.Any])
    
    inline def setPhoneNumberUndefined: Self = StObject.set(x, "PhoneNumber", js.undefined)
  }
}
