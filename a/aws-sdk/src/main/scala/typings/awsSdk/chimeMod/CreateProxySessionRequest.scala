package typings.awsSdk.chimeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateProxySessionRequest extends StObject {
  
  /**
    * The proxy session capabilities.
    */
  var Capabilities: CapabilityList = js.native
  
  /**
    * The number of minutes allowed for the proxy session.
    */
  var ExpiryMinutes: js.UndefOr[PositiveInteger] = js.native
  
  /**
    * The preference for matching the country or area code of the proxy phone number with that of the first participant.
    */
  var GeoMatchLevel: js.UndefOr[typings.awsSdk.chimeMod.GeoMatchLevel] = js.native
  
  /**
    * The country and area code for the proxy phone number.
    */
  var GeoMatchParams: js.UndefOr[typings.awsSdk.chimeMod.GeoMatchParams] = js.native
  
  /**
    * The name of the proxy session.
    */
  var Name: js.UndefOr[ProxySessionNameString] = js.native
  
  /**
    * The preference for proxy phone number reuse, or stickiness, between the same participants across sessions.
    */
  var NumberSelectionBehavior: js.UndefOr[typings.awsSdk.chimeMod.NumberSelectionBehavior] = js.native
  
  /**
    * The participant phone numbers.
    */
  var ParticipantPhoneNumbers: ParticipantPhoneNumberList = js.native
  
  /**
    * The Amazon Chime voice connector ID.
    */
  var VoiceConnectorId: NonEmptyString128 = js.native
}
object CreateProxySessionRequest {
  
  @scala.inline
  def apply(
    Capabilities: CapabilityList,
    ParticipantPhoneNumbers: ParticipantPhoneNumberList,
    VoiceConnectorId: NonEmptyString128
  ): CreateProxySessionRequest = {
    val __obj = js.Dynamic.literal(Capabilities = Capabilities.asInstanceOf[js.Any], ParticipantPhoneNumbers = ParticipantPhoneNumbers.asInstanceOf[js.Any], VoiceConnectorId = VoiceConnectorId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateProxySessionRequest]
  }
  
  @scala.inline
  implicit class CreateProxySessionRequestMutableBuilder[Self <: CreateProxySessionRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCapabilities(value: CapabilityList): Self = StObject.set(x, "Capabilities", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCapabilitiesVarargs(value: Capability*): Self = StObject.set(x, "Capabilities", js.Array(value :_*))
    
    @scala.inline
    def setExpiryMinutes(value: PositiveInteger): Self = StObject.set(x, "ExpiryMinutes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpiryMinutesUndefined: Self = StObject.set(x, "ExpiryMinutes", js.undefined)
    
    @scala.inline
    def setGeoMatchLevel(value: GeoMatchLevel): Self = StObject.set(x, "GeoMatchLevel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGeoMatchLevelUndefined: Self = StObject.set(x, "GeoMatchLevel", js.undefined)
    
    @scala.inline
    def setGeoMatchParams(value: GeoMatchParams): Self = StObject.set(x, "GeoMatchParams", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGeoMatchParamsUndefined: Self = StObject.set(x, "GeoMatchParams", js.undefined)
    
    @scala.inline
    def setName(value: ProxySessionNameString): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    @scala.inline
    def setNumberSelectionBehavior(value: NumberSelectionBehavior): Self = StObject.set(x, "NumberSelectionBehavior", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumberSelectionBehaviorUndefined: Self = StObject.set(x, "NumberSelectionBehavior", js.undefined)
    
    @scala.inline
    def setParticipantPhoneNumbers(value: ParticipantPhoneNumberList): Self = StObject.set(x, "ParticipantPhoneNumbers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParticipantPhoneNumbersVarargs(value: E164PhoneNumber*): Self = StObject.set(x, "ParticipantPhoneNumbers", js.Array(value :_*))
    
    @scala.inline
    def setVoiceConnectorId(value: NonEmptyString128): Self = StObject.set(x, "VoiceConnectorId", value.asInstanceOf[js.Any])
  }
}
