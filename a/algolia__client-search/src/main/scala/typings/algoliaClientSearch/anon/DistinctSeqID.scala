package typings.algoliaClientSearch.anon

import typings.algoliaClientSearch.mod.HighlightResult
import typings.algoliaClientSearch.mod.RankingInfo
import typings.algoliaClientSearch.mod.SnippetResult
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DistinctSeqID[THit] extends js.Object {
  
  val _distinctSeqID: js.UndefOr[Double] = js.native
  
  val _highlightResult: js.UndefOr[HighlightResult[THit]] = js.native
  
  val _rankingInfo: js.UndefOr[RankingInfo] = js.native
  
  val _snippetResult: js.UndefOr[SnippetResult[THit]] = js.native
  
  val objectID: String = js.native
}
object DistinctSeqID {
  
  @scala.inline
  def apply[THit](objectID: String): DistinctSeqID[THit] = {
    val __obj = js.Dynamic.literal(objectID = objectID.asInstanceOf[js.Any])
    __obj.asInstanceOf[DistinctSeqID[THit]]
  }
  
  @scala.inline
  implicit class DistinctSeqIDOps[Self <: DistinctSeqID[_], THit] (val x: Self with DistinctSeqID[THit]) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setObjectID(value: String): Self = this.set("objectID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_distinctSeqID(value: Double): Self = this.set("_distinctSeqID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_distinctSeqID: Self = this.set("_distinctSeqID", js.undefined)
    
    @scala.inline
    def set_highlightResult(value: HighlightResult[THit]): Self = this.set("_highlightResult", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_highlightResult: Self = this.set("_highlightResult", js.undefined)
    
    @scala.inline
    def set_rankingInfo(value: RankingInfo): Self = this.set("_rankingInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_rankingInfo: Self = this.set("_rankingInfo", js.undefined)
    
    @scala.inline
    def set_snippetResult(value: SnippetResult[THit]): Self = this.set("_snippetResult", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_snippetResult: Self = this.set("_snippetResult", js.undefined)
  }
}
