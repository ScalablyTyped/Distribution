package typings.awsDashSdk.clientsChimeMod

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
}

