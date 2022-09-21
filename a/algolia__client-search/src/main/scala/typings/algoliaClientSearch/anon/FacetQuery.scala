package typings.algoliaClientSearch.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FacetQuery extends StObject {
  
  /**
    * The search query used to search the facet attribute. Follows the same rules for an index query: a single character, a partial word, a word, or a phrase.
    */
  val facetQuery: js.UndefOr[String] = js.undefined
}
object FacetQuery {
  
  inline def apply(): FacetQuery = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FacetQuery]
  }
  
  extension [Self <: FacetQuery](x: Self) {
    
    inline def setFacetQuery(value: String): Self = StObject.set(x, "facetQuery", value.asInstanceOf[js.Any])
    
    inline def setFacetQueryUndefined: Self = StObject.set(x, "facetQuery", js.undefined)
  }
}
