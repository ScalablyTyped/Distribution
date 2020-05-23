package typings.algoliaClientSearch.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SearchForFacetValuesResponse extends js.Object {
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
  def apply(
    exhaustiveFacetsCount: Boolean,
    facetHits: js.Array[FacetHit],
    processingTimeMS: js.UndefOr[Double] = js.undefined
  ): SearchForFacetValuesResponse = {
    val __obj = js.Dynamic.literal(exhaustiveFacetsCount = exhaustiveFacetsCount.asInstanceOf[js.Any], facetHits = facetHits.asInstanceOf[js.Any])
    if (!js.isUndefined(processingTimeMS)) __obj.updateDynamic("processingTimeMS")(processingTimeMS.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchForFacetValuesResponse]
  }
}

