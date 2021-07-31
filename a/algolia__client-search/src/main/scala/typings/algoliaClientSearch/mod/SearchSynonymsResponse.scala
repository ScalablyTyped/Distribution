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
  
  @scala.inline
  def apply(hits: js.Array[Synonym], nbHits: Double): SearchSynonymsResponse = {
    val __obj = js.Dynamic.literal(hits = hits.asInstanceOf[js.Any], nbHits = nbHits.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchSynonymsResponse]
  }
  
  @scala.inline
  implicit class SearchSynonymsResponseMutableBuilder[Self <: SearchSynonymsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHits(value: js.Array[Synonym]): Self = StObject.set(x, "hits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHitsVarargs(value: Synonym*): Self = StObject.set(x, "hits", js.Array(value :_*))
    
    @scala.inline
    def setNbHits(value: Double): Self = StObject.set(x, "nbHits", value.asInstanceOf[js.Any])
  }
}
