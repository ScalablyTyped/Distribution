package typings.awsDashSdk.clientsChimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetGlobalSettingsResponse extends js.Object {
  /**
    * The Amazon Chime Business Calling settings.
    */
  var BusinessCalling: js.UndefOr[BusinessCallingSettings] = js.undefined
  /**
    * The Amazon Chime Voice Connector settings.
    */
  var VoiceConnector: js.UndefOr[VoiceConnectorSettings] = js.undefined
}

object GetGlobalSettingsResponse {
  @scala.inline
  def apply(BusinessCalling: BusinessCallingSettings = null, VoiceConnector: VoiceConnectorSettings = null): GetGlobalSettingsResponse = {
    val __obj = js.Dynamic.literal()
    if (BusinessCalling != null) __obj.updateDynamic("BusinessCalling")(BusinessCalling)
    if (VoiceConnector != null) __obj.updateDynamic("VoiceConnector")(VoiceConnector)
    __obj.asInstanceOf[GetGlobalSettingsResponse]
  }
}

