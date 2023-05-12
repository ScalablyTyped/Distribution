package typings.awsSdk.clientsIvsrealtimeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListParticipantEventsResponse extends StObject {
  
  /**
    * List of the matching events.
    */
  var events: EventList
  
  /**
    * If there are more rooms than maxResults, use nextToken in the request to get the next set. 
    */
  var nextToken: js.UndefOr[PaginationToken] = js.undefined
}
object ListParticipantEventsResponse {
  
  inline def apply(events: EventList): ListParticipantEventsResponse = {
    val __obj = js.Dynamic.literal(events = events.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListParticipantEventsResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListParticipantEventsResponse] (val x: Self) extends AnyVal {
    
    inline def setEvents(value: EventList): Self = StObject.set(x, "events", value.asInstanceOf[js.Any])
    
    inline def setEventsVarargs(value: Event*): Self = StObject.set(x, "events", js.Array(value*))
    
    inline def setNextToken(value: PaginationToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
