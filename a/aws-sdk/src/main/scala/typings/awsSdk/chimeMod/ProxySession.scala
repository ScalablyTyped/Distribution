package typings.awsSdk.chimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ProxySession extends js.Object {
  var Capabilities: js.UndefOr[CapabilityList] = js.native
  var CreatedTimestamp: js.UndefOr[Iso8601Timestamp] = js.native
  var EndedTimestamp: js.UndefOr[Iso8601Timestamp] = js.native
  var ExpiryMinutes: js.UndefOr[PositiveInteger] = js.native
  var GeoMatchLevel: js.UndefOr[typings.awsSdk.chimeMod.GeoMatchLevel] = js.native
  var GeoMatchParams: js.UndefOr[typings.awsSdk.chimeMod.GeoMatchParams] = js.native
  var Name: js.UndefOr[String128] = js.native
  var NumberSelectionBehavior: js.UndefOr[typings.awsSdk.chimeMod.NumberSelectionBehavior] = js.native
  var Participants: js.UndefOr[typings.awsSdk.chimeMod.Participants] = js.native
  var ProxySessionId: js.UndefOr[NonEmptyString128] = js.native
  var Status: js.UndefOr[ProxySessionStatus] = js.native
  var UpdatedTimestamp: js.UndefOr[Iso8601Timestamp] = js.native
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

