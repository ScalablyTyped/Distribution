package typings.algoliaClientSearch.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListUserIDsOptions extends StObject {
  
  /**
    * Number of users to retrieve per page.
    */
  val hitsPerPage: js.UndefOr[Double] = js.undefined
  
  /**
    * Page to fetch.
    */
  val page: js.UndefOr[Double] = js.undefined
}
object ListUserIDsOptions {
  
  @scala.inline
  def apply(): ListUserIDsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListUserIDsOptions]
  }
  
  @scala.inline
  implicit class ListUserIDsOptionsMutableBuilder[Self <: ListUserIDsOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHitsPerPage(value: Double): Self = StObject.set(x, "hitsPerPage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHitsPerPageUndefined: Self = StObject.set(x, "hitsPerPage", js.undefined)
    
    @scala.inline
    def setPage(value: Double): Self = StObject.set(x, "page", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageUndefined: Self = StObject.set(x, "page", js.undefined)
  }
}
