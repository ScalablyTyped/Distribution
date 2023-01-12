package typings.algoliaClientSearch.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SearchUserIDsOptions extends StObject {
  
  /**
    * If specified, only clusters assigned to this cluster can be returned.
    * */
  val cluster: js.UndefOr[String] = js.undefined
  
  /**
    * Number of users to return by page.
    */
  val hitsPerPage: js.UndefOr[Double] = js.undefined
  
  /**
    * Page to fetch.
    */
  val page: js.UndefOr[Double] = js.undefined
}
object SearchUserIDsOptions {
  
  inline def apply(): SearchUserIDsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SearchUserIDsOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SearchUserIDsOptions] (val x: Self) extends AnyVal {
    
    inline def setCluster(value: String): Self = StObject.set(x, "cluster", value.asInstanceOf[js.Any])
    
    inline def setClusterUndefined: Self = StObject.set(x, "cluster", js.undefined)
    
    inline def setHitsPerPage(value: Double): Self = StObject.set(x, "hitsPerPage", value.asInstanceOf[js.Any])
    
    inline def setHitsPerPageUndefined: Self = StObject.set(x, "hitsPerPage", js.undefined)
    
    inline def setPage(value: Double): Self = StObject.set(x, "page", value.asInstanceOf[js.Any])
    
    inline def setPageUndefined: Self = StObject.set(x, "page", js.undefined)
  }
}
