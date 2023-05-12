package typings.awsSdk.clientsChimesdkvoiceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetVoiceToneAnalysisTaskRequest extends StObject {
  
  /**
    * Specifies whether the voice being analyzed is the caller (originator) or the callee (responder).
    */
  var IsCaller: Boolean
  
  /**
    * The Voice Connector ID.
    */
  var VoiceConnectorId: NonEmptyString128
  
  /**
    * The ID of the voice tone anlysis task.
    */
  var VoiceToneAnalysisTaskId: NonEmptyString256
}
object GetVoiceToneAnalysisTaskRequest {
  
  inline def apply(IsCaller: Boolean, VoiceConnectorId: NonEmptyString128, VoiceToneAnalysisTaskId: NonEmptyString256): GetVoiceToneAnalysisTaskRequest = {
    val __obj = js.Dynamic.literal(IsCaller = IsCaller.asInstanceOf[js.Any], VoiceConnectorId = VoiceConnectorId.asInstanceOf[js.Any], VoiceToneAnalysisTaskId = VoiceToneAnalysisTaskId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetVoiceToneAnalysisTaskRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetVoiceToneAnalysisTaskRequest] (val x: Self) extends AnyVal {
    
    inline def setIsCaller(value: Boolean): Self = StObject.set(x, "IsCaller", value.asInstanceOf[js.Any])
    
    inline def setVoiceConnectorId(value: NonEmptyString128): Self = StObject.set(x, "VoiceConnectorId", value.asInstanceOf[js.Any])
    
    inline def setVoiceToneAnalysisTaskId(value: NonEmptyString256): Self = StObject.set(x, "VoiceToneAnalysisTaskId", value.asInstanceOf[js.Any])
  }
}
