package typings.awsSdk.clientsPinpointMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetRecommenderConfigurationResponse extends StObject {
  
  var RecommenderConfigurationResponse: typings.awsSdk.clientsPinpointMod.RecommenderConfigurationResponse
}
object GetRecommenderConfigurationResponse {
  
  inline def apply(RecommenderConfigurationResponse: RecommenderConfigurationResponse): GetRecommenderConfigurationResponse = {
    val __obj = js.Dynamic.literal(RecommenderConfigurationResponse = RecommenderConfigurationResponse.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetRecommenderConfigurationResponse]
  }
  
  extension [Self <: GetRecommenderConfigurationResponse](x: Self) {
    
    inline def setRecommenderConfigurationResponse(value: RecommenderConfigurationResponse): Self = StObject.set(x, "RecommenderConfigurationResponse", value.asInstanceOf[js.Any])
  }
}
