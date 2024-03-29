package typings.awsSdk.clientsApigatewayv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetRoutesResponse extends StObject {
  
  /**
    * The elements from this collection.
    */
  var Items: js.UndefOr[listOfRoute] = js.undefined
  
  /**
    * The next page of elements from this collection. Not valid for the last element of the collection.
    */
  var NextToken: js.UndefOr[typings.awsSdk.clientsApigatewayv2Mod.NextToken] = js.undefined
}
object GetRoutesResponse {
  
  inline def apply(): GetRoutesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetRoutesResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetRoutesResponse] (val x: Self) extends AnyVal {
    
    inline def setItems(value: listOfRoute): Self = StObject.set(x, "Items", value.asInstanceOf[js.Any])
    
    inline def setItemsUndefined: Self = StObject.set(x, "Items", js.undefined)
    
    inline def setItemsVarargs(value: Route*): Self = StObject.set(x, "Items", js.Array(value*))
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
