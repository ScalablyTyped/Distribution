package typings.algoliaClientSearch.mod

import typings.algoliaClientSearch.anon.Distance
import typings.algoliaClientSearch.anon.FiltersScore
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RankingInfo extends StObject {
  
  val filters: Double
  
  val firstMatchedWord: Double
  
  val geoDistance: Double
  
  val geoPrecision: js.UndefOr[Double] = js.undefined
  
  val matchedGeoLocation: js.UndefOr[Distance] = js.undefined
  
  val nbExactWords: Double
  
  val nbTypos: Double
  
  val personalization: js.UndefOr[FiltersScore] = js.undefined
  
  val promoted: Boolean
  
  val proximityDistance: js.UndefOr[Double] = js.undefined
  
  val userScore: Double
  
  val words: Double
}
object RankingInfo {
  
  inline def apply(
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
  
  extension [Self <: RankingInfo](x: Self) {
    
    inline def setFilters(value: Double): Self = StObject.set(x, "filters", value.asInstanceOf[js.Any])
    
    inline def setFirstMatchedWord(value: Double): Self = StObject.set(x, "firstMatchedWord", value.asInstanceOf[js.Any])
    
    inline def setGeoDistance(value: Double): Self = StObject.set(x, "geoDistance", value.asInstanceOf[js.Any])
    
    inline def setGeoPrecision(value: Double): Self = StObject.set(x, "geoPrecision", value.asInstanceOf[js.Any])
    
    inline def setGeoPrecisionUndefined: Self = StObject.set(x, "geoPrecision", js.undefined)
    
    inline def setMatchedGeoLocation(value: Distance): Self = StObject.set(x, "matchedGeoLocation", value.asInstanceOf[js.Any])
    
    inline def setMatchedGeoLocationUndefined: Self = StObject.set(x, "matchedGeoLocation", js.undefined)
    
    inline def setNbExactWords(value: Double): Self = StObject.set(x, "nbExactWords", value.asInstanceOf[js.Any])
    
    inline def setNbTypos(value: Double): Self = StObject.set(x, "nbTypos", value.asInstanceOf[js.Any])
    
    inline def setPersonalization(value: FiltersScore): Self = StObject.set(x, "personalization", value.asInstanceOf[js.Any])
    
    inline def setPersonalizationUndefined: Self = StObject.set(x, "personalization", js.undefined)
    
    inline def setPromoted(value: Boolean): Self = StObject.set(x, "promoted", value.asInstanceOf[js.Any])
    
    inline def setProximityDistance(value: Double): Self = StObject.set(x, "proximityDistance", value.asInstanceOf[js.Any])
    
    inline def setProximityDistanceUndefined: Self = StObject.set(x, "proximityDistance", js.undefined)
    
    inline def setUserScore(value: Double): Self = StObject.set(x, "userScore", value.asInstanceOf[js.Any])
    
    inline def setWords(value: Double): Self = StObject.set(x, "words", value.asInstanceOf[js.Any])
  }
}
