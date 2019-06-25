package typings
package awsDashSdkLib.clientsApigatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait APIGateway
  extends awsDashSdkLib.libServiceMod.Service {
  @JSName("config")
  var config_APIGateway: awsDashSdkLib.libConfigMod.ConfigBase with ClientConfiguration = js.native
  /**
    * Create an ApiKey resource.  AWS CLI
    */
  def createApiKey(): awsDashSdkLib.libRequestMod.Request[ApiKey, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createApiKey(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ ApiKey, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[ApiKey, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Create an ApiKey resource.  AWS CLI
    */
  def createApiKey(params: CreateApiKeyRequest): awsDashSdkLib.libRequestMod.Request[ApiKey, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createApiKey(
    params: CreateApiKeyRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ ApiKey, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[ApiKey, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Adds a new Authorizer resource to an existing RestApi resource. AWS CLI
    */
  def createAuthorizer(): awsDashSdkLib.libRequestMod.Request[Authorizer, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createAuthorizer(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ Authorizer, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[Authorizer, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Adds a new Authorizer resource to an existing RestApi resource. AWS CLI
    */
  def createAuthorizer(params: CreateAuthorizerRequest): awsDashSdkLib.libRequestMod.Request[Authorizer, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createAuthorizer(
    params: CreateAuthorizerRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ Authorizer, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[Authorizer, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates a new BasePathMapping resource.
    */
  def createBasePathMapping(): awsDashSdkLib.libRequestMod.Request[BasePathMapping, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createBasePathMapping(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ BasePathMapping, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[BasePathMapping, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates a new BasePathMapping resource.
    */
  def createBasePathMapping(params: CreateBasePathMappingRequest): awsDashSdkLib.libRequestMod.Request[BasePathMapping, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createBasePathMapping(
    params: CreateBasePathMappingRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ BasePathMapping, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[BasePathMapping, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates a Deployment resource, which makes a specified RestApi callable over the internet.
    */
  def createDeployment(): awsDashSdkLib.libRequestMod.Request[Deployment, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createDeployment(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ Deployment, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[Deployment, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates a Deployment resource, which makes a specified RestApi callable over the internet.
    */
  def createDeployment(params: CreateDeploymentRequest): awsDashSdkLib.libRequestMod.Request[Deployment, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createDeployment(
    params: CreateDeploymentRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ Deployment, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[Deployment, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * 
    */
  def createDocumentationPart(): awsDashSdkLib.libRequestMod.Request[DocumentationPart, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createDocumentationPart(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DocumentationPart, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DocumentationPart, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * 
    */
  def createDocumentationPart(params: CreateDocumentationPartRequest): awsDashSdkLib.libRequestMod.Request[DocumentationPart, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createDocumentationPart(
    params: CreateDocumentationPartRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DocumentationPart, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DocumentationPart, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * 
    */
  def createDocumentationVersion(): awsDashSdkLib.libRequestMod.Request[DocumentationVersion, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createDocumentationVersion(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DocumentationVersion, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DocumentationVersion, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * 
    */
  def createDocumentationVersion(params: CreateDocumentationVersionRequest): awsDashSdkLib.libRequestMod.Request[DocumentationVersion, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createDocumentationVersion(
    params: CreateDocumentationVersionRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DocumentationVersion, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DocumentationVersion, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates a new domain name.
    */
  def createDomainName(): awsDashSdkLib.libRequestMod.Request[DomainName, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createDomainName(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ DomainName, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[DomainName, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates a new domain name.
    */
  def createDomainName(params: CreateDomainNameRequest): awsDashSdkLib.libRequestMod.Request[DomainName, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createDomainName(
    params: CreateDomainNameRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ DomainName, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[DomainName, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Adds a new Model resource to an existing RestApi resource.
    */
  def createModel(): awsDashSdkLib.libRequestMod.Request[Model, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createModel(callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ Model, scala.Unit]): awsDashSdkLib.libRequestMod.Request[Model, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Adds a new Model resource to an existing RestApi resource.
    */
  def createModel(params: CreateModelRequest): awsDashSdkLib.libRequestMod.Request[Model, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createModel(
    params: CreateModelRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ Model, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[Model, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates a ReqeustValidator of a given RestApi.
    */
  def createRequestValidator(): awsDashSdkLib.libRequestMod.Request[RequestValidator, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createRequestValidator(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ RequestValidator, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[RequestValidator, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates a ReqeustValidator of a given RestApi.
    */
  def createRequestValidator(params: CreateRequestValidatorRequest): awsDashSdkLib.libRequestMod.Request[RequestValidator, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createRequestValidator(
    params: CreateRequestValidatorRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ RequestValidator, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[RequestValidator, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates a Resource resource.
    */
  def createResource(): awsDashSdkLib.libRequestMod.Request[Resource, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createResource(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ Resource, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[Resource, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates a Resource resource.
    */
  def createResource(params: CreateResourceRequest): awsDashSdkLib.libRequestMod.Request[Resource, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createResource(
    params: CreateResourceRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ Resource, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[Resource, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates a new RestApi resource.
    */
  def createRestApi(): awsDashSdkLib.libRequestMod.Request[RestApi, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createRestApi(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ RestApi, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[RestApi, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates a new RestApi resource.
    */
  def createRestApi(params: CreateRestApiRequest): awsDashSdkLib.libRequestMod.Request[RestApi, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createRestApi(
    params: CreateRestApiRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ RestApi, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[RestApi, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates a new Stage resource that references a pre-existing Deployment for the API. 
    */
  def createStage(): awsDashSdkLib.libRequestMod.Request[Stage, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createStage(callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ Stage, scala.Unit]): awsDashSdkLib.libRequestMod.Request[Stage, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates a new Stage resource that references a pre-existing Deployment for the API. 
    */
  def createStage(params: CreateStageRequest): awsDashSdkLib.libRequestMod.Request[Stage, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createStage(
    params: CreateStageRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ Stage, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[Stage, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates a usage plan with the throttle and quota limits, as well as the associated API stages, specified in the payload. 
    */
  def createUsagePlan(): awsDashSdkLib.libRequestMod.Request[UsagePlan, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createUsagePlan(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ UsagePlan, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[UsagePlan, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates a usage plan with the throttle and quota limits, as well as the associated API stages, specified in the payload. 
    */
  def createUsagePlan(params: CreateUsagePlanRequest): awsDashSdkLib.libRequestMod.Request[UsagePlan, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createUsagePlan(
    params: CreateUsagePlanRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ UsagePlan, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[UsagePlan, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates a usage plan key for adding an existing API key to a usage plan.
    */
  def createUsagePlanKey(): awsDashSdkLib.libRequestMod.Request[UsagePlanKey, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createUsagePlanKey(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ UsagePlanKey, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[UsagePlanKey, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates a usage plan key for adding an existing API key to a usage plan.
    */
  def createUsagePlanKey(params: CreateUsagePlanKeyRequest): awsDashSdkLib.libRequestMod.Request[UsagePlanKey, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createUsagePlanKey(
    params: CreateUsagePlanKeyRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ UsagePlanKey, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[UsagePlanKey, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates a VPC link, under the caller's account in a selected region, in an asynchronous operation that typically takes 2-4 minutes to complete and become operational. The caller must have permissions to create and update VPC Endpoint services.
    */
  def createVpcLink(): awsDashSdkLib.libRequestMod.Request[VpcLink, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createVpcLink(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ VpcLink, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[VpcLink, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates a VPC link, under the caller's account in a selected region, in an asynchronous operation that typically takes 2-4 minutes to complete and become operational. The caller must have permissions to create and update VPC Endpoint services.
    */
  def createVpcLink(params: CreateVpcLinkRequest): awsDashSdkLib.libRequestMod.Request[VpcLink, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createVpcLink(
    params: CreateVpcLinkRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ VpcLink, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[VpcLink, awsDashSdkLib.libErrorMod.AWSError] = js.native
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
  def deleteApiKey(params: DeleteApiKeyRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteApiKey(
    params: DeleteApiKeyRequest,
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
  def deleteAuthorizer(params: DeleteAuthorizerRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteAuthorizer(
    params: DeleteAuthorizerRequest,
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
  def deleteBasePathMapping(params: DeleteBasePathMappingRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteBasePathMapping(
    params: DeleteBasePathMappingRequest,
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
  def deleteClientCertificate(params: DeleteClientCertificateRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteClientCertificate(
    params: DeleteClientCertificateRequest,
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
  def deleteDeployment(params: DeleteDeploymentRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteDeployment(
    params: DeleteDeploymentRequest,
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
  def deleteDocumentationPart(params: DeleteDocumentationPartRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteDocumentationPart(
    params: DeleteDocumentationPartRequest,
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
  def deleteDocumentationVersion(params: DeleteDocumentationVersionRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteDocumentationVersion(
    params: DeleteDocumentationVersionRequest,
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
  def deleteDomainName(params: DeleteDomainNameRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteDomainName(
    params: DeleteDomainNameRequest,
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
  def deleteGatewayResponse(params: DeleteGatewayResponseRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteGatewayResponse(
    params: DeleteGatewayResponseRequest,
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
  def deleteIntegration(params: DeleteIntegrationRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteIntegration(
    params: DeleteIntegrationRequest,
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
  def deleteIntegrationResponse(params: DeleteIntegrationResponseRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteIntegrationResponse(
    params: DeleteIntegrationResponseRequest,
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
  def deleteMethod(params: DeleteMethodRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteMethod(
    params: DeleteMethodRequest,
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
  def deleteMethodResponse(params: DeleteMethodResponseRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteMethodResponse(
    params: DeleteMethodResponseRequest,
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
  def deleteModel(params: DeleteModelRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteModel(
    params: DeleteModelRequest,
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
  def deleteRequestValidator(params: DeleteRequestValidatorRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteRequestValidator(
    params: DeleteRequestValidatorRequest,
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
  def deleteResource(params: DeleteResourceRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteResource(
    params: DeleteResourceRequest,
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
  def deleteRestApi(params: DeleteRestApiRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteRestApi(
    params: DeleteRestApiRequest,
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
  def deleteStage(params: DeleteStageRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteStage(
    params: DeleteStageRequest,
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
  def deleteUsagePlan(params: DeleteUsagePlanRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteUsagePlan(
    params: DeleteUsagePlanRequest,
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
  def deleteUsagePlanKey(params: DeleteUsagePlanKeyRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteUsagePlanKey(
    params: DeleteUsagePlanKeyRequest,
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
  def deleteVpcLink(params: DeleteVpcLinkRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteVpcLink(
    params: DeleteVpcLinkRequest,
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
  def flushStageAuthorizersCache(params: FlushStageAuthorizersCacheRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def flushStageAuthorizersCache(
    params: FlushStageAuthorizersCacheRequest,
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
  def flushStageCache(params: FlushStageCacheRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def flushStageCache(
    params: FlushStageCacheRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Generates a ClientCertificate resource.
    */
  def generateClientCertificate(): awsDashSdkLib.libRequestMod.Request[ClientCertificate, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def generateClientCertificate(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ClientCertificate, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ClientCertificate, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Generates a ClientCertificate resource.
    */
  def generateClientCertificate(params: GenerateClientCertificateRequest): awsDashSdkLib.libRequestMod.Request[ClientCertificate, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def generateClientCertificate(
    params: GenerateClientCertificateRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ClientCertificate, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ClientCertificate, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Gets information about the current Account resource.
    */
  def getAccount(): awsDashSdkLib.libRequestMod.Request[Account, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getAccount(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ Account, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[Account, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Gets information about the current Account resource.
    */
  def getAccount(params: GetAccountRequest): awsDashSdkLib.libRequestMod.Request[Account, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getAccount(
    params: GetAccountRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ Account, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[Account, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Gets information about the current ApiKey resource.
    */
  def getApiKey(): awsDashSdkLib.libRequestMod.Request[ApiKey, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getApiKey(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ ApiKey, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[ApiKey, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Gets information about the current ApiKey resource.
    */
  def getApiKey(params: GetApiKeyRequest): awsDashSdkLib.libRequestMod.Request[ApiKey, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getApiKey(
    params: GetApiKeyRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ ApiKey, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[ApiKey, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Gets information about the current ApiKeys resource.
    */
  def getApiKeys(): awsDashSdkLib.libRequestMod.Request[ApiKeys, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getApiKeys(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ ApiKeys, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[ApiKeys, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Gets information about the current ApiKeys resource.
    */
  def getApiKeys(params: GetApiKeysRequest): awsDashSdkLib.libRequestMod.Request[ApiKeys, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getApiKeys(
    params: GetApiKeysRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ ApiKeys, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[ApiKeys, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Describe an existing Authorizer resource. AWS CLI
    */
  def getAuthorizer(): awsDashSdkLib.libRequestMod.Request[Authorizer, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getAuthorizer(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ Authorizer, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[Authorizer, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Describe an existing Authorizer resource. AWS CLI
    */
  def getAuthorizer(params: GetAuthorizerRequest): awsDashSdkLib.libRequestMod.Request[Authorizer, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getAuthorizer(
    params: GetAuthorizerRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ Authorizer, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[Authorizer, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Describe an existing Authorizers resource. AWS CLI
    */
  def getAuthorizers(): awsDashSdkLib.libRequestMod.Request[Authorizers, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getAuthorizers(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ Authorizers, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[Authorizers, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Describe an existing Authorizers resource. AWS CLI
    */
  def getAuthorizers(params: GetAuthorizersRequest): awsDashSdkLib.libRequestMod.Request[Authorizers, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getAuthorizers(
    params: GetAuthorizersRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ Authorizers, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[Authorizers, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Describe a BasePathMapping resource.
    */
  def getBasePathMapping(): awsDashSdkLib.libRequestMod.Request[BasePathMapping, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getBasePathMapping(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ BasePathMapping, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[BasePathMapping, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Describe a BasePathMapping resource.
    */
  def getBasePathMapping(params: GetBasePathMappingRequest): awsDashSdkLib.libRequestMod.Request[BasePathMapping, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getBasePathMapping(
    params: GetBasePathMappingRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ BasePathMapping, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[BasePathMapping, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Represents a collection of BasePathMapping resources.
    */
  def getBasePathMappings(): awsDashSdkLib.libRequestMod.Request[BasePathMappings, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getBasePathMappings(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ BasePathMappings, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[BasePathMappings, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Represents a collection of BasePathMapping resources.
    */
  def getBasePathMappings(params: GetBasePathMappingsRequest): awsDashSdkLib.libRequestMod.Request[BasePathMappings, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getBasePathMappings(
    params: GetBasePathMappingsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ BasePathMappings, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[BasePathMappings, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Gets information about the current ClientCertificate resource.
    */
  def getClientCertificate(): awsDashSdkLib.libRequestMod.Request[ClientCertificate, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getClientCertificate(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ClientCertificate, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ClientCertificate, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Gets information about the current ClientCertificate resource.
    */
  def getClientCertificate(params: GetClientCertificateRequest): awsDashSdkLib.libRequestMod.Request[ClientCertificate, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getClientCertificate(
    params: GetClientCertificateRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ClientCertificate, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ClientCertificate, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Gets a collection of ClientCertificate resources.
    */
  def getClientCertificates(): awsDashSdkLib.libRequestMod.Request[ClientCertificates, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getClientCertificates(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ClientCertificates, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ClientCertificates, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Gets a collection of ClientCertificate resources.
    */
  def getClientCertificates(params: GetClientCertificatesRequest): awsDashSdkLib.libRequestMod.Request[ClientCertificates, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getClientCertificates(
    params: GetClientCertificatesRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ClientCertificates, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ClientCertificates, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Gets information about a Deployment resource.
    */
  def getDeployment(): awsDashSdkLib.libRequestMod.Request[Deployment, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getDeployment(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ Deployment, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[Deployment, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Gets information about a Deployment resource.
    */
  def getDeployment(params: GetDeploymentRequest): awsDashSdkLib.libRequestMod.Request[Deployment, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getDeployment(
    params: GetDeploymentRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ Deployment, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[Deployment, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Gets information about a Deployments collection.
    */
  def getDeployments(): awsDashSdkLib.libRequestMod.Request[Deployments, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getDeployments(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ Deployments, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[Deployments, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Gets information about a Deployments collection.
    */
  def getDeployments(params: GetDeploymentsRequest): awsDashSdkLib.libRequestMod.Request[Deployments, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getDeployments(
    params: GetDeploymentsRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ Deployments, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[Deployments, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * 
    */
  def getDocumentationPart(): awsDashSdkLib.libRequestMod.Request[DocumentationPart, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getDocumentationPart(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DocumentationPart, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DocumentationPart, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * 
    */
  def getDocumentationPart(params: GetDocumentationPartRequest): awsDashSdkLib.libRequestMod.Request[DocumentationPart, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getDocumentationPart(
    params: GetDocumentationPartRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DocumentationPart, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DocumentationPart, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * 
    */
  def getDocumentationParts(): awsDashSdkLib.libRequestMod.Request[DocumentationParts, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getDocumentationParts(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DocumentationParts, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DocumentationParts, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * 
    */
  def getDocumentationParts(params: GetDocumentationPartsRequest): awsDashSdkLib.libRequestMod.Request[DocumentationParts, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getDocumentationParts(
    params: GetDocumentationPartsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DocumentationParts, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DocumentationParts, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * 
    */
  def getDocumentationVersion(): awsDashSdkLib.libRequestMod.Request[DocumentationVersion, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getDocumentationVersion(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DocumentationVersion, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DocumentationVersion, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * 
    */
  def getDocumentationVersion(params: GetDocumentationVersionRequest): awsDashSdkLib.libRequestMod.Request[DocumentationVersion, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getDocumentationVersion(
    params: GetDocumentationVersionRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DocumentationVersion, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DocumentationVersion, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * 
    */
  def getDocumentationVersions(): awsDashSdkLib.libRequestMod.Request[DocumentationVersions, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getDocumentationVersions(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DocumentationVersions, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DocumentationVersions, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * 
    */
  def getDocumentationVersions(params: GetDocumentationVersionsRequest): awsDashSdkLib.libRequestMod.Request[DocumentationVersions, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getDocumentationVersions(
    params: GetDocumentationVersionsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DocumentationVersions, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DocumentationVersions, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Represents a domain name that is contained in a simpler, more intuitive URL that can be called.
    */
  def getDomainName(): awsDashSdkLib.libRequestMod.Request[DomainName, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getDomainName(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ DomainName, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[DomainName, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Represents a domain name that is contained in a simpler, more intuitive URL that can be called.
    */
  def getDomainName(params: GetDomainNameRequest): awsDashSdkLib.libRequestMod.Request[DomainName, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getDomainName(
    params: GetDomainNameRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ DomainName, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[DomainName, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Represents a collection of DomainName resources.
    */
  def getDomainNames(): awsDashSdkLib.libRequestMod.Request[DomainNames, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getDomainNames(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ DomainNames, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[DomainNames, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Represents a collection of DomainName resources.
    */
  def getDomainNames(params: GetDomainNamesRequest): awsDashSdkLib.libRequestMod.Request[DomainNames, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getDomainNames(
    params: GetDomainNamesRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ DomainNames, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[DomainNames, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Exports a deployed version of a RestApi in a specified format.
    */
  def getExport(): awsDashSdkLib.libRequestMod.Request[ExportResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getExport(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ ExportResponse, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[ExportResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Exports a deployed version of a RestApi in a specified format.
    */
  def getExport(params: GetExportRequest): awsDashSdkLib.libRequestMod.Request[ExportResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getExport(
    params: GetExportRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ ExportResponse, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[ExportResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Gets a GatewayResponse of a specified response type on the given RestApi.
    */
  def getGatewayResponse(): awsDashSdkLib.libRequestMod.Request[GatewayResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getGatewayResponse(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ GatewayResponse, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[GatewayResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Gets a GatewayResponse of a specified response type on the given RestApi.
    */
  def getGatewayResponse(params: GetGatewayResponseRequest): awsDashSdkLib.libRequestMod.Request[GatewayResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getGatewayResponse(
    params: GetGatewayResponseRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ GatewayResponse, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[GatewayResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Gets the GatewayResponses collection on the given RestApi. If an API developer has not added any definitions for gateway responses, the result will be the API Gateway-generated default GatewayResponses collection for the supported response types.
    */
  def getGatewayResponses(): awsDashSdkLib.libRequestMod.Request[GatewayResponses, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getGatewayResponses(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GatewayResponses, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GatewayResponses, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Gets the GatewayResponses collection on the given RestApi. If an API developer has not added any definitions for gateway responses, the result will be the API Gateway-generated default GatewayResponses collection for the supported response types.
    */
  def getGatewayResponses(params: GetGatewayResponsesRequest): awsDashSdkLib.libRequestMod.Request[GatewayResponses, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getGatewayResponses(
    params: GetGatewayResponsesRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GatewayResponses, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GatewayResponses, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Get the integration settings.
    */
  def getIntegration(): awsDashSdkLib.libRequestMod.Request[Integration, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getIntegration(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ Integration, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[Integration, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Get the integration settings.
    */
  def getIntegration(params: GetIntegrationRequest): awsDashSdkLib.libRequestMod.Request[Integration, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getIntegration(
    params: GetIntegrationRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ Integration, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[Integration, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Represents a get integration response.
    */
  def getIntegrationResponse(): awsDashSdkLib.libRequestMod.Request[IntegrationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getIntegrationResponse(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ IntegrationResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[IntegrationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Represents a get integration response.
    */
  def getIntegrationResponse(params: GetIntegrationResponseRequest): awsDashSdkLib.libRequestMod.Request[IntegrationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getIntegrationResponse(
    params: GetIntegrationResponseRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ IntegrationResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[IntegrationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Describe an existing Method resource.
    */
  def getMethod(): awsDashSdkLib.libRequestMod.Request[Method, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getMethod(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ Method, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[Method, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Describe an existing Method resource.
    */
  def getMethod(params: GetMethodRequest): awsDashSdkLib.libRequestMod.Request[Method, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getMethod(
    params: GetMethodRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ Method, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[Method, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Describes a MethodResponse resource.
    */
  def getMethodResponse(): awsDashSdkLib.libRequestMod.Request[MethodResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getMethodResponse(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ MethodResponse, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[MethodResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Describes a MethodResponse resource.
    */
  def getMethodResponse(params: GetMethodResponseRequest): awsDashSdkLib.libRequestMod.Request[MethodResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getMethodResponse(
    params: GetMethodResponseRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ MethodResponse, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[MethodResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Describes an existing model defined for a RestApi resource.
    */
  def getModel(): awsDashSdkLib.libRequestMod.Request[Model, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getModel(callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ Model, scala.Unit]): awsDashSdkLib.libRequestMod.Request[Model, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Describes an existing model defined for a RestApi resource.
    */
  def getModel(params: GetModelRequest): awsDashSdkLib.libRequestMod.Request[Model, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getModel(
    params: GetModelRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ Model, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[Model, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Generates a sample mapping template that can be used to transform a payload into the structure of a model.
    */
  def getModelTemplate(): awsDashSdkLib.libRequestMod.Request[Template, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getModelTemplate(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ Template, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[Template, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Generates a sample mapping template that can be used to transform a payload into the structure of a model.
    */
  def getModelTemplate(params: GetModelTemplateRequest): awsDashSdkLib.libRequestMod.Request[Template, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getModelTemplate(
    params: GetModelTemplateRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ Template, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[Template, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Describes existing Models defined for a RestApi resource.
    */
  def getModels(): awsDashSdkLib.libRequestMod.Request[Models, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getModels(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ Models, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[Models, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Describes existing Models defined for a RestApi resource.
    */
  def getModels(params: GetModelsRequest): awsDashSdkLib.libRequestMod.Request[Models, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getModels(
    params: GetModelsRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ Models, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[Models, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Gets a RequestValidator of a given RestApi.
    */
  def getRequestValidator(): awsDashSdkLib.libRequestMod.Request[RequestValidator, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getRequestValidator(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ RequestValidator, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[RequestValidator, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Gets a RequestValidator of a given RestApi.
    */
  def getRequestValidator(params: GetRequestValidatorRequest): awsDashSdkLib.libRequestMod.Request[RequestValidator, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getRequestValidator(
    params: GetRequestValidatorRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ RequestValidator, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[RequestValidator, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Gets the RequestValidators collection of a given RestApi.
    */
  def getRequestValidators(): awsDashSdkLib.libRequestMod.Request[RequestValidators, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getRequestValidators(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ RequestValidators, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[RequestValidators, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Gets the RequestValidators collection of a given RestApi.
    */
  def getRequestValidators(params: GetRequestValidatorsRequest): awsDashSdkLib.libRequestMod.Request[RequestValidators, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getRequestValidators(
    params: GetRequestValidatorsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ RequestValidators, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[RequestValidators, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Lists information about a resource.
    */
  def getResource(): awsDashSdkLib.libRequestMod.Request[Resource, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getResource(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ Resource, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[Resource, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Lists information about a resource.
    */
  def getResource(params: GetResourceRequest): awsDashSdkLib.libRequestMod.Request[Resource, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getResource(
    params: GetResourceRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ Resource, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[Resource, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Lists information about a collection of Resource resources.
    */
  def getResources(): awsDashSdkLib.libRequestMod.Request[Resources, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getResources(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ Resources, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[Resources, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Lists information about a collection of Resource resources.
    */
  def getResources(params: GetResourcesRequest): awsDashSdkLib.libRequestMod.Request[Resources, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getResources(
    params: GetResourcesRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ Resources, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[Resources, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Lists the RestApi resource in the collection.
    */
  def getRestApi(): awsDashSdkLib.libRequestMod.Request[RestApi, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getRestApi(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ RestApi, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[RestApi, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Lists the RestApi resource in the collection.
    */
  def getRestApi(params: GetRestApiRequest): awsDashSdkLib.libRequestMod.Request[RestApi, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getRestApi(
    params: GetRestApiRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ RestApi, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[RestApi, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Lists the RestApis resources for your collection.
    */
  def getRestApis(): awsDashSdkLib.libRequestMod.Request[RestApis, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getRestApis(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ RestApis, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[RestApis, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Lists the RestApis resources for your collection.
    */
  def getRestApis(params: GetRestApisRequest): awsDashSdkLib.libRequestMod.Request[RestApis, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getRestApis(
    params: GetRestApisRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ RestApis, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[RestApis, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Generates a client SDK for a RestApi and Stage.
    */
  def getSdk(): awsDashSdkLib.libRequestMod.Request[SdkResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getSdk(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ SdkResponse, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[SdkResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Generates a client SDK for a RestApi and Stage.
    */
  def getSdk(params: GetSdkRequest): awsDashSdkLib.libRequestMod.Request[SdkResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getSdk(
    params: GetSdkRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ SdkResponse, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[SdkResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * 
    */
  def getSdkType(): awsDashSdkLib.libRequestMod.Request[SdkType, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getSdkType(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ SdkType, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[SdkType, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * 
    */
  def getSdkType(params: GetSdkTypeRequest): awsDashSdkLib.libRequestMod.Request[SdkType, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getSdkType(
    params: GetSdkTypeRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ SdkType, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[SdkType, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * 
    */
  def getSdkTypes(): awsDashSdkLib.libRequestMod.Request[SdkTypes, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getSdkTypes(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ SdkTypes, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[SdkTypes, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * 
    */
  def getSdkTypes(params: GetSdkTypesRequest): awsDashSdkLib.libRequestMod.Request[SdkTypes, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getSdkTypes(
    params: GetSdkTypesRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ SdkTypes, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[SdkTypes, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Gets information about a Stage resource.
    */
  def getStage(): awsDashSdkLib.libRequestMod.Request[Stage, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getStage(callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ Stage, scala.Unit]): awsDashSdkLib.libRequestMod.Request[Stage, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Gets information about a Stage resource.
    */
  def getStage(params: GetStageRequest): awsDashSdkLib.libRequestMod.Request[Stage, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getStage(
    params: GetStageRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ Stage, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[Stage, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Gets information about one or more Stage resources.
    */
  def getStages(): awsDashSdkLib.libRequestMod.Request[Stages, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getStages(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ Stages, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[Stages, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Gets information about one or more Stage resources.
    */
  def getStages(params: GetStagesRequest): awsDashSdkLib.libRequestMod.Request[Stages, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getStages(
    params: GetStagesRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ Stages, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[Stages, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Gets the Tags collection for a given resource.
    */
  def getTags(): awsDashSdkLib.libRequestMod.Request[Tags, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getTags(callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ Tags, scala.Unit]): awsDashSdkLib.libRequestMod.Request[Tags, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Gets the Tags collection for a given resource.
    */
  def getTags(params: GetTagsRequest): awsDashSdkLib.libRequestMod.Request[Tags, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getTags(
    params: GetTagsRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ Tags, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[Tags, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Gets the usage data of a usage plan in a specified time interval.
    */
  def getUsage(): awsDashSdkLib.libRequestMod.Request[Usage, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getUsage(callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ Usage, scala.Unit]): awsDashSdkLib.libRequestMod.Request[Usage, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Gets the usage data of a usage plan in a specified time interval.
    */
  def getUsage(params: GetUsageRequest): awsDashSdkLib.libRequestMod.Request[Usage, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getUsage(
    params: GetUsageRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ Usage, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[Usage, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Gets a usage plan of a given plan identifier.
    */
  def getUsagePlan(): awsDashSdkLib.libRequestMod.Request[UsagePlan, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getUsagePlan(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ UsagePlan, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[UsagePlan, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Gets a usage plan of a given plan identifier.
    */
  def getUsagePlan(params: GetUsagePlanRequest): awsDashSdkLib.libRequestMod.Request[UsagePlan, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getUsagePlan(
    params: GetUsagePlanRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ UsagePlan, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[UsagePlan, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Gets a usage plan key of a given key identifier.
    */
  def getUsagePlanKey(): awsDashSdkLib.libRequestMod.Request[UsagePlanKey, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getUsagePlanKey(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ UsagePlanKey, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[UsagePlanKey, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Gets a usage plan key of a given key identifier.
    */
  def getUsagePlanKey(params: GetUsagePlanKeyRequest): awsDashSdkLib.libRequestMod.Request[UsagePlanKey, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getUsagePlanKey(
    params: GetUsagePlanKeyRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ UsagePlanKey, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[UsagePlanKey, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Gets all the usage plan keys representing the API keys added to a specified usage plan.
    */
  def getUsagePlanKeys(): awsDashSdkLib.libRequestMod.Request[UsagePlanKeys, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getUsagePlanKeys(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ UsagePlanKeys, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[UsagePlanKeys, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Gets all the usage plan keys representing the API keys added to a specified usage plan.
    */
  def getUsagePlanKeys(params: GetUsagePlanKeysRequest): awsDashSdkLib.libRequestMod.Request[UsagePlanKeys, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getUsagePlanKeys(
    params: GetUsagePlanKeysRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ UsagePlanKeys, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[UsagePlanKeys, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Gets all the usage plans of the caller's account.
    */
  def getUsagePlans(): awsDashSdkLib.libRequestMod.Request[UsagePlans, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getUsagePlans(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ UsagePlans, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[UsagePlans, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Gets all the usage plans of the caller's account.
    */
  def getUsagePlans(params: GetUsagePlansRequest): awsDashSdkLib.libRequestMod.Request[UsagePlans, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getUsagePlans(
    params: GetUsagePlansRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ UsagePlans, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[UsagePlans, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Gets a specified VPC link under the caller's account in a region.
    */
  def getVpcLink(): awsDashSdkLib.libRequestMod.Request[VpcLink, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getVpcLink(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ VpcLink, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[VpcLink, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Gets a specified VPC link under the caller's account in a region.
    */
  def getVpcLink(params: GetVpcLinkRequest): awsDashSdkLib.libRequestMod.Request[VpcLink, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getVpcLink(
    params: GetVpcLinkRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ VpcLink, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[VpcLink, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Gets the VpcLinks collection under the caller's account in a selected region.
    */
  def getVpcLinks(): awsDashSdkLib.libRequestMod.Request[VpcLinks, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getVpcLinks(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ VpcLinks, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[VpcLinks, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Gets the VpcLinks collection under the caller's account in a selected region.
    */
  def getVpcLinks(params: GetVpcLinksRequest): awsDashSdkLib.libRequestMod.Request[VpcLinks, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getVpcLinks(
    params: GetVpcLinksRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ VpcLinks, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[VpcLinks, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Import API keys from an external source, such as a CSV-formatted file.
    */
  def importApiKeys(): awsDashSdkLib.libRequestMod.Request[ApiKeyIds, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def importApiKeys(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ ApiKeyIds, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[ApiKeyIds, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Import API keys from an external source, such as a CSV-formatted file.
    */
  def importApiKeys(params: ImportApiKeysRequest): awsDashSdkLib.libRequestMod.Request[ApiKeyIds, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def importApiKeys(
    params: ImportApiKeysRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ ApiKeyIds, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[ApiKeyIds, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * 
    */
  def importDocumentationParts(): awsDashSdkLib.libRequestMod.Request[DocumentationPartIds, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def importDocumentationParts(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DocumentationPartIds, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DocumentationPartIds, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * 
    */
  def importDocumentationParts(params: ImportDocumentationPartsRequest): awsDashSdkLib.libRequestMod.Request[DocumentationPartIds, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def importDocumentationParts(
    params: ImportDocumentationPartsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DocumentationPartIds, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DocumentationPartIds, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * A feature of the API Gateway control service for creating a new API from an external API definition file.
    */
  def importRestApi(): awsDashSdkLib.libRequestMod.Request[RestApi, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def importRestApi(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ RestApi, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[RestApi, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * A feature of the API Gateway control service for creating a new API from an external API definition file.
    */
  def importRestApi(params: ImportRestApiRequest): awsDashSdkLib.libRequestMod.Request[RestApi, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def importRestApi(
    params: ImportRestApiRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ RestApi, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[RestApi, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates a customization of a GatewayResponse of a specified response type and status code on the given RestApi.
    */
  def putGatewayResponse(): awsDashSdkLib.libRequestMod.Request[GatewayResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def putGatewayResponse(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ GatewayResponse, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[GatewayResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates a customization of a GatewayResponse of a specified response type and status code on the given RestApi.
    */
  def putGatewayResponse(params: PutGatewayResponseRequest): awsDashSdkLib.libRequestMod.Request[GatewayResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def putGatewayResponse(
    params: PutGatewayResponseRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ GatewayResponse, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[GatewayResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Sets up a method's integration.
    */
  def putIntegration(): awsDashSdkLib.libRequestMod.Request[Integration, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def putIntegration(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ Integration, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[Integration, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Sets up a method's integration.
    */
  def putIntegration(params: PutIntegrationRequest): awsDashSdkLib.libRequestMod.Request[Integration, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def putIntegration(
    params: PutIntegrationRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ Integration, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[Integration, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Represents a put integration.
    */
  def putIntegrationResponse(): awsDashSdkLib.libRequestMod.Request[IntegrationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def putIntegrationResponse(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ IntegrationResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[IntegrationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Represents a put integration.
    */
  def putIntegrationResponse(params: PutIntegrationResponseRequest): awsDashSdkLib.libRequestMod.Request[IntegrationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def putIntegrationResponse(
    params: PutIntegrationResponseRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ IntegrationResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[IntegrationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Add a method to an existing Resource resource.
    */
  def putMethod(): awsDashSdkLib.libRequestMod.Request[Method, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def putMethod(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ Method, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[Method, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Add a method to an existing Resource resource.
    */
  def putMethod(params: PutMethodRequest): awsDashSdkLib.libRequestMod.Request[Method, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def putMethod(
    params: PutMethodRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ Method, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[Method, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Adds a MethodResponse to an existing Method resource.
    */
  def putMethodResponse(): awsDashSdkLib.libRequestMod.Request[MethodResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def putMethodResponse(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ MethodResponse, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[MethodResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Adds a MethodResponse to an existing Method resource.
    */
  def putMethodResponse(params: PutMethodResponseRequest): awsDashSdkLib.libRequestMod.Request[MethodResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def putMethodResponse(
    params: PutMethodResponseRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ MethodResponse, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[MethodResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * A feature of the API Gateway control service for updating an existing API with an input of external API definitions. The update can take the form of merging the supplied definition into the existing API or overwriting the existing API.
    */
  def putRestApi(): awsDashSdkLib.libRequestMod.Request[RestApi, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def putRestApi(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ RestApi, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[RestApi, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * A feature of the API Gateway control service for updating an existing API with an input of external API definitions. The update can take the form of merging the supplied definition into the existing API or overwriting the existing API.
    */
  def putRestApi(params: PutRestApiRequest): awsDashSdkLib.libRequestMod.Request[RestApi, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def putRestApi(
    params: PutRestApiRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ RestApi, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[RestApi, awsDashSdkLib.libErrorMod.AWSError] = js.native
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
  def tagResource(params: TagResourceRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def tagResource(
    params: TagResourceRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Simulate the execution of an Authorizer in your RestApi with headers, parameters, and an incoming request body.  Use Lambda Function as Authorizer Use Cognito User Pool as Authorizer 
    */
  def testInvokeAuthorizer(): awsDashSdkLib.libRequestMod.Request[TestInvokeAuthorizerResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def testInvokeAuthorizer(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ TestInvokeAuthorizerResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[TestInvokeAuthorizerResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Simulate the execution of an Authorizer in your RestApi with headers, parameters, and an incoming request body.  Use Lambda Function as Authorizer Use Cognito User Pool as Authorizer 
    */
  def testInvokeAuthorizer(params: TestInvokeAuthorizerRequest): awsDashSdkLib.libRequestMod.Request[TestInvokeAuthorizerResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def testInvokeAuthorizer(
    params: TestInvokeAuthorizerRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ TestInvokeAuthorizerResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[TestInvokeAuthorizerResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Simulate the execution of a Method in your RestApi with headers, parameters, and an incoming request body.
    */
  def testInvokeMethod(): awsDashSdkLib.libRequestMod.Request[TestInvokeMethodResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def testInvokeMethod(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ TestInvokeMethodResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[TestInvokeMethodResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Simulate the execution of a Method in your RestApi with headers, parameters, and an incoming request body.
    */
  def testInvokeMethod(params: TestInvokeMethodRequest): awsDashSdkLib.libRequestMod.Request[TestInvokeMethodResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def testInvokeMethod(
    params: TestInvokeMethodRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ TestInvokeMethodResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[TestInvokeMethodResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
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
  def untagResource(params: UntagResourceRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def untagResource(
    params: UntagResourceRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Changes information about the current Account resource.
    */
  def updateAccount(): awsDashSdkLib.libRequestMod.Request[Account, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def updateAccount(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ Account, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[Account, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Changes information about the current Account resource.
    */
  def updateAccount(params: UpdateAccountRequest): awsDashSdkLib.libRequestMod.Request[Account, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def updateAccount(
    params: UpdateAccountRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ Account, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[Account, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Changes information about an ApiKey resource.
    */
  def updateApiKey(): awsDashSdkLib.libRequestMod.Request[ApiKey, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def updateApiKey(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ ApiKey, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[ApiKey, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Changes information about an ApiKey resource.
    */
  def updateApiKey(params: UpdateApiKeyRequest): awsDashSdkLib.libRequestMod.Request[ApiKey, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def updateApiKey(
    params: UpdateApiKeyRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ ApiKey, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[ApiKey, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Updates an existing Authorizer resource. AWS CLI
    */
  def updateAuthorizer(): awsDashSdkLib.libRequestMod.Request[Authorizer, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def updateAuthorizer(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ Authorizer, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[Authorizer, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Updates an existing Authorizer resource. AWS CLI
    */
  def updateAuthorizer(params: UpdateAuthorizerRequest): awsDashSdkLib.libRequestMod.Request[Authorizer, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def updateAuthorizer(
    params: UpdateAuthorizerRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ Authorizer, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[Authorizer, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Changes information about the BasePathMapping resource.
    */
  def updateBasePathMapping(): awsDashSdkLib.libRequestMod.Request[BasePathMapping, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def updateBasePathMapping(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ BasePathMapping, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[BasePathMapping, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Changes information about the BasePathMapping resource.
    */
  def updateBasePathMapping(params: UpdateBasePathMappingRequest): awsDashSdkLib.libRequestMod.Request[BasePathMapping, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def updateBasePathMapping(
    params: UpdateBasePathMappingRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ BasePathMapping, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[BasePathMapping, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Changes information about an ClientCertificate resource.
    */
  def updateClientCertificate(): awsDashSdkLib.libRequestMod.Request[ClientCertificate, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def updateClientCertificate(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ClientCertificate, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ClientCertificate, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Changes information about an ClientCertificate resource.
    */
  def updateClientCertificate(params: UpdateClientCertificateRequest): awsDashSdkLib.libRequestMod.Request[ClientCertificate, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def updateClientCertificate(
    params: UpdateClientCertificateRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ClientCertificate, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ClientCertificate, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Changes information about a Deployment resource.
    */
  def updateDeployment(): awsDashSdkLib.libRequestMod.Request[Deployment, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def updateDeployment(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ Deployment, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[Deployment, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Changes information about a Deployment resource.
    */
  def updateDeployment(params: UpdateDeploymentRequest): awsDashSdkLib.libRequestMod.Request[Deployment, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def updateDeployment(
    params: UpdateDeploymentRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ Deployment, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[Deployment, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * 
    */
  def updateDocumentationPart(): awsDashSdkLib.libRequestMod.Request[DocumentationPart, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def updateDocumentationPart(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DocumentationPart, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DocumentationPart, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * 
    */
  def updateDocumentationPart(params: UpdateDocumentationPartRequest): awsDashSdkLib.libRequestMod.Request[DocumentationPart, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def updateDocumentationPart(
    params: UpdateDocumentationPartRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DocumentationPart, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DocumentationPart, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * 
    */
  def updateDocumentationVersion(): awsDashSdkLib.libRequestMod.Request[DocumentationVersion, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def updateDocumentationVersion(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DocumentationVersion, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DocumentationVersion, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * 
    */
  def updateDocumentationVersion(params: UpdateDocumentationVersionRequest): awsDashSdkLib.libRequestMod.Request[DocumentationVersion, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def updateDocumentationVersion(
    params: UpdateDocumentationVersionRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DocumentationVersion, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DocumentationVersion, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Changes information about the DomainName resource.
    */
  def updateDomainName(): awsDashSdkLib.libRequestMod.Request[DomainName, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def updateDomainName(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ DomainName, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[DomainName, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Changes information about the DomainName resource.
    */
  def updateDomainName(params: UpdateDomainNameRequest): awsDashSdkLib.libRequestMod.Request[DomainName, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def updateDomainName(
    params: UpdateDomainNameRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ DomainName, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[DomainName, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Updates a GatewayResponse of a specified response type on the given RestApi.
    */
  def updateGatewayResponse(): awsDashSdkLib.libRequestMod.Request[GatewayResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def updateGatewayResponse(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ GatewayResponse, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[GatewayResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Updates a GatewayResponse of a specified response type on the given RestApi.
    */
  def updateGatewayResponse(params: UpdateGatewayResponseRequest): awsDashSdkLib.libRequestMod.Request[GatewayResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def updateGatewayResponse(
    params: UpdateGatewayResponseRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ GatewayResponse, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[GatewayResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Represents an update integration.
    */
  def updateIntegration(): awsDashSdkLib.libRequestMod.Request[Integration, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def updateIntegration(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ Integration, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[Integration, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Represents an update integration.
    */
  def updateIntegration(params: UpdateIntegrationRequest): awsDashSdkLib.libRequestMod.Request[Integration, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def updateIntegration(
    params: UpdateIntegrationRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ Integration, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[Integration, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Represents an update integration response.
    */
  def updateIntegrationResponse(): awsDashSdkLib.libRequestMod.Request[IntegrationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def updateIntegrationResponse(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ IntegrationResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[IntegrationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Represents an update integration response.
    */
  def updateIntegrationResponse(params: UpdateIntegrationResponseRequest): awsDashSdkLib.libRequestMod.Request[IntegrationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def updateIntegrationResponse(
    params: UpdateIntegrationResponseRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ IntegrationResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[IntegrationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Updates an existing Method resource.
    */
  def updateMethod(): awsDashSdkLib.libRequestMod.Request[Method, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def updateMethod(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ Method, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[Method, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Updates an existing Method resource.
    */
  def updateMethod(params: UpdateMethodRequest): awsDashSdkLib.libRequestMod.Request[Method, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def updateMethod(
    params: UpdateMethodRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ Method, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[Method, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Updates an existing MethodResponse resource.
    */
  def updateMethodResponse(): awsDashSdkLib.libRequestMod.Request[MethodResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def updateMethodResponse(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ MethodResponse, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[MethodResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Updates an existing MethodResponse resource.
    */
  def updateMethodResponse(params: UpdateMethodResponseRequest): awsDashSdkLib.libRequestMod.Request[MethodResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def updateMethodResponse(
    params: UpdateMethodResponseRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ MethodResponse, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[MethodResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Changes information about a model.
    */
  def updateModel(): awsDashSdkLib.libRequestMod.Request[Model, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def updateModel(callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ Model, scala.Unit]): awsDashSdkLib.libRequestMod.Request[Model, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Changes information about a model.
    */
  def updateModel(params: UpdateModelRequest): awsDashSdkLib.libRequestMod.Request[Model, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def updateModel(
    params: UpdateModelRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ Model, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[Model, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Updates a RequestValidator of a given RestApi.
    */
  def updateRequestValidator(): awsDashSdkLib.libRequestMod.Request[RequestValidator, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def updateRequestValidator(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ RequestValidator, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[RequestValidator, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Updates a RequestValidator of a given RestApi.
    */
  def updateRequestValidator(params: UpdateRequestValidatorRequest): awsDashSdkLib.libRequestMod.Request[RequestValidator, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def updateRequestValidator(
    params: UpdateRequestValidatorRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ RequestValidator, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[RequestValidator, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Changes information about a Resource resource.
    */
  def updateResource(): awsDashSdkLib.libRequestMod.Request[Resource, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def updateResource(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ Resource, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[Resource, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Changes information about a Resource resource.
    */
  def updateResource(params: UpdateResourceRequest): awsDashSdkLib.libRequestMod.Request[Resource, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def updateResource(
    params: UpdateResourceRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ Resource, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[Resource, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Changes information about the specified API.
    */
  def updateRestApi(): awsDashSdkLib.libRequestMod.Request[RestApi, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def updateRestApi(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ RestApi, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[RestApi, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Changes information about the specified API.
    */
  def updateRestApi(params: UpdateRestApiRequest): awsDashSdkLib.libRequestMod.Request[RestApi, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def updateRestApi(
    params: UpdateRestApiRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ RestApi, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[RestApi, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Changes information about a Stage resource.
    */
  def updateStage(): awsDashSdkLib.libRequestMod.Request[Stage, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def updateStage(callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ Stage, scala.Unit]): awsDashSdkLib.libRequestMod.Request[Stage, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Changes information about a Stage resource.
    */
  def updateStage(params: UpdateStageRequest): awsDashSdkLib.libRequestMod.Request[Stage, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def updateStage(
    params: UpdateStageRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ Stage, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[Stage, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Grants a temporary extension to the remaining quota of a usage plan associated with a specified API key.
    */
  def updateUsage(): awsDashSdkLib.libRequestMod.Request[Usage, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def updateUsage(callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ Usage, scala.Unit]): awsDashSdkLib.libRequestMod.Request[Usage, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Grants a temporary extension to the remaining quota of a usage plan associated with a specified API key.
    */
  def updateUsage(params: UpdateUsageRequest): awsDashSdkLib.libRequestMod.Request[Usage, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def updateUsage(
    params: UpdateUsageRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ Usage, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[Usage, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Updates a usage plan of a given plan Id.
    */
  def updateUsagePlan(): awsDashSdkLib.libRequestMod.Request[UsagePlan, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def updateUsagePlan(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ UsagePlan, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[UsagePlan, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Updates a usage plan of a given plan Id.
    */
  def updateUsagePlan(params: UpdateUsagePlanRequest): awsDashSdkLib.libRequestMod.Request[UsagePlan, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def updateUsagePlan(
    params: UpdateUsagePlanRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ UsagePlan, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[UsagePlan, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Updates an existing VpcLink of a specified identifier.
    */
  def updateVpcLink(): awsDashSdkLib.libRequestMod.Request[VpcLink, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def updateVpcLink(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ VpcLink, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[VpcLink, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Updates an existing VpcLink of a specified identifier.
    */
  def updateVpcLink(params: UpdateVpcLinkRequest): awsDashSdkLib.libRequestMod.Request[VpcLink, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def updateVpcLink(
    params: UpdateVpcLinkRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ VpcLink, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[VpcLink, awsDashSdkLib.libErrorMod.AWSError] = js.native
}

