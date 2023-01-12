package typings.awsSdk.clientsMediatailorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListVodSourcesResponse extends StObject {
  
  /**
    * Lists the VOD sources.
    */
  var Items: js.UndefOr[listOfVodSource] = js.undefined
  
  /**
    * Pagination token returned by the list request when results exceed the maximum allowed. Use the token to fetch the next page of results.
    */
  var NextToken: js.UndefOr[_String] = js.undefined
}
object ListVodSourcesResponse {
  
  inline def apply(): ListVodSourcesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListVodSourcesResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListVodSourcesResponse] (val x: Self) extends AnyVal {
    
    inline def setItems(value: listOfVodSource): Self = StObject.set(x, "Items", value.asInstanceOf[js.Any])
    
    inline def setItemsUndefined: Self = StObject.set(x, "Items", js.undefined)
    
    inline def setItemsVarargs(value: VodSource*): Self = StObject.set(x, "Items", js.Array(value*))
    
    inline def setNextToken(value: _String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
