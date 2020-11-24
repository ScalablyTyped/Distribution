package typings.algoliaClientSearch.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FindAnswersOptions extends js.Object {
  
  val attributesForPrediction: js.UndefOr[js.Array[String]] = js.native
  
  val nbHits: js.UndefOr[Double] = js.native
  
  val params: js.UndefOr[SearchOptions] = js.native
  
  val threshold: js.UndefOr[Double] = js.native
}
object FindAnswersOptions {
  
  @scala.inline
  def apply(): FindAnswersOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FindAnswersOptions]
  }
  
  @scala.inline
  implicit class FindAnswersOptionsOps[Self <: FindAnswersOptions] (val x: Self) extends AnyVal {
    
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
    def setAttributesForPredictionVarargs(value: String*): Self = this.set("attributesForPrediction", js.Array(value :_*))
    
    @scala.inline
    def setAttributesForPrediction(value: js.Array[String]): Self = this.set("attributesForPrediction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAttributesForPrediction: Self = this.set("attributesForPrediction", js.undefined)
    
    @scala.inline
    def setNbHits(value: Double): Self = this.set("nbHits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNbHits: Self = this.set("nbHits", js.undefined)
    
    @scala.inline
    def setParams(value: SearchOptions): Self = this.set("params", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParams: Self = this.set("params", js.undefined)
    
    @scala.inline
    def setThreshold(value: Double): Self = this.set("threshold", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteThreshold: Self = this.set("threshold", js.undefined)
  }
}
