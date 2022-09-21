package typings.awsSdk.apprunnerMod

import typings.awsSdk.configBaseMod.ConfigBase
import typings.awsSdk.errorMod.AWSError
import typings.awsSdk.requestMod.Request
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AppRunner
  extends StObject
     with Service {
  
  /**
    * Associate your own domain name with the App Runner subdomain URL of your App Runner service. After you call AssociateCustomDomain and receive a successful response, use the information in the CustomDomain record that's returned to add CNAME records to your Domain Name System (DNS). For each mapped domain name, add a mapping to the target App Runner subdomain and one or more certificate validation records. App Runner then performs DNS validation to verify that you own or control the domain name that you associated. App Runner tracks domain validity in a certificate stored in AWS Certificate Manager (ACM).
    */
  def associateCustomDomain(): Request[AssociateCustomDomainResponse, AWSError] = js.native
  def associateCustomDomain(callback: js.Function2[/* err */ AWSError, /* data */ AssociateCustomDomainResponse, Unit]): Request[AssociateCustomDomainResponse, AWSError] = js.native
  /**
    * Associate your own domain name with the App Runner subdomain URL of your App Runner service. After you call AssociateCustomDomain and receive a successful response, use the information in the CustomDomain record that's returned to add CNAME records to your Domain Name System (DNS). For each mapped domain name, add a mapping to the target App Runner subdomain and one or more certificate validation records. App Runner then performs DNS validation to verify that you own or control the domain name that you associated. App Runner tracks domain validity in a certificate stored in AWS Certificate Manager (ACM).
    */
  def associateCustomDomain(params: AssociateCustomDomainRequest): Request[AssociateCustomDomainResponse, AWSError] = js.native
  def associateCustomDomain(
    params: AssociateCustomDomainRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ AssociateCustomDomainResponse, Unit]
  ): Request[AssociateCustomDomainResponse, AWSError] = js.native
  
  var config: ConfigBase & ClientConfiguration = js.native
  
  /**
    * Create an App Runner automatic scaling configuration resource. App Runner requires this resource when you create or update App Runner services and you require non-default auto scaling settings. You can share an auto scaling configuration across multiple services. Create multiple revisions of a configuration by calling this action multiple times using the same AutoScalingConfigurationName. The call returns incremental AutoScalingConfigurationRevision values. When you create a service and configure an auto scaling configuration resource, the service uses the latest active revision of the auto scaling configuration by default. You can optionally configure the service to use a specific revision. Configure a higher MinSize to increase the spread of your App Runner service over more Availability Zones in the Amazon Web Services Region. The tradeoff is a higher minimal cost. Configure a lower MaxSize to control your cost. The tradeoff is lower responsiveness during peak demand.
    */
  def createAutoScalingConfiguration(): Request[CreateAutoScalingConfigurationResponse, AWSError] = js.native
  def createAutoScalingConfiguration(
    callback: js.Function2[/* err */ AWSError, /* data */ CreateAutoScalingConfigurationResponse, Unit]
  ): Request[CreateAutoScalingConfigurationResponse, AWSError] = js.native
  /**
    * Create an App Runner automatic scaling configuration resource. App Runner requires this resource when you create or update App Runner services and you require non-default auto scaling settings. You can share an auto scaling configuration across multiple services. Create multiple revisions of a configuration by calling this action multiple times using the same AutoScalingConfigurationName. The call returns incremental AutoScalingConfigurationRevision values. When you create a service and configure an auto scaling configuration resource, the service uses the latest active revision of the auto scaling configuration by default. You can optionally configure the service to use a specific revision. Configure a higher MinSize to increase the spread of your App Runner service over more Availability Zones in the Amazon Web Services Region. The tradeoff is a higher minimal cost. Configure a lower MaxSize to control your cost. The tradeoff is lower responsiveness during peak demand.
    */
  def createAutoScalingConfiguration(params: CreateAutoScalingConfigurationRequest): Request[CreateAutoScalingConfigurationResponse, AWSError] = js.native
  def createAutoScalingConfiguration(
    params: CreateAutoScalingConfigurationRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateAutoScalingConfigurationResponse, Unit]
  ): Request[CreateAutoScalingConfigurationResponse, AWSError] = js.native
  
  /**
    * Create an App Runner connection resource. App Runner requires a connection resource when you create App Runner services that access private repositories from certain third-party providers. You can share a connection across multiple services. A connection resource is needed to access GitHub repositories. GitHub requires a user interface approval process through the App Runner console before you can use the connection.
    */
  def createConnection(): Request[CreateConnectionResponse, AWSError] = js.native
  def createConnection(callback: js.Function2[/* err */ AWSError, /* data */ CreateConnectionResponse, Unit]): Request[CreateConnectionResponse, AWSError] = js.native
  /**
    * Create an App Runner connection resource. App Runner requires a connection resource when you create App Runner services that access private repositories from certain third-party providers. You can share a connection across multiple services. A connection resource is needed to access GitHub repositories. GitHub requires a user interface approval process through the App Runner console before you can use the connection.
    */
  def createConnection(params: CreateConnectionRequest): Request[CreateConnectionResponse, AWSError] = js.native
  def createConnection(
    params: CreateConnectionRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateConnectionResponse, Unit]
  ): Request[CreateConnectionResponse, AWSError] = js.native
  
  /**
    * Create an App Runner observability configuration resource. App Runner requires this resource when you create or update App Runner services and you want to enable non-default observability features. You can share an observability configuration across multiple services. Create multiple revisions of a configuration by calling this action multiple times using the same ObservabilityConfigurationName. The call returns incremental ObservabilityConfigurationRevision values. When you create a service and configure an observability configuration resource, the service uses the latest active revision of the observability configuration by default. You can optionally configure the service to use a specific revision. The observability configuration resource is designed to configure multiple features (currently one feature, tracing). This action takes optional parameters that describe the configuration of these features (currently one parameter, TraceConfiguration). If you don't specify a feature parameter, App Runner doesn't enable the feature.
    */
  def createObservabilityConfiguration(): Request[CreateObservabilityConfigurationResponse, AWSError] = js.native
  def createObservabilityConfiguration(
    callback: js.Function2[/* err */ AWSError, /* data */ CreateObservabilityConfigurationResponse, Unit]
  ): Request[CreateObservabilityConfigurationResponse, AWSError] = js.native
  /**
    * Create an App Runner observability configuration resource. App Runner requires this resource when you create or update App Runner services and you want to enable non-default observability features. You can share an observability configuration across multiple services. Create multiple revisions of a configuration by calling this action multiple times using the same ObservabilityConfigurationName. The call returns incremental ObservabilityConfigurationRevision values. When you create a service and configure an observability configuration resource, the service uses the latest active revision of the observability configuration by default. You can optionally configure the service to use a specific revision. The observability configuration resource is designed to configure multiple features (currently one feature, tracing). This action takes optional parameters that describe the configuration of these features (currently one parameter, TraceConfiguration). If you don't specify a feature parameter, App Runner doesn't enable the feature.
    */
  def createObservabilityConfiguration(params: CreateObservabilityConfigurationRequest): Request[CreateObservabilityConfigurationResponse, AWSError] = js.native
  def createObservabilityConfiguration(
    params: CreateObservabilityConfigurationRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateObservabilityConfigurationResponse, Unit]
  ): Request[CreateObservabilityConfigurationResponse, AWSError] = js.native
  
  /**
    * Create an App Runner service. After the service is created, the action also automatically starts a deployment. This is an asynchronous operation. On a successful call, you can use the returned OperationId and the ListOperations call to track the operation's progress.
    */
  def createService(): Request[CreateServiceResponse, AWSError] = js.native
  def createService(callback: js.Function2[/* err */ AWSError, /* data */ CreateServiceResponse, Unit]): Request[CreateServiceResponse, AWSError] = js.native
  /**
    * Create an App Runner service. After the service is created, the action also automatically starts a deployment. This is an asynchronous operation. On a successful call, you can use the returned OperationId and the ListOperations call to track the operation's progress.
    */
  def createService(params: CreateServiceRequest): Request[CreateServiceResponse, AWSError] = js.native
  def createService(
    params: CreateServiceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateServiceResponse, Unit]
  ): Request[CreateServiceResponse, AWSError] = js.native
  
  /**
    * Create an App Runner VPC connector resource. App Runner requires this resource when you want to associate your App Runner service to a custom Amazon Virtual Private Cloud (Amazon VPC).
    */
  def createVpcConnector(): Request[CreateVpcConnectorResponse, AWSError] = js.native
  def createVpcConnector(callback: js.Function2[/* err */ AWSError, /* data */ CreateVpcConnectorResponse, Unit]): Request[CreateVpcConnectorResponse, AWSError] = js.native
  /**
    * Create an App Runner VPC connector resource. App Runner requires this resource when you want to associate your App Runner service to a custom Amazon Virtual Private Cloud (Amazon VPC).
    */
  def createVpcConnector(params: CreateVpcConnectorRequest): Request[CreateVpcConnectorResponse, AWSError] = js.native
  def createVpcConnector(
    params: CreateVpcConnectorRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateVpcConnectorResponse, Unit]
  ): Request[CreateVpcConnectorResponse, AWSError] = js.native
  
  /**
    * Delete an App Runner automatic scaling configuration resource. You can delete a specific revision or the latest active revision. You can't delete a configuration that's used by one or more App Runner services.
    */
  def deleteAutoScalingConfiguration(): Request[DeleteAutoScalingConfigurationResponse, AWSError] = js.native
  def deleteAutoScalingConfiguration(
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteAutoScalingConfigurationResponse, Unit]
  ): Request[DeleteAutoScalingConfigurationResponse, AWSError] = js.native
  /**
    * Delete an App Runner automatic scaling configuration resource. You can delete a specific revision or the latest active revision. You can't delete a configuration that's used by one or more App Runner services.
    */
  def deleteAutoScalingConfiguration(params: DeleteAutoScalingConfigurationRequest): Request[DeleteAutoScalingConfigurationResponse, AWSError] = js.native
  def deleteAutoScalingConfiguration(
    params: DeleteAutoScalingConfigurationRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteAutoScalingConfigurationResponse, Unit]
  ): Request[DeleteAutoScalingConfigurationResponse, AWSError] = js.native
  
  /**
    * Delete an App Runner connection. You must first ensure that there are no running App Runner services that use this connection. If there are any, the DeleteConnection action fails.
    */
  def deleteConnection(): Request[DeleteConnectionResponse, AWSError] = js.native
  def deleteConnection(callback: js.Function2[/* err */ AWSError, /* data */ DeleteConnectionResponse, Unit]): Request[DeleteConnectionResponse, AWSError] = js.native
  /**
    * Delete an App Runner connection. You must first ensure that there are no running App Runner services that use this connection. If there are any, the DeleteConnection action fails.
    */
  def deleteConnection(params: DeleteConnectionRequest): Request[DeleteConnectionResponse, AWSError] = js.native
  def deleteConnection(
    params: DeleteConnectionRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteConnectionResponse, Unit]
  ): Request[DeleteConnectionResponse, AWSError] = js.native
  
  /**
    * Delete an App Runner observability configuration resource. You can delete a specific revision or the latest active revision. You can't delete a configuration that's used by one or more App Runner services.
    */
  def deleteObservabilityConfiguration(): Request[DeleteObservabilityConfigurationResponse, AWSError] = js.native
  def deleteObservabilityConfiguration(
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteObservabilityConfigurationResponse, Unit]
  ): Request[DeleteObservabilityConfigurationResponse, AWSError] = js.native
  /**
    * Delete an App Runner observability configuration resource. You can delete a specific revision or the latest active revision. You can't delete a configuration that's used by one or more App Runner services.
    */
  def deleteObservabilityConfiguration(params: DeleteObservabilityConfigurationRequest): Request[DeleteObservabilityConfigurationResponse, AWSError] = js.native
  def deleteObservabilityConfiguration(
    params: DeleteObservabilityConfigurationRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteObservabilityConfigurationResponse, Unit]
  ): Request[DeleteObservabilityConfigurationResponse, AWSError] = js.native
  
  /**
    * Delete an App Runner service. This is an asynchronous operation. On a successful call, you can use the returned OperationId and the ListOperations call to track the operation's progress.
    */
  def deleteService(): Request[DeleteServiceResponse, AWSError] = js.native
  def deleteService(callback: js.Function2[/* err */ AWSError, /* data */ DeleteServiceResponse, Unit]): Request[DeleteServiceResponse, AWSError] = js.native
  /**
    * Delete an App Runner service. This is an asynchronous operation. On a successful call, you can use the returned OperationId and the ListOperations call to track the operation's progress.
    */
  def deleteService(params: DeleteServiceRequest): Request[DeleteServiceResponse, AWSError] = js.native
  def deleteService(
    params: DeleteServiceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteServiceResponse, Unit]
  ): Request[DeleteServiceResponse, AWSError] = js.native
  
  /**
    * Delete an App Runner VPC connector resource. You can't delete a connector that's used by one or more App Runner services.
    */
  def deleteVpcConnector(): Request[DeleteVpcConnectorResponse, AWSError] = js.native
  def deleteVpcConnector(callback: js.Function2[/* err */ AWSError, /* data */ DeleteVpcConnectorResponse, Unit]): Request[DeleteVpcConnectorResponse, AWSError] = js.native
  /**
    * Delete an App Runner VPC connector resource. You can't delete a connector that's used by one or more App Runner services.
    */
  def deleteVpcConnector(params: DeleteVpcConnectorRequest): Request[DeleteVpcConnectorResponse, AWSError] = js.native
  def deleteVpcConnector(
    params: DeleteVpcConnectorRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteVpcConnectorResponse, Unit]
  ): Request[DeleteVpcConnectorResponse, AWSError] = js.native
  
  /**
    * Return a full description of an App Runner automatic scaling configuration resource.
    */
  def describeAutoScalingConfiguration(): Request[DescribeAutoScalingConfigurationResponse, AWSError] = js.native
  def describeAutoScalingConfiguration(
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeAutoScalingConfigurationResponse, Unit]
  ): Request[DescribeAutoScalingConfigurationResponse, AWSError] = js.native
  /**
    * Return a full description of an App Runner automatic scaling configuration resource.
    */
  def describeAutoScalingConfiguration(params: DescribeAutoScalingConfigurationRequest): Request[DescribeAutoScalingConfigurationResponse, AWSError] = js.native
  def describeAutoScalingConfiguration(
    params: DescribeAutoScalingConfigurationRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeAutoScalingConfigurationResponse, Unit]
  ): Request[DescribeAutoScalingConfigurationResponse, AWSError] = js.native
  
  /**
    * Return a description of custom domain names that are associated with an App Runner service.
    */
  def describeCustomDomains(): Request[DescribeCustomDomainsResponse, AWSError] = js.native
  def describeCustomDomains(callback: js.Function2[/* err */ AWSError, /* data */ DescribeCustomDomainsResponse, Unit]): Request[DescribeCustomDomainsResponse, AWSError] = js.native
  /**
    * Return a description of custom domain names that are associated with an App Runner service.
    */
  def describeCustomDomains(params: DescribeCustomDomainsRequest): Request[DescribeCustomDomainsResponse, AWSError] = js.native
  def describeCustomDomains(
    params: DescribeCustomDomainsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeCustomDomainsResponse, Unit]
  ): Request[DescribeCustomDomainsResponse, AWSError] = js.native
  
  /**
    * Return a full description of an App Runner observability configuration resource.
    */
  def describeObservabilityConfiguration(): Request[DescribeObservabilityConfigurationResponse, AWSError] = js.native
  def describeObservabilityConfiguration(
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeObservabilityConfigurationResponse, Unit]
  ): Request[DescribeObservabilityConfigurationResponse, AWSError] = js.native
  /**
    * Return a full description of an App Runner observability configuration resource.
    */
  def describeObservabilityConfiguration(params: DescribeObservabilityConfigurationRequest): Request[DescribeObservabilityConfigurationResponse, AWSError] = js.native
  def describeObservabilityConfiguration(
    params: DescribeObservabilityConfigurationRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeObservabilityConfigurationResponse, Unit]
  ): Request[DescribeObservabilityConfigurationResponse, AWSError] = js.native
  
  /**
    * Return a full description of an App Runner service.
    */
  def describeService(): Request[DescribeServiceResponse, AWSError] = js.native
  def describeService(callback: js.Function2[/* err */ AWSError, /* data */ DescribeServiceResponse, Unit]): Request[DescribeServiceResponse, AWSError] = js.native
  /**
    * Return a full description of an App Runner service.
    */
  def describeService(params: DescribeServiceRequest): Request[DescribeServiceResponse, AWSError] = js.native
  def describeService(
    params: DescribeServiceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeServiceResponse, Unit]
  ): Request[DescribeServiceResponse, AWSError] = js.native
  
  /**
    * Return a description of an App Runner VPC connector resource.
    */
  def describeVpcConnector(): Request[DescribeVpcConnectorResponse, AWSError] = js.native
  def describeVpcConnector(callback: js.Function2[/* err */ AWSError, /* data */ DescribeVpcConnectorResponse, Unit]): Request[DescribeVpcConnectorResponse, AWSError] = js.native
  /**
    * Return a description of an App Runner VPC connector resource.
    */
  def describeVpcConnector(params: DescribeVpcConnectorRequest): Request[DescribeVpcConnectorResponse, AWSError] = js.native
  def describeVpcConnector(
    params: DescribeVpcConnectorRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeVpcConnectorResponse, Unit]
  ): Request[DescribeVpcConnectorResponse, AWSError] = js.native
  
  /**
    * Disassociate a custom domain name from an App Runner service. Certificates tracking domain validity are associated with a custom domain and are stored in AWS Certificate Manager (ACM). These certificates aren't deleted as part of this action. App Runner delays certificate deletion for 30 days after a domain is disassociated from your service.
    */
  def disassociateCustomDomain(): Request[DisassociateCustomDomainResponse, AWSError] = js.native
  def disassociateCustomDomain(callback: js.Function2[/* err */ AWSError, /* data */ DisassociateCustomDomainResponse, Unit]): Request[DisassociateCustomDomainResponse, AWSError] = js.native
  /**
    * Disassociate a custom domain name from an App Runner service. Certificates tracking domain validity are associated with a custom domain and are stored in AWS Certificate Manager (ACM). These certificates aren't deleted as part of this action. App Runner delays certificate deletion for 30 days after a domain is disassociated from your service.
    */
  def disassociateCustomDomain(params: DisassociateCustomDomainRequest): Request[DisassociateCustomDomainResponse, AWSError] = js.native
  def disassociateCustomDomain(
    params: DisassociateCustomDomainRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DisassociateCustomDomainResponse, Unit]
  ): Request[DisassociateCustomDomainResponse, AWSError] = js.native
  
  /**
    * Returns a list of active App Runner automatic scaling configurations in your Amazon Web Services account. You can query the revisions for a specific configuration name or the revisions for all active configurations in your account. You can optionally query only the latest revision of each requested name. To retrieve a full description of a particular configuration revision, call and provide one of the ARNs returned by ListAutoScalingConfigurations.
    */
  def listAutoScalingConfigurations(): Request[ListAutoScalingConfigurationsResponse, AWSError] = js.native
  def listAutoScalingConfigurations(callback: js.Function2[/* err */ AWSError, /* data */ ListAutoScalingConfigurationsResponse, Unit]): Request[ListAutoScalingConfigurationsResponse, AWSError] = js.native
  /**
    * Returns a list of active App Runner automatic scaling configurations in your Amazon Web Services account. You can query the revisions for a specific configuration name or the revisions for all active configurations in your account. You can optionally query only the latest revision of each requested name. To retrieve a full description of a particular configuration revision, call and provide one of the ARNs returned by ListAutoScalingConfigurations.
    */
  def listAutoScalingConfigurations(params: ListAutoScalingConfigurationsRequest): Request[ListAutoScalingConfigurationsResponse, AWSError] = js.native
  def listAutoScalingConfigurations(
    params: ListAutoScalingConfigurationsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListAutoScalingConfigurationsResponse, Unit]
  ): Request[ListAutoScalingConfigurationsResponse, AWSError] = js.native
  
  /**
    * Returns a list of App Runner connections that are associated with your Amazon Web Services account.
    */
  def listConnections(): Request[ListConnectionsResponse, AWSError] = js.native
  def listConnections(callback: js.Function2[/* err */ AWSError, /* data */ ListConnectionsResponse, Unit]): Request[ListConnectionsResponse, AWSError] = js.native
  /**
    * Returns a list of App Runner connections that are associated with your Amazon Web Services account.
    */
  def listConnections(params: ListConnectionsRequest): Request[ListConnectionsResponse, AWSError] = js.native
  def listConnections(
    params: ListConnectionsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListConnectionsResponse, Unit]
  ): Request[ListConnectionsResponse, AWSError] = js.native
  
  /**
    * Returns a list of active App Runner observability configurations in your Amazon Web Services account. You can query the revisions for a specific configuration name or the revisions for all active configurations in your account. You can optionally query only the latest revision of each requested name. To retrieve a full description of a particular configuration revision, call and provide one of the ARNs returned by ListObservabilityConfigurations.
    */
  def listObservabilityConfigurations(): Request[ListObservabilityConfigurationsResponse, AWSError] = js.native
  def listObservabilityConfigurations(
    callback: js.Function2[/* err */ AWSError, /* data */ ListObservabilityConfigurationsResponse, Unit]
  ): Request[ListObservabilityConfigurationsResponse, AWSError] = js.native
  /**
    * Returns a list of active App Runner observability configurations in your Amazon Web Services account. You can query the revisions for a specific configuration name or the revisions for all active configurations in your account. You can optionally query only the latest revision of each requested name. To retrieve a full description of a particular configuration revision, call and provide one of the ARNs returned by ListObservabilityConfigurations.
    */
  def listObservabilityConfigurations(params: ListObservabilityConfigurationsRequest): Request[ListObservabilityConfigurationsResponse, AWSError] = js.native
  def listObservabilityConfigurations(
    params: ListObservabilityConfigurationsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListObservabilityConfigurationsResponse, Unit]
  ): Request[ListObservabilityConfigurationsResponse, AWSError] = js.native
  
  /**
    * Return a list of operations that occurred on an App Runner service. The resulting list of OperationSummary objects is sorted in reverse chronological order. The first object on the list represents the last started operation.
    */
  def listOperations(): Request[ListOperationsResponse, AWSError] = js.native
  def listOperations(callback: js.Function2[/* err */ AWSError, /* data */ ListOperationsResponse, Unit]): Request[ListOperationsResponse, AWSError] = js.native
  /**
    * Return a list of operations that occurred on an App Runner service. The resulting list of OperationSummary objects is sorted in reverse chronological order. The first object on the list represents the last started operation.
    */
  def listOperations(params: ListOperationsRequest): Request[ListOperationsResponse, AWSError] = js.native
  def listOperations(
    params: ListOperationsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListOperationsResponse, Unit]
  ): Request[ListOperationsResponse, AWSError] = js.native
  
  /**
    * Returns a list of running App Runner services in your Amazon Web Services account.
    */
  def listServices(): Request[ListServicesResponse, AWSError] = js.native
  def listServices(callback: js.Function2[/* err */ AWSError, /* data */ ListServicesResponse, Unit]): Request[ListServicesResponse, AWSError] = js.native
  /**
    * Returns a list of running App Runner services in your Amazon Web Services account.
    */
  def listServices(params: ListServicesRequest): Request[ListServicesResponse, AWSError] = js.native
  def listServices(
    params: ListServicesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListServicesResponse, Unit]
  ): Request[ListServicesResponse, AWSError] = js.native
  
  /**
    * List tags that are associated with for an App Runner resource. The response contains a list of tag key-value pairs.
    */
  def listTagsForResource(): Request[ListTagsForResourceResponse, AWSError] = js.native
  def listTagsForResource(callback: js.Function2[/* err */ AWSError, /* data */ ListTagsForResourceResponse, Unit]): Request[ListTagsForResourceResponse, AWSError] = js.native
  /**
    * List tags that are associated with for an App Runner resource. The response contains a list of tag key-value pairs.
    */
  def listTagsForResource(params: ListTagsForResourceRequest): Request[ListTagsForResourceResponse, AWSError] = js.native
  def listTagsForResource(
    params: ListTagsForResourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListTagsForResourceResponse, Unit]
  ): Request[ListTagsForResourceResponse, AWSError] = js.native
  
  /**
    * Returns a list of App Runner VPC connectors in your Amazon Web Services account.
    */
  def listVpcConnectors(): Request[ListVpcConnectorsResponse, AWSError] = js.native
  def listVpcConnectors(callback: js.Function2[/* err */ AWSError, /* data */ ListVpcConnectorsResponse, Unit]): Request[ListVpcConnectorsResponse, AWSError] = js.native
  /**
    * Returns a list of App Runner VPC connectors in your Amazon Web Services account.
    */
  def listVpcConnectors(params: ListVpcConnectorsRequest): Request[ListVpcConnectorsResponse, AWSError] = js.native
  def listVpcConnectors(
    params: ListVpcConnectorsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListVpcConnectorsResponse, Unit]
  ): Request[ListVpcConnectorsResponse, AWSError] = js.native
  
  /**
    * Pause an active App Runner service. App Runner reduces compute capacity for the service to zero and loses state (for example, ephemeral storage is removed). This is an asynchronous operation. On a successful call, you can use the returned OperationId and the ListOperations call to track the operation's progress.
    */
  def pauseService(): Request[PauseServiceResponse, AWSError] = js.native
  def pauseService(callback: js.Function2[/* err */ AWSError, /* data */ PauseServiceResponse, Unit]): Request[PauseServiceResponse, AWSError] = js.native
  /**
    * Pause an active App Runner service. App Runner reduces compute capacity for the service to zero and loses state (for example, ephemeral storage is removed). This is an asynchronous operation. On a successful call, you can use the returned OperationId and the ListOperations call to track the operation's progress.
    */
  def pauseService(params: PauseServiceRequest): Request[PauseServiceResponse, AWSError] = js.native
  def pauseService(
    params: PauseServiceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ PauseServiceResponse, Unit]
  ): Request[PauseServiceResponse, AWSError] = js.native
  
  /**
    * Resume an active App Runner service. App Runner provisions compute capacity for the service. This is an asynchronous operation. On a successful call, you can use the returned OperationId and the ListOperations call to track the operation's progress.
    */
  def resumeService(): Request[ResumeServiceResponse, AWSError] = js.native
  def resumeService(callback: js.Function2[/* err */ AWSError, /* data */ ResumeServiceResponse, Unit]): Request[ResumeServiceResponse, AWSError] = js.native
  /**
    * Resume an active App Runner service. App Runner provisions compute capacity for the service. This is an asynchronous operation. On a successful call, you can use the returned OperationId and the ListOperations call to track the operation's progress.
    */
  def resumeService(params: ResumeServiceRequest): Request[ResumeServiceResponse, AWSError] = js.native
  def resumeService(
    params: ResumeServiceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ResumeServiceResponse, Unit]
  ): Request[ResumeServiceResponse, AWSError] = js.native
  
  /**
    * Initiate a manual deployment of the latest commit in a source code repository or the latest image in a source image repository to an App Runner service. For a source code repository, App Runner retrieves the commit and builds a Docker image. For a source image repository, App Runner retrieves the latest Docker image. In both cases, App Runner then deploys the new image to your service and starts a new container instance. This is an asynchronous operation. On a successful call, you can use the returned OperationId and the ListOperations call to track the operation's progress.
    */
  def startDeployment(): Request[StartDeploymentResponse, AWSError] = js.native
  def startDeployment(callback: js.Function2[/* err */ AWSError, /* data */ StartDeploymentResponse, Unit]): Request[StartDeploymentResponse, AWSError] = js.native
  /**
    * Initiate a manual deployment of the latest commit in a source code repository or the latest image in a source image repository to an App Runner service. For a source code repository, App Runner retrieves the commit and builds a Docker image. For a source image repository, App Runner retrieves the latest Docker image. In both cases, App Runner then deploys the new image to your service and starts a new container instance. This is an asynchronous operation. On a successful call, you can use the returned OperationId and the ListOperations call to track the operation's progress.
    */
  def startDeployment(params: StartDeploymentRequest): Request[StartDeploymentResponse, AWSError] = js.native
  def startDeployment(
    params: StartDeploymentRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ StartDeploymentResponse, Unit]
  ): Request[StartDeploymentResponse, AWSError] = js.native
  
  /**
    * Add tags to, or update the tag values of, an App Runner resource. A tag is a key-value pair.
    */
  def tagResource(): Request[TagResourceResponse, AWSError] = js.native
  def tagResource(callback: js.Function2[/* err */ AWSError, /* data */ TagResourceResponse, Unit]): Request[TagResourceResponse, AWSError] = js.native
  /**
    * Add tags to, or update the tag values of, an App Runner resource. A tag is a key-value pair.
    */
  def tagResource(params: TagResourceRequest): Request[TagResourceResponse, AWSError] = js.native
  def tagResource(
    params: TagResourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ TagResourceResponse, Unit]
  ): Request[TagResourceResponse, AWSError] = js.native
  
  /**
    * Remove tags from an App Runner resource.
    */
  def untagResource(): Request[UntagResourceResponse, AWSError] = js.native
  def untagResource(callback: js.Function2[/* err */ AWSError, /* data */ UntagResourceResponse, Unit]): Request[UntagResourceResponse, AWSError] = js.native
  /**
    * Remove tags from an App Runner resource.
    */
  def untagResource(params: UntagResourceRequest): Request[UntagResourceResponse, AWSError] = js.native
  def untagResource(
    params: UntagResourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UntagResourceResponse, Unit]
  ): Request[UntagResourceResponse, AWSError] = js.native
  
  /**
    * Update an App Runner service. You can update the source configuration and instance configuration of the service. You can also update the ARN of the auto scaling configuration resource that's associated with the service. However, you can't change the name or the encryption configuration of the service. These can be set only when you create the service. To update the tags applied to your service, use the separate actions TagResource and UntagResource. This is an asynchronous operation. On a successful call, you can use the returned OperationId and the ListOperations call to track the operation's progress.
    */
  def updateService(): Request[UpdateServiceResponse, AWSError] = js.native
  def updateService(callback: js.Function2[/* err */ AWSError, /* data */ UpdateServiceResponse, Unit]): Request[UpdateServiceResponse, AWSError] = js.native
  /**
    * Update an App Runner service. You can update the source configuration and instance configuration of the service. You can also update the ARN of the auto scaling configuration resource that's associated with the service. However, you can't change the name or the encryption configuration of the service. These can be set only when you create the service. To update the tags applied to your service, use the separate actions TagResource and UntagResource. This is an asynchronous operation. On a successful call, you can use the returned OperationId and the ListOperations call to track the operation's progress.
    */
  def updateService(params: UpdateServiceRequest): Request[UpdateServiceResponse, AWSError] = js.native
  def updateService(
    params: UpdateServiceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateServiceResponse, Unit]
  ): Request[UpdateServiceResponse, AWSError] = js.native
}
