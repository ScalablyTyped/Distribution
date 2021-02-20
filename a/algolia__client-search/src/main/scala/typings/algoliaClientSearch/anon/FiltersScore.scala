package typings.algoliaClientSearch.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FiltersScore extends StObject {
  
  val filtersScore: Double = js.native
  
  val rankingScore: Double = js.native
  
  val score: Double = js.native
}
object FiltersScore {
  
  @scala.inline
  def apply(filtersScore: Double, rankingScore: Double, score: Double): FiltersScore = {
    val __obj = js.Dynamic.literal(filtersScore = filtersScore.asInstanceOf[js.Any], rankingScore = rankingScore.asInstanceOf[js.Any], score = score.asInstanceOf[js.Any])
    __obj.asInstanceOf[FiltersScore]
  }
  
  @scala.inline
  implicit class FiltersScoreMutableBuilder[Self <: FiltersScore] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFiltersScore(value: Double): Self = StObject.set(x, "filtersScore", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRankingScore(value: Double): Self = StObject.set(x, "rankingScore", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScore(value: Double): Self = StObject.set(x, "score", value.asInstanceOf[js.Any])
  }
}
