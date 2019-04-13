package typings
package awsDashSdkLib.clientsServicediscoveryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ServiceDiscovery extends Service {
  var config: awsDashSdkLib.libConfigMod.ConfigBase with ClientConfiguration = js.native
  /**
    * Creates an HTTP namespace. Service instances that you register using an HTTP namespace can be discovered using a DiscoverInstances request but can't be discovered using DNS.  For the current limit on the number of namespaces that you can create using the same AWS account, see AWS Cloud Map Limits in the AWS Cloud Map Developer Guide.
    */
  def createHttpNamespace(): awsDashSdkLib.libRequestMod.Request[CreateHttpNamespaceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createHttpNamespace(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateHttpNamespaceResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateHttpNamespaceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates an HTTP namespace. Service instances that you register using an HTTP namespace can be discovered using a DiscoverInstances request but can't be discovered using DNS.  For the current limit on the number of namespaces that you can create using the same AWS account, see AWS Cloud Map Limits in the AWS Cloud Map Developer Guide.
    */
  def createHttpNamespace(params: CreateHttpNamespaceRequest): awsDashSdkLib.libRequestMod.Request[CreateHttpNamespaceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createHttpNamespace(
    params: CreateHttpNamespaceRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateHttpNamespaceResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateHttpNamespaceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates a private namespace based on DNS, which will be visible only inside a specified Amazon VPC. The namespace defines your service naming scheme. For example, if you name your namespace example.com and name your service backend, the resulting DNS name for the service will be backend.example.com. For the current limit on the number of namespaces that you can create using the same AWS account, see AWS Cloud Map Limits in the AWS Cloud Map Developer Guide.
    */
  def createPrivateDnsNamespace(): awsDashSdkLib.libRequestMod.Request[CreatePrivateDnsNamespaceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createPrivateDnsNamespace(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreatePrivateDnsNamespaceResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreatePrivateDnsNamespaceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates a private namespace based on DNS, which will be visible only inside a specified Amazon VPC. The namespace defines your service naming scheme. For example, if you name your namespace example.com and name your service backend, the resulting DNS name for the service will be backend.example.com. For the current limit on the number of namespaces that you can create using the same AWS account, see AWS Cloud Map Limits in the AWS Cloud Map Developer Guide.
    */
  def createPrivateDnsNamespace(params: CreatePrivateDnsNamespaceRequest): awsDashSdkLib.libRequestMod.Request[CreatePrivateDnsNamespaceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createPrivateDnsNamespace(
    params: CreatePrivateDnsNamespaceRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreatePrivateDnsNamespaceResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreatePrivateDnsNamespaceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates a public namespace based on DNS, which will be visible on the internet. The namespace defines your service naming scheme. For example, if you name your namespace example.com and name your service backend, the resulting DNS name for the service will be backend.example.com. For the current limit on the number of namespaces that you can create using the same AWS account, see AWS Cloud Map Limits in the AWS Cloud Map Developer Guide.
    */
  def createPublicDnsNamespace(): awsDashSdkLib.libRequestMod.Request[CreatePublicDnsNamespaceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createPublicDnsNamespace(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreatePublicDnsNamespaceResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreatePublicDnsNamespaceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates a public namespace based on DNS, which will be visible on the internet. The namespace defines your service naming scheme. For example, if you name your namespace example.com and name your service backend, the resulting DNS name for the service will be backend.example.com. For the current limit on the number of namespaces that you can create using the same AWS account, see AWS Cloud Map Limits in the AWS Cloud Map Developer Guide.
    */
  def createPublicDnsNamespace(params: CreatePublicDnsNamespaceRequest): awsDashSdkLib.libRequestMod.Request[CreatePublicDnsNamespaceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createPublicDnsNamespace(
    params: CreatePublicDnsNamespaceRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreatePublicDnsNamespaceResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreatePublicDnsNamespaceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates a service, which defines the configuration for the following entities:   For public and private DNS namespaces, one of the following combinations of DNS records in Amazon Route 53:   A   AAAA   A and AAAA   SRV   CNAME     Optionally, a health check   After you create the service, you can submit a RegisterInstance request, and AWS Cloud Map uses the values in the configuration to create the specified entities. For the current limit on the number of instances that you can register using the same namespace and using the same service, see AWS Cloud Map Limits in the AWS Cloud Map Developer Guide.
    */
  def createService(): awsDashSdkLib.libRequestMod.Request[CreateServiceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createService(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateServiceResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateServiceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates a service, which defines the configuration for the following entities:   For public and private DNS namespaces, one of the following combinations of DNS records in Amazon Route 53:   A   AAAA   A and AAAA   SRV   CNAME     Optionally, a health check   After you create the service, you can submit a RegisterInstance request, and AWS Cloud Map uses the values in the configuration to create the specified entities. For the current limit on the number of instances that you can register using the same namespace and using the same service, see AWS Cloud Map Limits in the AWS Cloud Map Developer Guide.
    */
  def createService(params: CreateServiceRequest): awsDashSdkLib.libRequestMod.Request[CreateServiceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createService(
    params: CreateServiceRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateServiceResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateServiceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes a namespace from the current account. If the namespace still contains one or more services, the request fails.
    */
  def deleteNamespace(): awsDashSdkLib.libRequestMod.Request[DeleteNamespaceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteNamespace(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DeleteNamespaceResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DeleteNamespaceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes a namespace from the current account. If the namespace still contains one or more services, the request fails.
    */
  def deleteNamespace(params: DeleteNamespaceRequest): awsDashSdkLib.libRequestMod.Request[DeleteNamespaceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteNamespace(
    params: DeleteNamespaceRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DeleteNamespaceResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DeleteNamespaceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes a specified service. If the service still contains one or more registered instances, the request fails.
    */
  def deleteService(): awsDashSdkLib.libRequestMod.Request[DeleteServiceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteService(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DeleteServiceResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DeleteServiceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes a specified service. If the service still contains one or more registered instances, the request fails.
    */
  def deleteService(params: DeleteServiceRequest): awsDashSdkLib.libRequestMod.Request[DeleteServiceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteService(
    params: DeleteServiceRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DeleteServiceResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DeleteServiceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes the Amazon Route 53 DNS records and health check, if any, that AWS Cloud Map created for the specified instance.
    */
  def deregisterInstance(): awsDashSdkLib.libRequestMod.Request[DeregisterInstanceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deregisterInstance(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DeregisterInstanceResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DeregisterInstanceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes the Amazon Route 53 DNS records and health check, if any, that AWS Cloud Map created for the specified instance.
    */
  def deregisterInstance(params: DeregisterInstanceRequest): awsDashSdkLib.libRequestMod.Request[DeregisterInstanceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deregisterInstance(
    params: DeregisterInstanceRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DeregisterInstanceResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DeregisterInstanceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Discovers registered instances for a specified namespace and service.
    */
  def discoverInstances(): awsDashSdkLib.libRequestMod.Request[DiscoverInstancesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def discoverInstances(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DiscoverInstancesResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DiscoverInstancesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Discovers registered instances for a specified namespace and service.
    */
  def discoverInstances(params: DiscoverInstancesRequest): awsDashSdkLib.libRequestMod.Request[DiscoverInstancesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def discoverInstances(
    params: DiscoverInstancesRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DiscoverInstancesResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DiscoverInstancesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Gets information about a specified instance.
    */
  def getInstance(): awsDashSdkLib.libRequestMod.Request[GetInstanceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getInstance(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetInstanceResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetInstanceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Gets information about a specified instance.
    */
  def getInstance(params: GetInstanceRequest): awsDashSdkLib.libRequestMod.Request[GetInstanceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getInstance(
    params: GetInstanceRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetInstanceResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetInstanceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Gets the current health status (Healthy, Unhealthy, or Unknown) of one or more instances that are associated with a specified service.  There is a brief delay between when you register an instance and when the health status for the instance is available.  
    */
  def getInstancesHealthStatus(): awsDashSdkLib.libRequestMod.Request[GetInstancesHealthStatusResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getInstancesHealthStatus(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetInstancesHealthStatusResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetInstancesHealthStatusResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Gets the current health status (Healthy, Unhealthy, or Unknown) of one or more instances that are associated with a specified service.  There is a brief delay between when you register an instance and when the health status for the instance is available.  
    */
  def getInstancesHealthStatus(params: GetInstancesHealthStatusRequest): awsDashSdkLib.libRequestMod.Request[GetInstancesHealthStatusResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getInstancesHealthStatus(
    params: GetInstancesHealthStatusRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetInstancesHealthStatusResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetInstancesHealthStatusResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Gets information about a namespace.
    */
  def getNamespace(): awsDashSdkLib.libRequestMod.Request[GetNamespaceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getNamespace(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetNamespaceResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetNamespaceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Gets information about a namespace.
    */
  def getNamespace(params: GetNamespaceRequest): awsDashSdkLib.libRequestMod.Request[GetNamespaceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getNamespace(
    params: GetNamespaceRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetNamespaceResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetNamespaceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Gets information about any operation that returns an operation ID in the response, such as a CreateService request.  To get a list of operations that match specified criteria, see ListOperations. 
    */
  def getOperation(): awsDashSdkLib.libRequestMod.Request[GetOperationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getOperation(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetOperationResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetOperationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Gets information about any operation that returns an operation ID in the response, such as a CreateService request.  To get a list of operations that match specified criteria, see ListOperations. 
    */
  def getOperation(params: GetOperationRequest): awsDashSdkLib.libRequestMod.Request[GetOperationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getOperation(
    params: GetOperationRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetOperationResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetOperationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Gets the settings for a specified service.
    */
  def getService(): awsDashSdkLib.libRequestMod.Request[GetServiceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getService(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetServiceResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetServiceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Gets the settings for a specified service.
    */
  def getService(params: GetServiceRequest): awsDashSdkLib.libRequestMod.Request[GetServiceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getService(
    params: GetServiceRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetServiceResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetServiceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Lists summary information about the instances that you registered by using a specified service.
    */
  def listInstances(): awsDashSdkLib.libRequestMod.Request[ListInstancesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listInstances(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListInstancesResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListInstancesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Lists summary information about the instances that you registered by using a specified service.
    */
  def listInstances(params: ListInstancesRequest): awsDashSdkLib.libRequestMod.Request[ListInstancesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listInstances(
    params: ListInstancesRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListInstancesResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListInstancesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Lists summary information about the namespaces that were created by the current AWS account.
    */
  def listNamespaces(): awsDashSdkLib.libRequestMod.Request[ListNamespacesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listNamespaces(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListNamespacesResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListNamespacesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Lists summary information about the namespaces that were created by the current AWS account.
    */
  def listNamespaces(params: ListNamespacesRequest): awsDashSdkLib.libRequestMod.Request[ListNamespacesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listNamespaces(
    params: ListNamespacesRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListNamespacesResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListNamespacesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Lists operations that match the criteria that you specify.
    */
  def listOperations(): awsDashSdkLib.libRequestMod.Request[ListOperationsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listOperations(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListOperationsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListOperationsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Lists operations that match the criteria that you specify.
    */
  def listOperations(params: ListOperationsRequest): awsDashSdkLib.libRequestMod.Request[ListOperationsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listOperations(
    params: ListOperationsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListOperationsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListOperationsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Lists summary information for all the services that are associated with one or more specified namespaces.
    */
  def listServices(): awsDashSdkLib.libRequestMod.Request[ListServicesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listServices(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListServicesResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListServicesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Lists summary information for all the services that are associated with one or more specified namespaces.
    */
  def listServices(params: ListServicesRequest): awsDashSdkLib.libRequestMod.Request[ListServicesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listServices(
    params: ListServicesRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListServicesResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListServicesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates or updates one or more records and, optionally, creates a health check based on the settings in a specified service. When you submit a RegisterInstance request, the following occurs:   For each DNS record that you define in the service that is specified by ServiceId, a record is created or updated in the hosted zone that is associated with the corresponding namespace.   If the service includes HealthCheckConfig, a health check is created based on the settings in the health check configuration.   The health check, if any, is associated with each of the new or updated records.    One RegisterInstance request must complete before you can submit another request and specify the same service ID and instance ID.  For more information, see CreateService. When AWS Cloud Map receives a DNS query for the specified DNS name, it returns the applicable value:    If the health check is healthy: returns all the records    If the health check is unhealthy: returns the applicable value for the last healthy instance    If you didn't specify a health check configuration: returns all the records   For the current limit on the number of instances that you can register using the same namespace and using the same service, see AWS Cloud Map Limits in the AWS Cloud Map Developer Guide.
    */
  def registerInstance(): awsDashSdkLib.libRequestMod.Request[RegisterInstanceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def registerInstance(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ RegisterInstanceResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[RegisterInstanceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates or updates one or more records and, optionally, creates a health check based on the settings in a specified service. When you submit a RegisterInstance request, the following occurs:   For each DNS record that you define in the service that is specified by ServiceId, a record is created or updated in the hosted zone that is associated with the corresponding namespace.   If the service includes HealthCheckConfig, a health check is created based on the settings in the health check configuration.   The health check, if any, is associated with each of the new or updated records.    One RegisterInstance request must complete before you can submit another request and specify the same service ID and instance ID.  For more information, see CreateService. When AWS Cloud Map receives a DNS query for the specified DNS name, it returns the applicable value:    If the health check is healthy: returns all the records    If the health check is unhealthy: returns the applicable value for the last healthy instance    If you didn't specify a health check configuration: returns all the records   For the current limit on the number of instances that you can register using the same namespace and using the same service, see AWS Cloud Map Limits in the AWS Cloud Map Developer Guide.
    */
  def registerInstance(params: RegisterInstanceRequest): awsDashSdkLib.libRequestMod.Request[RegisterInstanceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def registerInstance(
    params: RegisterInstanceRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ RegisterInstanceResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[RegisterInstanceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Submits a request to change the health status of a custom health check to healthy or unhealthy. You can use UpdateInstanceCustomHealthStatus to change the status only for custom health checks, which you define using HealthCheckCustomConfig when you create a service. You can't use it to change the status for Route 53 health checks, which you define using HealthCheckConfig. For more information, see HealthCheckCustomConfig.
    */
  def updateInstanceCustomHealthStatus(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def updateInstanceCustomHealthStatus(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Submits a request to change the health status of a custom health check to healthy or unhealthy. You can use UpdateInstanceCustomHealthStatus to change the status only for custom health checks, which you define using HealthCheckCustomConfig when you create a service. You can't use it to change the status for Route 53 health checks, which you define using HealthCheckConfig. For more information, see HealthCheckCustomConfig.
    */
  def updateInstanceCustomHealthStatus(params: UpdateInstanceCustomHealthStatusRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def updateInstanceCustomHealthStatus(
    params: UpdateInstanceCustomHealthStatusRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Submits a request to perform the following operations:   Add or delete DnsRecords configurations   Update the TTL setting for existing DnsRecords configurations   Add, update, or delete HealthCheckConfig for a specified service   For public and private DNS namespaces, you must specify all DnsRecords configurations (and, optionally, HealthCheckConfig) that you want to appear in the updated service. Any current configurations that don't appear in an UpdateService request are deleted. When you update the TTL setting for a service, AWS Cloud Map also updates the corresponding settings in all the records and health checks that were created by using the specified service.
    */
  def updateService(): awsDashSdkLib.libRequestMod.Request[UpdateServiceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def updateService(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ UpdateServiceResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[UpdateServiceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Submits a request to perform the following operations:   Add or delete DnsRecords configurations   Update the TTL setting for existing DnsRecords configurations   Add, update, or delete HealthCheckConfig for a specified service   For public and private DNS namespaces, you must specify all DnsRecords configurations (and, optionally, HealthCheckConfig) that you want to appear in the updated service. Any current configurations that don't appear in an UpdateService request are deleted. When you update the TTL setting for a service, AWS Cloud Map also updates the corresponding settings in all the records and health checks that were created by using the specified service.
    */
  def updateService(params: UpdateServiceRequest): awsDashSdkLib.libRequestMod.Request[UpdateServiceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def updateService(
    params: UpdateServiceRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ UpdateServiceResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[UpdateServiceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
}

