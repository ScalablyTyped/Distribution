package typings.algoliaClientSearch.mod

import typings.algoliaClientSearch.anon.Answer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FindAnswersResponse[TObject]
  extends StObject
     with SearchResponse[TObject] {
  
  /**
    * The hits returned by the search.
    *
    * Hits are ordered according to the ranking or sorting of the index being queried.
    */
  @JSName("hits")
  var hits_FindAnswersResponse: js.Array[Hit[TObject & Answer]]
}
object FindAnswersResponse {
  
  @scala.inline
  def apply[TObject](
    exhaustiveNbHits: Boolean,
    hits: js.Array[Hit[TObject & Answer]],
    hitsPerPage: Double,
    nbHits: Double,
    nbPages: Double,
    page: Double,
    params: String,
    processingTimeMS: Double,
    query: String
  ): FindAnswersResponse[TObject] = {
    val __obj = js.Dynamic.literal(exhaustiveNbHits = exhaustiveNbHits.asInstanceOf[js.Any], hits = hits.asInstanceOf[js.Any], hitsPerPage = hitsPerPage.asInstanceOf[js.Any], nbHits = nbHits.asInstanceOf[js.Any], nbPages = nbPages.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any], processingTimeMS = processingTimeMS.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[FindAnswersResponse[TObject]]
  }
  
  @scala.inline
  implicit class FindAnswersResponseMutableBuilder[Self <: FindAnswersResponse[?], TObject] (val x: Self & FindAnswersResponse[TObject]) extends AnyVal {
    
    @scala.inline
    def setHits(value: js.Array[Hit[TObject & Answer]]): Self = StObject.set(x, "hits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHitsVarargs(value: (Hit[TObject & Answer])*): Self = StObject.set(x, "hits", js.Array(value :_*))
  }
}
