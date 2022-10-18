package typings.awsSdk.clientsComputeoptimizerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetEffectiveRecommendationPreferencesRequest extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the resource for which to confirm effective recommendation preferences. Only EC2 instance and Auto Scaling group ARNs are currently supported.
    */
  var resourceArn: ResourceArn
}
object GetEffectiveRecommendationPreferencesRequest {
  
  inline def apply(resourceArn: ResourceArn): GetEffectiveRecommendationPreferencesRequest = {
    val __obj = js.Dynamic.literal(resourceArn = resourceArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetEffectiveRecommendationPreferencesRequest]
  }
  
  extension [Self <: GetEffectiveRecommendationPreferencesRequest](x: Self) {
    
    inline def setResourceArn(value: ResourceArn): Self = StObject.set(x, "resourceArn", value.asInstanceOf[js.Any])
  }
}
