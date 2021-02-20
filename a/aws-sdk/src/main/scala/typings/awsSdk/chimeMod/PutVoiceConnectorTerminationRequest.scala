package typings.awsSdk.chimeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PutVoiceConnectorTerminationRequest extends StObject {
  
  /**
    * The termination setting details to add.
    */
  var Termination: typings.awsSdk.chimeMod.Termination = js.native
  
  /**
    * The Amazon Chime Voice Connector ID.
    */
  var VoiceConnectorId: NonEmptyString = js.native
}
object PutVoiceConnectorTerminationRequest {
  
  @scala.inline
  def apply(Termination: Termination, VoiceConnectorId: NonEmptyString): PutVoiceConnectorTerminationRequest = {
    val __obj = js.Dynamic.literal(Termination = Termination.asInstanceOf[js.Any], VoiceConnectorId = VoiceConnectorId.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutVoiceConnectorTerminationRequest]
  }
  
  @scala.inline
  implicit class PutVoiceConnectorTerminationRequestMutableBuilder[Self <: PutVoiceConnectorTerminationRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTermination(value: Termination): Self = StObject.set(x, "Termination", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVoiceConnectorId(value: NonEmptyString): Self = StObject.set(x, "VoiceConnectorId", value.asInstanceOf[js.Any])
  }
}
