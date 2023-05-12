package typings.awsSdk.clientsDocdbelasticMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListClustersInput extends StObject {
  
  /**
    * The maximum number of entries to recieve in the response.
    */
  var maxResults: js.UndefOr[ListClustersInputMaxResultsInteger] = js.undefined
  
  /**
    * The nextToken which is used the get the next page of data.
    */
  var nextToken: js.UndefOr[PaginationToken] = js.undefined
}
object ListClustersInput {
  
  inline def apply(): ListClustersInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListClustersInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListClustersInput] (val x: Self) extends AnyVal {
    
    inline def setMaxResults(value: ListClustersInputMaxResultsInteger): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    inline def setNextToken(value: PaginationToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
