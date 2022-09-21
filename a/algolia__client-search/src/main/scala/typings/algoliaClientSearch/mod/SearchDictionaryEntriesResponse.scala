package typings.algoliaClientSearch.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SearchDictionaryEntriesResponse extends StObject {
  
  /**
    * The dictionary entries returned by the search.
    */
  var hits: js.Array[DictionaryEntry]
  
  /**
    * Number of dictionary entries matched by the query.
    */
  var nbHits: Double
  
  /**
    * Number of pages returned.
    *
    * Calculation is based on the total number of hits (nbHits) divided by the
    * number of hits per page (hitsPerPage), rounded up to the nearest integer.
    */
  var nbPages: Double
  
  /**
    * Index of the current page (zero-based).
    */
  var page: Double
}
object SearchDictionaryEntriesResponse {
  
  inline def apply(hits: js.Array[DictionaryEntry], nbHits: Double, nbPages: Double, page: Double): SearchDictionaryEntriesResponse = {
    val __obj = js.Dynamic.literal(hits = hits.asInstanceOf[js.Any], nbHits = nbHits.asInstanceOf[js.Any], nbPages = nbPages.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchDictionaryEntriesResponse]
  }
  
  extension [Self <: SearchDictionaryEntriesResponse](x: Self) {
    
    inline def setHits(value: js.Array[DictionaryEntry]): Self = StObject.set(x, "hits", value.asInstanceOf[js.Any])
    
    inline def setHitsVarargs(value: DictionaryEntry*): Self = StObject.set(x, "hits", js.Array(value*))
    
    inline def setNbHits(value: Double): Self = StObject.set(x, "nbHits", value.asInstanceOf[js.Any])
    
    inline def setNbPages(value: Double): Self = StObject.set(x, "nbPages", value.asInstanceOf[js.Any])
    
    inline def setPage(value: Double): Self = StObject.set(x, "page", value.asInstanceOf[js.Any])
  }
}
