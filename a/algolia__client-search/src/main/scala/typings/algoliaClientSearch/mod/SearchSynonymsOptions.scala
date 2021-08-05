package typings.algoliaClientSearch.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SearchSynonymsOptions extends StObject {
  
  /**
    * Number of hits per page.
    */
  val hitsPerPage: js.UndefOr[Double] = js.undefined
  
  /**
    * Page to retrieve.
    */
  val page: js.UndefOr[Double] = js.undefined
  
  /**
    * The synonym type.
    */
  val `type`: js.UndefOr[String] = js.undefined
}
object SearchSynonymsOptions {
  
  inline def apply(): SearchSynonymsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SearchSynonymsOptions]
  }
  
  extension [Self <: SearchSynonymsOptions](x: Self) {
    
    inline def setHitsPerPage(value: Double): Self = StObject.set(x, "hitsPerPage", value.asInstanceOf[js.Any])
    
    inline def setHitsPerPageUndefined: Self = StObject.set(x, "hitsPerPage", js.undefined)
    
    inline def setPage(value: Double): Self = StObject.set(x, "page", value.asInstanceOf[js.Any])
    
    inline def setPageUndefined: Self = StObject.set(x, "page", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
