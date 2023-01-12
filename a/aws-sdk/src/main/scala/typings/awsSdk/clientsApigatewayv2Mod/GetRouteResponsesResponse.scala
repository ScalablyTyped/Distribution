package typings.awsSdk.clientsApigatewayv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetRouteResponsesResponse extends StObject {
  
  /**
    * The elements from this collection.
    */
  var Items: js.UndefOr[listOfRouteResponse] = js.undefined
  
  /**
    * The next page of elements from this collection. Not valid for the last element of the collection.
    */
  var NextToken: js.UndefOr[typings.awsSdk.clientsApigatewayv2Mod.NextToken] = js.undefined
}
object GetRouteResponsesResponse {
  
  inline def apply(): GetRouteResponsesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetRouteResponsesResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetRouteResponsesResponse] (val x: Self) extends AnyVal {
    
    inline def setItems(value: listOfRouteResponse): Self = StObject.set(x, "Items", value.asInstanceOf[js.Any])
    
    inline def setItemsUndefined: Self = StObject.set(x, "Items", js.undefined)
    
    inline def setItemsVarargs(value: RouteResponse*): Self = StObject.set(x, "Items", js.Array(value*))
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
