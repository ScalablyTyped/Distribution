package typings.awsSdk.clientsMediatailorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListAlertsResponse extends StObject {
  
  /**
    * A list of alerts that are associated with this resource.
    */
  var Items: js.UndefOr[listOfAlert] = js.undefined
  
  /**
    * Pagination token returned by the list request when results exceed the maximum allowed. Use the token to fetch the next page of results.
    */
  var NextToken: js.UndefOr[string] = js.undefined
}
object ListAlertsResponse {
  
  inline def apply(): ListAlertsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListAlertsResponse]
  }
  
  extension [Self <: ListAlertsResponse](x: Self) {
    
    inline def setItems(value: listOfAlert): Self = StObject.set(x, "Items", value.asInstanceOf[js.Any])
    
    inline def setItemsUndefined: Self = StObject.set(x, "Items", js.undefined)
    
    inline def setItemsVarargs(value: Alert*): Self = StObject.set(x, "Items", js.Array(value*))
    
    inline def setNextToken(value: string): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
