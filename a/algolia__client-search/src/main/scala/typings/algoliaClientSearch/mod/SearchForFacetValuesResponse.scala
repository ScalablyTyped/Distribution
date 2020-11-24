package typings.algoliaClientSearch.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SearchForFacetValuesResponse extends js.Object {
  
  /**
    * The exhaustive facets count.
    */
  var exhaustiveFacetsCount: Boolean = js.native
  
  /**
    * The list of facet hits.
    */
  var facetHits: js.Array[FacetHit] = js.native
  
  /**
    * The time that the API toke the process the request.
    */
  var processingTimeMS: js.UndefOr[Double] = js.native
}
object SearchForFacetValuesResponse {
  
  @scala.inline
  def apply(exhaustiveFacetsCount: Boolean, facetHits: js.Array[FacetHit]): SearchForFacetValuesResponse = {
    val __obj = js.Dynamic.literal(exhaustiveFacetsCount = exhaustiveFacetsCount.asInstanceOf[js.Any], facetHits = facetHits.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchForFacetValuesResponse]
  }
  
  @scala.inline
  implicit class SearchForFacetValuesResponseOps[Self <: SearchForFacetValuesResponse] (val x: Self) extends AnyVal {
    
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
    def setExhaustiveFacetsCount(value: Boolean): Self = this.set("exhaustiveFacetsCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFacetHitsVarargs(value: FacetHit*): Self = this.set("facetHits", js.Array(value :_*))
    
    @scala.inline
    def setFacetHits(value: js.Array[FacetHit]): Self = this.set("facetHits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProcessingTimeMS(value: Double): Self = this.set("processingTimeMS", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProcessingTimeMS: Self = this.set("processingTimeMS", js.undefined)
  }
}
