package typings.awsSdk.chimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateProxySessionRequest extends js.Object {
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
    VoiceConnectorId: NonEmptyString128,
    ExpiryMinutes: js.UndefOr[PositiveInteger] = js.undefined,
    GeoMatchLevel: GeoMatchLevel = null,
    GeoMatchParams: GeoMatchParams = null,
    Name: ProxySessionNameString = null,
    NumberSelectionBehavior: NumberSelectionBehavior = null
  ): CreateProxySessionRequest = {
    val __obj = js.Dynamic.literal(Capabilities = Capabilities.asInstanceOf[js.Any], ParticipantPhoneNumbers = ParticipantPhoneNumbers.asInstanceOf[js.Any], VoiceConnectorId = VoiceConnectorId.asInstanceOf[js.Any])
    if (!js.isUndefined(ExpiryMinutes)) __obj.updateDynamic("ExpiryMinutes")(ExpiryMinutes.get.asInstanceOf[js.Any])
    if (GeoMatchLevel != null) __obj.updateDynamic("GeoMatchLevel")(GeoMatchLevel.asInstanceOf[js.Any])
    if (GeoMatchParams != null) __obj.updateDynamic("GeoMatchParams")(GeoMatchParams.asInstanceOf[js.Any])
    if (Name != null) __obj.updateDynamic("Name")(Name.asInstanceOf[js.Any])
    if (NumberSelectionBehavior != null) __obj.updateDynamic("NumberSelectionBehavior")(NumberSelectionBehavior.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateProxySessionRequest]
  }
}

