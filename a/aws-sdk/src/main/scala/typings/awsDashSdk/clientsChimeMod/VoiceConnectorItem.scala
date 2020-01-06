package typings.awsDashSdk.clientsChimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VoiceConnectorItem extends js.Object {
  /**
    * The priority associated with the Amazon Chime Voice Connector, with 1 being the highest priority. Higher priority Amazon Chime Voice Connectors are attempted first. 
    */
  var Priority: VoiceConnectorItemPriority = js.native
  /**
    * The Amazon Chime Voice Connector ID.
    */
  var VoiceConnectorId: NonEmptyString = js.native
}

object VoiceConnectorItem {
  @scala.inline
  def apply(Priority: VoiceConnectorItemPriority, VoiceConnectorId: NonEmptyString): VoiceConnectorItem = {
    val __obj = js.Dynamic.literal(Priority = Priority.asInstanceOf[js.Any], VoiceConnectorId = VoiceConnectorId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[VoiceConnectorItem]
  }
}

