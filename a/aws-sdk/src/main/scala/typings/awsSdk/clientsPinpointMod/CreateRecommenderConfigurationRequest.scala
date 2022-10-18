package typings.awsSdk.clientsPinpointMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateRecommenderConfigurationRequest extends StObject {
  
  var CreateRecommenderConfiguration: typings.awsSdk.clientsPinpointMod.CreateRecommenderConfiguration
}
object CreateRecommenderConfigurationRequest {
  
  inline def apply(CreateRecommenderConfiguration: CreateRecommenderConfiguration): CreateRecommenderConfigurationRequest = {
    val __obj = js.Dynamic.literal(CreateRecommenderConfiguration = CreateRecommenderConfiguration.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateRecommenderConfigurationRequest]
  }
  
  extension [Self <: CreateRecommenderConfigurationRequest](x: Self) {
    
    inline def setCreateRecommenderConfiguration(value: CreateRecommenderConfiguration): Self = StObject.set(x, "CreateRecommenderConfiguration", value.asInstanceOf[js.Any])
  }
}
