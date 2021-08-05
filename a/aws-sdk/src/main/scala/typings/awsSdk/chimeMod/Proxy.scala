package typings.awsSdk.chimeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Proxy extends StObject {
  
  /**
    * The default number of minutes allowed for proxy sessions.
    */
  var DefaultSessionExpiryMinutes: js.UndefOr[Integer] = js.undefined
  
  /**
    * When true, stops proxy sessions from being created on the specified Amazon Chime Voice Connector.
    */
  var Disabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The phone number to route calls to after a proxy session expires.
    */
  var FallBackPhoneNumber: js.UndefOr[E164PhoneNumber] = js.undefined
  
  /**
    * The countries for proxy phone numbers to be selected from.
    */
  var PhoneNumberCountries: js.UndefOr[StringList] = js.undefined
}
object Proxy {
  
  inline def apply(): Proxy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Proxy]
  }
  
  extension [Self <: Proxy](x: Self) {
    
    inline def setDefaultSessionExpiryMinutes(value: Integer): Self = StObject.set(x, "DefaultSessionExpiryMinutes", value.asInstanceOf[js.Any])
    
    inline def setDefaultSessionExpiryMinutesUndefined: Self = StObject.set(x, "DefaultSessionExpiryMinutes", js.undefined)
    
    inline def setDisabled(value: Boolean): Self = StObject.set(x, "Disabled", value.asInstanceOf[js.Any])
    
    inline def setDisabledUndefined: Self = StObject.set(x, "Disabled", js.undefined)
    
    inline def setFallBackPhoneNumber(value: E164PhoneNumber): Self = StObject.set(x, "FallBackPhoneNumber", value.asInstanceOf[js.Any])
    
    inline def setFallBackPhoneNumberUndefined: Self = StObject.set(x, "FallBackPhoneNumber", js.undefined)
    
    inline def setPhoneNumberCountries(value: StringList): Self = StObject.set(x, "PhoneNumberCountries", value.asInstanceOf[js.Any])
    
    inline def setPhoneNumberCountriesUndefined: Self = StObject.set(x, "PhoneNumberCountries", js.undefined)
    
    inline def setPhoneNumberCountriesVarargs(value: String*): Self = StObject.set(x, "PhoneNumberCountries", js.Array(value :_*))
  }
}
