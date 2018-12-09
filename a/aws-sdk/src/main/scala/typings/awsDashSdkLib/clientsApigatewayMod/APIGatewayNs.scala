package typings
package awsDashSdkLib.clientsApigatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("aws-sdk/clients/apigateway", "APIGateway")
@js.native
object APIGatewayNs extends js.Object {
  
  trait AccessLogSettings extends js.Object {
    /**
         * The ARN of the CloudWatch Logs log group to receive access logs.
         */
    var destinationArn: js.UndefOr[String] = js.undefined
    /**
         * A single line format of the access logs of data, as specified by selected $context variables. The format must include at least $context.requestId.
         */
    var format: js.UndefOr[String] = js.undefined
  }
  
  
  trait Account extends js.Object {
    /**
         * The version of the API keys used for the account.
         */
    var apiKeyVersion: js.UndefOr[String] = js.undefined
    /**
         * The ARN of an Amazon CloudWatch role for the current Account. 
         */
    var cloudwatchRoleArn: js.UndefOr[String] = js.undefined
    /**
         * A list of features supported for the account. When usage plans are enabled, the features list will include an entry of "UsagePlans".
         */
    var features: js.UndefOr[ListOfString] = js.undefined
    /**
         * Specifies the API request limits configured for the current Account.
         */
    var throttleSettings: js.UndefOr[ThrottleSettings] = js.undefined
  }
  
  
  trait ApiKey extends js.Object {
    /**
         * The timestamp when the API Key was created.
         */
    var createdDate: js.UndefOr[Timestamp] = js.undefined
    /**
         * An AWS Marketplace customer identifier , when integrating with the AWS SaaS Marketplace.
         */
    var customerId: js.UndefOr[String] = js.undefined
    /**
         * The description of the API Key.
         */
    var description: js.UndefOr[String] = js.undefined
    /**
         * Specifies whether the API Key can be used by callers.
         */
    var enabled: js.UndefOr[Boolean] = js.undefined
    /**
         * The identifier of the API Key.
         */
    var id: js.UndefOr[String] = js.undefined
    /**
         * The timestamp when the API Key was last updated.
         */
    var lastUpdatedDate: js.UndefOr[Timestamp] = js.undefined
    /**
         * The name of the API Key.
         */
    var name: js.UndefOr[String] = js.undefined
    /**
         * A list of Stage resources that are associated with the ApiKey resource.
         */
    var stageKeys: js.UndefOr[ListOfString] = js.undefined
    /**
         * The value of the API Key.
         */
    var value: js.UndefOr[String] = js.undefined
  }
  
  
  trait ApiKeyIds extends js.Object {
    /**
         * A list of all the ApiKey identifiers.
         */
    var ids: js.UndefOr[ListOfString] = js.undefined
    /**
         * A list of warning messages.
         */
    var warnings: js.UndefOr[ListOfString] = js.undefined
  }
  
  
  trait ApiKeys extends js.Object {
    /**
         * The current page of elements from this collection.
         */
    var items: js.UndefOr[ListOfApiKey] = js.undefined
    var position: js.UndefOr[String] = js.undefined
    /**
         * A list of warning messages logged during the import of API keys when the failOnWarnings option is set to true.
         */
    var warnings: js.UndefOr[ListOfString] = js.undefined
  }
  
  
  trait ApiStage extends js.Object {
    /**
         * API Id of the associated API stage in a usage plan.
         */
    var apiId: js.UndefOr[String] = js.undefined
    /**
         * API stage name of the associated API stage in a usage plan.
         */
    var stage: js.UndefOr[String] = js.undefined
    /**
         * Map containing method level throttling information for API stage in a usage plan.
         */
    var throttle: js.UndefOr[MapOfApiStageThrottleSettings] = js.undefined
  }
  
  
  trait Authorizer extends js.Object {
    /**
         * Optional customer-defined field, used in OpenAPI imports and exports without functional impact.
         */
    var authType: js.UndefOr[String] = js.undefined
    /**
         * Specifies the required credentials as an IAM role for API Gateway to invoke the authorizer. To specify an IAM role for API Gateway to assume, use the role's Amazon Resource Name (ARN). To use resource-based permissions on the Lambda function, specify null.
         */
    var authorizerCredentials: js.UndefOr[String] = js.undefined
    /**
         * The TTL in seconds of cached authorizer results. If it equals 0, authorization caching is disabled. If it is greater than 0, API Gateway will cache authorizer responses. If this field is not set, the default value is 300. The maximum value is 3600, or 1 hour.
         */
    var authorizerResultTtlInSeconds: js.UndefOr[NullableInteger] = js.undefined
    /**
         * Specifies the authorizer's Uniform Resource Identifier (URI). For TOKEN or REQUEST authorizers, this must be a well-formed Lambda function URI, for example, arn:aws:apigateway:us-west-2:lambda:path/2015-03-31/functions/arn:aws:lambda:us-west-2:{account_id}:function:{lambda_function_name}/invocations. In general, the URI has this form arn:aws:apigateway:{region}:lambda:path/{service_api}, where {region} is the same as the region hosting the Lambda function, path indicates that the remaining substring in the URI should be treated as the path to the resource, including the initial /. For Lambda functions, this is usually of the form /2015-03-31/functions/[FunctionARN]/invocations.
         */
    var authorizerUri: js.UndefOr[String] = js.undefined
    /**
         * The identifier for the authorizer resource.
         */
    var id: js.UndefOr[String] = js.undefined
    /**
         * The identity source for which authorization is requested. For a TOKEN or COGNITO_USER_POOLS authorizer, this is required and specifies the request header mapping expression for the custom header holding the authorization token submitted by the client. For example, if the token header name is Auth, the header mapping expression is method.request.header.Auth.For the REQUEST authorizer, this is required when authorization caching is enabled. The value is a comma-separated string of one or more mapping expressions of the specified request parameters. For example, if an Auth header, a Name query string parameter are defined as identity sources, this value is method.request.header.Auth, method.request.querystring.Name. These parameters will be used to derive the authorization caching key and to perform runtime validation of the REQUEST authorizer by verifying all of the identity-related request parameters are present, not null and non-empty. Only when this is true does the authorizer invoke the authorizer Lambda function, otherwise, it returns a 401 Unauthorized response without calling the Lambda function. The valid value is a string of comma-separated mapping expressions of the specified request parameters. When the authorization caching is not enabled, this property is optional.
         */
    var identitySource: js.UndefOr[String] = js.undefined
    /**
         * A validation expression for the incoming identity token. For TOKEN authorizers, this value is a regular expression. API Gateway will match the aud field of the incoming token from the client against the specified regular expression. It will invoke the authorizer's Lambda function when there is a match. Otherwise, it will return a 401 Unauthorized response without calling the Lambda function. The validation expression does not apply to the REQUEST authorizer.
         */
    var identityValidationExpression: js.UndefOr[String] = js.undefined
    /**
         * [Required] The name of the authorizer.
         */
    var name: js.UndefOr[String] = js.undefined
    /**
         * A list of the Amazon Cognito user pool ARNs for the COGNITO_USER_POOLS authorizer. Each element is of this format: arn:aws:cognito-idp:{region}:{account_id}:userpool/{user_pool_id}. For a TOKEN or REQUEST authorizer, this is not defined. 
         */
    var providerARNs: js.UndefOr[ListOfARNs] = js.undefined
    /**
         * The authorizer type. Valid values are TOKEN for a Lambda function using a single authorization token submitted in a custom header, REQUEST for a Lambda function using incoming request parameters, and COGNITO_USER_POOLS for using an Amazon Cognito user pool.
         */
    var `type`: js.UndefOr[AuthorizerType] = js.undefined
  }
  
  
  trait Authorizers extends js.Object {
    /**
         * The current page of elements from this collection.
         */
    var items: js.UndefOr[ListOfAuthorizer] = js.undefined
    var position: js.UndefOr[String] = js.undefined
  }
  
  
  trait BasePathMapping extends js.Object {
    /**
         * The base path name that callers of the API must provide as part of the URL after the domain name.
         */
    var basePath: js.UndefOr[String] = js.undefined
    /**
         * The string identifier of the associated RestApi.
         */
    var restApiId: js.UndefOr[String] = js.undefined
    /**
         * The name of the associated stage.
         */
    var stage: js.UndefOr[String] = js.undefined
  }
  
  
  trait BasePathMappings extends js.Object {
    /**
         * The current page of elements from this collection.
         */
    var items: js.UndefOr[ListOfBasePathMapping] = js.undefined
    var position: js.UndefOr[String] = js.undefined
  }
  
  
  trait CanarySettings extends js.Object {
    /**
         * The ID of the canary deployment.
         */
    var deploymentId: js.UndefOr[String] = js.undefined
    /**
         * The percent (0-100) of traffic diverted to a canary deployment.
         */
    var percentTraffic: js.UndefOr[Double] = js.undefined
    /**
         * Stage variables overridden for a canary release deployment, including new stage variables introduced in the canary. These stage variables are represented as a string-to-string map between stage variable names and their values.
         */
    var stageVariableOverrides: js.UndefOr[MapOfStringToString] = js.undefined
    /**
         * A Boolean flag to indicate whether the canary deployment uses the stage cache or not.
         */
    var useStageCache: js.UndefOr[Boolean] = js.undefined
  }
  
  
  trait ClientApiVersions extends js.Object {
    /**
         * A string in YYYY-MM-DD format that represents the latest possible API version that can be used in this service. Specify 'latest' to use the latest possible version.
         */
    var apiVersion: js.UndefOr[apiVersion] = js.undefined
  }
  
  
  trait ClientCertificate extends js.Object {
    /**
         * The identifier of the client certificate.
         */
    var clientCertificateId: js.UndefOr[String] = js.undefined
    /**
         * The timestamp when the client certificate was created.
         */
    var createdDate: js.UndefOr[Timestamp] = js.undefined
    /**
         * The description of the client certificate.
         */
    var description: js.UndefOr[String] = js.undefined
    /**
         * The timestamp when the client certificate will expire.
         */
    var expirationDate: js.UndefOr[Timestamp] = js.undefined
    /**
         * The PEM-encoded public key of the client certificate, which can be used to configure certificate authentication in the integration endpoint .
         */
    var pemEncodedCertificate: js.UndefOr[String] = js.undefined
  }
  
  
  trait ClientCertificates extends js.Object {
    /**
         * The current page of elements from this collection.
         */
    var items: js.UndefOr[ListOfClientCertificate] = js.undefined
    var position: js.UndefOr[String] = js.undefined
  }
  
  
  trait CreateApiKeyRequest extends js.Object {
    /**
         * An AWS Marketplace customer identifier , when integrating with the AWS SaaS Marketplace.
         */
    var customerId: js.UndefOr[String] = js.undefined
    /**
         * The description of the ApiKey.
         */
    var description: js.UndefOr[String] = js.undefined
    /**
         * Specifies whether the ApiKey can be used by callers.
         */
    var enabled: js.UndefOr[Boolean] = js.undefined
    /**
         * Specifies whether (true) or not (false) the key identifier is distinct from the created API key value.
         */
    var generateDistinctId: js.UndefOr[Boolean] = js.undefined
    /**
         * The name of the ApiKey.
         */
    var name: js.UndefOr[String] = js.undefined
    /**
         * DEPRECATED FOR USAGE PLANS - Specifies stages associated with the API key.
         */
    var stageKeys: js.UndefOr[ListOfStageKeys] = js.undefined
    /**
         * Specifies a value of the API key.
         */
    var value: js.UndefOr[String] = js.undefined
  }
  
  
  trait CreateAuthorizerRequest extends js.Object {
    /**
         * Optional customer-defined field, used in OpenAPI imports and exports without functional impact.
         */
    var authType: js.UndefOr[String] = js.undefined
    /**
         * Specifies the required credentials as an IAM role for API Gateway to invoke the authorizer. To specify an IAM role for API Gateway to assume, use the role's Amazon Resource Name (ARN). To use resource-based permissions on the Lambda function, specify null.
         */
    var authorizerCredentials: js.UndefOr[String] = js.undefined
    /**
         * The TTL in seconds of cached authorizer results. If it equals 0, authorization caching is disabled. If it is greater than 0, API Gateway will cache authorizer responses. If this field is not set, the default value is 300. The maximum value is 3600, or 1 hour.
         */
    var authorizerResultTtlInSeconds: js.UndefOr[NullableInteger] = js.undefined
    /**
         * Specifies the authorizer's Uniform Resource Identifier (URI). For TOKEN or REQUEST authorizers, this must be a well-formed Lambda function URI, for example, arn:aws:apigateway:us-west-2:lambda:path/2015-03-31/functions/arn:aws:lambda:us-west-2:{account_id}:function:{lambda_function_name}/invocations. In general, the URI has this form arn:aws:apigateway:{region}:lambda:path/{service_api}, where {region} is the same as the region hosting the Lambda function, path indicates that the remaining substring in the URI should be treated as the path to the resource, including the initial /. For Lambda functions, this is usually of the form /2015-03-31/functions/[FunctionARN]/invocations.
         */
    var authorizerUri: js.UndefOr[String] = js.undefined
    /**
         * The identity source for which authorization is requested. For a TOKEN or COGNITO_USER_POOLS authorizer, this is required and specifies the request header mapping expression for the custom header holding the authorization token submitted by the client. For example, if the token header name is Auth, the header mapping expression is method.request.header.Auth.For the REQUEST authorizer, this is required when authorization caching is enabled. The value is a comma-separated string of one or more mapping expressions of the specified request parameters. For example, if an Auth header, a Name query string parameter are defined as identity sources, this value is method.request.header.Auth, method.request.querystring.Name. These parameters will be used to derive the authorization caching key and to perform runtime validation of the REQUEST authorizer by verifying all of the identity-related request parameters are present, not null and non-empty. Only when this is true does the authorizer invoke the authorizer Lambda function, otherwise, it returns a 401 Unauthorized response without calling the Lambda function. The valid value is a string of comma-separated mapping expressions of the specified request parameters. When the authorization caching is not enabled, this property is optional.
         */
    var identitySource: js.UndefOr[String] = js.undefined
    /**
         * A validation expression for the incoming identity token. For TOKEN authorizers, this value is a regular expression. API Gateway will match the aud field of the incoming token from the client against the specified regular expression. It will invoke the authorizer's Lambda function when there is a match. Otherwise, it will return a 401 Unauthorized response without calling the Lambda function. The validation expression does not apply to the REQUEST authorizer.
         */
    var identityValidationExpression: js.UndefOr[String] = js.undefined
    /**
         * [Required] The name of the authorizer.
         */
    var name: String
    /**
         * A list of the Amazon Cognito user pool ARNs for the COGNITO_USER_POOLS authorizer. Each element is of this format: arn:aws:cognito-idp:{region}:{account_id}:userpool/{user_pool_id}. For a TOKEN or REQUEST authorizer, this is not defined. 
         */
    var providerARNs: js.UndefOr[ListOfARNs] = js.undefined
    /**
         * [Required] The string identifier of the associated RestApi.
         */
    var restApiId: String
    /**
         * [Required] The authorizer type. Valid values are TOKEN for a Lambda function using a single authorization token submitted in a custom header, REQUEST for a Lambda function using incoming request parameters, and COGNITO_USER_POOLS for using an Amazon Cognito user pool.
         */
    var `type`: AuthorizerType
  }
  
  
  trait CreateBasePathMappingRequest extends js.Object {
    /**
         * The base path name that callers of the API must provide as part of the URL after the domain name. This value must be unique for all of the mappings across a single API. Leave this blank if you do not want callers to specify a base path name after the domain name.
         */
    var basePath: js.UndefOr[String] = js.undefined
    /**
         * [Required] The domain name of the BasePathMapping resource to create.
         */
    var domainName: String
    /**
         * [Required] The string identifier of the associated RestApi.
         */
    var restApiId: String
    /**
         * The name of the API's stage that you want to use for this mapping. Leave this blank if you do not want callers to explicitly specify the stage name after any base path name.
         */
    var stage: js.UndefOr[String] = js.undefined
  }
  
  
  trait CreateDeploymentRequest extends js.Object {
    /**
         * Enables a cache cluster for the Stage resource specified in the input.
         */
    var cacheClusterEnabled: js.UndefOr[NullableBoolean] = js.undefined
    /**
         * Specifies the cache cluster size for the Stage resource specified in the input, if a cache cluster is enabled.
         */
    var cacheClusterSize: js.UndefOr[CacheClusterSize] = js.undefined
    /**
         * The input configuration for the canary deployment when the deployment is a canary release deployment. 
         */
    var canarySettings: js.UndefOr[DeploymentCanarySettings] = js.undefined
    /**
         * The description for the Deployment resource to create.
         */
    var description: js.UndefOr[String] = js.undefined
    /**
         * [Required] The string identifier of the associated RestApi.
         */
    var restApiId: String
    /**
         * The description of the Stage resource for the Deployment resource to create.
         */
    var stageDescription: js.UndefOr[String] = js.undefined
    /**
         * The name of the Stage resource for the Deployment resource to create.
         */
    var stageName: js.UndefOr[String] = js.undefined
    /**
         * Specifies whether active tracing with X-ray is enabled for the Stage.
         */
    var tracingEnabled: js.UndefOr[NullableBoolean] = js.undefined
    /**
         * A map that defines the stage variables for the Stage resource that is associated with the new deployment. Variable names can have alphanumeric and underscore characters, and the values must match [A-Za-z0-9-._~:/?#&amp;=,]+.
         */
    var variables: js.UndefOr[MapOfStringToString] = js.undefined
  }
  
  
  trait CreateDocumentationPartRequest extends js.Object {
    /**
         * [Required] The location of the targeted API entity of the to-be-created documentation part.
         */
    var location: DocumentationPartLocation
    /**
         * [Required] The new documentation content map of the targeted API entity. Enclosed key-value pairs are API-specific, but only OpenAPI-compliant key-value pairs can be exported and, hence, published.
         */
    var properties: String
    /**
         * [Required] The string identifier of the associated RestApi.
         */
    var restApiId: String
  }
  
  
  trait CreateDocumentationVersionRequest extends js.Object {
    /**
         * A description about the new documentation snapshot.
         */
    var description: js.UndefOr[String] = js.undefined
    /**
         * [Required] The version identifier of the new snapshot.
         */
    var documentationVersion: String
    /**
         * [Required] The string identifier of the associated RestApi.
         */
    var restApiId: String
    /**
         * The stage name to be associated with the new documentation snapshot.
         */
    var stageName: js.UndefOr[String] = js.undefined
  }
  
  
  trait CreateDomainNameRequest extends js.Object {
    /**
         * The reference to an AWS-managed certificate that will be used by edge-optimized endpoint for this domain name. AWS Certificate Manager is the only supported source.
         */
    var certificateArn: js.UndefOr[String] = js.undefined
    /**
         * [Deprecated] The body of the server certificate that will be used by edge-optimized endpoint for this domain name provided by your certificate authority.
         */
    var certificateBody: js.UndefOr[String] = js.undefined
    /**
         * [Deprecated] The intermediate certificates and optionally the root certificate, one after the other without any blank lines, used by an edge-optimized endpoint for this domain name. If you include the root certificate, your certificate chain must start with intermediate certificates and end with the root certificate. Use the intermediate certificates that were provided by your certificate authority. Do not include any intermediaries that are not in the chain of trust path.
         */
    var certificateChain: js.UndefOr[String] = js.undefined
    /**
         * The user-friendly name of the certificate that will be used by edge-optimized endpoint for this domain name.
         */
    var certificateName: js.UndefOr[String] = js.undefined
    /**
         * [Deprecated] Your edge-optimized endpoint's domain name certificate's private key.
         */
    var certificatePrivateKey: js.UndefOr[String] = js.undefined
    /**
         * [Required] The name of the DomainName resource.
         */
    var domainName: String
    /**
         * The endpoint configuration of this DomainName showing the endpoint types of the domain name. 
         */
    var endpointConfiguration: js.UndefOr[EndpointConfiguration] = js.undefined
    /**
         * The reference to an AWS-managed certificate that will be used by regional endpoint for this domain name. AWS Certificate Manager is the only supported source.
         */
    var regionalCertificateArn: js.UndefOr[String] = js.undefined
    /**
         * The user-friendly name of the certificate that will be used by regional endpoint for this domain name.
         */
    var regionalCertificateName: js.UndefOr[String] = js.undefined
  }
  
  
  trait CreateModelRequest extends js.Object {
    /**
         * [Required] The content-type for the model.
         */
    var contentType: String
    /**
         * The description of the model.
         */
    var description: js.UndefOr[String] = js.undefined
    /**
         * [Required] The name of the model. Must be alphanumeric.
         */
    var name: String
    /**
         * [Required] The RestApi identifier under which the Model will be created.
         */
    var restApiId: String
    /**
         * The schema for the model. For application/json models, this should be JSON schema draft 4 model.
         */
    var schema: js.UndefOr[String] = js.undefined
  }
  
  
  trait CreateRequestValidatorRequest extends js.Object {
    /**
         * The name of the to-be-created RequestValidator.
         */
    var name: js.UndefOr[String] = js.undefined
    /**
         * [Required] The string identifier of the associated RestApi.
         */
    var restApiId: String
    /**
         * A Boolean flag to indicate whether to validate request body according to the configured model schema for the method (true) or not (false).
         */
    var validateRequestBody: js.UndefOr[Boolean] = js.undefined
    /**
         * A Boolean flag to indicate whether to validate request parameters, true, or not false.
         */
    var validateRequestParameters: js.UndefOr[Boolean] = js.undefined
  }
  
  
  trait CreateResourceRequest extends js.Object {
    /**
         * [Required] The parent resource's identifier.
         */
    var parentId: String
    /**
         * The last path segment for this resource.
         */
    var pathPart: String
    /**
         * [Required] The string identifier of the associated RestApi.
         */
    var restApiId: String
  }
  
  
  trait CreateRestApiRequest extends js.Object {
    /**
         * The source of the API key for metering requests according to a usage plan. Valid values are: HEADER to read the API key from the X-API-Key header of a request. AUTHORIZER to read the API key from the UsageIdentifierKey from a custom authorizer. 
         */
    var apiKeySource: js.UndefOr[ApiKeySourceType] = js.undefined
    /**
         * The list of binary media types supported by the RestApi. By default, the RestApi supports only UTF-8-encoded text payloads.
         */
    var binaryMediaTypes: js.UndefOr[ListOfString] = js.undefined
    /**
         * The ID of the RestApi that you want to clone from.
         */
    var cloneFrom: js.UndefOr[String] = js.undefined
    /**
         * The description of the RestApi.
         */
    var description: js.UndefOr[String] = js.undefined
    /**
         * The endpoint configuration of this RestApi showing the endpoint types of the API. 
         */
    var endpointConfiguration: js.UndefOr[EndpointConfiguration] = js.undefined
    /**
         * A nullable integer that is used to enable compression (with non-negative between 0 and 10485760 (10M) bytes, inclusive) or disable compression (with a null value) on an API. When compression is enabled, compression or decompression is not applied on the payload if the payload size is smaller than this value. Setting it to zero allows compression for any payload size.
         */
    var minimumCompressionSize: js.UndefOr[NullableInteger] = js.undefined
    /**
         * [Required] The name of the RestApi.
         */
    var name: String
    /**
         * A stringified JSON policy document that applies to this RestApi regardless of the caller and Method configuration.
         */
    var policy: js.UndefOr[String] = js.undefined
    /**
         * A version identifier for the API.
         */
    var version: js.UndefOr[String] = js.undefined
  }
  
  
  trait CreateStageRequest extends js.Object {
    /**
         * Whether cache clustering is enabled for the stage.
         */
    var cacheClusterEnabled: js.UndefOr[Boolean] = js.undefined
    /**
         * The stage's cache cluster size.
         */
    var cacheClusterSize: js.UndefOr[CacheClusterSize] = js.undefined
    /**
         * The canary deployment settings of this stage.
         */
    var canarySettings: js.UndefOr[CanarySettings] = js.undefined
    /**
         * [Required] The identifier of the Deployment resource for the Stage resource.
         */
    var deploymentId: String
    /**
         * The description of the Stage resource.
         */
    var description: js.UndefOr[String] = js.undefined
    /**
         * The version of the associated API documentation.
         */
    var documentationVersion: js.UndefOr[String] = js.undefined
    /**
         * [Required] The string identifier of the associated RestApi.
         */
    var restApiId: String
    /**
         * [Required] The name for the Stage resource.
         */
    var stageName: String
    /**
         * The key-value map of strings. The valid character set is [a-zA-Z+-=._:/]. The tag key can be up to 128 characters and must not start with aws:. The tag value can be up to 256 characters.
         */
    var tags: js.UndefOr[MapOfStringToString] = js.undefined
    /**
         * Specifies whether active tracing with X-ray is enabled for the Stage.
         */
    var tracingEnabled: js.UndefOr[Boolean] = js.undefined
    /**
         * A map that defines the stage variables for the new Stage resource. Variable names can have alphanumeric and underscore characters, and the values must match [A-Za-z0-9-._~:/?#&amp;=,]+.
         */
    var variables: js.UndefOr[MapOfStringToString] = js.undefined
  }
  
  
  trait CreateUsagePlanKeyRequest extends js.Object {
    /**
         * [Required] The identifier of a UsagePlanKey resource for a plan customer.
         */
    var keyId: String
    /**
         * [Required] The type of a UsagePlanKey resource for a plan customer.
         */
    var keyType: String
    /**
         * [Required] The Id of the UsagePlan resource representing the usage plan containing the to-be-created UsagePlanKey resource representing a plan customer.
         */
    var usagePlanId: String
  }
  
  
  trait CreateUsagePlanRequest extends js.Object {
    /**
         * The associated API stages of the usage plan.
         */
    var apiStages: js.UndefOr[ListOfApiStage] = js.undefined
    /**
         * The description of the usage plan.
         */
    var description: js.UndefOr[String] = js.undefined
    /**
         * [Required] The name of the usage plan.
         */
    var name: String
    /**
         * The quota of the usage plan.
         */
    var quota: js.UndefOr[QuotaSettings] = js.undefined
    /**
         * The throttling limits of the usage plan.
         */
    var throttle: js.UndefOr[ThrottleSettings] = js.undefined
  }
  
  
  trait CreateVpcLinkRequest extends js.Object {
    /**
         * The description of the VPC link.
         */
    var description: js.UndefOr[String] = js.undefined
    /**
         * [Required] The name used to label and identify the VPC link.
         */
    var name: String
    /**
         * [Required] The ARNs of network load balancers of the VPC targeted by the VPC link. The network load balancers must be owned by the same AWS account of the API owner.
         */
    var targetArns: ListOfString
  }
  
  
  trait DeleteApiKeyRequest extends js.Object {
    /**
         * [Required] The identifier of the ApiKey resource to be deleted.
         */
    var apiKey: String
  }
  
  
  trait DeleteAuthorizerRequest extends js.Object {
    /**
         * [Required] The identifier of the Authorizer resource.
         */
    var authorizerId: String
    /**
         * [Required] The string identifier of the associated RestApi.
         */
    var restApiId: String
  }
  
  
  trait DeleteBasePathMappingRequest extends js.Object {
    /**
         * [Required] The base path name of the BasePathMapping resource to delete.
         */
    var basePath: String
    /**
         * [Required] The domain name of the BasePathMapping resource to delete.
         */
    var domainName: String
  }
  
  
  trait DeleteClientCertificateRequest extends js.Object {
    /**
         * [Required] The identifier of the ClientCertificate resource to be deleted.
         */
    var clientCertificateId: String
  }
  
  
  trait DeleteDeploymentRequest extends js.Object {
    /**
         * [Required] The identifier of the Deployment resource to delete.
         */
    var deploymentId: String
    /**
         * [Required] The string identifier of the associated RestApi.
         */
    var restApiId: String
  }
  
  
  trait DeleteDocumentationPartRequest extends js.Object {
    /**
         * [Required] The identifier of the to-be-deleted documentation part.
         */
    var documentationPartId: String
    /**
         * [Required] The string identifier of the associated RestApi.
         */
    var restApiId: String
  }
  
  
  trait DeleteDocumentationVersionRequest extends js.Object {
    /**
         * [Required] The version identifier of a to-be-deleted documentation snapshot.
         */
    var documentationVersion: String
    /**
         * [Required] The string identifier of the associated RestApi.
         */
    var restApiId: String
  }
  
  
  trait DeleteDomainNameRequest extends js.Object {
    /**
         * [Required] The name of the DomainName resource to be deleted.
         */
    var domainName: String
  }
  
  
  trait DeleteGatewayResponseRequest extends js.Object {
    /**
         * [Required] The response type of the associated GatewayResponse. Valid values are ACCESS_DENIEDAPI_CONFIGURATION_ERRORAUTHORIZER_FAILURE AUTHORIZER_CONFIGURATION_ERRORBAD_REQUEST_PARAMETERSBAD_REQUEST_BODYDEFAULT_4XXDEFAULT_5XXEXPIRED_TOKENINVALID_SIGNATUREINTEGRATION_FAILUREINTEGRATION_TIMEOUTINVALID_API_KEYMISSING_AUTHENTICATION_TOKEN QUOTA_EXCEEDEDREQUEST_TOO_LARGERESOURCE_NOT_FOUNDTHROTTLEDUNAUTHORIZEDUNSUPPORTED_MEDIA_TYPE 
         */
    var responseType: GatewayResponseType
    /**
         * [Required] The string identifier of the associated RestApi.
         */
    var restApiId: String
  }
  
  
  trait DeleteIntegrationRequest extends js.Object {
    /**
         * [Required] Specifies a delete integration request's HTTP method.
         */
    var httpMethod: String
    /**
         * [Required] Specifies a delete integration request's resource identifier.
         */
    var resourceId: String
    /**
         * [Required] The string identifier of the associated RestApi.
         */
    var restApiId: String
  }
  
  
  trait DeleteIntegrationResponseRequest extends js.Object {
    /**
         * [Required] Specifies a delete integration response request's HTTP method.
         */
    var httpMethod: String
    /**
         * [Required] Specifies a delete integration response request's resource identifier.
         */
    var resourceId: String
    /**
         * [Required] The string identifier of the associated RestApi.
         */
    var restApiId: String
    /**
         * [Required] Specifies a delete integration response request's status code.
         */
    var statusCode: StatusCode
  }
  
  
  trait DeleteMethodRequest extends js.Object {
    /**
         * [Required] The HTTP verb of the Method resource.
         */
    var httpMethod: String
    /**
         * [Required] The Resource identifier for the Method resource.
         */
    var resourceId: String
    /**
         * [Required] The string identifier of the associated RestApi.
         */
    var restApiId: String
  }
  
  
  trait DeleteMethodResponseRequest extends js.Object {
    /**
         * [Required] The HTTP verb of the Method resource.
         */
    var httpMethod: String
    /**
         * [Required] The Resource identifier for the MethodResponse resource.
         */
    var resourceId: String
    /**
         * [Required] The string identifier of the associated RestApi.
         */
    var restApiId: String
    /**
         * [Required] The status code identifier for the MethodResponse resource.
         */
    var statusCode: StatusCode
  }
  
  
  trait DeleteModelRequest extends js.Object {
    /**
         * [Required] The name of the model to delete.
         */
    var modelName: String
    /**
         * [Required] The string identifier of the associated RestApi.
         */
    var restApiId: String
  }
  
  
  trait DeleteRequestValidatorRequest extends js.Object {
    /**
         * [Required] The identifier of the RequestValidator to be deleted.
         */
    var requestValidatorId: String
    /**
         * [Required] The string identifier of the associated RestApi.
         */
    var restApiId: String
  }
  
  
  trait DeleteResourceRequest extends js.Object {
    /**
         * [Required] The identifier of the Resource resource.
         */
    var resourceId: String
    /**
         * [Required] The string identifier of the associated RestApi.
         */
    var restApiId: String
  }
  
  
  trait DeleteRestApiRequest extends js.Object {
    /**
         * [Required] The string identifier of the associated RestApi.
         */
    var restApiId: String
  }
  
  
  trait DeleteStageRequest extends js.Object {
    /**
         * [Required] The string identifier of the associated RestApi.
         */
    var restApiId: String
    /**
         * [Required] The name of the Stage resource to delete.
         */
    var stageName: String
  }
  
  
  trait DeleteUsagePlanKeyRequest extends js.Object {
    /**
         * [Required] The Id of the UsagePlanKey resource to be deleted.
         */
    var keyId: String
    /**
         * [Required] The Id of the UsagePlan resource representing the usage plan containing the to-be-deleted UsagePlanKey resource representing a plan customer.
         */
    var usagePlanId: String
  }
  
  
  trait DeleteUsagePlanRequest extends js.Object {
    /**
         * [Required] The Id of the to-be-deleted usage plan.
         */
    var usagePlanId: String
  }
  
  
  trait DeleteVpcLinkRequest extends js.Object {
    /**
         * [Required] The identifier of the VpcLink. It is used in an Integration to reference this VpcLink.
         */
    var vpcLinkId: String
  }
  
  
  trait Deployment extends js.Object {
    /**
         * A summary of the RestApi at the date and time that the deployment resource was created.
         */
    var apiSummary: js.UndefOr[PathToMapOfMethodSnapshot] = js.undefined
    /**
         * The date and time that the deployment resource was created.
         */
    var createdDate: js.UndefOr[Timestamp] = js.undefined
    /**
         * The description for the deployment resource.
         */
    var description: js.UndefOr[String] = js.undefined
    /**
         * The identifier for the deployment resource.
         */
    var id: js.UndefOr[String] = js.undefined
  }
  
  
  trait DeploymentCanarySettings extends js.Object {
    /**
         * The percentage (0.0-100.0) of traffic routed to the canary deployment.
         */
    var percentTraffic: js.UndefOr[Double] = js.undefined
    /**
         * A stage variable overrides used for the canary release deployment. They can override existing stage variables or add new stage variables for the canary release deployment. These stage variables are represented as a string-to-string map between stage variable names and their values.
         */
    var stageVariableOverrides: js.UndefOr[MapOfStringToString] = js.undefined
    /**
         * A Boolean flag to indicate whether the canary release deployment uses the stage cache or not.
         */
    var useStageCache: js.UndefOr[Boolean] = js.undefined
  }
  
  
  trait Deployments extends js.Object {
    /**
         * The current page of elements from this collection.
         */
    var items: js.UndefOr[ListOfDeployment] = js.undefined
    var position: js.UndefOr[String] = js.undefined
  }
  
  
  trait DocumentationPart extends js.Object {
    /**
         * The DocumentationPart identifier, generated by API Gateway when the DocumentationPart is created.
         */
    var id: js.UndefOr[String] = js.undefined
    /**
         * The location of the API entity to which the documentation applies. Valid fields depend on the targeted API entity type. All the valid location fields are not required. If not explicitly specified, a valid location field is treated as a wildcard and associated documentation content may be inherited by matching entities, unless overridden.
         */
    var location: js.UndefOr[DocumentationPartLocation] = js.undefined
    /**
         * A content map of API-specific key-value pairs describing the targeted API entity. The map must be encoded as a JSON string, e.g., "{ \"description\": \"The API does ...\" }". Only OpenAPI-compliant documentation-related fields from the properties map are exported and, hence, published as part of the API entity definitions, while the original documentation parts are exported in a OpenAPI extension of x-amazon-apigateway-documentation.
         */
    var properties: js.UndefOr[String] = js.undefined
  }
  
  
  trait DocumentationPartIds extends js.Object {
    /**
         * A list of the returned documentation part identifiers.
         */
    var ids: js.UndefOr[ListOfString] = js.undefined
    /**
         * A list of warning messages reported during import of documentation parts.
         */
    var warnings: js.UndefOr[ListOfString] = js.undefined
  }
  
  
  trait DocumentationPartLocation extends js.Object {
    /**
         * The HTTP verb of a method. It is a valid field for the API entity types of METHOD, PATH_PARAMETER, QUERY_PARAMETER, REQUEST_HEADER, REQUEST_BODY, RESPONSE, RESPONSE_HEADER, and RESPONSE_BODY. The default value is * for any method. When an applicable child entity inherits the content of an entity of the same type with more general specifications of the other location attributes, the child entity's method attribute must match that of the parent entity exactly.
         */
    var method: js.UndefOr[String] = js.undefined
    /**
         * The name of the targeted API entity. It is a valid and required field for the API entity types of AUTHORIZER, MODEL, PATH_PARAMETER, QUERY_PARAMETER, REQUEST_HEADER, REQUEST_BODY and RESPONSE_HEADER. It is an invalid field for any other entity type.
         */
    var name: js.UndefOr[String] = js.undefined
    /**
         * The URL path of the target. It is a valid field for the API entity types of RESOURCE, METHOD, PATH_PARAMETER, QUERY_PARAMETER, REQUEST_HEADER, REQUEST_BODY, RESPONSE, RESPONSE_HEADER, and RESPONSE_BODY. The default value is / for the root resource. When an applicable child entity inherits the content of another entity of the same type with more general specifications of the other location attributes, the child entity's path attribute must match that of the parent entity as a prefix.
         */
    var path: js.UndefOr[String] = js.undefined
    /**
         * The HTTP status code of a response. It is a valid field for the API entity types of RESPONSE, RESPONSE_HEADER, and RESPONSE_BODY. The default value is * for any status code. When an applicable child entity inherits the content of an entity of the same type with more general specifications of the other location attributes, the child entity's statusCode attribute must match that of the parent entity exactly.
         */
    var statusCode: js.UndefOr[DocumentationPartLocationStatusCode] = js.undefined
    /**
         * [Required] The type of API entity to which the documentation content applies. Valid values are API, AUTHORIZER, MODEL, RESOURCE, METHOD, PATH_PARAMETER, QUERY_PARAMETER, REQUEST_HEADER, REQUEST_BODY, RESPONSE, RESPONSE_HEADER, and RESPONSE_BODY. Content inheritance does not apply to any entity of the API, AUTHORIZER, METHOD, MODEL, REQUEST_BODY, or RESOURCE type.
         */
    var `type`: DocumentationPartType
  }
  
  
  trait DocumentationParts extends js.Object {
    /**
         * The current page of elements from this collection.
         */
    var items: js.UndefOr[ListOfDocumentationPart] = js.undefined
    var position: js.UndefOr[String] = js.undefined
  }
  
  
  trait DocumentationVersion extends js.Object {
    /**
         * The date when the API documentation snapshot is created.
         */
    var createdDate: js.UndefOr[Timestamp] = js.undefined
    /**
         * The description of the API documentation snapshot.
         */
    var description: js.UndefOr[String] = js.undefined
    /**
         * The version identifier of the API documentation snapshot.
         */
    var version: js.UndefOr[String] = js.undefined
  }
  
  
  trait DocumentationVersions extends js.Object {
    /**
         * The current page of elements from this collection.
         */
    var items: js.UndefOr[ListOfDocumentationVersion] = js.undefined
    var position: js.UndefOr[String] = js.undefined
  }
  
  
  trait DomainName extends js.Object {
    /**
         * The reference to an AWS-managed certificate that will be used by edge-optimized endpoint for this domain name. AWS Certificate Manager is the only supported source.
         */
    var certificateArn: js.UndefOr[String] = js.undefined
    /**
         * The name of the certificate that will be used by edge-optimized endpoint for this domain name.
         */
    var certificateName: js.UndefOr[String] = js.undefined
    /**
         * The timestamp when the certificate that was used by edge-optimized endpoint for this domain name was uploaded.
         */
    var certificateUploadDate: js.UndefOr[Timestamp] = js.undefined
    /**
         * The domain name of the Amazon CloudFront distribution associated with this custom domain name for an edge-optimized endpoint. You set up this association when adding a DNS record pointing the custom domain name to this distribution name. For more information about CloudFront distributions, see the Amazon CloudFront documentation.
         */
    var distributionDomainName: js.UndefOr[String] = js.undefined
    /**
         * The region-agnostic Amazon Route 53 Hosted Zone ID of the edge-optimized endpoint. The valid value is Z2FDTNDATAQYW2 for all the regions. For more information, see Set up a Regional Custom Domain Name and AWS Regions and Endpoints for API Gateway. 
         */
    var distributionHostedZoneId: js.UndefOr[String] = js.undefined
    /**
         * The custom domain name as an API host name, for example, my-api.example.com.
         */
    var domainName: js.UndefOr[String] = js.undefined
    /**
         * The endpoint configuration of this DomainName showing the endpoint types of the domain name. 
         */
    var endpointConfiguration: js.UndefOr[EndpointConfiguration] = js.undefined
    /**
         * The reference to an AWS-managed certificate that will be used for validating the regional domain name. AWS Certificate Manager is the only supported source.
         */
    var regionalCertificateArn: js.UndefOr[String] = js.undefined
    /**
         * The name of the certificate that will be used for validating the regional domain name.
         */
    var regionalCertificateName: js.UndefOr[String] = js.undefined
    /**
         * The domain name associated with the regional endpoint for this custom domain name. You set up this association by adding a DNS record that points the custom domain name to this regional domain name. The regional domain name is returned by API Gateway when you create a regional endpoint.
         */
    var regionalDomainName: js.UndefOr[String] = js.undefined
    /**
         * The region-specific Amazon Route 53 Hosted Zone ID of the regional endpoint. For more information, see Set up a Regional Custom Domain Name and AWS Regions and Endpoints for API Gateway. 
         */
    var regionalHostedZoneId: js.UndefOr[String] = js.undefined
  }
  
  
  trait DomainNames extends js.Object {
    /**
         * The current page of elements from this collection.
         */
    var items: js.UndefOr[ListOfDomainName] = js.undefined
    var position: js.UndefOr[String] = js.undefined
  }
  
  
  trait EndpointConfiguration extends js.Object {
    /**
         * A list of endpoint types of an API (RestApi) or its custom domain name (DomainName). For an edge-optimized API and its custom domain name, the endpoint type is "EDGE". For a regional API and its custom domain name, the endpoint type is REGIONAL. For a private API, the endpoint type is PRIVATE.
         */
    var types: js.UndefOr[ListOfEndpointType] = js.undefined
  }
  
  
  trait ExportResponse extends js.Object {
    /**
         * The binary blob response to GetExport, which contains the export.
         */
    var body: js.UndefOr[_Blob] = js.undefined
    /**
         * The content-disposition header value in the HTTP response.
         */
    var contentDisposition: js.UndefOr[String] = js.undefined
    /**
         * The content-type header value in the HTTP response. This will correspond to a valid 'accept' type in the request.
         */
    var contentType: js.UndefOr[String] = js.undefined
  }
  
  
  trait FlushStageAuthorizersCacheRequest extends js.Object {
    /**
         * The string identifier of the associated RestApi.
         */
    var restApiId: String
    /**
         * The name of the stage to flush.
         */
    var stageName: String
  }
  
  
  trait FlushStageCacheRequest extends js.Object {
    /**
         * [Required] The string identifier of the associated RestApi.
         */
    var restApiId: String
    /**
         * [Required] The name of the stage to flush its cache.
         */
    var stageName: String
  }
  
  
  trait GatewayResponse extends js.Object {
    /**
         * A Boolean flag to indicate whether this GatewayResponse is the default gateway response (true) or not (false). A default gateway response is one generated by API Gateway without any customization by an API developer. 
         */
    var defaultResponse: js.UndefOr[Boolean] = js.undefined
    /**
         * Response parameters (paths, query strings and headers) of the GatewayResponse as a string-to-string map of key-value pairs.
         */
    var responseParameters: js.UndefOr[MapOfStringToString] = js.undefined
    /**
         * Response templates of the GatewayResponse as a string-to-string map of key-value pairs.
         */
    var responseTemplates: js.UndefOr[MapOfStringToString] = js.undefined
    /**
         * The response type of the associated GatewayResponse. Valid values are ACCESS_DENIEDAPI_CONFIGURATION_ERRORAUTHORIZER_FAILURE AUTHORIZER_CONFIGURATION_ERRORBAD_REQUEST_PARAMETERSBAD_REQUEST_BODYDEFAULT_4XXDEFAULT_5XXEXPIRED_TOKENINVALID_SIGNATUREINTEGRATION_FAILUREINTEGRATION_TIMEOUTINVALID_API_KEYMISSING_AUTHENTICATION_TOKEN QUOTA_EXCEEDEDREQUEST_TOO_LARGERESOURCE_NOT_FOUNDTHROTTLEDUNAUTHORIZEDUNSUPPORTED_MEDIA_TYPE 
         */
    var responseType: js.UndefOr[GatewayResponseType] = js.undefined
    /**
         * The HTTP status code for this GatewayResponse.
         */
    var statusCode: js.UndefOr[StatusCode] = js.undefined
  }
  
  
  trait GatewayResponses extends js.Object {
    /**
         * Returns the entire collection, because of no pagination support.
         */
    var items: js.UndefOr[ListOfGatewayResponse] = js.undefined
    var position: js.UndefOr[String] = js.undefined
  }
  
  
  trait GenerateClientCertificateRequest extends js.Object {
    /**
         * The description of the ClientCertificate.
         */
    var description: js.UndefOr[String] = js.undefined
  }
  
  
  trait GetAccountRequest extends js.Object
  
  
  trait GetApiKeyRequest extends js.Object {
    /**
         * [Required] The identifier of the ApiKey resource.
         */
    var apiKey: String
    /**
         * A boolean flag to specify whether (true) or not (false) the result contains the key value.
         */
    var includeValue: js.UndefOr[NullableBoolean] = js.undefined
  }
  
  
  trait GetApiKeysRequest extends js.Object {
    /**
         * The identifier of a customer in AWS Marketplace or an external system, such as a developer portal.
         */
    var customerId: js.UndefOr[String] = js.undefined
    /**
         * A boolean flag to specify whether (true) or not (false) the result contains key values.
         */
    var includeValues: js.UndefOr[NullableBoolean] = js.undefined
    /**
         * The maximum number of returned results per page. The default value is 25 and the maximum value is 500.
         */
    var limit: js.UndefOr[NullableInteger] = js.undefined
    /**
         * The name of queried API keys.
         */
    var nameQuery: js.UndefOr[String] = js.undefined
    /**
         * The current pagination position in the paged result set.
         */
    var position: js.UndefOr[String] = js.undefined
  }
  
  
  trait GetAuthorizerRequest extends js.Object {
    /**
         * [Required] The identifier of the Authorizer resource.
         */
    var authorizerId: String
    /**
         * [Required] The string identifier of the associated RestApi.
         */
    var restApiId: String
  }
  
  
  trait GetAuthorizersRequest extends js.Object {
    /**
         * The maximum number of returned results per page. The default value is 25 and the maximum value is 500.
         */
    var limit: js.UndefOr[NullableInteger] = js.undefined
    /**
         * The current pagination position in the paged result set.
         */
    var position: js.UndefOr[String] = js.undefined
    /**
         * [Required] The string identifier of the associated RestApi.
         */
    var restApiId: String
  }
  
  
  trait GetBasePathMappingRequest extends js.Object {
    /**
         * [Required] The base path name that callers of the API must provide as part of the URL after the domain name. This value must be unique for all of the mappings across a single API. Leave this blank if you do not want callers to specify any base path name after the domain name.
         */
    var basePath: String
    /**
         * [Required] The domain name of the BasePathMapping resource to be described.
         */
    var domainName: String
  }
  
  
  trait GetBasePathMappingsRequest extends js.Object {
    /**
         * [Required] The domain name of a BasePathMapping resource.
         */
    var domainName: String
    /**
         * The maximum number of returned results per page. The default value is 25 and the maximum value is 500.
         */
    var limit: js.UndefOr[NullableInteger] = js.undefined
    /**
         * The current pagination position in the paged result set.
         */
    var position: js.UndefOr[String] = js.undefined
  }
  
  
  trait GetClientCertificateRequest extends js.Object {
    /**
         * [Required] The identifier of the ClientCertificate resource to be described.
         */
    var clientCertificateId: String
  }
  
  
  trait GetClientCertificatesRequest extends js.Object {
    /**
         * The maximum number of returned results per page. The default value is 25 and the maximum value is 500.
         */
    var limit: js.UndefOr[NullableInteger] = js.undefined
    /**
         * The current pagination position in the paged result set.
         */
    var position: js.UndefOr[String] = js.undefined
  }
  
  
  trait GetDeploymentRequest extends js.Object {
    /**
         * [Required] The identifier of the Deployment resource to get information about.
         */
    var deploymentId: String
    /**
         * A query parameter to retrieve the specified embedded resources of the returned Deployment resource in the response. In a REST API call, this embed parameter value is a list of comma-separated strings, as in GET /restapis/{restapi_id}/deployments/{deployment_id}?embed=var1,var2. The SDK and other platform-dependent libraries might use a different format for the list. Currently, this request supports only retrieval of the embedded API summary this way. Hence, the parameter value must be a single-valued list containing only the "apisummary" string. For example, GET /restapis/{restapi_id}/deployments/{deployment_id}?embed=apisummary.
         */
    var embed: js.UndefOr[ListOfString] = js.undefined
    /**
         * [Required] The string identifier of the associated RestApi.
         */
    var restApiId: String
  }
  
  
  trait GetDeploymentsRequest extends js.Object {
    /**
         * The maximum number of returned results per page. The default value is 25 and the maximum value is 500.
         */
    var limit: js.UndefOr[NullableInteger] = js.undefined
    /**
         * The current pagination position in the paged result set.
         */
    var position: js.UndefOr[String] = js.undefined
    /**
         * [Required] The string identifier of the associated RestApi.
         */
    var restApiId: String
  }
  
  
  trait GetDocumentationPartRequest extends js.Object {
    /**
         * [Required] The string identifier of the associated RestApi.
         */
    var documentationPartId: String
    /**
         * [Required] The string identifier of the associated RestApi.
         */
    var restApiId: String
  }
  
  
  trait GetDocumentationPartsRequest extends js.Object {
    /**
         * The maximum number of returned results per page. The default value is 25 and the maximum value is 500.
         */
    var limit: js.UndefOr[NullableInteger] = js.undefined
    /**
         * The status of the API documentation parts to retrieve. Valid values are DOCUMENTED for retrieving DocumentationPart resources with content and UNDOCUMENTED for DocumentationPart resources without content.
         */
    var locationStatus: js.UndefOr[LocationStatusType] = js.undefined
    /**
         * The name of API entities of the to-be-retrieved documentation parts.
         */
    var nameQuery: js.UndefOr[String] = js.undefined
    /**
         * The path of API entities of the to-be-retrieved documentation parts.
         */
    var path: js.UndefOr[String] = js.undefined
    /**
         * The current pagination position in the paged result set.
         */
    var position: js.UndefOr[String] = js.undefined
    /**
         * [Required] The string identifier of the associated RestApi.
         */
    var restApiId: String
    /**
         * The type of API entities of the to-be-retrieved documentation parts. 
         */
    var `type`: js.UndefOr[DocumentationPartType] = js.undefined
  }
  
  
  trait GetDocumentationVersionRequest extends js.Object {
    /**
         * [Required] The version identifier of the to-be-retrieved documentation snapshot.
         */
    var documentationVersion: String
    /**
         * [Required] The string identifier of the associated RestApi.
         */
    var restApiId: String
  }
  
  
  trait GetDocumentationVersionsRequest extends js.Object {
    /**
         * The maximum number of returned results per page. The default value is 25 and the maximum value is 500.
         */
    var limit: js.UndefOr[NullableInteger] = js.undefined
    /**
         * The current pagination position in the paged result set.
         */
    var position: js.UndefOr[String] = js.undefined
    /**
         * [Required] The string identifier of the associated RestApi.
         */
    var restApiId: String
  }
  
  
  trait GetDomainNameRequest extends js.Object {
    /**
         * [Required] The name of the DomainName resource.
         */
    var domainName: String
  }
  
  
  trait GetDomainNamesRequest extends js.Object {
    /**
         * The maximum number of returned results per page. The default value is 25 and the maximum value is 500.
         */
    var limit: js.UndefOr[NullableInteger] = js.undefined
    /**
         * The current pagination position in the paged result set.
         */
    var position: js.UndefOr[String] = js.undefined
  }
  
  
  trait GetExportRequest extends js.Object {
    /**
         * The content-type of the export, for example application/json. Currently application/json and application/yaml are supported for exportType ofoas30 and swagger. This should be specified in the Accept header for direct API requests.
         */
    var accepts: js.UndefOr[String] = js.undefined
    /**
         * [Required] The type of export. Acceptable values are 'oas30' for OpenAPI 3.0.x and 'swagger' for Swagger/OpenAPI 2.0.
         */
    var exportType: String
    /**
         * A key-value map of query string parameters that specify properties of the export, depending on the requested exportType. For exportType oas30 and swagger, any combination of the following parameters are supported: extensions='integrations' or extensions='apigateway' will export the API with x-amazon-apigateway-integration extensions. extensions='authorizers' will export the API with x-amazon-apigateway-authorizer extensions. postman will export the API with Postman extensions, allowing for import to the Postman tool
         */
    var parameters: js.UndefOr[MapOfStringToString] = js.undefined
    /**
         * [Required] The string identifier of the associated RestApi.
         */
    var restApiId: String
    /**
         * [Required] The name of the Stage that will be exported.
         */
    var stageName: String
  }
  
  
  trait GetGatewayResponseRequest extends js.Object {
    /**
         * [Required] The response type of the associated GatewayResponse. Valid values are ACCESS_DENIEDAPI_CONFIGURATION_ERRORAUTHORIZER_FAILURE AUTHORIZER_CONFIGURATION_ERRORBAD_REQUEST_PARAMETERSBAD_REQUEST_BODYDEFAULT_4XXDEFAULT_5XXEXPIRED_TOKENINVALID_SIGNATUREINTEGRATION_FAILUREINTEGRATION_TIMEOUTINVALID_API_KEYMISSING_AUTHENTICATION_TOKEN QUOTA_EXCEEDEDREQUEST_TOO_LARGERESOURCE_NOT_FOUNDTHROTTLEDUNAUTHORIZEDUNSUPPORTED_MEDIA_TYPE 
         */
    var responseType: GatewayResponseType
    /**
         * [Required] The string identifier of the associated RestApi.
         */
    var restApiId: String
  }
  
  
  trait GetGatewayResponsesRequest extends js.Object {
    /**
         * The maximum number of returned results per page. The default value is 25 and the maximum value is 500. The GatewayResponses collection does not support pagination and the limit does not apply here.
         */
    var limit: js.UndefOr[NullableInteger] = js.undefined
    /**
         * The current pagination position in the paged result set. The GatewayResponse collection does not support pagination and the position does not apply here.
         */
    var position: js.UndefOr[String] = js.undefined
    /**
         * [Required] The string identifier of the associated RestApi.
         */
    var restApiId: String
  }
  
  
  trait GetIntegrationRequest extends js.Object {
    /**
         * [Required] Specifies a get integration request's HTTP method.
         */
    var httpMethod: String
    /**
         * [Required] Specifies a get integration request's resource identifier
         */
    var resourceId: String
    /**
         * [Required] The string identifier of the associated RestApi.
         */
    var restApiId: String
  }
  
  
  trait GetIntegrationResponseRequest extends js.Object {
    /**
         * [Required] Specifies a get integration response request's HTTP method.
         */
    var httpMethod: String
    /**
         * [Required] Specifies a get integration response request's resource identifier.
         */
    var resourceId: String
    /**
         * [Required] The string identifier of the associated RestApi.
         */
    var restApiId: String
    /**
         * [Required] Specifies a get integration response request's status code.
         */
    var statusCode: StatusCode
  }
  
  
  trait GetMethodRequest extends js.Object {
    /**
         * [Required] Specifies the method request's HTTP method type.
         */
    var httpMethod: String
    /**
         * [Required] The Resource identifier for the Method resource.
         */
    var resourceId: String
    /**
         * [Required] The string identifier of the associated RestApi.
         */
    var restApiId: String
  }
  
  
  trait GetMethodResponseRequest extends js.Object {
    /**
         * [Required] The HTTP verb of the Method resource.
         */
    var httpMethod: String
    /**
         * [Required] The Resource identifier for the MethodResponse resource.
         */
    var resourceId: String
    /**
         * [Required] The string identifier of the associated RestApi.
         */
    var restApiId: String
    /**
         * [Required] The status code for the MethodResponse resource.
         */
    var statusCode: StatusCode
  }
  
  
  trait GetModelRequest extends js.Object {
    /**
         * A query parameter of a Boolean value to resolve (true) all external model references and returns a flattened model schema or not (false) The default is false.
         */
    var flatten: js.UndefOr[Boolean] = js.undefined
    /**
         * [Required] The name of the model as an identifier.
         */
    var modelName: String
    /**
         * [Required] The RestApi identifier under which the Model exists.
         */
    var restApiId: String
  }
  
  
  trait GetModelTemplateRequest extends js.Object {
    /**
         * [Required] The name of the model for which to generate a template.
         */
    var modelName: String
    /**
         * [Required] The string identifier of the associated RestApi.
         */
    var restApiId: String
  }
  
  
  trait GetModelsRequest extends js.Object {
    /**
         * The maximum number of returned results per page. The default value is 25 and the maximum value is 500.
         */
    var limit: js.UndefOr[NullableInteger] = js.undefined
    /**
         * The current pagination position in the paged result set.
         */
    var position: js.UndefOr[String] = js.undefined
    /**
         * [Required] The string identifier of the associated RestApi.
         */
    var restApiId: String
  }
  
  
  trait GetRequestValidatorRequest extends js.Object {
    /**
         * [Required] The identifier of the RequestValidator to be retrieved.
         */
    var requestValidatorId: String
    /**
         * [Required] The string identifier of the associated RestApi.
         */
    var restApiId: String
  }
  
  
  trait GetRequestValidatorsRequest extends js.Object {
    /**
         * The maximum number of returned results per page. The default value is 25 and the maximum value is 500.
         */
    var limit: js.UndefOr[NullableInteger] = js.undefined
    /**
         * The current pagination position in the paged result set.
         */
    var position: js.UndefOr[String] = js.undefined
    /**
         * [Required] The string identifier of the associated RestApi.
         */
    var restApiId: String
  }
  
  
  trait GetResourceRequest extends js.Object {
    /**
         * A query parameter to retrieve the specified resources embedded in the returned Resource representation in the response. This embed parameter value is a list of comma-separated strings. Currently, the request supports only retrieval of the embedded Method resources this way. The query parameter value must be a single-valued list and contain the "methods" string. For example, GET /restapis/{restapi_id}/resources/{resource_id}?embed=methods.
         */
    var embed: js.UndefOr[ListOfString] = js.undefined
    /**
         * [Required] The identifier for the Resource resource.
         */
    var resourceId: String
    /**
         * [Required] The string identifier of the associated RestApi.
         */
    var restApiId: String
  }
  
  
  trait GetResourcesRequest extends js.Object {
    /**
         * A query parameter used to retrieve the specified resources embedded in the returned Resources resource in the response. This embed parameter value is a list of comma-separated strings. Currently, the request supports only retrieval of the embedded Method resources this way. The query parameter value must be a single-valued list and contain the "methods" string. For example, GET /restapis/{restapi_id}/resources?embed=methods.
         */
    var embed: js.UndefOr[ListOfString] = js.undefined
    /**
         * The maximum number of returned results per page. The default value is 25 and the maximum value is 500.
         */
    var limit: js.UndefOr[NullableInteger] = js.undefined
    /**
         * The current pagination position in the paged result set.
         */
    var position: js.UndefOr[String] = js.undefined
    /**
         * [Required] The string identifier of the associated RestApi.
         */
    var restApiId: String
  }
  
  
  trait GetRestApiRequest extends js.Object {
    /**
         * [Required] The string identifier of the associated RestApi.
         */
    var restApiId: String
  }
  
  
  trait GetRestApisRequest extends js.Object {
    /**
         * The maximum number of returned results per page. The default value is 25 and the maximum value is 500.
         */
    var limit: js.UndefOr[NullableInteger] = js.undefined
    /**
         * The current pagination position in the paged result set.
         */
    var position: js.UndefOr[String] = js.undefined
  }
  
  
  trait GetSdkRequest extends js.Object {
    /**
         * A string-to-string key-value map of query parameters sdkType-dependent properties of the SDK. For sdkType of objectivec or swift, a parameter named classPrefix is required. For sdkType of android, parameters named groupId, artifactId, artifactVersion, and invokerPackage are required. For sdkType of java, parameters named serviceName and javaPackageName are required. 
         */
    var parameters: js.UndefOr[MapOfStringToString] = js.undefined
    /**
         * [Required] The string identifier of the associated RestApi.
         */
    var restApiId: String
    /**
         * [Required] The language for the generated SDK. Currently java, javascript, android, objectivec (for iOS), swift (for iOS), and ruby are supported.
         */
    var sdkType: String
    /**
         * [Required] The name of the Stage that the SDK will use.
         */
    var stageName: String
  }
  
  
  trait GetSdkTypeRequest extends js.Object {
    /**
         * [Required] The identifier of the queried SdkType instance.
         */
    var id: String
  }
  
  
  trait GetSdkTypesRequest extends js.Object {
    /**
         * The maximum number of returned results per page. The default value is 25 and the maximum value is 500.
         */
    var limit: js.UndefOr[NullableInteger] = js.undefined
    /**
         * The current pagination position in the paged result set.
         */
    var position: js.UndefOr[String] = js.undefined
  }
  
  
  trait GetStageRequest extends js.Object {
    /**
         * [Required] The string identifier of the associated RestApi.
         */
    var restApiId: String
    /**
         * [Required] The name of the Stage resource to get information about.
         */
    var stageName: String
  }
  
  
  trait GetStagesRequest extends js.Object {
    /**
         * The stages' deployment identifiers.
         */
    var deploymentId: js.UndefOr[String] = js.undefined
    /**
         * [Required] The string identifier of the associated RestApi.
         */
    var restApiId: String
  }
  
  
  trait GetTagsRequest extends js.Object {
    /**
         * (Not currently supported) The maximum number of returned results per page. The default value is 25 and the maximum value is 500.
         */
    var limit: js.UndefOr[NullableInteger] = js.undefined
    /**
         * (Not currently supported) The current pagination position in the paged result set.
         */
    var position: js.UndefOr[String] = js.undefined
    /**
         * [Required] The ARN of a resource that can be tagged. The resource ARN must be URL-encoded. At present, Stage is the only taggable resource.
         */
    var resourceArn: String
  }
  
  
  trait GetUsagePlanKeyRequest extends js.Object {
    /**
         * [Required] The key Id of the to-be-retrieved UsagePlanKey resource representing a plan customer.
         */
    var keyId: String
    /**
         * [Required] The Id of the UsagePlan resource representing the usage plan containing the to-be-retrieved UsagePlanKey resource representing a plan customer.
         */
    var usagePlanId: String
  }
  
  
  trait GetUsagePlanKeysRequest extends js.Object {
    /**
         * The maximum number of returned results per page. The default value is 25 and the maximum value is 500.
         */
    var limit: js.UndefOr[NullableInteger] = js.undefined
    /**
         * A query parameter specifying the name of the to-be-returned usage plan keys.
         */
    var nameQuery: js.UndefOr[String] = js.undefined
    /**
         * The current pagination position in the paged result set.
         */
    var position: js.UndefOr[String] = js.undefined
    /**
         * [Required] The Id of the UsagePlan resource representing the usage plan containing the to-be-retrieved UsagePlanKey resource representing a plan customer.
         */
    var usagePlanId: String
  }
  
  
  trait GetUsagePlanRequest extends js.Object {
    /**
         * [Required] The identifier of the UsagePlan resource to be retrieved.
         */
    var usagePlanId: String
  }
  
  
  trait GetUsagePlansRequest extends js.Object {
    /**
         * The identifier of the API key associated with the usage plans.
         */
    var keyId: js.UndefOr[String] = js.undefined
    /**
         * The maximum number of returned results per page. The default value is 25 and the maximum value is 500.
         */
    var limit: js.UndefOr[NullableInteger] = js.undefined
    /**
         * The current pagination position in the paged result set.
         */
    var position: js.UndefOr[String] = js.undefined
  }
  
  
  trait GetUsageRequest extends js.Object {
    /**
         * [Required] The ending date (e.g., 2016-12-31) of the usage data.
         */
    var endDate: String
    /**
         * The Id of the API key associated with the resultant usage data.
         */
    var keyId: js.UndefOr[String] = js.undefined
    /**
         * The maximum number of returned results per page. The default value is 25 and the maximum value is 500.
         */
    var limit: js.UndefOr[NullableInteger] = js.undefined
    /**
         * The current pagination position in the paged result set.
         */
    var position: js.UndefOr[String] = js.undefined
    /**
         * [Required] The starting date (e.g., 2016-01-01) of the usage data.
         */
    var startDate: String
    /**
         * [Required] The Id of the usage plan associated with the usage data.
         */
    var usagePlanId: String
  }
  
  
  trait GetVpcLinkRequest extends js.Object {
    /**
         * [Required] The identifier of the VpcLink. It is used in an Integration to reference this VpcLink.
         */
    var vpcLinkId: String
  }
  
  
  trait GetVpcLinksRequest extends js.Object {
    /**
         * The maximum number of returned results per page. The default value is 25 and the maximum value is 500.
         */
    var limit: js.UndefOr[NullableInteger] = js.undefined
    /**
         * The current pagination position in the paged result set.
         */
    var position: js.UndefOr[String] = js.undefined
  }
  
  
  trait ImportApiKeysRequest extends js.Object {
    /**
         * The payload of the POST request to import API keys. For the payload format, see API Key File Format.
         */
    var body: _Blob
    /**
         * A query parameter to indicate whether to rollback ApiKey importation (true) or not (false) when error is encountered.
         */
    var failOnWarnings: js.UndefOr[Boolean] = js.undefined
    /**
         * A query parameter to specify the input format to imported API keys. Currently, only the csv format is supported.
         */
    var format: ApiKeysFormat
  }
  
  
  trait ImportDocumentationPartsRequest extends js.Object {
    /**
         * [Required] Raw byte array representing the to-be-imported documentation parts. To import from an OpenAPI file, this is a JSON object.
         */
    var body: _Blob
    /**
         * A query parameter to specify whether to rollback the documentation importation (true) or not (false) when a warning is encountered. The default value is false.
         */
    var failOnWarnings: js.UndefOr[Boolean] = js.undefined
    /**
         * A query parameter to indicate whether to overwrite (OVERWRITE) any existing DocumentationParts definition or to merge (MERGE) the new definition into the existing one. The default value is MERGE.
         */
    var mode: js.UndefOr[PutMode] = js.undefined
    /**
         * [Required] The string identifier of the associated RestApi.
         */
    var restApiId: String
  }
  
  
  trait ImportRestApiRequest extends js.Object {
    /**
         * [Required] The POST request body containing external API definitions. Currently, only OpenAPI definition JSON/YAML files are supported. The maximum size of the API definition file is 2MB.
         */
    var body: _Blob
    /**
         * A query parameter to indicate whether to rollback the API creation (true) or not (false) when a warning is encountered. The default value is false.
         */
    var failOnWarnings: js.UndefOr[Boolean] = js.undefined
    /**
         * A key-value map of context-specific query string parameters specifying the behavior of different API importing operations. The following shows operation-specific parameters and their supported values.  To exclude DocumentationParts from the import, set parameters as ignore=documentation.  To configure the endpoint type, set parameters as endpointConfigurationTypes=EDGE, endpointConfigurationTypes=REGIONAL, or endpointConfigurationTypes=PRIVATE. The default endpoint type is EDGE.  To handle imported basePath, set parameters as basePath=ignore, basePath=prepend or basePath=split. For example, the AWS CLI command to exclude documentation from the imported API is: aws apigateway import-rest-api --parameters ignore=documentation --body 'file:///path/to/imported-api-body.json' The AWS CLI command to set the regional endpoint on the imported API is: aws apigateway import-rest-api --parameters endpointConfigurationTypes=REGIONAL --body 'file:///path/to/imported-api-body.json'
         */
    var parameters: js.UndefOr[MapOfStringToString] = js.undefined
  }
  
  
  trait Integration extends js.Object {
    /**
         * Specifies the integration's cache key parameters.
         */
    var cacheKeyParameters: js.UndefOr[ListOfString] = js.undefined
    /**
         * Specifies the integration's cache namespace.
         */
    var cacheNamespace: js.UndefOr[String] = js.undefined
    /**
         * The (id) of the VpcLink used for the integration when connectionType=VPC_LINK and undefined, otherwise.
         */
    var connectionId: js.UndefOr[String] = js.undefined
    /**
         * The type of the network connection to the integration endpoint. The valid value is INTERNET for connections through the public routable internet or VPC_LINK for private connections between API Gateway and a network load balancer in a VPC. The default value is INTERNET.
         */
    var connectionType: js.UndefOr[ConnectionType] = js.undefined
    /**
         * Specifies how to handle request payload content type conversions. Supported values are CONVERT_TO_BINARY and CONVERT_TO_TEXT, with the following behaviors:  CONVERT_TO_BINARY: Converts a request payload from a Base64-encoded string to the corresponding binary blob. CONVERT_TO_TEXT: Converts a request payload from a binary blob to a Base64-encoded string.  If this property is not defined, the request payload will be passed through from the method request to integration request without modification, provided that the passthroughBehaviors is configured to support payload pass-through.
         */
    var contentHandling: js.UndefOr[ContentHandlingStrategy] = js.undefined
    /**
         * Specifies the credentials required for the integration, if any. For AWS integrations, three options are available. To specify an IAM Role for API Gateway to assume, use the role's Amazon Resource Name (ARN). To require that the caller's identity be passed through from the request, specify the string arn:aws:iam::\*:user/\*. To use resource-based permissions on supported AWS services, specify null.
         */
    var credentials: js.UndefOr[String] = js.undefined
    /**
         * Specifies the integration's HTTP method type.
         */
    var httpMethod: js.UndefOr[String] = js.undefined
    /**
         * Specifies the integration's responses.   Example: Get integration responses of a method Request  GET /restapis/fugvjdxtri/resources/3kzxbg5sa2/methods/GET/integration/responses/200 HTTP/1.1 Content-Type: application/json Host: apigateway.us-east-1.amazonaws.com X-Amz-Date: 20160607T191449Z Authorization: AWS4-HMAC-SHA256 Credential={access_key_ID}/20160607/us-east-1/apigateway/aws4_request, SignedHeaders=content-type;host;x-amz-date, Signature={sig4_hash}  Response The successful response returns 200 OK status and a payload as follows: { "_links": { "curies": { "href": "https://docs.aws.amazon.com/apigateway/latest/developerguide/restapi-integration-response-{rel}.html", "name": "integrationresponse", "templated": true }, "self": { "href": "/restapis/fugvjdxtri/resources/3kzxbg5sa2/methods/GET/integration/responses/200", "title": "200" }, "integrationresponse:delete": { "href": "/restapis/fugvjdxtri/resources/3kzxbg5sa2/methods/GET/integration/responses/200" }, "integrationresponse:update": { "href": "/restapis/fugvjdxtri/resources/3kzxbg5sa2/methods/GET/integration/responses/200" } }, "responseParameters": { "method.response.header.Content-Type": "'application/xml'" }, "responseTemplates": { "application/json": "$util.urlDecode(\"%3CkinesisStreams%3E#foreach($stream in $input.path('$.StreamNames'))%3Cstream%3E%3Cname%3E$stream%3C/name%3E%3C/stream%3E#end%3C/kinesisStreams%3E\")\n" }, "statusCode": "200" }    Creating an API 
         */
    var integrationResponses: js.UndefOr[MapOfIntegrationResponse] = js.undefined
    /**
         *   Specifies how the method request body of an unmapped content type will be passed through the integration request to the back end without transformation. A content type is unmapped if no mapping template is defined in the integration or the content type does not match any of the mapped content types, as specified in requestTemplates. The valid value is one of the following:    WHEN_NO_MATCH: passes the method request body through the integration request to the back end without transformation when the method request content type does not match any content type associated with the mapping templates defined in the integration request.   WHEN_NO_TEMPLATES: passes the method request body through the integration request to the back end without transformation when no mapping template is defined in the integration request. If a template is defined when this option is selected, the method request of an unmapped content-type will be rejected with an HTTP 415 Unsupported Media Type response.   NEVER: rejects the method request with an HTTP 415 Unsupported Media Type response when either the method request content type does not match any content type associated with the mapping templates defined in the integration request or no mapping template is defined in the integration request.   
         */
    var passthroughBehavior: js.UndefOr[String] = js.undefined
    /**
         * A key-value map specifying request parameters that are passed from the method request to the back end. The key is an integration request parameter name and the associated value is a method request parameter value or static value that must be enclosed within single quotes and pre-encoded as required by the back end. The method request parameter value must match the pattern of method.request.{location}.{name}, where location is querystring, path, or header and name must be a valid and unique method request parameter name.
         */
    var requestParameters: js.UndefOr[MapOfStringToString] = js.undefined
    /**
         * Represents a map of Velocity templates that are applied on the request payload based on the value of the Content-Type header sent by the client. The content type value is the key in this map, and the template (as a String) is the value.
         */
    var requestTemplates: js.UndefOr[MapOfStringToString] = js.undefined
    /**
         * Custom timeout between 50 and 29,000 milliseconds. The default value is 29,000 milliseconds or 29 seconds.
         */
    var timeoutInMillis: js.UndefOr[Integer] = js.undefined
    /**
         * Specifies an API method integration type. The valid value is one of the following:  AWS: for integrating the API method request with an AWS service action, including the Lambda function-invoking action. With the Lambda function-invoking action, this is referred to as the Lambda custom integration. With any other AWS service action, this is known as AWS integration. AWS_PROXY: for integrating the API method request with the Lambda function-invoking action with the client request passed through as-is. This integration is also referred to as the Lambda proxy integration. HTTP: for integrating the API method request with an HTTP endpoint, including a private HTTP endpoint within a VPC. This integration is also referred to as the HTTP custom integration. HTTP_PROXY: for integrating the API method request with an HTTP endpoint, including a private HTTP endpoint within a VPC, with the client request passed through as-is. This is also referred to as the HTTP proxy integration. MOCK: for integrating the API method request with API Gateway as a "loop-back" endpoint without invoking any backend.  For the HTTP and HTTP proxy integrations, each integration can specify a protocol (http/https), port and path. Standard 80 and 443 ports are supported as well as custom ports above 1024. An HTTP or HTTP proxy integration with a connectionType of VPC_LINK is referred to as a private integration and uses a VpcLink to connect API Gateway to a network load balancer of a VPC.
         */
    var `type`: js.UndefOr[IntegrationType] = js.undefined
    /**
         * Specifies Uniform Resource Identifier (URI) of the integration endpoint.   For HTTP or HTTP_PROXY integrations, the URI must be a fully formed, encoded HTTP(S) URL according to the RFC-3986 specification, for either standard integration, where connectionType is not VPC_LINK, or private integration, where connectionType is VPC_LINK. For a private HTTP integration, the URI is not used for routing.    For AWS or AWS_PROXY integrations, the URI is of the form arn:aws:apigateway:{region}:{subdomain.service|service}:path|action/{service_api}. Here, {Region} is the API Gateway region (e.g., us-east-1); {service} is the name of the integrated AWS service (e.g., s3); and {subdomain} is a designated subdomain supported by certain AWS service for fast host-name lookup. action can be used for an AWS service action-based API, using an Action={name}&amp;{p1}={v1}&amp;p2={v2}... query string. The ensuing {service_api} refers to a supported action {name} plus any required input parameters. Alternatively, path can be used for an AWS service path-based API. The ensuing service_api refers to the path to an AWS service resource, including the region of the integrated AWS service, if applicable. For example, for integration with the S3 API of GetObject, the uri can be either arn:aws:apigateway:us-west-2:s3:action/GetObject&amp;Bucket={bucket}&amp;Key={key} or arn:aws:apigateway:us-west-2:s3:path/{bucket}/{key} 
         */
    var uri: js.UndefOr[String] = js.undefined
  }
  
  
  trait IntegrationResponse extends js.Object {
    /**
         * Specifies how to handle response payload content type conversions. Supported values are CONVERT_TO_BINARY and CONVERT_TO_TEXT, with the following behaviors:  CONVERT_TO_BINARY: Converts a response payload from a Base64-encoded string to the corresponding binary blob. CONVERT_TO_TEXT: Converts a response payload from a binary blob to a Base64-encoded string.  If this property is not defined, the response payload will be passed through from the integration response to the method response without modification.
         */
    var contentHandling: js.UndefOr[ContentHandlingStrategy] = js.undefined
    /**
         * A key-value map specifying response parameters that are passed to the method response from the back end. The key is a method response header parameter name and the mapped value is an integration response header value, a static value enclosed within a pair of single quotes, or a JSON expression from the integration response body. The mapping key must match the pattern of method.response.header.{name}, where name is a valid and unique header name. The mapped non-static value must match the pattern of integration.response.header.{name} or integration.response.body.{JSON-expression}, where name is a valid and unique response header name and JSON-expression is a valid JSON expression without the $ prefix.
         */
    var responseParameters: js.UndefOr[MapOfStringToString] = js.undefined
    /**
         * Specifies the templates used to transform the integration response body. Response templates are represented as a key/value map, with a content-type as the key and a template as the value.
         */
    var responseTemplates: js.UndefOr[MapOfStringToString] = js.undefined
    /**
         * Specifies the regular expression (regex) pattern used to choose an integration response based on the response from the back end. For example, if the success response returns nothing and the error response returns some string, you could use the .+ regex to match error response. However, make sure that the error response does not contain any newline (\n) character in such cases. If the back end is an AWS Lambda function, the AWS Lambda function error header is matched. For all other HTTP and AWS back ends, the HTTP status code is matched.
         */
    var selectionPattern: js.UndefOr[String] = js.undefined
    /**
         * Specifies the status code that is used to map the integration response to an existing MethodResponse.
         */
    var statusCode: js.UndefOr[StatusCode] = js.undefined
  }
  
  
  trait MapOfApiStageThrottleSettings
    extends /* key */ ScalablyTyped.runtime.StringDictionary[ThrottleSettings]
  
  
  trait MapOfIntegrationResponse
    extends /* key */ ScalablyTyped.runtime.StringDictionary[IntegrationResponse]
  
  
  trait MapOfKeyUsages
    extends /* key */ ScalablyTyped.runtime.StringDictionary[ListOfUsage]
  
  
  trait MapOfMethod
    extends /* key */ ScalablyTyped.runtime.StringDictionary[Method]
  
  
  trait MapOfMethodResponse
    extends /* key */ ScalablyTyped.runtime.StringDictionary[MethodResponse]
  
  
  trait MapOfMethodSettings
    extends /* key */ ScalablyTyped.runtime.StringDictionary[MethodSetting]
  
  
  trait MapOfMethodSnapshot
    extends /* key */ ScalablyTyped.runtime.StringDictionary[MethodSnapshot]
  
  
  trait MapOfStringToBoolean
    extends /* key */ ScalablyTyped.runtime.StringDictionary[NullableBoolean]
  
  
  trait MapOfStringToList
    extends /* key */ ScalablyTyped.runtime.StringDictionary[ListOfString]
  
  
  trait MapOfStringToString
    extends /* key */ ScalablyTyped.runtime.StringDictionary[String]
  
  
  trait Method extends js.Object {
    /**
         * A boolean flag specifying whether a valid ApiKey is required to invoke this method.
         */
    var apiKeyRequired: js.UndefOr[NullableBoolean] = js.undefined
    /**
         * A list of authorization scopes configured on the method. The scopes are used with a COGNITO_USER_POOLS authorizer to authorize the method invocation. The authorization works by matching the method scopes against the scopes parsed from the access token in the incoming request. The method invocation is authorized if any method scopes matches a claimed scope in the access token. Otherwise, the invocation is not authorized. When the method scope is configured, the client must provide an access token instead of an identity token for authorization purposes.
         */
    var authorizationScopes: js.UndefOr[ListOfString] = js.undefined
    /**
         * The method's authorization type. Valid values are NONE for open access, AWS_IAM for using AWS IAM permissions, CUSTOM for using a custom authorizer, or COGNITO_USER_POOLS for using a Cognito user pool.
         */
    var authorizationType: js.UndefOr[String] = js.undefined
    /**
         * The identifier of an Authorizer to use on this method. The authorizationType must be CUSTOM.
         */
    var authorizerId: js.UndefOr[String] = js.undefined
    /**
         * The method's HTTP verb.
         */
    var httpMethod: js.UndefOr[String] = js.undefined
    /**
         * Gets the method's integration responsible for passing the client-submitted request to the back end and performing necessary transformations to make the request compliant with the back end.   Example:  Request  GET /restapis/uojnr9hd57/resources/0cjtch/methods/GET/integration HTTP/1.1 Content-Type: application/json Host: apigateway.us-east-1.amazonaws.com Content-Length: 117 X-Amz-Date: 20160613T213210Z Authorization: AWS4-HMAC-SHA256 Credential={access_key_ID}/20160613/us-east-1/apigateway/aws4_request, SignedHeaders=content-type;host;x-amz-date, Signature={sig4_hash} Response The successful response returns a 200 OK status code and a payload similar to the following: { "_links": { "curies": [ { "href": "https://docs.aws.amazon.com/apigateway/latest/developerguide/restapi-integration-{rel}.html", "name": "integration", "templated": true }, { "href": "https://docs.aws.amazon.com/apigateway/latest/developerguide/restapi-integration-response-{rel}.html", "name": "integrationresponse", "templated": true } ], "self": { "href": "/restapis/uojnr9hd57/resources/0cjtch/methods/GET/integration" }, "integration:delete": { "href": "/restapis/uojnr9hd57/resources/0cjtch/methods/GET/integration" }, "integration:responses": { "href": "/restapis/uojnr9hd57/resources/0cjtch/methods/GET/integration/responses/200", "name": "200", "title": "200" }, "integration:update": { "href": "/restapis/uojnr9hd57/resources/0cjtch/methods/GET/integration" }, "integrationresponse:put": { "href": "/restapis/uojnr9hd57/resources/0cjtch/methods/GET/integration/responses/{status_code}", "templated": true } }, "cacheKeyParameters": [], "cacheNamespace": "0cjtch", "credentials": "arn:aws:iam::123456789012:role/apigAwsProxyRole", "httpMethod": "POST", "passthroughBehavior": "WHEN_NO_MATCH", "requestTemplates": { "application/json": "{\n \"a\": \"$input.params('operand1')\",\n \"b\": \"$input.params('operand2')\", \n \"op\": \"$input.params('operator')\" \n}" }, "type": "AWS", "uri": "arn:aws:apigateway:us-west-2:lambda:path//2015-03-31/functions/arn:aws:lambda:us-west-2:123456789012:function:Calc/invocations", "_embedded": { "integration:responses": { "_links": { "self": { "href": "/restapis/uojnr9hd57/resources/0cjtch/methods/GET/integration/responses/200", "name": "200", "title": "200" }, "integrationresponse:delete": { "href": "/restapis/uojnr9hd57/resources/0cjtch/methods/GET/integration/responses/200" }, "integrationresponse:update": { "href": "/restapis/uojnr9hd57/resources/0cjtch/methods/GET/integration/responses/200" } }, "responseParameters": { "method.response.header.operator": "integration.response.body.op", "method.response.header.operand_2": "integration.response.body.b", "method.response.header.operand_1": "integration.response.body.a" }, "responseTemplates": { "application/json": "#set($res = $input.path('$'))\n{\n \"result\": \"$res.a, $res.b, $res.op => $res.c\",\n \"a\" : \"$res.a\",\n \"b\" : \"$res.b\",\n \"op\" : \"$res.op\",\n \"c\" : \"$res.c\"\n}" }, "selectionPattern": "", "statusCode": "200" } } }    AWS CLI 
         */
    var methodIntegration: js.UndefOr[Integration] = js.undefined
    /**
         * Gets a method response associated with a given HTTP status code.   The collection of method responses are encapsulated in a key-value map, where the key is a response's HTTP status code and the value is a MethodResponse resource that specifies the response returned to the caller from the back end through the integration response. Example: Get a 200 OK response of a GET method Request  GET /restapis/uojnr9hd57/resources/0cjtch/methods/GET/responses/200 HTTP/1.1 Content-Type: application/json Host: apigateway.us-east-1.amazonaws.com Content-Length: 117 X-Amz-Date: 20160613T215008Z Authorization: AWS4-HMAC-SHA256 Credential={access_key_ID}/20160613/us-east-1/apigateway/aws4_request, SignedHeaders=content-type;host;x-amz-date, Signature={sig4_hash} Response The successful response returns a 200 OK status code and a payload similar to the following: { "_links": { "curies": { "href": "https://docs.aws.amazon.com/apigateway/latest/developerguide/restapi-method-response-{rel}.html", "name": "methodresponse", "templated": true }, "self": { "href": "/restapis/uojnr9hd57/resources/0cjtch/methods/GET/responses/200", "title": "200" }, "methodresponse:delete": { "href": "/restapis/uojnr9hd57/resources/0cjtch/methods/GET/responses/200" }, "methodresponse:update": { "href": "/restapis/uojnr9hd57/resources/0cjtch/methods/GET/responses/200" } }, "responseModels": { "application/json": "Empty" }, "responseParameters": { "method.response.header.operator": false, "method.response.header.operand_2": false, "method.response.header.operand_1": false }, "statusCode": "200" }    AWS CLI 
         */
    var methodResponses: js.UndefOr[MapOfMethodResponse] = js.undefined
    /**
         * A human-friendly operation identifier for the method. For example, you can assign the operationName of ListPets for the GET /pets method in PetStore example.
         */
    var operationName: js.UndefOr[String] = js.undefined
    /**
         * A key-value map specifying data schemas, represented by Model resources, (as the mapped value) of the request payloads of given content types (as the mapping key).
         */
    var requestModels: js.UndefOr[MapOfStringToString] = js.undefined
    /**
         * A key-value map defining required or optional method request parameters that can be accepted by API Gateway. A key is a method request parameter name matching the pattern of method.request.{location}.{name}, where location is querystring, path, or header and name is a valid and unique parameter name. The value associated with the key is a Boolean flag indicating whether the parameter is required (true) or optional (false). The method request parameter names defined here are available in Integration to be mapped to integration request parameters or templates.
         */
    var requestParameters: js.UndefOr[MapOfStringToBoolean] = js.undefined
    /**
         * The identifier of a RequestValidator for request validation.
         */
    var requestValidatorId: js.UndefOr[String] = js.undefined
  }
  
  
  trait MethodResponse extends js.Object {
    /**
         * Specifies the Model resources used for the response's content-type. Response models are represented as a key/value map, with a content-type as the key and a Model name as the value.
         */
    var responseModels: js.UndefOr[MapOfStringToString] = js.undefined
    /**
         * A key-value map specifying required or optional response parameters that API Gateway can send back to the caller. A key defines a method response header and the value specifies whether the associated method response header is required or not. The expression of the key must match the pattern method.response.header.{name}, where name is a valid and unique header name. API Gateway passes certain integration response data to the method response headers specified here according to the mapping you prescribe in the API's IntegrationResponse. The integration response data that can be mapped include an integration response header expressed in integration.response.header.{name}, a static value enclosed within a pair of single quotes (e.g., 'application/json'), or a JSON expression from the back-end response payload in the form of integration.response.body.{JSON-expression}, where JSON-expression is a valid JSON expression without the $ prefix.)
         */
    var responseParameters: js.UndefOr[MapOfStringToBoolean] = js.undefined
    /**
         * The method response's status code.
         */
    var statusCode: js.UndefOr[StatusCode] = js.undefined
  }
  
  
  trait MethodSetting extends js.Object {
    /**
         * Specifies whether the cached responses are encrypted. The PATCH path for this setting is /{method_setting_key}/caching/dataEncrypted, and the value is a Boolean.
         */
    var cacheDataEncrypted: js.UndefOr[Boolean] = js.undefined
    /**
         * Specifies the time to live (TTL), in seconds, for cached responses. The higher the TTL, the longer the response will be cached. The PATCH path for this setting is /{method_setting_key}/caching/ttlInSeconds, and the value is an integer.
         */
    var cacheTtlInSeconds: js.UndefOr[Integer] = js.undefined
    /**
         * Specifies whether responses should be cached and returned for requests. A cache cluster must be enabled on the stage for responses to be cached. The PATCH path for this setting is /{method_setting_key}/caching/enabled, and the value is a Boolean.
         */
    var cachingEnabled: js.UndefOr[Boolean] = js.undefined
    /**
         * Specifies whether data trace logging is enabled for this method, which affects the log entries pushed to Amazon CloudWatch Logs. The PATCH path for this setting is /{method_setting_key}/logging/dataTrace, and the value is a Boolean.
         */
    var dataTraceEnabled: js.UndefOr[Boolean] = js.undefined
    /**
         * Specifies the logging level for this method, which affects the log entries pushed to Amazon CloudWatch Logs. The PATCH path for this setting is /{method_setting_key}/logging/loglevel, and the available levels are OFF, ERROR, and INFO.
         */
    var loggingLevel: js.UndefOr[String] = js.undefined
    /**
         * Specifies whether Amazon CloudWatch metrics are enabled for this method. The PATCH path for this setting is /{method_setting_key}/metrics/enabled, and the value is a Boolean.
         */
    var metricsEnabled: js.UndefOr[Boolean] = js.undefined
    /**
         * Specifies whether authorization is required for a cache invalidation request. The PATCH path for this setting is /{method_setting_key}/caching/requireAuthorizationForCacheControl, and the value is a Boolean.
         */
    var requireAuthorizationForCacheControl: js.UndefOr[Boolean] = js.undefined
    /**
         * Specifies the throttling burst limit. The PATCH path for this setting is /{method_setting_key}/throttling/burstLimit, and the value is an integer.
         */
    var throttlingBurstLimit: js.UndefOr[Integer] = js.undefined
    /**
         * Specifies the throttling rate limit. The PATCH path for this setting is /{method_setting_key}/throttling/rateLimit, and the value is a double.
         */
    var throttlingRateLimit: js.UndefOr[Double] = js.undefined
    /**
         * Specifies how to handle unauthorized requests for cache invalidation. The PATCH path for this setting is /{method_setting_key}/caching/unauthorizedCacheControlHeaderStrategy, and the available values are FAIL_WITH_403, SUCCEED_WITH_RESPONSE_HEADER, SUCCEED_WITHOUT_RESPONSE_HEADER.
         */
    var unauthorizedCacheControlHeaderStrategy: js.UndefOr[UnauthorizedCacheControlHeaderStrategy] = js.undefined
  }
  
  
  trait MethodSnapshot extends js.Object {
    /**
         * Specifies whether the method requires a valid ApiKey.
         */
    var apiKeyRequired: js.UndefOr[Boolean] = js.undefined
    /**
         * The method's authorization type. Valid values are NONE for open access, AWS_IAM for using AWS IAM permissions, CUSTOM for using a custom authorizer, or COGNITO_USER_POOLS for using a Cognito user pool.
         */
    var authorizationType: js.UndefOr[String] = js.undefined
  }
  
  
  trait Model extends js.Object {
    /**
         * The content-type for the model.
         */
    var contentType: js.UndefOr[String] = js.undefined
    /**
         * The description of the model.
         */
    var description: js.UndefOr[String] = js.undefined
    /**
         * The identifier for the model resource.
         */
    var id: js.UndefOr[String] = js.undefined
    /**
         * The name of the model. Must be an alphanumeric string.
         */
    var name: js.UndefOr[String] = js.undefined
    /**
         * The schema for the model. For application/json models, this should be JSON schema draft 4 model. Do not include "\*" characters in the description of any properties because such "\*" characters may be interpreted as the closing marker for comments in some languages, such as Java or JavaScript, causing the installation of your API's SDK generated by API Gateway to fail.
         */
    var schema: js.UndefOr[String] = js.undefined
  }
  
  
  trait Models extends js.Object {
    /**
         * The current page of elements from this collection.
         */
    var items: js.UndefOr[ListOfModel] = js.undefined
    var position: js.UndefOr[String] = js.undefined
  }
  
  
  trait PatchOperation extends js.Object {
    /**
         * The copy update operation's source as identified by a JSON-Pointer value referencing the location within the targeted resource to copy the value from. For example, to promote a canary deployment, you copy the canary deployment ID to the affiliated deployment ID by calling a PATCH request on a Stage resource with "op":"copy", "from":"/canarySettings/deploymentId" and "path":"/deploymentId".
         */
    var from: js.UndefOr[String] = js.undefined
    /**
         *  An update operation to be performed with this PATCH request. The valid value can be add, remove, replace or copy. Not all valid operations are supported for a given resource. Support of the operations depends on specific operational contexts. Attempts to apply an unsupported operation on a resource will return an error message.
         */
    var op: js.UndefOr[Op] = js.undefined
    /**
         * The op operation's target, as identified by a JSON Pointer value that references a location within the targeted resource. For example, if the target resource has an updateable property of {"name":"value"}, the path for this property is /name. If the name property value is a JSON object (e.g., {"name": {"child/name": "child-value"}}), the path for the child/name property will be /name/child~1name. Any slash ("/") character appearing in path names must be escaped with "~1", as shown in the example above. Each op operation can have only one path associated with it.
         */
    var path: js.UndefOr[String] = js.undefined
    /**
         * The new target value of the update operation. It is applicable for the add or replace operation. When using AWS CLI to update a property of a JSON value, enclose the JSON object with a pair of single quotes in a Linux shell, e.g., '{"a": ...}'. In a Windows shell, see Using JSON for Parameters.
         */
    var value: js.UndefOr[String] = js.undefined
  }
  
  
  trait PathToMapOfMethodSnapshot
    extends /* key */ ScalablyTyped.runtime.StringDictionary[MapOfMethodSnapshot]
  
  
  trait PutGatewayResponseRequest extends js.Object {
    /**
         * Response parameters (paths, query strings and headers) of the GatewayResponse as a string-to-string map of key-value pairs.
         */
    var responseParameters: js.UndefOr[MapOfStringToString] = js.undefined
    /**
         * Response templates of the GatewayResponse as a string-to-string map of key-value pairs.
         */
    var responseTemplates: js.UndefOr[MapOfStringToString] = js.undefined
    /**
         * [Required] The response type of the associated GatewayResponse. Valid values are ACCESS_DENIEDAPI_CONFIGURATION_ERRORAUTHORIZER_FAILURE AUTHORIZER_CONFIGURATION_ERRORBAD_REQUEST_PARAMETERSBAD_REQUEST_BODYDEFAULT_4XXDEFAULT_5XXEXPIRED_TOKENINVALID_SIGNATUREINTEGRATION_FAILUREINTEGRATION_TIMEOUTINVALID_API_KEYMISSING_AUTHENTICATION_TOKEN QUOTA_EXCEEDEDREQUEST_TOO_LARGERESOURCE_NOT_FOUNDTHROTTLEDUNAUTHORIZEDUNSUPPORTED_MEDIA_TYPE 
         */
    var responseType: GatewayResponseType
    /**
         * [Required] The string identifier of the associated RestApi.
         */
    var restApiId: String
    /**
         * The HTTP status code of the GatewayResponse.
         */
    var statusCode: js.UndefOr[StatusCode] = js.undefined
  }
  
  
  trait PutIntegrationRequest extends js.Object {
    /**
         * Specifies a put integration input's cache key parameters.
         */
    var cacheKeyParameters: js.UndefOr[ListOfString] = js.undefined
    /**
         * Specifies a put integration input's cache namespace.
         */
    var cacheNamespace: js.UndefOr[String] = js.undefined
    /**
         * The (id) of the VpcLink used for the integration when connectionType=VPC_LINK and undefined, otherwise.
         */
    var connectionId: js.UndefOr[String] = js.undefined
    /**
         * The type of the network connection to the integration endpoint. The valid value is INTERNET for connections through the public routable internet or VPC_LINK for private connections between API Gateway and a network load balancer in a VPC. The default value is INTERNET.
         */
    var connectionType: js.UndefOr[ConnectionType] = js.undefined
    /**
         * Specifies how to handle request payload content type conversions. Supported values are CONVERT_TO_BINARY and CONVERT_TO_TEXT, with the following behaviors:  CONVERT_TO_BINARY: Converts a request payload from a Base64-encoded string to the corresponding binary blob. CONVERT_TO_TEXT: Converts a request payload from a binary blob to a Base64-encoded string.  If this property is not defined, the request payload will be passed through from the method request to integration request without modification, provided that the passthroughBehaviors is configured to support payload pass-through.
         */
    var contentHandling: js.UndefOr[ContentHandlingStrategy] = js.undefined
    /**
         * Specifies whether credentials are required for a put integration.
         */
    var credentials: js.UndefOr[String] = js.undefined
    /**
         * [Required] Specifies a put integration request's HTTP method.
         */
    var httpMethod: String
    /**
         * Specifies a put integration HTTP method. When the integration type is HTTP or AWS, this field is required.
         */
    var integrationHttpMethod: js.UndefOr[String] = js.undefined
    /**
         * Specifies the pass-through behavior for incoming requests based on the Content-Type header in the request, and the available mapping templates specified as the requestTemplates property on the Integration resource. There are three valid values: WHEN_NO_MATCH, WHEN_NO_TEMPLATES, and NEVER.   WHEN_NO_MATCH passes the request body for unmapped content types through to the integration back end without transformation. NEVER rejects unmapped content types with an HTTP 415 'Unsupported Media Type' response. WHEN_NO_TEMPLATES allows pass-through when the integration has NO content types mapped to templates. However if there is at least one content type defined, unmapped content types will be rejected with the same 415 response. 
         */
    var passthroughBehavior: js.UndefOr[String] = js.undefined
    /**
         * A key-value map specifying request parameters that are passed from the method request to the back end. The key is an integration request parameter name and the associated value is a method request parameter value or static value that must be enclosed within single quotes and pre-encoded as required by the back end. The method request parameter value must match the pattern of method.request.{location}.{name}, where location is querystring, path, or header and name must be a valid and unique method request parameter name.
         */
    var requestParameters: js.UndefOr[MapOfStringToString] = js.undefined
    /**
         * Represents a map of Velocity templates that are applied on the request payload based on the value of the Content-Type header sent by the client. The content type value is the key in this map, and the template (as a String) is the value.
         */
    var requestTemplates: js.UndefOr[MapOfStringToString] = js.undefined
    /**
         * [Required] Specifies a put integration request's resource ID.
         */
    var resourceId: String
    /**
         * [Required] The string identifier of the associated RestApi.
         */
    var restApiId: String
    /**
         * Custom timeout between 50 and 29,000 milliseconds. The default value is 29,000 milliseconds or 29 seconds.
         */
    var timeoutInMillis: js.UndefOr[NullableInteger] = js.undefined
    /**
         * [Required] Specifies a put integration input's type.
         */
    var `type`: IntegrationType
    /**
         * Specifies Uniform Resource Identifier (URI) of the integration endpoint.   For HTTP or HTTP_PROXY integrations, the URI must be a fully formed, encoded HTTP(S) URL according to the RFC-3986 specification, for either standard integration, where connectionType is not VPC_LINK, or private integration, where connectionType is VPC_LINK. For a private HTTP integration, the URI is not used for routing.    For AWS or AWS_PROXY integrations, the URI is of the form arn:aws:apigateway:{region}:{subdomain.service|service}:path|action/{service_api}. Here, {Region} is the API Gateway region (e.g., us-east-1); {service} is the name of the integrated AWS service (e.g., s3); and {subdomain} is a designated subdomain supported by certain AWS service for fast host-name lookup. action can be used for an AWS service action-based API, using an Action={name}&amp;{p1}={v1}&amp;p2={v2}... query string. The ensuing {service_api} refers to a supported action {name} plus any required input parameters. Alternatively, path can be used for an AWS service path-based API. The ensuing service_api refers to the path to an AWS service resource, including the region of the integrated AWS service, if applicable. For example, for integration with the S3 API of GetObject, the uri can be either arn:aws:apigateway:us-west-2:s3:action/GetObject&amp;Bucket={bucket}&amp;Key={key} or arn:aws:apigateway:us-west-2:s3:path/{bucket}/{key} 
         */
    var uri: js.UndefOr[String] = js.undefined
  }
  
  
  trait PutIntegrationResponseRequest extends js.Object {
    /**
         * Specifies how to handle response payload content type conversions. Supported values are CONVERT_TO_BINARY and CONVERT_TO_TEXT, with the following behaviors:  CONVERT_TO_BINARY: Converts a response payload from a Base64-encoded string to the corresponding binary blob. CONVERT_TO_TEXT: Converts a response payload from a binary blob to a Base64-encoded string.  If this property is not defined, the response payload will be passed through from the integration response to the method response without modification.
         */
    var contentHandling: js.UndefOr[ContentHandlingStrategy] = js.undefined
    /**
         * [Required] Specifies a put integration response request's HTTP method.
         */
    var httpMethod: String
    /**
         * [Required] Specifies a put integration response request's resource identifier.
         */
    var resourceId: String
    /**
         * A key-value map specifying response parameters that are passed to the method response from the back end. The key is a method response header parameter name and the mapped value is an integration response header value, a static value enclosed within a pair of single quotes, or a JSON expression from the integration response body. The mapping key must match the pattern of method.response.header.{name}, where name is a valid and unique header name. The mapped non-static value must match the pattern of integration.response.header.{name} or integration.response.body.{JSON-expression}, where name must be a valid and unique response header name and JSON-expression a valid JSON expression without the $ prefix.
         */
    var responseParameters: js.UndefOr[MapOfStringToString] = js.undefined
    /**
         * Specifies a put integration response's templates.
         */
    var responseTemplates: js.UndefOr[MapOfStringToString] = js.undefined
    /**
         * [Required] The string identifier of the associated RestApi.
         */
    var restApiId: String
    /**
         * Specifies the selection pattern of a put integration response.
         */
    var selectionPattern: js.UndefOr[String] = js.undefined
    /**
         * [Required] Specifies the status code that is used to map the integration response to an existing MethodResponse.
         */
    var statusCode: StatusCode
  }
  
  
  trait PutMethodRequest extends js.Object {
    /**
         * Specifies whether the method required a valid ApiKey.
         */
    var apiKeyRequired: js.UndefOr[Boolean] = js.undefined
    /**
         * A list of authorization scopes configured on the method. The scopes are used with a COGNITO_USER_POOLS authorizer to authorize the method invocation. The authorization works by matching the method scopes against the scopes parsed from the access token in the incoming request. The method invocation is authorized if any method scopes matches a claimed scope in the access token. Otherwise, the invocation is not authorized. When the method scope is configured, the client must provide an access token instead of an identity token for authorization purposes.
         */
    var authorizationScopes: js.UndefOr[ListOfString] = js.undefined
    /**
         * [Required] The method's authorization type. Valid values are NONE for open access, AWS_IAM for using AWS IAM permissions, CUSTOM for using a custom authorizer, or COGNITO_USER_POOLS for using a Cognito user pool.
         */
    var authorizationType: String
    /**
         * Specifies the identifier of an Authorizer to use on this Method, if the type is CUSTOM or COGNITO_USER_POOLS. The authorizer identifier is generated by API Gateway when you created the authorizer.
         */
    var authorizerId: js.UndefOr[String] = js.undefined
    /**
         * [Required] Specifies the method request's HTTP method type.
         */
    var httpMethod: String
    /**
         * A human-friendly operation identifier for the method. For example, you can assign the operationName of ListPets for the GET /pets method in PetStore example.
         */
    var operationName: js.UndefOr[String] = js.undefined
    /**
         * Specifies the Model resources used for the request's content type. Request models are represented as a key/value map, with a content type as the key and a Model name as the value.
         */
    var requestModels: js.UndefOr[MapOfStringToString] = js.undefined
    /**
         * A key-value map defining required or optional method request parameters that can be accepted by API Gateway. A key defines a method request parameter name matching the pattern of method.request.{location}.{name}, where location is querystring, path, or header and name is a valid and unique parameter name. The value associated with the key is a Boolean flag indicating whether the parameter is required (true) or optional (false). The method request parameter names defined here are available in Integration to be mapped to integration request parameters or body-mapping templates.
         */
    var requestParameters: js.UndefOr[MapOfStringToBoolean] = js.undefined
    /**
         * The identifier of a RequestValidator for validating the method request.
         */
    var requestValidatorId: js.UndefOr[String] = js.undefined
    /**
         * [Required] The Resource identifier for the new Method resource.
         */
    var resourceId: String
    /**
         * [Required] The string identifier of the associated RestApi.
         */
    var restApiId: String
  }
  
  
  trait PutMethodResponseRequest extends js.Object {
    /**
         * [Required] The HTTP verb of the Method resource.
         */
    var httpMethod: String
    /**
         * [Required] The Resource identifier for the Method resource.
         */
    var resourceId: String
    /**
         * Specifies the Model resources used for the response's content type. Response models are represented as a key/value map, with a content type as the key and a Model name as the value.
         */
    var responseModels: js.UndefOr[MapOfStringToString] = js.undefined
    /**
         * A key-value map specifying required or optional response parameters that API Gateway can send back to the caller. A key defines a method response header name and the associated value is a Boolean flag indicating whether the method response parameter is required or not. The method response header names must match the pattern of method.response.header.{name}, where name is a valid and unique header name. The response parameter names defined here are available in the integration response to be mapped from an integration response header expressed in integration.response.header.{name}, a static value enclosed within a pair of single quotes (e.g., 'application/json'), or a JSON expression from the back-end response payload in the form of integration.response.body.{JSON-expression}, where JSON-expression is a valid JSON expression without the $ prefix.)
         */
    var responseParameters: js.UndefOr[MapOfStringToBoolean] = js.undefined
    /**
         * [Required] The string identifier of the associated RestApi.
         */
    var restApiId: String
    /**
         * [Required] The method response's status code.
         */
    var statusCode: StatusCode
  }
  
  
  trait PutRestApiRequest extends js.Object {
    /**
         * [Required] The PUT request body containing external API definitions. Currently, only OpenAPI definition JSON/YAML files are supported. The maximum size of the API definition file is 2MB.
         */
    var body: _Blob
    /**
         * A query parameter to indicate whether to rollback the API update (true) or not (false) when a warning is encountered. The default value is false.
         */
    var failOnWarnings: js.UndefOr[Boolean] = js.undefined
    /**
         * The mode query parameter to specify the update mode. Valid values are "merge" and "overwrite". By default, the update mode is "merge".
         */
    var mode: js.UndefOr[PutMode] = js.undefined
    /**
         * Custom header parameters as part of the request. For example, to exclude DocumentationParts from an imported API, set ignore=documentation as a parameters value, as in the AWS CLI command of aws apigateway import-rest-api --parameters ignore=documentation --body 'file:///path/to/imported-api-body.json'.
         */
    var parameters: js.UndefOr[MapOfStringToString] = js.undefined
    /**
         * [Required] The string identifier of the associated RestApi.
         */
    var restApiId: String
  }
  
  
  trait QuotaSettings extends js.Object {
    /**
         * The maximum number of requests that can be made in a given time period.
         */
    var limit: js.UndefOr[Integer] = js.undefined
    /**
         * The number of requests subtracted from the given limit in the initial time period.
         */
    var offset: js.UndefOr[Integer] = js.undefined
    /**
         * The time period in which the limit applies. Valid values are "DAY", "WEEK" or "MONTH".
         */
    var period: js.UndefOr[QuotaPeriodType] = js.undefined
  }
  
  
  trait RequestValidator extends js.Object {
    /**
         * The identifier of this RequestValidator.
         */
    var id: js.UndefOr[String] = js.undefined
    /**
         * The name of this RequestValidator
         */
    var name: js.UndefOr[String] = js.undefined
    /**
         * A Boolean flag to indicate whether to validate a request body according to the configured Model schema.
         */
    var validateRequestBody: js.UndefOr[Boolean] = js.undefined
    /**
         * A Boolean flag to indicate whether to validate request parameters (true) or not (false).
         */
    var validateRequestParameters: js.UndefOr[Boolean] = js.undefined
  }
  
  
  trait RequestValidators extends js.Object {
    /**
         * The current page of elements from this collection.
         */
    var items: js.UndefOr[ListOfRequestValidator] = js.undefined
    var position: js.UndefOr[String] = js.undefined
  }
  
  
  trait Resource extends js.Object {
    /**
         * The resource's identifier.
         */
    var id: js.UndefOr[String] = js.undefined
    /**
         * The parent resource's identifier.
         */
    var parentId: js.UndefOr[String] = js.undefined
    /**
         * The full path for this resource.
         */
    var path: js.UndefOr[String] = js.undefined
    /**
         * The last path segment for this resource.
         */
    var pathPart: js.UndefOr[String] = js.undefined
    /**
         * Gets an API resource's method of a given HTTP verb.  The resource methods are a map of methods indexed by methods' HTTP verbs enabled on the resource. This method map is included in the 200 OK response of the GET /restapis/{restapi_id}/resources/{resource_id} or GET /restapis/{restapi_id}/resources/{resource_id}?embed=methods request. Example: Get the GET method of an API resource Request GET /restapis/fugvjdxtri/resources/3kzxbg5sa2/methods/GET HTTP/1.1 Content-Type: application/json Host: apigateway.us-east-1.amazonaws.com X-Amz-Date: 20170223T031827Z Authorization: AWS4-HMAC-SHA256 Credential={access_key_ID}/20170223/us-east-1/apigateway/aws4_request, SignedHeaders=content-type;host;x-amz-date, Signature={sig4_hash} Response { "_links": { "curies": [ { "href": "https://docs.aws.amazon.com/apigateway/latest/developerguide/restapi-integration-{rel}.html", "name": "integration", "templated": true }, { "href": "https://docs.aws.amazon.com/apigateway/latest/developerguide/restapi-integration-response-{rel}.html", "name": "integrationresponse", "templated": true }, { "href": "https://docs.aws.amazon.com/apigateway/latest/developerguide/restapi-method-{rel}.html", "name": "method", "templated": true }, { "href": "https://docs.aws.amazon.com/apigateway/latest/developerguide/restapi-method-response-{rel}.html", "name": "methodresponse", "templated": true } ], "self": { "href": "/restapis/fugvjdxtri/resources/3kzxbg5sa2/methods/GET", "name": "GET", "title": "GET" }, "integration:put": { "href": "/restapis/fugvjdxtri/resources/3kzxbg5sa2/methods/GET/integration" }, "method:delete": { "href": "/restapis/fugvjdxtri/resources/3kzxbg5sa2/methods/GET" }, "method:integration": { "href": "/restapis/fugvjdxtri/resources/3kzxbg5sa2/methods/GET/integration" }, "method:responses": { "href": "/restapis/fugvjdxtri/resources/3kzxbg5sa2/methods/GET/responses/200", "name": "200", "title": "200" }, "method:update": { "href": "/restapis/fugvjdxtri/resources/3kzxbg5sa2/methods/GET" }, "methodresponse:put": { "href": "/restapis/fugvjdxtri/resources/3kzxbg5sa2/methods/GET/responses/{status_code}", "templated": true } }, "apiKeyRequired": false, "authorizationType": "NONE", "httpMethod": "GET", "_embedded": { "method:integration": { "_links": { "self": { "href": "/restapis/fugvjdxtri/resources/3kzxbg5sa2/methods/GET/integration" }, "integration:delete": { "href": "/restapis/fugvjdxtri/resources/3kzxbg5sa2/methods/GET/integration" }, "integration:responses": { "href": "/restapis/fugvjdxtri/resources/3kzxbg5sa2/methods/GET/integration/responses/200", "name": "200", "title": "200" }, "integration:update": { "href": "/restapis/fugvjdxtri/resources/3kzxbg5sa2/methods/GET/integration" }, "integrationresponse:put": { "href": "/restapis/fugvjdxtri/resources/3kzxbg5sa2/methods/GET/integration/responses/{status_code}", "templated": true } }, "cacheKeyParameters": [], "cacheNamespace": "3kzxbg5sa2", "credentials": "arn:aws:iam::123456789012:role/apigAwsProxyRole", "httpMethod": "POST", "passthroughBehavior": "WHEN_NO_MATCH", "requestParameters": { "integration.request.header.Content-Type": "'application/x-amz-json-1.1'" }, "requestTemplates": { "application/json": "{\n}" }, "type": "AWS", "uri": "arn:aws:apigateway:us-east-1:kinesis:action/ListStreams", "_embedded": { "integration:responses": { "_links": { "self": { "href": "/restapis/fugvjdxtri/resources/3kzxbg5sa2/methods/GET/integration/responses/200", "name": "200", "title": "200" }, "integrationresponse:delete": { "href": "/restapis/fugvjdxtri/resources/3kzxbg5sa2/methods/GET/integration/responses/200" }, "integrationresponse:update": { "href": "/restapis/fugvjdxtri/resources/3kzxbg5sa2/methods/GET/integration/responses/200" } }, "responseParameters": { "method.response.header.Content-Type": "'application/xml'" }, "responseTemplates": { "application/json": "$util.urlDecode(\"%3CkinesisStreams%3E#foreach($stream in $input.path('$.StreamNames'))%3Cstream%3E%3Cname%3E$stream%3C/name%3E%3C/stream%3E#end%3C/kinesisStreams%3E\")\n" }, "statusCode": "200" } } }, "method:responses": { "_links": { "self": { "href": "/restapis/fugvjdxtri/resources/3kzxbg5sa2/methods/GET/responses/200", "name": "200", "title": "200" }, "methodresponse:delete": { "href": "/restapis/fugvjdxtri/resources/3kzxbg5sa2/methods/GET/responses/200" }, "methodresponse:update": { "href": "/restapis/fugvjdxtri/resources/3kzxbg5sa2/methods/GET/responses/200" } }, "responseModels": { "application/json": "Empty" }, "responseParameters": { "method.response.header.Content-Type": false }, "statusCode": "200" } } } If the OPTIONS is enabled on the resource, you can follow the example here to get that method. Just replace the GET of the last path segment in the request URL with OPTIONS.   
         */
    var resourceMethods: js.UndefOr[MapOfMethod] = js.undefined
  }
  
  
  trait Resources extends js.Object {
    /**
         * The current page of elements from this collection.
         */
    var items: js.UndefOr[ListOfResource] = js.undefined
    var position: js.UndefOr[String] = js.undefined
  }
  
  
  trait RestApi extends js.Object {
    /**
         * The source of the API key for metering requests according to a usage plan. Valid values are: HEADER to read the API key from the X-API-Key header of a request. AUTHORIZER to read the API key from the UsageIdentifierKey from a custom authorizer. 
         */
    var apiKeySource: js.UndefOr[ApiKeySourceType] = js.undefined
    /**
         * The list of binary media types supported by the RestApi. By default, the RestApi supports only UTF-8-encoded text payloads.
         */
    var binaryMediaTypes: js.UndefOr[ListOfString] = js.undefined
    /**
         * The timestamp when the API was created.
         */
    var createdDate: js.UndefOr[Timestamp] = js.undefined
    /**
         * The API's description.
         */
    var description: js.UndefOr[String] = js.undefined
    /**
         * The endpoint configuration of this RestApi showing the endpoint types of the API. 
         */
    var endpointConfiguration: js.UndefOr[EndpointConfiguration] = js.undefined
    /**
         * The API's identifier. This identifier is unique across all of your APIs in API Gateway.
         */
    var id: js.UndefOr[String] = js.undefined
    /**
         * A nullable integer that is used to enable compression (with non-negative between 0 and 10485760 (10M) bytes, inclusive) or disable compression (with a null value) on an API. When compression is enabled, compression or decompression is not applied on the payload if the payload size is smaller than this value. Setting it to zero allows compression for any payload size.
         */
    var minimumCompressionSize: js.UndefOr[NullableInteger] = js.undefined
    /**
         * The API's name.
         */
    var name: js.UndefOr[String] = js.undefined
    /**
         * A stringified JSON policy document that applies to this RestApi regardless of the caller and Method configuration.
         */
    var policy: js.UndefOr[String] = js.undefined
    /**
         * A version identifier for the API.
         */
    var version: js.UndefOr[String] = js.undefined
    /**
         * The warning messages reported when failonwarnings is turned on during API import.
         */
    var warnings: js.UndefOr[ListOfString] = js.undefined
  }
  
  
  trait RestApis extends js.Object {
    /**
         * The current page of elements from this collection.
         */
    var items: js.UndefOr[ListOfRestApi] = js.undefined
    var position: js.UndefOr[String] = js.undefined
  }
  
  
  trait SdkConfigurationProperty extends js.Object {
    /**
         * The default value of an SdkType configuration property.
         */
    var defaultValue: js.UndefOr[String] = js.undefined
    /**
         * The description of an SdkType configuration property.
         */
    var description: js.UndefOr[String] = js.undefined
    /**
         * The user-friendly name of an SdkType configuration property.
         */
    var friendlyName: js.UndefOr[String] = js.undefined
    /**
         * The name of a an SdkType configuration property.
         */
    var name: js.UndefOr[String] = js.undefined
    /**
         * A boolean flag of an SdkType configuration property to indicate if the associated SDK configuration property is required (true) or not (false).
         */
    var required: js.UndefOr[Boolean] = js.undefined
  }
  
  
  trait SdkResponse extends js.Object {
    /**
         * The binary blob response to GetSdk, which contains the generated SDK.
         */
    var body: js.UndefOr[_Blob] = js.undefined
    /**
         * The content-disposition header value in the HTTP response.
         */
    var contentDisposition: js.UndefOr[String] = js.undefined
    /**
         * The content-type header value in the HTTP response.
         */
    var contentType: js.UndefOr[String] = js.undefined
  }
  
  
  trait SdkType extends js.Object {
    /**
         * A list of configuration properties of an SdkType.
         */
    var configurationProperties: js.UndefOr[ListOfSdkConfigurationProperty] = js.undefined
    /**
         * The description of an SdkType.
         */
    var description: js.UndefOr[String] = js.undefined
    /**
         * The user-friendly name of an SdkType instance.
         */
    var friendlyName: js.UndefOr[String] = js.undefined
    /**
         * The identifier of an SdkType instance.
         */
    var id: js.UndefOr[String] = js.undefined
  }
  
  
  trait SdkTypes extends js.Object {
    /**
         * The current page of elements from this collection.
         */
    var items: js.UndefOr[ListOfSdkType] = js.undefined
    var position: js.UndefOr[String] = js.undefined
  }
  
  
  trait Stage extends js.Object {
    /**
         * Settings for logging access in this stage.
         */
    var accessLogSettings: js.UndefOr[AccessLogSettings] = js.undefined
    /**
         * Specifies whether a cache cluster is enabled for the stage.
         */
    var cacheClusterEnabled: js.UndefOr[Boolean] = js.undefined
    /**
         * The size of the cache cluster for the stage, if enabled.
         */
    var cacheClusterSize: js.UndefOr[CacheClusterSize] = js.undefined
    /**
         * The status of the cache cluster for the stage, if enabled.
         */
    var cacheClusterStatus: js.UndefOr[CacheClusterStatus] = js.undefined
    /**
         * Settings for the canary deployment in this stage.
         */
    var canarySettings: js.UndefOr[CanarySettings] = js.undefined
    /**
         * The identifier of a client certificate for an API stage.
         */
    var clientCertificateId: js.UndefOr[String] = js.undefined
    /**
         * The timestamp when the stage was created.
         */
    var createdDate: js.UndefOr[Timestamp] = js.undefined
    /**
         * The identifier of the Deployment that the stage points to.
         */
    var deploymentId: js.UndefOr[String] = js.undefined
    /**
         * The stage's description.
         */
    var description: js.UndefOr[String] = js.undefined
    /**
         * The version of the associated API documentation.
         */
    var documentationVersion: js.UndefOr[String] = js.undefined
    /**
         * The timestamp when the stage last updated.
         */
    var lastUpdatedDate: js.UndefOr[Timestamp] = js.undefined
    /**
         * A map that defines the method settings for a Stage resource. Keys (designated as /{method_setting_key below) are method paths defined as {resource_path}/{http_method} for an individual method override, or /\*\* for overriding all methods in the stage. 
         */
    var methodSettings: js.UndefOr[MapOfMethodSettings] = js.undefined
    /**
         * The name of the stage is the first path segment in the Uniform Resource Identifier (URI) of a call to API Gateway.
         */
    var stageName: js.UndefOr[String] = js.undefined
    /**
         * The collection of tags. Each tag element is associated with a given resource.
         */
    var tags: js.UndefOr[MapOfStringToString] = js.undefined
    /**
         * Specifies whether active tracing with X-ray is enabled for the Stage.
         */
    var tracingEnabled: js.UndefOr[Boolean] = js.undefined
    /**
         * A map that defines the stage variables for a Stage resource. Variable names can have alphanumeric and underscore characters, and the values must match [A-Za-z0-9-._~:/?#&amp;=,]+.
         */
    var variables: js.UndefOr[MapOfStringToString] = js.undefined
    /**
         * The ARN of the WebAcl associated with the Stage.
         */
    var webAclArn: js.UndefOr[String] = js.undefined
  }
  
  
  trait StageKey extends js.Object {
    /**
         * The string identifier of the associated RestApi.
         */
    var restApiId: js.UndefOr[String] = js.undefined
    /**
         * The stage name associated with the stage key.
         */
    var stageName: js.UndefOr[String] = js.undefined
  }
  
  
  trait Stages extends js.Object {
    /**
         * The current page of elements from this collection.
         */
    var item: js.UndefOr[ListOfStage] = js.undefined
  }
  
  
  trait TagResourceRequest extends js.Object {
    /**
         * [Required] The ARN of a resource that can be tagged. The resource ARN must be URL-encoded. At present, Stage is the only taggable resource.
         */
    var resourceArn: String
    /**
         * [Required] The key-value map of strings. The valid character set is [a-zA-Z+-=._:/]. The tag key can be up to 128 characters and must not start with aws:. The tag value can be up to 256 characters.
         */
    var tags: MapOfStringToString
  }
  
  
  trait Tags extends js.Object {
    /**
         * The collection of tags. Each tag element is associated with a given resource.
         */
    var tags: js.UndefOr[MapOfStringToString] = js.undefined
  }
  
  
  trait Template extends js.Object {
    /**
         * The Apache Velocity Template Language (VTL) template content used for the template resource.
         */
    var value: js.UndefOr[String] = js.undefined
  }
  
  
  trait TestInvokeAuthorizerRequest extends js.Object {
    /**
         * [Optional] A key-value map of additional context variables.
         */
    var additionalContext: js.UndefOr[MapOfStringToString] = js.undefined
    /**
         * [Required] Specifies a test invoke authorizer request's Authorizer ID.
         */
    var authorizerId: String
    /**
         * [Optional] The simulated request body of an incoming invocation request.
         */
    var body: js.UndefOr[String] = js.undefined
    /**
         * [Required] A key-value map of headers to simulate an incoming invocation request. This is where the incoming authorization token, or identity source, should be specified.
         */
    var headers: js.UndefOr[MapOfStringToString] = js.undefined
    /**
         * [Optional] The headers as a map from string to list of values to simulate an incoming invocation request. This is where the incoming authorization token, or identity source, may be specified.
         */
    var multiValueHeaders: js.UndefOr[MapOfStringToList] = js.undefined
    /**
         * [Optional] The URI path, including query string, of the simulated invocation request. Use this to specify path parameters and query string parameters.
         */
    var pathWithQueryString: js.UndefOr[String] = js.undefined
    /**
         * [Required] The string identifier of the associated RestApi.
         */
    var restApiId: String
    /**
         * A key-value map of stage variables to simulate an invocation on a deployed Stage.
         */
    var stageVariables: js.UndefOr[MapOfStringToString] = js.undefined
  }
  
  
  trait TestInvokeAuthorizerResponse extends js.Object {
    var authorization: js.UndefOr[MapOfStringToList] = js.undefined
    /**
         * The open identity claims, with any supported custom attributes, returned from the Cognito Your User Pool configured for the API.
         */
    var claims: js.UndefOr[MapOfStringToString] = js.undefined
    /**
         * The HTTP status code that the client would have received. Value is 0 if the authorizer succeeded.
         */
    var clientStatus: js.UndefOr[Integer] = js.undefined
    /**
         * The execution latency of the test authorizer request.
         */
    var latency: js.UndefOr[Long] = js.undefined
    /**
         * The API Gateway execution log for the test authorizer request.
         */
    var log: js.UndefOr[String] = js.undefined
    /**
         * The JSON policy document returned by the Authorizer
         */
    var policy: js.UndefOr[String] = js.undefined
    /**
         * The principal identity returned by the Authorizer
         */
    var principalId: js.UndefOr[String] = js.undefined
  }
  
  
  trait TestInvokeMethodRequest extends js.Object {
    /**
         * The simulated request body of an incoming invocation request.
         */
    var body: js.UndefOr[String] = js.undefined
    /**
         * A ClientCertificate identifier to use in the test invocation. API Gateway will use the certificate when making the HTTPS request to the defined back-end endpoint.
         */
    var clientCertificateId: js.UndefOr[String] = js.undefined
    /**
         * A key-value map of headers to simulate an incoming invocation request.
         */
    var headers: js.UndefOr[MapOfStringToString] = js.undefined
    /**
         * [Required] Specifies a test invoke method request's HTTP method.
         */
    var httpMethod: String
    /**
         * The headers as a map from string to list of values to simulate an incoming invocation request.
         */
    var multiValueHeaders: js.UndefOr[MapOfStringToList] = js.undefined
    /**
         * The URI path, including query string, of the simulated invocation request. Use this to specify path parameters and query string parameters.
         */
    var pathWithQueryString: js.UndefOr[String] = js.undefined
    /**
         * [Required] Specifies a test invoke method request's resource ID.
         */
    var resourceId: String
    /**
         * [Required] The string identifier of the associated RestApi.
         */
    var restApiId: String
    /**
         * A key-value map of stage variables to simulate an invocation on a deployed Stage.
         */
    var stageVariables: js.UndefOr[MapOfStringToString] = js.undefined
  }
  
  
  trait TestInvokeMethodResponse extends js.Object {
    /**
         * The body of the HTTP response.
         */
    var body: js.UndefOr[String] = js.undefined
    /**
         * The headers of the HTTP response.
         */
    var headers: js.UndefOr[MapOfStringToString] = js.undefined
    /**
         * The execution latency of the test invoke request.
         */
    var latency: js.UndefOr[Long] = js.undefined
    /**
         * The API Gateway execution log for the test invoke request.
         */
    var log: js.UndefOr[String] = js.undefined
    /**
         * The headers of the HTTP response as a map from string to list of values.
         */
    var multiValueHeaders: js.UndefOr[MapOfStringToList] = js.undefined
    /**
         * The HTTP status code.
         */
    var status: js.UndefOr[Integer] = js.undefined
  }
  
  
  trait ThrottleSettings extends js.Object {
    /**
         * The API request burst limit, the maximum rate limit over a time ranging from one to a few seconds, depending upon whether the underlying token bucket is at its full capacity.
         */
    var burstLimit: js.UndefOr[Integer] = js.undefined
    /**
         * The API request steady-state rate limit.
         */
    var rateLimit: js.UndefOr[Double] = js.undefined
  }
  
