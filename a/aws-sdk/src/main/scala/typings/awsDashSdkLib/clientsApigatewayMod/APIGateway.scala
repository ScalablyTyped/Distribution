package typings
package awsDashSdkLib.clientsApigatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait APIGateway
  extends awsDashSdkLib.libServiceMod.Service {
  @JSName("config")
  var config_APIGateway: awsDashSdkLib.libConfigMod.ConfigBase with awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.ClientConfiguration = js.native
  /**
    * Create an ApiKey resource.  AWS CLI
    */
  def createApiKey(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.ApiKey, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def createApiKey(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.ApiKey, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.ApiKey, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Create an ApiKey resource.  AWS CLI
    */
  def createApiKey(params: awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.CreateApiKeyRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.ApiKey, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def createApiKey(
    params: awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.CreateApiKeyRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.ApiKey, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.ApiKey, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Adds a new Authorizer resource to an existing RestApi resource. AWS CLI
    */
  def createAuthorizer(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.Authorizer, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def createAuthorizer(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.Authorizer, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.Authorizer, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Adds a new Authorizer resource to an existing RestApi resource. AWS CLI
    */
  def createAuthorizer(params: awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.CreateAuthorizerRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.Authorizer, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def createAuthorizer(
    params: awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.CreateAuthorizerRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.Authorizer, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.Authorizer, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Creates a new BasePathMapping resource.
    */
  def createBasePathMapping(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.BasePathMapping, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def createBasePathMapping(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.BasePathMapping, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.BasePathMapping, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Creates a new BasePathMapping resource.
    */
  def createBasePathMapping(params: awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.CreateBasePathMappingRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.BasePathMapping, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def createBasePathMapping(
    params: awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.CreateBasePathMappingRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.BasePathMapping, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.BasePathMapping, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Creates a Deployment resource, which makes a specified RestApi callable over the internet.
    */
  def createDeployment(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.Deployment, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def createDeployment(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.Deployment, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.Deployment, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Creates a Deployment resource, which makes a specified RestApi callable over the internet.
    */
  def createDeployment(params: awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.CreateDeploymentRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.Deployment, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def createDeployment(
    params: awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.CreateDeploymentRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.Deployment, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.Deployment, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * 
    */
  def createDocumentationPart(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.DocumentationPart, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def createDocumentationPart(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.DocumentationPart, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.DocumentationPart, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * 
    */
  def createDocumentationPart(params: awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.CreateDocumentationPartRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.DocumentationPart, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def createDocumentationPart(
    params: awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.CreateDocumentationPartRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.DocumentationPart, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.DocumentationPart, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * 
    */
  def createDocumentationVersion(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.DocumentationVersion, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def createDocumentationVersion(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.DocumentationVersion, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.DocumentationVersion, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * 
    */
  def createDocumentationVersion(params: awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.CreateDocumentationVersionRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.DocumentationVersion, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def createDocumentationVersion(
    params: awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.CreateDocumentationVersionRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.DocumentationVersion, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.DocumentationVersion, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Creates a new domain name.
    */
  def createDomainName(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.DomainName, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def createDomainName(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.DomainName, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.DomainName, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Creates a new domain name.
    */
  def createDomainName(params: awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.CreateDomainNameRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.DomainName, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def createDomainName(
    params: awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.CreateDomainNameRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.DomainName, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.DomainName, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Adds a new Model resource to an existing RestApi resource.
    */
  def createModel(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.Model, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def createModel(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.Model, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.Model, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Adds a new Model resource to an existing RestApi resource.
    */
  def createModel(params: awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.CreateModelRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.Model, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def createModel(
    params: awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.CreateModelRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.Model, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.Model, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Creates a ReqeustValidator of a given RestApi.
    */
  def createRequestValidator(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.RequestValidator, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def createRequestValidator(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.RequestValidator, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.RequestValidator, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Creates a ReqeustValidator of a given RestApi.
    */
  def createRequestValidator(params: awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.CreateRequestValidatorRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.RequestValidator, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def createRequestValidator(
    params: awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.CreateRequestValidatorRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.RequestValidator, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.RequestValidator, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Creates a Resource resource.
    */
  def createResource(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.Resource, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def createResource(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.Resource, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.Resource, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Creates a Resource resource.
    */
  def createResource(params: awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.CreateResourceRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.Resource, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def createResource(
    params: awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.CreateResourceRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.Resource, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.Resource, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Creates a new RestApi resource.
    */
  def createRestApi(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.RestApi, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def createRestApi(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.RestApi, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.RestApi, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Creates a new RestApi resource.
    */
  def createRestApi(params: awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.CreateRestApiRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.RestApi, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def createRestApi(
    params: awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.CreateRestApiRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.RestApi, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.RestApi, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Creates a new Stage resource that references a pre-existing Deployment for the API. 
    */
  def createStage(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.Stage, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def createStage(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.Stage, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.Stage, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Creates a new Stage resource that references a pre-existing Deployment for the API. 
    */
  def createStage(params: awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.CreateStageRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.Stage, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def createStage(
    params: awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.CreateStageRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.Stage, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.Stage, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Creates a usage plan with the throttle and quota limits, as well as the associated API stages, specified in the payload. 
    */
  def createUsagePlan(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.UsagePlan, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def createUsagePlan(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.UsagePlan, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.UsagePlan, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Creates a usage plan with the throttle and quota limits, as well as the associated API stages, specified in the payload. 
    */
  def createUsagePlan(params: awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.CreateUsagePlanRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.UsagePlan, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def createUsagePlan(
    params: awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.CreateUsagePlanRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.UsagePlan, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.UsagePlan, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Creates a usage plan key for adding an existing API key to a usage plan.
    */
  def createUsagePlanKey(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.UsagePlanKey, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def createUsagePlanKey(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.UsagePlanKey, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.UsagePlanKey, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Creates a usage plan key for adding an existing API key to a usage plan.
    */
  def createUsagePlanKey(params: awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.CreateUsagePlanKeyRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.UsagePlanKey, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def createUsagePlanKey(
    params: awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.CreateUsagePlanKeyRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.UsagePlanKey, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.UsagePlanKey, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Creates a VPC link, under the caller's account in a selected region, in an asynchronous operation that typically takes 2-4 minutes to complete and become operational. The caller must have permissions to create and update VPC Endpoint services.
    */
  def createVpcLink(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.VpcLink, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def createVpcLink(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.VpcLink, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.VpcLink, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Creates a VPC link, under the caller's account in a selected region, in an asynchronous operation that typically takes 2-4 minutes to complete and become operational. The caller must have permissions to create and update VPC Endpoint services.
    */
  def createVpcLink(params: awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.CreateVpcLinkRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.VpcLink, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def createVpcLink(
    params: awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.CreateVpcLinkRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.VpcLink, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.VpcLink, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Deletes the ApiKey resource.
    */
  def deleteApiKey(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteApiKey(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes the ApiKey resource.
    */
  def deleteApiKey(params: awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.DeleteApiKeyRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteApiKey(
    params: awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.DeleteApiKeyRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes an existing Authorizer resource. AWS CLI
    */
  def deleteAuthorizer(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteAuthorizer(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes an existing Authorizer resource. AWS CLI
    */
  def deleteAuthorizer(params: awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.DeleteAuthorizerRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteAuthorizer(
    params: awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.DeleteAuthorizerRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes the BasePathMapping resource.
    */
  def deleteBasePathMapping(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteBasePathMapping(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes the BasePathMapping resource.
    */
  def deleteBasePathMapping(params: awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.DeleteBasePathMappingRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteBasePathMapping(
    params: awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.DeleteBasePathMappingRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes the ClientCertificate resource.
    */
  def deleteClientCertificate(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteClientCertificate(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes the ClientCertificate resource.
    */
  def deleteClientCertificate(params: awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.DeleteClientCertificateRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteClientCertificate(
    params: awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.DeleteClientCertificateRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes a Deployment resource. Deleting a deployment will only succeed if there are no Stage resources associated with it.
    */
  def deleteDeployment(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteDeployment(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes a Deployment resource. Deleting a deployment will only succeed if there are no Stage resources associated with it.
    */
  def deleteDeployment(params: awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.DeleteDeploymentRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteDeployment(
    params: awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.DeleteDeploymentRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * 
    */
  def deleteDocumentationPart(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteDocumentationPart(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * 
    */
  def deleteDocumentationPart(params: awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.DeleteDocumentationPartRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteDocumentationPart(
    params: awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.DeleteDocumentationPartRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * 
    */
  def deleteDocumentationVersion(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteDocumentationVersion(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * 
    */
  def deleteDocumentationVersion(params: awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.DeleteDocumentationVersionRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteDocumentationVersion(
    params: awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.DeleteDocumentationVersionRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes the DomainName resource.
    */
  def deleteDomainName(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteDomainName(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes the DomainName resource.
    */
  def deleteDomainName(params: awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.DeleteDomainNameRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteDomainName(
    params: awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.DeleteDomainNameRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Clears any customization of a GatewayResponse of a specified response type on the given RestApi and resets it with the default settings.
    */
  def deleteGatewayResponse(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteGatewayResponse(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Clears any customization of a GatewayResponse of a specified response type on the given RestApi and resets it with the default settings.
    */
  def deleteGatewayResponse(params: awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.DeleteGatewayResponseRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteGatewayResponse(
    params: awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.DeleteGatewayResponseRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Represents a delete integration.
    */
  def deleteIntegration(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteIntegration(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Represents a delete integration.
    */
  def deleteIntegration(params: awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.DeleteIntegrationRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteIntegration(
    params: awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.DeleteIntegrationRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Represents a delete integration response.
    */
  def deleteIntegrationResponse(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteIntegrationResponse(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Represents a delete integration response.
    */
  def deleteIntegrationResponse(params: awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.DeleteIntegrationResponseRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteIntegrationResponse(
    params: awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.DeleteIntegrationResponseRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes an existing Method resource.
    */
  def deleteMethod(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteMethod(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes an existing Method resource.
    */
  def deleteMethod(params: awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.DeleteMethodRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteMethod(
    params: awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.DeleteMethodRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes an existing MethodResponse resource.
    */
  def deleteMethodResponse(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteMethodResponse(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes an existing MethodResponse resource.
    */
  def deleteMethodResponse(params: awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.DeleteMethodResponseRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteMethodResponse(
    params: awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.DeleteMethodResponseRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes a model.
    */
  def deleteModel(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteModel(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes a model.
    */
  def deleteModel(params: awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.DeleteModelRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteModel(
    params: awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.DeleteModelRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes a RequestValidator of a given RestApi.
    */
  def deleteRequestValidator(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteRequestValidator(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes a RequestValidator of a given RestApi.
    */
  def deleteRequestValidator(params: awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.DeleteRequestValidatorRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteRequestValidator(
    params: awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.DeleteRequestValidatorRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes a Resource resource.
    */
  def deleteResource(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteResource(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes a Resource resource.
    */
  def deleteResource(params: awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.DeleteResourceRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteResource(
    params: awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.DeleteResourceRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes the specified API.
    */
  def deleteRestApi(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteRestApi(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes the specified API.
    */
  def deleteRestApi(params: awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.DeleteRestApiRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteRestApi(
    params: awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.DeleteRestApiRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes a Stage resource.
    */
  def deleteStage(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteStage(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes a Stage resource.
    */
  def deleteStage(params: awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.DeleteStageRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteStage(
    params: awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.DeleteStageRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes a usage plan of a given plan Id.
    */
  def deleteUsagePlan(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteUsagePlan(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes a usage plan of a given plan Id.
    */
  def deleteUsagePlan(params: awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.DeleteUsagePlanRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteUsagePlan(
    params: awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.DeleteUsagePlanRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes a usage plan key and remove the underlying API key from the associated usage plan.
    */
  def deleteUsagePlanKey(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteUsagePlanKey(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes a usage plan key and remove the underlying API key from the associated usage plan.
    */
  def deleteUsagePlanKey(params: awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.DeleteUsagePlanKeyRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteUsagePlanKey(
    params: awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.DeleteUsagePlanKeyRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes an existing VpcLink of a specified identifier.
    */
  def deleteVpcLink(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteVpcLink(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes an existing VpcLink of a specified identifier.
    */
  def deleteVpcLink(params: awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.DeleteVpcLinkRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteVpcLink(
    params: awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.DeleteVpcLinkRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Flushes all authorizer cache entries on a stage.
    */
  def flushStageAuthorizersCache(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def flushStageAuthorizersCache(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Flushes all authorizer cache entries on a stage.
    */
  def flushStageAuthorizersCache(params: awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.FlushStageAuthorizersCacheRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def flushStageAuthorizersCache(
    params: awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.FlushStageAuthorizersCacheRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Flushes a stage's cache.
    */
  def flushStageCache(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def flushStageCache(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Flushes a stage's cache.
    */
  def flushStageCache(params: awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.FlushStageCacheRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def flushStageCache(
    params: awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.FlushStageCacheRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Generates a ClientCertificate resource.
    */
  def generateClientCertificate(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.ClientCertificate, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def generateClientCertificate(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.ClientCertificate, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.ClientCertificate, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Generates a ClientCertificate resource.
    */
  def generateClientCertificate(params: awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.GenerateClientCertificateRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.ClientCertificate, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def generateClientCertificate(
    params: awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.GenerateClientCertificateRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.ClientCertificate, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.ClientCertificate, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Gets information about the current Account resource.
    */
  def getAccount(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.Account, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getAccount(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.Account, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.Account, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Gets information about the current Account resource.
    */
  def getAccount(params: awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.GetAccountRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.Account, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getAccount(
    params: awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.GetAccountRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.Account, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.Account, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Gets information about the current ApiKey resource.
    */
  def getApiKey(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.ApiKey, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getApiKey(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.ApiKey, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.ApiKey, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Gets information about the current ApiKey resource.
    */
  def getApiKey(params: awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.GetApiKeyRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.ApiKey, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getApiKey(
    params: awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.GetApiKeyRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.ApiKey, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.ApiKey, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Gets information about the current ApiKeys resource.
    */
  def getApiKeys(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.ApiKeys, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getApiKeys(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.ApiKeys, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.ApiKeys, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Gets information about the current ApiKeys resource.
    */
  def getApiKeys(params: awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.GetApiKeysRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.ApiKeys, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getApiKeys(
    params: awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.GetApiKeysRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.ApiKeys, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.ApiKeys, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Describe an existing Authorizer resource. AWS CLI
    */
  def getAuthorizer(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.Authorizer, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getAuthorizer(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.Authorizer, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.Authorizer, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Describe an existing Authorizer resource. AWS CLI
    */
  def getAuthorizer(params: awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.GetAuthorizerRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.Authorizer, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getAuthorizer(
    params: awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.GetAuthorizerRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.Authorizer, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.Authorizer, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Describe an existing Authorizers resource. AWS CLI
    */
  def getAuthorizers(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.Authorizers, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getAuthorizers(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.Authorizers, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.Authorizers, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Describe an existing Authorizers resource. AWS CLI
    */
  def getAuthorizers(params: awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.GetAuthorizersRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.Authorizers, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getAuthorizers(
    params: awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.GetAuthorizersRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.Authorizers, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.Authorizers, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Describe a BasePathMapping resource.
    */
  def getBasePathMapping(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.BasePathMapping, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getBasePathMapping(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.BasePathMapping, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.BasePathMapping, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Describe a BasePathMapping resource.
    */
  def getBasePathMapping(params: awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.GetBasePathMappingRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.BasePathMapping, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getBasePathMapping(
    params: awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.GetBasePathMappingRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.BasePathMapping, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.BasePathMapping, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Represents a collection of BasePathMapping resources.
    */
  def getBasePathMappings(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.BasePathMappings, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getBasePathMappings(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.BasePathMappings, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.BasePathMappings, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Represents a collection of BasePathMapping resources.
    */
  def getBasePathMappings(params: awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.GetBasePathMappingsRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.BasePathMappings, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getBasePathMappings(
    params: awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.GetBasePathMappingsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.BasePathMappings, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.BasePathMappings, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Gets information about the current ClientCertificate resource.
    */
  def getClientCertificate(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.ClientCertificate, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getClientCertificate(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.ClientCertificate, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.ClientCertificate, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Gets information about the current ClientCertificate resource.
    */
  def getClientCertificate(params: awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.GetClientCertificateRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.ClientCertificate, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getClientCertificate(
    params: awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.GetClientCertificateRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.ClientCertificate, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.ClientCertificate, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Gets a collection of ClientCertificate resources.
    */
  def getClientCertificates(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.ClientCertificates, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getClientCertificates(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.ClientCertificates, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.ClientCertificates, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Gets a collection of ClientCertificate resources.
    */
  def getClientCertificates(params: awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.GetClientCertificatesRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.ClientCertificates, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getClientCertificates(
    params: awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.GetClientCertificatesRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.ClientCertificates, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.ClientCertificates, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Gets information about a Deployment resource.
    */
  def getDeployment(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.Deployment, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getDeployment(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.Deployment, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.Deployment, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Gets information about a Deployment resource.
    */
  def getDeployment(params: awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.GetDeploymentRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.Deployment, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getDeployment(
    params: awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.GetDeploymentRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.Deployment, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.Deployment, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Gets information about a Deployments collection.
    */
  def getDeployments(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.Deployments, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getDeployments(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.Deployments, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.Deployments, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Gets information about a Deployments collection.
    */
  def getDeployments(params: awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.GetDeploymentsRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.Deployments, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getDeployments(
    params: awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.GetDeploymentsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.Deployments, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.Deployments, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * 
    */
  def getDocumentationPart(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.DocumentationPart, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getDocumentationPart(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.DocumentationPart, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.DocumentationPart, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * 
    */
  def getDocumentationPart(params: awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.GetDocumentationPartRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.DocumentationPart, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getDocumentationPart(
    params: awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.GetDocumentationPartRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.DocumentationPart, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.DocumentationPart, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * 
    */
  def getDocumentationParts(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.DocumentationParts, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getDocumentationParts(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.DocumentationParts, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.DocumentationParts, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * 
    */
  def getDocumentationParts(params: awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.GetDocumentationPartsRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.DocumentationParts, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getDocumentationParts(
    params: awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.GetDocumentationPartsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.DocumentationParts, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.DocumentationParts, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * 
    */
  def getDocumentationVersion(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.DocumentationVersion, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getDocumentationVersion(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.DocumentationVersion, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.DocumentationVersion, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * 
    */
  def getDocumentationVersion(params: awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.GetDocumentationVersionRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.DocumentationVersion, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getDocumentationVersion(
    params: awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.GetDocumentationVersionRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.DocumentationVersion, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.DocumentationVersion, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * 
    */
  def getDocumentationVersions(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.DocumentationVersions, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getDocumentationVersions(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.DocumentationVersions, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.DocumentationVersions, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * 
    */
  def getDocumentationVersions(params: awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.GetDocumentationVersionsRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.DocumentationVersions, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getDocumentationVersions(
    params: awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.GetDocumentationVersionsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.DocumentationVersions, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.DocumentationVersions, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Represents a domain name that is contained in a simpler, more intuitive URL that can be called.
    */
  def getDomainName(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.DomainName, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getDomainName(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.DomainName, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.DomainName, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Represents a domain name that is contained in a simpler, more intuitive URL that can be called.
    */
  def getDomainName(params: awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.GetDomainNameRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.DomainName, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getDomainName(
    params: awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.GetDomainNameRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.DomainName, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.DomainName, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Represents a collection of DomainName resources.
    */
  def getDomainNames(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.DomainNames, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getDomainNames(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.DomainNames, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.DomainNames, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Represents a collection of DomainName resources.
    */
  def getDomainNames(params: awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.GetDomainNamesRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.DomainNames, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getDomainNames(
    params: awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.GetDomainNamesRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.DomainNames, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.DomainNames, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Exports a deployed version of a RestApi in a specified format.
    */
  def getExport(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.ExportResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getExport(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.ExportResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.ExportResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Exports a deployed version of a RestApi in a specified format.
    */
  def getExport(params: awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.GetExportRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.ExportResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getExport(
    params: awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.GetExportRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.ExportResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.ExportResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Gets a GatewayResponse of a specified response type on the given RestApi.
    */
  def getGatewayResponse(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.GatewayResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getGatewayResponse(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.GatewayResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.GatewayResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Gets a GatewayResponse of a specified response type on the given RestApi.
    */
  def getGatewayResponse(params: awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.GetGatewayResponseRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.GatewayResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getGatewayResponse(
    params: awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.GetGatewayResponseRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.GatewayResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.GatewayResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Gets the GatewayResponses collection on the given RestApi. If an API developer has not added any definitions for gateway responses, the result will be the API Gateway-generated default GatewayResponses collection for the supported response types.
    */
  def getGatewayResponses(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.GatewayResponses, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getGatewayResponses(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.GatewayResponses, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.GatewayResponses, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Gets the GatewayResponses collection on the given RestApi. If an API developer has not added any definitions for gateway responses, the result will be the API Gateway-generated default GatewayResponses collection for the supported response types.
    */
  def getGatewayResponses(params: awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.GetGatewayResponsesRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.GatewayResponses, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getGatewayResponses(
    params: awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.GetGatewayResponsesRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.GatewayResponses, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.GatewayResponses, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Get the integration settings.
    */
  def getIntegration(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.Integration, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getIntegration(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.Integration, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.Integration, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Get the integration settings.
    */
  def getIntegration(params: awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.GetIntegrationRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.Integration, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getIntegration(
    params: awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.GetIntegrationRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.Integration, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.Integration, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Represents a get integration response.
    */
  def getIntegrationResponse(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.IntegrationResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getIntegrationResponse(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.IntegrationResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.IntegrationResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Represents a get integration response.
    */
  def getIntegrationResponse(params: awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.GetIntegrationResponseRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.IntegrationResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getIntegrationResponse(
    params: awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.GetIntegrationResponseRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.IntegrationResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.IntegrationResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Describe an existing Method resource.
    */
  def getMethod(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.Method, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getMethod(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.Method, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.Method, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Describe an existing Method resource.
    */
  def getMethod(params: awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.GetMethodRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.Method, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getMethod(
    params: awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.GetMethodRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.Method, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.Method, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Describes a MethodResponse resource.
    */
  def getMethodResponse(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.MethodResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getMethodResponse(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.MethodResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.MethodResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Describes a MethodResponse resource.
    */
  def getMethodResponse(params: awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.GetMethodResponseRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.MethodResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getMethodResponse(
    params: awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.GetMethodResponseRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.MethodResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.MethodResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Describes an existing model defined for a RestApi resource.
    */
  def getModel(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.Model, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getModel(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.Model, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.Model, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Describes an existing model defined for a RestApi resource.
    */
  def getModel(params: awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.GetModelRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.Model, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getModel(
    params: awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.GetModelRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.Model, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.Model, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Generates a sample mapping template that can be used to transform a payload into the structure of a model.
    */
  def getModelTemplate(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.Template, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getModelTemplate(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.Template, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.Template, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Generates a sample mapping template that can be used to transform a payload into the structure of a model.
    */
  def getModelTemplate(params: awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.GetModelTemplateRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.Template, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getModelTemplate(
    params: awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.GetModelTemplateRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.Template, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.Template, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Describes existing Models defined for a RestApi resource.
    */
  def getModels(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.Models, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getModels(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.Models, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.Models, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Describes existing Models defined for a RestApi resource.
    */
  def getModels(params: awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.GetModelsRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.Models, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getModels(
    params: awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.GetModelsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.Models, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.Models, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Gets a RequestValidator of a given RestApi.
    */
  def getRequestValidator(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.RequestValidator, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getRequestValidator(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.RequestValidator, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.RequestValidator, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Gets a RequestValidator of a given RestApi.
    */
  def getRequestValidator(params: awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.GetRequestValidatorRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.RequestValidator, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getRequestValidator(
    params: awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.GetRequestValidatorRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.RequestValidator, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.RequestValidator, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Gets the RequestValidators collection of a given RestApi.
    */
  def getRequestValidators(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.RequestValidators, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getRequestValidators(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.RequestValidators, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.RequestValidators, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Gets the RequestValidators collection of a given RestApi.
    */
  def getRequestValidators(params: awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.GetRequestValidatorsRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.RequestValidators, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getRequestValidators(
    params: awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.GetRequestValidatorsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.RequestValidators, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.RequestValidators, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Lists information about a resource.
    */
  def getResource(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.Resource, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getResource(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.Resource, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.Resource, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Lists information about a resource.
    */
  def getResource(params: awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.GetResourceRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.Resource, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getResource(
    params: awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.GetResourceRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.Resource, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.Resource, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Lists information about a collection of Resource resources.
    */
  def getResources(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.Resources, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getResources(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.Resources, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.Resources, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Lists information about a collection of Resource resources.
    */
  def getResources(params: awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.GetResourcesRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.Resources, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getResources(
    params: awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.GetResourcesRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.Resources, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.Resources, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Lists the RestApi resource in the collection.
    */
  def getRestApi(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.RestApi, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getRestApi(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.RestApi, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.RestApi, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Lists the RestApi resource in the collection.
    */
  def getRestApi(params: awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.GetRestApiRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.RestApi, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getRestApi(
    params: awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.GetRestApiRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.RestApi, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.RestApi, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Lists the RestApis resources for your collection.
    */
  def getRestApis(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.RestApis, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getRestApis(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.RestApis, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.RestApis, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Lists the RestApis resources for your collection.
    */
  def getRestApis(params: awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.GetRestApisRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.RestApis, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getRestApis(
    params: awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.GetRestApisRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.RestApis, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.RestApis, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Generates a client SDK for a RestApi and Stage.
    */
  def getSdk(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.SdkResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getSdk(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.SdkResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.SdkResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Generates a client SDK for a RestApi and Stage.
    */
  def getSdk(params: awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.GetSdkRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.SdkResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getSdk(
    params: awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.GetSdkRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.SdkResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.SdkResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * 
    */
  def getSdkType(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.SdkType, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getSdkType(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.SdkType, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.SdkType, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * 
    */
  def getSdkType(params: awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.GetSdkTypeRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.SdkType, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getSdkType(
    params: awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.GetSdkTypeRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.SdkType, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.SdkType, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * 
    */
  def getSdkTypes(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.SdkTypes, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getSdkTypes(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.SdkTypes, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.SdkTypes, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * 
    */
  def getSdkTypes(params: awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.GetSdkTypesRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.SdkTypes, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getSdkTypes(
    params: awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.GetSdkTypesRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.SdkTypes, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.SdkTypes, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Gets information about a Stage resource.
    */
  def getStage(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.Stage, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getStage(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.Stage, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.Stage, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Gets information about a Stage resource.
    */
  def getStage(params: awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.GetStageRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.Stage, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getStage(
    params: awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.GetStageRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.Stage, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.Stage, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Gets information about one or more Stage resources.
    */
  def getStages(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.Stages, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getStages(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.Stages, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.Stages, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Gets information about one or more Stage resources.
    */
  def getStages(params: awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.GetStagesRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.Stages, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getStages(
    params: awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.GetStagesRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.Stages, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.Stages, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Gets the Tags collection for a given resource.
    */
  def getTags(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.Tags, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getTags(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.Tags, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.Tags, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Gets the Tags collection for a given resource.
    */
  def getTags(params: awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.GetTagsRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.Tags, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getTags(
    params: awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.GetTagsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.Tags, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.Tags, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Gets the usage data of a usage plan in a specified time interval.
    */
  def getUsage(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.Usage, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getUsage(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.Usage, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.Usage, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Gets the usage data of a usage plan in a specified time interval.
    */
  def getUsage(params: awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.GetUsageRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.Usage, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getUsage(
    params: awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.GetUsageRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.Usage, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.Usage, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Gets a usage plan of a given plan identifier.
    */
  def getUsagePlan(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.UsagePlan, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getUsagePlan(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.UsagePlan, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.UsagePlan, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Gets a usage plan of a given plan identifier.
    */
  def getUsagePlan(params: awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.GetUsagePlanRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.UsagePlan, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getUsagePlan(
    params: awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.GetUsagePlanRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.UsagePlan, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.UsagePlan, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Gets a usage plan key of a given key identifier.
    */
  def getUsagePlanKey(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.UsagePlanKey, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getUsagePlanKey(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.UsagePlanKey, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.UsagePlanKey, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Gets a usage plan key of a given key identifier.
    */
  def getUsagePlanKey(params: awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.GetUsagePlanKeyRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.UsagePlanKey, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getUsagePlanKey(
    params: awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.GetUsagePlanKeyRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.UsagePlanKey, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.UsagePlanKey, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Gets all the usage plan keys representing the API keys added to a specified usage plan.
    */
  def getUsagePlanKeys(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.UsagePlanKeys, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getUsagePlanKeys(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.UsagePlanKeys, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.UsagePlanKeys, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Gets all the usage plan keys representing the API keys added to a specified usage plan.
    */
  def getUsagePlanKeys(params: awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.GetUsagePlanKeysRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.UsagePlanKeys, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getUsagePlanKeys(
    params: awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.GetUsagePlanKeysRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.UsagePlanKeys, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.UsagePlanKeys, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Gets all the usage plans of the caller's account.
    */
  def getUsagePlans(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.UsagePlans, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getUsagePlans(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.UsagePlans, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.UsagePlans, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Gets all the usage plans of the caller's account.
    */
  def getUsagePlans(params: awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.GetUsagePlansRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.UsagePlans, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getUsagePlans(
    params: awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.GetUsagePlansRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.UsagePlans, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.UsagePlans, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Gets a specified VPC link under the caller's account in a region.
    */
  def getVpcLink(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.VpcLink, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getVpcLink(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.VpcLink, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.VpcLink, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Gets a specified VPC link under the caller's account in a region.
    */
  def getVpcLink(params: awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.GetVpcLinkRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.VpcLink, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getVpcLink(
    params: awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.GetVpcLinkRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.VpcLink, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.VpcLink, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Gets the VpcLinks collection under the caller's account in a selected region.
    */
  def getVpcLinks(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.VpcLinks, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getVpcLinks(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.VpcLinks, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.VpcLinks, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Gets the VpcLinks collection under the caller's account in a selected region.
    */
  def getVpcLinks(params: awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.GetVpcLinksRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.VpcLinks, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getVpcLinks(
    params: awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.GetVpcLinksRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.VpcLinks, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.VpcLinks, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Import API keys from an external source, such as a CSV-formatted file.
    */
  def importApiKeys(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.ApiKeyIds, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def importApiKeys(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.ApiKeyIds, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.ApiKeyIds, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Import API keys from an external source, such as a CSV-formatted file.
    */
  def importApiKeys(params: awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.ImportApiKeysRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.ApiKeyIds, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def importApiKeys(
    params: awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.ImportApiKeysRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.ApiKeyIds, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.ApiKeyIds, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * 
    */
  def importDocumentationParts(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.DocumentationPartIds, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def importDocumentationParts(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.DocumentationPartIds, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.DocumentationPartIds, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * 
    */
  def importDocumentationParts(params: awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.ImportDocumentationPartsRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.DocumentationPartIds, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def importDocumentationParts(
    params: awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.ImportDocumentationPartsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.DocumentationPartIds, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.DocumentationPartIds, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * A feature of the API Gateway control service for creating a new API from an external API definition file.
    */
  def importRestApi(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.RestApi, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def importRestApi(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.RestApi, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.RestApi, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * A feature of the API Gateway control service for creating a new API from an external API definition file.
    */
  def importRestApi(params: awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.ImportRestApiRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.RestApi, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def importRestApi(
    params: awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.ImportRestApiRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.RestApi, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.RestApi, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Creates a customization of a GatewayResponse of a specified response type and status code on the given RestApi.
    */
  def putGatewayResponse(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.GatewayResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def putGatewayResponse(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.GatewayResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.GatewayResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Creates a customization of a GatewayResponse of a specified response type and status code on the given RestApi.
    */
  def putGatewayResponse(params: awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.PutGatewayResponseRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.GatewayResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def putGatewayResponse(
    params: awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.PutGatewayResponseRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.GatewayResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.GatewayResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Sets up a method's integration.
    */
  def putIntegration(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.Integration, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def putIntegration(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.Integration, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.Integration, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Sets up a method's integration.
    */
  def putIntegration(params: awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.PutIntegrationRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.Integration, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def putIntegration(
    params: awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.PutIntegrationRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.Integration, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.Integration, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Represents a put integration.
    */
  def putIntegrationResponse(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.IntegrationResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def putIntegrationResponse(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.IntegrationResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.IntegrationResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Represents a put integration.
    */
  def putIntegrationResponse(params: awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.PutIntegrationResponseRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.IntegrationResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def putIntegrationResponse(
    params: awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.PutIntegrationResponseRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.IntegrationResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.IntegrationResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Add a method to an existing Resource resource.
    */
  def putMethod(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.Method, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def putMethod(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.Method, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.Method, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Add a method to an existing Resource resource.
    */
  def putMethod(params: awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.PutMethodRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.Method, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def putMethod(
    params: awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.PutMethodRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.Method, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.Method, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Adds a MethodResponse to an existing Method resource.
    */
  def putMethodResponse(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.MethodResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def putMethodResponse(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.MethodResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.MethodResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Adds a MethodResponse to an existing Method resource.
    */
  def putMethodResponse(params: awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.PutMethodResponseRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.MethodResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def putMethodResponse(
    params: awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.PutMethodResponseRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.MethodResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.MethodResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * A feature of the API Gateway control service for updating an existing API with an input of external API definitions. The update can take the form of merging the supplied definition into the existing API or overwriting the existing API.
    */
  def putRestApi(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.RestApi, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def putRestApi(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.RestApi, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.RestApi, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * A feature of the API Gateway control service for updating an existing API with an input of external API definitions. The update can take the form of merging the supplied definition into the existing API or overwriting the existing API.
    */
  def putRestApi(params: awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.PutRestApiRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.RestApi, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def putRestApi(
    params: awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.PutRestApiRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.RestApi, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.RestApi, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Adds or updates a tag on a given resource.
    */
  def tagResource(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def tagResource(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Adds or updates a tag on a given resource.
    */
  def tagResource(params: awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.TagResourceRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def tagResource(
    params: awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.TagResourceRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Simulate the execution of an Authorizer in your RestApi with headers, parameters, and an incoming request body.  Enable custom authorizers 
    */
  def testInvokeAuthorizer(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.TestInvokeAuthorizerResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def testInvokeAuthorizer(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.TestInvokeAuthorizerResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.TestInvokeAuthorizerResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Simulate the execution of an Authorizer in your RestApi with headers, parameters, and an incoming request body.  Enable custom authorizers 
    */
  def testInvokeAuthorizer(params: awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.TestInvokeAuthorizerRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.TestInvokeAuthorizerResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def testInvokeAuthorizer(
    params: awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.TestInvokeAuthorizerRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.TestInvokeAuthorizerResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.TestInvokeAuthorizerResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Simulate the execution of a Method in your RestApi with headers, parameters, and an incoming request body.
    */
  def testInvokeMethod(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.TestInvokeMethodResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def testInvokeMethod(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.TestInvokeMethodResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.TestInvokeMethodResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Simulate the execution of a Method in your RestApi with headers, parameters, and an incoming request body.
    */
  def testInvokeMethod(params: awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.TestInvokeMethodRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.TestInvokeMethodResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def testInvokeMethod(
    params: awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.TestInvokeMethodRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.TestInvokeMethodResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.TestInvokeMethodResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Removes a tag from a given resource.
    */
  def untagResource(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def untagResource(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Removes a tag from a given resource.
    */
  def untagResource(params: awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.UntagResourceRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def untagResource(
    params: awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.UntagResourceRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Changes information about the current Account resource.
    */
  def updateAccount(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.Account, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def updateAccount(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.Account, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.Account, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Changes information about the current Account resource.
    */
  def updateAccount(params: awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.UpdateAccountRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.Account, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def updateAccount(
    params: awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.UpdateAccountRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.Account, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.Account, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Changes information about an ApiKey resource.
    */
  def updateApiKey(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.ApiKey, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def updateApiKey(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.ApiKey, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.ApiKey, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Changes information about an ApiKey resource.
    */
  def updateApiKey(params: awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.UpdateApiKeyRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.ApiKey, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def updateApiKey(
    params: awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.UpdateApiKeyRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.ApiKey, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.ApiKey, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Updates an existing Authorizer resource. AWS CLI
    */
  def updateAuthorizer(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.Authorizer, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def updateAuthorizer(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.Authorizer, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.Authorizer, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Updates an existing Authorizer resource. AWS CLI
    */
  def updateAuthorizer(params: awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.UpdateAuthorizerRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.Authorizer, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def updateAuthorizer(
    params: awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.UpdateAuthorizerRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.Authorizer, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.Authorizer, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Changes information about the BasePathMapping resource.
    */
  def updateBasePathMapping(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.BasePathMapping, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def updateBasePathMapping(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.BasePathMapping, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.BasePathMapping, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Changes information about the BasePathMapping resource.
    */
  def updateBasePathMapping(params: awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.UpdateBasePathMappingRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.BasePathMapping, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def updateBasePathMapping(
    params: awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.UpdateBasePathMappingRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.BasePathMapping, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.BasePathMapping, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Changes information about an ClientCertificate resource.
    */
  def updateClientCertificate(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.ClientCertificate, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def updateClientCertificate(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.ClientCertificate, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.ClientCertificate, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Changes information about an ClientCertificate resource.
    */
  def updateClientCertificate(params: awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.UpdateClientCertificateRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.ClientCertificate, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def updateClientCertificate(
    params: awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.UpdateClientCertificateRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.ClientCertificate, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.ClientCertificate, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Changes information about a Deployment resource.
    */
  def updateDeployment(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.Deployment, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def updateDeployment(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.Deployment, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.Deployment, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Changes information about a Deployment resource.
    */
  def updateDeployment(params: awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.UpdateDeploymentRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.Deployment, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def updateDeployment(
    params: awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.UpdateDeploymentRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.Deployment, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.Deployment, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * 
    */
  def updateDocumentationPart(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.DocumentationPart, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def updateDocumentationPart(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.DocumentationPart, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.DocumentationPart, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * 
    */
  def updateDocumentationPart(params: awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.UpdateDocumentationPartRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.DocumentationPart, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def updateDocumentationPart(
    params: awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.UpdateDocumentationPartRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.DocumentationPart, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.DocumentationPart, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * 
    */
  def updateDocumentationVersion(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.DocumentationVersion, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def updateDocumentationVersion(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.DocumentationVersion, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.DocumentationVersion, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * 
    */
  def updateDocumentationVersion(params: awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.UpdateDocumentationVersionRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.DocumentationVersion, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def updateDocumentationVersion(
    params: awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.UpdateDocumentationVersionRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.DocumentationVersion, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.DocumentationVersion, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Changes information about the DomainName resource.
    */
  def updateDomainName(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.DomainName, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def updateDomainName(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.DomainName, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.DomainName, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Changes information about the DomainName resource.
    */
  def updateDomainName(params: awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.UpdateDomainNameRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.DomainName, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def updateDomainName(
    params: awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.UpdateDomainNameRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.DomainName, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.DomainName, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Updates a GatewayResponse of a specified response type on the given RestApi.
    */
  def updateGatewayResponse(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.GatewayResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def updateGatewayResponse(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.GatewayResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.GatewayResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Updates a GatewayResponse of a specified response type on the given RestApi.
    */
  def updateGatewayResponse(params: awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.UpdateGatewayResponseRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.GatewayResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def updateGatewayResponse(
    params: awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.UpdateGatewayResponseRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.GatewayResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.GatewayResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Represents an update integration.
    */
  def updateIntegration(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.Integration, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def updateIntegration(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.Integration, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.Integration, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Represents an update integration.
    */
  def updateIntegration(params: awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.UpdateIntegrationRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.Integration, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def updateIntegration(
    params: awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.UpdateIntegrationRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.Integration, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.Integration, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Represents an update integration response.
    */
  def updateIntegrationResponse(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.IntegrationResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def updateIntegrationResponse(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.IntegrationResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.IntegrationResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Represents an update integration response.
    */
  def updateIntegrationResponse(params: awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.UpdateIntegrationResponseRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.IntegrationResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def updateIntegrationResponse(
    params: awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.UpdateIntegrationResponseRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.IntegrationResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.IntegrationResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Updates an existing Method resource.
    */
  def updateMethod(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.Method, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def updateMethod(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.Method, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.Method, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Updates an existing Method resource.
    */
  def updateMethod(params: awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.UpdateMethodRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.Method, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def updateMethod(
    params: awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.UpdateMethodRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.Method, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.Method, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Updates an existing MethodResponse resource.
    */
  def updateMethodResponse(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.MethodResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def updateMethodResponse(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.MethodResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.MethodResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Updates an existing MethodResponse resource.
    */
  def updateMethodResponse(params: awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.UpdateMethodResponseRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.MethodResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def updateMethodResponse(
    params: awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.UpdateMethodResponseRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.MethodResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.MethodResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Changes information about a model.
    */
  def updateModel(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.Model, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def updateModel(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.Model, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.Model, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Changes information about a model.
    */
  def updateModel(params: awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.UpdateModelRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.Model, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def updateModel(
    params: awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.UpdateModelRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.Model, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.Model, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Updates a RequestValidator of a given RestApi.
    */
  def updateRequestValidator(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.RequestValidator, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def updateRequestValidator(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.RequestValidator, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.RequestValidator, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Updates a RequestValidator of a given RestApi.
    */
  def updateRequestValidator(params: awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.UpdateRequestValidatorRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.RequestValidator, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def updateRequestValidator(
    params: awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.UpdateRequestValidatorRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.RequestValidator, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.RequestValidator, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Changes information about a Resource resource.
    */
  def updateResource(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.Resource, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def updateResource(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.Resource, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.Resource, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Changes information about a Resource resource.
    */
  def updateResource(params: awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.UpdateResourceRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.Resource, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def updateResource(
    params: awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.UpdateResourceRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.Resource, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.Resource, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Changes information about the specified API.
    */
  def updateRestApi(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.RestApi, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def updateRestApi(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.RestApi, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.RestApi, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Changes information about the specified API.
    */
  def updateRestApi(params: awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.UpdateRestApiRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.RestApi, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def updateRestApi(
    params: awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.UpdateRestApiRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.RestApi, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.RestApi, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Changes information about a Stage resource.
    */
  def updateStage(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.Stage, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def updateStage(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.Stage, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.Stage, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Changes information about a Stage resource.
    */
  def updateStage(params: awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.UpdateStageRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.Stage, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def updateStage(
    params: awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.UpdateStageRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.Stage, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.Stage, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Grants a temporary extension to the remaining quota of a usage plan associated with a specified API key.
    */
  def updateUsage(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.Usage, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def updateUsage(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.Usage, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.Usage, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Grants a temporary extension to the remaining quota of a usage plan associated with a specified API key.
    */
  def updateUsage(params: awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.UpdateUsageRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.Usage, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def updateUsage(
    params: awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.UpdateUsageRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.Usage, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.Usage, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Updates a usage plan of a given plan Id.
    */
  def updateUsagePlan(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.UsagePlan, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def updateUsagePlan(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.UsagePlan, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.UsagePlan, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Updates a usage plan of a given plan Id.
    */
  def updateUsagePlan(params: awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.UpdateUsagePlanRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.UsagePlan, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def updateUsagePlan(
    params: awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.UpdateUsagePlanRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.UsagePlan, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.UsagePlan, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Updates an existing VpcLink of a specified identifier.
    */
  def updateVpcLink(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.VpcLink, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def updateVpcLink(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.VpcLink, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.VpcLink, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Updates an existing VpcLink of a specified identifier.
    */
  def updateVpcLink(params: awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.UpdateVpcLinkRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.VpcLink, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def updateVpcLink(
    params: awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.UpdateVpcLinkRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.VpcLink, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsApigatewayMod.APIGatewayNs.VpcLink, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
}

