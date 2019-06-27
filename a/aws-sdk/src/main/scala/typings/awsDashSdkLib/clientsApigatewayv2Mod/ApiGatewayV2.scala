package typings
package awsDashSdkLib.clientsApigatewayv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ApiGatewayV2
  extends awsDashSdkLib.libServiceMod.Service {
  @JSName("config")
  var config_ApiGatewayV2: awsDashSdkLib.libConfigMod.ConfigBase with ClientConfiguration = js.native
  /**
    * Creates an Api resource.
    */
  def createApi(): awsDashSdkLib.libRequestMod.Request[CreateApiResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createApi(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateApiResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateApiResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates an Api resource.
    */
  def createApi(params: CreateApiRequest): awsDashSdkLib.libRequestMod.Request[CreateApiResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createApi(
    params: CreateApiRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateApiResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateApiResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates an API mapping.
    */
  def createApiMapping(): awsDashSdkLib.libRequestMod.Request[CreateApiMappingResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createApiMapping(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateApiMappingResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateApiMappingResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates an API mapping.
    */
  def createApiMapping(params: CreateApiMappingRequest): awsDashSdkLib.libRequestMod.Request[CreateApiMappingResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createApiMapping(
    params: CreateApiMappingRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateApiMappingResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateApiMappingResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates an Authorizer for an API.
    */
  def createAuthorizer(): awsDashSdkLib.libRequestMod.Request[CreateAuthorizerResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createAuthorizer(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateAuthorizerResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateAuthorizerResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates an Authorizer for an API.
    */
  def createAuthorizer(params: CreateAuthorizerRequest): awsDashSdkLib.libRequestMod.Request[CreateAuthorizerResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createAuthorizer(
    params: CreateAuthorizerRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateAuthorizerResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateAuthorizerResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates a Deployment for an API.
    */
  def createDeployment(): awsDashSdkLib.libRequestMod.Request[CreateDeploymentResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createDeployment(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateDeploymentResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateDeploymentResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates a Deployment for an API.
    */
  def createDeployment(params: CreateDeploymentRequest): awsDashSdkLib.libRequestMod.Request[CreateDeploymentResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createDeployment(
    params: CreateDeploymentRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateDeploymentResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateDeploymentResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates a domain name.
    */
  def createDomainName(): awsDashSdkLib.libRequestMod.Request[CreateDomainNameResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createDomainName(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateDomainNameResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateDomainNameResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates a domain name.
    */
  def createDomainName(params: CreateDomainNameRequest): awsDashSdkLib.libRequestMod.Request[CreateDomainNameResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createDomainName(
    params: CreateDomainNameRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateDomainNameResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateDomainNameResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates an Integration.
    */
  def createIntegration(): awsDashSdkLib.libRequestMod.Request[CreateIntegrationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createIntegration(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateIntegrationResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateIntegrationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates an Integration.
    */
  def createIntegration(params: CreateIntegrationRequest): awsDashSdkLib.libRequestMod.Request[CreateIntegrationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createIntegration(
    params: CreateIntegrationRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateIntegrationResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateIntegrationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates an IntegrationResponses.
    */
  def createIntegrationResponse(): awsDashSdkLib.libRequestMod.Request[CreateIntegrationResponseResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createIntegrationResponse(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateIntegrationResponseResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateIntegrationResponseResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates an IntegrationResponses.
    */
  def createIntegrationResponse(params: CreateIntegrationResponseRequest): awsDashSdkLib.libRequestMod.Request[CreateIntegrationResponseResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createIntegrationResponse(
    params: CreateIntegrationResponseRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateIntegrationResponseResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateIntegrationResponseResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates a Model for an API.
    */
  def createModel(): awsDashSdkLib.libRequestMod.Request[CreateModelResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createModel(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateModelResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateModelResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates a Model for an API.
    */
  def createModel(params: CreateModelRequest): awsDashSdkLib.libRequestMod.Request[CreateModelResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createModel(
    params: CreateModelRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateModelResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateModelResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates a Route for an API.
    */
  def createRoute(): awsDashSdkLib.libRequestMod.Request[CreateRouteResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createRoute(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateRouteResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateRouteResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates a Route for an API.
    */
  def createRoute(params: CreateRouteRequest): awsDashSdkLib.libRequestMod.Request[CreateRouteResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createRoute(
    params: CreateRouteRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateRouteResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateRouteResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates a RouteResponse for a Route.
    */
  def createRouteResponse(): awsDashSdkLib.libRequestMod.Request[CreateRouteResponseResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createRouteResponse(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateRouteResponseResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateRouteResponseResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates a RouteResponse for a Route.
    */
  def createRouteResponse(params: CreateRouteResponseRequest): awsDashSdkLib.libRequestMod.Request[CreateRouteResponseResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createRouteResponse(
    params: CreateRouteResponseRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateRouteResponseResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateRouteResponseResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates a Stage for an API.
    */
  def createStage(): awsDashSdkLib.libRequestMod.Request[CreateStageResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createStage(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateStageResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateStageResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates a Stage for an API.
    */
  def createStage(params: CreateStageRequest): awsDashSdkLib.libRequestMod.Request[CreateStageResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createStage(
    params: CreateStageRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateStageResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateStageResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes an Api resource.
    */
  def deleteApi(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteApi(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes an Api resource.
    */
  def deleteApi(params: DeleteApiRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteApi(
    params: DeleteApiRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes an API mapping.
    */
  def deleteApiMapping(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteApiMapping(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes an API mapping.
    */
  def deleteApiMapping(params: DeleteApiMappingRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteApiMapping(
    params: DeleteApiMappingRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes an Authorizer.
    */
  def deleteAuthorizer(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteAuthorizer(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes an Authorizer.
    */
  def deleteAuthorizer(params: DeleteAuthorizerRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteAuthorizer(
    params: DeleteAuthorizerRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes a Deployment.
    */
  def deleteDeployment(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteDeployment(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes a Deployment.
    */
  def deleteDeployment(params: DeleteDeploymentRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteDeployment(
    params: DeleteDeploymentRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes a domain name.
    */
  def deleteDomainName(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteDomainName(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes a domain name.
    */
  def deleteDomainName(params: DeleteDomainNameRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteDomainName(
    params: DeleteDomainNameRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes an Integration.
    */
  def deleteIntegration(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteIntegration(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes an Integration.
    */
  def deleteIntegration(params: DeleteIntegrationRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteIntegration(
    params: DeleteIntegrationRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes an IntegrationResponses.
    */
  def deleteIntegrationResponse(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteIntegrationResponse(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes an IntegrationResponses.
    */
  def deleteIntegrationResponse(params: DeleteIntegrationResponseRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteIntegrationResponse(
    params: DeleteIntegrationResponseRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes a Model.
    */
  def deleteModel(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteModel(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes a Model.
    */
  def deleteModel(params: DeleteModelRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteModel(
    params: DeleteModelRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes a Route.
    */
  def deleteRoute(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteRoute(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes a Route.
    */
  def deleteRoute(params: DeleteRouteRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteRoute(
    params: DeleteRouteRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes a RouteResponse.
    */
  def deleteRouteResponse(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteRouteResponse(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes a RouteResponse.
    */
  def deleteRouteResponse(params: DeleteRouteResponseRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteRouteResponse(
    params: DeleteRouteResponseRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes a Stage.
    */
  def deleteStage(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteStage(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes a Stage.
    */
  def deleteStage(params: DeleteStageRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteStage(
    params: DeleteStageRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Gets an Api resource.
    */
  def getApi(): awsDashSdkLib.libRequestMod.Request[GetApiResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getApi(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ GetApiResponse, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[GetApiResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Gets an Api resource.
    */
  def getApi(params: GetApiRequest): awsDashSdkLib.libRequestMod.Request[GetApiResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getApi(
    params: GetApiRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ GetApiResponse, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[GetApiResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * The API mapping.
    */
  def getApiMapping(): awsDashSdkLib.libRequestMod.Request[GetApiMappingResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getApiMapping(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetApiMappingResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetApiMappingResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * The API mapping.
    */
  def getApiMapping(params: GetApiMappingRequest): awsDashSdkLib.libRequestMod.Request[GetApiMappingResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getApiMapping(
    params: GetApiMappingRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetApiMappingResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetApiMappingResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * The API mappings.
    */
  def getApiMappings(): awsDashSdkLib.libRequestMod.Request[GetApiMappingsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getApiMappings(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetApiMappingsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetApiMappingsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * The API mappings.
    */
  def getApiMappings(params: GetApiMappingsRequest): awsDashSdkLib.libRequestMod.Request[GetApiMappingsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getApiMappings(
    params: GetApiMappingsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetApiMappingsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetApiMappingsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Gets a collection of Api resources.
    */
  def getApis(): awsDashSdkLib.libRequestMod.Request[GetApisResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getApis(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ GetApisResponse, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[GetApisResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Gets a collection of Api resources.
    */
  def getApis(params: GetApisRequest): awsDashSdkLib.libRequestMod.Request[GetApisResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getApis(
    params: GetApisRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ GetApisResponse, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[GetApisResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Gets an Authorizer.
    */
  def getAuthorizer(): awsDashSdkLib.libRequestMod.Request[GetAuthorizerResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getAuthorizer(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetAuthorizerResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetAuthorizerResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Gets an Authorizer.
    */
  def getAuthorizer(params: GetAuthorizerRequest): awsDashSdkLib.libRequestMod.Request[GetAuthorizerResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getAuthorizer(
    params: GetAuthorizerRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetAuthorizerResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetAuthorizerResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Gets the Authorizers for an API.
    */
  def getAuthorizers(): awsDashSdkLib.libRequestMod.Request[GetAuthorizersResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getAuthorizers(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetAuthorizersResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetAuthorizersResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Gets the Authorizers for an API.
    */
  def getAuthorizers(params: GetAuthorizersRequest): awsDashSdkLib.libRequestMod.Request[GetAuthorizersResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getAuthorizers(
    params: GetAuthorizersRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetAuthorizersResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetAuthorizersResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Gets a Deployment.
    */
  def getDeployment(): awsDashSdkLib.libRequestMod.Request[GetDeploymentResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getDeployment(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetDeploymentResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetDeploymentResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Gets a Deployment.
    */
  def getDeployment(params: GetDeploymentRequest): awsDashSdkLib.libRequestMod.Request[GetDeploymentResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getDeployment(
    params: GetDeploymentRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetDeploymentResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetDeploymentResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Gets the Deployments for an API.
    */
  def getDeployments(): awsDashSdkLib.libRequestMod.Request[GetDeploymentsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getDeployments(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetDeploymentsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetDeploymentsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Gets the Deployments for an API.
    */
  def getDeployments(params: GetDeploymentsRequest): awsDashSdkLib.libRequestMod.Request[GetDeploymentsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getDeployments(
    params: GetDeploymentsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetDeploymentsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetDeploymentsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Gets a domain name.
    */
  def getDomainName(): awsDashSdkLib.libRequestMod.Request[GetDomainNameResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getDomainName(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetDomainNameResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetDomainNameResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Gets a domain name.
    */
  def getDomainName(params: GetDomainNameRequest): awsDashSdkLib.libRequestMod.Request[GetDomainNameResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getDomainName(
    params: GetDomainNameRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetDomainNameResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetDomainNameResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Gets the domain names for an AWS account.
    */
  def getDomainNames(): awsDashSdkLib.libRequestMod.Request[GetDomainNamesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getDomainNames(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetDomainNamesResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetDomainNamesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Gets the domain names for an AWS account.
    */
  def getDomainNames(params: GetDomainNamesRequest): awsDashSdkLib.libRequestMod.Request[GetDomainNamesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getDomainNames(
    params: GetDomainNamesRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetDomainNamesResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetDomainNamesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Gets an Integration.
    */
  def getIntegration(): awsDashSdkLib.libRequestMod.Request[GetIntegrationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getIntegration(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetIntegrationResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetIntegrationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Gets an Integration.
    */
  def getIntegration(params: GetIntegrationRequest): awsDashSdkLib.libRequestMod.Request[GetIntegrationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getIntegration(
    params: GetIntegrationRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetIntegrationResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetIntegrationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Gets an IntegrationResponses.
    */
  def getIntegrationResponse(): awsDashSdkLib.libRequestMod.Request[GetIntegrationResponseResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getIntegrationResponse(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetIntegrationResponseResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetIntegrationResponseResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Gets an IntegrationResponses.
    */
  def getIntegrationResponse(params: GetIntegrationResponseRequest): awsDashSdkLib.libRequestMod.Request[GetIntegrationResponseResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getIntegrationResponse(
    params: GetIntegrationResponseRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetIntegrationResponseResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetIntegrationResponseResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Gets the IntegrationResponses for an Integration.
    */
  def getIntegrationResponses(): awsDashSdkLib.libRequestMod.Request[GetIntegrationResponsesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getIntegrationResponses(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetIntegrationResponsesResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetIntegrationResponsesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Gets the IntegrationResponses for an Integration.
    */
  def getIntegrationResponses(params: GetIntegrationResponsesRequest): awsDashSdkLib.libRequestMod.Request[GetIntegrationResponsesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getIntegrationResponses(
    params: GetIntegrationResponsesRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetIntegrationResponsesResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetIntegrationResponsesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Gets the Integrations for an API.
    */
  def getIntegrations(): awsDashSdkLib.libRequestMod.Request[GetIntegrationsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getIntegrations(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetIntegrationsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetIntegrationsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Gets the Integrations for an API.
    */
  def getIntegrations(params: GetIntegrationsRequest): awsDashSdkLib.libRequestMod.Request[GetIntegrationsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getIntegrations(
    params: GetIntegrationsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetIntegrationsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetIntegrationsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Gets a Model.
    */
  def getModel(): awsDashSdkLib.libRequestMod.Request[GetModelResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getModel(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetModelResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetModelResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Gets a Model.
    */
  def getModel(params: GetModelRequest): awsDashSdkLib.libRequestMod.Request[GetModelResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getModel(
    params: GetModelRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetModelResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetModelResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Gets a model template.
    */
  def getModelTemplate(): awsDashSdkLib.libRequestMod.Request[GetModelTemplateResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getModelTemplate(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetModelTemplateResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetModelTemplateResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Gets a model template.
    */
  def getModelTemplate(params: GetModelTemplateRequest): awsDashSdkLib.libRequestMod.Request[GetModelTemplateResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getModelTemplate(
    params: GetModelTemplateRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetModelTemplateResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetModelTemplateResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Gets the Models for an API.
    */
  def getModels(): awsDashSdkLib.libRequestMod.Request[GetModelsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getModels(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetModelsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetModelsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Gets the Models for an API.
    */
  def getModels(params: GetModelsRequest): awsDashSdkLib.libRequestMod.Request[GetModelsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getModels(
    params: GetModelsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetModelsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetModelsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Gets a Route.
    */
  def getRoute(): awsDashSdkLib.libRequestMod.Request[GetRouteResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getRoute(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetRouteResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetRouteResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Gets a Route.
    */
  def getRoute(params: GetRouteRequest): awsDashSdkLib.libRequestMod.Request[GetRouteResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getRoute(
    params: GetRouteRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetRouteResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetRouteResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Gets a RouteResponse.
    */
  def getRouteResponse(): awsDashSdkLib.libRequestMod.Request[GetRouteResponseResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getRouteResponse(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetRouteResponseResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetRouteResponseResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Gets a RouteResponse.
    */
  def getRouteResponse(params: GetRouteResponseRequest): awsDashSdkLib.libRequestMod.Request[GetRouteResponseResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getRouteResponse(
    params: GetRouteResponseRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetRouteResponseResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetRouteResponseResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Gets the RouteResponses for a Route.
    */
  def getRouteResponses(): awsDashSdkLib.libRequestMod.Request[GetRouteResponsesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getRouteResponses(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetRouteResponsesResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetRouteResponsesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Gets the RouteResponses for a Route.
    */
  def getRouteResponses(params: GetRouteResponsesRequest): awsDashSdkLib.libRequestMod.Request[GetRouteResponsesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getRouteResponses(
    params: GetRouteResponsesRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetRouteResponsesResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetRouteResponsesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Gets the Routes for an API.
    */
  def getRoutes(): awsDashSdkLib.libRequestMod.Request[GetRoutesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getRoutes(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetRoutesResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetRoutesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Gets the Routes for an API.
    */
  def getRoutes(params: GetRoutesRequest): awsDashSdkLib.libRequestMod.Request[GetRoutesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getRoutes(
    params: GetRoutesRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetRoutesResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetRoutesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Gets a Stage.
    */
  def getStage(): awsDashSdkLib.libRequestMod.Request[GetStageResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getStage(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetStageResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetStageResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Gets a Stage.
    */
  def getStage(params: GetStageRequest): awsDashSdkLib.libRequestMod.Request[GetStageResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getStage(
    params: GetStageRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetStageResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetStageResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Gets the Stages for an API.
    */
  def getStages(): awsDashSdkLib.libRequestMod.Request[GetStagesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getStages(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetStagesResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetStagesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Gets the Stages for an API.
    */
  def getStages(params: GetStagesRequest): awsDashSdkLib.libRequestMod.Request[GetStagesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getStages(
    params: GetStagesRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetStagesResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetStagesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Gets the Tags for an API.
    */
  def getTags(): awsDashSdkLib.libRequestMod.Request[GetTagsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getTags(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ GetTagsResponse, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[GetTagsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Gets the Tags for an API.
    */
  def getTags(params: GetTagsRequest): awsDashSdkLib.libRequestMod.Request[GetTagsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getTags(
    params: GetTagsRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ GetTagsResponse, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[GetTagsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Tag an APIGW resource
    */
  def tagResource(): awsDashSdkLib.libRequestMod.Request[TagResourceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def tagResource(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ TagResourceResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[TagResourceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Tag an APIGW resource
    */
  def tagResource(params: TagResourceRequest): awsDashSdkLib.libRequestMod.Request[TagResourceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def tagResource(
    params: TagResourceRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ TagResourceResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[TagResourceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Untag an APIGW resource
    */
  def untagResource(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def untagResource(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Untag an APIGW resource
    */
  def untagResource(params: UntagResourceRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def untagResource(
    params: UntagResourceRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Updates an Api resource.
    */
  def updateApi(): awsDashSdkLib.libRequestMod.Request[UpdateApiResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def updateApi(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ UpdateApiResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[UpdateApiResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Updates an Api resource.
    */
  def updateApi(params: UpdateApiRequest): awsDashSdkLib.libRequestMod.Request[UpdateApiResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def updateApi(
    params: UpdateApiRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ UpdateApiResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[UpdateApiResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * The API mapping.
    */
  def updateApiMapping(): awsDashSdkLib.libRequestMod.Request[UpdateApiMappingResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def updateApiMapping(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ UpdateApiMappingResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[UpdateApiMappingResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * The API mapping.
    */
  def updateApiMapping(params: UpdateApiMappingRequest): awsDashSdkLib.libRequestMod.Request[UpdateApiMappingResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def updateApiMapping(
    params: UpdateApiMappingRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ UpdateApiMappingResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[UpdateApiMappingResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Updates an Authorizer.
    */
  def updateAuthorizer(): awsDashSdkLib.libRequestMod.Request[UpdateAuthorizerResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def updateAuthorizer(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ UpdateAuthorizerResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[UpdateAuthorizerResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Updates an Authorizer.
    */
  def updateAuthorizer(params: UpdateAuthorizerRequest): awsDashSdkLib.libRequestMod.Request[UpdateAuthorizerResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def updateAuthorizer(
    params: UpdateAuthorizerRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ UpdateAuthorizerResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[UpdateAuthorizerResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Updates a Deployment.
    */
  def updateDeployment(): awsDashSdkLib.libRequestMod.Request[UpdateDeploymentResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def updateDeployment(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ UpdateDeploymentResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[UpdateDeploymentResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Updates a Deployment.
    */
  def updateDeployment(params: UpdateDeploymentRequest): awsDashSdkLib.libRequestMod.Request[UpdateDeploymentResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def updateDeployment(
    params: UpdateDeploymentRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ UpdateDeploymentResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[UpdateDeploymentResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Updates a domain name.
    */
  def updateDomainName(): awsDashSdkLib.libRequestMod.Request[UpdateDomainNameResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def updateDomainName(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ UpdateDomainNameResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[UpdateDomainNameResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Updates a domain name.
    */
  def updateDomainName(params: UpdateDomainNameRequest): awsDashSdkLib.libRequestMod.Request[UpdateDomainNameResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def updateDomainName(
    params: UpdateDomainNameRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ UpdateDomainNameResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[UpdateDomainNameResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Updates an Integration.
    */
  def updateIntegration(): awsDashSdkLib.libRequestMod.Request[UpdateIntegrationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def updateIntegration(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ UpdateIntegrationResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[UpdateIntegrationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Updates an Integration.
    */
  def updateIntegration(params: UpdateIntegrationRequest): awsDashSdkLib.libRequestMod.Request[UpdateIntegrationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def updateIntegration(
    params: UpdateIntegrationRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ UpdateIntegrationResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[UpdateIntegrationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Updates an IntegrationResponses.
    */
  def updateIntegrationResponse(): awsDashSdkLib.libRequestMod.Request[UpdateIntegrationResponseResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def updateIntegrationResponse(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ UpdateIntegrationResponseResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[UpdateIntegrationResponseResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Updates an IntegrationResponses.
    */
  def updateIntegrationResponse(params: UpdateIntegrationResponseRequest): awsDashSdkLib.libRequestMod.Request[UpdateIntegrationResponseResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def updateIntegrationResponse(
    params: UpdateIntegrationResponseRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ UpdateIntegrationResponseResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[UpdateIntegrationResponseResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Updates a Model.
    */
  def updateModel(): awsDashSdkLib.libRequestMod.Request[UpdateModelResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def updateModel(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ UpdateModelResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[UpdateModelResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Updates a Model.
    */
  def updateModel(params: UpdateModelRequest): awsDashSdkLib.libRequestMod.Request[UpdateModelResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def updateModel(
    params: UpdateModelRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ UpdateModelResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[UpdateModelResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Updates a Route.
    */
  def updateRoute(): awsDashSdkLib.libRequestMod.Request[UpdateRouteResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def updateRoute(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ UpdateRouteResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[UpdateRouteResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Updates a Route.
    */
  def updateRoute(params: UpdateRouteRequest): awsDashSdkLib.libRequestMod.Request[UpdateRouteResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def updateRoute(
    params: UpdateRouteRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ UpdateRouteResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[UpdateRouteResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Updates a RouteResponse.
    */
  def updateRouteResponse(): awsDashSdkLib.libRequestMod.Request[UpdateRouteResponseResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def updateRouteResponse(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ UpdateRouteResponseResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[UpdateRouteResponseResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Updates a RouteResponse.
    */
  def updateRouteResponse(params: UpdateRouteResponseRequest): awsDashSdkLib.libRequestMod.Request[UpdateRouteResponseResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def updateRouteResponse(
    params: UpdateRouteResponseRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ UpdateRouteResponseResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[UpdateRouteResponseResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Updates a Stage.
    */
  def updateStage(): awsDashSdkLib.libRequestMod.Request[UpdateStageResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def updateStage(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ UpdateStageResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[UpdateStageResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Updates a Stage.
    */
  def updateStage(params: UpdateStageRequest): awsDashSdkLib.libRequestMod.Request[UpdateStageResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def updateStage(
    params: UpdateStageRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ UpdateStageResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[UpdateStageResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
}

