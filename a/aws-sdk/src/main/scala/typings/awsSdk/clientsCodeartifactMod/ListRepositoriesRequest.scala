package typings.awsSdk.clientsCodeartifactMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListRepositoriesRequest extends StObject {
  
  /**
    *  The maximum number of results to return per page. 
    */
  var maxResults: js.UndefOr[ListRepositoriesMaxResults] = js.undefined
  
  /**
    *  The token for the next set of results. Use the value returned in the previous response in the next request to retrieve the next set of results. 
    */
  var nextToken: js.UndefOr[PaginationToken] = js.undefined
  
  /**
    *  A prefix used to filter returned repositories. Only repositories with names that start with repositoryPrefix are returned.
    */
  var repositoryPrefix: js.UndefOr[RepositoryName] = js.undefined
}
object ListRepositoriesRequest {
  
  inline def apply(): ListRepositoriesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListRepositoriesRequest]
  }
  
  extension [Self <: ListRepositoriesRequest](x: Self) {
    
    inline def setMaxResults(value: ListRepositoriesMaxResults): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    inline def setNextToken(value: PaginationToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    inline def setRepositoryPrefix(value: RepositoryName): Self = StObject.set(x, "repositoryPrefix", value.asInstanceOf[js.Any])
    
    inline def setRepositoryPrefixUndefined: Self = StObject.set(x, "repositoryPrefix", js.undefined)
  }
}
