package typings.awsSdk.chimeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ProxySession extends StObject {
  
  /**
    * The proxy session capabilities.
    */
  var Capabilities: js.UndefOr[CapabilityList] = js.native
  
  /**
    * The created timestamp, in ISO 8601 format.
    */
  var CreatedTimestamp: js.UndefOr[Iso8601Timestamp] = js.native
  
  /**
    * The ended timestamp, in ISO 8601 format.
    */
  var EndedTimestamp: js.UndefOr[Iso8601Timestamp] = js.native
  
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
  var Name: js.UndefOr[String128] = js.native
  
  /**
    * The preference for proxy phone number reuse, or stickiness, between the same participants across sessions.
    */
  var NumberSelectionBehavior: js.UndefOr[typings.awsSdk.chimeMod.NumberSelectionBehavior] = js.native
  
  /**
    * The proxy session participants.
    */
  var Participants: js.UndefOr[typings.awsSdk.chimeMod.Participants] = js.native
  
  /**
    * The proxy session ID.
    */
  var ProxySessionId: js.UndefOr[NonEmptyString128] = js.native
  
  /**
    * The status of the proxy session.
    */
  var Status: js.UndefOr[ProxySessionStatus] = js.native
  
  /**
    * The updated timestamp, in ISO 8601 format.
    */
  var UpdatedTimestamp: js.UndefOr[Iso8601Timestamp] = js.native
  
  /**
    * The Amazon Chime voice connector ID.
    */
  var VoiceConnectorId: js.UndefOr[NonEmptyString128] = js.native
}
object ProxySession {
  
  @scala.inline
  def apply(): ProxySession = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProxySession]
  }
  
  @scala.inline
  implicit class ProxySessionMutableBuilder[Self <: ProxySession] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCapabilities(value: CapabilityList): Self = StObject.set(x, "Capabilities", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCapabilitiesUndefined: Self = StObject.set(x, "Capabilities", js.undefined)
    
    @scala.inline
    def setCapabilitiesVarargs(value: Capability*): Self = StObject.set(x, "Capabilities", js.Array(value :_*))
    
    @scala.inline
    def setCreatedTimestamp(value: Iso8601Timestamp): Self = StObject.set(x, "CreatedTimestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreatedTimestampUndefined: Self = StObject.set(x, "CreatedTimestamp", js.undefined)
    
    @scala.inline
    def setEndedTimestamp(value: Iso8601Timestamp): Self = StObject.set(x, "EndedTimestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndedTimestampUndefined: Self = StObject.set(x, "EndedTimestamp", js.undefined)
    
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
    def setName(value: String128): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    @scala.inline
    def setNumberSelectionBehavior(value: NumberSelectionBehavior): Self = StObject.set(x, "NumberSelectionBehavior", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumberSelectionBehaviorUndefined: Self = StObject.set(x, "NumberSelectionBehavior", js.undefined)
    
    @scala.inline
    def setParticipants(value: Participants): Self = StObject.set(x, "Participants", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParticipantsUndefined: Self = StObject.set(x, "Participants", js.undefined)
    
    @scala.inline
    def setParticipantsVarargs(value: Participant*): Self = StObject.set(x, "Participants", js.Array(value :_*))
    
    @scala.inline
    def setProxySessionId(value: NonEmptyString128): Self = StObject.set(x, "ProxySessionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProxySessionIdUndefined: Self = StObject.set(x, "ProxySessionId", js.undefined)
    
    @scala.inline
    def setStatus(value: ProxySessionStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
    
    @scala.inline
    def setUpdatedTimestamp(value: Iso8601Timestamp): Self = StObject.set(x, "UpdatedTimestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdatedTimestampUndefined: Self = StObject.set(x, "UpdatedTimestamp", js.undefined)
    
    @scala.inline
    def setVoiceConnectorId(value: NonEmptyString128): Self = StObject.set(x, "VoiceConnectorId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVoiceConnectorIdUndefined: Self = StObject.set(x, "VoiceConnectorId", js.undefined)
  }
}
