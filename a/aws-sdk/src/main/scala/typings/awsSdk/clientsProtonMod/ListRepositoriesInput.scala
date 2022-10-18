package typings.awsSdk.clientsProtonMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListRepositoriesInput extends StObject {
  
  /**
    * The maximum number of repositories to list.
    */
  var maxResults: js.UndefOr[MaxPageResults] = js.undefined
  
  /**
    * A token that indicates the location of the next repository in the array of repositories, after the list of repositories previously requested.
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
}
object ListRepositoriesInput {
  
  inline def apply(): ListRepositoriesInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListRepositoriesInput]
  }
  
  extension [Self <: ListRepositoriesInput](x: Self) {
    
    inline def setMaxResults(value: MaxPageResults): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
