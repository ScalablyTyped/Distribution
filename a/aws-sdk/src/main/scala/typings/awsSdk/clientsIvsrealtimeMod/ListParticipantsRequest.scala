package typings.awsSdk.clientsIvsrealtimeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListParticipantsRequest extends StObject {
  
  /**
    * Filters the response list to only show participants who published during the stage session. Only one of filterByUserId, filterByPublished, or filterByState can be provided per request.
    */
  var filterByPublished: js.UndefOr[Published] = js.undefined
  
  /**
    * Filters the response list to only show participants in the specified state. Only one of filterByUserId, filterByPublished, or filterByState can be provided per request.
    */
  var filterByState: js.UndefOr[ParticipantState] = js.undefined
  
  /**
    * Filters the response list to match the specified user ID. Only one of filterByUserId, filterByPublished, or filterByState can be provided per request. A userId is a customer-assigned name to help identify the token; this can be used to link a participant to a user in the customer’s own systems.
    */
  var filterByUserId: js.UndefOr[UserId] = js.undefined
  
  /**
    * Maximum number of results to return. Default: 50.
    */
  var maxResults: js.UndefOr[MaxParticipantResults] = js.undefined
  
  /**
    * The first participant to retrieve. This is used for pagination; see the nextToken response field.
    */
  var nextToken: js.UndefOr[PaginationToken] = js.undefined
  
  /**
    * ID of the session within the stage.
    */
  var sessionId: StageSessionId
  
  /**
    * Stage ARN.
    */
  var stageArn: StageArn
}
object ListParticipantsRequest {
  
  inline def apply(sessionId: StageSessionId, stageArn: StageArn): ListParticipantsRequest = {
    val __obj = js.Dynamic.literal(sessionId = sessionId.asInstanceOf[js.Any], stageArn = stageArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListParticipantsRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListParticipantsRequest] (val x: Self) extends AnyVal {
    
    inline def setFilterByPublished(value: Published): Self = StObject.set(x, "filterByPublished", value.asInstanceOf[js.Any])
    
    inline def setFilterByPublishedUndefined: Self = StObject.set(x, "filterByPublished", js.undefined)
    
    inline def setFilterByState(value: ParticipantState): Self = StObject.set(x, "filterByState", value.asInstanceOf[js.Any])
    
    inline def setFilterByStateUndefined: Self = StObject.set(x, "filterByState", js.undefined)
    
    inline def setFilterByUserId(value: UserId): Self = StObject.set(x, "filterByUserId", value.asInstanceOf[js.Any])
    
    inline def setFilterByUserIdUndefined: Self = StObject.set(x, "filterByUserId", js.undefined)
    
    inline def setMaxResults(value: MaxParticipantResults): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    inline def setNextToken(value: PaginationToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    inline def setSessionId(value: StageSessionId): Self = StObject.set(x, "sessionId", value.asInstanceOf[js.Any])
    
    inline def setStageArn(value: StageArn): Self = StObject.set(x, "stageArn", value.asInstanceOf[js.Any])
  }
}
