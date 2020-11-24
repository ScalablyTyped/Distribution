package typings.algoliaClientSearch.mod

import typings.algoliaClientSearch.anon.Distance
import typings.algoliaClientSearch.anon.FiltersScore
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RankingInfo extends js.Object {
  
  val filters: Double = js.native
  
  val firstMatchedWord: Double = js.native
  
  val geoDistance: Double = js.native
  
  val geoPrecision: js.UndefOr[Double] = js.native
  
  val matchedGeoLocation: js.UndefOr[Distance] = js.native
  
  val nbExactWords: Double = js.native
  
  val nbTypos: Double = js.native
  
  val personalization: js.UndefOr[FiltersScore] = js.native
  
  val promoted: Boolean = js.native
  
  val proximityDistance: js.UndefOr[Double] = js.native
  
  val userScore: Double = js.native
  
  val words: Double = js.native
}
object RankingInfo {
  
  @scala.inline
  def apply(
    filters: Double,
    firstMatchedWord: Double,
    geoDistance: Double,
    nbExactWords: Double,
    nbTypos: Double,
    promoted: Boolean,
    userScore: Double,
    words: Double
  ): RankingInfo = {
    val __obj = js.Dynamic.literal(filters = filters.asInstanceOf[js.Any], firstMatchedWord = firstMatchedWord.asInstanceOf[js.Any], geoDistance = geoDistance.asInstanceOf[js.Any], nbExactWords = nbExactWords.asInstanceOf[js.Any], nbTypos = nbTypos.asInstanceOf[js.Any], promoted = promoted.asInstanceOf[js.Any], userScore = userScore.asInstanceOf[js.Any], words = words.asInstanceOf[js.Any])
    __obj.asInstanceOf[RankingInfo]
  }
  
  @scala.inline
  implicit class RankingInfoOps[Self <: RankingInfo] (val x: Self) extends AnyVal {
    
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
    def setFilters(value: Double): Self = this.set("filters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFirstMatchedWord(value: Double): Self = this.set("firstMatchedWord", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGeoDistance(value: Double): Self = this.set("geoDistance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNbExactWords(value: Double): Self = this.set("nbExactWords", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNbTypos(value: Double): Self = this.set("nbTypos", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPromoted(value: Boolean): Self = this.set("promoted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserScore(value: Double): Self = this.set("userScore", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWords(value: Double): Self = this.set("words", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGeoPrecision(value: Double): Self = this.set("geoPrecision", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGeoPrecision: Self = this.set("geoPrecision", js.undefined)
    
    @scala.inline
    def setMatchedGeoLocation(value: Distance): Self = this.set("matchedGeoLocation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMatchedGeoLocation: Self = this.set("matchedGeoLocation", js.undefined)
    
    @scala.inline
    def setPersonalization(value: FiltersScore): Self = this.set("personalization", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePersonalization: Self = this.set("personalization", js.undefined)
    
    @scala.inline
    def setProximityDistance(value: Double): Self = this.set("proximityDistance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProximityDistance: Self = this.set("proximityDistance", js.undefined)
  }
}
