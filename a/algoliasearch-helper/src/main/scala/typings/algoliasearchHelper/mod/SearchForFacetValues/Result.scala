package typings.algoliasearchHelper.mod.SearchForFacetValues

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Result extends js.Object {
  
  var facetHits: js.Array[Hit] = js.native
  
  var processingTimeMS: Double = js.native
}
object Result {
  
  @scala.inline
  def apply(facetHits: js.Array[Hit], processingTimeMS: Double): Result = {
    val __obj = js.Dynamic.literal(facetHits = facetHits.asInstanceOf[js.Any], processingTimeMS = processingTimeMS.asInstanceOf[js.Any])
    __obj.asInstanceOf[Result]
  }
  
  @scala.inline
  implicit class ResultOps[Self <: Result] (val x: Self) extends AnyVal {
    
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
    def setFacetHitsVarargs(value: Hit*): Self = this.set("facetHits", js.Array(value :_*))
    
    @scala.inline
    def setFacetHits(value: js.Array[Hit]): Self = this.set("facetHits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProcessingTimeMS(value: Double): Self = this.set("processingTimeMS", value.asInstanceOf[js.Any])
  }
}
