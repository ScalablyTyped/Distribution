package typings.awsSdk.clientsMigrationhubrefactorspacesMod

import typings.awsSdk.libConfigBaseMod.ConfigBase
import typings.awsSdk.libErrorMod.AWSError
import typings.awsSdk.libRequestMod.Request
import typings.awsSdk.libServiceMod.Service
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MigrationHubRefactorSpaces extends Service {
  
  @JSName("config")
  var config_MigrationHubRefactorSpaces: ConfigBase & ClientConfiguration = js.native
  
  /**
    * Creates an Amazon Web Services Migration Hub Refactor Spaces application. The account that owns the environment also owns the applications created inside the environment, regardless of the account that creates the application. Refactor Spaces provisions an Amazon API Gateway, API Gateway VPC link, and Network Load Balancer for the application proxy inside your account.
    */
  def createApplication(): Request[CreateApplicationResponse, AWSError] = js.native
  def createApplication(callback: js.Function2[/* err */ AWSError, /* data */ CreateApplicationResponse, Unit]): Request[CreateApplicationResponse, AWSError] = js.native
  /**
    * Creates an Amazon Web Services Migration Hub Refactor Spaces application. The account that owns the environment also owns the applications created inside the environment, regardless of the account that creates the application. Refactor Spaces provisions an Amazon API Gateway, API Gateway VPC link, and Network Load Balancer for the application proxy inside your account.
    */
  def createApplication(params: CreateApplicationRequest): Request[CreateApplicationResponse, AWSError] = js.native
  def createApplication(
    params: CreateApplicationRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateApplicationResponse, Unit]
  ): Request[CreateApplicationResponse, AWSError] = js.native
  
  /**
    * Creates an Amazon Web Services Migration Hub Refactor Spaces environment. The caller owns the environment resource, and all Refactor Spaces applications, services, and routes created within the environment. They are referred to as the environment owner. The environment owner has cross-account visibility and control of Refactor Spaces resources that are added to the environment by other accounts that the environment is shared with. When creating an environment, Refactor Spaces provisions a transit gateway in your account.
    */
  def createEnvironment(): Request[CreateEnvironmentResponse, AWSError] = js.native
  def createEnvironment(callback: js.Function2[/* err */ AWSError, /* data */ CreateEnvironmentResponse, Unit]): Request[CreateEnvironmentResponse, AWSError] = js.native
  /**
    * Creates an Amazon Web Services Migration Hub Refactor Spaces environment. The caller owns the environment resource, and all Refactor Spaces applications, services, and routes created within the environment. They are referred to as the environment owner. The environment owner has cross-account visibility and control of Refactor Spaces resources that are added to the environment by other accounts that the environment is shared with. When creating an environment, Refactor Spaces provisions a transit gateway in your account.
    */
  def createEnvironment(params: CreateEnvironmentRequest): Request[CreateEnvironmentResponse, AWSError] = js.native
  def createEnvironment(
    params: CreateEnvironmentRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateEnvironmentResponse, Unit]
  ): Request[CreateEnvironmentResponse, AWSError] = js.native
  
  /**
    * Creates an Amazon Web Services Migration Hub Refactor Spaces route. The account owner of the service resource is always the environment owner, regardless of which account creates the route. Routes target a service in the application. If an application does not have any routes, then the first route must be created as a DEFAULT RouteType. When created, the default route defaults to an active state so state is not a required input. However, like all other state values the state of the default route can be updated after creation, but only when all other routes are also inactive. Conversely, no route can be active without the default route also being active. When you create a route, Refactor Spaces configures the Amazon API Gateway to send traffic to the target service as follows:   If the service has a URL endpoint, and the endpoint resolves to a private IP address, Refactor Spaces routes traffic using the API Gateway VPC link.    If the service has a URL endpoint, and the endpoint resolves to a public IP address, Refactor Spaces routes traffic over the public internet.   If the service has an Lambda function endpoint, then Refactor Spaces configures the Lambda function's resource policy to allow the application's API Gateway to invoke the function.   A one-time health check is performed on the service when either the route is updated from inactive to active, or when it is created with an active state. If the health check fails, the route transitions the route state to FAILED, an error code of SERVICE_ENDPOINT_HEALTH_CHECK_FAILURE is provided, and no traffic is sent to the service. For Lambda functions, the Lambda function state is checked. If the function is not active, the function configuration is updated so that Lambda resources are provisioned. If the Lambda state is Failed, then the route creation fails. For more information, see the GetFunctionConfiguration's State response parameter in the Lambda Developer Guide. For Lambda endpoints, a check is performed to determine that a Lambda function with the specified ARN exists. If it does not exist, the health check fails. For public URLs, a connection is opened to the public endpoint. If the URL is not reachable, the health check fails.  For private URLS, a target group is created on the Elastic Load Balancing and the target group health check is run. The HealthCheckProtocol, HealthCheckPort, and HealthCheckPath are the same protocol, port, and path specified in the URL or health URL, if used. All other settings use the default values, as described in Health checks for your target groups. The health check is considered successful if at least one target within the target group transitions to a healthy state. Services can have HTTP or HTTPS URL endpoints. For HTTPS URLs, publicly-signed certificates are supported. Private Certificate Authorities (CAs) are permitted only if the CA's domain is also publicly resolvable.
    */
  def createRoute(): Request[CreateRouteResponse, AWSError] = js.native
  def createRoute(callback: js.Function2[/* err */ AWSError, /* data */ CreateRouteResponse, Unit]): Request[CreateRouteResponse, AWSError] = js.native
  /**
    * Creates an Amazon Web Services Migration Hub Refactor Spaces route. The account owner of the service resource is always the environment owner, regardless of which account creates the route. Routes target a service in the application. If an application does not have any routes, then the first route must be created as a DEFAULT RouteType. When created, the default route defaults to an active state so state is not a required input. However, like all other state values the state of the default route can be updated after creation, but only when all other routes are also inactive. Conversely, no route can be active without the default route also being active. When you create a route, Refactor Spaces configures the Amazon API Gateway to send traffic to the target service as follows:   If the service has a URL endpoint, and the endpoint resolves to a private IP address, Refactor Spaces routes traffic using the API Gateway VPC link.    If the service has a URL endpoint, and the endpoint resolves to a public IP address, Refactor Spaces routes traffic over the public internet.   If the service has an Lambda function endpoint, then Refactor Spaces configures the Lambda function's resource policy to allow the application's API Gateway to invoke the function.   A one-time health check is performed on the service when either the route is updated from inactive to active, or when it is created with an active state. If the health check fails, the route transitions the route state to FAILED, an error code of SERVICE_ENDPOINT_HEALTH_CHECK_FAILURE is provided, and no traffic is sent to the service. For Lambda functions, the Lambda function state is checked. If the function is not active, the function configuration is updated so that Lambda resources are provisioned. If the Lambda state is Failed, then the route creation fails. For more information, see the GetFunctionConfiguration's State response parameter in the Lambda Developer Guide. For Lambda endpoints, a check is performed to determine that a Lambda function with the specified ARN exists. If it does not exist, the health check fails. For public URLs, a connection is opened to the public endpoint. If the URL is not reachable, the health check fails.  For private URLS, a target group is created on the Elastic Load Balancing and the target group health check is run. The HealthCheckProtocol, HealthCheckPort, and HealthCheckPath are the same protocol, port, and path specified in the URL or health URL, if used. All other settings use the default values, as described in Health checks for your target groups. The health check is considered successful if at least one target within the target group transitions to a healthy state. Services can have HTTP or HTTPS URL endpoints. For HTTPS URLs, publicly-signed certificates are supported. Private Certificate Authorities (CAs) are permitted only if the CA's domain is also publicly resolvable.
    */
  def createRoute(params: CreateRouteRequest): Request[CreateRouteResponse, AWSError] = js.native
  def createRoute(
    params: CreateRouteRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateRouteResponse, Unit]
  ): Request[CreateRouteResponse, AWSError] = js.native
  
  /**
    * Creates an Amazon Web Services Migration Hub Refactor Spaces service. The account owner of the service is always the environment owner, regardless of which account in the environment creates the service. Services have either a URL endpoint in a virtual private cloud (VPC), or a Lambda function endpoint.  If an Amazon Web Services resource is launched in a service VPC, and you want it to be accessible to all of an environment’s services with VPCs and routes, apply the RefactorSpacesSecurityGroup to the resource. Alternatively, to add more cross-account constraints, apply your own security group. 
    */
  def createService(): Request[CreateServiceResponse, AWSError] = js.native
  def createService(callback: js.Function2[/* err */ AWSError, /* data */ CreateServiceResponse, Unit]): Request[CreateServiceResponse, AWSError] = js.native
  /**
    * Creates an Amazon Web Services Migration Hub Refactor Spaces service. The account owner of the service is always the environment owner, regardless of which account in the environment creates the service. Services have either a URL endpoint in a virtual private cloud (VPC), or a Lambda function endpoint.  If an Amazon Web Services resource is launched in a service VPC, and you want it to be accessible to all of an environment’s services with VPCs and routes, apply the RefactorSpacesSecurityGroup to the resource. Alternatively, to add more cross-account constraints, apply your own security group. 
    */
  def createService(params: CreateServiceRequest): Request[CreateServiceResponse, AWSError] = js.native
  def createService(
    params: CreateServiceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateServiceResponse, Unit]
  ): Request[CreateServiceResponse, AWSError] = js.native
  
  /**
    * Deletes an Amazon Web Services Migration Hub Refactor Spaces application. Before you can delete an application, you must first delete any services or routes within the application.
    */
  def deleteApplication(): Request[DeleteApplicationResponse, AWSError] = js.native
  def deleteApplication(callback: js.Function2[/* err */ AWSError, /* data */ DeleteApplicationResponse, Unit]): Request[DeleteApplicationResponse, AWSError] = js.native
  /**
    * Deletes an Amazon Web Services Migration Hub Refactor Spaces application. Before you can delete an application, you must first delete any services or routes within the application.
    */
  def deleteApplication(params: DeleteApplicationRequest): Request[DeleteApplicationResponse, AWSError] = js.native
  def deleteApplication(
    params: DeleteApplicationRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteApplicationResponse, Unit]
  ): Request[DeleteApplicationResponse, AWSError] = js.native
  
  /**
    * Deletes an Amazon Web Services Migration Hub Refactor Spaces environment. Before you can delete an environment, you must first delete any applications and services within the environment.
    */
  def deleteEnvironment(): Request[DeleteEnvironmentResponse, AWSError] = js.native
  def deleteEnvironment(callback: js.Function2[/* err */ AWSError, /* data */ DeleteEnvironmentResponse, Unit]): Request[DeleteEnvironmentResponse, AWSError] = js.native
  /**
    * Deletes an Amazon Web Services Migration Hub Refactor Spaces environment. Before you can delete an environment, you must first delete any applications and services within the environment.
    */
  def deleteEnvironment(params: DeleteEnvironmentRequest): Request[DeleteEnvironmentResponse, AWSError] = js.native
  def deleteEnvironment(
    params: DeleteEnvironmentRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteEnvironmentResponse, Unit]
  ): Request[DeleteEnvironmentResponse, AWSError] = js.native
  
  /**
    * Deletes the resource policy set for the environment. 
    */
  def deleteResourcePolicy(): Request[DeleteResourcePolicyResponse, AWSError] = js.native
  def deleteResourcePolicy(callback: js.Function2[/* err */ AWSError, /* data */ DeleteResourcePolicyResponse, Unit]): Request[DeleteResourcePolicyResponse, AWSError] = js.native
  /**
    * Deletes the resource policy set for the environment. 
    */
  def deleteResourcePolicy(params: DeleteResourcePolicyRequest): Request[DeleteResourcePolicyResponse, AWSError] = js.native
  def deleteResourcePolicy(
    params: DeleteResourcePolicyRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteResourcePolicyResponse, Unit]
  ): Request[DeleteResourcePolicyResponse, AWSError] = js.native
  
  /**
    * Deletes an Amazon Web Services Migration Hub Refactor Spaces route.
    */
  def deleteRoute(): Request[DeleteRouteResponse, AWSError] = js.native
  def deleteRoute(callback: js.Function2[/* err */ AWSError, /* data */ DeleteRouteResponse, Unit]): Request[DeleteRouteResponse, AWSError] = js.native
  /**
    * Deletes an Amazon Web Services Migration Hub Refactor Spaces route.
    */
  def deleteRoute(params: DeleteRouteRequest): Request[DeleteRouteResponse, AWSError] = js.native
  def deleteRoute(
    params: DeleteRouteRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteRouteResponse, Unit]
  ): Request[DeleteRouteResponse, AWSError] = js.native
  
  /**
    * Deletes an Amazon Web Services Migration Hub Refactor Spaces service. 
    */
  def deleteService(): Request[DeleteServiceResponse, AWSError] = js.native
  def deleteService(callback: js.Function2[/* err */ AWSError, /* data */ DeleteServiceResponse, Unit]): Request[DeleteServiceResponse, AWSError] = js.native
  /**
    * Deletes an Amazon Web Services Migration Hub Refactor Spaces service. 
    */
  def deleteService(params: DeleteServiceRequest): Request[DeleteServiceResponse, AWSError] = js.native
  def deleteService(
    params: DeleteServiceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteServiceResponse, Unit]
  ): Request[DeleteServiceResponse, AWSError] = js.native
  
  /**
    * Gets an Amazon Web Services Migration Hub Refactor Spaces application.
    */
  def getApplication(): Request[GetApplicationResponse, AWSError] = js.native
  def getApplication(callback: js.Function2[/* err */ AWSError, /* data */ GetApplicationResponse, Unit]): Request[GetApplicationResponse, AWSError] = js.native
  /**
    * Gets an Amazon Web Services Migration Hub Refactor Spaces application.
    */
  def getApplication(params: GetApplicationRequest): Request[GetApplicationResponse, AWSError] = js.native
  def getApplication(
    params: GetApplicationRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetApplicationResponse, Unit]
  ): Request[GetApplicationResponse, AWSError] = js.native
  
  /**
    * Gets an Amazon Web Services Migration Hub Refactor Spaces environment.
    */
  def getEnvironment(): Request[GetEnvironmentResponse, AWSError] = js.native
  def getEnvironment(callback: js.Function2[/* err */ AWSError, /* data */ GetEnvironmentResponse, Unit]): Request[GetEnvironmentResponse, AWSError] = js.native
  /**
    * Gets an Amazon Web Services Migration Hub Refactor Spaces environment.
    */
  def getEnvironment(params: GetEnvironmentRequest): Request[GetEnvironmentResponse, AWSError] = js.native
  def getEnvironment(
    params: GetEnvironmentRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetEnvironmentResponse, Unit]
  ): Request[GetEnvironmentResponse, AWSError] = js.native
  
  /**
    * Gets the resource-based permission policy that is set for the given environment. 
    */
  def getResourcePolicy(): Request[GetResourcePolicyResponse, AWSError] = js.native
  def getResourcePolicy(callback: js.Function2[/* err */ AWSError, /* data */ GetResourcePolicyResponse, Unit]): Request[GetResourcePolicyResponse, AWSError] = js.native
  /**
    * Gets the resource-based permission policy that is set for the given environment. 
    */
  def getResourcePolicy(params: GetResourcePolicyRequest): Request[GetResourcePolicyResponse, AWSError] = js.native
  def getResourcePolicy(
    params: GetResourcePolicyRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetResourcePolicyResponse, Unit]
  ): Request[GetResourcePolicyResponse, AWSError] = js.native
  
  /**
    * Gets an Amazon Web Services Migration Hub Refactor Spaces route.
    */
  def getRoute(): Request[GetRouteResponse, AWSError] = js.native
  def getRoute(callback: js.Function2[/* err */ AWSError, /* data */ GetRouteResponse, Unit]): Request[GetRouteResponse, AWSError] = js.native
  /**
    * Gets an Amazon Web Services Migration Hub Refactor Spaces route.
    */
  def getRoute(params: GetRouteRequest): Request[GetRouteResponse, AWSError] = js.native
  def getRoute(
    params: GetRouteRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetRouteResponse, Unit]
  ): Request[GetRouteResponse, AWSError] = js.native
  
  /**
    * Gets an Amazon Web Services Migration Hub Refactor Spaces service. 
    */
  def getService(): Request[GetServiceResponse, AWSError] = js.native
  def getService(callback: js.Function2[/* err */ AWSError, /* data */ GetServiceResponse, Unit]): Request[GetServiceResponse, AWSError] = js.native
  /**
    * Gets an Amazon Web Services Migration Hub Refactor Spaces service. 
    */
  def getService(params: GetServiceRequest): Request[GetServiceResponse, AWSError] = js.native
  def getService(
    params: GetServiceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetServiceResponse, Unit]
  ): Request[GetServiceResponse, AWSError] = js.native
  
  /**
    * Lists all the Amazon Web Services Migration Hub Refactor Spaces applications within an environment. 
    */
  def listApplications(): Request[ListApplicationsResponse, AWSError] = js.native
  def listApplications(callback: js.Function2[/* err */ AWSError, /* data */ ListApplicationsResponse, Unit]): Request[ListApplicationsResponse, AWSError] = js.native
  /**
    * Lists all the Amazon Web Services Migration Hub Refactor Spaces applications within an environment. 
    */
  def listApplications(params: ListApplicationsRequest): Request[ListApplicationsResponse, AWSError] = js.native
  def listApplications(
    params: ListApplicationsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListApplicationsResponse, Unit]
  ): Request[ListApplicationsResponse, AWSError] = js.native
  
  /**
    * Lists all Amazon Web Services Migration Hub Refactor Spaces service virtual private clouds (VPCs) that are part of the environment. 
    */
  def listEnvironmentVpcs(): Request[ListEnvironmentVpcsResponse, AWSError] = js.native
  def listEnvironmentVpcs(callback: js.Function2[/* err */ AWSError, /* data */ ListEnvironmentVpcsResponse, Unit]): Request[ListEnvironmentVpcsResponse, AWSError] = js.native
  /**
    * Lists all Amazon Web Services Migration Hub Refactor Spaces service virtual private clouds (VPCs) that are part of the environment. 
    */
  def listEnvironmentVpcs(params: ListEnvironmentVpcsRequest): Request[ListEnvironmentVpcsResponse, AWSError] = js.native
  def listEnvironmentVpcs(
    params: ListEnvironmentVpcsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListEnvironmentVpcsResponse, Unit]
  ): Request[ListEnvironmentVpcsResponse, AWSError] = js.native
  
  /**
    * Lists Amazon Web Services Migration Hub Refactor Spaces environments owned by a caller account or shared with the caller account. 
    */
  def listEnvironments(): Request[ListEnvironmentsResponse, AWSError] = js.native
  def listEnvironments(callback: js.Function2[/* err */ AWSError, /* data */ ListEnvironmentsResponse, Unit]): Request[ListEnvironmentsResponse, AWSError] = js.native
  /**
    * Lists Amazon Web Services Migration Hub Refactor Spaces environments owned by a caller account or shared with the caller account. 
    */
  def listEnvironments(params: ListEnvironmentsRequest): Request[ListEnvironmentsResponse, AWSError] = js.native
  def listEnvironments(
    params: ListEnvironmentsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListEnvironmentsResponse, Unit]
  ): Request[ListEnvironmentsResponse, AWSError] = js.native
  
  /**
    * Lists all the Amazon Web Services Migration Hub Refactor Spaces routes within an application. 
    */
  def listRoutes(): Request[ListRoutesResponse, AWSError] = js.native
  def listRoutes(callback: js.Function2[/* err */ AWSError, /* data */ ListRoutesResponse, Unit]): Request[ListRoutesResponse, AWSError] = js.native
  /**
    * Lists all the Amazon Web Services Migration Hub Refactor Spaces routes within an application. 
    */
  def listRoutes(params: ListRoutesRequest): Request[ListRoutesResponse, AWSError] = js.native
  def listRoutes(
    params: ListRoutesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListRoutesResponse, Unit]
  ): Request[ListRoutesResponse, AWSError] = js.native
  
  /**
    * Lists all the Amazon Web Services Migration Hub Refactor Spaces services within an application. 
    */
  def listServices(): Request[ListServicesResponse, AWSError] = js.native
  def listServices(callback: js.Function2[/* err */ AWSError, /* data */ ListServicesResponse, Unit]): Request[ListServicesResponse, AWSError] = js.native
  /**
    * Lists all the Amazon Web Services Migration Hub Refactor Spaces services within an application. 
    */
  def listServices(params: ListServicesRequest): Request[ListServicesResponse, AWSError] = js.native
  def listServices(
    params: ListServicesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListServicesResponse, Unit]
  ): Request[ListServicesResponse, AWSError] = js.native
  
  /**
    * Lists the tags of a resource. The caller account must be the same as the resource’s OwnerAccountId. Listing tags in other accounts is not supported. 
    */
  def listTagsForResource(): Request[ListTagsForResourceResponse, AWSError] = js.native
  def listTagsForResource(callback: js.Function2[/* err */ AWSError, /* data */ ListTagsForResourceResponse, Unit]): Request[ListTagsForResourceResponse, AWSError] = js.native
  /**
    * Lists the tags of a resource. The caller account must be the same as the resource’s OwnerAccountId. Listing tags in other accounts is not supported. 
    */
  def listTagsForResource(params: ListTagsForResourceRequest): Request[ListTagsForResourceResponse, AWSError] = js.native
  def listTagsForResource(
    params: ListTagsForResourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListTagsForResourceResponse, Unit]
  ): Request[ListTagsForResourceResponse, AWSError] = js.native
  
  /**
    * Attaches a resource-based permission policy to the Amazon Web Services Migration Hub Refactor Spaces environment. The policy must contain the same actions and condition statements as the arn:aws:ram::aws:permission/AWSRAMDefaultPermissionRefactorSpacesEnvironment permission in Resource Access Manager. The policy must not contain new lines or blank lines. 
    */
  def putResourcePolicy(): Request[PutResourcePolicyResponse, AWSError] = js.native
  def putResourcePolicy(callback: js.Function2[/* err */ AWSError, /* data */ PutResourcePolicyResponse, Unit]): Request[PutResourcePolicyResponse, AWSError] = js.native
  /**
    * Attaches a resource-based permission policy to the Amazon Web Services Migration Hub Refactor Spaces environment. The policy must contain the same actions and condition statements as the arn:aws:ram::aws:permission/AWSRAMDefaultPermissionRefactorSpacesEnvironment permission in Resource Access Manager. The policy must not contain new lines or blank lines. 
    */
  def putResourcePolicy(params: PutResourcePolicyRequest): Request[PutResourcePolicyResponse, AWSError] = js.native
  def putResourcePolicy(
    params: PutResourcePolicyRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ PutResourcePolicyResponse, Unit]
  ): Request[PutResourcePolicyResponse, AWSError] = js.native
  
  /**
    * Removes the tags of a given resource. Tags are metadata which can be used to manage a resource. To tag a resource, the caller account must be the same as the resource’s OwnerAccountId. Tagging resources in other accounts is not supported.  Amazon Web Services Migration Hub Refactor Spaces does not propagate tags to orchestrated resources, such as an environment’s transit gateway. 
    */
  def tagResource(): Request[TagResourceResponse, AWSError] = js.native
  def tagResource(callback: js.Function2[/* err */ AWSError, /* data */ TagResourceResponse, Unit]): Request[TagResourceResponse, AWSError] = js.native
  /**
    * Removes the tags of a given resource. Tags are metadata which can be used to manage a resource. To tag a resource, the caller account must be the same as the resource’s OwnerAccountId. Tagging resources in other accounts is not supported.  Amazon Web Services Migration Hub Refactor Spaces does not propagate tags to orchestrated resources, such as an environment’s transit gateway. 
    */
  def tagResource(params: TagResourceRequest): Request[TagResourceResponse, AWSError] = js.native
  def tagResource(
    params: TagResourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ TagResourceResponse, Unit]
  ): Request[TagResourceResponse, AWSError] = js.native
  
  /**
    * Adds to or modifies the tags of the given resource. Tags are metadata which can be used to manage a resource. To untag a resource, the caller account must be the same as the resource’s OwnerAccountId. Untagging resources across accounts is not supported. 
    */
  def untagResource(): Request[UntagResourceResponse, AWSError] = js.native
  def untagResource(callback: js.Function2[/* err */ AWSError, /* data */ UntagResourceResponse, Unit]): Request[UntagResourceResponse, AWSError] = js.native
  /**
    * Adds to or modifies the tags of the given resource. Tags are metadata which can be used to manage a resource. To untag a resource, the caller account must be the same as the resource’s OwnerAccountId. Untagging resources across accounts is not supported. 
    */
  def untagResource(params: UntagResourceRequest): Request[UntagResourceResponse, AWSError] = js.native
  def untagResource(
    params: UntagResourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UntagResourceResponse, Unit]
  ): Request[UntagResourceResponse, AWSError] = js.native
  
  /**
    *  Updates an Amazon Web Services Migration Hub Refactor Spaces route. 
    */
  def updateRoute(): Request[UpdateRouteResponse, AWSError] = js.native
  def updateRoute(callback: js.Function2[/* err */ AWSError, /* data */ UpdateRouteResponse, Unit]): Request[UpdateRouteResponse, AWSError] = js.native
  /**
    *  Updates an Amazon Web Services Migration Hub Refactor Spaces route. 
    */
  def updateRoute(params: UpdateRouteRequest): Request[UpdateRouteResponse, AWSError] = js.native
  def updateRoute(
    params: UpdateRouteRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateRouteResponse, Unit]
  ): Request[UpdateRouteResponse, AWSError] = js.native
}
