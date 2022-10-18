package typings.awsSdk.clientsChimeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DNISEmergencyCallingConfiguration extends StObject {
  
  /**
    * The country from which emergency calls are allowed, in ISO 3166-1 alpha-2 format.
    */
  var CallingCountry: Alpha2CountryCode
  
  /**
    * The DNIS phone number to route emergency calls to, in E.164 format.
    */
  var EmergencyPhoneNumber: E164PhoneNumber
  
  /**
    * The DNIS phone number to route test emergency calls to, in E.164 format.
    */
  var TestPhoneNumber: js.UndefOr[E164PhoneNumber] = js.undefined
}
object DNISEmergencyCallingConfiguration {
  
  inline def apply(CallingCountry: Alpha2CountryCode, EmergencyPhoneNumber: E164PhoneNumber): DNISEmergencyCallingConfiguration = {
    val __obj = js.Dynamic.literal(CallingCountry = CallingCountry.asInstanceOf[js.Any], EmergencyPhoneNumber = EmergencyPhoneNumber.asInstanceOf[js.Any])
    __obj.asInstanceOf[DNISEmergencyCallingConfiguration]
  }
  
  extension [Self <: DNISEmergencyCallingConfiguration](x: Self) {
    
    inline def setCallingCountry(value: Alpha2CountryCode): Self = StObject.set(x, "CallingCountry", value.asInstanceOf[js.Any])
    
    inline def setEmergencyPhoneNumber(value: E164PhoneNumber): Self = StObject.set(x, "EmergencyPhoneNumber", value.asInstanceOf[js.Any])
    
    inline def setTestPhoneNumber(value: E164PhoneNumber): Self = StObject.set(x, "TestPhoneNumber", value.asInstanceOf[js.Any])
    
    inline def setTestPhoneNumberUndefined: Self = StObject.set(x, "TestPhoneNumber", js.undefined)
  }
}
