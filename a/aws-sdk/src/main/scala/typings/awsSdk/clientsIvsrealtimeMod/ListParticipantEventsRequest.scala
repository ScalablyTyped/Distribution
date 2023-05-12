package typings.awsSdk.clientsIvsrealtimeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListParticipantEventsRequest extends StObject {
  
  /**
    * Maximum number of results to return. Default: 50.
    */
  var maxResults: js.UndefOr[MaxParticipantEventResults] = js.undefined
  
  /**
    * The first participant to retrieve. This is used for pagination; see the nextToken response field.
    */
  var nextToken: js.UndefOr[PaginationToken] = js.undefined
  
  /**
    * Unique identifier for this participant. This is assigned by IVS and returned by CreateParticipantToken.
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
object ListParticipantEventsRequest {
  
  inline def apply(participantId: ParticipantId, sessionId: StageSessionId, stageArn: StageArn): ListParticipantEventsRequest = {
    val __obj = js.Dynamic.literal(participantId = participantId.asInstanceOf[js.Any], sessionId = sessionId.asInstanceOf[js.Any], stageArn = stageArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListParticipantEventsRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListParticipantEventsRequest] (val x: Self) extends AnyVal {
    
    inline def setMaxResults(value: MaxParticipantEventResults): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    inline def setNextToken(value: PaginationToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    inline def setParticipantId(value: ParticipantId): Self = StObject.set(x, "participantId", value.asInstanceOf[js.Any])
    
    inline def setSessionId(value: StageSessionId): Self = StObject.set(x, "sessionId", value.asInstanceOf[js.Any])
    
    inline def setStageArn(value: StageArn): Self = StObject.set(x, "stageArn", value.asInstanceOf[js.Any])
  }
}
