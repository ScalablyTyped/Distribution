package typings.awsSdk.chimeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PutVoiceConnectorProxyRequest extends StObject {
  
  /**
    * The default number of minutes allowed for proxy sessions.
    */
  var DefaultSessionExpiryMinutes: Integer
  
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
  var PhoneNumberPoolCountries: CountryList
  
  /**
    * The Amazon Chime voice connector ID.
    */
  var VoiceConnectorId: NonEmptyString128
}
object PutVoiceConnectorProxyRequest {
  
  @scala.inline
  def apply(
    DefaultSessionExpiryMinutes: Integer,
    PhoneNumberPoolCountries: CountryList,
    VoiceConnectorId: NonEmptyString128
  ): PutVoiceConnectorProxyRequest = {
    val __obj = js.Dynamic.literal(DefaultSessionExpiryMinutes = DefaultSessionExpiryMinutes.asInstanceOf[js.Any], PhoneNumberPoolCountries = PhoneNumberPoolCountries.asInstanceOf[js.Any], VoiceConnectorId = VoiceConnectorId.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutVoiceConnectorProxyRequest]
  }
  
  @scala.inline
  implicit class PutVoiceConnectorProxyRequestMutableBuilder[Self <: PutVoiceConnectorProxyRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDefaultSessionExpiryMinutes(value: Integer): Self = StObject.set(x, "DefaultSessionExpiryMinutes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisabled(value: Boolean): Self = StObject.set(x, "Disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisabledUndefined: Self = StObject.set(x, "Disabled", js.undefined)
    
    @scala.inline
    def setFallBackPhoneNumber(value: E164PhoneNumber): Self = StObject.set(x, "FallBackPhoneNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFallBackPhoneNumberUndefined: Self = StObject.set(x, "FallBackPhoneNumber", js.undefined)
    
    @scala.inline
    def setPhoneNumberPoolCountries(value: CountryList): Self = StObject.set(x, "PhoneNumberPoolCountries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPhoneNumberPoolCountriesVarargs(value: Country*): Self = StObject.set(x, "PhoneNumberPoolCountries", js.Array(value :_*))
    
    @scala.inline
    def setVoiceConnectorId(value: NonEmptyString128): Self = StObject.set(x, "VoiceConnectorId", value.asInstanceOf[js.Any])
  }
}
