package typings.awsSdk.clientsChimesdkvoiceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PutVoiceConnectorTerminationRequest extends StObject {
  
  /**
    * The termination settings to be updated.
    */
  var Termination: typings.awsSdk.clientsChimesdkvoiceMod.Termination
  
  /**
    * The Voice Connector ID.
    */
  var VoiceConnectorId: NonEmptyString
}
object PutVoiceConnectorTerminationRequest {
  
  inline def apply(Termination: Termination, VoiceConnectorId: NonEmptyString): PutVoiceConnectorTerminationRequest = {
    val __obj = js.Dynamic.literal(Termination = Termination.asInstanceOf[js.Any], VoiceConnectorId = VoiceConnectorId.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutVoiceConnectorTerminationRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PutVoiceConnectorTerminationRequest] (val x: Self) extends AnyVal {
    
    inline def setTermination(value: Termination): Self = StObject.set(x, "Termination", value.asInstanceOf[js.Any])
    
    inline def setVoiceConnectorId(value: NonEmptyString): Self = StObject.set(x, "VoiceConnectorId", value.asInstanceOf[js.Any])
  }
}
