package typings.awsSdk.clientsNimbleMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListStreamingSessionsResponse extends StObject {
  
  /**
    * The token for the next set of results, or null if there are no more results.
    */
  var nextToken: js.UndefOr[String] = js.undefined
  
  /**
    * A collection of streaming sessions.
    */
  var sessions: js.UndefOr[StreamingSessionList] = js.undefined
}
object ListStreamingSessionsResponse {
  
  inline def apply(): ListStreamingSessionsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListStreamingSessionsResponse]
  }
  
  extension [Self <: ListStreamingSessionsResponse](x: Self) {
    
    inline def setNextToken(value: String): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    inline def setSessions(value: StreamingSessionList): Self = StObject.set(x, "sessions", value.asInstanceOf[js.Any])
    
    inline def setSessionsUndefined: Self = StObject.set(x, "sessions", js.undefined)
    
    inline def setSessionsVarargs(value: StreamingSession*): Self = StObject.set(x, "sessions", js.Array(value*))
  }
}
