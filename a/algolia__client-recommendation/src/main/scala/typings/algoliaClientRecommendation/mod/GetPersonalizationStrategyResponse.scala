package typings.algoliaClientRecommendation.mod

import typings.algoliaClientRecommendation.anon.EventName
import typings.algoliaClientRecommendation.anon.FacetName
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetPersonalizationStrategyResponse extends js.Object {
  /**
    * Events scoring
    */
  var eventsScoring: js.Array[EventName] = js.native
  /**
    * Facets scoring
    */
  var facetsScoring: js.Array[FacetName] = js.native
  /**
    * Personalization impact
    */
  var personalizationImpact: Double = js.native
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
  @scala.inline
  implicit class GetPersonalizationStrategyResponseOps[Self <: GetPersonalizationStrategyResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setEventsScoringVarargs(value: EventName*): Self = this.set("eventsScoring", js.Array(value :_*))
    @scala.inline
    def setEventsScoring(value: js.Array[EventName]): Self = this.set("eventsScoring", value.asInstanceOf[js.Any])
    @scala.inline
    def setFacetsScoringVarargs(value: FacetName*): Self = this.set("facetsScoring", js.Array(value :_*))
    @scala.inline
    def setFacetsScoring(value: js.Array[FacetName]): Self = this.set("facetsScoring", value.asInstanceOf[js.Any])
    @scala.inline
    def setPersonalizationImpact(value: Double): Self = this.set("personalizationImpact", value.asInstanceOf[js.Any])
  }
  
}

