package typings.algoliaClientSearch.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SearchSynonymsResponse extends StObject {
  
  /**
    * The list of synonyms.
    */
  var hits: js.Array[Synonym]
  
  /**
    * The number of synonyms on the list.
    */
  var nbHits: Double
}
object SearchSynonymsResponse {
  
  inline def apply(hits: js.Array[Synonym], nbHits: Double): SearchSynonymsResponse = {
    val __obj = js.Dynamic.literal(hits = hits.asInstanceOf[js.Any], nbHits = nbHits.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchSynonymsResponse]
  }
  
  extension [Self <: SearchSynonymsResponse](x: Self) {
    
    inline def setHits(value: js.Array[Synonym]): Self = StObject.set(x, "hits", value.asInstanceOf[js.Any])
    
    inline def setHitsVarargs(value: Synonym*): Self = StObject.set(x, "hits", js.Array(value*))
    
    inline def setNbHits(value: Double): Self = StObject.set(x, "nbHits", value.asInstanceOf[js.Any])
  }
}
