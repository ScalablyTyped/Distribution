package typings.awsSdk.clientsPinpointMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateRecommenderConfigurationResponse extends StObject {
  
  var RecommenderConfigurationResponse: typings.awsSdk.clientsPinpointMod.RecommenderConfigurationResponse
}
object CreateRecommenderConfigurationResponse {
  
  inline def apply(RecommenderConfigurationResponse: RecommenderConfigurationResponse): CreateRecommenderConfigurationResponse = {
    val __obj = js.Dynamic.literal(RecommenderConfigurationResponse = RecommenderConfigurationResponse.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateRecommenderConfigurationResponse]
  }
  
  extension [Self <: CreateRecommenderConfigurationResponse](x: Self) {
    
    inline def setRecommenderConfigurationResponse(value: RecommenderConfigurationResponse): Self = StObject.set(x, "RecommenderConfigurationResponse", value.asInstanceOf[js.Any])
  }
}
