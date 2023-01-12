package typings.algoliasearchHelper.anon

import typings.algoliasearchHelper.typesAlgoliasearchMod.HighlightResult
import typings.algoliasearchHelper.typesAlgoliasearchMod.RankingInfo
import typings.algoliasearchHelper.typesAlgoliasearchMod.SnippetResult
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DistinctSeqID[T] extends StObject {
  
  val _distinctSeqID: js.UndefOr[Double] = js.undefined
  
  val _highlightResult: js.UndefOr[HighlightResult[T]] = js.undefined
  
  val _rankingInfo: js.UndefOr[RankingInfo] = js.undefined
  
  val _snippetResult: js.UndefOr[SnippetResult[T]] = js.undefined
  
  val objectID: String
}
object DistinctSeqID {
  
  inline def apply[T](objectID: String): DistinctSeqID[T] = {
    val __obj = js.Dynamic.literal(objectID = objectID.asInstanceOf[js.Any])
    __obj.asInstanceOf[DistinctSeqID[T]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DistinctSeqID[?], T] (val x: Self & DistinctSeqID[T]) extends AnyVal {
    
    inline def setObjectID(value: String): Self = StObject.set(x, "objectID", value.asInstanceOf[js.Any])
    
    inline def set_distinctSeqID(value: Double): Self = StObject.set(x, "_distinctSeqID", value.asInstanceOf[js.Any])
    
    inline def set_distinctSeqIDUndefined: Self = StObject.set(x, "_distinctSeqID", js.undefined)
    
    inline def set_highlightResult(value: HighlightResult[T]): Self = StObject.set(x, "_highlightResult", value.asInstanceOf[js.Any])
    
    inline def set_highlightResultUndefined: Self = StObject.set(x, "_highlightResult", js.undefined)
    
    inline def set_rankingInfo(value: RankingInfo): Self = StObject.set(x, "_rankingInfo", value.asInstanceOf[js.Any])
    
    inline def set_rankingInfoUndefined: Self = StObject.set(x, "_rankingInfo", js.undefined)
    
    inline def set_snippetResult(value: SnippetResult[T]): Self = StObject.set(x, "_snippetResult", value.asInstanceOf[js.Any])
    
    inline def set_snippetResultUndefined: Self = StObject.set(x, "_snippetResult", js.undefined)
  }
}
