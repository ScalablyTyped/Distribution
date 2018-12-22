package typings
package awsDashSdkLib.clientsApigatewayv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ApiGatewayV2
  extends awsDashSdkLib.libServiceMod.Service {
  @JSName("config")
  var config_ApiGatewayV2: awsDashSdkLib.libConfigMod.ConfigBase with awsDashSdkLib.clientsApigatewayv2Mod.ApiGatewayV2Ns.ClientConfiguration = js.native
  /**
     * Creates an Api resource.
     */
  def createApi(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsApigatewayv2Mod.ApiGatewayV2Ns.CreateApiResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates an Api resource.
     */
  def createApi(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsApigatewayv2Mod.ApiGatewayV2Ns.CreateApiResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsApigatewayv2Mod.ApiGatewayV2Ns.CreateApiResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates an Api resource.
     */
  def createApi(params: awsDashSdkLib.clientsApigatewayv2Mod.ApiGatewayV2Ns.CreateApiRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsApigatewayv2Mod.ApiGatewayV2Ns.CreateApiResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates an Api resource.
     */
  def createApi(
    params: awsDashSdkLib.clientsApigatewayv2Mod.ApiGatewayV2Ns.CreateApiRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsApigatewayv2Mod.ApiGatewayV2Ns.CreateApiResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsApigatewayv2Mod.ApiGatewayV2Ns.CreateApiResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates an API mapping.
     */
  def createApiMapping(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsApigatewayv2Mod.ApiGatewayV2Ns.CreateApiMappingResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates an API mapping.
     */
  def createApiMapping(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsApigatewayv2Mod.ApiGatewayV2Ns.CreateApiMappingResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsApigatewayv2Mod.ApiGatewayV2Ns.CreateApiMappingResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates an API mapping.
     */
  def createApiMapping(params: awsDashSdkLib.clientsApigatewayv2Mod.ApiGatewayV2Ns.CreateApiMappingRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsApigatewayv2Mod.ApiGatewayV2Ns.CreateApiMappingResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates an API mapping.
     */
  def createApiMapping(
    params: awsDashSdkLib.clientsApigatewayv2Mod.ApiGatewayV2Ns.CreateApiMappingRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsApigatewayv2Mod.ApiGatewayV2Ns.CreateApiMappingResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsApigatewayv2Mod.ApiGatewayV2Ns.CreateApiMappingResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates an Authorizer for an API.
     */
  def createAuthorizer(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsApigatewayv2Mod.ApiGatewayV2Ns.CreateAuthorizerResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates an Authorizer for an API.
     */
  def createAuthorizer(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsApigatewayv2Mod.ApiGatewayV2Ns.CreateAuthorizerResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsApigatewayv2Mod.ApiGatewayV2Ns.CreateAuthorizerResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates an Authorizer for an API.
     */
  def createAuthorizer(params: awsDashSdkLib.clientsApigatewayv2Mod.ApiGatewayV2Ns.CreateAuthorizerRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsApigatewayv2Mod.ApiGatewayV2Ns.CreateAuthorizerResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates an Authorizer for an API.
     */
  def createAuthorizer(
    params: awsDashSdkLib.clientsApigatewayv2Mod.ApiGatewayV2Ns.CreateAuthorizerRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsApigatewayv2Mod.ApiGatewayV2Ns.CreateAuthorizerResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsApigatewayv2Mod.ApiGatewayV2Ns.CreateAuthorizerResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates a Deployment for an API.
     */
  def createDeployment(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsApigatewayv2Mod.ApiGatewayV2Ns.CreateDeploymentResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates a Deployment for an API.
     */
  def createDeployment(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsApigatewayv2Mod.ApiGatewayV2Ns.CreateDeploymentResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsApigatewayv2Mod.ApiGatewayV2Ns.CreateDeploymentResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates a Deployment for an API.
     */
  def createDeployment(params: awsDashSdkLib.clientsApigatewayv2Mod.ApiGatewayV2Ns.CreateDeploymentRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsApigatewayv2Mod.ApiGatewayV2Ns.CreateDeploymentResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates a Deployment for an API.
     */
  def createDeployment(
    params: awsDashSdkLib.clientsApigatewayv2Mod.ApiGatewayV2Ns.CreateDeploymentRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsApigatewayv2Mod.ApiGatewayV2Ns.CreateDeploymentResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsApigatewayv2Mod.ApiGatewayV2Ns.CreateDeploymentResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates a domain name.
     */
  def createDomainName(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsApigatewayv2Mod.ApiGatewayV2Ns.CreateDomainNameResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates a domain name.
     */
  def createDomainName(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsApigatewayv2Mod.ApiGatewayV2Ns.CreateDomainNameResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsApigatewayv2Mod.ApiGatewayV2Ns.CreateDomainNameResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates a domain name.
     */
  def createDomainName(params: awsDashSdkLib.clientsApigatewayv2Mod.ApiGatewayV2Ns.CreateDomainNameRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsApigatewayv2Mod.ApiGatewayV2Ns.CreateDomainNameResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates a domain name.
     */
  def createDomainName(
    params: awsDashSdkLib.clientsApigatewayv2Mod.ApiGatewayV2Ns.CreateDomainNameRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsApigatewayv2Mod.ApiGatewayV2Ns.CreateDomainNameResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsApigatewayv2Mod.ApiGatewayV2Ns.CreateDomainNameResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates an Integration.
     */
  def createIntegration(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsApigatewayv2Mod.ApiGatewayV2Ns.CreateIntegrationResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates an Integration.
     */
  def createIntegration(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsApigatewayv2Mod.ApiGatewayV2Ns.CreateIntegrationResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsApigatewayv2Mod.ApiGatewayV2Ns.CreateIntegrationResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates an Integration.
     */
  def createIntegration(params: awsDashSdkLib.clientsApigatewayv2Mod.ApiGatewayV2Ns.CreateIntegrationRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsApigatewayv2Mod.ApiGatewayV2Ns.CreateIntegrationResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates an Integration.
     */
  def createIntegration(
    params: awsDashSdkLib.clientsApigatewayv2Mod.ApiGatewayV2Ns.CreateIntegrationRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsApigatewayv2Mod.ApiGatewayV2Ns.CreateIntegrationResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsApigatewayv2Mod.ApiGatewayV2Ns.CreateIntegrationResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates an IntegrationResponses.
     */
  def createIntegrationResponse(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsApigatewayv2Mod.ApiGatewayV2Ns.CreateIntegrationResponseResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates an IntegrationResponses.
     */
  def createIntegrationResponse(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsApigatewayv2Mod.ApiGatewayV2Ns.CreateIntegrationResponseResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsApigatewayv2Mod.ApiGatewayV2Ns.CreateIntegrationResponseResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates an IntegrationResponses.
     */
  def createIntegrationResponse(params: awsDashSdkLib.clientsApigatewayv2Mod.ApiGatewayV2Ns.CreateIntegrationResponseRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsApigatewayv2Mod.ApiGatewayV2Ns.CreateIntegrationResponseResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates an IntegrationResponses.
     */
  def createIntegrationResponse(
    params: awsDashSdkLib.clientsApigatewayv2Mod.ApiGatewayV2Ns.CreateIntegrationResponseRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsApigatewayv2Mod.ApiGatewayV2Ns.CreateIntegrationResponseResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsApigatewayv2Mod.ApiGatewayV2Ns.CreateIntegrationResponseResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates a Model for an API.
     */
  def createModel(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsApigatewayv2Mod.ApiGatewayV2Ns.CreateModelResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates a Model for an API.
     */
  def createModel(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsApigatewayv2Mod.ApiGatewayV2Ns.CreateModelResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsApigatewayv2Mod.ApiGatewayV2Ns.CreateModelResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates a Model for an API.
     */
  def createModel(params: awsDashSdkLib.clientsApigatewayv2Mod.ApiGatewayV2Ns.CreateModelRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsApigatewayv2Mod.ApiGatewayV2Ns.CreateModelResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates a Model for an API.
     */
  def createModel(
    params: awsDashSdkLib.clientsApigatewayv2Mod.ApiGatewayV2Ns.CreateModelRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsApigatewayv2Mod.ApiGatewayV2Ns.CreateModelResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsApigatewayv2Mod.ApiGatewayV2Ns.CreateModelResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates a Route for an API.
     */
  def createRoute(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsApigatewayv2Mod.ApiGatewayV2Ns.CreateRouteResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates a Route for an API.
     */
  def createRoute(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsApigatewayv2Mod.ApiGatewayV2Ns.CreateRouteResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsApigatewayv2Mod.ApiGatewayV2Ns.CreateRouteResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates a Route for an API.
     */
  def createRoute(params: awsDashSdkLib.clientsApigatewayv2Mod.ApiGatewayV2Ns.CreateRouteRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsApigatewayv2Mod.ApiGatewayV2Ns.CreateRouteResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates a Route for an API.
     */
  def createRoute(
    params: awsDashSdkLib.clientsApigatewayv2Mod.ApiGatewayV2Ns.CreateRouteRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsApigatewayv2Mod.ApiGatewayV2Ns.CreateRouteResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsApigatewayv2Mod.ApiGatewayV2Ns.CreateRouteResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates a RouteResponse for a Route.
     */
  def createRouteResponse(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsApigatewayv2Mod.ApiGatewayV2Ns.CreateRouteResponseResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates a RouteResponse for a Route.
     */
  def createRouteResponse(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsApigatewayv2Mod.ApiGatewayV2Ns.CreateRouteResponseResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsApigatewayv2Mod.ApiGatewayV2Ns.CreateRouteResponseResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates a RouteResponse for a Route.
     */
  def createRouteResponse(params: awsDashSdkLib.clientsApigatewayv2Mod.ApiGatewayV2Ns.CreateRouteResponseRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsApigatewayv2Mod.ApiGatewayV2Ns.CreateRouteResponseResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates a RouteResponse for a Route.
     */
  def createRouteResponse(
    params: awsDashSdkLib.clientsApigatewayv2Mod.ApiGatewayV2Ns.CreateRouteResponseRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsApigatewayv2Mod.ApiGatewayV2Ns.CreateRouteResponseResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsApigatewayv2Mod.ApiGatewayV2Ns.CreateRouteResponseResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates a Stage for an API.
     */
  def createStage(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsApigatewayv2Mod.ApiGatewayV2Ns.CreateStageResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates a Stage for an API.
     */
  def createStage(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsApigatewayv2Mod.ApiGatewayV2Ns.CreateStageResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsApigatewayv2Mod.ApiGatewayV2Ns.CreateStageResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates a Stage for an API.
     */
  def createStage(params: awsDashSdkLib.clientsApigatewayv2Mod.ApiGatewayV2Ns.CreateStageRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsApigatewayv2Mod.ApiGatewayV2Ns.CreateStageResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates a Stage for an API.
     */
  def createStage(
    params: awsDashSdkLib.clientsApigatewayv2Mod.ApiGatewayV2Ns.CreateStageRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsApigatewayv2Mod.ApiGatewayV2Ns.CreateStageResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsApigatewayv2Mod.ApiGatewayV2Ns.CreateStageResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Deletes an Api resource.
     */
  def deleteApi(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Deletes an Api resource.
     */
  def deleteApi(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Deletes an Api resource.
     */
  def deleteApi(params: awsDashSdkLib.clientsApigatewayv2Mod.ApiGatewayV2Ns.DeleteApiRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Deletes an Api resource.
     */
  def deleteApi(
    params: awsDashSdkLib.clientsApigatewayv2Mod.ApiGatewayV2Ns.DeleteApiRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Deletes an API mapping.
     */
  def deleteApiMapping(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Deletes an API mapping.
     */
  def deleteApiMapping(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Deletes an API mapping.
     */
  def deleteApiMapping(params: awsDashSdkLib.clientsApigatewayv2Mod.ApiGatewayV2Ns.DeleteApiMappingRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Deletes an API mapping.
     */
  def deleteApiMapping(
    params: awsDashSdkLib.clientsApigatewayv2Mod.ApiGatewayV2Ns.DeleteApiMappingRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Deletes an Authorizer.
     */
  def deleteAuthorizer(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Deletes an Authorizer.
     */
  def deleteAuthorizer(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Deletes an Authorizer.
     */
  def deleteAuthorizer(params: awsDashSdkLib.clientsApigatewayv2Mod.ApiGatewayV2Ns.DeleteAuthorizerRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Deletes an Authorizer.
     */
  def deleteAuthorizer(
    params: awsDashSdkLib.clientsApigatewayv2Mod.ApiGatewayV2Ns.DeleteAuthorizerRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Deletes a Deployment.
     */
  def deleteDeployment(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Deletes a Deployment.
     */
  def deleteDeployment(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Deletes a Deployment.
     */
  def deleteDeployment(params: awsDashSdkLib.clientsApigatewayv2Mod.ApiGatewayV2Ns.DeleteDeploymentRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Deletes a Deployment.
     */
  def deleteDeployment(
    params: awsDashSdkLib.clientsApigatewayv2Mod.ApiGatewayV2Ns.DeleteDeploymentRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Deletes a domain name.
     */
  def deleteDomainName(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Deletes a domain name.
     */
  def deleteDomainName(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Deletes a domain name.
     */
  def deleteDomainName(params: awsDashSdkLib.clientsApigatewayv2Mod.ApiGatewayV2Ns.DeleteDomainNameRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Deletes a domain name.
     */
  def deleteDomainName(
    params: awsDashSdkLib.clientsApigatewayv2Mod.ApiGatewayV2Ns.DeleteDomainNameRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Deletes an Integration.
     */
  def deleteIntegration(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Deletes an Integration.
     */
  def deleteIntegration(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Deletes an Integration.
     */
  def deleteIntegration(params: awsDashSdkLib.clientsApigatewayv2Mod.ApiGatewayV2Ns.DeleteIntegrationRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Deletes an Integration.
     */
  def deleteIntegration(
    params: awsDashSdkLib.clientsApigatewayv2Mod.ApiGatewayV2Ns.DeleteIntegrationRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Deletes an IntegrationResponses.
     */
  def deleteIntegrationResponse(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Deletes an IntegrationResponses.
     */
  def deleteIntegrationResponse(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Deletes an IntegrationResponses.
     */
  def deleteIntegrationResponse(params: awsDashSdkLib.clientsApigatewayv2Mod.ApiGatewayV2Ns.DeleteIntegrationResponseRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Deletes an IntegrationResponses.
     */
  def deleteIntegrationResponse(
    params: awsDashSdkLib.clientsApigatewayv2Mod.ApiGatewayV2Ns.DeleteIntegrationResponseRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Deletes a Model.
     */
  def deleteModel(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Deletes a Model.
     */
  def deleteModel(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Deletes a Model.
     */
  def deleteModel(params: awsDashSdkLib.clientsApigatewayv2Mod.ApiGatewayV2Ns.DeleteModelRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Deletes a Model.
     */
  def deleteModel(
    params: awsDashSdkLib.clientsApigatewayv2Mod.ApiGatewayV2Ns.DeleteModelRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Deletes a Route.
     */
  def deleteRoute(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Deletes a Route.
     */
  def deleteRoute(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Deletes a Route.
     */
  def deleteRoute(params: awsDashSdkLib.clientsApigatewayv2Mod.ApiGatewayV2Ns.DeleteRouteRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Deletes a Route.
     */
  def deleteRoute(
    params: awsDashSdkLib.clientsApigatewayv2Mod.ApiGatewayV2Ns.DeleteRouteRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Deletes a RouteResponse.
     */
  def deleteRouteResponse(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Deletes a RouteResponse.
     */
  def deleteRouteResponse(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Deletes a RouteResponse.
     */
  def deleteRouteResponse(params: awsDashSdkLib.clientsApigatewayv2Mod.ApiGatewayV2Ns.DeleteRouteResponseRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Deletes a RouteResponse.
     */
  def deleteRouteResponse(
    params: awsDashSdkLib.clientsApigatewayv2Mod.ApiGatewayV2Ns.DeleteRouteResponseRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Deletes a Stage.
     */
  def deleteStage(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Deletes a Stage.
     */
  def deleteStage(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Deletes a Stage.
     */
  def deleteStage(params: awsDashSdkLib.clientsApigatewayv2Mod.ApiGatewayV2Ns.DeleteStageRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Deletes a Stage.
     */
  def deleteStage(
    params: awsDashSdkLib.clientsApigatewayv2Mod.ApiGatewayV2Ns.DeleteStageRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Gets an Api resource.
     */
  def getApi(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsApigatewayv2Mod.ApiGatewayV2Ns.GetApiResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets an Api resource.
     */
  def getApi(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsApigatewayv2Mod.ApiGatewayV2Ns.GetApiResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsApigatewayv2Mod.ApiGatewayV2Ns.GetApiResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets an Api resource.
     */
  def getApi(params: awsDashSdkLib.clientsApigatewayv2Mod.ApiGatewayV2Ns.GetApiRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsApigatewayv2Mod.ApiGatewayV2Ns.GetApiResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets an Api resource.
     */
  def getApi(
    params: awsDashSdkLib.clientsApigatewayv2Mod.ApiGatewayV2Ns.GetApiRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsApigatewayv2Mod.ApiGatewayV2Ns.GetApiResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsApigatewayv2Mod.ApiGatewayV2Ns.GetApiResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * The API mapping.
     */
  def getApiMapping(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsApigatewayv2Mod.ApiGatewayV2Ns.GetApiMappingResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * The API mapping.
     */
  def getApiMapping(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsApigatewayv2Mod.ApiGatewayV2Ns.GetApiMappingResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsApigatewayv2Mod.ApiGatewayV2Ns.GetApiMappingResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * The API mapping.
     */
  def getApiMapping(params: awsDashSdkLib.clientsApigatewayv2Mod.ApiGatewayV2Ns.GetApiMappingRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsApigatewayv2Mod.ApiGatewayV2Ns.GetApiMappingResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * The API mapping.
     */
  def getApiMapping(
    params: awsDashSdkLib.clientsApigatewayv2Mod.ApiGatewayV2Ns.GetApiMappingRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsApigatewayv2Mod.ApiGatewayV2Ns.GetApiMappingResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsApigatewayv2Mod.ApiGatewayV2Ns.GetApiMappingResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * The API mappings.
     */
  def getApiMappings(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsApigatewayv2Mod.ApiGatewayV2Ns.GetApiMappingsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * The API mappings.
     */
  def getApiMappings(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsApigatewayv2Mod.ApiGatewayV2Ns.GetApiMappingsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsApigatewayv2Mod.ApiGatewayV2Ns.GetApiMappingsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * The API mappings.
     */
  def getApiMappings(params: awsDashSdkLib.clientsApigatewayv2Mod.ApiGatewayV2Ns.GetApiMappingsRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsApigatewayv2Mod.ApiGatewayV2Ns.GetApiMappingsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * The API mappings.
     */
  def getApiMappings(
    params: awsDashSdkLib.clientsApigatewayv2Mod.ApiGatewayV2Ns.GetApiMappingsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsApigatewayv2Mod.ApiGatewayV2Ns.GetApiMappingsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsApigatewayv2Mod.ApiGatewayV2Ns.GetApiMappingsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets a collection of Api resources.
     */
  def getApis(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsApigatewayv2Mod.ApiGatewayV2Ns.GetApisResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets a collection of Api resources.
     */
  def getApis(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsApigatewayv2Mod.ApiGatewayV2Ns.GetApisResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsApigatewayv2Mod.ApiGatewayV2Ns.GetApisResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets a collection of Api resources.
     */
  def getApis(params: awsDashSdkLib.clientsApigatewayv2Mod.ApiGatewayV2Ns.GetApisRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsApigatewayv2Mod.ApiGatewayV2Ns.GetApisResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets a collection of Api resources.
     */
  def getApis(
    params: awsDashSdkLib.clientsApigatewayv2Mod.ApiGatewayV2Ns.GetApisRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsApigatewayv2Mod.ApiGatewayV2Ns.GetApisResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsApigatewayv2Mod.ApiGatewayV2Ns.GetApisResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets an Authorizer.
     */
  def getAuthorizer(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsApigatewayv2Mod.ApiGatewayV2Ns.GetAuthorizerResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets an Authorizer.
     */
  def getAuthorizer(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsApigatewayv2Mod.ApiGatewayV2Ns.GetAuthorizerResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsApigatewayv2Mod.ApiGatewayV2Ns.GetAuthorizerResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets an Authorizer.
     */
  def getAuthorizer(params: awsDashSdkLib.clientsApigatewayv2Mod.ApiGatewayV2Ns.GetAuthorizerRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsApigatewayv2Mod.ApiGatewayV2Ns.GetAuthorizerResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets an Authorizer.
     */
  def getAuthorizer(
    params: awsDashSdkLib.clientsApigatewayv2Mod.ApiGatewayV2Ns.GetAuthorizerRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsApigatewayv2Mod.ApiGatewayV2Ns.GetAuthorizerResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsApigatewayv2Mod.ApiGatewayV2Ns.GetAuthorizerResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets the Authorizers for an API.
     */
  def getAuthorizers(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsApigatewayv2Mod.ApiGatewayV2Ns.GetAuthorizersResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets the Authorizers for an API.
     */
  def getAuthorizers(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsApigatewayv2Mod.ApiGatewayV2Ns.GetAuthorizersResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsApigatewayv2Mod.ApiGatewayV2Ns.GetAuthorizersResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets the Authorizers for an API.
     */
  def getAuthorizers(params: awsDashSdkLib.clientsApigatewayv2Mod.ApiGatewayV2Ns.GetAuthorizersRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsApigatewayv2Mod.ApiGatewayV2Ns.GetAuthorizersResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets the Authorizers for an API.
     */
  def getAuthorizers(
    params: awsDashSdkLib.clientsApigatewayv2Mod.ApiGatewayV2Ns.GetAuthorizersRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsApigatewayv2Mod.ApiGatewayV2Ns.GetAuthorizersResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsApigatewayv2Mod.ApiGatewayV2Ns.GetAuthorizersResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets a Deployment.
     */
  def getDeployment(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsApigatewayv2Mod.ApiGatewayV2Ns.GetDeploymentResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets a Deployment.
     */
  def getDeployment(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsApigatewayv2Mod.ApiGatewayV2Ns.GetDeploymentResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsApigatewayv2Mod.ApiGatewayV2Ns.GetDeploymentResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets a Deployment.
     */
  def getDeployment(params: awsDashSdkLib.clientsApigatewayv2Mod.ApiGatewayV2Ns.GetDeploymentRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsApigatewayv2Mod.ApiGatewayV2Ns.GetDeploymentResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets a Deployment.
     */
  def getDeployment(
    params: awsDashSdkLib.clientsApigatewayv2Mod.ApiGatewayV2Ns.GetDeploymentRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsApigatewayv2Mod.ApiGatewayV2Ns.GetDeploymentResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsApigatewayv2Mod.ApiGatewayV2Ns.GetDeploymentResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets the Deployments for an API.
     */
  def getDeployments(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsApigatewayv2Mod.ApiGatewayV2Ns.GetDeploymentsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets the Deployments for an API.
     */
  def getDeployments(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsApigatewayv2Mod.ApiGatewayV2Ns.GetDeploymentsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsApigatewayv2Mod.ApiGatewayV2Ns.GetDeploymentsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets the Deployments for an API.
     */
  def getDeployments(params: awsDashSdkLib.clientsApigatewayv2Mod.ApiGatewayV2Ns.GetDeploymentsRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsApigatewayv2Mod.ApiGatewayV2Ns.GetDeploymentsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets the Deployments for an API.
     */
  def getDeployments(
    params: awsDashSdkLib.clientsApigatewayv2Mod.ApiGatewayV2Ns.GetDeploymentsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsApigatewayv2Mod.ApiGatewayV2Ns.GetDeploymentsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsApigatewayv2Mod.ApiGatewayV2Ns.GetDeploymentsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets a domain name.
     */
  def getDomainName(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsApigatewayv2Mod.ApiGatewayV2Ns.GetDomainNameResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets a domain name.
     */
  def getDomainName(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsApigatewayv2Mod.ApiGatewayV2Ns.GetDomainNameResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsApigatewayv2Mod.ApiGatewayV2Ns.GetDomainNameResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets a domain name.
     */
  def getDomainName(params: awsDashSdkLib.clientsApigatewayv2Mod.ApiGatewayV2Ns.GetDomainNameRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsApigatewayv2Mod.ApiGatewayV2Ns.GetDomainNameResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets a domain name.
     */
  def getDomainName(
    params: awsDashSdkLib.clientsApigatewayv2Mod.ApiGatewayV2Ns.GetDomainNameRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsApigatewayv2Mod.ApiGatewayV2Ns.GetDomainNameResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsApigatewayv2Mod.ApiGatewayV2Ns.GetDomainNameResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets the domain names for an AWS account.
     */
  def getDomainNames(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsApigatewayv2Mod.ApiGatewayV2Ns.GetDomainNamesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets the domain names for an AWS account.
     */
  def getDomainNames(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsApigatewayv2Mod.ApiGatewayV2Ns.GetDomainNamesResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsApigatewayv2Mod.ApiGatewayV2Ns.GetDomainNamesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets the domain names for an AWS account.
     */
  def getDomainNames(params: awsDashSdkLib.clientsApigatewayv2Mod.ApiGatewayV2Ns.GetDomainNamesRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsApigatewayv2Mod.ApiGatewayV2Ns.GetDomainNamesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets the domain names for an AWS account.
     */
  def getDomainNames(
    params: awsDashSdkLib.clientsApigatewayv2Mod.ApiGatewayV2Ns.GetDomainNamesRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsApigatewayv2Mod.ApiGatewayV2Ns.GetDomainNamesResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsApigatewayv2Mod.ApiGatewayV2Ns.GetDomainNamesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets an Integration.
     */
  def getIntegration(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsApigatewayv2Mod.ApiGatewayV2Ns.GetIntegrationResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets an Integration.
     */
  def getIntegration(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsApigatewayv2Mod.ApiGatewayV2Ns.GetIntegrationResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsApigatewayv2Mod.ApiGatewayV2Ns.GetIntegrationResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets an Integration.
     */
  def getIntegration(params: awsDashSdkLib.clientsApigatewayv2Mod.ApiGatewayV2Ns.GetIntegrationRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsApigatewayv2Mod.ApiGatewayV2Ns.GetIntegrationResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets an Integration.
     */
  def getIntegration(
    params: awsDashSdkLib.clientsApigatewayv2Mod.ApiGatewayV2Ns.GetIntegrationRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsApigatewayv2Mod.ApiGatewayV2Ns.GetIntegrationResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsApigatewayv2Mod.ApiGatewayV2Ns.GetIntegrationResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets an IntegrationResponses.
     */
  def getIntegrationResponse(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsApigatewayv2Mod.ApiGatewayV2Ns.GetIntegrationResponseResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets an IntegrationResponses.
     */
  def getIntegrationResponse(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsApigatewayv2Mod.ApiGatewayV2Ns.GetIntegrationResponseResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsApigatewayv2Mod.ApiGatewayV2Ns.GetIntegrationResponseResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets an IntegrationResponses.
     */
  def getIntegrationResponse(params: awsDashSdkLib.clientsApigatewayv2Mod.ApiGatewayV2Ns.GetIntegrationResponseRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsApigatewayv2Mod.ApiGatewayV2Ns.GetIntegrationResponseResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets an IntegrationResponses.
     */
  def getIntegrationResponse(
    params: awsDashSdkLib.clientsApigatewayv2Mod.ApiGatewayV2Ns.GetIntegrationResponseRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsApigatewayv2Mod.ApiGatewayV2Ns.GetIntegrationResponseResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsApigatewayv2Mod.ApiGatewayV2Ns.GetIntegrationResponseResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets the IntegrationResponses for an Integration.
     */
  def getIntegrationResponses(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsApigatewayv2Mod.ApiGatewayV2Ns.GetIntegrationResponsesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets the IntegrationResponses for an Integration.
     */
  def getIntegrationResponses(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsApigatewayv2Mod.ApiGatewayV2Ns.GetIntegrationResponsesResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsApigatewayv2Mod.ApiGatewayV2Ns.GetIntegrationResponsesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets the IntegrationResponses for an Integration.
     */
  def getIntegrationResponses(params: awsDashSdkLib.clientsApigatewayv2Mod.ApiGatewayV2Ns.GetIntegrationResponsesRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsApigatewayv2Mod.ApiGatewayV2Ns.GetIntegrationResponsesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets the IntegrationResponses for an Integration.
     */
  def getIntegrationResponses(
    params: awsDashSdkLib.clientsApigatewayv2Mod.ApiGatewayV2Ns.GetIntegrationResponsesRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsApigatewayv2Mod.ApiGatewayV2Ns.GetIntegrationResponsesResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsApigatewayv2Mod.ApiGatewayV2Ns.GetIntegrationResponsesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets the Integrations for an API.
     */
  def getIntegrations(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsApigatewayv2Mod.ApiGatewayV2Ns.GetIntegrationsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets the Integrations for an API.
     */
  def getIntegrations(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsApigatewayv2Mod.ApiGatewayV2Ns.GetIntegrationsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsApigatewayv2Mod.ApiGatewayV2Ns.GetIntegrationsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets the Integrations for an API.
     */
  def getIntegrations(params: awsDashSdkLib.clientsApigatewayv2Mod.ApiGatewayV2Ns.GetIntegrationsRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsApigatewayv2Mod.ApiGatewayV2Ns.GetIntegrationsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets the Integrations for an API.
     */
  def getIntegrations(
    params: awsDashSdkLib.clientsApigatewayv2Mod.ApiGatewayV2Ns.GetIntegrationsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsApigatewayv2Mod.ApiGatewayV2Ns.GetIntegrationsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsApigatewayv2Mod.ApiGatewayV2Ns.GetIntegrationsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets a Model.
     */
  def getModel(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsApigatewayv2Mod.ApiGatewayV2Ns.GetModelResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets a Model.
     */
  def getModel(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsApigatewayv2Mod.ApiGatewayV2Ns.GetModelResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsApigatewayv2Mod.ApiGatewayV2Ns.GetModelResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets a Model.
     */
  def getModel(params: awsDashSdkLib.clientsApigatewayv2Mod.ApiGatewayV2Ns.GetModelRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsApigatewayv2Mod.ApiGatewayV2Ns.GetModelResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets a Model.
     */
  def getModel(
    params: awsDashSdkLib.clientsApigatewayv2Mod.ApiGatewayV2Ns.GetModelRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsApigatewayv2Mod.ApiGatewayV2Ns.GetModelResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsApigatewayv2Mod.ApiGatewayV2Ns.GetModelResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets a model template.
     */
  def getModelTemplate(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsApigatewayv2Mod.ApiGatewayV2Ns.GetModelTemplateResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets a model template.
     */
  def getModelTemplate(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsApigatewayv2Mod.ApiGatewayV2Ns.GetModelTemplateResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsApigatewayv2Mod.ApiGatewayV2Ns.GetModelTemplateResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets a model template.
     */
  def getModelTemplate(params: awsDashSdkLib.clientsApigatewayv2Mod.ApiGatewayV2Ns.GetModelTemplateRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsApigatewayv2Mod.ApiGatewayV2Ns.GetModelTemplateResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets a model template.
     */
  def getModelTemplate(
    params: awsDashSdkLib.clientsApigatewayv2Mod.ApiGatewayV2Ns.GetModelTemplateRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsApigatewayv2Mod.ApiGatewayV2Ns.GetModelTemplateResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsApigatewayv2Mod.ApiGatewayV2Ns.GetModelTemplateResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets the Models for an API.
     */
  def getModels(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsApigatewayv2Mod.ApiGatewayV2Ns.GetModelsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets the Models for an API.
     */
  def getModels(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsApigatewayv2Mod.ApiGatewayV2Ns.GetModelsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsApigatewayv2Mod.ApiGatewayV2Ns.GetModelsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets the Models for an API.
     */
  def getModels(params: awsDashSdkLib.clientsApigatewayv2Mod.ApiGatewayV2Ns.GetModelsRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsApigatewayv2Mod.ApiGatewayV2Ns.GetModelsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets the Models for an API.
     */
  def getModels(
    params: awsDashSdkLib.clientsApigatewayv2Mod.ApiGatewayV2Ns.GetModelsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsApigatewayv2Mod.ApiGatewayV2Ns.GetModelsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsApigatewayv2Mod.ApiGatewayV2Ns.GetModelsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets a Route.
     */
  def getRoute(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsApigatewayv2Mod.ApiGatewayV2Ns.GetRouteResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets a Route.
     */
  def getRoute(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsApigatewayv2Mod.ApiGatewayV2Ns.GetRouteResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsApigatewayv2Mod.ApiGatewayV2Ns.GetRouteResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets a Route.
     */
  def getRoute(params: awsDashSdkLib.clientsApigatewayv2Mod.ApiGatewayV2Ns.GetRouteRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsApigatewayv2Mod.ApiGatewayV2Ns.GetRouteResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets a Route.
     */
  def getRoute(
    params: awsDashSdkLib.clientsApigatewayv2Mod.ApiGatewayV2Ns.GetRouteRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsApigatewayv2Mod.ApiGatewayV2Ns.GetRouteResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsApigatewayv2Mod.ApiGatewayV2Ns.GetRouteResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets a RouteResponse.
     */
  def getRouteResponse(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsApigatewayv2Mod.ApiGatewayV2Ns.GetRouteResponseResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets a RouteResponse.
     */
  def getRouteResponse(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsApigatewayv2Mod.ApiGatewayV2Ns.GetRouteResponseResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsApigatewayv2Mod.ApiGatewayV2Ns.GetRouteResponseResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets a RouteResponse.
     */
  def getRouteResponse(params: awsDashSdkLib.clientsApigatewayv2Mod.ApiGatewayV2Ns.GetRouteResponseRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsApigatewayv2Mod.ApiGatewayV2Ns.GetRouteResponseResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets a RouteResponse.
     */
  def getRouteResponse(
    params: awsDashSdkLib.clientsApigatewayv2Mod.ApiGatewayV2Ns.GetRouteResponseRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsApigatewayv2Mod.ApiGatewayV2Ns.GetRouteResponseResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsApigatewayv2Mod.ApiGatewayV2Ns.GetRouteResponseResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets the RouteResponses for a Route.
     */
  def getRouteResponses(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsApigatewayv2Mod.ApiGatewayV2Ns.GetRouteResponsesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets the RouteResponses for a Route.
     */
  def getRouteResponses(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsApigatewayv2Mod.ApiGatewayV2Ns.GetRouteResponsesResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsApigatewayv2Mod.ApiGatewayV2Ns.GetRouteResponsesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets the RouteResponses for a Route.
     */
  def getRouteResponses(params: awsDashSdkLib.clientsApigatewayv2Mod.ApiGatewayV2Ns.GetRouteResponsesRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsApigatewayv2Mod.ApiGatewayV2Ns.GetRouteResponsesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets the RouteResponses for a Route.
     */
  def getRouteResponses(
    params: awsDashSdkLib.clientsApigatewayv2Mod.ApiGatewayV2Ns.GetRouteResponsesRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsApigatewayv2Mod.ApiGatewayV2Ns.GetRouteResponsesResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsApigatewayv2Mod.ApiGatewayV2Ns.GetRouteResponsesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets the Routes for an API.
     */
  def getRoutes(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsApigatewayv2Mod.ApiGatewayV2Ns.GetRoutesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets the Routes for an API.
     */
  def getRoutes(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsApigatewayv2Mod.ApiGatewayV2Ns.GetRoutesResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsApigatewayv2Mod.ApiGatewayV2Ns.GetRoutesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets the Routes for an API.
     */
  def getRoutes(params: awsDashSdkLib.clientsApigatewayv2Mod.ApiGatewayV2Ns.GetRoutesRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsApigatewayv2Mod.ApiGatewayV2Ns.GetRoutesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets the Routes for an API.
     */
  def getRoutes(
    params: awsDashSdkLib.clientsApigatewayv2Mod.ApiGatewayV2Ns.GetRoutesRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsApigatewayv2Mod.ApiGatewayV2Ns.GetRoutesResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsApigatewayv2Mod.ApiGatewayV2Ns.GetRoutesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets a Stage.
     */
  def getStage(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsApigatewayv2Mod.ApiGatewayV2Ns.GetStageResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets a Stage.
     */
  def getStage(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsApigatewayv2Mod.ApiGatewayV2Ns.GetStageResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsApigatewayv2Mod.ApiGatewayV2Ns.GetStageResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets a Stage.
     */
  def getStage(params: awsDashSdkLib.clientsApigatewayv2Mod.ApiGatewayV2Ns.GetStageRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsApigatewayv2Mod.ApiGatewayV2Ns.GetStageResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets a Stage.
     */
  def getStage(
    params: awsDashSdkLib.clientsApigatewayv2Mod.ApiGatewayV2Ns.GetStageRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsApigatewayv2Mod.ApiGatewayV2Ns.GetStageResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsApigatewayv2Mod.ApiGatewayV2Ns.GetStageResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets the Stages for an API.
     */
  def getStages(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsApigatewayv2Mod.ApiGatewayV2Ns.GetStagesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets the Stages for an API.
     */
  def getStages(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsApigatewayv2Mod.ApiGatewayV2Ns.GetStagesResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsApigatewayv2Mod.ApiGatewayV2Ns.GetStagesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets the Stages for an API.
     */
  def getStages(params: awsDashSdkLib.clientsApigatewayv2Mod.ApiGatewayV2Ns.GetStagesRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsApigatewayv2Mod.ApiGatewayV2Ns.GetStagesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets the Stages for an API.
     */
  def getStages(
    params: awsDashSdkLib.clientsApigatewayv2Mod.ApiGatewayV2Ns.GetStagesRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsApigatewayv2Mod.ApiGatewayV2Ns.GetStagesResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsApigatewayv2Mod.ApiGatewayV2Ns.GetStagesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Updates an Api resource.
     */
  def updateApi(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsApigatewayv2Mod.ApiGatewayV2Ns.UpdateApiResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Updates an Api resource.
     */
  def updateApi(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsApigatewayv2Mod.ApiGatewayV2Ns.UpdateApiResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsApigatewayv2Mod.ApiGatewayV2Ns.UpdateApiResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Updates an Api resource.
     */
  def updateApi(params: awsDashSdkLib.clientsApigatewayv2Mod.ApiGatewayV2Ns.UpdateApiRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsApigatewayv2Mod.ApiGatewayV2Ns.UpdateApiResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Updates an Api resource.
     */
  def updateApi(
    params: awsDashSdkLib.clientsApigatewayv2Mod.ApiGatewayV2Ns.UpdateApiRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsApigatewayv2Mod.ApiGatewayV2Ns.UpdateApiResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsApigatewayv2Mod.ApiGatewayV2Ns.UpdateApiResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * The API mapping.
     */
  def updateApiMapping(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsApigatewayv2Mod.ApiGatewayV2Ns.UpdateApiMappingResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * The API mapping.
     */
  def updateApiMapping(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsApigatewayv2Mod.ApiGatewayV2Ns.UpdateApiMappingResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsApigatewayv2Mod.ApiGatewayV2Ns.UpdateApiMappingResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * The API mapping.
     */
  def updateApiMapping(params: awsDashSdkLib.clientsApigatewayv2Mod.ApiGatewayV2Ns.UpdateApiMappingRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsApigatewayv2Mod.ApiGatewayV2Ns.UpdateApiMappingResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * The API mapping.
     */
  def updateApiMapping(
    params: awsDashSdkLib.clientsApigatewayv2Mod.ApiGatewayV2Ns.UpdateApiMappingRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsApigatewayv2Mod.ApiGatewayV2Ns.UpdateApiMappingResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsApigatewayv2Mod.ApiGatewayV2Ns.UpdateApiMappingResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Updates an Authorizer.
     */
  def updateAuthorizer(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsApigatewayv2Mod.ApiGatewayV2Ns.UpdateAuthorizerResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Updates an Authorizer.
     */
  def updateAuthorizer(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsApigatewayv2Mod.ApiGatewayV2Ns.UpdateAuthorizerResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsApigatewayv2Mod.ApiGatewayV2Ns.UpdateAuthorizerResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Updates an Authorizer.
     */
  def updateAuthorizer(params: awsDashSdkLib.clientsApigatewayv2Mod.ApiGatewayV2Ns.UpdateAuthorizerRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsApigatewayv2Mod.ApiGatewayV2Ns.UpdateAuthorizerResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Updates an Authorizer.
     */
  def updateAuthorizer(
    params: awsDashSdkLib.clientsApigatewayv2Mod.ApiGatewayV2Ns.UpdateAuthorizerRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsApigatewayv2Mod.ApiGatewayV2Ns.UpdateAuthorizerResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsApigatewayv2Mod.ApiGatewayV2Ns.UpdateAuthorizerResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Updates a Deployment.
     */
  def updateDeployment(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsApigatewayv2Mod.ApiGatewayV2Ns.UpdateDeploymentResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Updates a Deployment.
     */
  def updateDeployment(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsApigatewayv2Mod.ApiGatewayV2Ns.UpdateDeploymentResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsApigatewayv2Mod.ApiGatewayV2Ns.UpdateDeploymentResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Updates a Deployment.
     */
  def updateDeployment(params: awsDashSdkLib.clientsApigatewayv2Mod.ApiGatewayV2Ns.UpdateDeploymentRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsApigatewayv2Mod.ApiGatewayV2Ns.UpdateDeploymentResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Updates a Deployment.
     */
  def updateDeployment(
    params: awsDashSdkLib.clientsApigatewayv2Mod.ApiGatewayV2Ns.UpdateDeploymentRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsApigatewayv2Mod.ApiGatewayV2Ns.UpdateDeploymentResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsApigatewayv2Mod.ApiGatewayV2Ns.UpdateDeploymentResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Updates a domain name.
     */
  def updateDomainName(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsApigatewayv2Mod.ApiGatewayV2Ns.UpdateDomainNameResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Updates a domain name.
     */
  def updateDomainName(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsApigatewayv2Mod.ApiGatewayV2Ns.UpdateDomainNameResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsApigatewayv2Mod.ApiGatewayV2Ns.UpdateDomainNameResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Updates a domain name.
     */
  def updateDomainName(params: awsDashSdkLib.clientsApigatewayv2Mod.ApiGatewayV2Ns.UpdateDomainNameRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsApigatewayv2Mod.ApiGatewayV2Ns.UpdateDomainNameResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Updates a domain name.
     */
  def updateDomainName(
    params: awsDashSdkLib.clientsApigatewayv2Mod.ApiGatewayV2Ns.UpdateDomainNameRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsApigatewayv2Mod.ApiGatewayV2Ns.UpdateDomainNameResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsApigatewayv2Mod.ApiGatewayV2Ns.UpdateDomainNameResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Updates an Integration.
     */
  def updateIntegration(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsApigatewayv2Mod.ApiGatewayV2Ns.UpdateIntegrationResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Updates an Integration.
     */
  def updateIntegration(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsApigatewayv2Mod.ApiGatewayV2Ns.UpdateIntegrationResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsApigatewayv2Mod.ApiGatewayV2Ns.UpdateIntegrationResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Updates an Integration.
     */
  def updateIntegration(params: awsDashSdkLib.clientsApigatewayv2Mod.ApiGatewayV2Ns.UpdateIntegrationRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsApigatewayv2Mod.ApiGatewayV2Ns.UpdateIntegrationResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Updates an Integration.
     */
  def updateIntegration(
    params: awsDashSdkLib.clientsApigatewayv2Mod.ApiGatewayV2Ns.UpdateIntegrationRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsApigatewayv2Mod.ApiGatewayV2Ns.UpdateIntegrationResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsApigatewayv2Mod.ApiGatewayV2Ns.UpdateIntegrationResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Updates an IntegrationResponses.
     */
  def updateIntegrationResponse(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsApigatewayv2Mod.ApiGatewayV2Ns.UpdateIntegrationResponseResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Updates an IntegrationResponses.
     */
  def updateIntegrationResponse(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsApigatewayv2Mod.ApiGatewayV2Ns.UpdateIntegrationResponseResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsApigatewayv2Mod.ApiGatewayV2Ns.UpdateIntegrationResponseResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Updates an IntegrationResponses.
     */
  def updateIntegrationResponse(params: awsDashSdkLib.clientsApigatewayv2Mod.ApiGatewayV2Ns.UpdateIntegrationResponseRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsApigatewayv2Mod.ApiGatewayV2Ns.UpdateIntegrationResponseResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Updates an IntegrationResponses.
     */
  def updateIntegrationResponse(
    params: awsDashSdkLib.clientsApigatewayv2Mod.ApiGatewayV2Ns.UpdateIntegrationResponseRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsApigatewayv2Mod.ApiGatewayV2Ns.UpdateIntegrationResponseResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsApigatewayv2Mod.ApiGatewayV2Ns.UpdateIntegrationResponseResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Updates a Model.
     */
  def updateModel(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsApigatewayv2Mod.ApiGatewayV2Ns.UpdateModelResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Updates a Model.
     */
  def updateModel(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsApigatewayv2Mod.ApiGatewayV2Ns.UpdateModelResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsApigatewayv2Mod.ApiGatewayV2Ns.UpdateModelResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Updates a Model.
     */
  def updateModel(params: awsDashSdkLib.clientsApigatewayv2Mod.ApiGatewayV2Ns.UpdateModelRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsApigatewayv2Mod.ApiGatewayV2Ns.UpdateModelResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Updates a Model.
     */
  def updateModel(
    params: awsDashSdkLib.clientsApigatewayv2Mod.ApiGatewayV2Ns.UpdateModelRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsApigatewayv2Mod.ApiGatewayV2Ns.UpdateModelResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsApigatewayv2Mod.ApiGatewayV2Ns.UpdateModelResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Updates a Route.
     */
  def updateRoute(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsApigatewayv2Mod.ApiGatewayV2Ns.UpdateRouteResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Updates a Route.
     */
  def updateRoute(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsApigatewayv2Mod.ApiGatewayV2Ns.UpdateRouteResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsApigatewayv2Mod.ApiGatewayV2Ns.UpdateRouteResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Updates a Route.
     */
  def updateRoute(params: awsDashSdkLib.clientsApigatewayv2Mod.ApiGatewayV2Ns.UpdateRouteRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsApigatewayv2Mod.ApiGatewayV2Ns.UpdateRouteResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Updates a Route.
     */
  def updateRoute(
    params: awsDashSdkLib.clientsApigatewayv2Mod.ApiGatewayV2Ns.UpdateRouteRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsApigatewayv2Mod.ApiGatewayV2Ns.UpdateRouteResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsApigatewayv2Mod.ApiGatewayV2Ns.UpdateRouteResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Updates a RouteResponse.
     */
  def updateRouteResponse(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsApigatewayv2Mod.ApiGatewayV2Ns.UpdateRouteResponseResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Updates a RouteResponse.
     */
  def updateRouteResponse(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsApigatewayv2Mod.ApiGatewayV2Ns.UpdateRouteResponseResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsApigatewayv2Mod.ApiGatewayV2Ns.UpdateRouteResponseResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Updates a RouteResponse.
     */
  def updateRouteResponse(params: awsDashSdkLib.clientsApigatewayv2Mod.ApiGatewayV2Ns.UpdateRouteResponseRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsApigatewayv2Mod.ApiGatewayV2Ns.UpdateRouteResponseResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Updates a RouteResponse.
     */
  def updateRouteResponse(
    params: awsDashSdkLib.clientsApigatewayv2Mod.ApiGatewayV2Ns.UpdateRouteResponseRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsApigatewayv2Mod.ApiGatewayV2Ns.UpdateRouteResponseResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsApigatewayv2Mod.ApiGatewayV2Ns.UpdateRouteResponseResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Updates a Stage.
     */
  def updateStage(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsApigatewayv2Mod.ApiGatewayV2Ns.UpdateStageResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Updates a Stage.
     */
  def updateStage(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsApigatewayv2Mod.ApiGatewayV2Ns.UpdateStageResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsApigatewayv2Mod.ApiGatewayV2Ns.UpdateStageResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Updates a Stage.
     */
  def updateStage(params: awsDashSdkLib.clientsApigatewayv2Mod.ApiGatewayV2Ns.UpdateStageRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsApigatewayv2Mod.ApiGatewayV2Ns.UpdateStageResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Updates a Stage.
     */
  def updateStage(
    params: awsDashSdkLib.clientsApigatewayv2Mod.ApiGatewayV2Ns.UpdateStageRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsApigatewayv2Mod.ApiGatewayV2Ns.UpdateStageResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsApigatewayv2Mod.ApiGatewayV2Ns.UpdateStageResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
}

