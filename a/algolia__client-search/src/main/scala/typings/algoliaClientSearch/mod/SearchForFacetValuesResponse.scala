package typings.algoliaClientSearch.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SearchForFacetValuesResponse extends js.Object {
  /**
    * The exhaustive facets count.
    */
  val exhaustiveFacetsCount: Boolean
  /**
    * The list of facet hits.
    */
  val facetHits: js.Array[FacetHit]
  /**
    * The time that the API toke the process the request.
    */
  val processingTimeMS: js.UndefOr[Double] = js.undefined
}

object SearchForFacetValuesResponse {
  @scala.inline
  def apply(
    exhaustiveFacetsCount: Boolean,
    facetHits: js.Array[FacetHit],
    processingTimeMS: Int | Double = null
  ): SearchForFacetValuesResponse = {
    val __obj = js.Dynamic.literal(exhaustiveFacetsCount = exhaustiveFacetsCount.asInstanceOf[js.Any], facetHits = facetHits.asInstanceOf[js.Any])
    if (processingTimeMS != null) __obj.updateDynamic("processingTimeMS")(processingTimeMS.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchForFacetValuesResponse]
  }
}

