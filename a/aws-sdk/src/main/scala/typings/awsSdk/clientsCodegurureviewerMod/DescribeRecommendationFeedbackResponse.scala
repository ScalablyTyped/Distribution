package typings.awsSdk.clientsCodegurureviewerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeRecommendationFeedbackResponse extends StObject {
  
  /**
    * The recommendation feedback given by the user.
    */
  var RecommendationFeedback: js.UndefOr[typings.awsSdk.clientsCodegurureviewerMod.RecommendationFeedback] = js.undefined
}
object DescribeRecommendationFeedbackResponse {
  
  inline def apply(): DescribeRecommendationFeedbackResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeRecommendationFeedbackResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeRecommendationFeedbackResponse] (val x: Self) extends AnyVal {
    
    inline def setRecommendationFeedback(value: RecommendationFeedback): Self = StObject.set(x, "RecommendationFeedback", value.asInstanceOf[js.Any])
    
    inline def setRecommendationFeedbackUndefined: Self = StObject.set(x, "RecommendationFeedback", js.undefined)
  }
}
