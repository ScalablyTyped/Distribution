package typings.algoliaClientSearch.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BrowseResponse[TObject] extends js.Object {
  
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
  implicit class BrowseResponseOps[Self <: BrowseResponse[_], TObject] (val x: Self with BrowseResponse[TObject]) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setHitsVarargs(value: (TObject with ObjectWithObjectID)*): Self = this.set("hits", js.Array(value :_*))
    
    @scala.inline
    def setHits(value: js.Array[TObject with ObjectWithObjectID]): Self = this.set("hits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCursor(value: String): Self = this.set("cursor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCursor: Self = this.set("cursor", js.undefined)
  }
}
