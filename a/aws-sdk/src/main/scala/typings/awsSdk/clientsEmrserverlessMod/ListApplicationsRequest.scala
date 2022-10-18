package typings.awsSdk.clientsEmrserverlessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListApplicationsRequest extends StObject {
  
  /**
    * The maximum number of applications that can be listed.
    */
  var maxResults: js.UndefOr[ListApplicationsRequestMaxResultsInteger] = js.undefined
  
  /**
    * The token for the next set of application results.
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
  
  /**
    * An optional filter for application states. Note that if this filter contains multiple states, the resulting list will be grouped by the state.
    */
  var states: js.UndefOr[ApplicationStateSet] = js.undefined
}
object ListApplicationsRequest {
  
  inline def apply(): ListApplicationsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListApplicationsRequest]
  }
  
  extension [Self <: ListApplicationsRequest](x: Self) {
    
    inline def setMaxResults(value: ListApplicationsRequestMaxResultsInteger): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    inline def setStates(value: ApplicationStateSet): Self = StObject.set(x, "states", value.asInstanceOf[js.Any])
    
    inline def setStatesUndefined: Self = StObject.set(x, "states", js.undefined)
    
    inline def setStatesVarargs(value: ApplicationState*): Self = StObject.set(x, "states", js.Array(value*))
  }
}
