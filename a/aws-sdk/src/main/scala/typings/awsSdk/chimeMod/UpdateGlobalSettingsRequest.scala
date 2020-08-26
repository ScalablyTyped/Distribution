package typings.awsSdk.chimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateGlobalSettingsRequest extends js.Object {
  /**
    * The Amazon Chime Business Calling settings.
    */
  var BusinessCalling: BusinessCallingSettings = js.native
  /**
    * The Amazon Chime Voice Connector settings.
    */
  var VoiceConnector: VoiceConnectorSettings = js.native
}

object UpdateGlobalSettingsRequest {
  @scala.inline
  def apply(BusinessCalling: BusinessCallingSettings, VoiceConnector: VoiceConnectorSettings): UpdateGlobalSettingsRequest = {
    val __obj = js.Dynamic.literal(BusinessCalling = BusinessCalling.asInstanceOf[js.Any], VoiceConnector = VoiceConnector.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateGlobalSettingsRequest]
  }
  @scala.inline
  implicit class UpdateGlobalSettingsRequestOps[Self <: UpdateGlobalSettingsRequest] (val x: Self) extends AnyVal {
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
    def setBusinessCalling(value: BusinessCallingSettings): Self = this.set("BusinessCalling", value.asInstanceOf[js.Any])
    @scala.inline
    def setVoiceConnector(value: VoiceConnectorSettings): Self = this.set("VoiceConnector", value.asInstanceOf[js.Any])
  }
  
}

