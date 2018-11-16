package typings
package awsDashSdkLib.clientsServicediscoveryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ServiceDiscovery
  extends awsDashSdkLib.libServiceMod.Service {
  @JSName("config")
  var config_ServiceDiscovery: awsDashSdkLib.libConfigMod.ConfigBase with awsDashSdkLib.clientsServicediscoveryMod.ServiceDiscoveryNs.ClientConfiguration = js.native
  /**
     * Creates a private namespace based on DNS, which will be visible only inside a specified Amazon VPC. The namespace defines your service naming scheme. For example, if you name your namespace example.com and name your service backend, the resulting DNS name for the service will be backend.example.com. For the current limit on the number of namespaces that you can create using the same AWS account, see Limits on Auto Naming in the Route 53 Developer Guide.
     */
  def createPrivateDnsNamespace(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsServicediscoveryMod.ServiceDiscoveryNs.CreatePrivateDnsNamespaceResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates a private namespace based on DNS, which will be visible only inside a specified Amazon VPC. The namespace defines your service naming scheme. For example, if you name your namespace example.com and name your service backend, the resulting DNS name for the service will be backend.example.com. For the current limit on the number of namespaces that you can create using the same AWS account, see Limits on Auto Naming in the Route 53 Developer Guide.
     */
  def createPrivateDnsNamespace(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsServicediscoveryMod.ServiceDiscoveryNs.CreatePrivateDnsNamespaceResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsServicediscoveryMod.ServiceDiscoveryNs.CreatePrivateDnsNamespaceResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates a private namespace based on DNS, which will be visible only inside a specified Amazon VPC. The namespace defines your service naming scheme. For example, if you name your namespace example.com and name your service backend, the resulting DNS name for the service will be backend.example.com. For the current limit on the number of namespaces that you can create using the same AWS account, see Limits on Auto Naming in the Route 53 Developer Guide.
     */
  def createPrivateDnsNamespace(
    params: awsDashSdkLib.clientsServicediscoveryMod.ServiceDiscoveryNs.CreatePrivateDnsNamespaceRequest
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsServicediscoveryMod.ServiceDiscoveryNs.CreatePrivateDnsNamespaceResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates a private namespace based on DNS, which will be visible only inside a specified Amazon VPC. The namespace defines your service naming scheme. For example, if you name your namespace example.com and name your service backend, the resulting DNS name for the service will be backend.example.com. For the current limit on the number of namespaces that you can create using the same AWS account, see Limits on Auto Naming in the Route 53 Developer Guide.
     */
  def createPrivateDnsNamespace(
    params: awsDashSdkLib.clientsServicediscoveryMod.ServiceDiscoveryNs.CreatePrivateDnsNamespaceRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsServicediscoveryMod.ServiceDiscoveryNs.CreatePrivateDnsNamespaceResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsServicediscoveryMod.ServiceDiscoveryNs.CreatePrivateDnsNamespaceResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates a public namespace based on DNS, which will be visible on the internet. The namespace defines your service naming scheme. For example, if you name your namespace example.com and name your service backend, the resulting DNS name for the service will be backend.example.com. For the current limit on the number of namespaces that you can create using the same AWS account, see Limits on Auto Naming in the Route 53 Developer Guide.
     */
  def createPublicDnsNamespace(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsServicediscoveryMod.ServiceDiscoveryNs.CreatePublicDnsNamespaceResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates a public namespace based on DNS, which will be visible on the internet. The namespace defines your service naming scheme. For example, if you name your namespace example.com and name your service backend, the resulting DNS name for the service will be backend.example.com. For the current limit on the number of namespaces that you can create using the same AWS account, see Limits on Auto Naming in the Route 53 Developer Guide.
     */
  def createPublicDnsNamespace(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsServicediscoveryMod.ServiceDiscoveryNs.CreatePublicDnsNamespaceResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsServicediscoveryMod.ServiceDiscoveryNs.CreatePublicDnsNamespaceResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates a public namespace based on DNS, which will be visible on the internet. The namespace defines your service naming scheme. For example, if you name your namespace example.com and name your service backend, the resulting DNS name for the service will be backend.example.com. For the current limit on the number of namespaces that you can create using the same AWS account, see Limits on Auto Naming in the Route 53 Developer Guide.
     */
  def createPublicDnsNamespace(
    params: awsDashSdkLib.clientsServicediscoveryMod.ServiceDiscoveryNs.CreatePublicDnsNamespaceRequest
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsServicediscoveryMod.ServiceDiscoveryNs.CreatePublicDnsNamespaceResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates a public namespace based on DNS, which will be visible on the internet. The namespace defines your service naming scheme. For example, if you name your namespace example.com and name your service backend, the resulting DNS name for the service will be backend.example.com. For the current limit on the number of namespaces that you can create using the same AWS account, see Limits on Auto Naming in the Route 53 Developer Guide.
     */
  def createPublicDnsNamespace(
    params: awsDashSdkLib.clientsServicediscoveryMod.ServiceDiscoveryNs.CreatePublicDnsNamespaceRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsServicediscoveryMod.ServiceDiscoveryNs.CreatePublicDnsNamespaceResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsServicediscoveryMod.ServiceDiscoveryNs.CreatePublicDnsNamespaceResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates a service, which defines the configuration for the following entities:   Up to three records (A, AAAA, and SRV) or one CNAME record   Optionally, a health check   After you create the service, you can submit a RegisterInstance request, and Amazon Route 53 uses the values in the configuration to create the specified entities. For the current limit on the number of instances that you can register using the same namespace and using the same service, see Limits on Auto Naming in the Route 53 Developer Guide.
     */
  def createService(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsServicediscoveryMod.ServiceDiscoveryNs.CreateServiceResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates a service, which defines the configuration for the following entities:   Up to three records (A, AAAA, and SRV) or one CNAME record   Optionally, a health check   After you create the service, you can submit a RegisterInstance request, and Amazon Route 53 uses the values in the configuration to create the specified entities. For the current limit on the number of instances that you can register using the same namespace and using the same service, see Limits on Auto Naming in the Route 53 Developer Guide.
     */
  def createService(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsServicediscoveryMod.ServiceDiscoveryNs.CreateServiceResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsServicediscoveryMod.ServiceDiscoveryNs.CreateServiceResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates a service, which defines the configuration for the following entities:   Up to three records (A, AAAA, and SRV) or one CNAME record   Optionally, a health check   After you create the service, you can submit a RegisterInstance request, and Amazon Route 53 uses the values in the configuration to create the specified entities. For the current limit on the number of instances that you can register using the same namespace and using the same service, see Limits on Auto Naming in the Route 53 Developer Guide.
     */
  def createService(params: awsDashSdkLib.clientsServicediscoveryMod.ServiceDiscoveryNs.CreateServiceRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsServicediscoveryMod.ServiceDiscoveryNs.CreateServiceResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates a service, which defines the configuration for the following entities:   Up to three records (A, AAAA, and SRV) or one CNAME record   Optionally, a health check   After you create the service, you can submit a RegisterInstance request, and Amazon Route 53 uses the values in the configuration to create the specified entities. For the current limit on the number of instances that you can register using the same namespace and using the same service, see Limits on Auto Naming in the Route 53 Developer Guide.
     */
  def createService(
    params: awsDashSdkLib.clientsServicediscoveryMod.ServiceDiscoveryNs.CreateServiceRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsServicediscoveryMod.ServiceDiscoveryNs.CreateServiceResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsServicediscoveryMod.ServiceDiscoveryNs.CreateServiceResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Deletes a namespace from the current account. If the namespace still contains one or more services, the request fails.
     */
  def deleteNamespace(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsServicediscoveryMod.ServiceDiscoveryNs.DeleteNamespaceResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Deletes a namespace from the current account. If the namespace still contains one or more services, the request fails.
     */
  def deleteNamespace(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsServicediscoveryMod.ServiceDiscoveryNs.DeleteNamespaceResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsServicediscoveryMod.ServiceDiscoveryNs.DeleteNamespaceResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Deletes a namespace from the current account. If the namespace still contains one or more services, the request fails.
     */
  def deleteNamespace(params: awsDashSdkLib.clientsServicediscoveryMod.ServiceDiscoveryNs.DeleteNamespaceRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsServicediscoveryMod.ServiceDiscoveryNs.DeleteNamespaceResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Deletes a namespace from the current account. If the namespace still contains one or more services, the request fails.
     */
  def deleteNamespace(
    params: awsDashSdkLib.clientsServicediscoveryMod.ServiceDiscoveryNs.DeleteNamespaceRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsServicediscoveryMod.ServiceDiscoveryNs.DeleteNamespaceResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsServicediscoveryMod.ServiceDiscoveryNs.DeleteNamespaceResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Deletes a specified service. If the service still contains one or more registered instances, the request fails.
     */
  def deleteService(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsServicediscoveryMod.ServiceDiscoveryNs.DeleteServiceResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Deletes a specified service. If the service still contains one or more registered instances, the request fails.
     */
  def deleteService(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsServicediscoveryMod.ServiceDiscoveryNs.DeleteServiceResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsServicediscoveryMod.ServiceDiscoveryNs.DeleteServiceResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Deletes a specified service. If the service still contains one or more registered instances, the request fails.
     */
  def deleteService(params: awsDashSdkLib.clientsServicediscoveryMod.ServiceDiscoveryNs.DeleteServiceRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsServicediscoveryMod.ServiceDiscoveryNs.DeleteServiceResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Deletes a specified service. If the service still contains one or more registered instances, the request fails.
     */
  def deleteService(
    params: awsDashSdkLib.clientsServicediscoveryMod.ServiceDiscoveryNs.DeleteServiceRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsServicediscoveryMod.ServiceDiscoveryNs.DeleteServiceResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsServicediscoveryMod.ServiceDiscoveryNs.DeleteServiceResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Deletes the records and the health check, if any, that Amazon Route 53 created for the specified instance.
     */
  def deregisterInstance(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsServicediscoveryMod.ServiceDiscoveryNs.DeregisterInstanceResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Deletes the records and the health check, if any, that Amazon Route 53 created for the specified instance.
     */
  def deregisterInstance(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsServicediscoveryMod.ServiceDiscoveryNs.DeregisterInstanceResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsServicediscoveryMod.ServiceDiscoveryNs.DeregisterInstanceResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Deletes the records and the health check, if any, that Amazon Route 53 created for the specified instance.
     */
  def deregisterInstance(params: awsDashSdkLib.clientsServicediscoveryMod.ServiceDiscoveryNs.DeregisterInstanceRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsServicediscoveryMod.ServiceDiscoveryNs.DeregisterInstanceResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Deletes the records and the health check, if any, that Amazon Route 53 created for the specified instance.
     */
  def deregisterInstance(
    params: awsDashSdkLib.clientsServicediscoveryMod.ServiceDiscoveryNs.DeregisterInstanceRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsServicediscoveryMod.ServiceDiscoveryNs.DeregisterInstanceResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsServicediscoveryMod.ServiceDiscoveryNs.DeregisterInstanceResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets information about a specified instance.
     */
  def getInstance(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsServicediscoveryMod.ServiceDiscoveryNs.GetInstanceResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets information about a specified instance.
     */
  def getInstance(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsServicediscoveryMod.ServiceDiscoveryNs.GetInstanceResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsServicediscoveryMod.ServiceDiscoveryNs.GetInstanceResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets information about a specified instance.
     */
  def getInstance(params: awsDashSdkLib.clientsServicediscoveryMod.ServiceDiscoveryNs.GetInstanceRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsServicediscoveryMod.ServiceDiscoveryNs.GetInstanceResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets information about a specified instance.
     */
  def getInstance(
    params: awsDashSdkLib.clientsServicediscoveryMod.ServiceDiscoveryNs.GetInstanceRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsServicediscoveryMod.ServiceDiscoveryNs.GetInstanceResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsServicediscoveryMod.ServiceDiscoveryNs.GetInstanceResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets the current health status (Healthy, Unhealthy, or Unknown) of one or more instances that are associated with a specified service.  There is a brief delay between when you register an instance and when the health status for the instance is available.  
     */
  def getInstancesHealthStatus(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsServicediscoveryMod.ServiceDiscoveryNs.GetInstancesHealthStatusResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets the current health status (Healthy, Unhealthy, or Unknown) of one or more instances that are associated with a specified service.  There is a brief delay between when you register an instance and when the health status for the instance is available.  
     */
  def getInstancesHealthStatus(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsServicediscoveryMod.ServiceDiscoveryNs.GetInstancesHealthStatusResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsServicediscoveryMod.ServiceDiscoveryNs.GetInstancesHealthStatusResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets the current health status (Healthy, Unhealthy, or Unknown) of one or more instances that are associated with a specified service.  There is a brief delay between when you register an instance and when the health status for the instance is available.  
     */
  def getInstancesHealthStatus(
    params: awsDashSdkLib.clientsServicediscoveryMod.ServiceDiscoveryNs.GetInstancesHealthStatusRequest
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsServicediscoveryMod.ServiceDiscoveryNs.GetInstancesHealthStatusResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets the current health status (Healthy, Unhealthy, or Unknown) of one or more instances that are associated with a specified service.  There is a brief delay between when you register an instance and when the health status for the instance is available.  
     */
  def getInstancesHealthStatus(
    params: awsDashSdkLib.clientsServicediscoveryMod.ServiceDiscoveryNs.GetInstancesHealthStatusRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsServicediscoveryMod.ServiceDiscoveryNs.GetInstancesHealthStatusResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsServicediscoveryMod.ServiceDiscoveryNs.GetInstancesHealthStatusResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets information about a namespace.
     */
  def getNamespace(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsServicediscoveryMod.ServiceDiscoveryNs.GetNamespaceResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets information about a namespace.
     */
  def getNamespace(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsServicediscoveryMod.ServiceDiscoveryNs.GetNamespaceResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsServicediscoveryMod.ServiceDiscoveryNs.GetNamespaceResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets information about a namespace.
     */
  def getNamespace(params: awsDashSdkLib.clientsServicediscoveryMod.ServiceDiscoveryNs.GetNamespaceRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsServicediscoveryMod.ServiceDiscoveryNs.GetNamespaceResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets information about a namespace.
     */
  def getNamespace(
    params: awsDashSdkLib.clientsServicediscoveryMod.ServiceDiscoveryNs.GetNamespaceRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsServicediscoveryMod.ServiceDiscoveryNs.GetNamespaceResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsServicediscoveryMod.ServiceDiscoveryNs.GetNamespaceResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets information about any operation that returns an operation ID in the response, such as a CreateService request.  To get a list of operations that match specified criteria, see ListOperations. 
     */
  def getOperation(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsServicediscoveryMod.ServiceDiscoveryNs.GetOperationResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets information about any operation that returns an operation ID in the response, such as a CreateService request.  To get a list of operations that match specified criteria, see ListOperations. 
     */
  def getOperation(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsServicediscoveryMod.ServiceDiscoveryNs.GetOperationResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsServicediscoveryMod.ServiceDiscoveryNs.GetOperationResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets information about any operation that returns an operation ID in the response, such as a CreateService request.  To get a list of operations that match specified criteria, see ListOperations. 
     */
  def getOperation(params: awsDashSdkLib.clientsServicediscoveryMod.ServiceDiscoveryNs.GetOperationRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsServicediscoveryMod.ServiceDiscoveryNs.GetOperationResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets information about any operation that returns an operation ID in the response, such as a CreateService request.  To get a list of operations that match specified criteria, see ListOperations. 
     */
  def getOperation(
    params: awsDashSdkLib.clientsServicediscoveryMod.ServiceDiscoveryNs.GetOperationRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsServicediscoveryMod.ServiceDiscoveryNs.GetOperationResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsServicediscoveryMod.ServiceDiscoveryNs.GetOperationResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets the settings for a specified service.
     */
  def getService(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsServicediscoveryMod.ServiceDiscoveryNs.GetServiceResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets the settings for a specified service.
     */
  def getService(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsServicediscoveryMod.ServiceDiscoveryNs.GetServiceResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsServicediscoveryMod.ServiceDiscoveryNs.GetServiceResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets the settings for a specified service.
     */
  def getService(params: awsDashSdkLib.clientsServicediscoveryMod.ServiceDiscoveryNs.GetServiceRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsServicediscoveryMod.ServiceDiscoveryNs.GetServiceResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets the settings for a specified service.
     */
  def getService(
    params: awsDashSdkLib.clientsServicediscoveryMod.ServiceDiscoveryNs.GetServiceRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsServicediscoveryMod.ServiceDiscoveryNs.GetServiceResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsServicediscoveryMod.ServiceDiscoveryNs.GetServiceResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists summary information about the instances that you registered by using a specified service.
     */
  def listInstances(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsServicediscoveryMod.ServiceDiscoveryNs.ListInstancesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists summary information about the instances that you registered by using a specified service.
     */
  def listInstances(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsServicediscoveryMod.ServiceDiscoveryNs.ListInstancesResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsServicediscoveryMod.ServiceDiscoveryNs.ListInstancesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists summary information about the instances that you registered by using a specified service.
     */
  def listInstances(params: awsDashSdkLib.clientsServicediscoveryMod.ServiceDiscoveryNs.ListInstancesRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsServicediscoveryMod.ServiceDiscoveryNs.ListInstancesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists summary information about the instances that you registered by using a specified service.
     */
  def listInstances(
    params: awsDashSdkLib.clientsServicediscoveryMod.ServiceDiscoveryNs.ListInstancesRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsServicediscoveryMod.ServiceDiscoveryNs.ListInstancesResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsServicediscoveryMod.ServiceDiscoveryNs.ListInstancesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists summary information about the namespaces that were created by the current AWS account.
     */
  def listNamespaces(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsServicediscoveryMod.ServiceDiscoveryNs.ListNamespacesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists summary information about the namespaces that were created by the current AWS account.
     */
  def listNamespaces(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsServicediscoveryMod.ServiceDiscoveryNs.ListNamespacesResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsServicediscoveryMod.ServiceDiscoveryNs.ListNamespacesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists summary information about the namespaces that were created by the current AWS account.
     */
  def listNamespaces(params: awsDashSdkLib.clientsServicediscoveryMod.ServiceDiscoveryNs.ListNamespacesRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsServicediscoveryMod.ServiceDiscoveryNs.ListNamespacesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists summary information about the namespaces that were created by the current AWS account.
     */
  def listNamespaces(
    params: awsDashSdkLib.clientsServicediscoveryMod.ServiceDiscoveryNs.ListNamespacesRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsServicediscoveryMod.ServiceDiscoveryNs.ListNamespacesResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsServicediscoveryMod.ServiceDiscoveryNs.ListNamespacesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists operations that match the criteria that you specify.
     */
  def listOperations(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsServicediscoveryMod.ServiceDiscoveryNs.ListOperationsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists operations that match the criteria that you specify.
     */
  def listOperations(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsServicediscoveryMod.ServiceDiscoveryNs.ListOperationsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsServicediscoveryMod.ServiceDiscoveryNs.ListOperationsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists operations that match the criteria that you specify.
     */
  def listOperations(params: awsDashSdkLib.clientsServicediscoveryMod.ServiceDiscoveryNs.ListOperationsRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsServicediscoveryMod.ServiceDiscoveryNs.ListOperationsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists operations that match the criteria that you specify.
     */
  def listOperations(
    params: awsDashSdkLib.clientsServicediscoveryMod.ServiceDiscoveryNs.ListOperationsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsServicediscoveryMod.ServiceDiscoveryNs.ListOperationsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsServicediscoveryMod.ServiceDiscoveryNs.ListOperationsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists summary information for all the services that are associated with one or more specified namespaces.
     */
  def listServices(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsServicediscoveryMod.ServiceDiscoveryNs.ListServicesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists summary information for all the services that are associated with one or more specified namespaces.
     */
  def listServices(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsServicediscoveryMod.ServiceDiscoveryNs.ListServicesResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsServicediscoveryMod.ServiceDiscoveryNs.ListServicesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists summary information for all the services that are associated with one or more specified namespaces.
     */
  def listServices(params: awsDashSdkLib.clientsServicediscoveryMod.ServiceDiscoveryNs.ListServicesRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsServicediscoveryMod.ServiceDiscoveryNs.ListServicesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists summary information for all the services that are associated with one or more specified namespaces.
     */
  def listServices(
    params: awsDashSdkLib.clientsServicediscoveryMod.ServiceDiscoveryNs.ListServicesRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsServicediscoveryMod.ServiceDiscoveryNs.ListServicesResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsServicediscoveryMod.ServiceDiscoveryNs.ListServicesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates or updates one or more records and optionally a health check based on the settings in a specified service. When you submit a RegisterInstance request, Amazon Route 53 does the following:   For each DNS record that you define in the service specified by ServiceId, creates or updates a record in the hosted zone that is associated with the corresponding namespace   If the service includes HealthCheckConfig, creates or updates a health check based on the settings in the health check configuration   Associates the health check, if any, with each of the records    One RegisterInstance request must complete before you can submit another request and specify the same service ID and instance ID.  For more information, see CreateService. When Route 53 receives a DNS query for the specified DNS name, it returns the applicable value:    If the health check is healthy: returns all the records    If the health check is unhealthy: returns the applicable value for the last healthy instance    If you didn't specify a health check configuration: returns all the records   For the current limit on the number of instances that you can register using the same namespace and using the same service, see Limits on Auto Naming in the Route 53 Developer Guide.
     */
  def registerInstance(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsServicediscoveryMod.ServiceDiscoveryNs.RegisterInstanceResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates or updates one or more records and optionally a health check based on the settings in a specified service. When you submit a RegisterInstance request, Amazon Route 53 does the following:   For each DNS record that you define in the service specified by ServiceId, creates or updates a record in the hosted zone that is associated with the corresponding namespace   If the service includes HealthCheckConfig, creates or updates a health check based on the settings in the health check configuration   Associates the health check, if any, with each of the records    One RegisterInstance request must complete before you can submit another request and specify the same service ID and instance ID.  For more information, see CreateService. When Route 53 receives a DNS query for the specified DNS name, it returns the applicable value:    If the health check is healthy: returns all the records    If the health check is unhealthy: returns the applicable value for the last healthy instance    If you didn't specify a health check configuration: returns all the records   For the current limit on the number of instances that you can register using the same namespace and using the same service, see Limits on Auto Naming in the Route 53 Developer Guide.
     */
  def registerInstance(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsServicediscoveryMod.ServiceDiscoveryNs.RegisterInstanceResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsServicediscoveryMod.ServiceDiscoveryNs.RegisterInstanceResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates or updates one or more records and optionally a health check based on the settings in a specified service. When you submit a RegisterInstance request, Amazon Route 53 does the following:   For each DNS record that you define in the service specified by ServiceId, creates or updates a record in the hosted zone that is associated with the corresponding namespace   If the service includes HealthCheckConfig, creates or updates a health check based on the settings in the health check configuration   Associates the health check, if any, with each of the records    One RegisterInstance request must complete before you can submit another request and specify the same service ID and instance ID.  For more information, see CreateService. When Route 53 receives a DNS query for the specified DNS name, it returns the applicable value:    If the health check is healthy: returns all the records    If the health check is unhealthy: returns the applicable value for the last healthy instance    If you didn't specify a health check configuration: returns all the records   For the current limit on the number of instances that you can register using the same namespace and using the same service, see Limits on Auto Naming in the Route 53 Developer Guide.
     */
  def registerInstance(params: awsDashSdkLib.clientsServicediscoveryMod.ServiceDiscoveryNs.RegisterInstanceRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsServicediscoveryMod.ServiceDiscoveryNs.RegisterInstanceResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates or updates one or more records and optionally a health check based on the settings in a specified service. When you submit a RegisterInstance request, Amazon Route 53 does the following:   For each DNS record that you define in the service specified by ServiceId, creates or updates a record in the hosted zone that is associated with the corresponding namespace   If the service includes HealthCheckConfig, creates or updates a health check based on the settings in the health check configuration   Associates the health check, if any, with each of the records    One RegisterInstance request must complete before you can submit another request and specify the same service ID and instance ID.  For more information, see CreateService. When Route 53 receives a DNS query for the specified DNS name, it returns the applicable value:    If the health check is healthy: returns all the records    If the health check is unhealthy: returns the applicable value for the last healthy instance    If you didn't specify a health check configuration: returns all the records   For the current limit on the number of instances that you can register using the same namespace and using the same service, see Limits on Auto Naming in the Route 53 Developer Guide.
     */
  def registerInstance(
    params: awsDashSdkLib.clientsServicediscoveryMod.ServiceDiscoveryNs.RegisterInstanceRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsServicediscoveryMod.ServiceDiscoveryNs.RegisterInstanceResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsServicediscoveryMod.ServiceDiscoveryNs.RegisterInstanceResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * 
     */
  def updateInstanceCustomHealthStatus(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * 
     */
  def updateInstanceCustomHealthStatus(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * 
     */
  def updateInstanceCustomHealthStatus(
    params: awsDashSdkLib.clientsServicediscoveryMod.ServiceDiscoveryNs.UpdateInstanceCustomHealthStatusRequest
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * 
     */
  def updateInstanceCustomHealthStatus(
    params: awsDashSdkLib.clientsServicediscoveryMod.ServiceDiscoveryNs.UpdateInstanceCustomHealthStatusRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Submits a request to perform the following operations:   Add or delete DnsRecords configurations   Update the TTL setting for existing DnsRecords configurations   Add, update, or delete HealthCheckConfig for a specified service   You must specify all DnsRecords configurations (and, optionally, HealthCheckConfig) that you want to appear in the updated service. Any current configurations that don't appear in an UpdateService request are deleted. When you update the TTL setting for a service, Amazon Route 53 also updates the corresponding settings in all the records and health checks that were created by using the specified service.
     */
  def updateService(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsServicediscoveryMod.ServiceDiscoveryNs.UpdateServiceResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Submits a request to perform the following operations:   Add or delete DnsRecords configurations   Update the TTL setting for existing DnsRecords configurations   Add, update, or delete HealthCheckConfig for a specified service   You must specify all DnsRecords configurations (and, optionally, HealthCheckConfig) that you want to appear in the updated service. Any current configurations that don't appear in an UpdateService request are deleted. When you update the TTL setting for a service, Amazon Route 53 also updates the corresponding settings in all the records and health checks that were created by using the specified service.
     */
  def updateService(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsServicediscoveryMod.ServiceDiscoveryNs.UpdateServiceResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsServicediscoveryMod.ServiceDiscoveryNs.UpdateServiceResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Submits a request to perform the following operations:   Add or delete DnsRecords configurations   Update the TTL setting for existing DnsRecords configurations   Add, update, or delete HealthCheckConfig for a specified service   You must specify all DnsRecords configurations (and, optionally, HealthCheckConfig) that you want to appear in the updated service. Any current configurations that don't appear in an UpdateService request are deleted. When you update the TTL setting for a service, Amazon Route 53 also updates the corresponding settings in all the records and health checks that were created by using the specified service.
     */
  def updateService(params: awsDashSdkLib.clientsServicediscoveryMod.ServiceDiscoveryNs.UpdateServiceRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsServicediscoveryMod.ServiceDiscoveryNs.UpdateServiceResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Submits a request to perform the following operations:   Add or delete DnsRecords configurations   Update the TTL setting for existing DnsRecords configurations   Add, update, or delete HealthCheckConfig for a specified service   You must specify all DnsRecords configurations (and, optionally, HealthCheckConfig) that you want to appear in the updated service. Any current configurations that don't appear in an UpdateService request are deleted. When you update the TTL setting for a service, Amazon Route 53 also updates the corresponding settings in all the records and health checks that were created by using the specified service.
     */
  def updateService(
    params: awsDashSdkLib.clientsServicediscoveryMod.ServiceDiscoveryNs.UpdateServiceRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsServicediscoveryMod.ServiceDiscoveryNs.UpdateServiceResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsServicediscoveryMod.ServiceDiscoveryNs.UpdateServiceResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
}

