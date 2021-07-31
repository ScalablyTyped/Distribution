package typings.algoliaClientSearch.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SearchForFacetValuesResponse extends StObject {
  
  /**
    * The exhaustive facets count.
    */
  var exhaustiveFacetsCount: Boolean
  
  /**
    * The list of facet hits.
    */
  var facetHits: js.Array[FacetHit]
  
  /**
    * The time that the API toke the process the request.
    */
  var processingTimeMS: js.UndefOr[Double] = js.undefined
}
object SearchForFacetValuesResponse {
  
  @scala.inline
  def apply(exhaustiveFacetsCount: Boolean, facetHits: js.Array[FacetHit]): SearchForFacetValuesResponse = {
    val __obj = js.Dynamic.literal(exhaustiveFacetsCount = exhaustiveFacetsCount.asInstanceOf[js.Any], facetHits = facetHits.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchForFacetValuesResponse]
  }
  
  @scala.inline
  implicit class SearchForFacetValuesResponseMutableBuilder[Self <: SearchForFacetValuesResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExhaustiveFacetsCount(value: Boolean): Self = StObject.set(x, "exhaustiveFacetsCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFacetHits(value: js.Array[FacetHit]): Self = StObject.set(x, "facetHits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFacetHitsVarargs(value: FacetHit*): Self = StObject.set(x, "facetHits", js.Array(value :_*))
    
    @scala.inline
    def setProcessingTimeMS(value: Double): Self = StObject.set(x, "processingTimeMS", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProcessingTimeMSUndefined: Self = StObject.set(x, "processingTimeMS", js.undefined)
  }
}
