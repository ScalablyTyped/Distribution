package typings.algoliasearch.mod.SearchForFacetValues

import typings.algoliasearch.AnonCount
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Response extends js.Object {
  var exhaustiveFacetsCount: Boolean
  var facetHits: js.Array[AnonCount]
  var processingTimeMS: Double
}

object Response {
  @scala.inline
  def apply(exhaustiveFacetsCount: Boolean, facetHits: js.Array[AnonCount], processingTimeMS: Double): Response = {
    val __obj = js.Dynamic.literal(exhaustiveFacetsCount = exhaustiveFacetsCount.asInstanceOf[js.Any], facetHits = facetHits.asInstanceOf[js.Any], processingTimeMS = processingTimeMS.asInstanceOf[js.Any])
    __obj.asInstanceOf[Response]
  }
}

