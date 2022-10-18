package typings.awsSdk.clientsPinpointMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteRecommenderConfigurationResponse extends StObject {
  
  var RecommenderConfigurationResponse: typings.awsSdk.clientsPinpointMod.RecommenderConfigurationResponse
}
object DeleteRecommenderConfigurationResponse {
  
  inline def apply(RecommenderConfigurationResponse: RecommenderConfigurationResponse): DeleteRecommenderConfigurationResponse = {
    val __obj = js.Dynamic.literal(RecommenderConfigurationResponse = RecommenderConfigurationResponse.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteRecommenderConfigurationResponse]
  }
  
  extension [Self <: DeleteRecommenderConfigurationResponse](x: Self) {
    
    inline def setRecommenderConfigurationResponse(value: RecommenderConfigurationResponse): Self = StObject.set(x, "RecommenderConfigurationResponse", value.asInstanceOf[js.Any])
  }
}
