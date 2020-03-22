package typings.algoliaClientRecommendation.mod

import typings.algoliaClientRecommendation.AnonEventName
import typings.algoliaClientRecommendation.AnonFacetName
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetPersonalizationStrategyResponse extends js.Object {
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

object GetPersonalizationStrategyResponse {
  @scala.inline
  def apply(
    eventsScoring: js.Array[AnonEventName],
    facetsScoring: js.Array[AnonFacetName],
    personalizationImpact: Double
  ): GetPersonalizationStrategyResponse = {
    val __obj = js.Dynamic.literal(eventsScoring = eventsScoring.asInstanceOf[js.Any], facetsScoring = facetsScoring.asInstanceOf[js.Any], personalizationImpact = personalizationImpact.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GetPersonalizationStrategyResponse]
  }
}

