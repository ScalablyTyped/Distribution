package typings.awsSdk.apprunnerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateServiceRequest extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of an App Runner automatic scaling configuration resource that you want to associate with your service. If not provided, App Runner associates the latest revision of a default auto scaling configuration. Specify an ARN with a name and a revision number to associate that revision. For example: arn:aws:apprunner:us-east-1:123456789012:autoscalingconfiguration/high-availability/3  Specify just the name to associate the latest revision. For example: arn:aws:apprunner:us-east-1:123456789012:autoscalingconfiguration/high-availability 
    */
  var AutoScalingConfigurationArn: js.UndefOr[AppRunnerResourceArn] = js.undefined
  
  /**
    * An optional custom encryption key that App Runner uses to encrypt the copy of your source repository that it maintains and your service logs. By default, App Runner uses an Amazon Web Services managed key.
    */
  var EncryptionConfiguration: js.UndefOr[typings.awsSdk.apprunnerMod.EncryptionConfiguration] = js.undefined
  
  /**
    * The settings for the health check that App Runner performs to monitor the health of the App Runner service.
    */
  var HealthCheckConfiguration: js.UndefOr[typings.awsSdk.apprunnerMod.HealthCheckConfiguration] = js.undefined
  
  /**
    * The runtime configuration of instances (scaling units) of your service.
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
    * A name for the App Runner service. It must be unique across all the running App Runner services in your Amazon Web Services account in the Amazon Web Services Region.
    */
  var ServiceName: typings.awsSdk.apprunnerMod.ServiceName
  
  /**
    * The source to deploy to the App Runner service. It can be a code or an image repository.
    */
  var SourceConfiguration: typings.awsSdk.apprunnerMod.SourceConfiguration
  
  /**
    * An optional list of metadata items that you can associate with the App Runner service resource. A tag is a key-value pair.
    */
  var Tags: js.UndefOr[TagList] = js.undefined
}
object CreateServiceRequest {
  
  inline def apply(ServiceName: ServiceName, SourceConfiguration: SourceConfiguration): CreateServiceRequest = {
    val __obj = js.Dynamic.literal(ServiceName = ServiceName.asInstanceOf[js.Any], SourceConfiguration = SourceConfiguration.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateServiceRequest]
  }
  
  extension [Self <: CreateServiceRequest](x: Self) {
    
    inline def setAutoScalingConfigurationArn(value: AppRunnerResourceArn): Self = StObject.set(x, "AutoScalingConfigurationArn", value.asInstanceOf[js.Any])
    
    inline def setAutoScalingConfigurationArnUndefined: Self = StObject.set(x, "AutoScalingConfigurationArn", js.undefined)
    
    inline def setEncryptionConfiguration(value: EncryptionConfiguration): Self = StObject.set(x, "EncryptionConfiguration", value.asInstanceOf[js.Any])
    
    inline def setEncryptionConfigurationUndefined: Self = StObject.set(x, "EncryptionConfiguration", js.undefined)
    
    inline def setHealthCheckConfiguration(value: HealthCheckConfiguration): Self = StObject.set(x, "HealthCheckConfiguration", value.asInstanceOf[js.Any])
    
    inline def setHealthCheckConfigurationUndefined: Self = StObject.set(x, "HealthCheckConfiguration", js.undefined)
    
    inline def setInstanceConfiguration(value: InstanceConfiguration): Self = StObject.set(x, "InstanceConfiguration", value.asInstanceOf[js.Any])
    
    inline def setInstanceConfigurationUndefined: Self = StObject.set(x, "InstanceConfiguration", js.undefined)
    
    inline def setNetworkConfiguration(value: NetworkConfiguration): Self = StObject.set(x, "NetworkConfiguration", value.asInstanceOf[js.Any])
    
    inline def setNetworkConfigurationUndefined: Self = StObject.set(x, "NetworkConfiguration", js.undefined)
    
    inline def setObservabilityConfiguration(value: ServiceObservabilityConfiguration): Self = StObject.set(x, "ObservabilityConfiguration", value.asInstanceOf[js.Any])
    
    inline def setObservabilityConfigurationUndefined: Self = StObject.set(x, "ObservabilityConfiguration", js.undefined)
    
    inline def setServiceName(value: ServiceName): Self = StObject.set(x, "ServiceName", value.asInstanceOf[js.Any])
    
    inline def setSourceConfiguration(value: SourceConfiguration): Self = StObject.set(x, "SourceConfiguration", value.asInstanceOf[js.Any])
    
    inline def setTags(value: TagList): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value*))
  }
}
