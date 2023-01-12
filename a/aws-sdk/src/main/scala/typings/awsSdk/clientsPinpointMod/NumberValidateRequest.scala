package typings.awsSdk.clientsPinpointMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NumberValidateRequest extends StObject {
  
  /**
    * The two-character code, in ISO 3166-1 alpha-2 format, for the country or region where the phone number was originally registered.
    */
  var IsoCountryCode: js.UndefOr[string] = js.undefined
  
  /**
    * The phone number to retrieve information about. The phone number that you provide should include a valid numeric country code. Otherwise, the operation might result in an error.
    */
  var PhoneNumber: js.UndefOr[string] = js.undefined
}
object NumberValidateRequest {
  
  inline def apply(): NumberValidateRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NumberValidateRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NumberValidateRequest] (val x: Self) extends AnyVal {
    
    inline def setIsoCountryCode(value: string): Self = StObject.set(x, "IsoCountryCode", value.asInstanceOf[js.Any])
    
    inline def setIsoCountryCodeUndefined: Self = StObject.set(x, "IsoCountryCode", js.undefined)
    
    inline def setPhoneNumber(value: string): Self = StObject.set(x, "PhoneNumber", value.asInstanceOf[js.Any])
    
    inline def setPhoneNumberUndefined: Self = StObject.set(x, "PhoneNumber", js.undefined)
  }
}
