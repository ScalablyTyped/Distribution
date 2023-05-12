package typings.awsSdk.clientsEcrpublicMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeRepositoriesResponse extends StObject {
  
  /**
    * The nextToken value to include in a future DescribeRepositories request. When the results of a DescribeRepositories request exceed maxResults, this value can be used to retrieve the next page of results. If there are no more results to return, this value is null.
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
  
  /**
    * A list of repository objects corresponding to valid repositories.
    */
  var repositories: js.UndefOr[RepositoryList] = js.undefined
}
object DescribeRepositoriesResponse {
  
  inline def apply(): DescribeRepositoriesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeRepositoriesResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeRepositoriesResponse] (val x: Self) extends AnyVal {
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    inline def setRepositories(value: RepositoryList): Self = StObject.set(x, "repositories", value.asInstanceOf[js.Any])
    
    inline def setRepositoriesUndefined: Self = StObject.set(x, "repositories", js.undefined)
    
    inline def setRepositoriesVarargs(value: Repository*): Self = StObject.set(x, "repositories", js.Array(value*))
  }
}
