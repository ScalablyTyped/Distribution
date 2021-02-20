package typings.awsSdk.chimeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListVoiceConnectorTerminationCredentialsRequest extends StObject {
  
  /**
    * The Amazon Chime Voice Connector ID.
    */
  var VoiceConnectorId: NonEmptyString = js.native
}
object ListVoiceConnectorTerminationCredentialsRequest {
  
  @scala.inline
  def apply(VoiceConnectorId: NonEmptyString): ListVoiceConnectorTerminationCredentialsRequest = {
    val __obj = js.Dynamic.literal(VoiceConnectorId = VoiceConnectorId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListVoiceConnectorTerminationCredentialsRequest]
  }
  
  @scala.inline
  implicit class ListVoiceConnectorTerminationCredentialsRequestMutableBuilder[Self <: ListVoiceConnectorTerminationCredentialsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setVoiceConnectorId(value: NonEmptyString): Self = StObject.set(x, "VoiceConnectorId", value.asInstanceOf[js.Any])
  }
}