  @js.native
  trait Types
    extends awsDashSdkLib.libServiceMod.Service {
    @JSName("config")
    var config_Types: awsDashSdkLib.libConfigMod.ConfigBase with ClientConfiguration = js.native
    /**
       * Create an ApiKey resource.  AWS CLI
       */
    def createApiKey(): awsDashSdkLib.libRequestMod.Request[ApiKey, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Create an ApiKey resource.  AWS CLI
       */
    def createApiKey(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ ApiKey, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[ApiKey, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Create an ApiKey resource.  AWS CLI
       */
    def createApiKey(params: CreateApiKeyRequest): awsDashSdkLib.libRequestMod.Request[ApiKey, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Create an ApiKey resource.  AWS CLI
       */
    def createApiKey(
      params: CreateApiKeyRequest,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ ApiKey, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[ApiKey, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Adds a new Authorizer resource to an existing RestApi resource. AWS CLI
       */
    def createAuthorizer(): awsDashSdkLib.libRequestMod.Request[Authorizer, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Adds a new Authorizer resource to an existing RestApi resource. AWS CLI
       */
    def createAuthorizer(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ Authorizer, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[Authorizer, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Adds a new Authorizer resource to an existing RestApi resource. AWS CLI
       */
    def createAuthorizer(params: CreateAuthorizerRequest): awsDashSdkLib.libRequestMod.Request[Authorizer, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Adds a new Authorizer resource to an existing RestApi resource. AWS CLI
       */
    def createAuthorizer(
      params: CreateAuthorizerRequest,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ Authorizer, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[Authorizer, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Creates a new BasePathMapping resource.
       */
    def createBasePathMapping(): awsDashSdkLib.libRequestMod.Request[BasePathMapping, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Creates a new BasePathMapping resource.
       */
    def createBasePathMapping(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ BasePathMapping, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[BasePathMapping, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Creates a new BasePathMapping resource.
       */
    def createBasePathMapping(params: CreateBasePathMappingRequest): awsDashSdkLib.libRequestMod.Request[BasePathMapping, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Creates a new BasePathMapping resource.
       */
    def createBasePathMapping(
      params: CreateBasePathMappingRequest,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ BasePathMapping, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[BasePathMapping, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Creates a Deployment resource, which makes a specified RestApi callable over the internet.
       */
    def createDeployment(): awsDashSdkLib.libRequestMod.Request[Deployment, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Creates a Deployment resource, which makes a specified RestApi callable over the internet.
       */
    def createDeployment(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ Deployment, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[Deployment, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Creates a Deployment resource, which makes a specified RestApi callable over the internet.
       */
    def createDeployment(params: CreateDeploymentRequest): awsDashSdkLib.libRequestMod.Request[Deployment, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Creates a Deployment resource, which makes a specified RestApi callable over the internet.
       */
    def createDeployment(
      params: CreateDeploymentRequest,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ Deployment, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[Deployment, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * 
       */
    def createDocumentationPart(): awsDashSdkLib.libRequestMod.Request[DocumentationPart, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * 
       */
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
    /**
       * 
       */
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
    /**
       * 
       */
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
    /**
       * 
       */
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
    /**
       * Creates a new domain name.
       */
    def createDomainName(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ DomainName, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[DomainName, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Creates a new domain name.
       */
    def createDomainName(params: CreateDomainNameRequest): awsDashSdkLib.libRequestMod.Request[DomainName, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Creates a new domain name.
       */
    def createDomainName(
      params: CreateDomainNameRequest,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ DomainName, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[DomainName, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Adds a new Model resource to an existing RestApi resource.
       */
    def createModel(): awsDashSdkLib.libRequestMod.Request[Model, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Adds a new Model resource to an existing RestApi resource.
       */
    def createModel(callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ Model, scala.Unit]): awsDashSdkLib.libRequestMod.Request[Model, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Adds a new Model resource to an existing RestApi resource.
       */
    def createModel(params: CreateModelRequest): awsDashSdkLib.libRequestMod.Request[Model, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Adds a new Model resource to an existing RestApi resource.
       */
    def createModel(
      params: CreateModelRequest,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ Model, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[Model, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Creates a ReqeustValidator of a given RestApi.
       */
    def createRequestValidator(): awsDashSdkLib.libRequestMod.Request[RequestValidator, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Creates a ReqeustValidator of a given RestApi.
       */
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
    /**
       * Creates a ReqeustValidator of a given RestApi.
       */
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
    /**
       * Creates a Resource resource.
       */
    def createResource(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ Resource, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[Resource, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Creates a Resource resource.
       */
    def createResource(params: CreateResourceRequest): awsDashSdkLib.libRequestMod.Request[Resource, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Creates a Resource resource.
       */
    def createResource(
      params: CreateResourceRequest,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ Resource, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[Resource, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Creates a new RestApi resource.
       */
    def createRestApi(): awsDashSdkLib.libRequestMod.Request[RestApi, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Creates a new RestApi resource.
       */
    def createRestApi(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ RestApi, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[RestApi, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Creates a new RestApi resource.
       */
    def createRestApi(params: CreateRestApiRequest): awsDashSdkLib.libRequestMod.Request[RestApi, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Creates a new RestApi resource.
       */
    def createRestApi(
      params: CreateRestApiRequest,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ RestApi, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[RestApi, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Creates a new Stage resource that references a pre-existing Deployment for the API. 
       */
    def createStage(): awsDashSdkLib.libRequestMod.Request[Stage, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Creates a new Stage resource that references a pre-existing Deployment for the API. 
       */
    def createStage(callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ Stage, scala.Unit]): awsDashSdkLib.libRequestMod.Request[Stage, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Creates a new Stage resource that references a pre-existing Deployment for the API. 
       */
    def createStage(params: CreateStageRequest): awsDashSdkLib.libRequestMod.Request[Stage, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Creates a new Stage resource that references a pre-existing Deployment for the API. 
       */
    def createStage(
      params: CreateStageRequest,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ Stage, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[Stage, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Creates a usage plan with the throttle and quota limits, as well as the associated API stages, specified in the payload. 
       */
    def createUsagePlan(): awsDashSdkLib.libRequestMod.Request[UsagePlan, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Creates a usage plan with the throttle and quota limits, as well as the associated API stages, specified in the payload. 
       */
    def createUsagePlan(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ UsagePlan, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[UsagePlan, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Creates a usage plan with the throttle and quota limits, as well as the associated API stages, specified in the payload. 
       */
    def createUsagePlan(params: CreateUsagePlanRequest): awsDashSdkLib.libRequestMod.Request[UsagePlan, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Creates a usage plan with the throttle and quota limits, as well as the associated API stages, specified in the payload. 
       */
    def createUsagePlan(
      params: CreateUsagePlanRequest,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ UsagePlan, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[UsagePlan, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Creates a usage plan key for adding an existing API key to a usage plan.
       */
    def createUsagePlanKey(): awsDashSdkLib.libRequestMod.Request[UsagePlanKey, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Creates a usage plan key for adding an existing API key to a usage plan.
       */
    def createUsagePlanKey(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ UsagePlanKey, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[UsagePlanKey, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Creates a usage plan key for adding an existing API key to a usage plan.
       */
    def createUsagePlanKey(params: CreateUsagePlanKeyRequest): awsDashSdkLib.libRequestMod.Request[UsagePlanKey, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Creates a usage plan key for adding an existing API key to a usage plan.
       */
    def createUsagePlanKey(
      params: CreateUsagePlanKeyRequest,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ UsagePlanKey, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[UsagePlanKey, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Creates a VPC link, under the caller's account in a selected region, in an asynchronous operation that typically takes 2-4 minutes to complete and become operational. The caller must have permissions to create and update VPC Endpoint services.
       */
    def createVpcLink(): awsDashSdkLib.libRequestMod.Request[VpcLink, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Creates a VPC link, under the caller's account in a selected region, in an asynchronous operation that typically takes 2-4 minutes to complete and become operational. The caller must have permissions to create and update VPC Endpoint services.
       */
    def createVpcLink(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ VpcLink, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[VpcLink, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Creates a VPC link, under the caller's account in a selected region, in an asynchronous operation that typically takes 2-4 minutes to complete and become operational. The caller must have permissions to create and update VPC Endpoint services.
       */
    def createVpcLink(params: CreateVpcLinkRequest): awsDashSdkLib.libRequestMod.Request[VpcLink, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Creates a VPC link, under the caller's account in a selected region, in an asynchronous operation that typically takes 2-4 minutes to complete and become operational. The caller must have permissions to create and update VPC Endpoint services.
       */
    def createVpcLink(
      params: CreateVpcLinkRequest,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ VpcLink, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[VpcLink, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Deletes the ApiKey resource.
       */
    def deleteApiKey(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Deletes the ApiKey resource.
       */
    def deleteApiKey(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Deletes the ApiKey resource.
       */
    def deleteApiKey(params: DeleteApiKeyRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Deletes the ApiKey resource.
       */
    def deleteApiKey(
      params: DeleteApiKeyRequest,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Deletes an existing Authorizer resource. AWS CLI
       */
    def deleteAuthorizer(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Deletes an existing Authorizer resource. AWS CLI
       */
    def deleteAuthorizer(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Deletes an existing Authorizer resource. AWS CLI
       */
    def deleteAuthorizer(params: DeleteAuthorizerRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Deletes an existing Authorizer resource. AWS CLI
       */
    def deleteAuthorizer(
      params: DeleteAuthorizerRequest,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Deletes the BasePathMapping resource.
       */
    def deleteBasePathMapping(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Deletes the BasePathMapping resource.
       */
    def deleteBasePathMapping(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Deletes the BasePathMapping resource.
       */
    def deleteBasePathMapping(params: DeleteBasePathMappingRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Deletes the BasePathMapping resource.
       */
    def deleteBasePathMapping(
      params: DeleteBasePathMappingRequest,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Deletes the ClientCertificate resource.
       */
    def deleteClientCertificate(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Deletes the ClientCertificate resource.
       */
    def deleteClientCertificate(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Deletes the ClientCertificate resource.
       */
    def deleteClientCertificate(params: DeleteClientCertificateRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Deletes the ClientCertificate resource.
       */
    def deleteClientCertificate(
      params: DeleteClientCertificateRequest,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Deletes a Deployment resource. Deleting a deployment will only succeed if there are no Stage resources associated with it.
       */
    def deleteDeployment(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Deletes a Deployment resource. Deleting a deployment will only succeed if there are no Stage resources associated with it.
       */
    def deleteDeployment(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Deletes a Deployment resource. Deleting a deployment will only succeed if there are no Stage resources associated with it.
       */
    def deleteDeployment(params: DeleteDeploymentRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Deletes a Deployment resource. Deleting a deployment will only succeed if there are no Stage resources associated with it.
       */
    def deleteDeployment(
      params: DeleteDeploymentRequest,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * 
       */
    def deleteDocumentationPart(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * 
       */
    def deleteDocumentationPart(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * 
       */
    def deleteDocumentationPart(params: DeleteDocumentationPartRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * 
       */
    def deleteDocumentationPart(
      params: DeleteDocumentationPartRequest,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * 
       */
    def deleteDocumentationVersion(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * 
       */
    def deleteDocumentationVersion(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * 
       */
    def deleteDocumentationVersion(params: DeleteDocumentationVersionRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * 
       */
    def deleteDocumentationVersion(
      params: DeleteDocumentationVersionRequest,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Deletes the DomainName resource.
       */
    def deleteDomainName(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Deletes the DomainName resource.
       */
    def deleteDomainName(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Deletes the DomainName resource.
       */
    def deleteDomainName(params: DeleteDomainNameRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Deletes the DomainName resource.
       */
    def deleteDomainName(
      params: DeleteDomainNameRequest,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Clears any customization of a GatewayResponse of a specified response type on the given RestApi and resets it with the default settings.
       */
    def deleteGatewayResponse(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Clears any customization of a GatewayResponse of a specified response type on the given RestApi and resets it with the default settings.
       */
    def deleteGatewayResponse(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Clears any customization of a GatewayResponse of a specified response type on the given RestApi and resets it with the default settings.
       */
    def deleteGatewayResponse(params: DeleteGatewayResponseRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Clears any customization of a GatewayResponse of a specified response type on the given RestApi and resets it with the default settings.
       */
    def deleteGatewayResponse(
      params: DeleteGatewayResponseRequest,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Represents a delete integration.
       */
    def deleteIntegration(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Represents a delete integration.
       */
    def deleteIntegration(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Represents a delete integration.
       */
    def deleteIntegration(params: DeleteIntegrationRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Represents a delete integration.
       */
    def deleteIntegration(
      params: DeleteIntegrationRequest,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Represents a delete integration response.
       */
    def deleteIntegrationResponse(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Represents a delete integration response.
       */
    def deleteIntegrationResponse(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Represents a delete integration response.
       */
    def deleteIntegrationResponse(params: DeleteIntegrationResponseRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Represents a delete integration response.
       */
    def deleteIntegrationResponse(
      params: DeleteIntegrationResponseRequest,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Deletes an existing Method resource.
       */
    def deleteMethod(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Deletes an existing Method resource.
       */
    def deleteMethod(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Deletes an existing Method resource.
       */
    def deleteMethod(params: DeleteMethodRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Deletes an existing Method resource.
       */
    def deleteMethod(
      params: DeleteMethodRequest,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Deletes an existing MethodResponse resource.
       */
    def deleteMethodResponse(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Deletes an existing MethodResponse resource.
       */
    def deleteMethodResponse(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Deletes an existing MethodResponse resource.
       */
    def deleteMethodResponse(params: DeleteMethodResponseRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Deletes an existing MethodResponse resource.
       */
    def deleteMethodResponse(
      params: DeleteMethodResponseRequest,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Deletes a model.
       */
    def deleteModel(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Deletes a model.
       */
    def deleteModel(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Deletes a model.
       */
    def deleteModel(params: DeleteModelRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Deletes a model.
       */
    def deleteModel(
      params: DeleteModelRequest,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Deletes a RequestValidator of a given RestApi.
       */
    def deleteRequestValidator(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Deletes a RequestValidator of a given RestApi.
       */
    def deleteRequestValidator(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Deletes a RequestValidator of a given RestApi.
       */
    def deleteRequestValidator(params: DeleteRequestValidatorRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Deletes a RequestValidator of a given RestApi.
       */
    def deleteRequestValidator(
      params: DeleteRequestValidatorRequest,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Deletes a Resource resource.
       */
    def deleteResource(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Deletes a Resource resource.
       */
    def deleteResource(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Deletes a Resource resource.
       */
    def deleteResource(params: DeleteResourceRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Deletes a Resource resource.
       */
    def deleteResource(
      params: DeleteResourceRequest,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Deletes the specified API.
       */
    def deleteRestApi(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Deletes the specified API.
       */
    def deleteRestApi(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Deletes the specified API.
       */
    def deleteRestApi(params: DeleteRestApiRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Deletes the specified API.
       */
    def deleteRestApi(
      params: DeleteRestApiRequest,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Deletes a Stage resource.
       */
    def deleteStage(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Deletes a Stage resource.
       */
    def deleteStage(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Deletes a Stage resource.
       */
    def deleteStage(params: DeleteStageRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Deletes a Stage resource.
       */
    def deleteStage(
      params: DeleteStageRequest,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Deletes a usage plan of a given plan Id.
       */
    def deleteUsagePlan(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Deletes a usage plan of a given plan Id.
       */
    def deleteUsagePlan(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Deletes a usage plan of a given plan Id.
       */
    def deleteUsagePlan(params: DeleteUsagePlanRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Deletes a usage plan of a given plan Id.
       */
    def deleteUsagePlan(
      params: DeleteUsagePlanRequest,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Deletes a usage plan key and remove the underlying API key from the associated usage plan.
       */
    def deleteUsagePlanKey(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Deletes a usage plan key and remove the underlying API key from the associated usage plan.
       */
    def deleteUsagePlanKey(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Deletes a usage plan key and remove the underlying API key from the associated usage plan.
       */
    def deleteUsagePlanKey(params: DeleteUsagePlanKeyRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Deletes a usage plan key and remove the underlying API key from the associated usage plan.
       */
    def deleteUsagePlanKey(
      params: DeleteUsagePlanKeyRequest,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Deletes an existing VpcLink of a specified identifier.
       */
    def deleteVpcLink(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Deletes an existing VpcLink of a specified identifier.
       */
    def deleteVpcLink(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Deletes an existing VpcLink of a specified identifier.
       */
    def deleteVpcLink(params: DeleteVpcLinkRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Deletes an existing VpcLink of a specified identifier.
       */
    def deleteVpcLink(
      params: DeleteVpcLinkRequest,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Flushes all authorizer cache entries on a stage.
       */
    def flushStageAuthorizersCache(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Flushes all authorizer cache entries on a stage.
       */
    def flushStageAuthorizersCache(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Flushes all authorizer cache entries on a stage.
       */
    def flushStageAuthorizersCache(params: FlushStageAuthorizersCacheRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Flushes all authorizer cache entries on a stage.
       */
    def flushStageAuthorizersCache(
      params: FlushStageAuthorizersCacheRequest,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Flushes a stage's cache.
       */
    def flushStageCache(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Flushes a stage's cache.
       */
    def flushStageCache(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Flushes a stage's cache.
       */
    def flushStageCache(params: FlushStageCacheRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Flushes a stage's cache.
       */
    def flushStageCache(
      params: FlushStageCacheRequest,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Generates a ClientCertificate resource.
       */
    def generateClientCertificate(): awsDashSdkLib.libRequestMod.Request[ClientCertificate, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Generates a ClientCertificate resource.
       */
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
    /**
       * Generates a ClientCertificate resource.
       */
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
    /**
       * Gets information about the current Account resource.
       */
    def getAccount(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ Account, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[Account, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Gets information about the current Account resource.
       */
    def getAccount(params: GetAccountRequest): awsDashSdkLib.libRequestMod.Request[Account, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Gets information about the current Account resource.
       */
    def getAccount(
      params: GetAccountRequest,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ Account, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[Account, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Gets information about the current ApiKey resource.
       */
    def getApiKey(): awsDashSdkLib.libRequestMod.Request[ApiKey, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Gets information about the current ApiKey resource.
       */
    def getApiKey(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ ApiKey, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[ApiKey, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Gets information about the current ApiKey resource.
       */
    def getApiKey(params: GetApiKeyRequest): awsDashSdkLib.libRequestMod.Request[ApiKey, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Gets information about the current ApiKey resource.
       */
    def getApiKey(
      params: GetApiKeyRequest,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ ApiKey, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[ApiKey, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Gets information about the current ApiKeys resource.
       */
    def getApiKeys(): awsDashSdkLib.libRequestMod.Request[ApiKeys, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Gets information about the current ApiKeys resource.
       */
    def getApiKeys(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ ApiKeys, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[ApiKeys, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Gets information about the current ApiKeys resource.
       */
    def getApiKeys(params: GetApiKeysRequest): awsDashSdkLib.libRequestMod.Request[ApiKeys, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Gets information about the current ApiKeys resource.
       */
    def getApiKeys(
      params: GetApiKeysRequest,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ ApiKeys, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[ApiKeys, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Describe an existing Authorizer resource. AWS CLI
       */
    def getAuthorizer(): awsDashSdkLib.libRequestMod.Request[Authorizer, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Describe an existing Authorizer resource. AWS CLI
       */
    def getAuthorizer(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ Authorizer, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[Authorizer, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Describe an existing Authorizer resource. AWS CLI
       */
    def getAuthorizer(params: GetAuthorizerRequest): awsDashSdkLib.libRequestMod.Request[Authorizer, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Describe an existing Authorizer resource. AWS CLI
       */
    def getAuthorizer(
      params: GetAuthorizerRequest,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ Authorizer, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[Authorizer, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Describe an existing Authorizers resource. AWS CLI
       */
    def getAuthorizers(): awsDashSdkLib.libRequestMod.Request[Authorizers, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Describe an existing Authorizers resource. AWS CLI
       */
    def getAuthorizers(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ Authorizers, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[Authorizers, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Describe an existing Authorizers resource. AWS CLI
       */
    def getAuthorizers(params: GetAuthorizersRequest): awsDashSdkLib.libRequestMod.Request[Authorizers, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Describe an existing Authorizers resource. AWS CLI
       */
    def getAuthorizers(
      params: GetAuthorizersRequest,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ Authorizers, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[Authorizers, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Describe a BasePathMapping resource.
       */
    def getBasePathMapping(): awsDashSdkLib.libRequestMod.Request[BasePathMapping, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Describe a BasePathMapping resource.
       */
    def getBasePathMapping(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ BasePathMapping, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[BasePathMapping, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Describe a BasePathMapping resource.
       */
    def getBasePathMapping(params: GetBasePathMappingRequest): awsDashSdkLib.libRequestMod.Request[BasePathMapping, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Describe a BasePathMapping resource.
       */
    def getBasePathMapping(
      params: GetBasePathMappingRequest,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ BasePathMapping, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[BasePathMapping, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Represents a collection of BasePathMapping resources.
       */
    def getBasePathMappings(): awsDashSdkLib.libRequestMod.Request[BasePathMappings, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Represents a collection of BasePathMapping resources.
       */
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
    /**
       * Represents a collection of BasePathMapping resources.
       */
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
    /**
       * Gets information about the current ClientCertificate resource.
       */
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
    /**
       * Gets information about the current ClientCertificate resource.
       */
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
    /**
       * Gets a collection of ClientCertificate resources.
       */
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
    /**
       * Gets a collection of ClientCertificate resources.
       */
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
    /**
       * Gets information about a Deployment resource.
       */
    def getDeployment(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ Deployment, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[Deployment, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Gets information about a Deployment resource.
       */
    def getDeployment(params: GetDeploymentRequest): awsDashSdkLib.libRequestMod.Request[Deployment, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Gets information about a Deployment resource.
       */
    def getDeployment(
      params: GetDeploymentRequest,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ Deployment, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[Deployment, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Gets information about a Deployments collection.
       */
    def getDeployments(): awsDashSdkLib.libRequestMod.Request[Deployments, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Gets information about a Deployments collection.
       */
    def getDeployments(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ Deployments, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[Deployments, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Gets information about a Deployments collection.
       */
    def getDeployments(params: GetDeploymentsRequest): awsDashSdkLib.libRequestMod.Request[Deployments, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Gets information about a Deployments collection.
       */
    def getDeployments(
      params: GetDeploymentsRequest,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ Deployments, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[Deployments, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * 
       */
    def getDocumentationPart(): awsDashSdkLib.libRequestMod.Request[DocumentationPart, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * 
       */
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
    /**
       * 
       */
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
    /**
       * 
       */
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
    /**
       * 
       */
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
    /**
       * 
       */
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
    /**
       * 
       */
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
    /**
       * 
       */
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
    /**
       * 
       */
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
    /**
       * Represents a domain name that is contained in a simpler, more intuitive URL that can be called.
       */
    def getDomainName(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ DomainName, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[DomainName, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Represents a domain name that is contained in a simpler, more intuitive URL that can be called.
       */
    def getDomainName(params: GetDomainNameRequest): awsDashSdkLib.libRequestMod.Request[DomainName, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Represents a domain name that is contained in a simpler, more intuitive URL that can be called.
       */
    def getDomainName(
      params: GetDomainNameRequest,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ DomainName, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[DomainName, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Represents a collection of DomainName resources.
       */
    def getDomainNames(): awsDashSdkLib.libRequestMod.Request[DomainNames, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Represents a collection of DomainName resources.
       */
    def getDomainNames(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ DomainNames, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[DomainNames, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Represents a collection of DomainName resources.
       */
    def getDomainNames(params: GetDomainNamesRequest): awsDashSdkLib.libRequestMod.Request[DomainNames, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Represents a collection of DomainName resources.
       */
    def getDomainNames(
      params: GetDomainNamesRequest,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ DomainNames, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[DomainNames, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Exports a deployed version of a RestApi in a specified format.
       */
    def getExport(): awsDashSdkLib.libRequestMod.Request[ExportResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Exports a deployed version of a RestApi in a specified format.
       */
    def getExport(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ ExportResponse, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[ExportResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Exports a deployed version of a RestApi in a specified format.
       */
    def getExport(params: GetExportRequest): awsDashSdkLib.libRequestMod.Request[ExportResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Exports a deployed version of a RestApi in a specified format.
       */
    def getExport(
      params: GetExportRequest,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ ExportResponse, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[ExportResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Gets a GatewayResponse of a specified response type on the given RestApi.
       */
    def getGatewayResponse(): awsDashSdkLib.libRequestMod.Request[GatewayResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Gets a GatewayResponse of a specified response type on the given RestApi.
       */
    def getGatewayResponse(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ GatewayResponse, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[GatewayResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Gets a GatewayResponse of a specified response type on the given RestApi.
       */
    def getGatewayResponse(params: GetGatewayResponseRequest): awsDashSdkLib.libRequestMod.Request[GatewayResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Gets a GatewayResponse of a specified response type on the given RestApi.
       */
    def getGatewayResponse(
      params: GetGatewayResponseRequest,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ GatewayResponse, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[GatewayResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Gets the GatewayResponses collection on the given RestApi. If an API developer has not added any definitions for gateway responses, the result will be the API Gateway-generated default GatewayResponses collection for the supported response types.
       */
    def getGatewayResponses(): awsDashSdkLib.libRequestMod.Request[GatewayResponses, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Gets the GatewayResponses collection on the given RestApi. If an API developer has not added any definitions for gateway responses, the result will be the API Gateway-generated default GatewayResponses collection for the supported response types.
       */
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
    /**
       * Gets the GatewayResponses collection on the given RestApi. If an API developer has not added any definitions for gateway responses, the result will be the API Gateway-generated default GatewayResponses collection for the supported response types.
       */
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
    /**
       * Get the integration settings.
       */
    def getIntegration(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ Integration, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[Integration, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Get the integration settings.
       */
    def getIntegration(params: GetIntegrationRequest): awsDashSdkLib.libRequestMod.Request[Integration, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Get the integration settings.
       */
    def getIntegration(
      params: GetIntegrationRequest,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ Integration, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[Integration, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Represents a get integration response.
       */
    def getIntegrationResponse(): awsDashSdkLib.libRequestMod.Request[IntegrationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Represents a get integration response.
       */
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
    /**
       * Represents a get integration response.
       */
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
    /**
       * Describe an existing Method resource.
       */
    def getMethod(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ Method, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[Method, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Describe an existing Method resource.
       */
    def getMethod(params: GetMethodRequest): awsDashSdkLib.libRequestMod.Request[Method, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Describe an existing Method resource.
       */
    def getMethod(
      params: GetMethodRequest,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ Method, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[Method, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Describes a MethodResponse resource.
       */
    def getMethodResponse(): awsDashSdkLib.libRequestMod.Request[MethodResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Describes a MethodResponse resource.
       */
    def getMethodResponse(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ MethodResponse, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[MethodResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Describes a MethodResponse resource.
       */
    def getMethodResponse(params: GetMethodResponseRequest): awsDashSdkLib.libRequestMod.Request[MethodResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Describes a MethodResponse resource.
       */
    def getMethodResponse(
      params: GetMethodResponseRequest,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ MethodResponse, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[MethodResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Describes an existing model defined for a RestApi resource.
       */
    def getModel(): awsDashSdkLib.libRequestMod.Request[Model, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Describes an existing model defined for a RestApi resource.
       */
    def getModel(callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ Model, scala.Unit]): awsDashSdkLib.libRequestMod.Request[Model, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Describes an existing model defined for a RestApi resource.
       */
    def getModel(params: GetModelRequest): awsDashSdkLib.libRequestMod.Request[Model, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Describes an existing model defined for a RestApi resource.
       */
    def getModel(
      params: GetModelRequest,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ Model, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[Model, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Generates a sample mapping template that can be used to transform a payload into the structure of a model.
       */
    def getModelTemplate(): awsDashSdkLib.libRequestMod.Request[Template, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Generates a sample mapping template that can be used to transform a payload into the structure of a model.
       */
    def getModelTemplate(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ Template, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[Template, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Generates a sample mapping template that can be used to transform a payload into the structure of a model.
       */
    def getModelTemplate(params: GetModelTemplateRequest): awsDashSdkLib.libRequestMod.Request[Template, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Generates a sample mapping template that can be used to transform a payload into the structure of a model.
       */
    def getModelTemplate(
      params: GetModelTemplateRequest,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ Template, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[Template, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Describes existing Models defined for a RestApi resource.
       */
    def getModels(): awsDashSdkLib.libRequestMod.Request[Models, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Describes existing Models defined for a RestApi resource.
       */
    def getModels(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ Models, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[Models, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Describes existing Models defined for a RestApi resource.
       */
    def getModels(params: GetModelsRequest): awsDashSdkLib.libRequestMod.Request[Models, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Describes existing Models defined for a RestApi resource.
       */
    def getModels(
      params: GetModelsRequest,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ Models, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[Models, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Gets a RequestValidator of a given RestApi.
       */
    def getRequestValidator(): awsDashSdkLib.libRequestMod.Request[RequestValidator, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Gets a RequestValidator of a given RestApi.
       */
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
    /**
       * Gets a RequestValidator of a given RestApi.
       */
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
    /**
       * Gets the RequestValidators collection of a given RestApi.
       */
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
    /**
       * Gets the RequestValidators collection of a given RestApi.
       */
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
    /**
       * Lists information about a resource.
       */
    def getResource(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ Resource, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[Resource, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Lists information about a resource.
       */
    def getResource(params: GetResourceRequest): awsDashSdkLib.libRequestMod.Request[Resource, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Lists information about a resource.
       */
    def getResource(
      params: GetResourceRequest,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ Resource, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[Resource, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Lists information about a collection of Resource resources.
       */
    def getResources(): awsDashSdkLib.libRequestMod.Request[Resources, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Lists information about a collection of Resource resources.
       */
    def getResources(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ Resources, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[Resources, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Lists information about a collection of Resource resources.
       */
    def getResources(params: GetResourcesRequest): awsDashSdkLib.libRequestMod.Request[Resources, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Lists information about a collection of Resource resources.
       */
    def getResources(
      params: GetResourcesRequest,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ Resources, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[Resources, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Lists the RestApi resource in the collection.
       */
    def getRestApi(): awsDashSdkLib.libRequestMod.Request[RestApi, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Lists the RestApi resource in the collection.
       */
    def getRestApi(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ RestApi, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[RestApi, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Lists the RestApi resource in the collection.
       */
    def getRestApi(params: GetRestApiRequest): awsDashSdkLib.libRequestMod.Request[RestApi, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Lists the RestApi resource in the collection.
       */
    def getRestApi(
      params: GetRestApiRequest,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ RestApi, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[RestApi, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Lists the RestApis resources for your collection.
       */
    def getRestApis(): awsDashSdkLib.libRequestMod.Request[RestApis, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Lists the RestApis resources for your collection.
       */
    def getRestApis(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ RestApis, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[RestApis, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Lists the RestApis resources for your collection.
       */
    def getRestApis(params: GetRestApisRequest): awsDashSdkLib.libRequestMod.Request[RestApis, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Lists the RestApis resources for your collection.
       */
    def getRestApis(
      params: GetRestApisRequest,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ RestApis, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[RestApis, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Generates a client SDK for a RestApi and Stage.
       */
    def getSdk(): awsDashSdkLib.libRequestMod.Request[SdkResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Generates a client SDK for a RestApi and Stage.
       */
    def getSdk(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ SdkResponse, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[SdkResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Generates a client SDK for a RestApi and Stage.
       */
    def getSdk(params: GetSdkRequest): awsDashSdkLib.libRequestMod.Request[SdkResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Generates a client SDK for a RestApi and Stage.
       */
    def getSdk(
      params: GetSdkRequest,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ SdkResponse, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[SdkResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * 
       */
    def getSdkType(): awsDashSdkLib.libRequestMod.Request[SdkType, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * 
       */
    def getSdkType(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ SdkType, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[SdkType, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * 
       */
    def getSdkType(params: GetSdkTypeRequest): awsDashSdkLib.libRequestMod.Request[SdkType, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * 
       */
    def getSdkType(
      params: GetSdkTypeRequest,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ SdkType, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[SdkType, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * 
       */
    def getSdkTypes(): awsDashSdkLib.libRequestMod.Request[SdkTypes, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * 
       */
    def getSdkTypes(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ SdkTypes, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[SdkTypes, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * 
       */
    def getSdkTypes(params: GetSdkTypesRequest): awsDashSdkLib.libRequestMod.Request[SdkTypes, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * 
       */
    def getSdkTypes(
      params: GetSdkTypesRequest,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ SdkTypes, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[SdkTypes, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Gets information about a Stage resource.
       */
    def getStage(): awsDashSdkLib.libRequestMod.Request[Stage, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Gets information about a Stage resource.
       */
    def getStage(callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ Stage, scala.Unit]): awsDashSdkLib.libRequestMod.Request[Stage, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Gets information about a Stage resource.
       */
    def getStage(params: GetStageRequest): awsDashSdkLib.libRequestMod.Request[Stage, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Gets information about a Stage resource.
       */
    def getStage(
      params: GetStageRequest,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ Stage, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[Stage, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Gets information about one or more Stage resources.
       */
    def getStages(): awsDashSdkLib.libRequestMod.Request[Stages, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Gets information about one or more Stage resources.
       */
    def getStages(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ Stages, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[Stages, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Gets information about one or more Stage resources.
       */
    def getStages(params: GetStagesRequest): awsDashSdkLib.libRequestMod.Request[Stages, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Gets information about one or more Stage resources.
       */
    def getStages(
      params: GetStagesRequest,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ Stages, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[Stages, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Gets the Tags collection for a given resource.
       */
    def getTags(): awsDashSdkLib.libRequestMod.Request[Tags, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Gets the Tags collection for a given resource.
       */
    def getTags(callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ Tags, scala.Unit]): awsDashSdkLib.libRequestMod.Request[Tags, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Gets the Tags collection for a given resource.
       */
    def getTags(params: GetTagsRequest): awsDashSdkLib.libRequestMod.Request[Tags, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Gets the Tags collection for a given resource.
       */
    def getTags(
      params: GetTagsRequest,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ Tags, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[Tags, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Gets the usage data of a usage plan in a specified time interval.
       */
    def getUsage(): awsDashSdkLib.libRequestMod.Request[Usage, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Gets the usage data of a usage plan in a specified time interval.
       */
    def getUsage(callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ Usage, scala.Unit]): awsDashSdkLib.libRequestMod.Request[Usage, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Gets the usage data of a usage plan in a specified time interval.
       */
    def getUsage(params: GetUsageRequest): awsDashSdkLib.libRequestMod.Request[Usage, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Gets the usage data of a usage plan in a specified time interval.
       */
    def getUsage(
      params: GetUsageRequest,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ Usage, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[Usage, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Gets a usage plan of a given plan identifier.
       */
    def getUsagePlan(): awsDashSdkLib.libRequestMod.Request[UsagePlan, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Gets a usage plan of a given plan identifier.
       */
    def getUsagePlan(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ UsagePlan, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[UsagePlan, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Gets a usage plan of a given plan identifier.
       */
    def getUsagePlan(params: GetUsagePlanRequest): awsDashSdkLib.libRequestMod.Request[UsagePlan, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Gets a usage plan of a given plan identifier.
       */
    def getUsagePlan(
      params: GetUsagePlanRequest,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ UsagePlan, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[UsagePlan, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Gets a usage plan key of a given key identifier.
       */
    def getUsagePlanKey(): awsDashSdkLib.libRequestMod.Request[UsagePlanKey, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Gets a usage plan key of a given key identifier.
       */
    def getUsagePlanKey(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ UsagePlanKey, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[UsagePlanKey, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Gets a usage plan key of a given key identifier.
       */
    def getUsagePlanKey(params: GetUsagePlanKeyRequest): awsDashSdkLib.libRequestMod.Request[UsagePlanKey, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Gets a usage plan key of a given key identifier.
       */
    def getUsagePlanKey(
      params: GetUsagePlanKeyRequest,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ UsagePlanKey, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[UsagePlanKey, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Gets all the usage plan keys representing the API keys added to a specified usage plan.
       */
    def getUsagePlanKeys(): awsDashSdkLib.libRequestMod.Request[UsagePlanKeys, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Gets all the usage plan keys representing the API keys added to a specified usage plan.
       */
    def getUsagePlanKeys(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ UsagePlanKeys, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[UsagePlanKeys, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Gets all the usage plan keys representing the API keys added to a specified usage plan.
       */
    def getUsagePlanKeys(params: GetUsagePlanKeysRequest): awsDashSdkLib.libRequestMod.Request[UsagePlanKeys, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Gets all the usage plan keys representing the API keys added to a specified usage plan.
       */
    def getUsagePlanKeys(
      params: GetUsagePlanKeysRequest,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ UsagePlanKeys, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[UsagePlanKeys, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Gets all the usage plans of the caller's account.
       */
    def getUsagePlans(): awsDashSdkLib.libRequestMod.Request[UsagePlans, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Gets all the usage plans of the caller's account.
       */
    def getUsagePlans(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ UsagePlans, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[UsagePlans, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Gets all the usage plans of the caller's account.
       */
    def getUsagePlans(params: GetUsagePlansRequest): awsDashSdkLib.libRequestMod.Request[UsagePlans, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Gets all the usage plans of the caller's account.
       */
    def getUsagePlans(
      params: GetUsagePlansRequest,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ UsagePlans, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[UsagePlans, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Gets a specified VPC link under the caller's account in a region.
       */
    def getVpcLink(): awsDashSdkLib.libRequestMod.Request[VpcLink, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Gets a specified VPC link under the caller's account in a region.
       */
    def getVpcLink(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ VpcLink, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[VpcLink, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Gets a specified VPC link under the caller's account in a region.
       */
    def getVpcLink(params: GetVpcLinkRequest): awsDashSdkLib.libRequestMod.Request[VpcLink, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Gets a specified VPC link under the caller's account in a region.
       */
    def getVpcLink(
      params: GetVpcLinkRequest,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ VpcLink, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[VpcLink, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Gets the VpcLinks collection under the caller's account in a selected region.
       */
    def getVpcLinks(): awsDashSdkLib.libRequestMod.Request[VpcLinks, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Gets the VpcLinks collection under the caller's account in a selected region.
       */
    def getVpcLinks(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ VpcLinks, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[VpcLinks, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Gets the VpcLinks collection under the caller's account in a selected region.
       */
    def getVpcLinks(params: GetVpcLinksRequest): awsDashSdkLib.libRequestMod.Request[VpcLinks, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Gets the VpcLinks collection under the caller's account in a selected region.
       */
    def getVpcLinks(
      params: GetVpcLinksRequest,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ VpcLinks, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[VpcLinks, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Import API keys from an external source, such as a CSV-formatted file.
       */
    def importApiKeys(): awsDashSdkLib.libRequestMod.Request[ApiKeyIds, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Import API keys from an external source, such as a CSV-formatted file.
       */
    def importApiKeys(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ ApiKeyIds, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[ApiKeyIds, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Import API keys from an external source, such as a CSV-formatted file.
       */
    def importApiKeys(params: ImportApiKeysRequest): awsDashSdkLib.libRequestMod.Request[ApiKeyIds, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Import API keys from an external source, such as a CSV-formatted file.
       */
    def importApiKeys(
      params: ImportApiKeysRequest,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ ApiKeyIds, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[ApiKeyIds, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * 
       */
    def importDocumentationParts(): awsDashSdkLib.libRequestMod.Request[DocumentationPartIds, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * 
       */
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
    /**
       * 
       */
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
    /**
       * A feature of the API Gateway control service for creating a new API from an external API definition file.
       */
    def importRestApi(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ RestApi, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[RestApi, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * A feature of the API Gateway control service for creating a new API from an external API definition file.
       */
    def importRestApi(params: ImportRestApiRequest): awsDashSdkLib.libRequestMod.Request[RestApi, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * A feature of the API Gateway control service for creating a new API from an external API definition file.
       */
    def importRestApi(
      params: ImportRestApiRequest,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ RestApi, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[RestApi, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Creates a customization of a GatewayResponse of a specified response type and status code on the given RestApi.
       */
    def putGatewayResponse(): awsDashSdkLib.libRequestMod.Request[GatewayResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Creates a customization of a GatewayResponse of a specified response type and status code on the given RestApi.
       */
    def putGatewayResponse(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ GatewayResponse, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[GatewayResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Creates a customization of a GatewayResponse of a specified response type and status code on the given RestApi.
       */
    def putGatewayResponse(params: PutGatewayResponseRequest): awsDashSdkLib.libRequestMod.Request[GatewayResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Creates a customization of a GatewayResponse of a specified response type and status code on the given RestApi.
       */
    def putGatewayResponse(
      params: PutGatewayResponseRequest,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ GatewayResponse, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[GatewayResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Sets up a method's integration.
       */
    def putIntegration(): awsDashSdkLib.libRequestMod.Request[Integration, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Sets up a method's integration.
       */
    def putIntegration(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ Integration, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[Integration, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Sets up a method's integration.
       */
    def putIntegration(params: PutIntegrationRequest): awsDashSdkLib.libRequestMod.Request[Integration, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Sets up a method's integration.
       */
    def putIntegration(
      params: PutIntegrationRequest,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ Integration, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[Integration, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Represents a put integration.
       */
    def putIntegrationResponse(): awsDashSdkLib.libRequestMod.Request[IntegrationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Represents a put integration.
       */
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
    /**
       * Represents a put integration.
       */
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
    /**
       * Add a method to an existing Resource resource.
       */
    def putMethod(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ Method, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[Method, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Add a method to an existing Resource resource.
       */
    def putMethod(params: PutMethodRequest): awsDashSdkLib.libRequestMod.Request[Method, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Add a method to an existing Resource resource.
       */
    def putMethod(
      params: PutMethodRequest,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ Method, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[Method, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Adds a MethodResponse to an existing Method resource.
       */
    def putMethodResponse(): awsDashSdkLib.libRequestMod.Request[MethodResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Adds a MethodResponse to an existing Method resource.
       */
    def putMethodResponse(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ MethodResponse, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[MethodResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Adds a MethodResponse to an existing Method resource.
       */
    def putMethodResponse(params: PutMethodResponseRequest): awsDashSdkLib.libRequestMod.Request[MethodResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Adds a MethodResponse to an existing Method resource.
       */
    def putMethodResponse(
      params: PutMethodResponseRequest,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ MethodResponse, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[MethodResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * A feature of the API Gateway control service for updating an existing API with an input of external API definitions. The update can take the form of merging the supplied definition into the existing API or overwriting the existing API.
       */
    def putRestApi(): awsDashSdkLib.libRequestMod.Request[RestApi, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * A feature of the API Gateway control service for updating an existing API with an input of external API definitions. The update can take the form of merging the supplied definition into the existing API or overwriting the existing API.
       */
    def putRestApi(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ RestApi, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[RestApi, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * A feature of the API Gateway control service for updating an existing API with an input of external API definitions. The update can take the form of merging the supplied definition into the existing API or overwriting the existing API.
       */
    def putRestApi(params: PutRestApiRequest): awsDashSdkLib.libRequestMod.Request[RestApi, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * A feature of the API Gateway control service for updating an existing API with an input of external API definitions. The update can take the form of merging the supplied definition into the existing API or overwriting the existing API.
       */
    def putRestApi(
      params: PutRestApiRequest,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ RestApi, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[RestApi, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Adds or updates a tag on a given resource.
       */
    def tagResource(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Adds or updates a tag on a given resource.
       */
    def tagResource(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Adds or updates a tag on a given resource.
       */
    def tagResource(params: TagResourceRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Adds or updates a tag on a given resource.
       */
    def tagResource(
      params: TagResourceRequest,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Simulate the execution of an Authorizer in your RestApi with headers, parameters, and an incoming request body.  Enable custom authorizers 
       */
    def testInvokeAuthorizer(): awsDashSdkLib.libRequestMod.Request[TestInvokeAuthorizerResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Simulate the execution of an Authorizer in your RestApi with headers, parameters, and an incoming request body.  Enable custom authorizers 
       */
    def testInvokeAuthorizer(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ TestInvokeAuthorizerResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[TestInvokeAuthorizerResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Simulate the execution of an Authorizer in your RestApi with headers, parameters, and an incoming request body.  Enable custom authorizers 
       */
    def testInvokeAuthorizer(params: TestInvokeAuthorizerRequest): awsDashSdkLib.libRequestMod.Request[TestInvokeAuthorizerResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Simulate the execution of an Authorizer in your RestApi with headers, parameters, and an incoming request body.  Enable custom authorizers 
       */
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
    /**
       * Simulate the execution of a Method in your RestApi with headers, parameters, and an incoming request body.
       */
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
    /**
       * Simulate the execution of a Method in your RestApi with headers, parameters, and an incoming request body.
       */
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
    /**
       * Removes a tag from a given resource.
       */
    def untagResource(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Removes a tag from a given resource.
       */
    def untagResource(params: UntagResourceRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Removes a tag from a given resource.
       */
    def untagResource(
      params: UntagResourceRequest,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Changes information about the current Account resource.
       */
    def updateAccount(): awsDashSdkLib.libRequestMod.Request[Account, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Changes information about the current Account resource.
       */
    def updateAccount(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ Account, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[Account, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Changes information about the current Account resource.
       */
    def updateAccount(params: UpdateAccountRequest): awsDashSdkLib.libRequestMod.Request[Account, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Changes information about the current Account resource.
       */
    def updateAccount(
      params: UpdateAccountRequest,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ Account, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[Account, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Changes information about an ApiKey resource.
       */
    def updateApiKey(): awsDashSdkLib.libRequestMod.Request[ApiKey, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Changes information about an ApiKey resource.
       */
    def updateApiKey(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ ApiKey, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[ApiKey, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Changes information about an ApiKey resource.
       */
    def updateApiKey(params: UpdateApiKeyRequest): awsDashSdkLib.libRequestMod.Request[ApiKey, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Changes information about an ApiKey resource.
       */
    def updateApiKey(
      params: UpdateApiKeyRequest,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ ApiKey, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[ApiKey, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Updates an existing Authorizer resource. AWS CLI
       */
    def updateAuthorizer(): awsDashSdkLib.libRequestMod.Request[Authorizer, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Updates an existing Authorizer resource. AWS CLI
       */
    def updateAuthorizer(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ Authorizer, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[Authorizer, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Updates an existing Authorizer resource. AWS CLI
       */
    def updateAuthorizer(params: UpdateAuthorizerRequest): awsDashSdkLib.libRequestMod.Request[Authorizer, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Updates an existing Authorizer resource. AWS CLI
       */
    def updateAuthorizer(
      params: UpdateAuthorizerRequest,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ Authorizer, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[Authorizer, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Changes information about the BasePathMapping resource.
       */
    def updateBasePathMapping(): awsDashSdkLib.libRequestMod.Request[BasePathMapping, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Changes information about the BasePathMapping resource.
       */
    def updateBasePathMapping(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ BasePathMapping, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[BasePathMapping, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Changes information about the BasePathMapping resource.
       */
    def updateBasePathMapping(params: UpdateBasePathMappingRequest): awsDashSdkLib.libRequestMod.Request[BasePathMapping, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Changes information about the BasePathMapping resource.
       */
    def updateBasePathMapping(
      params: UpdateBasePathMappingRequest,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ BasePathMapping, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[BasePathMapping, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Changes information about an ClientCertificate resource.
       */
    def updateClientCertificate(): awsDashSdkLib.libRequestMod.Request[ClientCertificate, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Changes information about an ClientCertificate resource.
       */
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
    /**
       * Changes information about an ClientCertificate resource.
       */
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
    /**
       * Changes information about a Deployment resource.
       */
    def updateDeployment(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ Deployment, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[Deployment, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Changes information about a Deployment resource.
       */
    def updateDeployment(params: UpdateDeploymentRequest): awsDashSdkLib.libRequestMod.Request[Deployment, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Changes information about a Deployment resource.
       */
    def updateDeployment(
      params: UpdateDeploymentRequest,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ Deployment, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[Deployment, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * 
       */
    def updateDocumentationPart(): awsDashSdkLib.libRequestMod.Request[DocumentationPart, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * 
       */
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
    /**
       * 
       */
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
    /**
       * 
       */
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
    /**
       * 
       */
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
    /**
       * Changes information about the DomainName resource.
       */
    def updateDomainName(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ DomainName, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[DomainName, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Changes information about the DomainName resource.
       */
    def updateDomainName(params: UpdateDomainNameRequest): awsDashSdkLib.libRequestMod.Request[DomainName, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Changes information about the DomainName resource.
       */
    def updateDomainName(
      params: UpdateDomainNameRequest,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ DomainName, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[DomainName, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Updates a GatewayResponse of a specified response type on the given RestApi.
       */
    def updateGatewayResponse(): awsDashSdkLib.libRequestMod.Request[GatewayResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Updates a GatewayResponse of a specified response type on the given RestApi.
       */
    def updateGatewayResponse(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ GatewayResponse, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[GatewayResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Updates a GatewayResponse of a specified response type on the given RestApi.
       */
    def updateGatewayResponse(params: UpdateGatewayResponseRequest): awsDashSdkLib.libRequestMod.Request[GatewayResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Updates a GatewayResponse of a specified response type on the given RestApi.
       */
    def updateGatewayResponse(
      params: UpdateGatewayResponseRequest,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ GatewayResponse, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[GatewayResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Represents an update integration.
       */
    def updateIntegration(): awsDashSdkLib.libRequestMod.Request[Integration, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Represents an update integration.
       */
    def updateIntegration(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ Integration, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[Integration, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Represents an update integration.
       */
    def updateIntegration(params: UpdateIntegrationRequest): awsDashSdkLib.libRequestMod.Request[Integration, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Represents an update integration.
       */
    def updateIntegration(
      params: UpdateIntegrationRequest,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ Integration, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[Integration, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Represents an update integration response.
       */
    def updateIntegrationResponse(): awsDashSdkLib.libRequestMod.Request[IntegrationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Represents an update integration response.
       */
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
    /**
       * Represents an update integration response.
       */
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
    /**
       * Updates an existing Method resource.
       */
    def updateMethod(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ Method, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[Method, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Updates an existing Method resource.
       */
    def updateMethod(params: UpdateMethodRequest): awsDashSdkLib.libRequestMod.Request[Method, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Updates an existing Method resource.
       */
    def updateMethod(
      params: UpdateMethodRequest,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ Method, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[Method, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Updates an existing MethodResponse resource.
       */
    def updateMethodResponse(): awsDashSdkLib.libRequestMod.Request[MethodResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Updates an existing MethodResponse resource.
       */
    def updateMethodResponse(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ MethodResponse, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[MethodResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Updates an existing MethodResponse resource.
       */
    def updateMethodResponse(params: UpdateMethodResponseRequest): awsDashSdkLib.libRequestMod.Request[MethodResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Updates an existing MethodResponse resource.
       */
    def updateMethodResponse(
      params: UpdateMethodResponseRequest,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ MethodResponse, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[MethodResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Changes information about a model.
       */
    def updateModel(): awsDashSdkLib.libRequestMod.Request[Model, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Changes information about a model.
       */
    def updateModel(callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ Model, scala.Unit]): awsDashSdkLib.libRequestMod.Request[Model, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Changes information about a model.
       */
    def updateModel(params: UpdateModelRequest): awsDashSdkLib.libRequestMod.Request[Model, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Changes information about a model.
       */
    def updateModel(
      params: UpdateModelRequest,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ Model, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[Model, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Updates a RequestValidator of a given RestApi.
       */
    def updateRequestValidator(): awsDashSdkLib.libRequestMod.Request[RequestValidator, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Updates a RequestValidator of a given RestApi.
       */
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
    /**
       * Updates a RequestValidator of a given RestApi.
       */
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
    /**
       * Changes information about a Resource resource.
       */
    def updateResource(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ Resource, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[Resource, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Changes information about a Resource resource.
       */
    def updateResource(params: UpdateResourceRequest): awsDashSdkLib.libRequestMod.Request[Resource, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Changes information about a Resource resource.
       */
    def updateResource(
      params: UpdateResourceRequest,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ Resource, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[Resource, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Changes information about the specified API.
       */
    def updateRestApi(): awsDashSdkLib.libRequestMod.Request[RestApi, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Changes information about the specified API.
       */
    def updateRestApi(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ RestApi, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[RestApi, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Changes information about the specified API.
       */
    def updateRestApi(params: UpdateRestApiRequest): awsDashSdkLib.libRequestMod.Request[RestApi, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Changes information about the specified API.
       */
    def updateRestApi(
      params: UpdateRestApiRequest,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ RestApi, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[RestApi, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Changes information about a Stage resource.
       */
    def updateStage(): awsDashSdkLib.libRequestMod.Request[Stage, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Changes information about a Stage resource.
       */
    def updateStage(callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ Stage, scala.Unit]): awsDashSdkLib.libRequestMod.Request[Stage, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Changes information about a Stage resource.
       */
    def updateStage(params: UpdateStageRequest): awsDashSdkLib.libRequestMod.Request[Stage, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Changes information about a Stage resource.
       */
    def updateStage(
      params: UpdateStageRequest,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ Stage, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[Stage, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Grants a temporary extension to the remaining quota of a usage plan associated with a specified API key.
       */
    def updateUsage(): awsDashSdkLib.libRequestMod.Request[Usage, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Grants a temporary extension to the remaining quota of a usage plan associated with a specified API key.
       */
    def updateUsage(callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ Usage, scala.Unit]): awsDashSdkLib.libRequestMod.Request[Usage, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Grants a temporary extension to the remaining quota of a usage plan associated with a specified API key.
       */
    def updateUsage(params: UpdateUsageRequest): awsDashSdkLib.libRequestMod.Request[Usage, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Grants a temporary extension to the remaining quota of a usage plan associated with a specified API key.
       */
    def updateUsage(
      params: UpdateUsageRequest,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ Usage, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[Usage, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Updates a usage plan of a given plan Id.
       */
    def updateUsagePlan(): awsDashSdkLib.libRequestMod.Request[UsagePlan, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Updates a usage plan of a given plan Id.
       */
    def updateUsagePlan(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ UsagePlan, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[UsagePlan, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Updates a usage plan of a given plan Id.
       */
    def updateUsagePlan(params: UpdateUsagePlanRequest): awsDashSdkLib.libRequestMod.Request[UsagePlan, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Updates a usage plan of a given plan Id.
       */
    def updateUsagePlan(
      params: UpdateUsagePlanRequest,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ UsagePlan, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[UsagePlan, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Updates an existing VpcLink of a specified identifier.
       */
    def updateVpcLink(): awsDashSdkLib.libRequestMod.Request[VpcLink, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Updates an existing VpcLink of a specified identifier.
       */
    def updateVpcLink(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ VpcLink, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[VpcLink, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Updates an existing VpcLink of a specified identifier.
       */
    def updateVpcLink(params: UpdateVpcLinkRequest): awsDashSdkLib.libRequestMod.Request[VpcLink, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Updates an existing VpcLink of a specified identifier.
       */
    def updateVpcLink(
      params: UpdateVpcLinkRequest,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ VpcLink, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[VpcLink, awsDashSdkLib.libErrorMod.AWSError] = js.native
  }
  
  
  trait UntagResourceRequest extends js.Object {
    /**
         * [Required] The ARN of a resource that can be tagged. The resource ARN must be URL-encoded. At present, Stage is the only taggable resource.
         */
    var resourceArn: String
    /**
         * [Required] The Tag keys to delete.
         */
    var tagKeys: ListOfString
  }
  
  
  trait UpdateAccountRequest extends js.Object {
    /**
         * A list of update operations to be applied to the specified resource and in the order specified in this list.
         */
    var patchOperations: js.UndefOr[ListOfPatchOperation] = js.undefined
  }
  
  
  trait UpdateApiKeyRequest extends js.Object {
    /**
         * [Required] The identifier of the ApiKey resource to be updated.
         */
    var apiKey: String
    /**
         * A list of update operations to be applied to the specified resource and in the order specified in this list.
         */
    var patchOperations: js.UndefOr[ListOfPatchOperation] = js.undefined
  }
  
  
  trait UpdateAuthorizerRequest extends js.Object {
    /**
         * [Required] The identifier of the Authorizer resource.
         */
    var authorizerId: String
    /**
         * A list of update operations to be applied to the specified resource and in the order specified in this list.
         */
    var patchOperations: js.UndefOr[ListOfPatchOperation] = js.undefined
    /**
         * [Required] The string identifier of the associated RestApi.
         */
    var restApiId: String
  }
  
  
  trait UpdateBasePathMappingRequest extends js.Object {
    /**
         * [Required] The base path of the BasePathMapping resource to change.
         */
    var basePath: String
    /**
         * [Required] The domain name of the BasePathMapping resource to change.
         */
    var domainName: String
    /**
         * A list of update operations to be applied to the specified resource and in the order specified in this list.
         */
    var patchOperations: js.UndefOr[ListOfPatchOperation] = js.undefined
  }
  
  
  trait UpdateClientCertificateRequest extends js.Object {
    /**
         * [Required] The identifier of the ClientCertificate resource to be updated.
         */
    var clientCertificateId: String
    /**
         * A list of update operations to be applied to the specified resource and in the order specified in this list.
         */
    var patchOperations: js.UndefOr[ListOfPatchOperation] = js.undefined
  }
  
  
  trait UpdateDeploymentRequest extends js.Object {
    /**
         * The replacement identifier for the Deployment resource to change information about.
         */
    var deploymentId: String
    /**
         * A list of update operations to be applied to the specified resource and in the order specified in this list.
         */
    var patchOperations: js.UndefOr[ListOfPatchOperation] = js.undefined
    /**
         * [Required] The string identifier of the associated RestApi.
         */
    var restApiId: String
  }
  
  
  trait UpdateDocumentationPartRequest extends js.Object {
    /**
         * [Required] The identifier of the to-be-updated documentation part.
         */
    var documentationPartId: String
    /**
         * A list of update operations to be applied to the specified resource and in the order specified in this list.
         */
    var patchOperations: js.UndefOr[ListOfPatchOperation] = js.undefined
    /**
         * [Required] The string identifier of the associated RestApi.
         */
    var restApiId: String
  }
  
  
  trait UpdateDocumentationVersionRequest extends js.Object {
    /**
         * [Required] The version identifier of the to-be-updated documentation version.
         */
    var documentationVersion: String
    /**
         * A list of update operations to be applied to the specified resource and in the order specified in this list.
         */
    var patchOperations: js.UndefOr[ListOfPatchOperation] = js.undefined
    /**
         * [Required] The string identifier of the associated RestApi..
         */
    var restApiId: String
  }
  
  
  trait UpdateDomainNameRequest extends js.Object {
    /**
         * [Required] The name of the DomainName resource to be changed.
         */
    var domainName: String
    /**
         * A list of update operations to be applied to the specified resource and in the order specified in this list.
         */
    var patchOperations: js.UndefOr[ListOfPatchOperation] = js.undefined
  }
  
  
  trait UpdateGatewayResponseRequest extends js.Object {
    /**
         * A list of update operations to be applied to the specified resource and in the order specified in this list.
         */
    var patchOperations: js.UndefOr[ListOfPatchOperation] = js.undefined
    /**
         * [Required] The response type of the associated GatewayResponse. Valid values are ACCESS_DENIEDAPI_CONFIGURATION_ERRORAUTHORIZER_FAILURE AUTHORIZER_CONFIGURATION_ERRORBAD_REQUEST_PARAMETERSBAD_REQUEST_BODYDEFAULT_4XXDEFAULT_5XXEXPIRED_TOKENINVALID_SIGNATUREINTEGRATION_FAILUREINTEGRATION_TIMEOUTINVALID_API_KEYMISSING_AUTHENTICATION_TOKEN QUOTA_EXCEEDEDREQUEST_TOO_LARGERESOURCE_NOT_FOUNDTHROTTLEDUNAUTHORIZEDUNSUPPORTED_MEDIA_TYPE 
         */
    var responseType: GatewayResponseType
    /**
         * [Required] The string identifier of the associated RestApi.
         */
    var restApiId: String
  }
  
  
  trait UpdateIntegrationRequest extends js.Object {
    /**
         * [Required] Represents an update integration request's HTTP method.
         */
    var httpMethod: String
    /**
         * A list of update operations to be applied to the specified resource and in the order specified in this list.
         */
    var patchOperations: js.UndefOr[ListOfPatchOperation] = js.undefined
    /**
         * [Required] Represents an update integration request's resource identifier.
         */
    var resourceId: String
    /**
         * [Required] The string identifier of the associated RestApi.
         */
    var restApiId: String
  }
  
  
  trait UpdateIntegrationResponseRequest extends js.Object {
    /**
         * [Required] Specifies an update integration response request's HTTP method.
         */
    var httpMethod: String
    /**
         * A list of update operations to be applied to the specified resource and in the order specified in this list.
         */
    var patchOperations: js.UndefOr[ListOfPatchOperation] = js.undefined
    /**
         * [Required] Specifies an update integration response request's resource identifier.
         */
    var resourceId: String
    /**
         * [Required] The string identifier of the associated RestApi.
         */
    var restApiId: String
    /**
         * [Required] Specifies an update integration response request's status code.
         */
    var statusCode: StatusCode
  }
  
  
  trait UpdateMethodRequest extends js.Object {
    /**
         * [Required] The HTTP verb of the Method resource.
         */
    var httpMethod: String
    /**
         * A list of update operations to be applied to the specified resource and in the order specified in this list.
         */
    var patchOperations: js.UndefOr[ListOfPatchOperation] = js.undefined
    /**
         * [Required] The Resource identifier for the Method resource.
         */
    var resourceId: String
    /**
         * [Required] The string identifier of the associated RestApi.
         */
    var restApiId: String
  }
  
  
  trait UpdateMethodResponseRequest extends js.Object {
    /**
         * [Required] The HTTP verb of the Method resource.
         */
    var httpMethod: String
    /**
         * A list of update operations to be applied to the specified resource and in the order specified in this list.
         */
    var patchOperations: js.UndefOr[ListOfPatchOperation] = js.undefined
    /**
         * [Required] The Resource identifier for the MethodResponse resource.
         */
    var resourceId: String
    /**
         * [Required] The string identifier of the associated RestApi.
         */
    var restApiId: String
    /**
         * [Required] The status code for the MethodResponse resource.
         */
    var statusCode: StatusCode
  }
  
  
  trait UpdateModelRequest extends js.Object {
    /**
         * [Required] The name of the model to update.
         */
    var modelName: String
    /**
         * A list of update operations to be applied to the specified resource and in the order specified in this list.
         */
    var patchOperations: js.UndefOr[ListOfPatchOperation] = js.undefined
    /**
         * [Required] The string identifier of the associated RestApi.
         */
    var restApiId: String
  }
  
  
  trait UpdateRequestValidatorRequest extends js.Object {
    /**
         * A list of update operations to be applied to the specified resource and in the order specified in this list.
         */
    var patchOperations: js.UndefOr[ListOfPatchOperation] = js.undefined
    /**
         * [Required] The identifier of RequestValidator to be updated.
         */
    var requestValidatorId: String
    /**
         * [Required] The string identifier of the associated RestApi.
         */
    var restApiId: String
  }
  
  
  trait UpdateResourceRequest extends js.Object {
    /**
         * A list of update operations to be applied to the specified resource and in the order specified in this list.
         */
    var patchOperations: js.UndefOr[ListOfPatchOperation] = js.undefined
    /**
         * [Required] The identifier of the Resource resource.
         */
    var resourceId: String
    /**
         * [Required] The string identifier of the associated RestApi.
         */
    var restApiId: String
  }
  
  
  trait UpdateRestApiRequest extends js.Object {
    /**
         * A list of update operations to be applied to the specified resource and in the order specified in this list.
         */
    var patchOperations: js.UndefOr[ListOfPatchOperation] = js.undefined
    /**
         * [Required] The string identifier of the associated RestApi.
         */
    var restApiId: String
  }
  
  
  trait UpdateStageRequest extends js.Object {
    /**
         * A list of update operations to be applied to the specified resource and in the order specified in this list.
         */
    var patchOperations: js.UndefOr[ListOfPatchOperation] = js.undefined
    /**
         * [Required] The string identifier of the associated RestApi.
         */
    var restApiId: String
    /**
         * [Required] The name of the Stage resource to change information about.
         */
    var stageName: String
  }
  
  
  trait UpdateUsagePlanRequest extends js.Object {
    /**
         * A list of update operations to be applied to the specified resource and in the order specified in this list.
         */
    var patchOperations: js.UndefOr[ListOfPatchOperation] = js.undefined
    /**
         * [Required] The Id of the to-be-updated usage plan.
         */
    var usagePlanId: String
  }
  
  
  trait UpdateUsageRequest extends js.Object {
    /**
         * [Required] The identifier of the API key associated with the usage plan in which a temporary extension is granted to the remaining quota.
         */
    var keyId: String
    /**
         * A list of update operations to be applied to the specified resource and in the order specified in this list.
         */
    var patchOperations: js.UndefOr[ListOfPatchOperation] = js.undefined
    /**
         * [Required] The Id of the usage plan associated with the usage data.
         */
    var usagePlanId: String
  }
  
  
  trait UpdateVpcLinkRequest extends js.Object {
    /**
         * A list of update operations to be applied to the specified resource and in the order specified in this list.
         */
    var patchOperations: js.UndefOr[ListOfPatchOperation] = js.undefined
    /**
         * [Required] The identifier of the VpcLink. It is used in an Integration to reference this VpcLink.
         */
    var vpcLinkId: String
  }
  
  
  trait Usage extends js.Object {
    /**
         * The ending date of the usage data.
         */
    var endDate: js.UndefOr[String] = js.undefined
    /**
         * The usage data, as daily logs of used and remaining quotas, over the specified time interval indexed over the API keys in a usage plan. For example, {..., "values" : { "{api_key}" : [ [0, 100], [10, 90], [100, 10]]}, where {api_key} stands for an API key value and the daily log entry is of the format [used quota, remaining quota].
         */
    var items: js.UndefOr[MapOfKeyUsages] = js.undefined
    var position: js.UndefOr[String] = js.undefined
    /**
         * The starting date of the usage data.
         */
    var startDate: js.UndefOr[String] = js.undefined
    /**
         * The plan Id associated with this usage data.
         */
    var usagePlanId: js.UndefOr[String] = js.undefined
  }
  
  
  trait UsagePlan extends js.Object {
    /**
         * The associated API stages of a usage plan.
         */
    var apiStages: js.UndefOr[ListOfApiStage] = js.undefined
    /**
         * The description of a usage plan.
         */
    var description: js.UndefOr[String] = js.undefined
    /**
         * The identifier of a UsagePlan resource.
         */
    var id: js.UndefOr[String] = js.undefined
    /**
         * The name of a usage plan.
         */
    var name: js.UndefOr[String] = js.undefined
    /**
         * The AWS Markeplace product identifier to associate with the usage plan as a SaaS product on AWS Marketplace.
         */
    var productCode: js.UndefOr[String] = js.undefined
    /**
         * The maximum number of permitted requests per a given unit time interval.
         */
    var quota: js.UndefOr[QuotaSettings] = js.undefined
    /**
         * The request throttle limits of a usage plan.
         */
    var throttle: js.UndefOr[ThrottleSettings] = js.undefined
  }
  
  
  trait UsagePlanKey extends js.Object {
    /**
         * The Id of a usage plan key.
         */
    var id: js.UndefOr[String] = js.undefined
    /**
         * The name of a usage plan key.
         */
    var name: js.UndefOr[String] = js.undefined
    /**
         * The type of a usage plan key. Currently, the valid key type is API_KEY.
         */
    var `type`: js.UndefOr[String] = js.undefined
    /**
         * The value of a usage plan key.
         */
    var value: js.UndefOr[String] = js.undefined
  }
  
  
  trait UsagePlanKeys extends js.Object {
    /**
         * The current page of elements from this collection.
         */
    var items: js.UndefOr[ListOfUsagePlanKey] = js.undefined
    var position: js.UndefOr[String] = js.undefined
  }
  
  
  trait UsagePlans extends js.Object {
    /**
         * The current page of elements from this collection.
         */
    var items: js.UndefOr[ListOfUsagePlan] = js.undefined
    var position: js.UndefOr[String] = js.undefined
  }
  
  
  trait VpcLink extends js.Object {
    /**
         * The description of the VPC link.
         */
    var description: js.UndefOr[String] = js.undefined
    /**
         * The identifier of the VpcLink. It is used in an Integration to reference this VpcLink.
         */
    var id: js.UndefOr[String] = js.undefined
    /**
         * The name used to label and identify the VPC link.
         */
    var name: js.UndefOr[String] = js.undefined
    /**
         * The status of the VPC link. The valid values are AVAILABLE, PENDING, DELETING, or FAILED. Deploying an API will wait if the status is PENDING and will fail if the status is DELETING. 
         */
    var status: js.UndefOr[VpcLinkStatus] = js.undefined
    /**
         * A description about the VPC link status.
         */
    var statusMessage: js.UndefOr[String] = js.undefined
    /**
         * The ARNs of network load balancers of the VPC targeted by the VPC link. The network load balancers must be owned by the same AWS account of the API owner.
         */
    var targetArns: js.UndefOr[ListOfString] = js.undefined
  }
  
  
  trait VpcLinks extends js.Object {
    /**
         * The current page of elements from this collection.
         */
    var items: js.UndefOr[ListOfVpcLink] = js.undefined
    var position: js.UndefOr[String] = js.undefined
  }
  
  val TypesNs: this.type = js.native
  type ApiKeySourceType = awsDashSdkLib.awsDashSdkLibStrings.HEADER | awsDashSdkLib.awsDashSdkLibStrings.AUTHORIZER | java.lang.String
  type ApiKeysFormat = awsDashSdkLib.awsDashSdkLibStrings.csv | java.lang.String
  type AuthorizerType = awsDashSdkLib.awsDashSdkLibStrings.TOKEN | awsDashSdkLib.awsDashSdkLibStrings.REQUEST | awsDashSdkLib.awsDashSdkLibStrings.COGNITO_USER_POOLS | java.lang.String
  type Boolean = scala.Boolean
  type CacheClusterSize = awsDashSdkLib.awsDashSdkLibStrings.`0DOT5` | awsDashSdkLib.awsDashSdkLibStrings.`1DOT6` | awsDashSdkLib.awsDashSdkLibStrings.`6DOT1` | awsDashSdkLib.awsDashSdkLibStrings.`13DOT5` | awsDashSdkLib.awsDashSdkLibStrings.`28DOT4` | awsDashSdkLib.awsDashSdkLibStrings.`58DOT2` | awsDashSdkLib.awsDashSdkLibStrings.`118` | awsDashSdkLib.awsDashSdkLibStrings.`237` | java.lang.String
  type CacheClusterStatus = awsDashSdkLib.awsDashSdkLibStrings.CREATE_IN_PROGRESS | awsDashSdkLib.awsDashSdkLibStrings.AVAILABLE | awsDashSdkLib.awsDashSdkLibStrings.DELETE_IN_PROGRESS | awsDashSdkLib.awsDashSdkLibStrings.NOT_AVAILABLE | awsDashSdkLib.awsDashSdkLibStrings.FLUSH_IN_PROGRESS | java.lang.String
  type ClientConfiguration = awsDashSdkLib.libServiceMod.ServiceConfigurationOptions with ClientApiVersions
  type ConnectionType = awsDashSdkLib.awsDashSdkLibStrings.INTERNET | awsDashSdkLib.awsDashSdkLibStrings.VPC_LINK | java.lang.String
  type ContentHandlingStrategy = awsDashSdkLib.awsDashSdkLibStrings.CONVERT_TO_BINARY | awsDashSdkLib.awsDashSdkLibStrings.CONVERT_TO_TEXT | java.lang.String
  type DocumentationPartLocationStatusCode = java.lang.String
  type DocumentationPartType = awsDashSdkLib.awsDashSdkLibStrings.API | awsDashSdkLib.awsDashSdkLibStrings.AUTHORIZER | awsDashSdkLib.awsDashSdkLibStrings.MODEL | awsDashSdkLib.awsDashSdkLibStrings.RESOURCE | awsDashSdkLib.awsDashSdkLibStrings.METHOD | awsDashSdkLib.awsDashSdkLibStrings.PATH_PARAMETER | awsDashSdkLib.awsDashSdkLibStrings.QUERY_PARAMETER | awsDashSdkLib.awsDashSdkLibStrings.REQUEST_HEADER | awsDashSdkLib.awsDashSdkLibStrings.REQUEST_BODY | awsDashSdkLib.awsDashSdkLibStrings.RESPONSE | awsDashSdkLib.awsDashSdkLibStrings.RESPONSE_HEADER | awsDashSdkLib.awsDashSdkLibStrings.RESPONSE_BODY | java.lang.String
  type Double = scala.Double
  type EndpointType = awsDashSdkLib.awsDashSdkLibStrings.REGIONAL | awsDashSdkLib.awsDashSdkLibStrings.EDGE | awsDashSdkLib.awsDashSdkLibStrings.PRIVATE | java.lang.String
  type GatewayResponseType = awsDashSdkLib.awsDashSdkLibStrings.DEFAULT_4XX | awsDashSdkLib.awsDashSdkLibStrings.DEFAULT_5XX | awsDashSdkLib.awsDashSdkLibStrings.RESOURCE_NOT_FOUND | awsDashSdkLib.awsDashSdkLibStrings.UNAUTHORIZED | awsDashSdkLib.awsDashSdkLibStrings.INVALID_API_KEY | awsDashSdkLib.awsDashSdkLibStrings.ACCESS_DENIED | awsDashSdkLib.awsDashSdkLibStrings.AUTHORIZER_FAILURE | awsDashSdkLib.awsDashSdkLibStrings.AUTHORIZER_CONFIGURATION_ERROR | awsDashSdkLib.awsDashSdkLibStrings.INVALID_SIGNATURE | awsDashSdkLib.awsDashSdkLibStrings.EXPIRED_TOKEN | awsDashSdkLib.awsDashSdkLibStrings.MISSING_AUTHENTICATION_TOKEN | awsDashSdkLib.awsDashSdkLibStrings.INTEGRATION_FAILURE | awsDashSdkLib.awsDashSdkLibStrings.INTEGRATION_TIMEOUT | awsDashSdkLib.awsDashSdkLibStrings.API_CONFIGURATION_ERROR | awsDashSdkLib.awsDashSdkLibStrings.UNSUPPORTED_MEDIA_TYPE | awsDashSdkLib.awsDashSdkLibStrings.BAD_REQUEST_PARAMETERS | awsDashSdkLib.awsDashSdkLibStrings.BAD_REQUEST_BODY | awsDashSdkLib.awsDashSdkLibStrings.REQUEST_TOO_LARGE | awsDashSdkLib.awsDashSdkLibStrings.THROTTLED | awsDashSdkLib.awsDashSdkLibStrings.QUOTA_EXCEEDED | java.lang.String
  type Integer = scala.Double
  type IntegrationType = awsDashSdkLib.awsDashSdkLibStrings.HTTP | awsDashSdkLib.awsDashSdkLibStrings.AWS | awsDashSdkLib.awsDashSdkLibStrings.MOCK | awsDashSdkLib.awsDashSdkLibStrings.HTTP_PROXY | awsDashSdkLib.awsDashSdkLibStrings.AWS_PROXY | java.lang.String
  type ListOfARNs = js.Array[ProviderARN]
  type ListOfApiKey = js.Array[ApiKey]
  type ListOfApiStage = js.Array[ApiStage]
  type ListOfAuthorizer = js.Array[Authorizer]
  type ListOfBasePathMapping = js.Array[BasePathMapping]
  type ListOfClientCertificate = js.Array[ClientCertificate]
  type ListOfDeployment = js.Array[Deployment]
  type ListOfDocumentationPart = js.Array[DocumentationPart]
  type ListOfDocumentationVersion = js.Array[DocumentationVersion]
  type ListOfDomainName = js.Array[DomainName]
  type ListOfEndpointType = js.Array[EndpointType]
  type ListOfGatewayResponse = js.Array[GatewayResponse]
  type ListOfLong = js.Array[Long]
  type ListOfModel = js.Array[Model]
  type ListOfPatchOperation = js.Array[PatchOperation]
  type ListOfRequestValidator = js.Array[RequestValidator]
  type ListOfResource = js.Array[Resource]
  type ListOfRestApi = js.Array[RestApi]
  type ListOfSdkConfigurationProperty = js.Array[SdkConfigurationProperty]
  type ListOfSdkType = js.Array[SdkType]
  type ListOfStage = js.Array[Stage]
  type ListOfStageKeys = js.Array[StageKey]
  type ListOfString = js.Array[String]
  type ListOfUsage = js.Array[ListOfLong]
  type ListOfUsagePlan = js.Array[UsagePlan]
  type ListOfUsagePlanKey = js.Array[UsagePlanKey]
  type ListOfVpcLink = js.Array[VpcLink]
  type LocationStatusType = awsDashSdkLib.awsDashSdkLibStrings.DOCUMENTED | awsDashSdkLib.awsDashSdkLibStrings.UNDOCUMENTED | java.lang.String
  type Long = scala.Double
  type NullableBoolean = scala.Boolean
  type NullableInteger = scala.Double
  type Op = awsDashSdkLib.awsDashSdkLibStrings.add | awsDashSdkLib.awsDashSdkLibStrings.remove | awsDashSdkLib.awsDashSdkLibStrings.replace | awsDashSdkLib.awsDashSdkLibStrings.move | awsDashSdkLib.awsDashSdkLibStrings.copy | awsDashSdkLib.awsDashSdkLibStrings.test | java.lang.String
  type ProviderARN = java.lang.String
  type PutMode = awsDashSdkLib.awsDashSdkLibStrings.merge | awsDashSdkLib.awsDashSdkLibStrings.overwrite | java.lang.String
  type QuotaPeriodType = awsDashSdkLib.awsDashSdkLibStrings.DAY | awsDashSdkLib.awsDashSdkLibStrings.WEEK | awsDashSdkLib.awsDashSdkLibStrings.MONTH | java.lang.String
  type StatusCode = java.lang.String
  type String = java.lang.String
  type Timestamp = stdLib.Date
  type UnauthorizedCacheControlHeaderStrategy = awsDashSdkLib.awsDashSdkLibStrings.FAIL_WITH_403 | awsDashSdkLib.awsDashSdkLibStrings.SUCCEED_WITH_RESPONSE_HEADER | awsDashSdkLib.awsDashSdkLibStrings.SUCCEED_WITHOUT_RESPONSE_HEADER | java.lang.String
  type VpcLinkStatus = awsDashSdkLib.awsDashSdkLibStrings.AVAILABLE | awsDashSdkLib.awsDashSdkLibStrings.PENDING | awsDashSdkLib.awsDashSdkLibStrings.DELETING | awsDashSdkLib.awsDashSdkLibStrings.FAILED | java.lang.String
  type _Blob = nodeLib.Buffer | stdLib.Uint8Array | awsDashSdkLib.clientsApigatewayMod.Blob | java.lang.String
  type apiVersion = awsDashSdkLib.awsDashSdkLibStrings.`2015-07-09` | awsDashSdkLib.awsDashSdkLibStrings.latest | java.lang.String
}

