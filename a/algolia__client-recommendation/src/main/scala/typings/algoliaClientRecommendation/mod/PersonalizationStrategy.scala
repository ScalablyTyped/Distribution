package typings.algoliaClientRecommendation.mod

import typings.algoliaClientRecommendation.anon.EventType
import typings.algoliaClientRecommendation.anon.Score
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PersonalizationStrategy extends js.Object {
  /**
    * Events scoring
    */
  val eventsScoring: js.Array[EventType]
  /**
    * Facets scoring
    */
  val facetsScoring: js.Array[Score]
  /**
    * Personalization impact
    */
  val personalizationImpact: Double
}

object PersonalizationStrategy {
  @scala.inline
  def apply(eventsScoring: js.Array[EventType], facetsScoring: js.Array[Score], personalizationImpact: Double): PersonalizationStrategy = {
    val __obj = js.Dynamic.literal(eventsScoring = eventsScoring.asInstanceOf[js.Any], facetsScoring = facetsScoring.asInstanceOf[js.Any], personalizationImpact = personalizationImpact.asInstanceOf[js.Any])
    __obj.asInstanceOf[PersonalizationStrategy]
  }
}

