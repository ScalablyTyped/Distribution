package typings.awsSdk.clientsEvidentlyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListProjectsRequest extends StObject {
  
  /**
    * The maximum number of results to include in the response.
    */
  var maxResults: js.UndefOr[MaxProjects] = js.undefined
  
  /**
    * The token to use when requesting the next set of results. You received this token from a previous ListProjects operation.
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
}
object ListProjectsRequest {
  
  inline def apply(): ListProjectsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListProjectsRequest]
  }
  
  extension [Self <: ListProjectsRequest](x: Self) {
    
    inline def setMaxResults(value: MaxProjects): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
