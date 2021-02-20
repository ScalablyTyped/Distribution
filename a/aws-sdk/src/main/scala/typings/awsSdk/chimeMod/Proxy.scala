package typings.awsSdk.chimeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Proxy extends StObject {
  
  /**
    * The default number of minutes allowed for proxy sessions.
    */
  var DefaultSessionExpiryMinutes: js.UndefOr[Integer] = js.native
  
  /**
    * When true, stops proxy sessions from being created on the specified Amazon Chime Voice Connector.
    */
  var Disabled: js.UndefOr[Boolean] = js.native
  
  /**
    * The phone number to route calls to after a proxy session expires.
    */
  var FallBackPhoneNumber: js.UndefOr[E164PhoneNumber] = js.native
  
  /**
    * The countries for proxy phone numbers to be selected from.
    */
  var PhoneNumberCountries: js.UndefOr[StringList] = js.native
}
object Proxy {
  
  @scala.inline
  def apply(): Proxy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Proxy]
  }
  
  @scala.inline
  implicit class ProxyMutableBuilder[Self <: Proxy] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDefaultSessionExpiryMinutes(value: Integer): Self = StObject.set(x, "DefaultSessionExpiryMinutes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultSessionExpiryMinutesUndefined: Self = StObject.set(x, "DefaultSessionExpiryMinutes", js.undefined)
    
    @scala.inline
    def setDisabled(value: Boolean): Self = StObject.set(x, "Disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisabledUndefined: Self = StObject.set(x, "Disabled", js.undefined)
    
    @scala.inline
    def setFallBackPhoneNumber(value: E164PhoneNumber): Self = StObject.set(x, "FallBackPhoneNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFallBackPhoneNumberUndefined: Self = StObject.set(x, "FallBackPhoneNumber", js.undefined)
    
    @scala.inline
    def setPhoneNumberCountries(value: StringList): Self = StObject.set(x, "PhoneNumberCountries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPhoneNumberCountriesUndefined: Self = StObject.set(x, "PhoneNumberCountries", js.undefined)
    
    @scala.inline
    def setPhoneNumberCountriesVarargs(value: String*): Self = StObject.set(x, "PhoneNumberCountries", js.Array(value :_*))
  }
}
