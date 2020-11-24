package typings.algoliaClientSearch.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SearchSynonymsResponse extends js.Object {
  
  /**
    * The list of synonyms.
    */
  var hits: js.Array[Synonym] = js.native
  
  /**
    * The number of synonyms on the list.
    */
  var nbHits: Double = js.native
}
object SearchSynonymsResponse {
  
  @scala.inline
  def apply(hits: js.Array[Synonym], nbHits: Double): SearchSynonymsResponse = {
    val __obj = js.Dynamic.literal(hits = hits.asInstanceOf[js.Any], nbHits = nbHits.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchSynonymsResponse]
  }
  
  @scala.inline
  implicit class SearchSynonymsResponseOps[Self <: SearchSynonymsResponse] (val x: Self) extends AnyVal {
    
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
    def setHitsVarargs(value: Synonym*): Self = this.set("hits", js.Array(value :_*))
    
    @scala.inline
    def setHits(value: js.Array[Synonym]): Self = this.set("hits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNbHits(value: Double): Self = this.set("nbHits", value.asInstanceOf[js.Any])
  }
}
