package typings.algoliaClientSearch.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FindAnswersOptions extends StObject {
  
  val attributesForPrediction: js.UndefOr[js.Array[String]] = js.undefined
  
  val nbHits: js.UndefOr[Double] = js.undefined
  
  val params: js.UndefOr[SearchOptions] = js.undefined
  
  val threshold: js.UndefOr[Double] = js.undefined
}
object FindAnswersOptions {
  
  @scala.inline
  def apply(): FindAnswersOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FindAnswersOptions]
  }
  
  @scala.inline
  implicit class FindAnswersOptionsMutableBuilder[Self <: FindAnswersOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAttributesForPrediction(value: js.Array[String]): Self = StObject.set(x, "attributesForPrediction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttributesForPredictionUndefined: Self = StObject.set(x, "attributesForPrediction", js.undefined)
    
    @scala.inline
    def setAttributesForPredictionVarargs(value: String*): Self = StObject.set(x, "attributesForPrediction", js.Array(value :_*))
    
    @scala.inline
    def setNbHits(value: Double): Self = StObject.set(x, "nbHits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNbHitsUndefined: Self = StObject.set(x, "nbHits", js.undefined)
    
    @scala.inline
    def setParams(value: SearchOptions): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParamsUndefined: Self = StObject.set(x, "params", js.undefined)
    
    @scala.inline
    def setThreshold(value: Double): Self = StObject.set(x, "threshold", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThresholdUndefined: Self = StObject.set(x, "threshold", js.undefined)
  }
}
