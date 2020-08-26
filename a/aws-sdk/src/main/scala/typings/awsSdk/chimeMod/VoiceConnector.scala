package typings.awsSdk.chimeMod

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
  def apply(): VoiceConnector = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VoiceConnector]
  }
  @scala.inline
  implicit class VoiceConnectorOps[Self <: VoiceConnector] (val x: Self) extends AnyVal {
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
    def setAwsRegion(value: VoiceConnectorAwsRegion): Self = this.set("AwsRegion", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAwsRegion: Self = this.set("AwsRegion", js.undefined)
    @scala.inline
    def setCreatedTimestamp(value: Iso8601Timestamp): Self = this.set("CreatedTimestamp", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreatedTimestamp: Self = this.set("CreatedTimestamp", js.undefined)
    @scala.inline
    def setName(value: VoiceConnectorName): Self = this.set("Name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("Name", js.undefined)
    @scala.inline
    def setOutboundHostName(value: String): Self = this.set("OutboundHostName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOutboundHostName: Self = this.set("OutboundHostName", js.undefined)
    @scala.inline
    def setRequireEncryption(value: Boolean): Self = this.set("RequireEncryption", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRequireEncryption: Self = this.set("RequireEncryption", js.undefined)
    @scala.inline
    def setUpdatedTimestamp(value: Iso8601Timestamp): Self = this.set("UpdatedTimestamp", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUpdatedTimestamp: Self = this.set("UpdatedTimestamp", js.undefined)
    @scala.inline
    def setVoiceConnectorId(value: NonEmptyString): Self = this.set("VoiceConnectorId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVoiceConnectorId: Self = this.set("VoiceConnectorId", js.undefined)
  }
  
}

