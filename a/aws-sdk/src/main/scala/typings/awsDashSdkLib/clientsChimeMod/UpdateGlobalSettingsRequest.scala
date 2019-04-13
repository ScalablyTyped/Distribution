package typings
package awsDashSdkLib.clientsChimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateGlobalSettingsRequest extends js.Object {
  /**
    * The Amazon Chime Business Calling settings.
    */
  var BusinessCalling: BusinessCallingSettings
  /**
    * The Amazon Chime Voice Connector settings.
    */
  var VoiceConnector: VoiceConnectorSettings
}

object UpdateGlobalSettingsRequest {
  @scala.inline
  def apply(BusinessCalling: BusinessCallingSettings, VoiceConnector: VoiceConnectorSettings): UpdateGlobalSettingsRequest = {
    val __obj = js.Dynamic.literal(BusinessCalling = BusinessCalling, VoiceConnector = VoiceConnector)
  
    __obj.asInstanceOf[UpdateGlobalSettingsRequest]
  }
}

