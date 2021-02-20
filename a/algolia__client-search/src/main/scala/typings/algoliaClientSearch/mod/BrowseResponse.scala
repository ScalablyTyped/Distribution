package typings.algoliaClientSearch.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BrowseResponse[TObject] extends StObject {
  
  /**
    * The cursor used for iterate on the next page.
    */
  var cursor: js.UndefOr[String] = js.native
  
  /**
    * The hits per page.
    */
  var hits: js.Array[TObject with ObjectWithObjectID] = js.native
}
object BrowseResponse {
  
  @scala.inline
  def apply[TObject](hits: js.Array[TObject with ObjectWithObjectID]): BrowseResponse[TObject] = {
    val __obj = js.Dynamic.literal(hits = hits.asInstanceOf[js.Any])
    __obj.asInstanceOf[BrowseResponse[TObject]]
  }
  
  @scala.inline
  implicit class BrowseResponseMutableBuilder[Self <: BrowseResponse[_], TObject] (val x: Self with BrowseResponse[TObject]) extends AnyVal {
    
    @scala.inline
    def setCursor(value: String): Self = StObject.set(x, "cursor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCursorUndefined: Self = StObject.set(x, "cursor", js.undefined)
    
    @scala.inline
    def setHits(value: js.Array[TObject with ObjectWithObjectID]): Self = StObject.set(x, "hits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHitsVarargs(value: (TObject with ObjectWithObjectID)*): Self = StObject.set(x, "hits", js.Array(value :_*))
  }
}
