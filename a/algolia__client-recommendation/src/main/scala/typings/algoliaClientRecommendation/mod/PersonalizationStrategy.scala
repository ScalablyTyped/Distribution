package typings.algoliaClientRecommendation.mod

import typings.algoliaClientRecommendation.anon.EventType
import typings.algoliaClientRecommendation.anon.Score
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PersonalizationStrategy extends js.Object {
  /**
    * Events scoring
    */
  val eventsScoring: js.Array[EventType] = js.native
  /**
    * Facets scoring
    */
  val facetsScoring: js.Array[Score] = js.native
  /**
    * Personalization impact
    */
  val personalizationImpact: Double = js.native
}

object PersonalizationStrategy {
  @scala.inline
  def apply(eventsScoring: js.Array[EventType], facetsScoring: js.Array[Score], personalizationImpact: Double): PersonalizationStrategy = {
    val __obj = js.Dynamic.literal(eventsScoring = eventsScoring.asInstanceOf[js.Any], facetsScoring = facetsScoring.asInstanceOf[js.Any], personalizationImpact = personalizationImpact.asInstanceOf[js.Any])
    __obj.asInstanceOf[PersonalizationStrategy]
  }
  @scala.inline
  implicit class PersonalizationStrategyOps[Self <: PersonalizationStrategy] (val x: Self) extends AnyVal {
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
    def setEventsScoringVarargs(value: EventType*): Self = this.set("eventsScoring", js.Array(value :_*))
    @scala.inline
    def setEventsScoring(value: js.Array[EventType]): Self = this.set("eventsScoring", value.asInstanceOf[js.Any])
    @scala.inline
    def setFacetsScoringVarargs(value: Score*): Self = this.set("facetsScoring", js.Array(value :_*))
    @scala.inline
    def setFacetsScoring(value: js.Array[Score]): Self = this.set("facetsScoring", value.asInstanceOf[js.Any])
    @scala.inline
    def setPersonalizationImpact(value: Double): Self = this.set("personalizationImpact", value.asInstanceOf[js.Any])
  }
  
}

