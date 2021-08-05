package typings.algoliaClientSearch.anon

import typings.algoliaClientSearch.mod.HighlightResult
import typings.algoliaClientSearch.mod.RankingInfo
import typings.algoliaClientSearch.mod.SnippetResult
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DistinctSeqID[THit] extends StObject {
  
  val _distinctSeqID: js.UndefOr[Double] = js.undefined
  
  val _highlightResult: js.UndefOr[HighlightResult[THit]] = js.undefined
  
  val _rankingInfo: js.UndefOr[RankingInfo] = js.undefined
  
  val _snippetResult: js.UndefOr[SnippetResult[THit]] = js.undefined
  
  val objectID: String
}
object DistinctSeqID {
  
  inline def apply[THit](objectID: String): DistinctSeqID[THit] = {
    val __obj = js.Dynamic.literal(objectID = objectID.asInstanceOf[js.Any])
    __obj.asInstanceOf[DistinctSeqID[THit]]
  }
  
  extension [Self <: DistinctSeqID[?], THit](x: Self & DistinctSeqID[THit]) {
    
    inline def setObjectID(value: String): Self = StObject.set(x, "objectID", value.asInstanceOf[js.Any])
    
    inline def set_distinctSeqID(value: Double): Self = StObject.set(x, "_distinctSeqID", value.asInstanceOf[js.Any])
    
    inline def set_distinctSeqIDUndefined: Self = StObject.set(x, "_distinctSeqID", js.undefined)
    
    inline def set_highlightResult(value: HighlightResult[THit]): Self = StObject.set(x, "_highlightResult", value.asInstanceOf[js.Any])
    
    inline def set_highlightResultUndefined: Self = StObject.set(x, "_highlightResult", js.undefined)
    
    inline def set_rankingInfo(value: RankingInfo): Self = StObject.set(x, "_rankingInfo", value.asInstanceOf[js.Any])
    
    inline def set_rankingInfoUndefined: Self = StObject.set(x, "_rankingInfo", js.undefined)
    
    inline def set_snippetResult(value: SnippetResult[THit]): Self = StObject.set(x, "_snippetResult", value.asInstanceOf[js.Any])
    
    inline def set_snippetResultUndefined: Self = StObject.set(x, "_snippetResult", js.undefined)
  }
}
