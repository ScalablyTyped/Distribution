package typings.awsSdk.chimeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateProxySessionRequest extends StObject {
  
  /**
    * The proxy session capabilities.
    */
  var Capabilities: CapabilityList
  
  /**
    * The number of minutes allowed for the proxy session.
    */
  var ExpiryMinutes: js.UndefOr[PositiveInteger] = js.undefined
  
  /**
    * The preference for matching the country or area code of the proxy phone number with that of the first participant.
    */
  var GeoMatchLevel: js.UndefOr[typings.awsSdk.chimeMod.GeoMatchLevel] = js.undefined
  
  /**
    * The country and area code for the proxy phone number.
    */
  var GeoMatchParams: js.UndefOr[typings.awsSdk.chimeMod.GeoMatchParams] = js.undefined
  
  /**
    * The name of the proxy session.
    */
  var Name: js.UndefOr[ProxySessionNameString] = js.undefined
  
  /**
    * The preference for proxy phone number reuse, or stickiness, between the same participants across sessions.
    */
  var NumberSelectionBehavior: js.UndefOr[typings.awsSdk.chimeMod.NumberSelectionBehavior] = js.undefined
  
  /**
    * The participant phone numbers.
    */
  var ParticipantPhoneNumbers: ParticipantPhoneNumberList
  
  /**
    * The Amazon Chime voice connector ID.
    */
  var VoiceConnectorId: NonEmptyString128
}
object CreateProxySessionRequest {
  
  inline def apply(
    Capabilities: CapabilityList,
    ParticipantPhoneNumbers: ParticipantPhoneNumberList,
    VoiceConnectorId: NonEmptyString128
  ): CreateProxySessionRequest = {
    val __obj = js.Dynamic.literal(Capabilities = Capabilities.asInstanceOf[js.Any], ParticipantPhoneNumbers = ParticipantPhoneNumbers.asInstanceOf[js.Any], VoiceConnectorId = VoiceConnectorId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateProxySessionRequest]
  }
  
  extension [Self <: CreateProxySessionRequest](x: Self) {
    
    inline def setCapabilities(value: CapabilityList): Self = StObject.set(x, "Capabilities", value.asInstanceOf[js.Any])
    
    inline def setCapabilitiesVarargs(value: Capability*): Self = StObject.set(x, "Capabilities", js.Array(value*))
    
    inline def setExpiryMinutes(value: PositiveInteger): Self = StObject.set(x, "ExpiryMinutes", value.asInstanceOf[js.Any])
    
    inline def setExpiryMinutesUndefined: Self = StObject.set(x, "ExpiryMinutes", js.undefined)
    
    inline def setGeoMatchLevel(value: GeoMatchLevel): Self = StObject.set(x, "GeoMatchLevel", value.asInstanceOf[js.Any])
    
    inline def setGeoMatchLevelUndefined: Self = StObject.set(x, "GeoMatchLevel", js.undefined)
    
    inline def setGeoMatchParams(value: GeoMatchParams): Self = StObject.set(x, "GeoMatchParams", value.asInstanceOf[js.Any])
    
    inline def setGeoMatchParamsUndefined: Self = StObject.set(x, "GeoMatchParams", js.undefined)
    
    inline def setName(value: ProxySessionNameString): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    inline def setNumberSelectionBehavior(value: NumberSelectionBehavior): Self = StObject.set(x, "NumberSelectionBehavior", value.asInstanceOf[js.Any])
    
    inline def setNumberSelectionBehaviorUndefined: Self = StObject.set(x, "NumberSelectionBehavior", js.undefined)
    
    inline def setParticipantPhoneNumbers(value: ParticipantPhoneNumberList): Self = StObject.set(x, "ParticipantPhoneNumbers", value.asInstanceOf[js.Any])
    
    inline def setParticipantPhoneNumbersVarargs(value: E164PhoneNumber*): Self = StObject.set(x, "ParticipantPhoneNumbers", js.Array(value*))
    
    inline def setVoiceConnectorId(value: NonEmptyString128): Self = StObject.set(x, "VoiceConnectorId", value.asInstanceOf[js.Any])
  }
}
