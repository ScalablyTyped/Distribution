package typings.awsDashSdk.clientsChimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VoiceConnector extends js.Object {
  /**
    * The AWS Region in which the Amazon Chime Voice Connector is created. Default: us-east-1.
    */
  var AwsRegion: js.UndefOr[VoiceConnectorAwsRegion] = js.native
  /**
    * The Amazon Chime Voice Connector creation timestamp, in ISO 8601 format.
    */
  var CreatedTimestamp: js.UndefOr[Iso8601Timestamp] = js.native
  /**
    * The name of the Amazon Chime Voice Connector.
    */
  var Name: js.UndefOr[VoiceConnectorName] = js.native
  /**
    * The outbound host name for the Amazon Chime Voice Connector.
    */
  var OutboundHostName: js.UndefOr[String] = js.native
  /**
    * Designates whether encryption is required for the Amazon Chime Voice Connector.
    */
  var RequireEncryption: js.UndefOr[Boolean] = js.native
  /**
    * The updated Amazon Chime Voice Connector timestamp, in ISO 8601 format.
    */
  var UpdatedTimestamp: js.UndefOr[Iso8601Timestamp] = js.native
  /**
    * The Amazon Chime Voice Connector ID.
    */
  var VoiceConnectorId: js.UndefOr[NonEmptyString] = js.native
}

object VoiceConnector {
  @scala.inline
  def apply(
    AwsRegion: VoiceConnectorAwsRegion = null,
    CreatedTimestamp: Iso8601Timestamp = null,
    Name: VoiceConnectorName = null,
    OutboundHostName: String = null,
    RequireEncryption: js.UndefOr[scala.Boolean] = js.undefined,
    UpdatedTimestamp: Iso8601Timestamp = null,
    VoiceConnectorId: NonEmptyString = null
  ): VoiceConnector = {
    val __obj = js.Dynamic.literal()
    if (AwsRegion != null) __obj.updateDynamic("AwsRegion")(AwsRegion.asInstanceOf[js.Any])
    if (CreatedTimestamp != null) __obj.updateDynamic("CreatedTimestamp")(CreatedTimestamp.asInstanceOf[js.Any])
    if (Name != null) __obj.updateDynamic("Name")(Name.asInstanceOf[js.Any])
    if (OutboundHostName != null) __obj.updateDynamic("OutboundHostName")(OutboundHostName.asInstanceOf[js.Any])
    if (!js.isUndefined(RequireEncryption)) __obj.updateDynamic("RequireEncryption")(RequireEncryption.asInstanceOf[js.Any])
    if (UpdatedTimestamp != null) __obj.updateDynamic("UpdatedTimestamp")(UpdatedTimestamp.asInstanceOf[js.Any])
    if (VoiceConnectorId != null) __obj.updateDynamic("VoiceConnectorId")(VoiceConnectorId.asInstanceOf[js.Any])
    __obj.asInstanceOf[VoiceConnector]
  }
}

