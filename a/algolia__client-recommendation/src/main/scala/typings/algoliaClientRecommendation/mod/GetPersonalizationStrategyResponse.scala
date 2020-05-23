package typings.algoliaClientRecommendation.mod

import typings.algoliaClientRecommendation.anon.EventName
import typings.algoliaClientRecommendation.anon.FacetName
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetPersonalizationStrategyResponse extends js.Object {
  /**
    * Events scoring
    */
  var eventsScoring: js.Array[EventName]
  /**
    * Facets scoring
    */
  var facetsScoring: js.Array[FacetName]
  /**
    * Personalization impact
    */
  var personalizationImpact: Double
}

object GetPersonalizationStrategyResponse {
  @scala.inline
  def apply(
    eventsScoring: js.Array[EventName],
    facetsScoring: js.Array[FacetName],
    personalizationImpact: Double
  ): GetPersonalizationStrategyResponse = {
    val __obj = js.Dynamic.literal(eventsScoring = eventsScoring.asInstanceOf[js.Any], facetsScoring = facetsScoring.asInstanceOf[js.Any], personalizationImpact = personalizationImpact.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetPersonalizationStrategyResponse]
  }
}

