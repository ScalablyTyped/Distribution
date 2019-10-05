package typings.awsDashSdk.clientsChimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VoiceConnector extends js.Object {
  /**
    * The Amazon Chime Voice Connector creation timestamp, in ISO 8601 format.
    */
  var CreatedTimestamp: js.UndefOr[Iso8601Timestamp] = js.undefined
  /**
    * The name of the Amazon Chime Voice Connector.
    */
  var Name: js.UndefOr[VoiceConnectorName] = js.undefined
  /**
    * The outbound host name for the Amazon Chime Voice Connector.
    */
  var OutboundHostName: js.UndefOr[String] = js.undefined
  /**
    * Designates whether encryption is required for the Amazon Chime Voice Connector.
    */
  var RequireEncryption: js.UndefOr[Boolean] = js.undefined
  /**
    * The updated Amazon Chime Voice Connector timestamp, in ISO 8601 format.
    */
  var UpdatedTimestamp: js.UndefOr[Iso8601Timestamp] = js.undefined
  /**
    * The Amazon Chime Voice Connector ID.
    */
  var VoiceConnectorId: js.UndefOr[NonEmptyString] = js.undefined
}

object VoiceConnector {
  @scala.inline
  def apply(
    CreatedTimestamp: Iso8601Timestamp = null,
    Name: VoiceConnectorName = null,
    OutboundHostName: String = null,
    RequireEncryption: js.UndefOr[scala.Boolean] = js.undefined,
    UpdatedTimestamp: Iso8601Timestamp = null,
    VoiceConnectorId: NonEmptyString = null
  ): VoiceConnector = {
    val __obj = js.Dynamic.literal()
    if (CreatedTimestamp != null) __obj.updateDynamic("CreatedTimestamp")(CreatedTimestamp)
    if (Name != null) __obj.updateDynamic("Name")(Name)
    if (OutboundHostName != null) __obj.updateDynamic("OutboundHostName")(OutboundHostName)
    if (!js.isUndefined(RequireEncryption)) __obj.updateDynamic("RequireEncryption")(RequireEncryption)
    if (UpdatedTimestamp != null) __obj.updateDynamic("UpdatedTimestamp")(UpdatedTimestamp)
    if (VoiceConnectorId != null) __obj.updateDynamic("VoiceConnectorId")(VoiceConnectorId)
    __obj.asInstanceOf[VoiceConnector]
  }
}

