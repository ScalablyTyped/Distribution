package typings.awsSdk.chimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PutVoiceConnectorProxyRequest extends js.Object {
  
  /**
    * The default number of minutes allowed for proxy sessions.
    */
  var DefaultSessionExpiryMinutes: Integer = js.native
  
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
  var PhoneNumberPoolCountries: CountryList = js.native
  
  /**
    * The Amazon Chime voice connector ID.
    */
  var VoiceConnectorId: NonEmptyString128 = js.native
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
  implicit class PutVoiceConnectorProxyRequestOps[Self <: PutVoiceConnectorProxyRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDefaultSessionExpiryMinutes(value: Integer): Self = this.set("DefaultSessionExpiryMinutes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPhoneNumberPoolCountriesVarargs(value: Country*): Self = this.set("PhoneNumberPoolCountries", js.Array(value :_*))
    
    @scala.inline
    def setPhoneNumberPoolCountries(value: CountryList): Self = this.set("PhoneNumberPoolCountries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVoiceConnectorId(value: NonEmptyString128): Self = this.set("VoiceConnectorId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisabled(value: Boolean): Self = this.set("Disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisabled: Self = this.set("Disabled", js.undefined)
    
    @scala.inline
    def setFallBackPhoneNumber(value: E164PhoneNumber): Self = this.set("FallBackPhoneNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFallBackPhoneNumber: Self = this.set("FallBackPhoneNumber", js.undefined)
  }
}
