package typings.awsSdk.apprunnerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateObservabilityConfigurationResponse extends StObject {
  
  /**
    * A description of the App Runner observability configuration that's created by this request.
    */
  var ObservabilityConfiguration: typings.awsSdk.apprunnerMod.ObservabilityConfiguration
}
object CreateObservabilityConfigurationResponse {
  
  inline def apply(ObservabilityConfiguration: ObservabilityConfiguration): CreateObservabilityConfigurationResponse = {
    val __obj = js.Dynamic.literal(ObservabilityConfiguration = ObservabilityConfiguration.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateObservabilityConfigurationResponse]
  }
  
  extension [Self <: CreateObservabilityConfigurationResponse](x: Self) {
    
    inline def setObservabilityConfiguration(value: ObservabilityConfiguration): Self = StObject.set(x, "ObservabilityConfiguration", value.asInstanceOf[js.Any])
  }
}
