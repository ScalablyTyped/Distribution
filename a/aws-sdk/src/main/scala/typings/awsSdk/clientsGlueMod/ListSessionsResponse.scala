package typings.awsSdk.clientsGlueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListSessionsResponse extends StObject {
  
  /**
    * Returns the ID of the session. 
    */
  var Ids: js.UndefOr[SessionIdList] = js.undefined
  
  /**
    * The token for the next set of results, or null if there are no more result. 
    */
  var NextToken: js.UndefOr[OrchestrationToken] = js.undefined
  
  /**
    * Returns the session object. 
    */
  var Sessions: js.UndefOr[SessionList] = js.undefined
}
object ListSessionsResponse {
  
  inline def apply(): ListSessionsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListSessionsResponse]
  }
  
  extension [Self <: ListSessionsResponse](x: Self) {
    
    inline def setIds(value: SessionIdList): Self = StObject.set(x, "Ids", value.asInstanceOf[js.Any])
    
    inline def setIdsUndefined: Self = StObject.set(x, "Ids", js.undefined)
    
    inline def setIdsVarargs(value: NameString*): Self = StObject.set(x, "Ids", js.Array(value*))
    
    inline def setNextToken(value: OrchestrationToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setSessions(value: SessionList): Self = StObject.set(x, "Sessions", value.asInstanceOf[js.Any])
    
    inline def setSessionsUndefined: Self = StObject.set(x, "Sessions", js.undefined)
    
    inline def setSessionsVarargs(value: Session*): Self = StObject.set(x, "Sessions", js.Array(value*))
  }
}
