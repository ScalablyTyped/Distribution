package typings.awsSdk.clientsEcrMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeRepositoriesRequest extends StObject {
  
  /**
    * The maximum number of repository results returned by DescribeRepositories in paginated output. When this parameter is used, DescribeRepositories only returns maxResults results in a single page along with a nextToken response element. The remaining results of the initial request can be seen by sending another DescribeRepositories request with the returned nextToken value. This value can be between 1 and 1000. If this parameter is not used, then DescribeRepositories returns up to 100 results and a nextToken value, if applicable. This option cannot be used when you specify repositories with repositoryNames.
    */
  var maxResults: js.UndefOr[MaxResults] = js.undefined
  
  /**
    * The nextToken value returned from a previous paginated DescribeRepositories request where maxResults was used and the results exceeded the value of that parameter. Pagination continues from the end of the previous results that returned the nextToken value. This value is null when there are no more results to return. This option cannot be used when you specify repositories with repositoryNames.  This token should be treated as an opaque identifier that is only used to retrieve the next items in a list and not for other programmatic purposes. 
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
  
  /**
    * The Amazon Web Services account ID associated with the registry that contains the repositories to be described. If you do not specify a registry, the default registry is assumed.
    */
  var registryId: js.UndefOr[RegistryId] = js.undefined
  
  /**
    * A list of repositories to describe. If this parameter is omitted, then all repositories in a registry are described.
    */
  var repositoryNames: js.UndefOr[RepositoryNameList] = js.undefined
}
object DescribeRepositoriesRequest {
  
  inline def apply(): DescribeRepositoriesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeRepositoriesRequest]
  }
  
  extension [Self <: DescribeRepositoriesRequest](x: Self) {
    
    inline def setMaxResults(value: MaxResults): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    inline def setRegistryId(value: RegistryId): Self = StObject.set(x, "registryId", value.asInstanceOf[js.Any])
    
    inline def setRegistryIdUndefined: Self = StObject.set(x, "registryId", js.undefined)
    
    inline def setRepositoryNames(value: RepositoryNameList): Self = StObject.set(x, "repositoryNames", value.asInstanceOf[js.Any])
    
    inline def setRepositoryNamesUndefined: Self = StObject.set(x, "repositoryNames", js.undefined)
    
    inline def setRepositoryNamesVarargs(value: RepositoryName*): Self = StObject.set(x, "repositoryNames", js.Array(value*))
  }
}
