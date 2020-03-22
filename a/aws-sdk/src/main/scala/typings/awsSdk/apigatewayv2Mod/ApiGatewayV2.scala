package typings.awsSdk.apigatewayv2Mod

import typings.awsSdk.configMod.ConfigBase
import typings.awsSdk.errorMod.AWSError
import typings.awsSdk.requestMod.Request
import typings.awsSdk.serviceMod.Service
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ApiGatewayV2 extends Service {
  @JSName("config")
  var config_ApiGatewayV2: ConfigBase with ClientConfiguration = js.native
  /**
    * Creates an Api resource.
    */
  def createApi(): Request[CreateApiResponse, AWSError] = js.native
  def createApi(callback: js.Function2[/* err */ AWSError, /* data */ CreateApiResponse, Unit]): Request[CreateApiResponse, AWSError] = js.native
  /**
    * Creates an Api resource.
    */
  def createApi(params: CreateApiRequest): Request[CreateApiResponse, AWSError] = js.native
  def createApi(
    params: CreateApiRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateApiResponse, Unit]
  ): Request[CreateApiResponse, AWSError] = js.native
  /**
    * Creates an API mapping.
    */
  def createApiMapping(): Request[CreateApiMappingResponse, AWSError] = js.native
  def createApiMapping(callback: js.Function2[/* err */ AWSError, /* data */ CreateApiMappingResponse, Unit]): Request[CreateApiMappingResponse, AWSError] = js.native
  /**
    * Creates an API mapping.
    */
  def createApiMapping(params: CreateApiMappingRequest): Request[CreateApiMappingResponse, AWSError] = js.native
  def createApiMapping(
    params: CreateApiMappingRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateApiMappingResponse, Unit]
  ): Request[CreateApiMappingResponse, AWSError] = js.native
  /**
    * Creates an Authorizer for an API.
    */
  def createAuthorizer(): Request[CreateAuthorizerResponse, AWSError] = js.native
  def createAuthorizer(callback: js.Function2[/* err */ AWSError, /* data */ CreateAuthorizerResponse, Unit]): Request[CreateAuthorizerResponse, AWSError] = js.native
  /**
    * Creates an Authorizer for an API.
    */
  def createAuthorizer(params: CreateAuthorizerRequest): Request[CreateAuthorizerResponse, AWSError] = js.native
  def createAuthorizer(
    params: CreateAuthorizerRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateAuthorizerResponse, Unit]
  ): Request[CreateAuthorizerResponse, AWSError] = js.native
  /**
    * Creates a Deployment for an API.
    */
  def createDeployment(): Request[CreateDeploymentResponse, AWSError] = js.native
  def createDeployment(callback: js.Function2[/* err */ AWSError, /* data */ CreateDeploymentResponse, Unit]): Request[CreateDeploymentResponse, AWSError] = js.native
  /**
    * Creates a Deployment for an API.
    */
  def createDeployment(params: CreateDeploymentRequest): Request[CreateDeploymentResponse, AWSError] = js.native
  def createDeployment(
    params: CreateDeploymentRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateDeploymentResponse, Unit]
  ): Request[CreateDeploymentResponse, AWSError] = js.native
  /**
    * Creates a domain name.
    */
  def createDomainName(): Request[CreateDomainNameResponse, AWSError] = js.native
  def createDomainName(callback: js.Function2[/* err */ AWSError, /* data */ CreateDomainNameResponse, Unit]): Request[CreateDomainNameResponse, AWSError] = js.native
  /**
    * Creates a domain name.
    */
  def createDomainName(params: CreateDomainNameRequest): Request[CreateDomainNameResponse, AWSError] = js.native
  def createDomainName(
    params: CreateDomainNameRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateDomainNameResponse, Unit]
  ): Request[CreateDomainNameResponse, AWSError] = js.native
  /**
    * Creates an Integration.
    */
  def createIntegration(): Request[CreateIntegrationResult, AWSError] = js.native
  def createIntegration(callback: js.Function2[/* err */ AWSError, /* data */ CreateIntegrationResult, Unit]): Request[CreateIntegrationResult, AWSError] = js.native
  /**
    * Creates an Integration.
    */
  def createIntegration(params: CreateIntegrationRequest): Request[CreateIntegrationResult, AWSError] = js.native
  def createIntegration(
    params: CreateIntegrationRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateIntegrationResult, Unit]
  ): Request[CreateIntegrationResult, AWSError] = js.native
  /**
    * Creates an IntegrationResponses.
    */
  def createIntegrationResponse(): Request[CreateIntegrationResponseResponse, AWSError] = js.native
  def createIntegrationResponse(callback: js.Function2[/* err */ AWSError, /* data */ CreateIntegrationResponseResponse, Unit]): Request[CreateIntegrationResponseResponse, AWSError] = js.native
  /**
    * Creates an IntegrationResponses.
    */
  def createIntegrationResponse(params: CreateIntegrationResponseRequest): Request[CreateIntegrationResponseResponse, AWSError] = js.native
  def createIntegrationResponse(
    params: CreateIntegrationResponseRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateIntegrationResponseResponse, Unit]
  ): Request[CreateIntegrationResponseResponse, AWSError] = js.native
  /**
    * Creates a Model for an API.
    */
  def createModel(): Request[CreateModelResponse, AWSError] = js.native
  def createModel(callback: js.Function2[/* err */ AWSError, /* data */ CreateModelResponse, Unit]): Request[CreateModelResponse, AWSError] = js.native
  /**
    * Creates a Model for an API.
    */
  def createModel(params: CreateModelRequest): Request[CreateModelResponse, AWSError] = js.native
  def createModel(
    params: CreateModelRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateModelResponse, Unit]
  ): Request[CreateModelResponse, AWSError] = js.native
  /**
    * Creates a Route for an API.
    */
  def createRoute(): Request[CreateRouteResult, AWSError] = js.native
  def createRoute(callback: js.Function2[/* err */ AWSError, /* data */ CreateRouteResult, Unit]): Request[CreateRouteResult, AWSError] = js.native
  /**
    * Creates a Route for an API.
    */
  def createRoute(params: CreateRouteRequest): Request[CreateRouteResult, AWSError] = js.native
  def createRoute(
    params: CreateRouteRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateRouteResult, Unit]
  ): Request[CreateRouteResult, AWSError] = js.native
  /**
    * Creates a RouteResponse for a Route.
    */
  def createRouteResponse(): Request[CreateRouteResponseResponse, AWSError] = js.native
  def createRouteResponse(callback: js.Function2[/* err */ AWSError, /* data */ CreateRouteResponseResponse, Unit]): Request[CreateRouteResponseResponse, AWSError] = js.native
  /**
    * Creates a RouteResponse for a Route.
    */
  def createRouteResponse(params: CreateRouteResponseRequest): Request[CreateRouteResponseResponse, AWSError] = js.native
  def createRouteResponse(
    params: CreateRouteResponseRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateRouteResponseResponse, Unit]
  ): Request[CreateRouteResponseResponse, AWSError] = js.native
  /**
    * Creates a Stage for an API.
    */
  def createStage(): Request[CreateStageResponse, AWSError] = js.native
  def createStage(callback: js.Function2[/* err */ AWSError, /* data */ CreateStageResponse, Unit]): Request[CreateStageResponse, AWSError] = js.native
  /**
    * Creates a Stage for an API.
    */
  def createStage(params: CreateStageRequest): Request[CreateStageResponse, AWSError] = js.native
  def createStage(
    params: CreateStageRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateStageResponse, Unit]
  ): Request[CreateStageResponse, AWSError] = js.native
  /**
    * Creates a VPC link.
    */
  def createVpcLink(): Request[CreateVpcLinkResponse, AWSError] = js.native
  def createVpcLink(callback: js.Function2[/* err */ AWSError, /* data */ CreateVpcLinkResponse, Unit]): Request[CreateVpcLinkResponse, AWSError] = js.native
  /**
    * Creates a VPC link.
    */
  def createVpcLink(params: CreateVpcLinkRequest): Request[CreateVpcLinkResponse, AWSError] = js.native
  def createVpcLink(
    params: CreateVpcLinkRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateVpcLinkResponse, Unit]
  ): Request[CreateVpcLinkResponse, AWSError] = js.native
  /**
    * Deletes the AccessLogSettings for a Stage. To disable access logging for a Stage, delete its AccessLogSettings.
    */
  def deleteAccessLogSettings(): Request[js.Object, AWSError] = js.native
  def deleteAccessLogSettings(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Deletes the AccessLogSettings for a Stage. To disable access logging for a Stage, delete its AccessLogSettings.
    */
  def deleteAccessLogSettings(params: DeleteAccessLogSettingsRequest): Request[js.Object, AWSError] = js.native
  def deleteAccessLogSettings(
    params: DeleteAccessLogSettingsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  /**
    * Deletes an Api resource.
    */
  def deleteApi(): Request[js.Object, AWSError] = js.native
  def deleteApi(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Deletes an Api resource.
    */
  def deleteApi(params: DeleteApiRequest): Request[js.Object, AWSError] = js.native
  def deleteApi(params: DeleteApiRequest, callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Deletes an API mapping.
    */
  def deleteApiMapping(): Request[js.Object, AWSError] = js.native
  def deleteApiMapping(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Deletes an API mapping.
    */
  def deleteApiMapping(params: DeleteApiMappingRequest): Request[js.Object, AWSError] = js.native
  def deleteApiMapping(
    params: DeleteApiMappingRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  /**
    * Deletes an Authorizer.
    */
  def deleteAuthorizer(): Request[js.Object, AWSError] = js.native
  def deleteAuthorizer(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Deletes an Authorizer.
    */
  def deleteAuthorizer(params: DeleteAuthorizerRequest): Request[js.Object, AWSError] = js.native
  def deleteAuthorizer(
    params: DeleteAuthorizerRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  /**
    * Deletes a CORS configuration.
    */
  def deleteCorsConfiguration(): Request[js.Object, AWSError] = js.native
  def deleteCorsConfiguration(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Deletes a CORS configuration.
    */
  def deleteCorsConfiguration(params: DeleteCorsConfigurationRequest): Request[js.Object, AWSError] = js.native
  def deleteCorsConfiguration(
    params: DeleteCorsConfigurationRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  /**
    * Deletes a Deployment.
    */
  def deleteDeployment(): Request[js.Object, AWSError] = js.native
  def deleteDeployment(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Deletes a Deployment.
    */
  def deleteDeployment(params: DeleteDeploymentRequest): Request[js.Object, AWSError] = js.native
  def deleteDeployment(
    params: DeleteDeploymentRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  /**
    * Deletes a domain name.
    */
  def deleteDomainName(): Request[js.Object, AWSError] = js.native
  def deleteDomainName(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Deletes a domain name.
    */
  def deleteDomainName(params: DeleteDomainNameRequest): Request[js.Object, AWSError] = js.native
  def deleteDomainName(
    params: DeleteDomainNameRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  /**
    * Deletes an Integration.
    */
  def deleteIntegration(): Request[js.Object, AWSError] = js.native
  def deleteIntegration(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Deletes an Integration.
    */
  def deleteIntegration(params: DeleteIntegrationRequest): Request[js.Object, AWSError] = js.native
  def deleteIntegration(
    params: DeleteIntegrationRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  /**
    * Deletes an IntegrationResponses.
    */
  def deleteIntegrationResponse(): Request[js.Object, AWSError] = js.native
  def deleteIntegrationResponse(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Deletes an IntegrationResponses.
    */
  def deleteIntegrationResponse(params: DeleteIntegrationResponseRequest): Request[js.Object, AWSError] = js.native
  def deleteIntegrationResponse(
    params: DeleteIntegrationResponseRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  /**
    * Deletes a Model.
    */
  def deleteModel(): Request[js.Object, AWSError] = js.native
  def deleteModel(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Deletes a Model.
    */
  def deleteModel(params: DeleteModelRequest): Request[js.Object, AWSError] = js.native
  def deleteModel(params: DeleteModelRequest, callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Deletes a Route.
    */
  def deleteRoute(): Request[js.Object, AWSError] = js.native
  def deleteRoute(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Deletes a Route.
    */
  def deleteRoute(params: DeleteRouteRequest): Request[js.Object, AWSError] = js.native
  def deleteRoute(params: DeleteRouteRequest, callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Deletes a route request parameter.
    */
  def deleteRouteRequestParameter(): Request[js.Object, AWSError] = js.native
  def deleteRouteRequestParameter(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Deletes a route request parameter.
    */
  def deleteRouteRequestParameter(params: DeleteRouteRequestParameterRequest): Request[js.Object, AWSError] = js.native
  def deleteRouteRequestParameter(
    params: DeleteRouteRequestParameterRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  /**
    * Deletes a RouteResponse.
    */
  def deleteRouteResponse(): Request[js.Object, AWSError] = js.native
  def deleteRouteResponse(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Deletes a RouteResponse.
    */
  def deleteRouteResponse(params: DeleteRouteResponseRequest): Request[js.Object, AWSError] = js.native
  def deleteRouteResponse(
    params: DeleteRouteResponseRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  /**
    * Deletes the RouteSettings for a stage.
    */
  def deleteRouteSettings(): Request[js.Object, AWSError] = js.native
  def deleteRouteSettings(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Deletes the RouteSettings for a stage.
    */
  def deleteRouteSettings(params: DeleteRouteSettingsRequest): Request[js.Object, AWSError] = js.native
  def deleteRouteSettings(
    params: DeleteRouteSettingsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  /**
    * Deletes a Stage.
    */
  def deleteStage(): Request[js.Object, AWSError] = js.native
  def deleteStage(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Deletes a Stage.
    */
  def deleteStage(params: DeleteStageRequest): Request[js.Object, AWSError] = js.native
  def deleteStage(params: DeleteStageRequest, callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Deletes a VPC link.
    */
  def deleteVpcLink(): Request[DeleteVpcLinkResponse, AWSError] = js.native
  def deleteVpcLink(callback: js.Function2[/* err */ AWSError, /* data */ DeleteVpcLinkResponse, Unit]): Request[DeleteVpcLinkResponse, AWSError] = js.native
  /**
    * Deletes a VPC link.
    */
  def deleteVpcLink(params: DeleteVpcLinkRequest): Request[DeleteVpcLinkResponse, AWSError] = js.native
  def deleteVpcLink(
    params: DeleteVpcLinkRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteVpcLinkResponse, Unit]
  ): Request[DeleteVpcLinkResponse, AWSError] = js.native
  /**
    * Gets an Api resource.
    */
  def getApi(): Request[GetApiResponse, AWSError] = js.native
  def getApi(callback: js.Function2[/* err */ AWSError, /* data */ GetApiResponse, Unit]): Request[GetApiResponse, AWSError] = js.native
  /**
    * Gets an Api resource.
    */
  def getApi(params: GetApiRequest): Request[GetApiResponse, AWSError] = js.native
  def getApi(params: GetApiRequest, callback: js.Function2[/* err */ AWSError, /* data */ GetApiResponse, Unit]): Request[GetApiResponse, AWSError] = js.native
  /**
    * Gets an API mapping.
    */
  def getApiMapping(): Request[GetApiMappingResponse, AWSError] = js.native
  def getApiMapping(callback: js.Function2[/* err */ AWSError, /* data */ GetApiMappingResponse, Unit]): Request[GetApiMappingResponse, AWSError] = js.native
  /**
    * Gets an API mapping.
    */
  def getApiMapping(params: GetApiMappingRequest): Request[GetApiMappingResponse, AWSError] = js.native
  def getApiMapping(
    params: GetApiMappingRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetApiMappingResponse, Unit]
  ): Request[GetApiMappingResponse, AWSError] = js.native
  /**
    * Gets API mappings.
    */
  def getApiMappings(): Request[GetApiMappingsResponse, AWSError] = js.native
  def getApiMappings(callback: js.Function2[/* err */ AWSError, /* data */ GetApiMappingsResponse, Unit]): Request[GetApiMappingsResponse, AWSError] = js.native
  /**
    * Gets API mappings.
    */
  def getApiMappings(params: GetApiMappingsRequest): Request[GetApiMappingsResponse, AWSError] = js.native
  def getApiMappings(
    params: GetApiMappingsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetApiMappingsResponse, Unit]
  ): Request[GetApiMappingsResponse, AWSError] = js.native
  /**
    * Gets a collection of Api resources.
    */
  def getApis(): Request[GetApisResponse, AWSError] = js.native
  def getApis(callback: js.Function2[/* err */ AWSError, /* data */ GetApisResponse, Unit]): Request[GetApisResponse, AWSError] = js.native
  /**
    * Gets a collection of Api resources.
    */
  def getApis(params: GetApisRequest): Request[GetApisResponse, AWSError] = js.native
  def getApis(
    params: GetApisRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetApisResponse, Unit]
  ): Request[GetApisResponse, AWSError] = js.native
  /**
    * Gets an Authorizer.
    */
  def getAuthorizer(): Request[GetAuthorizerResponse, AWSError] = js.native
  def getAuthorizer(callback: js.Function2[/* err */ AWSError, /* data */ GetAuthorizerResponse, Unit]): Request[GetAuthorizerResponse, AWSError] = js.native
  /**
    * Gets an Authorizer.
    */
  def getAuthorizer(params: GetAuthorizerRequest): Request[GetAuthorizerResponse, AWSError] = js.native
  def getAuthorizer(
    params: GetAuthorizerRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetAuthorizerResponse, Unit]
  ): Request[GetAuthorizerResponse, AWSError] = js.native
  /**
    * Gets the Authorizers for an API.
    */
  def getAuthorizers(): Request[GetAuthorizersResponse, AWSError] = js.native
  def getAuthorizers(callback: js.Function2[/* err */ AWSError, /* data */ GetAuthorizersResponse, Unit]): Request[GetAuthorizersResponse, AWSError] = js.native
  /**
    * Gets the Authorizers for an API.
    */
  def getAuthorizers(params: GetAuthorizersRequest): Request[GetAuthorizersResponse, AWSError] = js.native
  def getAuthorizers(
    params: GetAuthorizersRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetAuthorizersResponse, Unit]
  ): Request[GetAuthorizersResponse, AWSError] = js.native
  /**
    * Gets a Deployment.
    */
  def getDeployment(): Request[GetDeploymentResponse, AWSError] = js.native
  def getDeployment(callback: js.Function2[/* err */ AWSError, /* data */ GetDeploymentResponse, Unit]): Request[GetDeploymentResponse, AWSError] = js.native
  /**
    * Gets a Deployment.
    */
  def getDeployment(params: GetDeploymentRequest): Request[GetDeploymentResponse, AWSError] = js.native
  def getDeployment(
    params: GetDeploymentRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetDeploymentResponse, Unit]
  ): Request[GetDeploymentResponse, AWSError] = js.native
  /**
    * Gets the Deployments for an API.
    */
  def getDeployments(): Request[GetDeploymentsResponse, AWSError] = js.native
  def getDeployments(callback: js.Function2[/* err */ AWSError, /* data */ GetDeploymentsResponse, Unit]): Request[GetDeploymentsResponse, AWSError] = js.native
  /**
    * Gets the Deployments for an API.
    */
  def getDeployments(params: GetDeploymentsRequest): Request[GetDeploymentsResponse, AWSError] = js.native
  def getDeployments(
    params: GetDeploymentsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetDeploymentsResponse, Unit]
  ): Request[GetDeploymentsResponse, AWSError] = js.native
  /**
    * Gets a domain name.
    */
  def getDomainName(): Request[GetDomainNameResponse, AWSError] = js.native
  def getDomainName(callback: js.Function2[/* err */ AWSError, /* data */ GetDomainNameResponse, Unit]): Request[GetDomainNameResponse, AWSError] = js.native
  /**
    * Gets a domain name.
    */
  def getDomainName(params: GetDomainNameRequest): Request[GetDomainNameResponse, AWSError] = js.native
  def getDomainName(
    params: GetDomainNameRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetDomainNameResponse, Unit]
  ): Request[GetDomainNameResponse, AWSError] = js.native
  /**
    * Gets the domain names for an AWS account.
    */
  def getDomainNames(): Request[GetDomainNamesResponse, AWSError] = js.native
  def getDomainNames(callback: js.Function2[/* err */ AWSError, /* data */ GetDomainNamesResponse, Unit]): Request[GetDomainNamesResponse, AWSError] = js.native
  /**
    * Gets the domain names for an AWS account.
    */
  def getDomainNames(params: GetDomainNamesRequest): Request[GetDomainNamesResponse, AWSError] = js.native
  def getDomainNames(
    params: GetDomainNamesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetDomainNamesResponse, Unit]
  ): Request[GetDomainNamesResponse, AWSError] = js.native
  /**
    * Gets an Integration.
    */
  def getIntegration(): Request[GetIntegrationResult, AWSError] = js.native
  def getIntegration(callback: js.Function2[/* err */ AWSError, /* data */ GetIntegrationResult, Unit]): Request[GetIntegrationResult, AWSError] = js.native
  /**
    * Gets an Integration.
    */
  def getIntegration(params: GetIntegrationRequest): Request[GetIntegrationResult, AWSError] = js.native
  def getIntegration(
    params: GetIntegrationRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetIntegrationResult, Unit]
  ): Request[GetIntegrationResult, AWSError] = js.native
  /**
    * Gets an IntegrationResponses.
    */
  def getIntegrationResponse(): Request[GetIntegrationResponseResponse, AWSError] = js.native
  def getIntegrationResponse(callback: js.Function2[/* err */ AWSError, /* data */ GetIntegrationResponseResponse, Unit]): Request[GetIntegrationResponseResponse, AWSError] = js.native
  /**
    * Gets an IntegrationResponses.
    */
  def getIntegrationResponse(params: GetIntegrationResponseRequest): Request[GetIntegrationResponseResponse, AWSError] = js.native
  def getIntegrationResponse(
    params: GetIntegrationResponseRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetIntegrationResponseResponse, Unit]
  ): Request[GetIntegrationResponseResponse, AWSError] = js.native
  /**
    * Gets the IntegrationResponses for an Integration.
    */
  def getIntegrationResponses(): Request[GetIntegrationResponsesResponse, AWSError] = js.native
  def getIntegrationResponses(callback: js.Function2[/* err */ AWSError, /* data */ GetIntegrationResponsesResponse, Unit]): Request[GetIntegrationResponsesResponse, AWSError] = js.native
  /**
    * Gets the IntegrationResponses for an Integration.
    */
  def getIntegrationResponses(params: GetIntegrationResponsesRequest): Request[GetIntegrationResponsesResponse, AWSError] = js.native
  def getIntegrationResponses(
    params: GetIntegrationResponsesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetIntegrationResponsesResponse, Unit]
  ): Request[GetIntegrationResponsesResponse, AWSError] = js.native
  /**
    * Gets the Integrations for an API.
    */
  def getIntegrations(): Request[GetIntegrationsResponse, AWSError] = js.native
  def getIntegrations(callback: js.Function2[/* err */ AWSError, /* data */ GetIntegrationsResponse, Unit]): Request[GetIntegrationsResponse, AWSError] = js.native
  /**
    * Gets the Integrations for an API.
    */
  def getIntegrations(params: GetIntegrationsRequest): Request[GetIntegrationsResponse, AWSError] = js.native
  def getIntegrations(
    params: GetIntegrationsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetIntegrationsResponse, Unit]
  ): Request[GetIntegrationsResponse, AWSError] = js.native
  /**
    * Gets a Model.
    */
  def getModel(): Request[GetModelResponse, AWSError] = js.native
  def getModel(callback: js.Function2[/* err */ AWSError, /* data */ GetModelResponse, Unit]): Request[GetModelResponse, AWSError] = js.native
  /**
    * Gets a Model.
    */
  def getModel(params: GetModelRequest): Request[GetModelResponse, AWSError] = js.native
  def getModel(
    params: GetModelRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetModelResponse, Unit]
  ): Request[GetModelResponse, AWSError] = js.native
  /**
    * Gets a model template.
    */
  def getModelTemplate(): Request[GetModelTemplateResponse, AWSError] = js.native
  def getModelTemplate(callback: js.Function2[/* err */ AWSError, /* data */ GetModelTemplateResponse, Unit]): Request[GetModelTemplateResponse, AWSError] = js.native
  /**
    * Gets a model template.
    */
  def getModelTemplate(params: GetModelTemplateRequest): Request[GetModelTemplateResponse, AWSError] = js.native
  def getModelTemplate(
    params: GetModelTemplateRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetModelTemplateResponse, Unit]
  ): Request[GetModelTemplateResponse, AWSError] = js.native
  /**
    * Gets the Models for an API.
    */
  def getModels(): Request[GetModelsResponse, AWSError] = js.native
  def getModels(callback: js.Function2[/* err */ AWSError, /* data */ GetModelsResponse, Unit]): Request[GetModelsResponse, AWSError] = js.native
  /**
    * Gets the Models for an API.
    */
  def getModels(params: GetModelsRequest): Request[GetModelsResponse, AWSError] = js.native
  def getModels(
    params: GetModelsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetModelsResponse, Unit]
  ): Request[GetModelsResponse, AWSError] = js.native
  /**
    * Gets a Route.
    */
  def getRoute(): Request[GetRouteResult, AWSError] = js.native
  def getRoute(callback: js.Function2[/* err */ AWSError, /* data */ GetRouteResult, Unit]): Request[GetRouteResult, AWSError] = js.native
  /**
    * Gets a Route.
    */
  def getRoute(params: GetRouteRequest): Request[GetRouteResult, AWSError] = js.native
  def getRoute(
    params: GetRouteRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetRouteResult, Unit]
  ): Request[GetRouteResult, AWSError] = js.native
  /**
    * Gets a RouteResponse.
    */
  def getRouteResponse(): Request[GetRouteResponseResponse, AWSError] = js.native
  def getRouteResponse(callback: js.Function2[/* err */ AWSError, /* data */ GetRouteResponseResponse, Unit]): Request[GetRouteResponseResponse, AWSError] = js.native
  /**
    * Gets a RouteResponse.
    */
  def getRouteResponse(params: GetRouteResponseRequest): Request[GetRouteResponseResponse, AWSError] = js.native
  def getRouteResponse(
    params: GetRouteResponseRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetRouteResponseResponse, Unit]
  ): Request[GetRouteResponseResponse, AWSError] = js.native
  /**
    * Gets the RouteResponses for a Route.
    */
  def getRouteResponses(): Request[GetRouteResponsesResponse, AWSError] = js.native
  def getRouteResponses(callback: js.Function2[/* err */ AWSError, /* data */ GetRouteResponsesResponse, Unit]): Request[GetRouteResponsesResponse, AWSError] = js.native
  /**
    * Gets the RouteResponses for a Route.
    */
  def getRouteResponses(params: GetRouteResponsesRequest): Request[GetRouteResponsesResponse, AWSError] = js.native
  def getRouteResponses(
    params: GetRouteResponsesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetRouteResponsesResponse, Unit]
  ): Request[GetRouteResponsesResponse, AWSError] = js.native
  /**
    * Gets the Routes for an API.
    */
  def getRoutes(): Request[GetRoutesResponse, AWSError] = js.native
  def getRoutes(callback: js.Function2[/* err */ AWSError, /* data */ GetRoutesResponse, Unit]): Request[GetRoutesResponse, AWSError] = js.native
  /**
    * Gets the Routes for an API.
    */
  def getRoutes(params: GetRoutesRequest): Request[GetRoutesResponse, AWSError] = js.native
  def getRoutes(
    params: GetRoutesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetRoutesResponse, Unit]
  ): Request[GetRoutesResponse, AWSError] = js.native
  /**
    * Gets a Stage.
    */
  def getStage(): Request[GetStageResponse, AWSError] = js.native
  def getStage(callback: js.Function2[/* err */ AWSError, /* data */ GetStageResponse, Unit]): Request[GetStageResponse, AWSError] = js.native
  /**
    * Gets a Stage.
    */
  def getStage(params: GetStageRequest): Request[GetStageResponse, AWSError] = js.native
  def getStage(
    params: GetStageRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetStageResponse, Unit]
  ): Request[GetStageResponse, AWSError] = js.native
  /**
    * Gets the Stages for an API.
    */
  def getStages(): Request[GetStagesResponse, AWSError] = js.native
  def getStages(callback: js.Function2[/* err */ AWSError, /* data */ GetStagesResponse, Unit]): Request[GetStagesResponse, AWSError] = js.native
  /**
    * Gets the Stages for an API.
    */
  def getStages(params: GetStagesRequest): Request[GetStagesResponse, AWSError] = js.native
  def getStages(
    params: GetStagesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetStagesResponse, Unit]
  ): Request[GetStagesResponse, AWSError] = js.native
  /**
    * Gets a collection of Tag resources.
    */
  def getTags(): Request[GetTagsResponse, AWSError] = js.native
  def getTags(callback: js.Function2[/* err */ AWSError, /* data */ GetTagsResponse, Unit]): Request[GetTagsResponse, AWSError] = js.native
  /**
    * Gets a collection of Tag resources.
    */
  def getTags(params: GetTagsRequest): Request[GetTagsResponse, AWSError] = js.native
  def getTags(
    params: GetTagsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetTagsResponse, Unit]
  ): Request[GetTagsResponse, AWSError] = js.native
  /**
    * Gets a VPC link.
    */
  def getVpcLink(): Request[GetVpcLinkResponse, AWSError] = js.native
  def getVpcLink(callback: js.Function2[/* err */ AWSError, /* data */ GetVpcLinkResponse, Unit]): Request[GetVpcLinkResponse, AWSError] = js.native
  /**
    * Gets a VPC link.
    */
  def getVpcLink(params: GetVpcLinkRequest): Request[GetVpcLinkResponse, AWSError] = js.native
  def getVpcLink(
    params: GetVpcLinkRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetVpcLinkResponse, Unit]
  ): Request[GetVpcLinkResponse, AWSError] = js.native
  /**
    * Gets a collection of VPC links.
    */
  def getVpcLinks(): Request[GetVpcLinksResponse, AWSError] = js.native
  def getVpcLinks(callback: js.Function2[/* err */ AWSError, /* data */ GetVpcLinksResponse, Unit]): Request[GetVpcLinksResponse, AWSError] = js.native
  /**
    * Gets a collection of VPC links.
    */
  def getVpcLinks(params: GetVpcLinksRequest): Request[GetVpcLinksResponse, AWSError] = js.native
  def getVpcLinks(
    params: GetVpcLinksRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetVpcLinksResponse, Unit]
  ): Request[GetVpcLinksResponse, AWSError] = js.native
  /**
    * Imports an API.
    */
  def importApi(): Request[ImportApiResponse, AWSError] = js.native
  def importApi(callback: js.Function2[/* err */ AWSError, /* data */ ImportApiResponse, Unit]): Request[ImportApiResponse, AWSError] = js.native
  /**
    * Imports an API.
    */
  def importApi(params: ImportApiRequest): Request[ImportApiResponse, AWSError] = js.native
  def importApi(
    params: ImportApiRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ImportApiResponse, Unit]
  ): Request[ImportApiResponse, AWSError] = js.native
  /**
    * Puts an Api resource.
    */
  def reimportApi(): Request[ReimportApiResponse, AWSError] = js.native
  def reimportApi(callback: js.Function2[/* err */ AWSError, /* data */ ReimportApiResponse, Unit]): Request[ReimportApiResponse, AWSError] = js.native
  /**
    * Puts an Api resource.
    */
  def reimportApi(params: ReimportApiRequest): Request[ReimportApiResponse, AWSError] = js.native
  def reimportApi(
    params: ReimportApiRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ReimportApiResponse, Unit]
  ): Request[ReimportApiResponse, AWSError] = js.native
  /**
    * Creates a new Tag resource to represent a tag.
    */
  def tagResource(): Request[TagResourceResponse, AWSError] = js.native
  def tagResource(callback: js.Function2[/* err */ AWSError, /* data */ TagResourceResponse, Unit]): Request[TagResourceResponse, AWSError] = js.native
  /**
    * Creates a new Tag resource to represent a tag.
    */
  def tagResource(params: TagResourceRequest): Request[TagResourceResponse, AWSError] = js.native
  def tagResource(
    params: TagResourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ TagResourceResponse, Unit]
  ): Request[TagResourceResponse, AWSError] = js.native
  /**
    * Deletes a Tag.
    */
  def untagResource(): Request[js.Object, AWSError] = js.native
  def untagResource(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Deletes a Tag.
    */
  def untagResource(params: UntagResourceRequest): Request[js.Object, AWSError] = js.native
  def untagResource(
    params: UntagResourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  /**
    * Updates an Api resource.
    */
  def updateApi(): Request[UpdateApiResponse, AWSError] = js.native
  def updateApi(callback: js.Function2[/* err */ AWSError, /* data */ UpdateApiResponse, Unit]): Request[UpdateApiResponse, AWSError] = js.native
  /**
    * Updates an Api resource.
    */
  def updateApi(params: UpdateApiRequest): Request[UpdateApiResponse, AWSError] = js.native
  def updateApi(
    params: UpdateApiRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateApiResponse, Unit]
  ): Request[UpdateApiResponse, AWSError] = js.native
  /**
    * The API mapping.
    */
  def updateApiMapping(): Request[UpdateApiMappingResponse, AWSError] = js.native
  def updateApiMapping(callback: js.Function2[/* err */ AWSError, /* data */ UpdateApiMappingResponse, Unit]): Request[UpdateApiMappingResponse, AWSError] = js.native
  /**
    * The API mapping.
    */
  def updateApiMapping(params: UpdateApiMappingRequest): Request[UpdateApiMappingResponse, AWSError] = js.native
  def updateApiMapping(
    params: UpdateApiMappingRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateApiMappingResponse, Unit]
  ): Request[UpdateApiMappingResponse, AWSError] = js.native
  /**
    * Updates an Authorizer.
    */
  def updateAuthorizer(): Request[UpdateAuthorizerResponse, AWSError] = js.native
  def updateAuthorizer(callback: js.Function2[/* err */ AWSError, /* data */ UpdateAuthorizerResponse, Unit]): Request[UpdateAuthorizerResponse, AWSError] = js.native
  /**
    * Updates an Authorizer.
    */
  def updateAuthorizer(params: UpdateAuthorizerRequest): Request[UpdateAuthorizerResponse, AWSError] = js.native
  def updateAuthorizer(
    params: UpdateAuthorizerRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateAuthorizerResponse, Unit]
  ): Request[UpdateAuthorizerResponse, AWSError] = js.native
  /**
    * Updates a Deployment.
    */
  def updateDeployment(): Request[UpdateDeploymentResponse, AWSError] = js.native
  def updateDeployment(callback: js.Function2[/* err */ AWSError, /* data */ UpdateDeploymentResponse, Unit]): Request[UpdateDeploymentResponse, AWSError] = js.native
  /**
    * Updates a Deployment.
    */
  def updateDeployment(params: UpdateDeploymentRequest): Request[UpdateDeploymentResponse, AWSError] = js.native
  def updateDeployment(
    params: UpdateDeploymentRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateDeploymentResponse, Unit]
  ): Request[UpdateDeploymentResponse, AWSError] = js.native
  /**
    * Updates a domain name.
    */
  def updateDomainName(): Request[UpdateDomainNameResponse, AWSError] = js.native
  def updateDomainName(callback: js.Function2[/* err */ AWSError, /* data */ UpdateDomainNameResponse, Unit]): Request[UpdateDomainNameResponse, AWSError] = js.native
  /**
    * Updates a domain name.
    */
  def updateDomainName(params: UpdateDomainNameRequest): Request[UpdateDomainNameResponse, AWSError] = js.native
  def updateDomainName(
    params: UpdateDomainNameRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateDomainNameResponse, Unit]
  ): Request[UpdateDomainNameResponse, AWSError] = js.native
  /**
    * Updates an Integration.
    */
  def updateIntegration(): Request[UpdateIntegrationResult, AWSError] = js.native
  def updateIntegration(callback: js.Function2[/* err */ AWSError, /* data */ UpdateIntegrationResult, Unit]): Request[UpdateIntegrationResult, AWSError] = js.native
  /**
    * Updates an Integration.
    */
  def updateIntegration(params: UpdateIntegrationRequest): Request[UpdateIntegrationResult, AWSError] = js.native
  def updateIntegration(
    params: UpdateIntegrationRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateIntegrationResult, Unit]
  ): Request[UpdateIntegrationResult, AWSError] = js.native
  /**
    * Updates an IntegrationResponses.
    */
  def updateIntegrationResponse(): Request[UpdateIntegrationResponseResponse, AWSError] = js.native
  def updateIntegrationResponse(callback: js.Function2[/* err */ AWSError, /* data */ UpdateIntegrationResponseResponse, Unit]): Request[UpdateIntegrationResponseResponse, AWSError] = js.native
  /**
    * Updates an IntegrationResponses.
    */
  def updateIntegrationResponse(params: UpdateIntegrationResponseRequest): Request[UpdateIntegrationResponseResponse, AWSError] = js.native
  def updateIntegrationResponse(
    params: UpdateIntegrationResponseRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateIntegrationResponseResponse, Unit]
  ): Request[UpdateIntegrationResponseResponse, AWSError] = js.native
  /**
    * Updates a Model.
    */
  def updateModel(): Request[UpdateModelResponse, AWSError] = js.native
  def updateModel(callback: js.Function2[/* err */ AWSError, /* data */ UpdateModelResponse, Unit]): Request[UpdateModelResponse, AWSError] = js.native
  /**
    * Updates a Model.
    */
  def updateModel(params: UpdateModelRequest): Request[UpdateModelResponse, AWSError] = js.native
  def updateModel(
    params: UpdateModelRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateModelResponse, Unit]
  ): Request[UpdateModelResponse, AWSError] = js.native
  /**
    * Updates a Route.
    */
  def updateRoute(): Request[UpdateRouteResult, AWSError] = js.native
  def updateRoute(callback: js.Function2[/* err */ AWSError, /* data */ UpdateRouteResult, Unit]): Request[UpdateRouteResult, AWSError] = js.native
  /**
    * Updates a Route.
    */
  def updateRoute(params: UpdateRouteRequest): Request[UpdateRouteResult, AWSError] = js.native
  def updateRoute(
    params: UpdateRouteRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateRouteResult, Unit]
  ): Request[UpdateRouteResult, AWSError] = js.native
  /**
    * Updates a RouteResponse.
    */
  def updateRouteResponse(): Request[UpdateRouteResponseResponse, AWSError] = js.native
  def updateRouteResponse(callback: js.Function2[/* err */ AWSError, /* data */ UpdateRouteResponseResponse, Unit]): Request[UpdateRouteResponseResponse, AWSError] = js.native
  /**
    * Updates a RouteResponse.
    */
  def updateRouteResponse(params: UpdateRouteResponseRequest): Request[UpdateRouteResponseResponse, AWSError] = js.native
  def updateRouteResponse(
    params: UpdateRouteResponseRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateRouteResponseResponse, Unit]
  ): Request[UpdateRouteResponseResponse, AWSError] = js.native
  /**
    * Updates a Stage.
    */
  def updateStage(): Request[UpdateStageResponse, AWSError] = js.native
  def updateStage(callback: js.Function2[/* err */ AWSError, /* data */ UpdateStageResponse, Unit]): Request[UpdateStageResponse, AWSError] = js.native
  /**
    * Updates a Stage.
    */
  def updateStage(params: UpdateStageRequest): Request[UpdateStageResponse, AWSError] = js.native
  def updateStage(
    params: UpdateStageRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateStageResponse, Unit]
  ): Request[UpdateStageResponse, AWSError] = js.native
  /**
    * Updates a VPC link.
    */
  def updateVpcLink(): Request[UpdateVpcLinkResponse, AWSError] = js.native
  def updateVpcLink(callback: js.Function2[/* err */ AWSError, /* data */ UpdateVpcLinkResponse, Unit]): Request[UpdateVpcLinkResponse, AWSError] = js.native
  /**
    * Updates a VPC link.
    */
  def updateVpcLink(params: UpdateVpcLinkRequest): Request[UpdateVpcLinkResponse, AWSError] = js.native
  def updateVpcLink(
    params: UpdateVpcLinkRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateVpcLinkResponse, Unit]
  ): Request[UpdateVpcLinkResponse, AWSError] = js.native
}

