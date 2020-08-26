package typings.awsSdk.chimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateVoiceConnectorRequest extends js.Object {
  /**
    * The AWS Region in which the Amazon Chime Voice Connector is created. Default value: us-east-1.
    */
  var AwsRegion: js.UndefOr[VoiceConnectorAwsRegion] = js.native
  /**
    * The name of the Amazon Chime Voice Connector.
    */
  var Name: VoiceConnectorName = js.native
  /**
    * When enabled, requires encryption for the Amazon Chime Voice Connector.
    */
  var RequireEncryption: Boolean = js.native
}

object CreateVoiceConnectorRequest {
  @scala.inline
  def apply(Name: VoiceConnectorName, RequireEncryption: Boolean): CreateVoiceConnectorRequest = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any], RequireEncryption = RequireEncryption.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateVoiceConnectorRequest]
  }
  @scala.inline
  implicit class CreateVoiceConnectorRequestOps[Self <: CreateVoiceConnectorRequest] (val x: Self) extends AnyVal {
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
    def setName(value: VoiceConnectorName): Self = this.set("Name", value.asInstanceOf[js.Any])
    @scala.inline
    def setRequireEncryption(value: Boolean): Self = this.set("RequireEncryption", value.asInstanceOf[js.Any])
    @scala.inline
    def setAwsRegion(value: VoiceConnectorAwsRegion): Self = this.set("AwsRegion", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAwsRegion: Self = this.set("AwsRegion", js.undefined)
  }
  
}

