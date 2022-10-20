package typings.awsSdk.clientsServicediscoveryMod

import typings.awsSdk.libConfigBaseMod.ConfigBase
import typings.awsSdk.libErrorMod.AWSError
import typings.awsSdk.libRequestMod.Request
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ServiceDiscovery
  extends StObject
     with Service {
  
  var config: ConfigBase & ClientConfiguration = js.native
  
  /**
    * Creates an HTTP namespace. Service instances registered using an HTTP namespace can be discovered using a DiscoverInstances request but can't be discovered using DNS. For the current quota on the number of namespaces that you can create using the same Amazon Web Services account, see Cloud Map quotas in the Cloud Map Developer Guide.
    */
  def createHttpNamespace(): Request[CreateHttpNamespaceResponse, AWSError] = js.native
  def createHttpNamespace(callback: js.Function2[/* err */ AWSError, /* data */ CreateHttpNamespaceResponse, Unit]): Request[CreateHttpNamespaceResponse, AWSError] = js.native
  /**
    * Creates an HTTP namespace. Service instances registered using an HTTP namespace can be discovered using a DiscoverInstances request but can't be discovered using DNS. For the current quota on the number of namespaces that you can create using the same Amazon Web Services account, see Cloud Map quotas in the Cloud Map Developer Guide.
    */
  def createHttpNamespace(params: CreateHttpNamespaceRequest): Request[CreateHttpNamespaceResponse, AWSError] = js.native
  def createHttpNamespace(
    params: CreateHttpNamespaceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateHttpNamespaceResponse, Unit]
  ): Request[CreateHttpNamespaceResponse, AWSError] = js.native
  
  /**
    * Creates a private namespace based on DNS, which is visible only inside a specified Amazon VPC. The namespace defines your service naming scheme. For example, if you name your namespace example.com and name your service backend, the resulting DNS name for the service is backend.example.com. Service instances that are registered using a private DNS namespace can be discovered using either a DiscoverInstances request or using DNS. For the current quota on the number of namespaces that you can create using the same Amazon Web Services account, see Cloud Map quotas in the Cloud Map Developer Guide.
    */
  def createPrivateDnsNamespace(): Request[CreatePrivateDnsNamespaceResponse, AWSError] = js.native
  def createPrivateDnsNamespace(callback: js.Function2[/* err */ AWSError, /* data */ CreatePrivateDnsNamespaceResponse, Unit]): Request[CreatePrivateDnsNamespaceResponse, AWSError] = js.native
  /**
    * Creates a private namespace based on DNS, which is visible only inside a specified Amazon VPC. The namespace defines your service naming scheme. For example, if you name your namespace example.com and name your service backend, the resulting DNS name for the service is backend.example.com. Service instances that are registered using a private DNS namespace can be discovered using either a DiscoverInstances request or using DNS. For the current quota on the number of namespaces that you can create using the same Amazon Web Services account, see Cloud Map quotas in the Cloud Map Developer Guide.
    */
  def createPrivateDnsNamespace(params: CreatePrivateDnsNamespaceRequest): Request[CreatePrivateDnsNamespaceResponse, AWSError] = js.native
  def createPrivateDnsNamespace(
    params: CreatePrivateDnsNamespaceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreatePrivateDnsNamespaceResponse, Unit]
  ): Request[CreatePrivateDnsNamespaceResponse, AWSError] = js.native
  
  /**
    * Creates a public namespace based on DNS, which is visible on the internet. The namespace defines your service naming scheme. For example, if you name your namespace example.com and name your service backend, the resulting DNS name for the service is backend.example.com. You can discover instances that were registered with a public DNS namespace by using either a DiscoverInstances request or using DNS. For the current quota on the number of namespaces that you can create using the same Amazon Web Services account, see Cloud Map quotas in the Cloud Map Developer Guide.  The CreatePublicDnsNamespace API operation is not supported in the Amazon Web Services GovCloud (US) Regions. 
    */
  def createPublicDnsNamespace(): Request[CreatePublicDnsNamespaceResponse, AWSError] = js.native
  def createPublicDnsNamespace(callback: js.Function2[/* err */ AWSError, /* data */ CreatePublicDnsNamespaceResponse, Unit]): Request[CreatePublicDnsNamespaceResponse, AWSError] = js.native
  /**
    * Creates a public namespace based on DNS, which is visible on the internet. The namespace defines your service naming scheme. For example, if you name your namespace example.com and name your service backend, the resulting DNS name for the service is backend.example.com. You can discover instances that were registered with a public DNS namespace by using either a DiscoverInstances request or using DNS. For the current quota on the number of namespaces that you can create using the same Amazon Web Services account, see Cloud Map quotas in the Cloud Map Developer Guide.  The CreatePublicDnsNamespace API operation is not supported in the Amazon Web Services GovCloud (US) Regions. 
    */
  def createPublicDnsNamespace(params: CreatePublicDnsNamespaceRequest): Request[CreatePublicDnsNamespaceResponse, AWSError] = js.native
  def createPublicDnsNamespace(
    params: CreatePublicDnsNamespaceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreatePublicDnsNamespaceResponse, Unit]
  ): Request[CreatePublicDnsNamespaceResponse, AWSError] = js.native
  
  /**
    * Creates a service. This action defines the configuration for the following entities:   For public and private DNS namespaces, one of the following combinations of DNS records in Amazon Route 53:    A     AAAA     A and AAAA     SRV     CNAME      Optionally, a health check   After you create the service, you can submit a RegisterInstance request, and Cloud Map uses the values in the configuration to create the specified entities. For the current quota on the number of instances that you can register using the same namespace and using the same service, see Cloud Map quotas in the Cloud Map Developer Guide.
    */
  def createService(): Request[CreateServiceResponse, AWSError] = js.native
  def createService(callback: js.Function2[/* err */ AWSError, /* data */ CreateServiceResponse, Unit]): Request[CreateServiceResponse, AWSError] = js.native
  /**
    * Creates a service. This action defines the configuration for the following entities:   For public and private DNS namespaces, one of the following combinations of DNS records in Amazon Route 53:    A     AAAA     A and AAAA     SRV     CNAME      Optionally, a health check   After you create the service, you can submit a RegisterInstance request, and Cloud Map uses the values in the configuration to create the specified entities. For the current quota on the number of instances that you can register using the same namespace and using the same service, see Cloud Map quotas in the Cloud Map Developer Guide.
    */
  def createService(params: CreateServiceRequest): Request[CreateServiceResponse, AWSError] = js.native
  def createService(
    params: CreateServiceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateServiceResponse, Unit]
  ): Request[CreateServiceResponse, AWSError] = js.native
  
  /**
    * Deletes a namespace from the current account. If the namespace still contains one or more services, the request fails.
    */
  def deleteNamespace(): Request[DeleteNamespaceResponse, AWSError] = js.native
  def deleteNamespace(callback: js.Function2[/* err */ AWSError, /* data */ DeleteNamespaceResponse, Unit]): Request[DeleteNamespaceResponse, AWSError] = js.native
  /**
    * Deletes a namespace from the current account. If the namespace still contains one or more services, the request fails.
    */
  def deleteNamespace(params: DeleteNamespaceRequest): Request[DeleteNamespaceResponse, AWSError] = js.native
  def deleteNamespace(
    params: DeleteNamespaceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteNamespaceResponse, Unit]
  ): Request[DeleteNamespaceResponse, AWSError] = js.native
  
  /**
    * Deletes a specified service. If the service still contains one or more registered instances, the request fails.
    */
  def deleteService(): Request[DeleteServiceResponse, AWSError] = js.native
  def deleteService(callback: js.Function2[/* err */ AWSError, /* data */ DeleteServiceResponse, Unit]): Request[DeleteServiceResponse, AWSError] = js.native
  /**
    * Deletes a specified service. If the service still contains one or more registered instances, the request fails.
    */
  def deleteService(params: DeleteServiceRequest): Request[DeleteServiceResponse, AWSError] = js.native
  def deleteService(
    params: DeleteServiceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteServiceResponse, Unit]
  ): Request[DeleteServiceResponse, AWSError] = js.native
  
  /**
    * Deletes the Amazon Route 53 DNS records and health check, if any, that Cloud Map created for the specified instance.
    */
  def deregisterInstance(): Request[DeregisterInstanceResponse, AWSError] = js.native
  def deregisterInstance(callback: js.Function2[/* err */ AWSError, /* data */ DeregisterInstanceResponse, Unit]): Request[DeregisterInstanceResponse, AWSError] = js.native
  /**
    * Deletes the Amazon Route 53 DNS records and health check, if any, that Cloud Map created for the specified instance.
    */
  def deregisterInstance(params: DeregisterInstanceRequest): Request[DeregisterInstanceResponse, AWSError] = js.native
  def deregisterInstance(
    params: DeregisterInstanceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeregisterInstanceResponse, Unit]
  ): Request[DeregisterInstanceResponse, AWSError] = js.native
  
  /**
    * Discovers registered instances for a specified namespace and service. You can use DiscoverInstances to discover instances for any type of namespace. For public and private DNS namespaces, you can also use DNS queries to discover instances.
    */
  def discoverInstances(): Request[DiscoverInstancesResponse, AWSError] = js.native
  def discoverInstances(callback: js.Function2[/* err */ AWSError, /* data */ DiscoverInstancesResponse, Unit]): Request[DiscoverInstancesResponse, AWSError] = js.native
  /**
    * Discovers registered instances for a specified namespace and service. You can use DiscoverInstances to discover instances for any type of namespace. For public and private DNS namespaces, you can also use DNS queries to discover instances.
    */
  def discoverInstances(params: DiscoverInstancesRequest): Request[DiscoverInstancesResponse, AWSError] = js.native
  def discoverInstances(
    params: DiscoverInstancesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DiscoverInstancesResponse, Unit]
  ): Request[DiscoverInstancesResponse, AWSError] = js.native
  
  /**
    * Gets information about a specified instance.
    */
  def getInstance(): Request[GetInstanceResponse, AWSError] = js.native
  def getInstance(callback: js.Function2[/* err */ AWSError, /* data */ GetInstanceResponse, Unit]): Request[GetInstanceResponse, AWSError] = js.native
  /**
    * Gets information about a specified instance.
    */
  def getInstance(params: GetInstanceRequest): Request[GetInstanceResponse, AWSError] = js.native
  def getInstance(
    params: GetInstanceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetInstanceResponse, Unit]
  ): Request[GetInstanceResponse, AWSError] = js.native
  
  /**
    * Gets the current health status (Healthy, Unhealthy, or Unknown) of one or more instances that are associated with a specified service.  There's a brief delay between when you register an instance and when the health status for the instance is available.  
    */
  def getInstancesHealthStatus(): Request[GetInstancesHealthStatusResponse, AWSError] = js.native
  def getInstancesHealthStatus(callback: js.Function2[/* err */ AWSError, /* data */ GetInstancesHealthStatusResponse, Unit]): Request[GetInstancesHealthStatusResponse, AWSError] = js.native
  /**
    * Gets the current health status (Healthy, Unhealthy, or Unknown) of one or more instances that are associated with a specified service.  There's a brief delay between when you register an instance and when the health status for the instance is available.  
    */
  def getInstancesHealthStatus(params: GetInstancesHealthStatusRequest): Request[GetInstancesHealthStatusResponse, AWSError] = js.native
  def getInstancesHealthStatus(
    params: GetInstancesHealthStatusRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetInstancesHealthStatusResponse, Unit]
  ): Request[GetInstancesHealthStatusResponse, AWSError] = js.native
  
  /**
    * Gets information about a namespace.
    */
  def getNamespace(): Request[GetNamespaceResponse, AWSError] = js.native
  def getNamespace(callback: js.Function2[/* err */ AWSError, /* data */ GetNamespaceResponse, Unit]): Request[GetNamespaceResponse, AWSError] = js.native
  /**
    * Gets information about a namespace.
    */
  def getNamespace(params: GetNamespaceRequest): Request[GetNamespaceResponse, AWSError] = js.native
  def getNamespace(
    params: GetNamespaceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetNamespaceResponse, Unit]
  ): Request[GetNamespaceResponse, AWSError] = js.native
  
  /**
    * Gets information about any operation that returns an operation ID in the response, such as a CreateService request.  To get a list of operations that match specified criteria, see ListOperations. 
    */
  def getOperation(): Request[GetOperationResponse, AWSError] = js.native
  def getOperation(callback: js.Function2[/* err */ AWSError, /* data */ GetOperationResponse, Unit]): Request[GetOperationResponse, AWSError] = js.native
  /**
    * Gets information about any operation that returns an operation ID in the response, such as a CreateService request.  To get a list of operations that match specified criteria, see ListOperations. 
    */
  def getOperation(params: GetOperationRequest): Request[GetOperationResponse, AWSError] = js.native
  def getOperation(
    params: GetOperationRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetOperationResponse, Unit]
  ): Request[GetOperationResponse, AWSError] = js.native
  
  /**
    * Gets the settings for a specified service.
    */
  def getService(): Request[GetServiceResponse, AWSError] = js.native
  def getService(callback: js.Function2[/* err */ AWSError, /* data */ GetServiceResponse, Unit]): Request[GetServiceResponse, AWSError] = js.native
  /**
    * Gets the settings for a specified service.
    */
  def getService(params: GetServiceRequest): Request[GetServiceResponse, AWSError] = js.native
  def getService(
    params: GetServiceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetServiceResponse, Unit]
  ): Request[GetServiceResponse, AWSError] = js.native
  
  /**
    * Lists summary information about the instances that you registered by using a specified service.
    */
  def listInstances(): Request[ListInstancesResponse, AWSError] = js.native
  def listInstances(callback: js.Function2[/* err */ AWSError, /* data */ ListInstancesResponse, Unit]): Request[ListInstancesResponse, AWSError] = js.native
  /**
    * Lists summary information about the instances that you registered by using a specified service.
    */
  def listInstances(params: ListInstancesRequest): Request[ListInstancesResponse, AWSError] = js.native
  def listInstances(
    params: ListInstancesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListInstancesResponse, Unit]
  ): Request[ListInstancesResponse, AWSError] = js.native
  
  /**
    * Lists summary information about the namespaces that were created by the current Amazon Web Services account.
    */
  def listNamespaces(): Request[ListNamespacesResponse, AWSError] = js.native
  def listNamespaces(callback: js.Function2[/* err */ AWSError, /* data */ ListNamespacesResponse, Unit]): Request[ListNamespacesResponse, AWSError] = js.native
  /**
    * Lists summary information about the namespaces that were created by the current Amazon Web Services account.
    */
  def listNamespaces(params: ListNamespacesRequest): Request[ListNamespacesResponse, AWSError] = js.native
  def listNamespaces(
    params: ListNamespacesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListNamespacesResponse, Unit]
  ): Request[ListNamespacesResponse, AWSError] = js.native
  
  /**
    * Lists operations that match the criteria that you specify.
    */
  def listOperations(): Request[ListOperationsResponse, AWSError] = js.native
  def listOperations(callback: js.Function2[/* err */ AWSError, /* data */ ListOperationsResponse, Unit]): Request[ListOperationsResponse, AWSError] = js.native
  /**
    * Lists operations that match the criteria that you specify.
    */
  def listOperations(params: ListOperationsRequest): Request[ListOperationsResponse, AWSError] = js.native
  def listOperations(
    params: ListOperationsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListOperationsResponse, Unit]
  ): Request[ListOperationsResponse, AWSError] = js.native
  
  /**
    * Lists summary information for all the services that are associated with one or more specified namespaces.
    */
  def listServices(): Request[ListServicesResponse, AWSError] = js.native
  def listServices(callback: js.Function2[/* err */ AWSError, /* data */ ListServicesResponse, Unit]): Request[ListServicesResponse, AWSError] = js.native
  /**
    * Lists summary information for all the services that are associated with one or more specified namespaces.
    */
  def listServices(params: ListServicesRequest): Request[ListServicesResponse, AWSError] = js.native
  def listServices(
    params: ListServicesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListServicesResponse, Unit]
  ): Request[ListServicesResponse, AWSError] = js.native
  
  /**
    * Lists tags for the specified resource.
    */
  def listTagsForResource(): Request[ListTagsForResourceResponse, AWSError] = js.native
  def listTagsForResource(callback: js.Function2[/* err */ AWSError, /* data */ ListTagsForResourceResponse, Unit]): Request[ListTagsForResourceResponse, AWSError] = js.native
  /**
    * Lists tags for the specified resource.
    */
  def listTagsForResource(params: ListTagsForResourceRequest): Request[ListTagsForResourceResponse, AWSError] = js.native
  def listTagsForResource(
    params: ListTagsForResourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListTagsForResourceResponse, Unit]
  ): Request[ListTagsForResourceResponse, AWSError] = js.native
  
  /**
    * Creates or updates one or more records and, optionally, creates a health check based on the settings in a specified service. When you submit a RegisterInstance request, the following occurs:   For each DNS record that you define in the service that's specified by ServiceId, a record is created or updated in the hosted zone that's associated with the corresponding namespace.   If the service includes HealthCheckConfig, a health check is created based on the settings in the health check configuration.   The health check, if any, is associated with each of the new or updated records.    One RegisterInstance request must complete before you can submit another request and specify the same service ID and instance ID.  For more information, see CreateService. When Cloud Map receives a DNS query for the specified DNS name, it returns the applicable value:    If the health check is healthy: returns all the records    If the health check is unhealthy: returns the applicable value for the last healthy instance    If you didn't specify a health check configuration: returns all the records   For the current quota on the number of instances that you can register using the same namespace and using the same service, see Cloud Map quotas in the Cloud Map Developer Guide.
    */
  def registerInstance(): Request[RegisterInstanceResponse, AWSError] = js.native
  def registerInstance(callback: js.Function2[/* err */ AWSError, /* data */ RegisterInstanceResponse, Unit]): Request[RegisterInstanceResponse, AWSError] = js.native
  /**
    * Creates or updates one or more records and, optionally, creates a health check based on the settings in a specified service. When you submit a RegisterInstance request, the following occurs:   For each DNS record that you define in the service that's specified by ServiceId, a record is created or updated in the hosted zone that's associated with the corresponding namespace.   If the service includes HealthCheckConfig, a health check is created based on the settings in the health check configuration.   The health check, if any, is associated with each of the new or updated records.    One RegisterInstance request must complete before you can submit another request and specify the same service ID and instance ID.  For more information, see CreateService. When Cloud Map receives a DNS query for the specified DNS name, it returns the applicable value:    If the health check is healthy: returns all the records    If the health check is unhealthy: returns the applicable value for the last healthy instance    If you didn't specify a health check configuration: returns all the records   For the current quota on the number of instances that you can register using the same namespace and using the same service, see Cloud Map quotas in the Cloud Map Developer Guide.
    */
  def registerInstance(params: RegisterInstanceRequest): Request[RegisterInstanceResponse, AWSError] = js.native
  def registerInstance(
    params: RegisterInstanceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ RegisterInstanceResponse, Unit]
  ): Request[RegisterInstanceResponse, AWSError] = js.native
  
  /**
    * Adds one or more tags to the specified resource.
    */
  def tagResource(): Request[TagResourceResponse, AWSError] = js.native
  def tagResource(callback: js.Function2[/* err */ AWSError, /* data */ TagResourceResponse, Unit]): Request[TagResourceResponse, AWSError] = js.native
  /**
    * Adds one or more tags to the specified resource.
    */
  def tagResource(params: TagResourceRequest): Request[TagResourceResponse, AWSError] = js.native
  def tagResource(
    params: TagResourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ TagResourceResponse, Unit]
  ): Request[TagResourceResponse, AWSError] = js.native
  
  /**
    * Removes one or more tags from the specified resource.
    */
  def untagResource(): Request[UntagResourceResponse, AWSError] = js.native
  def untagResource(callback: js.Function2[/* err */ AWSError, /* data */ UntagResourceResponse, Unit]): Request[UntagResourceResponse, AWSError] = js.native
  /**
    * Removes one or more tags from the specified resource.
    */
  def untagResource(params: UntagResourceRequest): Request[UntagResourceResponse, AWSError] = js.native
  def untagResource(
    params: UntagResourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UntagResourceResponse, Unit]
  ): Request[UntagResourceResponse, AWSError] = js.native
  
  /**
    * Updates an HTTP namespace.
    */
  def updateHttpNamespace(): Request[UpdateHttpNamespaceResponse, AWSError] = js.native
  def updateHttpNamespace(callback: js.Function2[/* err */ AWSError, /* data */ UpdateHttpNamespaceResponse, Unit]): Request[UpdateHttpNamespaceResponse, AWSError] = js.native
  /**
    * Updates an HTTP namespace.
    */
  def updateHttpNamespace(params: UpdateHttpNamespaceRequest): Request[UpdateHttpNamespaceResponse, AWSError] = js.native
  def updateHttpNamespace(
    params: UpdateHttpNamespaceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateHttpNamespaceResponse, Unit]
  ): Request[UpdateHttpNamespaceResponse, AWSError] = js.native
  
  /**
    * Submits a request to change the health status of a custom health check to healthy or unhealthy. You can use UpdateInstanceCustomHealthStatus to change the status only for custom health checks, which you define using HealthCheckCustomConfig when you create a service. You can't use it to change the status for Route 53 health checks, which you define using HealthCheckConfig. For more information, see HealthCheckCustomConfig.
    */
  def updateInstanceCustomHealthStatus(): Request[js.Object, AWSError] = js.native
  def updateInstanceCustomHealthStatus(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Submits a request to change the health status of a custom health check to healthy or unhealthy. You can use UpdateInstanceCustomHealthStatus to change the status only for custom health checks, which you define using HealthCheckCustomConfig when you create a service. You can't use it to change the status for Route 53 health checks, which you define using HealthCheckConfig. For more information, see HealthCheckCustomConfig.
    */
  def updateInstanceCustomHealthStatus(params: UpdateInstanceCustomHealthStatusRequest): Request[js.Object, AWSError] = js.native
  def updateInstanceCustomHealthStatus(
    params: UpdateInstanceCustomHealthStatusRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * Updates a private DNS namespace.
    */
  def updatePrivateDnsNamespace(): Request[UpdatePrivateDnsNamespaceResponse, AWSError] = js.native
  def updatePrivateDnsNamespace(callback: js.Function2[/* err */ AWSError, /* data */ UpdatePrivateDnsNamespaceResponse, Unit]): Request[UpdatePrivateDnsNamespaceResponse, AWSError] = js.native
  /**
    * Updates a private DNS namespace.
    */
  def updatePrivateDnsNamespace(params: UpdatePrivateDnsNamespaceRequest): Request[UpdatePrivateDnsNamespaceResponse, AWSError] = js.native
  def updatePrivateDnsNamespace(
    params: UpdatePrivateDnsNamespaceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdatePrivateDnsNamespaceResponse, Unit]
  ): Request[UpdatePrivateDnsNamespaceResponse, AWSError] = js.native
  
  /**
    * Updates a public DNS namespace.
    */
  def updatePublicDnsNamespace(): Request[UpdatePublicDnsNamespaceResponse, AWSError] = js.native
  def updatePublicDnsNamespace(callback: js.Function2[/* err */ AWSError, /* data */ UpdatePublicDnsNamespaceResponse, Unit]): Request[UpdatePublicDnsNamespaceResponse, AWSError] = js.native
  /**
    * Updates a public DNS namespace.
    */
  def updatePublicDnsNamespace(params: UpdatePublicDnsNamespaceRequest): Request[UpdatePublicDnsNamespaceResponse, AWSError] = js.native
  def updatePublicDnsNamespace(
    params: UpdatePublicDnsNamespaceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdatePublicDnsNamespaceResponse, Unit]
  ): Request[UpdatePublicDnsNamespaceResponse, AWSError] = js.native
  
  /**
    * Submits a request to perform the following operations:   Update the TTL setting for existing DnsRecords configurations   Add, update, or delete HealthCheckConfig for a specified service  You can't add, update, or delete a HealthCheckCustomConfig configuration.    For public and private DNS namespaces, note the following:   If you omit any existing DnsRecords or HealthCheckConfig configurations from an UpdateService request, the configurations are deleted from the service.   If you omit an existing HealthCheckCustomConfig configuration from an UpdateService request, the configuration isn't deleted from the service.   When you update settings for a service, Cloud Map also updates the corresponding settings in all the records and health checks that were created by using the specified service.
    */
  def updateService(): Request[UpdateServiceResponse, AWSError] = js.native
  def updateService(callback: js.Function2[/* err */ AWSError, /* data */ UpdateServiceResponse, Unit]): Request[UpdateServiceResponse, AWSError] = js.native
  /**
    * Submits a request to perform the following operations:   Update the TTL setting for existing DnsRecords configurations   Add, update, or delete HealthCheckConfig for a specified service  You can't add, update, or delete a HealthCheckCustomConfig configuration.    For public and private DNS namespaces, note the following:   If you omit any existing DnsRecords or HealthCheckConfig configurations from an UpdateService request, the configurations are deleted from the service.   If you omit an existing HealthCheckCustomConfig configuration from an UpdateService request, the configuration isn't deleted from the service.   When you update settings for a service, Cloud Map also updates the corresponding settings in all the records and health checks that were created by using the specified service.
    */
  def updateService(params: UpdateServiceRequest): Request[UpdateServiceResponse, AWSError] = js.native
  def updateService(
    params: UpdateServiceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateServiceResponse, Unit]
  ): Request[UpdateServiceResponse, AWSError] = js.native
}
