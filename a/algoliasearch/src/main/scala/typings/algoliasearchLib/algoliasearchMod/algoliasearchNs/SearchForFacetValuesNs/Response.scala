package typings
package algoliasearchLib.algoliasearchMod.algoliasearchNs.SearchForFacetValuesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Response extends js.Object {
  var exhaustiveFacetsCount: scala.Boolean
  var facetHits: js.Array[algoliasearchLib.Anon_Count]
  var processingTimeMS: scala.Double
}

object Response {
  @scala.inline
  def apply(
    exhaustiveFacetsCount: scala.Boolean,
    facetHits: js.Array[algoliasearchLib.Anon_Count],
    processingTimeMS: scala.Double
  ): Response = {
    val __obj = js.Dynamic.literal(exhaustiveFacetsCount = exhaustiveFacetsCount, facetHits = facetHits, processingTimeMS = processingTimeMS)
  
    __obj.asInstanceOf[Response]
  }
}

