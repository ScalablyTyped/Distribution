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
  def apply(BusinessCalling: BusinessCallingSettings = null, VoiceConnector: VoiceConnectorSettings = null): GetGlobalSettingsResponse = {
    val __obj = js.Dynamic.literal()
    if (BusinessCalling != null) __obj.updateDynamic("BusinessCalling")(BusinessCalling.asInstanceOf[js.Any])
    if (VoiceConnector != null) __obj.updateDynamic("VoiceConnector")(VoiceConnector.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetGlobalSettingsResponse]
  }
}

