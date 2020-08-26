package typings.awsSdk.chimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ProxySession extends js.Object {
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
  implicit class ProxySessionOps[Self <: ProxySession] (val x: Self) extends AnyVal {
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
    def setCapabilitiesVarargs(value: Capability*): Self = this.set("Capabilities", js.Array(value :_*))
    @scala.inline
    def setCapabilities(value: CapabilityList): Self = this.set("Capabilities", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCapabilities: Self = this.set("Capabilities", js.undefined)
    @scala.inline
    def setCreatedTimestamp(value: Iso8601Timestamp): Self = this.set("CreatedTimestamp", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreatedTimestamp: Self = this.set("CreatedTimestamp", js.undefined)
    @scala.inline
    def setEndedTimestamp(value: Iso8601Timestamp): Self = this.set("EndedTimestamp", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEndedTimestamp: Self = this.set("EndedTimestamp", js.undefined)
    @scala.inline
    def setExpiryMinutes(value: PositiveInteger): Self = this.set("ExpiryMinutes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExpiryMinutes: Self = this.set("ExpiryMinutes", js.undefined)
    @scala.inline
    def setGeoMatchLevel(value: GeoMatchLevel): Self = this.set("GeoMatchLevel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGeoMatchLevel: Self = this.set("GeoMatchLevel", js.undefined)
    @scala.inline
    def setGeoMatchParams(value: GeoMatchParams): Self = this.set("GeoMatchParams", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGeoMatchParams: Self = this.set("GeoMatchParams", js.undefined)
    @scala.inline
    def setName(value: String128): Self = this.set("Name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("Name", js.undefined)
    @scala.inline
    def setNumberSelectionBehavior(value: NumberSelectionBehavior): Self = this.set("NumberSelectionBehavior", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNumberSelectionBehavior: Self = this.set("NumberSelectionBehavior", js.undefined)
    @scala.inline
    def setParticipantsVarargs(value: Participant*): Self = this.set("Participants", js.Array(value :_*))
    @scala.inline
    def setParticipants(value: Participants): Self = this.set("Participants", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteParticipants: Self = this.set("Participants", js.undefined)
    @scala.inline
    def setProxySessionId(value: NonEmptyString128): Self = this.set("ProxySessionId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProxySessionId: Self = this.set("ProxySessionId", js.undefined)
    @scala.inline
    def setStatus(value: ProxySessionStatus): Self = this.set("Status", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatus: Self = this.set("Status", js.undefined)
    @scala.inline
    def setUpdatedTimestamp(value: Iso8601Timestamp): Self = this.set("UpdatedTimestamp", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUpdatedTimestamp: Self = this.set("UpdatedTimestamp", js.undefined)
    @scala.inline
    def setVoiceConnectorId(value: NonEmptyString128): Self = this.set("VoiceConnectorId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVoiceConnectorId: Self = this.set("VoiceConnectorId", js.undefined)
  }
  
}

