package typings
package algoliasearchDashHelperLib.algoliasearchDashHelperMod.AlgoliaSearchHelperNs

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
  var processingTimeMS: scala.Double
}

object FacetSearchResult {
  @scala.inline
  def apply(facetHits: FacetSearchHit, processingTimeMS: scala.Double): FacetSearchResult = {
    val __obj = js.Dynamic.literal(facetHits = facetHits, processingTimeMS = processingTimeMS)
  
    __obj.asInstanceOf[FacetSearchResult]
  }
}

