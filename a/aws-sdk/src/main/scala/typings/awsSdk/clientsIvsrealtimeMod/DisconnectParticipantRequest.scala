package typings.awsSdk.clientsIvsrealtimeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DisconnectParticipantRequest extends StObject {
  
  /**
    * Identifier of the participant to be disconnected. This is assigned by IVS and returned by CreateParticipantToken.
    */
  var participantId: ParticipantTokenId
  
  /**
    * Description of why this participant is being disconnected.
    */
  var reason: js.UndefOr[DisconnectParticipantReason] = js.undefined
  
  /**
    * ARN of the stage to which the participant is attached.
    */
  var stageArn: StageArn
}
object DisconnectParticipantRequest {
  
  inline def apply(participantId: ParticipantTokenId, stageArn: StageArn): DisconnectParticipantRequest = {
    val __obj = js.Dynamic.literal(participantId = participantId.asInstanceOf[js.Any], stageArn = stageArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DisconnectParticipantRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DisconnectParticipantRequest] (val x: Self) extends AnyVal {
    
    inline def setParticipantId(value: ParticipantTokenId): Self = StObject.set(x, "participantId", value.asInstanceOf[js.Any])
    
    inline def setReason(value: DisconnectParticipantReason): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
    
    inline def setReasonUndefined: Self = StObject.set(x, "reason", js.undefined)
    
    inline def setStageArn(value: StageArn): Self = StObject.set(x, "stageArn", value.asInstanceOf[js.Any])
  }
}
