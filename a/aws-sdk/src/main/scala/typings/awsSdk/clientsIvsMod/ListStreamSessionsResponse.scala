package typings.awsSdk.clientsIvsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListStreamSessionsResponse extends StObject {
  
  /**
    * If there are more streams than maxResults, use nextToken in the request to get the next set.
    */
  var nextToken: js.UndefOr[PaginationToken] = js.undefined
  
  /**
    * List of stream sessions.
    */
  var streamSessions: StreamSessionList
}
object ListStreamSessionsResponse {
  
  inline def apply(streamSessions: StreamSessionList): ListStreamSessionsResponse = {
    val __obj = js.Dynamic.literal(streamSessions = streamSessions.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListStreamSessionsResponse]
  }
  
  extension [Self <: ListStreamSessionsResponse](x: Self) {
    
    inline def setNextToken(value: PaginationToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    inline def setStreamSessions(value: StreamSessionList): Self = StObject.set(x, "streamSessions", value.asInstanceOf[js.Any])
    
    inline def setStreamSessionsVarargs(value: StreamSessionSummary*): Self = StObject.set(x, "streamSessions", js.Array(value*))
  }
}
