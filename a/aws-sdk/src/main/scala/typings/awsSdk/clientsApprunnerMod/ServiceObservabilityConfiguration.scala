package typings.awsSdk.clientsApprunnerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ServiceObservabilityConfiguration extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the observability configuration that is associated with the service. Specified only when ObservabilityEnabled is true. Specify an ARN with a name and a revision number to associate that revision. For example: arn:aws:apprunner:us-east-1:123456789012:observabilityconfiguration/xray-tracing/3  Specify just the name to associate the latest revision. For example: arn:aws:apprunner:us-east-1:123456789012:observabilityconfiguration/xray-tracing 
    */
  var ObservabilityConfigurationArn: js.UndefOr[AppRunnerResourceArn] = js.undefined
  
  /**
    * When true, an observability configuration resource is associated with the service, and an ObservabilityConfigurationArn is specified.
    */
  var ObservabilityEnabled: Boolean
}
object ServiceObservabilityConfiguration {
  
  inline def apply(ObservabilityEnabled: Boolean): ServiceObservabilityConfiguration = {
    val __obj = js.Dynamic.literal(ObservabilityEnabled = ObservabilityEnabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServiceObservabilityConfiguration]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ServiceObservabilityConfiguration] (val x: Self) extends AnyVal {
    
    inline def setObservabilityConfigurationArn(value: AppRunnerResourceArn): Self = StObject.set(x, "ObservabilityConfigurationArn", value.asInstanceOf[js.Any])
    
    inline def setObservabilityConfigurationArnUndefined: Self = StObject.set(x, "ObservabilityConfigurationArn", js.undefined)
    
    inline def setObservabilityEnabled(value: Boolean): Self = StObject.set(x, "ObservabilityEnabled", value.asInstanceOf[js.Any])
  }
}
