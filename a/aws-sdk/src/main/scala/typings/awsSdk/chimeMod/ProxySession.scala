package typings.awsSdk.chimeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProxySession extends StObject {
  
  /**
    * The proxy session capabilities.
    */
  var Capabilities: js.UndefOr[CapabilityList] = js.undefined
  
  /**
    * The created timestamp, in ISO 8601 format.
    */
  var CreatedTimestamp: js.UndefOr[Iso8601Timestamp] = js.undefined
  
  /**
    * The ended timestamp, in ISO 8601 format.
    */
  var EndedTimestamp: js.UndefOr[Iso8601Timestamp] = js.undefined
  
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
  var Name: js.UndefOr[String128] = js.undefined
  
  /**
    * The preference for proxy phone number reuse, or stickiness, between the same participants across sessions.
    */
  var NumberSelectionBehavior: js.UndefOr[typings.awsSdk.chimeMod.NumberSelectionBehavior] = js.undefined
  
  /**
    * The proxy session participants.
    */
  var Participants: js.UndefOr[typings.awsSdk.chimeMod.Participants] = js.undefined
  
  /**
    * The proxy session ID.
    */
  var ProxySessionId: js.UndefOr[NonEmptyString128] = js.undefined
  
  /**
    * The status of the proxy session.
    */
  var Status: js.UndefOr[ProxySessionStatus] = js.undefined
  
  /**
    * The updated timestamp, in ISO 8601 format.
    */
  var UpdatedTimestamp: js.UndefOr[Iso8601Timestamp] = js.undefined
  
  /**
    * The Amazon Chime voice connector ID.
    */
  var VoiceConnectorId: js.UndefOr[NonEmptyString128] = js.undefined
}
object ProxySession {
  
  inline def apply(): ProxySession = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProxySession]
  }
  
  extension [Self <: ProxySession](x: Self) {
    
    inline def setCapabilities(value: CapabilityList): Self = StObject.set(x, "Capabilities", value.asInstanceOf[js.Any])
    
    inline def setCapabilitiesUndefined: Self = StObject.set(x, "Capabilities", js.undefined)
    
    inline def setCapabilitiesVarargs(value: Capability*): Self = StObject.set(x, "Capabilities", js.Array(value :_*))
    
    inline def setCreatedTimestamp(value: Iso8601Timestamp): Self = StObject.set(x, "CreatedTimestamp", value.asInstanceOf[js.Any])
    
    inline def setCreatedTimestampUndefined: Self = StObject.set(x, "CreatedTimestamp", js.undefined)
    
    inline def setEndedTimestamp(value: Iso8601Timestamp): Self = StObject.set(x, "EndedTimestamp", value.asInstanceOf[js.Any])
    
    inline def setEndedTimestampUndefined: Self = StObject.set(x, "EndedTimestamp", js.undefined)
    
    inline def setExpiryMinutes(value: PositiveInteger): Self = StObject.set(x, "ExpiryMinutes", value.asInstanceOf[js.Any])
    
    inline def setExpiryMinutesUndefined: Self = StObject.set(x, "ExpiryMinutes", js.undefined)
    
    inline def setGeoMatchLevel(value: GeoMatchLevel): Self = StObject.set(x, "GeoMatchLevel", value.asInstanceOf[js.Any])
    
    inline def setGeoMatchLevelUndefined: Self = StObject.set(x, "GeoMatchLevel", js.undefined)
    
    inline def setGeoMatchParams(value: GeoMatchParams): Self = StObject.set(x, "GeoMatchParams", value.asInstanceOf[js.Any])
    
    inline def setGeoMatchParamsUndefined: Self = StObject.set(x, "GeoMatchParams", js.undefined)
    
    inline def setName(value: String128): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    inline def setNumberSelectionBehavior(value: NumberSelectionBehavior): Self = StObject.set(x, "NumberSelectionBehavior", value.asInstanceOf[js.Any])
    
    inline def setNumberSelectionBehaviorUndefined: Self = StObject.set(x, "NumberSelectionBehavior", js.undefined)
    
    inline def setParticipants(value: Participants): Self = StObject.set(x, "Participants", value.asInstanceOf[js.Any])
    
    inline def setParticipantsUndefined: Self = StObject.set(x, "Participants", js.undefined)
    
    inline def setParticipantsVarargs(value: Participant*): Self = StObject.set(x, "Participants", js.Array(value :_*))
    
    inline def setProxySessionId(value: NonEmptyString128): Self = StObject.set(x, "ProxySessionId", value.asInstanceOf[js.Any])
    
    inline def setProxySessionIdUndefined: Self = StObject.set(x, "ProxySessionId", js.undefined)
    
    inline def setStatus(value: ProxySessionStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
    
    inline def setUpdatedTimestamp(value: Iso8601Timestamp): Self = StObject.set(x, "UpdatedTimestamp", value.asInstanceOf[js.Any])
    
    inline def setUpdatedTimestampUndefined: Self = StObject.set(x, "UpdatedTimestamp", js.undefined)
    
    inline def setVoiceConnectorId(value: NonEmptyString128): Self = StObject.set(x, "VoiceConnectorId", value.asInstanceOf[js.Any])
    
    inline def setVoiceConnectorIdUndefined: Self = StObject.set(x, "VoiceConnectorId", js.undefined)
  }
}
