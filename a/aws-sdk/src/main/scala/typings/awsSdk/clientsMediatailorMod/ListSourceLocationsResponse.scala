package typings.awsSdk.clientsMediatailorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListSourceLocationsResponse extends StObject {
  
  /**
    * A list of source locations.
    */
  var Items: js.UndefOr[listOfSourceLocation] = js.undefined
  
  /**
    * Pagination token from the list request. Use the token to fetch the next page of results.
    */
  var NextToken: js.UndefOr[string] = js.undefined
}
object ListSourceLocationsResponse {
  
  inline def apply(): ListSourceLocationsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListSourceLocationsResponse]
  }
  
  extension [Self <: ListSourceLocationsResponse](x: Self) {
    
    inline def setItems(value: listOfSourceLocation): Self = StObject.set(x, "Items", value.asInstanceOf[js.Any])
    
    inline def setItemsUndefined: Self = StObject.set(x, "Items", js.undefined)
    
    inline def setItemsVarargs(value: SourceLocation*): Self = StObject.set(x, "Items", js.Array(value*))
    
    inline def setNextToken(value: string): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
