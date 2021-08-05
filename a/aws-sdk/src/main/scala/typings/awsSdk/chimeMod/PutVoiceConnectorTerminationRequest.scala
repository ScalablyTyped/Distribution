package typings.awsSdk.chimeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PutVoiceConnectorTerminationRequest extends StObject {
  
  /**
    * The termination setting details to add.
    */
  var Termination: typings.awsSdk.chimeMod.Termination
  
  /**
    * The Amazon Chime Voice Connector ID.
    */
  var VoiceConnectorId: NonEmptyString
}
object PutVoiceConnectorTerminationRequest {
  
  inline def apply(Termination: Termination, VoiceConnectorId: NonEmptyString): PutVoiceConnectorTerminationRequest = {
    val __obj = js.Dynamic.literal(Termination = Termination.asInstanceOf[js.Any], VoiceConnectorId = VoiceConnectorId.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutVoiceConnectorTerminationRequest]
  }
  
  extension [Self <: PutVoiceConnectorTerminationRequest](x: Self) {
    
    inline def setTermination(value: Termination): Self = StObject.set(x, "Termination", value.asInstanceOf[js.Any])
    
    inline def setVoiceConnectorId(value: NonEmptyString): Self = StObject.set(x, "VoiceConnectorId", value.asInstanceOf[js.Any])
  }
}
