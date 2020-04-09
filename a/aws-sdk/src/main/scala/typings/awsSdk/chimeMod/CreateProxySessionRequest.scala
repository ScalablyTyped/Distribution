package typings.awsSdk.chimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateProxySessionRequest extends js.Object {
  var Capabilities: CapabilityList = js.native
  var ExpiryMinutes: js.UndefOr[PositiveInteger] = js.native
  var GeoMatchLevel: js.UndefOr[typings.awsSdk.chimeMod.GeoMatchLevel] = js.native
  var GeoMatchParams: js.UndefOr[typings.awsSdk.chimeMod.GeoMatchParams] = js.native
  var Name: js.UndefOr[ProxySessionNameString] = js.native
  var NumberSelectionBehavior: js.UndefOr[typings.awsSdk.chimeMod.NumberSelectionBehavior] = js.native
  var ParticipantPhoneNumbers: ParticipantPhoneNumberList = js.native
  var VoiceConnectorId: NonEmptyString128 = js.native
}

object CreateProxySessionRequest {
  @scala.inline
  def apply(
    Capabilities: CapabilityList,
    ParticipantPhoneNumbers: ParticipantPhoneNumberList,
    VoiceConnectorId: NonEmptyString128,
    ExpiryMinutes: Int | Double = null,
    GeoMatchLevel: GeoMatchLevel = null,
    GeoMatchParams: GeoMatchParams = null,
    Name: ProxySessionNameString = null,
    NumberSelectionBehavior: NumberSelectionBehavior = null
  ): CreateProxySessionRequest = {
    val __obj = js.Dynamic.literal(Capabilities = Capabilities.asInstanceOf[js.Any], ParticipantPhoneNumbers = ParticipantPhoneNumbers.asInstanceOf[js.Any], VoiceConnectorId = VoiceConnectorId.asInstanceOf[js.Any])
    if (ExpiryMinutes != null) __obj.updateDynamic("ExpiryMinutes")(ExpiryMinutes.asInstanceOf[js.Any])
    if (GeoMatchLevel != null) __obj.updateDynamic("GeoMatchLevel")(GeoMatchLevel.asInstanceOf[js.Any])
    if (GeoMatchParams != null) __obj.updateDynamic("GeoMatchParams")(GeoMatchParams.asInstanceOf[js.Any])
    if (Name != null) __obj.updateDynamic("Name")(Name.asInstanceOf[js.Any])
    if (NumberSelectionBehavior != null) __obj.updateDynamic("NumberSelectionBehavior")(NumberSelectionBehavior.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateProxySessionRequest]
  }
}

