package typings.awsSdk.clientsOmicsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListRunsRequest extends StObject {
  
  /**
    * The maximum number of runs to return in one page of results.
    */
  var maxResults: js.UndefOr[ListRunsRequestMaxResultsInteger] = js.undefined
  
  /**
    * Filter the list by run name.
    */
  var name: js.UndefOr[RunName] = js.undefined
  
  /**
    * Filter the list by run group ID.
    */
  var runGroupId: js.UndefOr[RunGroupId] = js.undefined
  
  /**
    * Specify the pagination token from a previous request to retrieve the next page of results.
    */
  var startingToken: js.UndefOr[RunListToken] = js.undefined
  
  /**
    *  The status of a run. 
    */
  var status: js.UndefOr[RunStatus] = js.undefined
}
object ListRunsRequest {
  
  inline def apply(): ListRunsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListRunsRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListRunsRequest] (val x: Self) extends AnyVal {
    
    inline def setMaxResults(value: ListRunsRequestMaxResultsInteger): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    inline def setName(value: RunName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setRunGroupId(value: RunGroupId): Self = StObject.set(x, "runGroupId", value.asInstanceOf[js.Any])
    
    inline def setRunGroupIdUndefined: Self = StObject.set(x, "runGroupId", js.undefined)
    
    inline def setStartingToken(value: RunListToken): Self = StObject.set(x, "startingToken", value.asInstanceOf[js.Any])
    
    inline def setStartingTokenUndefined: Self = StObject.set(x, "startingToken", js.undefined)
    
    inline def setStatus(value: RunStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
