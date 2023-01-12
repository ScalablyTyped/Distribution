package typings.awsSdk.clientsResiliencehubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteRecommendationTemplateRequest extends StObject {
  
  /**
    * Used for an idempotency token. A client token is a unique, case-sensitive string of up to 64 ASCII characters. You should not reuse the same client token for other API requests.
    */
  var clientToken: js.UndefOr[ClientToken] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) for a recommendation template.
    */
  var recommendationTemplateArn: Arn
}
object DeleteRecommendationTemplateRequest {
  
  inline def apply(recommendationTemplateArn: Arn): DeleteRecommendationTemplateRequest = {
    val __obj = js.Dynamic.literal(recommendationTemplateArn = recommendationTemplateArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteRecommendationTemplateRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteRecommendationTemplateRequest] (val x: Self) extends AnyVal {
    
    inline def setClientToken(value: ClientToken): Self = StObject.set(x, "clientToken", value.asInstanceOf[js.Any])
    
    inline def setClientTokenUndefined: Self = StObject.set(x, "clientToken", js.undefined)
    
    inline def setRecommendationTemplateArn(value: Arn): Self = StObject.set(x, "recommendationTemplateArn", value.asInstanceOf[js.Any])
  }
}
