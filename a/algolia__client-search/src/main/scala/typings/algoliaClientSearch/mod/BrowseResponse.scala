package typings.algoliaClientSearch.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BrowseResponse[TObject] extends StObject {
  
  /**
    * The cursor used for iterate on the next page.
    */
  var cursor: js.UndefOr[String] = js.undefined
  
  /**
    * The hits per page.
    */
  var hits: js.Array[TObject & ObjectWithObjectID]
}
object BrowseResponse {
  
  inline def apply[TObject](hits: js.Array[TObject & ObjectWithObjectID]): BrowseResponse[TObject] = {
    val __obj = js.Dynamic.literal(hits = hits.asInstanceOf[js.Any])
    __obj.asInstanceOf[BrowseResponse[TObject]]
  }
  
  extension [Self <: BrowseResponse[?], TObject](x: Self & BrowseResponse[TObject]) {
    
    inline def setCursor(value: String): Self = StObject.set(x, "cursor", value.asInstanceOf[js.Any])
    
    inline def setCursorUndefined: Self = StObject.set(x, "cursor", js.undefined)
    
    inline def setHits(value: js.Array[TObject & ObjectWithObjectID]): Self = StObject.set(x, "hits", value.asInstanceOf[js.Any])
    
    inline def setHitsVarargs(value: (TObject & ObjectWithObjectID)*): Self = StObject.set(x, "hits", js.Array(value :_*))
  }
}
