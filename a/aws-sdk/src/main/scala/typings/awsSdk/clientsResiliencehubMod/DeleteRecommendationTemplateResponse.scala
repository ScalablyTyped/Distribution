package typings.awsSdk.clientsResiliencehubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteRecommendationTemplateResponse extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) for a recommendation template.
    */
  var recommendationTemplateArn: Arn
  
  /**
    * The status of the action.
    */
  var status: RecommendationTemplateStatus
}
object DeleteRecommendationTemplateResponse {
  
  inline def apply(recommendationTemplateArn: Arn, status: RecommendationTemplateStatus): DeleteRecommendationTemplateResponse = {
    val __obj = js.Dynamic.literal(recommendationTemplateArn = recommendationTemplateArn.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteRecommendationTemplateResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteRecommendationTemplateResponse] (val x: Self) extends AnyVal {
    
    inline def setRecommendationTemplateArn(value: Arn): Self = StObject.set(x, "recommendationTemplateArn", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: RecommendationTemplateStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
  }
}
