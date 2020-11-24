package typings.algoliasearchHelper.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<algoliasearch-helper.algoliasearch-helper.Client, 'search' | 'searchForFacetValues'> */
@js.native
trait SearchClient extends js.Object {
  
  var search: js.UndefOr[js.Any] = js.native
  
  var searchForFacetValues: js.UndefOr[js.Any] = js.native
}
object SearchClient {
  
  @scala.inline
  def apply(): SearchClient = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SearchClient]
  }
  
  @scala.inline
  implicit class SearchClientOps[Self <: SearchClient] (val x: Self) extends AnyVal {
    
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
    def setSearch(value: js.Any): Self = this.set("search", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSearch: Self = this.set("search", js.undefined)
    
    @scala.inline
    def setSearchForFacetValues(value: js.Any): Self = this.set("searchForFacetValues", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSearchForFacetValues: Self = this.set("searchForFacetValues", js.undefined)
  }
}
