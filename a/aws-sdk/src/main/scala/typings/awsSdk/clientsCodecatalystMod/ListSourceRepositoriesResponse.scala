package typings.awsSdk.clientsCodecatalystMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListSourceRepositoriesResponse extends StObject {
  
  /**
    * Information about the source repositories.
    */
  var items: js.UndefOr[ListSourceRepositoriesItems] = js.undefined
  
  /**
    * A token returned from a call to this API to indicate the next batch of results to return, if any.
    */
  var nextToken: js.UndefOr[String] = js.undefined
}
object ListSourceRepositoriesResponse {
  
  inline def apply(): ListSourceRepositoriesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListSourceRepositoriesResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListSourceRepositoriesResponse] (val x: Self) extends AnyVal {
    
    inline def setItems(value: ListSourceRepositoriesItems): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    inline def setItemsVarargs(value: ListSourceRepositoriesItem*): Self = StObject.set(x, "items", js.Array(value*))
    
    inline def setNextToken(value: String): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
