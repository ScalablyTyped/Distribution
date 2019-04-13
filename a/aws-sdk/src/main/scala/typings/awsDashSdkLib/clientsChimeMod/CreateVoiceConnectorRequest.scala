package typings
package awsDashSdkLib.clientsChimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateVoiceConnectorRequest extends js.Object {
  /**
    * The name of the Amazon Chime Voice Connector.
    */
  var Name: VoiceConnectorName
  /**
    * When enabled, requires encryption for the Amazon Chime Voice Connector.
    */
  var RequireEncryption: Boolean
}

object CreateVoiceConnectorRequest {
  @scala.inline
  def apply(Name: VoiceConnectorName, RequireEncryption: Boolean): CreateVoiceConnectorRequest = {
    val __obj = js.Dynamic.literal(Name = Name, RequireEncryption = RequireEncryption)
  
    __obj.asInstanceOf[CreateVoiceConnectorRequest]
  }
}

