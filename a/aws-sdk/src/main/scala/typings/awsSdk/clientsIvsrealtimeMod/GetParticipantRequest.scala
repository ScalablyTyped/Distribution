package typings.awsSdk.clientsIvsrealtimeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetParticipantRequest extends StObject {
  
  /**
    * Unique identifier for the participant. This is assigned by IVS and returned by CreateParticipantToken.
    */
  var participantId: ParticipantId
  
  /**
    * ID of a session within the stage.
    */
  var sessionId: StageSessionId
  
  /**
    * Stage ARN.
    */
  var stageArn: StageArn
}
object GetParticipantRequest {
  
  inline def apply(participantId: ParticipantId, sessionId: StageSessionId, stageArn: StageArn): GetParticipantRequest = {
    val __obj = js.Dynamic.literal(participantId = participantId.asInstanceOf[js.Any], sessionId = sessionId.asInstanceOf[js.Any], stageArn = stageArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetParticipantRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetParticipantRequest] (val x: Self) extends AnyVal {
    
    inline def setParticipantId(value: ParticipantId): Self = StObject.set(x, "participantId", value.asInstanceOf[js.Any])
    
    inline def setSessionId(value: StageSessionId): Self = StObject.set(x, "sessionId", value.asInstanceOf[js.Any])
    
    inline def setStageArn(value: StageArn): Self = StObject.set(x, "stageArn", value.asInstanceOf[js.Any])
  }
}
