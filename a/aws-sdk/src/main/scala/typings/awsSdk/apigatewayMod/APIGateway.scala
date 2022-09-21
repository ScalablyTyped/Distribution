package typings.awsSdk.apigatewayMod

import typings.awsSdk.configBaseMod.ConfigBase
import typings.awsSdk.errorMod.AWSError
import typings.awsSdk.requestMod.Request
import typings.awsSdk.serviceMod.Service
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait APIGateway extends Service {
  
  @JSName("config")
  var config_APIGateway: ConfigBase & ClientConfiguration = js.native
  
  /**
    * Create an ApiKey resource. 
    */
  def createApiKey(): Request[ApiKey, AWSError] = js.native
  def createApiKey(callback: js.Function2[/* err */ AWSError, /* data */ ApiKey, Unit]): Request[ApiKey, AWSError] = js.native
  /**
    * Create an ApiKey resource. 
    */
  def createApiKey(params: CreateApiKeyRequest): Request[ApiKey, AWSError] = js.native
  def createApiKey(params: CreateApiKeyRequest, callback: js.Function2[/* err */ AWSError, /* data */ ApiKey, Unit]): Request[ApiKey, AWSError] = js.native
  
  /**
    * Adds a new Authorizer resource to an existing RestApi resource.
    */
  def createAuthorizer(): Request[Authorizer, AWSError] = js.native
  def createAuthorizer(callback: js.Function2[/* err */ AWSError, /* data */ Authorizer, Unit]): Request[Authorizer, AWSError] = js.native
  /**
    * Adds a new Authorizer resource to an existing RestApi resource.
    */
  def createAuthorizer(params: CreateAuthorizerRequest): Request[Authorizer, AWSError] = js.native
  def createAuthorizer(
    params: CreateAuthorizerRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ Authorizer, Unit]
  ): Request[Authorizer, AWSError] = js.native
  
  /**
    * Creates a new BasePathMapping resource.
    */
  def createBasePathMapping(): Request[BasePathMapping, AWSError] = js.native
  def createBasePathMapping(callback: js.Function2[/* err */ AWSError, /* data */ BasePathMapping, Unit]): Request[BasePathMapping, AWSError] = js.native
  /**
    * Creates a new BasePathMapping resource.
    */
  def createBasePathMapping(params: CreateBasePathMappingRequest): Request[BasePathMapping, AWSError] = js.native
  def createBasePathMapping(
    params: CreateBasePathMappingRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ BasePathMapping, Unit]
  ): Request[BasePathMapping, AWSError] = js.native
  
  /**
    * Creates a Deployment resource, which makes a specified RestApi callable over the internet.
    */
  def createDeployment(): Request[Deployment, AWSError] = js.native
  def createDeployment(callback: js.Function2[/* err */ AWSError, /* data */ Deployment, Unit]): Request[Deployment, AWSError] = js.native
  /**
    * Creates a Deployment resource, which makes a specified RestApi callable over the internet.
    */
  def createDeployment(params: CreateDeploymentRequest): Request[Deployment, AWSError] = js.native
  def createDeployment(
    params: CreateDeploymentRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ Deployment, Unit]
  ): Request[Deployment, AWSError] = js.native
  
  /**
    * Creates a documentation part.
    */
  def createDocumentationPart(): Request[DocumentationPart, AWSError] = js.native
  def createDocumentationPart(callback: js.Function2[/* err */ AWSError, /* data */ DocumentationPart, Unit]): Request[DocumentationPart, AWSError] = js.native
  /**
    * Creates a documentation part.
    */
  def createDocumentationPart(params: CreateDocumentationPartRequest): Request[DocumentationPart, AWSError] = js.native
  def createDocumentationPart(
    params: CreateDocumentationPartRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DocumentationPart, Unit]
  ): Request[DocumentationPart, AWSError] = js.native
  
  /**
    * Creates a documentation version
    */
  def createDocumentationVersion(): Request[DocumentationVersion, AWSError] = js.native
  def createDocumentationVersion(callback: js.Function2[/* err */ AWSError, /* data */ DocumentationVersion, Unit]): Request[DocumentationVersion, AWSError] = js.native
  /**
    * Creates a documentation version
    */
  def createDocumentationVersion(params: CreateDocumentationVersionRequest): Request[DocumentationVersion, AWSError] = js.native
  def createDocumentationVersion(
    params: CreateDocumentationVersionRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DocumentationVersion, Unit]
  ): Request[DocumentationVersion, AWSError] = js.native
  
  /**
    * Creates a new domain name.
    */
  def createDomainName(): Request[DomainName, AWSError] = js.native
  def createDomainName(callback: js.Function2[/* err */ AWSError, /* data */ DomainName, Unit]): Request[DomainName, AWSError] = js.native
  /**
    * Creates a new domain name.
    */
  def createDomainName(params: CreateDomainNameRequest): Request[DomainName, AWSError] = js.native
  def createDomainName(
    params: CreateDomainNameRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DomainName, Unit]
  ): Request[DomainName, AWSError] = js.native
  
  /**
    * Adds a new Model resource to an existing RestApi resource.
    */
  def createModel(): Request[Model, AWSError] = js.native
  def createModel(callback: js.Function2[/* err */ AWSError, /* data */ Model, Unit]): Request[Model, AWSError] = js.native
  /**
    * Adds a new Model resource to an existing RestApi resource.
    */
  def createModel(params: CreateModelRequest): Request[Model, AWSError] = js.native
  def createModel(params: CreateModelRequest, callback: js.Function2[/* err */ AWSError, /* data */ Model, Unit]): Request[Model, AWSError] = js.native
  
  /**
    * Creates a RequestValidator of a given RestApi.
    */
  def createRequestValidator(): Request[RequestValidator, AWSError] = js.native
  def createRequestValidator(callback: js.Function2[/* err */ AWSError, /* data */ RequestValidator, Unit]): Request[RequestValidator, AWSError] = js.native
  /**
    * Creates a RequestValidator of a given RestApi.
    */
  def createRequestValidator(params: CreateRequestValidatorRequest): Request[RequestValidator, AWSError] = js.native
  def createRequestValidator(
    params: CreateRequestValidatorRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ RequestValidator, Unit]
  ): Request[RequestValidator, AWSError] = js.native
  
  /**
    * Creates a Resource resource.
    */
  def createResource(): Request[Resource, AWSError] = js.native
  def createResource(callback: js.Function2[/* err */ AWSError, /* data */ Resource, Unit]): Request[Resource, AWSError] = js.native
  /**
    * Creates a Resource resource.
    */
  def createResource(params: CreateResourceRequest): Request[Resource, AWSError] = js.native
  def createResource(
    params: CreateResourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ Resource, Unit]
  ): Request[Resource, AWSError] = js.native
  
  /**
    * Creates a new RestApi resource.
    */
  def createRestApi(): Request[RestApi, AWSError] = js.native
  def createRestApi(callback: js.Function2[/* err */ AWSError, /* data */ RestApi, Unit]): Request[RestApi, AWSError] = js.native
  /**
    * Creates a new RestApi resource.
    */
  def createRestApi(params: CreateRestApiRequest): Request[RestApi, AWSError] = js.native
  def createRestApi(params: CreateRestApiRequest, callback: js.Function2[/* err */ AWSError, /* data */ RestApi, Unit]): Request[RestApi, AWSError] = js.native
  
  /**
    * Creates a new Stage resource that references a pre-existing Deployment for the API. 
    */
  def createStage(): Request[Stage, AWSError] = js.native
  def createStage(callback: js.Function2[/* err */ AWSError, /* data */ Stage, Unit]): Request[Stage, AWSError] = js.native
  /**
    * Creates a new Stage resource that references a pre-existing Deployment for the API. 
    */
  def createStage(params: CreateStageRequest): Request[Stage, AWSError] = js.native
  def createStage(params: CreateStageRequest, callback: js.Function2[/* err */ AWSError, /* data */ Stage, Unit]): Request[Stage, AWSError] = js.native
  
  /**
    * Creates a usage plan with the throttle and quota limits, as well as the associated API stages, specified in the payload. 
    */
  def createUsagePlan(): Request[UsagePlan, AWSError] = js.native
  def createUsagePlan(callback: js.Function2[/* err */ AWSError, /* data */ UsagePlan, Unit]): Request[UsagePlan, AWSError] = js.native
  /**
    * Creates a usage plan with the throttle and quota limits, as well as the associated API stages, specified in the payload. 
    */
  def createUsagePlan(params: CreateUsagePlanRequest): Request[UsagePlan, AWSError] = js.native
  def createUsagePlan(
    params: CreateUsagePlanRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UsagePlan, Unit]
  ): Request[UsagePlan, AWSError] = js.native
  
  /**
    * Creates a usage plan key for adding an existing API key to a usage plan.
    */
  def createUsagePlanKey(): Request[UsagePlanKey, AWSError] = js.native
  def createUsagePlanKey(callback: js.Function2[/* err */ AWSError, /* data */ UsagePlanKey, Unit]): Request[UsagePlanKey, AWSError] = js.native
  /**
    * Creates a usage plan key for adding an existing API key to a usage plan.
    */
  def createUsagePlanKey(params: CreateUsagePlanKeyRequest): Request[UsagePlanKey, AWSError] = js.native
  def createUsagePlanKey(
    params: CreateUsagePlanKeyRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UsagePlanKey, Unit]
  ): Request[UsagePlanKey, AWSError] = js.native
  
  /**
    * Creates a VPC link, under the caller's account in a selected region, in an asynchronous operation that typically takes 2-4 minutes to complete and become operational. The caller must have permissions to create and update VPC Endpoint services.
    */
  def createVpcLink(): Request[VpcLink, AWSError] = js.native
  def createVpcLink(callback: js.Function2[/* err */ AWSError, /* data */ VpcLink, Unit]): Request[VpcLink, AWSError] = js.native
  /**
    * Creates a VPC link, under the caller's account in a selected region, in an asynchronous operation that typically takes 2-4 minutes to complete and become operational. The caller must have permissions to create and update VPC Endpoint services.
    */
  def createVpcLink(params: CreateVpcLinkRequest): Request[VpcLink, AWSError] = js.native
  def createVpcLink(params: CreateVpcLinkRequest, callback: js.Function2[/* err */ AWSError, /* data */ VpcLink, Unit]): Request[VpcLink, AWSError] = js.native
  
  /**
    * Deletes the ApiKey resource.
    */
  def deleteApiKey(): Request[js.Object, AWSError] = js.native
  def deleteApiKey(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Deletes the ApiKey resource.
    */
  def deleteApiKey(params: DeleteApiKeyRequest): Request[js.Object, AWSError] = js.native
  def deleteApiKey(
    params: DeleteApiKeyRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * Deletes an existing Authorizer resource.
    */
  def deleteAuthorizer(): Request[js.Object, AWSError] = js.native
  def deleteAuthorizer(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Deletes an existing Authorizer resource.
    */
  def deleteAuthorizer(params: DeleteAuthorizerRequest): Request[js.Object, AWSError] = js.native
  def deleteAuthorizer(
    params: DeleteAuthorizerRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * Deletes the BasePathMapping resource.
    */
  def deleteBasePathMapping(): Request[js.Object, AWSError] = js.native
  def deleteBasePathMapping(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Deletes the BasePathMapping resource.
    */
  def deleteBasePathMapping(params: DeleteBasePathMappingRequest): Request[js.Object, AWSError] = js.native
  def deleteBasePathMapping(
    params: DeleteBasePathMappingRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * Deletes the ClientCertificate resource.
    */
  def deleteClientCertificate(): Request[js.Object, AWSError] = js.native
  def deleteClientCertificate(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Deletes the ClientCertificate resource.
    */
  def deleteClientCertificate(params: DeleteClientCertificateRequest): Request[js.Object, AWSError] = js.native
  def deleteClientCertificate(
    params: DeleteClientCertificateRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * Deletes a Deployment resource. Deleting a deployment will only succeed if there are no Stage resources associated with it.
    */
  def deleteDeployment(): Request[js.Object, AWSError] = js.native
  def deleteDeployment(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Deletes a Deployment resource. Deleting a deployment will only succeed if there are no Stage resources associated with it.
    */
  def deleteDeployment(params: DeleteDeploymentRequest): Request[js.Object, AWSError] = js.native
  def deleteDeployment(
    params: DeleteDeploymentRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * Deletes a documentation part
    */
  def deleteDocumentationPart(): Request[js.Object, AWSError] = js.native
  def deleteDocumentationPart(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Deletes a documentation part
    */
  def deleteDocumentationPart(params: DeleteDocumentationPartRequest): Request[js.Object, AWSError] = js.native
  def deleteDocumentationPart(
    params: DeleteDocumentationPartRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * Deletes a documentation version.
    */
  def deleteDocumentationVersion(): Request[js.Object, AWSError] = js.native
  def deleteDocumentationVersion(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Deletes a documentation version.
    */
  def deleteDocumentationVersion(params: DeleteDocumentationVersionRequest): Request[js.Object, AWSError] = js.native
  def deleteDocumentationVersion(
    params: DeleteDocumentationVersionRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * Deletes the DomainName resource.
    */
  def deleteDomainName(): Request[js.Object, AWSError] = js.native
  def deleteDomainName(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Deletes the DomainName resource.
    */
  def deleteDomainName(params: DeleteDomainNameRequest): Request[js.Object, AWSError] = js.native
  def deleteDomainName(
    params: DeleteDomainNameRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * Clears any customization of a GatewayResponse of a specified response type on the given RestApi and resets it with the default settings.
    */
  def deleteGatewayResponse(): Request[js.Object, AWSError] = js.native
  def deleteGatewayResponse(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Clears any customization of a GatewayResponse of a specified response type on the given RestApi and resets it with the default settings.
    */
  def deleteGatewayResponse(params: DeleteGatewayResponseRequest): Request[js.Object, AWSError] = js.native
  def deleteGatewayResponse(
    params: DeleteGatewayResponseRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * Represents a delete integration.
    */
  def deleteIntegration(): Request[js.Object, AWSError] = js.native
  def deleteIntegration(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Represents a delete integration.
    */
  def deleteIntegration(params: DeleteIntegrationRequest): Request[js.Object, AWSError] = js.native
  def deleteIntegration(
    params: DeleteIntegrationRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * Represents a delete integration response.
    */
  def deleteIntegrationResponse(): Request[js.Object, AWSError] = js.native
  def deleteIntegrationResponse(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Represents a delete integration response.
    */
  def deleteIntegrationResponse(params: DeleteIntegrationResponseRequest): Request[js.Object, AWSError] = js.native
  def deleteIntegrationResponse(
    params: DeleteIntegrationResponseRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * Deletes an existing Method resource.
    */
  def deleteMethod(): Request[js.Object, AWSError] = js.native
  def deleteMethod(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Deletes an existing Method resource.
    */
  def deleteMethod(params: DeleteMethodRequest): Request[js.Object, AWSError] = js.native
  def deleteMethod(
    params: DeleteMethodRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * Deletes an existing MethodResponse resource.
    */
  def deleteMethodResponse(): Request[js.Object, AWSError] = js.native
  def deleteMethodResponse(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Deletes an existing MethodResponse resource.
    */
  def deleteMethodResponse(params: DeleteMethodResponseRequest): Request[js.Object, AWSError] = js.native
  def deleteMethodResponse(
    params: DeleteMethodResponseRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * Deletes a model.
    */
  def deleteModel(): Request[js.Object, AWSError] = js.native
  def deleteModel(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Deletes a model.
    */
  def deleteModel(params: DeleteModelRequest): Request[js.Object, AWSError] = js.native
  def deleteModel(params: DeleteModelRequest, callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  
  /**
    * Deletes a RequestValidator of a given RestApi.
    */
  def deleteRequestValidator(): Request[js.Object, AWSError] = js.native
  def deleteRequestValidator(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Deletes a RequestValidator of a given RestApi.
    */
  def deleteRequestValidator(params: DeleteRequestValidatorRequest): Request[js.Object, AWSError] = js.native
  def deleteRequestValidator(
    params: DeleteRequestValidatorRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * Deletes a Resource resource.
    */
  def deleteResource(): Request[js.Object, AWSError] = js.native
  def deleteResource(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Deletes a Resource resource.
    */
  def deleteResource(params: DeleteResourceRequest): Request[js.Object, AWSError] = js.native
  def deleteResource(
    params: DeleteResourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * Deletes the specified API.
    */
  def deleteRestApi(): Request[js.Object, AWSError] = js.native
  def deleteRestApi(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Deletes the specified API.
    */
  def deleteRestApi(params: DeleteRestApiRequest): Request[js.Object, AWSError] = js.native
  def deleteRestApi(
    params: DeleteRestApiRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * Deletes a Stage resource.
    */
  def deleteStage(): Request[js.Object, AWSError] = js.native
  def deleteStage(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Deletes a Stage resource.
    */
  def deleteStage(params: DeleteStageRequest): Request[js.Object, AWSError] = js.native
  def deleteStage(params: DeleteStageRequest, callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  
  /**
    * Deletes a usage plan of a given plan Id.
    */
  def deleteUsagePlan(): Request[js.Object, AWSError] = js.native
  def deleteUsagePlan(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Deletes a usage plan of a given plan Id.
    */
  def deleteUsagePlan(params: DeleteUsagePlanRequest): Request[js.Object, AWSError] = js.native
  def deleteUsagePlan(
    params: DeleteUsagePlanRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * Deletes a usage plan key and remove the underlying API key from the associated usage plan.
    */
  def deleteUsagePlanKey(): Request[js.Object, AWSError] = js.native
  def deleteUsagePlanKey(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Deletes a usage plan key and remove the underlying API key from the associated usage plan.
    */
  def deleteUsagePlanKey(params: DeleteUsagePlanKeyRequest): Request[js.Object, AWSError] = js.native
  def deleteUsagePlanKey(
    params: DeleteUsagePlanKeyRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * Deletes an existing VpcLink of a specified identifier.
    */
  def deleteVpcLink(): Request[js.Object, AWSError] = js.native
  def deleteVpcLink(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Deletes an existing VpcLink of a specified identifier.
    */
  def deleteVpcLink(params: DeleteVpcLinkRequest): Request[js.Object, AWSError] = js.native
  def deleteVpcLink(
    params: DeleteVpcLinkRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * Flushes all authorizer cache entries on a stage.
    */
  def flushStageAuthorizersCache(): Request[js.Object, AWSError] = js.native
  def flushStageAuthorizersCache(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Flushes all authorizer cache entries on a stage.
    */
  def flushStageAuthorizersCache(params: FlushStageAuthorizersCacheRequest): Request[js.Object, AWSError] = js.native
  def flushStageAuthorizersCache(
    params: FlushStageAuthorizersCacheRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * Flushes a stage's cache.
    */
  def flushStageCache(): Request[js.Object, AWSError] = js.native
  def flushStageCache(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Flushes a stage's cache.
    */
  def flushStageCache(params: FlushStageCacheRequest): Request[js.Object, AWSError] = js.native
  def flushStageCache(
    params: FlushStageCacheRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * Generates a ClientCertificate resource.
    */
  def generateClientCertificate(): Request[ClientCertificate, AWSError] = js.native
  def generateClientCertificate(callback: js.Function2[/* err */ AWSError, /* data */ ClientCertificate, Unit]): Request[ClientCertificate, AWSError] = js.native
  /**
    * Generates a ClientCertificate resource.
    */
  def generateClientCertificate(params: GenerateClientCertificateRequest): Request[ClientCertificate, AWSError] = js.native
  def generateClientCertificate(
    params: GenerateClientCertificateRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ClientCertificate, Unit]
  ): Request[ClientCertificate, AWSError] = js.native
  
  /**
    * Gets information about the current Account resource.
    */
  def getAccount(): Request[Account, AWSError] = js.native
  def getAccount(callback: js.Function2[/* err */ AWSError, /* data */ Account, Unit]): Request[Account, AWSError] = js.native
  /**
    * Gets information about the current Account resource.
    */
  def getAccount(params: GetAccountRequest): Request[Account, AWSError] = js.native
  def getAccount(params: GetAccountRequest, callback: js.Function2[/* err */ AWSError, /* data */ Account, Unit]): Request[Account, AWSError] = js.native
  
  /**
    * Gets information about the current ApiKey resource.
    */
  def getApiKey(): Request[ApiKey, AWSError] = js.native
  def getApiKey(callback: js.Function2[/* err */ AWSError, /* data */ ApiKey, Unit]): Request[ApiKey, AWSError] = js.native
  /**
    * Gets information about the current ApiKey resource.
    */
  def getApiKey(params: GetApiKeyRequest): Request[ApiKey, AWSError] = js.native
  def getApiKey(params: GetApiKeyRequest, callback: js.Function2[/* err */ AWSError, /* data */ ApiKey, Unit]): Request[ApiKey, AWSError] = js.native
  
  /**
    * Gets information about the current ApiKeys resource.
    */
  def getApiKeys(): Request[ApiKeys, AWSError] = js.native
  def getApiKeys(callback: js.Function2[/* err */ AWSError, /* data */ ApiKeys, Unit]): Request[ApiKeys, AWSError] = js.native
  /**
    * Gets information about the current ApiKeys resource.
    */
  def getApiKeys(params: GetApiKeysRequest): Request[ApiKeys, AWSError] = js.native
  def getApiKeys(params: GetApiKeysRequest, callback: js.Function2[/* err */ AWSError, /* data */ ApiKeys, Unit]): Request[ApiKeys, AWSError] = js.native
  
  /**
    * Describe an existing Authorizer resource.
    */
  def getAuthorizer(): Request[Authorizer, AWSError] = js.native
  def getAuthorizer(callback: js.Function2[/* err */ AWSError, /* data */ Authorizer, Unit]): Request[Authorizer, AWSError] = js.native
  /**
    * Describe an existing Authorizer resource.
    */
  def getAuthorizer(params: GetAuthorizerRequest): Request[Authorizer, AWSError] = js.native
  def getAuthorizer(
    params: GetAuthorizerRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ Authorizer, Unit]
  ): Request[Authorizer, AWSError] = js.native
  
  /**
    * Describe an existing Authorizers resource.
    */
  def getAuthorizers(): Request[Authorizers, AWSError] = js.native
  def getAuthorizers(callback: js.Function2[/* err */ AWSError, /* data */ Authorizers, Unit]): Request[Authorizers, AWSError] = js.native
  /**
    * Describe an existing Authorizers resource.
    */
  def getAuthorizers(params: GetAuthorizersRequest): Request[Authorizers, AWSError] = js.native
  def getAuthorizers(
    params: GetAuthorizersRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ Authorizers, Unit]
  ): Request[Authorizers, AWSError] = js.native
  
  /**
    * Describe a BasePathMapping resource.
    */
  def getBasePathMapping(): Request[BasePathMapping, AWSError] = js.native
  def getBasePathMapping(callback: js.Function2[/* err */ AWSError, /* data */ BasePathMapping, Unit]): Request[BasePathMapping, AWSError] = js.native
  /**
    * Describe a BasePathMapping resource.
    */
  def getBasePathMapping(params: GetBasePathMappingRequest): Request[BasePathMapping, AWSError] = js.native
  def getBasePathMapping(
    params: GetBasePathMappingRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ BasePathMapping, Unit]
  ): Request[BasePathMapping, AWSError] = js.native
  
  /**
    * Represents a collection of BasePathMapping resources.
    */
  def getBasePathMappings(): Request[BasePathMappings, AWSError] = js.native
  def getBasePathMappings(callback: js.Function2[/* err */ AWSError, /* data */ BasePathMappings, Unit]): Request[BasePathMappings, AWSError] = js.native
  /**
    * Represents a collection of BasePathMapping resources.
    */
  def getBasePathMappings(params: GetBasePathMappingsRequest): Request[BasePathMappings, AWSError] = js.native
  def getBasePathMappings(
    params: GetBasePathMappingsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ BasePathMappings, Unit]
  ): Request[BasePathMappings, AWSError] = js.native
  
  /**
    * Gets information about the current ClientCertificate resource.
    */
  def getClientCertificate(): Request[ClientCertificate, AWSError] = js.native
  def getClientCertificate(callback: js.Function2[/* err */ AWSError, /* data */ ClientCertificate, Unit]): Request[ClientCertificate, AWSError] = js.native
  /**
    * Gets information about the current ClientCertificate resource.
    */
  def getClientCertificate(params: GetClientCertificateRequest): Request[ClientCertificate, AWSError] = js.native
  def getClientCertificate(
    params: GetClientCertificateRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ClientCertificate, Unit]
  ): Request[ClientCertificate, AWSError] = js.native
  
  /**
    * Gets a collection of ClientCertificate resources.
    */
  def getClientCertificates(): Request[ClientCertificates, AWSError] = js.native
  def getClientCertificates(callback: js.Function2[/* err */ AWSError, /* data */ ClientCertificates, Unit]): Request[ClientCertificates, AWSError] = js.native
  /**
    * Gets a collection of ClientCertificate resources.
    */
  def getClientCertificates(params: GetClientCertificatesRequest): Request[ClientCertificates, AWSError] = js.native
  def getClientCertificates(
    params: GetClientCertificatesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ClientCertificates, Unit]
  ): Request[ClientCertificates, AWSError] = js.native
  
  /**
    * Gets information about a Deployment resource.
    */
  def getDeployment(): Request[Deployment, AWSError] = js.native
  def getDeployment(callback: js.Function2[/* err */ AWSError, /* data */ Deployment, Unit]): Request[Deployment, AWSError] = js.native
  /**
    * Gets information about a Deployment resource.
    */
  def getDeployment(params: GetDeploymentRequest): Request[Deployment, AWSError] = js.native
  def getDeployment(
    params: GetDeploymentRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ Deployment, Unit]
  ): Request[Deployment, AWSError] = js.native
  
  /**
    * Gets information about a Deployments collection.
    */
  def getDeployments(): Request[Deployments, AWSError] = js.native
  def getDeployments(callback: js.Function2[/* err */ AWSError, /* data */ Deployments, Unit]): Request[Deployments, AWSError] = js.native
  /**
    * Gets information about a Deployments collection.
    */
  def getDeployments(params: GetDeploymentsRequest): Request[Deployments, AWSError] = js.native
  def getDeployments(
    params: GetDeploymentsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ Deployments, Unit]
  ): Request[Deployments, AWSError] = js.native
  
  /**
    * Gets a documentation part.
    */
  def getDocumentationPart(): Request[DocumentationPart, AWSError] = js.native
  def getDocumentationPart(callback: js.Function2[/* err */ AWSError, /* data */ DocumentationPart, Unit]): Request[DocumentationPart, AWSError] = js.native
  /**
    * Gets a documentation part.
    */
  def getDocumentationPart(params: GetDocumentationPartRequest): Request[DocumentationPart, AWSError] = js.native
  def getDocumentationPart(
    params: GetDocumentationPartRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DocumentationPart, Unit]
  ): Request[DocumentationPart, AWSError] = js.native
  
  /**
    * Gets documentation parts.
    */
  def getDocumentationParts(): Request[DocumentationParts, AWSError] = js.native
  def getDocumentationParts(callback: js.Function2[/* err */ AWSError, /* data */ DocumentationParts, Unit]): Request[DocumentationParts, AWSError] = js.native
  /**
    * Gets documentation parts.
    */
  def getDocumentationParts(params: GetDocumentationPartsRequest): Request[DocumentationParts, AWSError] = js.native
  def getDocumentationParts(
    params: GetDocumentationPartsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DocumentationParts, Unit]
  ): Request[DocumentationParts, AWSError] = js.native
  
  /**
    * Gets a documentation version.
    */
  def getDocumentationVersion(): Request[DocumentationVersion, AWSError] = js.native
  def getDocumentationVersion(callback: js.Function2[/* err */ AWSError, /* data */ DocumentationVersion, Unit]): Request[DocumentationVersion, AWSError] = js.native
  /**
    * Gets a documentation version.
    */
  def getDocumentationVersion(params: GetDocumentationVersionRequest): Request[DocumentationVersion, AWSError] = js.native
  def getDocumentationVersion(
    params: GetDocumentationVersionRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DocumentationVersion, Unit]
  ): Request[DocumentationVersion, AWSError] = js.native
  
  /**
    * Gets documentation versions.
    */
  def getDocumentationVersions(): Request[DocumentationVersions, AWSError] = js.native
  def getDocumentationVersions(callback: js.Function2[/* err */ AWSError, /* data */ DocumentationVersions, Unit]): Request[DocumentationVersions, AWSError] = js.native
  /**
    * Gets documentation versions.
    */
  def getDocumentationVersions(params: GetDocumentationVersionsRequest): Request[DocumentationVersions, AWSError] = js.native
  def getDocumentationVersions(
    params: GetDocumentationVersionsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DocumentationVersions, Unit]
  ): Request[DocumentationVersions, AWSError] = js.native
  
  /**
    * Represents a domain name that is contained in a simpler, more intuitive URL that can be called.
    */
  def getDomainName(): Request[DomainName, AWSError] = js.native
  def getDomainName(callback: js.Function2[/* err */ AWSError, /* data */ DomainName, Unit]): Request[DomainName, AWSError] = js.native
  /**
    * Represents a domain name that is contained in a simpler, more intuitive URL that can be called.
    */
  def getDomainName(params: GetDomainNameRequest): Request[DomainName, AWSError] = js.native
  def getDomainName(
    params: GetDomainNameRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DomainName, Unit]
  ): Request[DomainName, AWSError] = js.native
  
  /**
    * Represents a collection of DomainName resources.
    */
  def getDomainNames(): Request[DomainNames, AWSError] = js.native
  def getDomainNames(callback: js.Function2[/* err */ AWSError, /* data */ DomainNames, Unit]): Request[DomainNames, AWSError] = js.native
  /**
    * Represents a collection of DomainName resources.
    */
  def getDomainNames(params: GetDomainNamesRequest): Request[DomainNames, AWSError] = js.native
  def getDomainNames(
    params: GetDomainNamesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DomainNames, Unit]
  ): Request[DomainNames, AWSError] = js.native
  
  /**
    * Exports a deployed version of a RestApi in a specified format.
    */
  def getExport(): Request[ExportResponse, AWSError] = js.native
  def getExport(callback: js.Function2[/* err */ AWSError, /* data */ ExportResponse, Unit]): Request[ExportResponse, AWSError] = js.native
  /**
    * Exports a deployed version of a RestApi in a specified format.
    */
  def getExport(params: GetExportRequest): Request[ExportResponse, AWSError] = js.native
  def getExport(
    params: GetExportRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ExportResponse, Unit]
  ): Request[ExportResponse, AWSError] = js.native
  
  /**
    * Gets a GatewayResponse of a specified response type on the given RestApi.
    */
  def getGatewayResponse(): Request[GatewayResponse, AWSError] = js.native
  def getGatewayResponse(callback: js.Function2[/* err */ AWSError, /* data */ GatewayResponse, Unit]): Request[GatewayResponse, AWSError] = js.native
  /**
    * Gets a GatewayResponse of a specified response type on the given RestApi.
    */
  def getGatewayResponse(params: GetGatewayResponseRequest): Request[GatewayResponse, AWSError] = js.native
  def getGatewayResponse(
    params: GetGatewayResponseRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GatewayResponse, Unit]
  ): Request[GatewayResponse, AWSError] = js.native
  
  /**
    * Gets the GatewayResponses collection on the given RestApi. If an API developer has not added any definitions for gateway responses, the result will be the API Gateway-generated default GatewayResponses collection for the supported response types.
    */
  def getGatewayResponses(): Request[GatewayResponses, AWSError] = js.native
  def getGatewayResponses(callback: js.Function2[/* err */ AWSError, /* data */ GatewayResponses, Unit]): Request[GatewayResponses, AWSError] = js.native
  /**
    * Gets the GatewayResponses collection on the given RestApi. If an API developer has not added any definitions for gateway responses, the result will be the API Gateway-generated default GatewayResponses collection for the supported response types.
    */
  def getGatewayResponses(params: GetGatewayResponsesRequest): Request[GatewayResponses, AWSError] = js.native
  def getGatewayResponses(
    params: GetGatewayResponsesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GatewayResponses, Unit]
  ): Request[GatewayResponses, AWSError] = js.native
  
  /**
    * Get the integration settings.
    */
  def getIntegration(): Request[Integration, AWSError] = js.native
  def getIntegration(callback: js.Function2[/* err */ AWSError, /* data */ Integration, Unit]): Request[Integration, AWSError] = js.native
  /**
    * Get the integration settings.
    */
  def getIntegration(params: GetIntegrationRequest): Request[Integration, AWSError] = js.native
  def getIntegration(
    params: GetIntegrationRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ Integration, Unit]
  ): Request[Integration, AWSError] = js.native
  
  /**
    * Represents a get integration response.
    */
  def getIntegrationResponse(): Request[IntegrationResponse, AWSError] = js.native
  def getIntegrationResponse(callback: js.Function2[/* err */ AWSError, /* data */ IntegrationResponse, Unit]): Request[IntegrationResponse, AWSError] = js.native
  /**
    * Represents a get integration response.
    */
  def getIntegrationResponse(params: GetIntegrationResponseRequest): Request[IntegrationResponse, AWSError] = js.native
  def getIntegrationResponse(
    params: GetIntegrationResponseRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ IntegrationResponse, Unit]
  ): Request[IntegrationResponse, AWSError] = js.native
  
  /**
    * Describe an existing Method resource.
    */
  def getMethod(): Request[Method, AWSError] = js.native
  def getMethod(callback: js.Function2[/* err */ AWSError, /* data */ Method, Unit]): Request[Method, AWSError] = js.native
  /**
    * Describe an existing Method resource.
    */
  def getMethod(params: GetMethodRequest): Request[Method, AWSError] = js.native
  def getMethod(params: GetMethodRequest, callback: js.Function2[/* err */ AWSError, /* data */ Method, Unit]): Request[Method, AWSError] = js.native
  
  /**
    * Describes a MethodResponse resource.
    */
  def getMethodResponse(): Request[MethodResponse, AWSError] = js.native
  def getMethodResponse(callback: js.Function2[/* err */ AWSError, /* data */ MethodResponse, Unit]): Request[MethodResponse, AWSError] = js.native
  /**
    * Describes a MethodResponse resource.
    */
  def getMethodResponse(params: GetMethodResponseRequest): Request[MethodResponse, AWSError] = js.native
  def getMethodResponse(
    params: GetMethodResponseRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ MethodResponse, Unit]
  ): Request[MethodResponse, AWSError] = js.native
  
  /**
    * Describes an existing model defined for a RestApi resource.
    */
  def getModel(): Request[Model, AWSError] = js.native
  def getModel(callback: js.Function2[/* err */ AWSError, /* data */ Model, Unit]): Request[Model, AWSError] = js.native
  /**
    * Describes an existing model defined for a RestApi resource.
    */
  def getModel(params: GetModelRequest): Request[Model, AWSError] = js.native
  def getModel(params: GetModelRequest, callback: js.Function2[/* err */ AWSError, /* data */ Model, Unit]): Request[Model, AWSError] = js.native
  
  /**
    * Generates a sample mapping template that can be used to transform a payload into the structure of a model.
    */
  def getModelTemplate(): Request[Template, AWSError] = js.native
  def getModelTemplate(callback: js.Function2[/* err */ AWSError, /* data */ Template, Unit]): Request[Template, AWSError] = js.native
  /**
    * Generates a sample mapping template that can be used to transform a payload into the structure of a model.
    */
  def getModelTemplate(params: GetModelTemplateRequest): Request[Template, AWSError] = js.native
  def getModelTemplate(
    params: GetModelTemplateRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ Template, Unit]
  ): Request[Template, AWSError] = js.native
  
  /**
    * Describes existing Models defined for a RestApi resource.
    */
  def getModels(): Request[Models, AWSError] = js.native
  def getModels(callback: js.Function2[/* err */ AWSError, /* data */ Models, Unit]): Request[Models, AWSError] = js.native
  /**
    * Describes existing Models defined for a RestApi resource.
    */
  def getModels(params: GetModelsRequest): Request[Models, AWSError] = js.native
  def getModels(params: GetModelsRequest, callback: js.Function2[/* err */ AWSError, /* data */ Models, Unit]): Request[Models, AWSError] = js.native
  
  /**
    * Gets a RequestValidator of a given RestApi.
    */
  def getRequestValidator(): Request[RequestValidator, AWSError] = js.native
  def getRequestValidator(callback: js.Function2[/* err */ AWSError, /* data */ RequestValidator, Unit]): Request[RequestValidator, AWSError] = js.native
  /**
    * Gets a RequestValidator of a given RestApi.
    */
  def getRequestValidator(params: GetRequestValidatorRequest): Request[RequestValidator, AWSError] = js.native
  def getRequestValidator(
    params: GetRequestValidatorRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ RequestValidator, Unit]
  ): Request[RequestValidator, AWSError] = js.native
  
  /**
    * Gets the RequestValidators collection of a given RestApi.
    */
  def getRequestValidators(): Request[RequestValidators, AWSError] = js.native
  def getRequestValidators(callback: js.Function2[/* err */ AWSError, /* data */ RequestValidators, Unit]): Request[RequestValidators, AWSError] = js.native
  /**
    * Gets the RequestValidators collection of a given RestApi.
    */
  def getRequestValidators(params: GetRequestValidatorsRequest): Request[RequestValidators, AWSError] = js.native
  def getRequestValidators(
    params: GetRequestValidatorsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ RequestValidators, Unit]
  ): Request[RequestValidators, AWSError] = js.native
  
  /**
    * Lists information about a resource.
    */
  def getResource(): Request[Resource, AWSError] = js.native
  def getResource(callback: js.Function2[/* err */ AWSError, /* data */ Resource, Unit]): Request[Resource, AWSError] = js.native
  /**
    * Lists information about a resource.
    */
  def getResource(params: GetResourceRequest): Request[Resource, AWSError] = js.native
  def getResource(params: GetResourceRequest, callback: js.Function2[/* err */ AWSError, /* data */ Resource, Unit]): Request[Resource, AWSError] = js.native
  
  /**
    * Lists information about a collection of Resource resources.
    */
  def getResources(): Request[Resources, AWSError] = js.native
  def getResources(callback: js.Function2[/* err */ AWSError, /* data */ Resources, Unit]): Request[Resources, AWSError] = js.native
  /**
    * Lists information about a collection of Resource resources.
    */
  def getResources(params: GetResourcesRequest): Request[Resources, AWSError] = js.native
  def getResources(
    params: GetResourcesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ Resources, Unit]
  ): Request[Resources, AWSError] = js.native
  
  /**
    * Lists the RestApi resource in the collection.
    */
  def getRestApi(): Request[RestApi, AWSError] = js.native
  def getRestApi(callback: js.Function2[/* err */ AWSError, /* data */ RestApi, Unit]): Request[RestApi, AWSError] = js.native
  /**
    * Lists the RestApi resource in the collection.
    */
  def getRestApi(params: GetRestApiRequest): Request[RestApi, AWSError] = js.native
  def getRestApi(params: GetRestApiRequest, callback: js.Function2[/* err */ AWSError, /* data */ RestApi, Unit]): Request[RestApi, AWSError] = js.native
  
  /**
    * Lists the RestApis resources for your collection.
    */
  def getRestApis(): Request[RestApis, AWSError] = js.native
  def getRestApis(callback: js.Function2[/* err */ AWSError, /* data */ RestApis, Unit]): Request[RestApis, AWSError] = js.native
  /**
    * Lists the RestApis resources for your collection.
    */
  def getRestApis(params: GetRestApisRequest): Request[RestApis, AWSError] = js.native
  def getRestApis(params: GetRestApisRequest, callback: js.Function2[/* err */ AWSError, /* data */ RestApis, Unit]): Request[RestApis, AWSError] = js.native
  
  /**
    * Generates a client SDK for a RestApi and Stage.
    */
  def getSdk(): Request[SdkResponse, AWSError] = js.native
  def getSdk(callback: js.Function2[/* err */ AWSError, /* data */ SdkResponse, Unit]): Request[SdkResponse, AWSError] = js.native
  /**
    * Generates a client SDK for a RestApi and Stage.
    */
  def getSdk(params: GetSdkRequest): Request[SdkResponse, AWSError] = js.native
  def getSdk(params: GetSdkRequest, callback: js.Function2[/* err */ AWSError, /* data */ SdkResponse, Unit]): Request[SdkResponse, AWSError] = js.native
  
  /**
    * Gets an SDK type.
    */
  def getSdkType(): Request[SdkType, AWSError] = js.native
  def getSdkType(callback: js.Function2[/* err */ AWSError, /* data */ SdkType, Unit]): Request[SdkType, AWSError] = js.native
  /**
    * Gets an SDK type.
    */
  def getSdkType(params: GetSdkTypeRequest): Request[SdkType, AWSError] = js.native
  def getSdkType(params: GetSdkTypeRequest, callback: js.Function2[/* err */ AWSError, /* data */ SdkType, Unit]): Request[SdkType, AWSError] = js.native
  
  /**
    * Gets SDK types
    */
  def getSdkTypes(): Request[SdkTypes, AWSError] = js.native
  def getSdkTypes(callback: js.Function2[/* err */ AWSError, /* data */ SdkTypes, Unit]): Request[SdkTypes, AWSError] = js.native
  /**
    * Gets SDK types
    */
  def getSdkTypes(params: GetSdkTypesRequest): Request[SdkTypes, AWSError] = js.native
  def getSdkTypes(params: GetSdkTypesRequest, callback: js.Function2[/* err */ AWSError, /* data */ SdkTypes, Unit]): Request[SdkTypes, AWSError] = js.native
  
  /**
    * Gets information about a Stage resource.
    */
  def getStage(): Request[Stage, AWSError] = js.native
  def getStage(callback: js.Function2[/* err */ AWSError, /* data */ Stage, Unit]): Request[Stage, AWSError] = js.native
  /**
    * Gets information about a Stage resource.
    */
  def getStage(params: GetStageRequest): Request[Stage, AWSError] = js.native
  def getStage(params: GetStageRequest, callback: js.Function2[/* err */ AWSError, /* data */ Stage, Unit]): Request[Stage, AWSError] = js.native
  
  /**
    * Gets information about one or more Stage resources.
    */
  def getStages(): Request[Stages, AWSError] = js.native
  def getStages(callback: js.Function2[/* err */ AWSError, /* data */ Stages, Unit]): Request[Stages, AWSError] = js.native
  /**
    * Gets information about one or more Stage resources.
    */
  def getStages(params: GetStagesRequest): Request[Stages, AWSError] = js.native
  def getStages(params: GetStagesRequest, callback: js.Function2[/* err */ AWSError, /* data */ Stages, Unit]): Request[Stages, AWSError] = js.native
  
  /**
    * Gets the Tags collection for a given resource.
    */
  def getTags(): Request[Tags, AWSError] = js.native
  def getTags(callback: js.Function2[/* err */ AWSError, /* data */ Tags, Unit]): Request[Tags, AWSError] = js.native
  /**
    * Gets the Tags collection for a given resource.
    */
  def getTags(params: GetTagsRequest): Request[Tags, AWSError] = js.native
  def getTags(params: GetTagsRequest, callback: js.Function2[/* err */ AWSError, /* data */ Tags, Unit]): Request[Tags, AWSError] = js.native
  
  /**
    * Gets the usage data of a usage plan in a specified time interval.
    */
  def getUsage(): Request[Usage, AWSError] = js.native
  def getUsage(callback: js.Function2[/* err */ AWSError, /* data */ Usage, Unit]): Request[Usage, AWSError] = js.native
  /**
    * Gets the usage data of a usage plan in a specified time interval.
    */
  def getUsage(params: GetUsageRequest): Request[Usage, AWSError] = js.native
  def getUsage(params: GetUsageRequest, callback: js.Function2[/* err */ AWSError, /* data */ Usage, Unit]): Request[Usage, AWSError] = js.native
  
  /**
    * Gets a usage plan of a given plan identifier.
    */
  def getUsagePlan(): Request[UsagePlan, AWSError] = js.native
  def getUsagePlan(callback: js.Function2[/* err */ AWSError, /* data */ UsagePlan, Unit]): Request[UsagePlan, AWSError] = js.native
  /**
    * Gets a usage plan of a given plan identifier.
    */
  def getUsagePlan(params: GetUsagePlanRequest): Request[UsagePlan, AWSError] = js.native
  def getUsagePlan(
    params: GetUsagePlanRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UsagePlan, Unit]
  ): Request[UsagePlan, AWSError] = js.native
  
  /**
    * Gets a usage plan key of a given key identifier.
    */
  def getUsagePlanKey(): Request[UsagePlanKey, AWSError] = js.native
  def getUsagePlanKey(callback: js.Function2[/* err */ AWSError, /* data */ UsagePlanKey, Unit]): Request[UsagePlanKey, AWSError] = js.native
  /**
    * Gets a usage plan key of a given key identifier.
    */
  def getUsagePlanKey(params: GetUsagePlanKeyRequest): Request[UsagePlanKey, AWSError] = js.native
  def getUsagePlanKey(
    params: GetUsagePlanKeyRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UsagePlanKey, Unit]
  ): Request[UsagePlanKey, AWSError] = js.native
  
  /**
    * Gets all the usage plan keys representing the API keys added to a specified usage plan.
    */
  def getUsagePlanKeys(): Request[UsagePlanKeys, AWSError] = js.native
  def getUsagePlanKeys(callback: js.Function2[/* err */ AWSError, /* data */ UsagePlanKeys, Unit]): Request[UsagePlanKeys, AWSError] = js.native
  /**
    * Gets all the usage plan keys representing the API keys added to a specified usage plan.
    */
  def getUsagePlanKeys(params: GetUsagePlanKeysRequest): Request[UsagePlanKeys, AWSError] = js.native
  def getUsagePlanKeys(
    params: GetUsagePlanKeysRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UsagePlanKeys, Unit]
  ): Request[UsagePlanKeys, AWSError] = js.native
  
  /**
    * Gets all the usage plans of the caller's account.
    */
  def getUsagePlans(): Request[UsagePlans, AWSError] = js.native
  def getUsagePlans(callback: js.Function2[/* err */ AWSError, /* data */ UsagePlans, Unit]): Request[UsagePlans, AWSError] = js.native
  /**
    * Gets all the usage plans of the caller's account.
    */
  def getUsagePlans(params: GetUsagePlansRequest): Request[UsagePlans, AWSError] = js.native
  def getUsagePlans(
    params: GetUsagePlansRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UsagePlans, Unit]
  ): Request[UsagePlans, AWSError] = js.native
  
  /**
    * Gets a specified VPC link under the caller's account in a region.
    */
  def getVpcLink(): Request[VpcLink, AWSError] = js.native
  def getVpcLink(callback: js.Function2[/* err */ AWSError, /* data */ VpcLink, Unit]): Request[VpcLink, AWSError] = js.native
  /**
    * Gets a specified VPC link under the caller's account in a region.
    */
  def getVpcLink(params: GetVpcLinkRequest): Request[VpcLink, AWSError] = js.native
  def getVpcLink(params: GetVpcLinkRequest, callback: js.Function2[/* err */ AWSError, /* data */ VpcLink, Unit]): Request[VpcLink, AWSError] = js.native
  
  /**
    * Gets the VpcLinks collection under the caller's account in a selected region.
    */
  def getVpcLinks(): Request[VpcLinks, AWSError] = js.native
  def getVpcLinks(callback: js.Function2[/* err */ AWSError, /* data */ VpcLinks, Unit]): Request[VpcLinks, AWSError] = js.native
  /**
    * Gets the VpcLinks collection under the caller's account in a selected region.
    */
  def getVpcLinks(params: GetVpcLinksRequest): Request[VpcLinks, AWSError] = js.native
  def getVpcLinks(params: GetVpcLinksRequest, callback: js.Function2[/* err */ AWSError, /* data */ VpcLinks, Unit]): Request[VpcLinks, AWSError] = js.native
  
  /**
    * Import API keys from an external source, such as a CSV-formatted file.
    */
  def importApiKeys(): Request[ApiKeyIds, AWSError] = js.native
  def importApiKeys(callback: js.Function2[/* err */ AWSError, /* data */ ApiKeyIds, Unit]): Request[ApiKeyIds, AWSError] = js.native
  /**
    * Import API keys from an external source, such as a CSV-formatted file.
    */
  def importApiKeys(params: ImportApiKeysRequest): Request[ApiKeyIds, AWSError] = js.native
  def importApiKeys(
    params: ImportApiKeysRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ApiKeyIds, Unit]
  ): Request[ApiKeyIds, AWSError] = js.native
  
  /**
    * Imports documentation parts
    */
  def importDocumentationParts(): Request[DocumentationPartIds, AWSError] = js.native
  def importDocumentationParts(callback: js.Function2[/* err */ AWSError, /* data */ DocumentationPartIds, Unit]): Request[DocumentationPartIds, AWSError] = js.native
  /**
    * Imports documentation parts
    */
  def importDocumentationParts(params: ImportDocumentationPartsRequest): Request[DocumentationPartIds, AWSError] = js.native
  def importDocumentationParts(
    params: ImportDocumentationPartsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DocumentationPartIds, Unit]
  ): Request[DocumentationPartIds, AWSError] = js.native
  
  /**
    * A feature of the API Gateway control service for creating a new API from an external API definition file.
    */
  def importRestApi(): Request[RestApi, AWSError] = js.native
  def importRestApi(callback: js.Function2[/* err */ AWSError, /* data */ RestApi, Unit]): Request[RestApi, AWSError] = js.native
  /**
    * A feature of the API Gateway control service for creating a new API from an external API definition file.
    */
  def importRestApi(params: ImportRestApiRequest): Request[RestApi, AWSError] = js.native
  def importRestApi(params: ImportRestApiRequest, callback: js.Function2[/* err */ AWSError, /* data */ RestApi, Unit]): Request[RestApi, AWSError] = js.native
  
  /**
    * Creates a customization of a GatewayResponse of a specified response type and status code on the given RestApi.
    */
  def putGatewayResponse(): Request[GatewayResponse, AWSError] = js.native
  def putGatewayResponse(callback: js.Function2[/* err */ AWSError, /* data */ GatewayResponse, Unit]): Request[GatewayResponse, AWSError] = js.native
  /**
    * Creates a customization of a GatewayResponse of a specified response type and status code on the given RestApi.
    */
  def putGatewayResponse(params: PutGatewayResponseRequest): Request[GatewayResponse, AWSError] = js.native
  def putGatewayResponse(
    params: PutGatewayResponseRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GatewayResponse, Unit]
  ): Request[GatewayResponse, AWSError] = js.native
  
  /**
    * Sets up a method's integration.
    */
  def putIntegration(): Request[Integration, AWSError] = js.native
  def putIntegration(callback: js.Function2[/* err */ AWSError, /* data */ Integration, Unit]): Request[Integration, AWSError] = js.native
  /**
    * Sets up a method's integration.
    */
  def putIntegration(params: PutIntegrationRequest): Request[Integration, AWSError] = js.native
  def putIntegration(
    params: PutIntegrationRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ Integration, Unit]
  ): Request[Integration, AWSError] = js.native
  
  /**
    * Represents a put integration.
    */
  def putIntegrationResponse(): Request[IntegrationResponse, AWSError] = js.native
  def putIntegrationResponse(callback: js.Function2[/* err */ AWSError, /* data */ IntegrationResponse, Unit]): Request[IntegrationResponse, AWSError] = js.native
  /**
    * Represents a put integration.
    */
  def putIntegrationResponse(params: PutIntegrationResponseRequest): Request[IntegrationResponse, AWSError] = js.native
  def putIntegrationResponse(
    params: PutIntegrationResponseRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ IntegrationResponse, Unit]
  ): Request[IntegrationResponse, AWSError] = js.native
  
  /**
    * Add a method to an existing Resource resource.
    */
  def putMethod(): Request[Method, AWSError] = js.native
  def putMethod(callback: js.Function2[/* err */ AWSError, /* data */ Method, Unit]): Request[Method, AWSError] = js.native
  /**
    * Add a method to an existing Resource resource.
    */
  def putMethod(params: PutMethodRequest): Request[Method, AWSError] = js.native
  def putMethod(params: PutMethodRequest, callback: js.Function2[/* err */ AWSError, /* data */ Method, Unit]): Request[Method, AWSError] = js.native
  
  /**
    * Adds a MethodResponse to an existing Method resource.
    */
  def putMethodResponse(): Request[MethodResponse, AWSError] = js.native
  def putMethodResponse(callback: js.Function2[/* err */ AWSError, /* data */ MethodResponse, Unit]): Request[MethodResponse, AWSError] = js.native
  /**
    * Adds a MethodResponse to an existing Method resource.
    */
  def putMethodResponse(params: PutMethodResponseRequest): Request[MethodResponse, AWSError] = js.native
  def putMethodResponse(
    params: PutMethodResponseRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ MethodResponse, Unit]
  ): Request[MethodResponse, AWSError] = js.native
  
  /**
    * A feature of the API Gateway control service for updating an existing API with an input of external API definitions. The update can take the form of merging the supplied definition into the existing API or overwriting the existing API.
    */
  def putRestApi(): Request[RestApi, AWSError] = js.native
  def putRestApi(callback: js.Function2[/* err */ AWSError, /* data */ RestApi, Unit]): Request[RestApi, AWSError] = js.native
  /**
    * A feature of the API Gateway control service for updating an existing API with an input of external API definitions. The update can take the form of merging the supplied definition into the existing API or overwriting the existing API.
    */
  def putRestApi(params: PutRestApiRequest): Request[RestApi, AWSError] = js.native
  def putRestApi(params: PutRestApiRequest, callback: js.Function2[/* err */ AWSError, /* data */ RestApi, Unit]): Request[RestApi, AWSError] = js.native
  
  /**
    * Adds or updates a tag on a given resource.
    */
  def tagResource(): Request[js.Object, AWSError] = js.native
  def tagResource(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Adds or updates a tag on a given resource.
    */
  def tagResource(params: TagResourceRequest): Request[js.Object, AWSError] = js.native
  def tagResource(params: TagResourceRequest, callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  
  /**
    * Simulate the execution of an Authorizer in your RestApi with headers, parameters, and an incoming request body.
    */
  def testInvokeAuthorizer(): Request[TestInvokeAuthorizerResponse, AWSError] = js.native
  def testInvokeAuthorizer(callback: js.Function2[/* err */ AWSError, /* data */ TestInvokeAuthorizerResponse, Unit]): Request[TestInvokeAuthorizerResponse, AWSError] = js.native
  /**
    * Simulate the execution of an Authorizer in your RestApi with headers, parameters, and an incoming request body.
    */
  def testInvokeAuthorizer(params: TestInvokeAuthorizerRequest): Request[TestInvokeAuthorizerResponse, AWSError] = js.native
  def testInvokeAuthorizer(
    params: TestInvokeAuthorizerRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ TestInvokeAuthorizerResponse, Unit]
  ): Request[TestInvokeAuthorizerResponse, AWSError] = js.native
  
  /**
    * Simulate the invocation of a Method in your RestApi with headers, parameters, and an incoming request body.
    */
  def testInvokeMethod(): Request[TestInvokeMethodResponse, AWSError] = js.native
  def testInvokeMethod(callback: js.Function2[/* err */ AWSError, /* data */ TestInvokeMethodResponse, Unit]): Request[TestInvokeMethodResponse, AWSError] = js.native
  /**
    * Simulate the invocation of a Method in your RestApi with headers, parameters, and an incoming request body.
    */
  def testInvokeMethod(params: TestInvokeMethodRequest): Request[TestInvokeMethodResponse, AWSError] = js.native
  def testInvokeMethod(
    params: TestInvokeMethodRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ TestInvokeMethodResponse, Unit]
  ): Request[TestInvokeMethodResponse, AWSError] = js.native
  
  /**
    * Removes a tag from a given resource.
    */
  def untagResource(): Request[js.Object, AWSError] = js.native
  def untagResource(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Removes a tag from a given resource.
    */
  def untagResource(params: UntagResourceRequest): Request[js.Object, AWSError] = js.native
  def untagResource(
    params: UntagResourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * Changes information about the current Account resource.
    */
  def updateAccount(): Request[Account, AWSError] = js.native
  def updateAccount(callback: js.Function2[/* err */ AWSError, /* data */ Account, Unit]): Request[Account, AWSError] = js.native
  /**
    * Changes information about the current Account resource.
    */
  def updateAccount(params: UpdateAccountRequest): Request[Account, AWSError] = js.native
  def updateAccount(params: UpdateAccountRequest, callback: js.Function2[/* err */ AWSError, /* data */ Account, Unit]): Request[Account, AWSError] = js.native
  
  /**
    * Changes information about an ApiKey resource.
    */
  def updateApiKey(): Request[ApiKey, AWSError] = js.native
  def updateApiKey(callback: js.Function2[/* err */ AWSError, /* data */ ApiKey, Unit]): Request[ApiKey, AWSError] = js.native
  /**
    * Changes information about an ApiKey resource.
    */
  def updateApiKey(params: UpdateApiKeyRequest): Request[ApiKey, AWSError] = js.native
  def updateApiKey(params: UpdateApiKeyRequest, callback: js.Function2[/* err */ AWSError, /* data */ ApiKey, Unit]): Request[ApiKey, AWSError] = js.native
  
  /**
    * Updates an existing Authorizer resource.
    */
  def updateAuthorizer(): Request[Authorizer, AWSError] = js.native
  def updateAuthorizer(callback: js.Function2[/* err */ AWSError, /* data */ Authorizer, Unit]): Request[Authorizer, AWSError] = js.native
  /**
    * Updates an existing Authorizer resource.
    */
  def updateAuthorizer(params: UpdateAuthorizerRequest): Request[Authorizer, AWSError] = js.native
  def updateAuthorizer(
    params: UpdateAuthorizerRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ Authorizer, Unit]
  ): Request[Authorizer, AWSError] = js.native
  
  /**
    * Changes information about the BasePathMapping resource.
    */
  def updateBasePathMapping(): Request[BasePathMapping, AWSError] = js.native
  def updateBasePathMapping(callback: js.Function2[/* err */ AWSError, /* data */ BasePathMapping, Unit]): Request[BasePathMapping, AWSError] = js.native
  /**
    * Changes information about the BasePathMapping resource.
    */
  def updateBasePathMapping(params: UpdateBasePathMappingRequest): Request[BasePathMapping, AWSError] = js.native
  def updateBasePathMapping(
    params: UpdateBasePathMappingRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ BasePathMapping, Unit]
  ): Request[BasePathMapping, AWSError] = js.native
  
  /**
    * Changes information about an ClientCertificate resource.
    */
  def updateClientCertificate(): Request[ClientCertificate, AWSError] = js.native
  def updateClientCertificate(callback: js.Function2[/* err */ AWSError, /* data */ ClientCertificate, Unit]): Request[ClientCertificate, AWSError] = js.native
  /**
    * Changes information about an ClientCertificate resource.
    */
  def updateClientCertificate(params: UpdateClientCertificateRequest): Request[ClientCertificate, AWSError] = js.native
  def updateClientCertificate(
    params: UpdateClientCertificateRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ClientCertificate, Unit]
  ): Request[ClientCertificate, AWSError] = js.native
  
  /**
    * Changes information about a Deployment resource.
    */
  def updateDeployment(): Request[Deployment, AWSError] = js.native
  def updateDeployment(callback: js.Function2[/* err */ AWSError, /* data */ Deployment, Unit]): Request[Deployment, AWSError] = js.native
  /**
    * Changes information about a Deployment resource.
    */
  def updateDeployment(params: UpdateDeploymentRequest): Request[Deployment, AWSError] = js.native
  def updateDeployment(
    params: UpdateDeploymentRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ Deployment, Unit]
  ): Request[Deployment, AWSError] = js.native
  
  /**
    * Updates a documentation part.
    */
  def updateDocumentationPart(): Request[DocumentationPart, AWSError] = js.native
  def updateDocumentationPart(callback: js.Function2[/* err */ AWSError, /* data */ DocumentationPart, Unit]): Request[DocumentationPart, AWSError] = js.native
  /**
    * Updates a documentation part.
    */
  def updateDocumentationPart(params: UpdateDocumentationPartRequest): Request[DocumentationPart, AWSError] = js.native
  def updateDocumentationPart(
    params: UpdateDocumentationPartRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DocumentationPart, Unit]
  ): Request[DocumentationPart, AWSError] = js.native
  
  /**
    * Updates a documentation version.
    */
  def updateDocumentationVersion(): Request[DocumentationVersion, AWSError] = js.native
  def updateDocumentationVersion(callback: js.Function2[/* err */ AWSError, /* data */ DocumentationVersion, Unit]): Request[DocumentationVersion, AWSError] = js.native
  /**
    * Updates a documentation version.
    */
  def updateDocumentationVersion(params: UpdateDocumentationVersionRequest): Request[DocumentationVersion, AWSError] = js.native
  def updateDocumentationVersion(
    params: UpdateDocumentationVersionRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DocumentationVersion, Unit]
  ): Request[DocumentationVersion, AWSError] = js.native
  
  /**
    * Changes information about the DomainName resource.
    */
  def updateDomainName(): Request[DomainName, AWSError] = js.native
  def updateDomainName(callback: js.Function2[/* err */ AWSError, /* data */ DomainName, Unit]): Request[DomainName, AWSError] = js.native
  /**
    * Changes information about the DomainName resource.
    */
  def updateDomainName(params: UpdateDomainNameRequest): Request[DomainName, AWSError] = js.native
  def updateDomainName(
    params: UpdateDomainNameRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DomainName, Unit]
  ): Request[DomainName, AWSError] = js.native
  
  /**
    * Updates a GatewayResponse of a specified response type on the given RestApi.
    */
  def updateGatewayResponse(): Request[GatewayResponse, AWSError] = js.native
  def updateGatewayResponse(callback: js.Function2[/* err */ AWSError, /* data */ GatewayResponse, Unit]): Request[GatewayResponse, AWSError] = js.native
  /**
    * Updates a GatewayResponse of a specified response type on the given RestApi.
    */
  def updateGatewayResponse(params: UpdateGatewayResponseRequest): Request[GatewayResponse, AWSError] = js.native
  def updateGatewayResponse(
    params: UpdateGatewayResponseRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GatewayResponse, Unit]
  ): Request[GatewayResponse, AWSError] = js.native
  
  /**
    * Represents an update integration.
    */
  def updateIntegration(): Request[Integration, AWSError] = js.native
  def updateIntegration(callback: js.Function2[/* err */ AWSError, /* data */ Integration, Unit]): Request[Integration, AWSError] = js.native
  /**
    * Represents an update integration.
    */
  def updateIntegration(params: UpdateIntegrationRequest): Request[Integration, AWSError] = js.native
  def updateIntegration(
    params: UpdateIntegrationRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ Integration, Unit]
  ): Request[Integration, AWSError] = js.native
  
  /**
    * Represents an update integration response.
    */
  def updateIntegrationResponse(): Request[IntegrationResponse, AWSError] = js.native
  def updateIntegrationResponse(callback: js.Function2[/* err */ AWSError, /* data */ IntegrationResponse, Unit]): Request[IntegrationResponse, AWSError] = js.native
  /**
    * Represents an update integration response.
    */
  def updateIntegrationResponse(params: UpdateIntegrationResponseRequest): Request[IntegrationResponse, AWSError] = js.native
  def updateIntegrationResponse(
    params: UpdateIntegrationResponseRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ IntegrationResponse, Unit]
  ): Request[IntegrationResponse, AWSError] = js.native
  
  /**
    * Updates an existing Method resource.
    */
  def updateMethod(): Request[Method, AWSError] = js.native
  def updateMethod(callback: js.Function2[/* err */ AWSError, /* data */ Method, Unit]): Request[Method, AWSError] = js.native
  /**
    * Updates an existing Method resource.
    */
  def updateMethod(params: UpdateMethodRequest): Request[Method, AWSError] = js.native
  def updateMethod(params: UpdateMethodRequest, callback: js.Function2[/* err */ AWSError, /* data */ Method, Unit]): Request[Method, AWSError] = js.native
  
  /**
    * Updates an existing MethodResponse resource.
    */
  def updateMethodResponse(): Request[MethodResponse, AWSError] = js.native
  def updateMethodResponse(callback: js.Function2[/* err */ AWSError, /* data */ MethodResponse, Unit]): Request[MethodResponse, AWSError] = js.native
  /**
    * Updates an existing MethodResponse resource.
    */
  def updateMethodResponse(params: UpdateMethodResponseRequest): Request[MethodResponse, AWSError] = js.native
  def updateMethodResponse(
    params: UpdateMethodResponseRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ MethodResponse, Unit]
  ): Request[MethodResponse, AWSError] = js.native
  
  /**
    * Changes information about a model.
    */
  def updateModel(): Request[Model, AWSError] = js.native
  def updateModel(callback: js.Function2[/* err */ AWSError, /* data */ Model, Unit]): Request[Model, AWSError] = js.native
  /**
    * Changes information about a model.
    */
  def updateModel(params: UpdateModelRequest): Request[Model, AWSError] = js.native
  def updateModel(params: UpdateModelRequest, callback: js.Function2[/* err */ AWSError, /* data */ Model, Unit]): Request[Model, AWSError] = js.native
  
  /**
    * Updates a RequestValidator of a given RestApi.
    */
  def updateRequestValidator(): Request[RequestValidator, AWSError] = js.native
  def updateRequestValidator(callback: js.Function2[/* err */ AWSError, /* data */ RequestValidator, Unit]): Request[RequestValidator, AWSError] = js.native
  /**
    * Updates a RequestValidator of a given RestApi.
    */
  def updateRequestValidator(params: UpdateRequestValidatorRequest): Request[RequestValidator, AWSError] = js.native
  def updateRequestValidator(
    params: UpdateRequestValidatorRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ RequestValidator, Unit]
  ): Request[RequestValidator, AWSError] = js.native
  
  /**
    * Changes information about a Resource resource.
    */
  def updateResource(): Request[Resource, AWSError] = js.native
  def updateResource(callback: js.Function2[/* err */ AWSError, /* data */ Resource, Unit]): Request[Resource, AWSError] = js.native
  /**
    * Changes information about a Resource resource.
    */
  def updateResource(params: UpdateResourceRequest): Request[Resource, AWSError] = js.native
  def updateResource(
    params: UpdateResourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ Resource, Unit]
  ): Request[Resource, AWSError] = js.native
  
  /**
    * Changes information about the specified API.
    */
  def updateRestApi(): Request[RestApi, AWSError] = js.native
  def updateRestApi(callback: js.Function2[/* err */ AWSError, /* data */ RestApi, Unit]): Request[RestApi, AWSError] = js.native
  /**
    * Changes information about the specified API.
    */
  def updateRestApi(params: UpdateRestApiRequest): Request[RestApi, AWSError] = js.native
  def updateRestApi(params: UpdateRestApiRequest, callback: js.Function2[/* err */ AWSError, /* data */ RestApi, Unit]): Request[RestApi, AWSError] = js.native
  
  /**
    * Changes information about a Stage resource.
    */
  def updateStage(): Request[Stage, AWSError] = js.native
  def updateStage(callback: js.Function2[/* err */ AWSError, /* data */ Stage, Unit]): Request[Stage, AWSError] = js.native
  /**
    * Changes information about a Stage resource.
    */
  def updateStage(params: UpdateStageRequest): Request[Stage, AWSError] = js.native
  def updateStage(params: UpdateStageRequest, callback: js.Function2[/* err */ AWSError, /* data */ Stage, Unit]): Request[Stage, AWSError] = js.native
  
  /**
    * Grants a temporary extension to the remaining quota of a usage plan associated with a specified API key.
    */
  def updateUsage(): Request[Usage, AWSError] = js.native
  def updateUsage(callback: js.Function2[/* err */ AWSError, /* data */ Usage, Unit]): Request[Usage, AWSError] = js.native
  /**
    * Grants a temporary extension to the remaining quota of a usage plan associated with a specified API key.
    */
  def updateUsage(params: UpdateUsageRequest): Request[Usage, AWSError] = js.native
  def updateUsage(params: UpdateUsageRequest, callback: js.Function2[/* err */ AWSError, /* data */ Usage, Unit]): Request[Usage, AWSError] = js.native
  
  /**
    * Updates a usage plan of a given plan Id.
    */
  def updateUsagePlan(): Request[UsagePlan, AWSError] = js.native
  def updateUsagePlan(callback: js.Function2[/* err */ AWSError, /* data */ UsagePlan, Unit]): Request[UsagePlan, AWSError] = js.native
  /**
    * Updates a usage plan of a given plan Id.
    */
  def updateUsagePlan(params: UpdateUsagePlanRequest): Request[UsagePlan, AWSError] = js.native
  def updateUsagePlan(
    params: UpdateUsagePlanRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UsagePlan, Unit]
  ): Request[UsagePlan, AWSError] = js.native
  
  /**
    * Updates an existing VpcLink of a specified identifier.
    */
  def updateVpcLink(): Request[VpcLink, AWSError] = js.native
  def updateVpcLink(callback: js.Function2[/* err */ AWSError, /* data */ VpcLink, Unit]): Request[VpcLink, AWSError] = js.native
  /**
    * Updates an existing VpcLink of a specified identifier.
    */
  def updateVpcLink(params: UpdateVpcLinkRequest): Request[VpcLink, AWSError] = js.native
  def updateVpcLink(params: UpdateVpcLinkRequest, callback: js.Function2[/* err */ AWSError, /* data */ VpcLink, Unit]): Request[VpcLink, AWSError] = js.native
}
