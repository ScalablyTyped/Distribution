package typings.awsSdk.clientsIvsrealtimeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListParticipantsResponse extends StObject {
  
  /**
    * If there are more rooms than maxResults, use nextToken in the request to get the next set.
    */
  var nextToken: js.UndefOr[PaginationToken] = js.undefined
  
  /**
    * List of the matching participants (summary information only).
    */
  var participants: ParticipantList
}
object ListParticipantsResponse {
  
  inline def apply(participants: ParticipantList): ListParticipantsResponse = {
    val __obj = js.Dynamic.literal(participants = participants.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListParticipantsResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListParticipantsResponse] (val x: Self) extends AnyVal {
    
    inline def setNextToken(value: PaginationToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    inline def setParticipants(value: ParticipantList): Self = StObject.set(x, "participants", value.asInstanceOf[js.Any])
    
    inline def setParticipantsVarargs(value: ParticipantSummary*): Self = StObject.set(x, "participants", js.Array(value*))
  }
}
