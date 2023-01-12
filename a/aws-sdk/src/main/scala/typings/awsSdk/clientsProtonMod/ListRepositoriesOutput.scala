package typings.awsSdk.clientsProtonMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListRepositoriesOutput extends StObject {
  
  /**
    * A token that indicates the location of the next repository in the array of repositories, after the current requested list of repositories. 
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
  
  /**
    * An array of repository links.
    */
  var repositories: RepositorySummaryList
}
object ListRepositoriesOutput {
  
  inline def apply(repositories: RepositorySummaryList): ListRepositoriesOutput = {
    val __obj = js.Dynamic.literal(repositories = repositories.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListRepositoriesOutput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListRepositoriesOutput] (val x: Self) extends AnyVal {
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    inline def setRepositories(value: RepositorySummaryList): Self = StObject.set(x, "repositories", value.asInstanceOf[js.Any])
    
    inline def setRepositoriesVarargs(value: RepositorySummary*): Self = StObject.set(x, "repositories", js.Array(value*))
  }
}
