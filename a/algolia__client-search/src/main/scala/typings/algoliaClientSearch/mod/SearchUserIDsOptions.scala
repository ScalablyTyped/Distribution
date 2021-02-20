package typings.algoliaClientSearch.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SearchUserIDsOptions extends StObject {
  
  /**
    * If specified, only clusters assigned to this cluster can be returned.
    * */
  val cluster: js.UndefOr[String] = js.native
  
  /**
    * Number of users to return by page.
    */
  val hitsPerPage: js.UndefOr[Double] = js.native
  
  /**
    * Page to fetch.
    */
  val page: js.UndefOr[Double] = js.native
}
object SearchUserIDsOptions {
  
  @scala.inline
  def apply(): SearchUserIDsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SearchUserIDsOptions]
  }
  
  @scala.inline
  implicit class SearchUserIDsOptionsMutableBuilder[Self <: SearchUserIDsOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCluster(value: String): Self = StObject.set(x, "cluster", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClusterUndefined: Self = StObject.set(x, "cluster", js.undefined)
    
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
