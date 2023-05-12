package typings.awsSdk.clientsChimesdkvoiceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StopVoiceToneAnalysisTaskRequest extends StObject {
  
  /**
    * The Voice Connector ID.
    */
  var VoiceConnectorId: NonEmptyString128
  
  /**
    * The ID of the voice tone analysis task.
    */
  var VoiceToneAnalysisTaskId: NonEmptyString256
}
object StopVoiceToneAnalysisTaskRequest {
  
  inline def apply(VoiceConnectorId: NonEmptyString128, VoiceToneAnalysisTaskId: NonEmptyString256): StopVoiceToneAnalysisTaskRequest = {
    val __obj = js.Dynamic.literal(VoiceConnectorId = VoiceConnectorId.asInstanceOf[js.Any], VoiceToneAnalysisTaskId = VoiceToneAnalysisTaskId.asInstanceOf[js.Any])
    __obj.asInstanceOf[StopVoiceToneAnalysisTaskRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StopVoiceToneAnalysisTaskRequest] (val x: Self) extends AnyVal {
    
    inline def setVoiceConnectorId(value: NonEmptyString128): Self = StObject.set(x, "VoiceConnectorId", value.asInstanceOf[js.Any])
    
    inline def setVoiceToneAnalysisTaskId(value: NonEmptyString256): Self = StObject.set(x, "VoiceToneAnalysisTaskId", value.asInstanceOf[js.Any])
  }
}
