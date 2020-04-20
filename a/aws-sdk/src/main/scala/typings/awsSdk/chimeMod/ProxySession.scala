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
  def apply(
    Capabilities: CapabilityList = null,
    CreatedTimestamp: Iso8601Timestamp = null,
    EndedTimestamp: Iso8601Timestamp = null,
    ExpiryMinutes: Int | Double = null,
    GeoMatchLevel: GeoMatchLevel = null,
    GeoMatchParams: GeoMatchParams = null,
    Name: String128 = null,
    NumberSelectionBehavior: NumberSelectionBehavior = null,
    Participants: Participants = null,
    ProxySessionId: NonEmptyString128 = null,
    Status: ProxySessionStatus = null,
    UpdatedTimestamp: Iso8601Timestamp = null,
    VoiceConnectorId: NonEmptyString128 = null
  ): ProxySession = {
    val __obj = js.Dynamic.literal()
    if (Capabilities != null) __obj.updateDynamic("Capabilities")(Capabilities.asInstanceOf[js.Any])
    if (CreatedTimestamp != null) __obj.updateDynamic("CreatedTimestamp")(CreatedTimestamp.asInstanceOf[js.Any])
    if (EndedTimestamp != null) __obj.updateDynamic("EndedTimestamp")(EndedTimestamp.asInstanceOf[js.Any])
    if (ExpiryMinutes != null) __obj.updateDynamic("ExpiryMinutes")(ExpiryMinutes.asInstanceOf[js.Any])
    if (GeoMatchLevel != null) __obj.updateDynamic("GeoMatchLevel")(GeoMatchLevel.asInstanceOf[js.Any])
    if (GeoMatchParams != null) __obj.updateDynamic("GeoMatchParams")(GeoMatchParams.asInstanceOf[js.Any])
    if (Name != null) __obj.updateDynamic("Name")(Name.asInstanceOf[js.Any])
    if (NumberSelectionBehavior != null) __obj.updateDynamic("NumberSelectionBehavior")(NumberSelectionBehavior.asInstanceOf[js.Any])
    if (Participants != null) __obj.updateDynamic("Participants")(Participants.asInstanceOf[js.Any])
    if (ProxySessionId != null) __obj.updateDynamic("ProxySessionId")(ProxySessionId.asInstanceOf[js.Any])
    if (Status != null) __obj.updateDynamic("Status")(Status.asInstanceOf[js.Any])
    if (UpdatedTimestamp != null) __obj.updateDynamic("UpdatedTimestamp")(UpdatedTimestamp.asInstanceOf[js.Any])
    if (VoiceConnectorId != null) __obj.updateDynamic("VoiceConnectorId")(VoiceConnectorId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProxySession]
  }
}

