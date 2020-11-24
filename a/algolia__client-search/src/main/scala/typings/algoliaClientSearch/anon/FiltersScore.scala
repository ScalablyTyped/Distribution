package typings.algoliaClientSearch.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FiltersScore extends js.Object {
  
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
  implicit class FiltersScoreOps[Self <: FiltersScore] (val x: Self) extends AnyVal {
    
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
    def setFiltersScore(value: Double): Self = this.set("filtersScore", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRankingScore(value: Double): Self = this.set("rankingScore", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScore(value: Double): Self = this.set("score", value.asInstanceOf[js.Any])
  }
}
