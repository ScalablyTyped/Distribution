package typings.algoliasearchHelper.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<algoliasearch-helper.algoliasearch-helper.Client, 'search' | 'searchForFacetValues'> */
trait SearchClient extends StObject {
  
  var search: js.UndefOr[js.Any] = js.undefined
  
  var searchForFacetValues: js.UndefOr[js.Any] = js.undefined
}
object SearchClient {
  
  @scala.inline
  def apply(): SearchClient = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SearchClient]
  }
  
  @scala.inline
  implicit class SearchClientMutableBuilder[Self <: SearchClient] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSearch(value: js.Any): Self = StObject.set(x, "search", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSearchForFacetValues(value: js.Any): Self = StObject.set(x, "searchForFacetValues", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSearchForFacetValuesUndefined: Self = StObject.set(x, "searchForFacetValues", js.undefined)
    
    @scala.inline
    def setSearchUndefined: Self = StObject.set(x, "search", js.undefined)
  }
}
