package typings
package awsDashSdkLib.clientsChimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PutVoiceConnectorOriginationRequest extends js.Object {
  /**
    * The origination setting details to add.
    */
  var Origination: awsDashSdkLib.clientsChimeMod.Origination
  /**
    * The Amazon Chime Voice Connector ID.
    */
  var VoiceConnectorId: NonEmptyString
}

object PutVoiceConnectorOriginationRequest {
  @scala.inline
  def apply(Origination: Origination, VoiceConnectorId: NonEmptyString): PutVoiceConnectorOriginationRequest = {
    val __obj = js.Dynamic.literal(Origination = Origination, VoiceConnectorId = VoiceConnectorId)
  
    __obj.asInstanceOf[PutVoiceConnectorOriginationRequest]
  }
}

