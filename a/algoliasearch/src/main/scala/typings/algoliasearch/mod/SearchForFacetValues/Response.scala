package typings.algoliasearch.mod.SearchForFacetValues

import typings.algoliasearch.anon.Count
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Response extends js.Object {
  var exhaustiveFacetsCount: Boolean
  var facetHits: js.Array[Count]
  var processingTimeMS: Double
}

object Response {
  @scala.inline
  def apply(exhaustiveFacetsCount: Boolean, facetHits: js.Array[Count], processingTimeMS: Double): Response = {
    val __obj = js.Dynamic.literal(exhaustiveFacetsCount = exhaustiveFacetsCount.asInstanceOf[js.Any], facetHits = facetHits.asInstanceOf[js.Any], processingTimeMS = processingTimeMS.asInstanceOf[js.Any])
    __obj.asInstanceOf[Response]
  }
}

