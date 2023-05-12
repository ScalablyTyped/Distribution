package typings.awsSdk.clientsOmicsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListRunGroupsRequest extends StObject {
  
  /**
    * The maximum number of run groups to return in one page of results.
    */
  var maxResults: js.UndefOr[ListRunGroupsRequestMaxResultsInteger] = js.undefined
  
  /**
    * The run groups' name.
    */
  var name: js.UndefOr[RunGroupName] = js.undefined
  
  /**
    * Specify the pagination token from a previous request to retrieve the next page of results.
    */
  var startingToken: js.UndefOr[RunGroupListToken] = js.undefined
}
object ListRunGroupsRequest {
  
  inline def apply(): ListRunGroupsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListRunGroupsRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListRunGroupsRequest] (val x: Self) extends AnyVal {
    
    inline def setMaxResults(value: ListRunGroupsRequestMaxResultsInteger): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    inline def setName(value: RunGroupName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setStartingToken(value: RunGroupListToken): Self = StObject.set(x, "startingToken", value.asInstanceOf[js.Any])
    
    inline def setStartingTokenUndefined: Self = StObject.set(x, "startingToken", js.undefined)
  }
}
