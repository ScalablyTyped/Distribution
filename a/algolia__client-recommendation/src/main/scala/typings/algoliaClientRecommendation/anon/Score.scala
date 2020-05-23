package typings.algoliaClientRecommendation.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Score extends js.Object {
  val facetName: String
  val score: Double
}

object Score {
  @scala.inline
  def apply(facetName: String, score: Double): Score = {
    val __obj = js.Dynamic.literal(facetName = facetName.asInstanceOf[js.Any], score = score.asInstanceOf[js.Any])
    __obj.asInstanceOf[Score]
  }
}

