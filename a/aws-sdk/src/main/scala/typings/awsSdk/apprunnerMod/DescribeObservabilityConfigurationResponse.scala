package typings.awsSdk.apprunnerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeObservabilityConfigurationResponse extends StObject {
  
  /**
    * A full description of the App Runner observability configuration that you specified in this request.
    */
  var ObservabilityConfiguration: typings.awsSdk.apprunnerMod.ObservabilityConfiguration
}
object DescribeObservabilityConfigurationResponse {
  
  inline def apply(ObservabilityConfiguration: ObservabilityConfiguration): DescribeObservabilityConfigurationResponse = {
    val __obj = js.Dynamic.literal(ObservabilityConfiguration = ObservabilityConfiguration.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeObservabilityConfigurationResponse]
  }
  
  extension [Self <: DescribeObservabilityConfigurationResponse](x: Self) {
    
    inline def setObservabilityConfiguration(value: ObservabilityConfiguration): Self = StObject.set(x, "ObservabilityConfiguration", value.asInstanceOf[js.Any])
  }
}
