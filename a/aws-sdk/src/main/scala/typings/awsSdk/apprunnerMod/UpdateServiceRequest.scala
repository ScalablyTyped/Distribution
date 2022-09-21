package typings.awsSdk.apprunnerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateServiceRequest extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of an App Runner automatic scaling configuration resource that you want to associate with the App Runner service.
    */
  var AutoScalingConfigurationArn: js.UndefOr[AppRunnerResourceArn] = js.undefined
  
  /**
    * The settings for the health check that App Runner performs to monitor the health of the App Runner service.
    */
  var HealthCheckConfiguration: js.UndefOr[typings.awsSdk.apprunnerMod.HealthCheckConfiguration] = js.undefined
  
  /**
    * The runtime configuration to apply to instances (scaling units) of your service.
    */
  var InstanceConfiguration: js.UndefOr[typings.awsSdk.apprunnerMod.InstanceConfiguration] = js.undefined
  
  /**
    * Configuration settings related to network traffic of the web application that the App Runner service runs.
    */
  var NetworkConfiguration: js.UndefOr[typings.awsSdk.apprunnerMod.NetworkConfiguration] = js.undefined
  
  /**
    * The observability configuration of your service.
    */
  var ObservabilityConfiguration: js.UndefOr[ServiceObservabilityConfiguration] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the App Runner service that you want to update.
    */
  var ServiceArn: AppRunnerResourceArn
  
  /**
    * The source configuration to apply to the App Runner service. You can change the configuration of the code or image repository that the service uses. However, you can't switch from code to image or the other way around. This means that you must provide the same structure member of SourceConfiguration that you originally included when you created the service. Specifically, you can include either CodeRepository or ImageRepository. To update the source configuration, set the values to members of the structure that you include.
    */
  var SourceConfiguration: js.UndefOr[typings.awsSdk.apprunnerMod.SourceConfiguration] = js.undefined
}
object UpdateServiceRequest {
  
  inline def apply(ServiceArn: AppRunnerResourceArn): UpdateServiceRequest = {
    val __obj = js.Dynamic.literal(ServiceArn = ServiceArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateServiceRequest]
  }
  
  extension [Self <: UpdateServiceRequest](x: Self) {
    
    inline def setAutoScalingConfigurationArn(value: AppRunnerResourceArn): Self = StObject.set(x, "AutoScalingConfigurationArn", value.asInstanceOf[js.Any])
    
    inline def setAutoScalingConfigurationArnUndefined: Self = StObject.set(x, "AutoScalingConfigurationArn", js.undefined)
    
    inline def setHealthCheckConfiguration(value: HealthCheckConfiguration): Self = StObject.set(x, "HealthCheckConfiguration", value.asInstanceOf[js.Any])
    
    inline def setHealthCheckConfigurationUndefined: Self = StObject.set(x, "HealthCheckConfiguration", js.undefined)
    
    inline def setInstanceConfiguration(value: InstanceConfiguration): Self = StObject.set(x, "InstanceConfiguration", value.asInstanceOf[js.Any])
    
    inline def setInstanceConfigurationUndefined: Self = StObject.set(x, "InstanceConfiguration", js.undefined)
    
    inline def setNetworkConfiguration(value: NetworkConfiguration): Self = StObject.set(x, "NetworkConfiguration", value.asInstanceOf[js.Any])
    
    inline def setNetworkConfigurationUndefined: Self = StObject.set(x, "NetworkConfiguration", js.undefined)
    
    inline def setObservabilityConfiguration(value: ServiceObservabilityConfiguration): Self = StObject.set(x, "ObservabilityConfiguration", value.asInstanceOf[js.Any])
    
    inline def setObservabilityConfigurationUndefined: Self = StObject.set(x, "ObservabilityConfiguration", js.undefined)
    
    inline def setServiceArn(value: AppRunnerResourceArn): Self = StObject.set(x, "ServiceArn", value.asInstanceOf[js.Any])
    
    inline def setSourceConfiguration(value: SourceConfiguration): Self = StObject.set(x, "SourceConfiguration", value.asInstanceOf[js.Any])
    
    inline def setSourceConfigurationUndefined: Self = StObject.set(x, "SourceConfiguration", js.undefined)
  }
}
