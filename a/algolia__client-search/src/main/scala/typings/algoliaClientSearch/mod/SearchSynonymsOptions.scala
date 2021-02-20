package typings.algoliaClientSearch.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SearchSynonymsOptions extends StObject {
  
  /**
    * Number of hits per page.
    */
  val hitsPerPage: js.UndefOr[Double] = js.native
  
  /**
    * Page to retrieve.
    */
  val page: js.UndefOr[Double] = js.native
  
  /**
    * The synonym type.
    */
  val `type`: js.UndefOr[String] = js.native
}
object SearchSynonymsOptions {
  
  @scala.inline
  def apply(): SearchSynonymsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SearchSynonymsOptions]
  }
  
  @scala.inline
  implicit class SearchSynonymsOptionsMutableBuilder[Self <: SearchSynonymsOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHitsPerPage(value: Double): Self = StObject.set(x, "hitsPerPage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHitsPerPageUndefined: Self = StObject.set(x, "hitsPerPage", js.undefined)
    
    @scala.inline
    def setPage(value: Double): Self = StObject.set(x, "page", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageUndefined: Self = StObject.set(x, "page", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
