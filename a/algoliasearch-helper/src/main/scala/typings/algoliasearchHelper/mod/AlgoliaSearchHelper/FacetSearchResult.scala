package typings.algoliasearchHelper.mod.AlgoliaSearchHelper

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Structure of the data resolved by the
  * [`searchForFacetValues()`](reference.html#AlgoliaSearchHelper#searchForFacetValues)
  * promise.
  */
trait FacetSearchResult extends js.Object {
  var facetHits: FacetSearchHit
  var processingTimeMS: Double
}

object FacetSearchResult {
  @scala.inline
  def apply(facetHits: FacetSearchHit, processingTimeMS: Double): FacetSearchResult = {
    val __obj = js.Dynamic.literal(facetHits = facetHits.asInstanceOf[js.Any], processingTimeMS = processingTimeMS.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[FacetSearchResult]
  }
}

