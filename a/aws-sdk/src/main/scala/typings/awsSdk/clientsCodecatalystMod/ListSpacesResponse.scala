package typings.awsSdk.clientsCodecatalystMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListSpacesResponse extends StObject {
  
  /**
    * Information about the spaces. 
    */
  var items: js.UndefOr[SpaceSummaries] = js.undefined
  
  /**
    * A token returned from a call to this API to indicate the next batch of results to return, if any.
    */
  var nextToken: js.UndefOr[String] = js.undefined
}
object ListSpacesResponse {
  
  inline def apply(): ListSpacesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListSpacesResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListSpacesResponse] (val x: Self) extends AnyVal {
    
    inline def setItems(value: SpaceSummaries): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    inline def setItemsVarargs(value: SpaceSummary*): Self = StObject.set(x, "items", js.Array(value*))
    
    inline def setNextToken(value: String): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
