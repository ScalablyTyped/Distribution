package typings.algoliaClientSearch.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListIndicesResponse extends StObject {
  
  /**
    * List of index response
    */
  var items: js.Array[Indice]
  
  /**
    * Number of pages
    */
  var nbPages: Double
}
object ListIndicesResponse {
  
  inline def apply(items: js.Array[Indice], nbPages: Double): ListIndicesResponse = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any], nbPages = nbPages.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListIndicesResponse]
  }
  
  extension [Self <: ListIndicesResponse](x: Self) {
    
    inline def setItems(value: js.Array[Indice]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsVarargs(value: Indice*): Self = StObject.set(x, "items", js.Array(value :_*))
    
    inline def setNbPages(value: Double): Self = StObject.set(x, "nbPages", value.asInstanceOf[js.Any])
  }
}
