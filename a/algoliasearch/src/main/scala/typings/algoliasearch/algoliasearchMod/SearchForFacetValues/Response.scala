package typings.algoliasearch.algoliasearchMod.SearchForFacetValues

import typings.algoliasearch.Anon_Count
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Response extends js.Object {
  var exhaustiveFacetsCount: Boolean
  var facetHits: js.Array[Anon_Count]
  var processingTimeMS: Double
}

object Response {
  @scala.inline
  def apply(exhaustiveFacetsCount: Boolean, facetHits: js.Array[Anon_Count], processingTimeMS: Double): Response = {
    val __obj = js.Dynamic.literal(exhaustiveFacetsCount = exhaustiveFacetsCount, facetHits = facetHits, processingTimeMS = processingTimeMS)
  
    __obj.asInstanceOf[Response]
  }
}

