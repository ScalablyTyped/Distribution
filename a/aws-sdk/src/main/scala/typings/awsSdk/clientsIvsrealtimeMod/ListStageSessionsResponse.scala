package typings.awsSdk.clientsIvsrealtimeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListStageSessionsResponse extends StObject {
  
  /**
    * If there are more rooms than maxResults, use nextToken in the request to get the next set.
    */
  var nextToken: js.UndefOr[PaginationToken] = js.undefined
  
  /**
    * List of matching stage sessions.
    */
  var stageSessions: StageSessionList
}
object ListStageSessionsResponse {
  
  inline def apply(stageSessions: StageSessionList): ListStageSessionsResponse = {
    val __obj = js.Dynamic.literal(stageSessions = stageSessions.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListStageSessionsResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListStageSessionsResponse] (val x: Self) extends AnyVal {
    
    inline def setNextToken(value: PaginationToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    inline def setStageSessions(value: StageSessionList): Self = StObject.set(x, "stageSessions", value.asInstanceOf[js.Any])
    
    inline def setStageSessionsVarargs(value: StageSessionSummary*): Self = StObject.set(x, "stageSessions", js.Array(value*))
  }
}
