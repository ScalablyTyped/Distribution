package typings.awsSdk.apprunnerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Service extends StObject {
  
  /**
    * Summary information for the App Runner automatic scaling configuration resource that's associated with this service.
    */
  var AutoScalingConfigurationSummary: typings.awsSdk.apprunnerMod.AutoScalingConfigurationSummary
  
  /**
    * The time when the App Runner service was created. It's in the Unix time stamp format.
    */
  var CreatedAt: js.Date
  
  /**
    * The time when the App Runner service was deleted. It's in the Unix time stamp format.
    */
  var DeletedAt: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The encryption key that App Runner uses to encrypt the service logs and the copy of the source repository that App Runner maintains for the service. It can be either a customer-provided encryption key or an Amazon Web Services managed key.
    */
  var EncryptionConfiguration: js.UndefOr[typings.awsSdk.apprunnerMod.EncryptionConfiguration] = js.undefined
  
  /**
    * The settings for the health check that App Runner performs to monitor the health of this service.
    */
  var HealthCheckConfiguration: js.UndefOr[typings.awsSdk.apprunnerMod.HealthCheckConfiguration] = js.undefined
  
  /**
    * The runtime configuration of instances (scaling units) of this service.
    */
  var InstanceConfiguration: typings.awsSdk.apprunnerMod.InstanceConfiguration
  
  /**
    * Configuration settings related to network traffic of the web application that this service runs.
    */
  var NetworkConfiguration: typings.awsSdk.apprunnerMod.NetworkConfiguration
  
  /**
    * The observability configuration of this service.
    */
  var ObservabilityConfiguration: js.UndefOr[ServiceObservabilityConfiguration] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of this service.
    */
  var ServiceArn: AppRunnerResourceArn
  
  /**
    * An ID that App Runner generated for this service. It's unique within the Amazon Web Services Region.
    */
  var ServiceId: typings.awsSdk.apprunnerMod.ServiceId
  
  /**
    * The customer-provided service name.
    */
  var ServiceName: typings.awsSdk.apprunnerMod.ServiceName
  
  /**
    * A subdomain URL that App Runner generated for this service. You can use this URL to access your service web application.
    */
  var ServiceUrl: String
  
  /**
    * The source deployed to the App Runner service. It can be a code or an image repository.
    */
  var SourceConfiguration: typings.awsSdk.apprunnerMod.SourceConfiguration
  
  /**
    * The current state of the App Runner service. These particular values mean the following.    CREATE_FAILED – The service failed to create. To troubleshoot this failure, read the failure events and logs, change any parameters that need to be fixed, and retry the call to create the service. The failed service isn't usable, and still counts towards your service quota. When you're done analyzing the failure, delete the service.    DELETE_FAILED – The service failed to delete and can't be successfully recovered. Retry the service deletion call to ensure that all related resources are removed.  
    */
  var Status: ServiceStatus
  
  /**
    * The time when the App Runner service was last updated at. It's in the Unix time stamp format.
    */
  var UpdatedAt: js.Date
}
object Service {
  
  inline def apply(
    AutoScalingConfigurationSummary: AutoScalingConfigurationSummary,
    CreatedAt: js.Date,
    InstanceConfiguration: InstanceConfiguration,
    NetworkConfiguration: NetworkConfiguration,
    ServiceArn: AppRunnerResourceArn,
    ServiceId: ServiceId,
    ServiceName: ServiceName,
    ServiceUrl: String,
    SourceConfiguration: SourceConfiguration,
    Status: ServiceStatus,
    UpdatedAt: js.Date
  ): Service = {
    val __obj = js.Dynamic.literal(AutoScalingConfigurationSummary = AutoScalingConfigurationSummary.asInstanceOf[js.Any], CreatedAt = CreatedAt.asInstanceOf[js.Any], InstanceConfiguration = InstanceConfiguration.asInstanceOf[js.Any], NetworkConfiguration = NetworkConfiguration.asInstanceOf[js.Any], ServiceArn = ServiceArn.asInstanceOf[js.Any], ServiceId = ServiceId.asInstanceOf[js.Any], ServiceName = ServiceName.asInstanceOf[js.Any], ServiceUrl = ServiceUrl.asInstanceOf[js.Any], SourceConfiguration = SourceConfiguration.asInstanceOf[js.Any], Status = Status.asInstanceOf[js.Any], UpdatedAt = UpdatedAt.asInstanceOf[js.Any])
    __obj.asInstanceOf[Service]
  }
  
  extension [Self <: Service](x: Self) {
    
    inline def setAutoScalingConfigurationSummary(value: AutoScalingConfigurationSummary): Self = StObject.set(x, "AutoScalingConfigurationSummary", value.asInstanceOf[js.Any])
    
    inline def setCreatedAt(value: js.Date): Self = StObject.set(x, "CreatedAt", value.asInstanceOf[js.Any])
    
    inline def setDeletedAt(value: js.Date): Self = StObject.set(x, "DeletedAt", value.asInstanceOf[js.Any])
    
    inline def setDeletedAtUndefined: Self = StObject.set(x, "DeletedAt", js.undefined)
    
    inline def setEncryptionConfiguration(value: EncryptionConfiguration): Self = StObject.set(x, "EncryptionConfiguration", value.asInstanceOf[js.Any])
    
    inline def setEncryptionConfigurationUndefined: Self = StObject.set(x, "EncryptionConfiguration", js.undefined)
    
    inline def setHealthCheckConfiguration(value: HealthCheckConfiguration): Self = StObject.set(x, "HealthCheckConfiguration", value.asInstanceOf[js.Any])
    
    inline def setHealthCheckConfigurationUndefined: Self = StObject.set(x, "HealthCheckConfiguration", js.undefined)
    
    inline def setInstanceConfiguration(value: InstanceConfiguration): Self = StObject.set(x, "InstanceConfiguration", value.asInstanceOf[js.Any])
    
    inline def setNetworkConfiguration(value: NetworkConfiguration): Self = StObject.set(x, "NetworkConfiguration", value.asInstanceOf[js.Any])
    
    inline def setObservabilityConfiguration(value: ServiceObservabilityConfiguration): Self = StObject.set(x, "ObservabilityConfiguration", value.asInstanceOf[js.Any])
    
    inline def setObservabilityConfigurationUndefined: Self = StObject.set(x, "ObservabilityConfiguration", js.undefined)
    
    inline def setServiceArn(value: AppRunnerResourceArn): Self = StObject.set(x, "ServiceArn", value.asInstanceOf[js.Any])
    
    inline def setServiceId(value: ServiceId): Self = StObject.set(x, "ServiceId", value.asInstanceOf[js.Any])
    
    inline def setServiceName(value: ServiceName): Self = StObject.set(x, "ServiceName", value.asInstanceOf[js.Any])
    
    inline def setServiceUrl(value: String): Self = StObject.set(x, "ServiceUrl", value.asInstanceOf[js.Any])
    
    inline def setSourceConfiguration(value: SourceConfiguration): Self = StObject.set(x, "SourceConfiguration", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: ServiceStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setUpdatedAt(value: js.Date): Self = StObject.set(x, "UpdatedAt", value.asInstanceOf[js.Any])
  }
}
