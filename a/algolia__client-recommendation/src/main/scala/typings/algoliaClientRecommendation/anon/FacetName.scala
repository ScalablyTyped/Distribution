package typings.algoliaClientRecommendation.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FacetName extends js.Object {
  var facetName: String
  var score: Double
}

object FacetName {
  @scala.inline
  def apply(facetName: String, score: Double): FacetName = {
    val __obj = js.Dynamic.literal(facetName = facetName.asInstanceOf[js.Any], score = score.asInstanceOf[js.Any])
    __obj.asInstanceOf[FacetName]
  }
}

