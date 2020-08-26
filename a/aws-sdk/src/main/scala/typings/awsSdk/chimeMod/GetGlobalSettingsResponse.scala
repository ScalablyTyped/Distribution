package typings.awsSdk.chimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetGlobalSettingsResponse extends js.Object {
  /**
    * The Amazon Chime Business Calling settings.
    */
  var BusinessCalling: js.UndefOr[BusinessCallingSettings] = js.native
  /**
    * The Amazon Chime Voice Connector settings.
    */
  var VoiceConnector: js.UndefOr[VoiceConnectorSettings] = js.native
}

object GetGlobalSettingsResponse {
  @scala.inline
  def apply(): GetGlobalSettingsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetGlobalSettingsResponse]
  }
  @scala.inline
  implicit class GetGlobalSettingsResponseOps[Self <: GetGlobalSettingsResponse] (val x: Self) extends AnyVal {
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
    def deleteBusinessCalling: Self = this.set("BusinessCalling", js.undefined)
    @scala.inline
    def setVoiceConnector(value: VoiceConnectorSettings): Self = this.set("VoiceConnector", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVoiceConnector: Self = this.set("VoiceConnector", js.undefined)
  }
  
}

