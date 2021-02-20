package typings.awsSdk.chimeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DNISEmergencyCallingConfiguration extends StObject {
  
  /**
    * The country from which emergency calls are allowed, in ISO 3166-1 alpha-2 format.
    */
  var CallingCountry: Alpha2CountryCode = js.native
  
  /**
    * The DNIS phone number to route emergency calls to, in E.164 format.
    */
  var EmergencyPhoneNumber: E164PhoneNumber = js.native
  
  /**
    * The DNIS phone number to route test emergency calls to, in E.164 format.
    */
  var TestPhoneNumber: js.UndefOr[E164PhoneNumber] = js.native
}
object DNISEmergencyCallingConfiguration {
  
  @scala.inline
  def apply(CallingCountry: Alpha2CountryCode, EmergencyPhoneNumber: E164PhoneNumber): DNISEmergencyCallingConfiguration = {
    val __obj = js.Dynamic.literal(CallingCountry = CallingCountry.asInstanceOf[js.Any], EmergencyPhoneNumber = EmergencyPhoneNumber.asInstanceOf[js.Any])
    __obj.asInstanceOf[DNISEmergencyCallingConfiguration]
  }
  
  @scala.inline
  implicit class DNISEmergencyCallingConfigurationMutableBuilder[Self <: DNISEmergencyCallingConfiguration] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCallingCountry(value: Alpha2CountryCode): Self = StObject.set(x, "CallingCountry", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmergencyPhoneNumber(value: E164PhoneNumber): Self = StObject.set(x, "EmergencyPhoneNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTestPhoneNumber(value: E164PhoneNumber): Self = StObject.set(x, "TestPhoneNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTestPhoneNumberUndefined: Self = StObject.set(x, "TestPhoneNumber", js.undefined)
  }
}
