package typings.algoliaClientRecommendation

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonFacetName extends js.Object {
  val facetName: String
  val score: Double
}

object AnonFacetName {
  @scala.inline
  def apply(facetName: String, score: Double): AnonFacetName = {
    val __obj = js.Dynamic.literal(facetName = facetName.asInstanceOf[js.Any], score = score.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonFacetName]
  }
}

