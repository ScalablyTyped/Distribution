package typings.algoliaClientRecommendation.mod

import typings.algoliaClientRecommendation.AnonEventName
import typings.algoliaClientRecommendation.AnonFacetName
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PersonalizationStrategy extends js.Object {
  /**
    * Events scoring
    */
  val eventsScoring: js.Array[AnonEventName]
  /**
    * Facets scoring
    */
  val facetsScoring: js.Array[AnonFacetName]
  /**
    * Personalization impact
    */
  val personalizationImpact: Double
}

object PersonalizationStrategy {
  @scala.inline
  def apply(
    eventsScoring: js.Array[AnonEventName],
    facetsScoring: js.Array[AnonFacetName],
    personalizationImpact: Double
  ): PersonalizationStrategy = {
    val __obj = js.Dynamic.literal(eventsScoring = eventsScoring.asInstanceOf[js.Any], facetsScoring = facetsScoring.asInstanceOf[js.Any], personalizationImpact = personalizationImpact.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[PersonalizationStrategy]
  }
}

