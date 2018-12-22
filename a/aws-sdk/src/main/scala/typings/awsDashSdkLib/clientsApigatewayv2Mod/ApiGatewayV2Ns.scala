package typings
package awsDashSdkLib.clientsApigatewayv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("aws-sdk/clients/apigatewayv2", "ApiGatewayV2")
@js.native
object ApiGatewayV2Ns extends js.Object {
  
  trait AccessLogSettings extends js.Object {
    /**
         * The ARN of the CloudWatch Logs log group to receive access logs.
         */
    var DestinationArn: js.UndefOr[Arn] = js.undefined
    /**
         * A single line format of the access logs of data, as specified by selected $context variables. The format must include at least $context.requestId.
         */
    var Format: js.UndefOr[StringWithLengthBetween1And1024] = js.undefined
  }
  
  
  trait Api extends js.Object {
    /**
         * The URI of the API, of the form {api-id}.execute-api.{region}.amazonaws.com. The stage name is typically appended to this URI to form a complete path to a deployed API stage.
         */
    var ApiEndpoint: js.UndefOr[__string] = js.undefined
    /**
         * The API ID.
         */
    var ApiId: js.UndefOr[Id] = js.undefined
    /**
         * An API key selection expression. See API Key Selection Expressions.
         */
    var ApiKeySelectionExpression: js.UndefOr[SelectionExpression] = js.undefined
    /**
         * The timestamp when the API was created.
         */
    var CreatedDate: js.UndefOr[__timestampIso8601] = js.undefined
    /**
         * The description of the API.
         */
    var Description: js.UndefOr[StringWithLengthBetween0And1024] = js.undefined
    /**
         * Avoid validating models when creating a deployment.
         */
    var DisableSchemaValidation: js.UndefOr[__boolean] = js.undefined
    /**
         * The name of the API.
         */
    var Name: StringWithLengthBetween1And128
    /**
         * The API protocol: HTTP or WEBSOCKET.
         */
    var ProtocolType: ProtocolType
    /**
         * The route selection expression for the API.
         */
    var RouteSelectionExpression: SelectionExpression
    /**
         * A version identifier for the API.
         */
    var Version: js.UndefOr[StringWithLengthBetween1And64] = js.undefined
    /**
         * The warning messages reported when failonwarnings is turned on during API import.
         */
    var Warnings: js.UndefOr[__listOf__string] = js.undefined
  }
  
  
  trait Authorizer extends js.Object {
    /**
         * Specifies the required credentials as an IAM role for API Gateway to invoke the authorizer. To specify an IAM role for API Gateway to assume, use the role's Amazon Resource Name (ARN). To use resource-based permissions on the Lambda function, specify null.
         */
    var AuthorizerCredentialsArn: js.UndefOr[Arn] = js.undefined
    /**
         * The authorizer identifier.
         */
    var AuthorizerId: js.UndefOr[Id] = js.undefined
    /**
         * The time to live (TTL), in seconds, of cached authorizer results. If it equals 0, authorization caching is disabled. If it is greater than 0, API Gateway will cache authorizer responses. If this field is not set, the default value is 300. The maximum value is 3600, or 1 hour.
         */
    var AuthorizerResultTtlInSeconds: js.UndefOr[IntegerWithLengthBetween0And3600] = js.undefined
    /**
         * The authorizer type. Currently the only valid value is REQUEST, for a Lambda function using incoming request parameters.
         */
    var AuthorizerType: js.UndefOr[AuthorizerType] = js.undefined
    /**
         * The authorizer's Uniform Resource Identifier (URI). ForREQUEST authorizers, this must be a well-formed Lambda function URI, for example, arn:aws:apigateway:us-west-2:lambda:path/2015-03-31/functions/arn:aws:lambda:us-west-2:{account_id}:function:{lambda_function_name}/invocations. In general, the URI has this form: arn:aws:apigateway:{region}:lambda:path/{service_api} , where {region} is the same as the region hosting the Lambda function, path indicates that the remaining substring in the URI should be treated as the path to the resource, including the initial /. For Lambda functions, this is usually of the form /2015-03-31/functions/[FunctionARN]/invocations.
         */
    var AuthorizerUri: js.UndefOr[UriWithLengthBetween1And2048] = js.undefined
    /**
         * The identity source for which authorization is requested.For the REQUEST authorizer, this is required when authorization caching is enabled. The value is a comma-separated string of one or more mapping expressions of the specified request parameters. For example, if an Auth header and a Name query string parameters are defined as identity sources, this value is method.request.header.Auth, method.request.querystring.Name. These parameters will be used to derive the authorization caching key and to perform runtime validation of the REQUEST authorizer by verifying all of the identity-related request parameters are present, not null, and non-empty. Only when this is true does the authorizer invoke the authorizer Lambda function, otherwise, it returns a 401 Unauthorized response without calling the Lambda function. The valid value is a string of comma-separated mapping expressions of the specified request parameters. When the authorization caching is not enabled, this property is optional.
         */
    var IdentitySource: js.UndefOr[IdentitySourceList] = js.undefined
    /**
         * The validation expression does not apply to the REQUEST authorizer.
         */
    var IdentityValidationExpression: js.UndefOr[StringWithLengthBetween0And1024] = js.undefined
    /**
         * The name of the authorizer.
         */
    var Name: StringWithLengthBetween1And128
    /**
         * For REQUEST authorizer, this is not defined.
         */
    var ProviderArns: js.UndefOr[ProviderArnList] = js.undefined
  }
  
  
  trait ClientApiVersions extends js.Object {
    /**
         * A string in YYYY-MM-DD format that represents the latest possible API version that can be used in this service. Specify 'latest' to use the latest possible version.
         */
    var apiVersion: js.UndefOr[apiVersion] = js.undefined
  }
  
  
  trait CreateApiMappingRequest extends js.Object {
    /**
         * The API identifier.
         */
    var ApiId: Id
    var ApiMappingKey: js.UndefOr[SelectionKey] = js.undefined
    /**
         * The domain name.
         */
    var DomainName: __string
    /**
         * The API stage.
         */
    var Stage: StringWithLengthBetween1And128
  }
  
  
  trait CreateApiMappingResponse extends js.Object {
    /**
         * The API identifier.
         */
    var ApiId: js.UndefOr[Id] = js.undefined
    /**
         * The API mapping identifier.
         */
    var ApiMappingId: js.UndefOr[Id] = js.undefined
    /**
         * The API mapping key.
         */
    var ApiMappingKey: js.UndefOr[SelectionKey] = js.undefined
    /**
         * The API stage.
         */
    var Stage: js.UndefOr[StringWithLengthBetween1And128] = js.undefined
  }
  
  
  trait CreateApiRequest extends js.Object {
    /**
         * An API key selection expression. See API Key Selection Expressions.
         */
    var ApiKeySelectionExpression: js.UndefOr[SelectionExpression] = js.undefined
    /**
         * The description of the API.
         */
    var Description: js.UndefOr[StringWithLengthBetween0And1024] = js.undefined
    /**
         * Avoid validating models when creating a deployment.
         */
    var DisableSchemaValidation: js.UndefOr[__boolean] = js.undefined
    /**
         * The name of the API.
         */
    var Name: StringWithLengthBetween1And128
    /**
         * The API protocol: HTTP or WEBSOCKET.
         */
    var ProtocolType: ProtocolType
    /**
         * The route selection expression for the API.
         */
    var RouteSelectionExpression: SelectionExpression
    /**
         * A version identifier for the API.
         */
    var Version: js.UndefOr[StringWithLengthBetween1And64] = js.undefined
  }
  
  
  trait CreateApiResponse extends js.Object {
    /**
         * The URI of the API, of the form {api-id}.execute-api.{region}.amazonaws.com. The stage name is typically appended to this URI to form a complete path to a deployed API stage.
         */
    var ApiEndpoint: js.UndefOr[__string] = js.undefined
    /**
         * The API ID.
         */
    var ApiId: js.UndefOr[Id] = js.undefined
    /**
         * An API key selection expression. See API Key Selection Expressions.
         */
    var ApiKeySelectionExpression: js.UndefOr[SelectionExpression] = js.undefined
    /**
         * The timestamp when the API was created.
         */
    var CreatedDate: js.UndefOr[__timestampIso8601] = js.undefined
    /**
         * The description of the API.
         */
    var Description: js.UndefOr[StringWithLengthBetween0And1024] = js.undefined
    /**
         * Avoid validating models when creating a deployment.
         */
    var DisableSchemaValidation: js.UndefOr[__boolean] = js.undefined
    /**
         * The name of the API.
         */
    var Name: js.UndefOr[StringWithLengthBetween1And128] = js.undefined
    /**
         * The API protocol: HTTP or WEBSOCKET.
         */
    var ProtocolType: js.UndefOr[ProtocolType] = js.undefined
    /**
         * The route selection expression for the API.
         */
    var RouteSelectionExpression: js.UndefOr[SelectionExpression] = js.undefined
    /**
         * A version identifier for the API.
         */
    var Version: js.UndefOr[StringWithLengthBetween1And64] = js.undefined
    /**
         * The warning messages reported when failonwarnings is turned on during API import.
         */
    var Warnings: js.UndefOr[__listOf__string] = js.undefined
  }
  
  
  trait CreateAuthorizerRequest extends js.Object {
    /**
         * The API identifier.
         */
    var ApiId: __string
    /**
         * Specifies the required credentials as an IAM role for API Gateway to invoke the authorizer. To specify an IAM role for API Gateway to assume, use the role's Amazon Resource Name (ARN). To use resource-based permissions on the Lambda function, specify null.
         */
    var AuthorizerCredentialsArn: js.UndefOr[Arn] = js.undefined
    /**
         * The time to live (TTL), in seconds, of cached authorizer results. If it equals 0, authorization caching is disabled. If it is greater than 0, API Gateway will cache authorizer responses. If this field is not set, the default value is 300. The maximum value is 3600, or 1 hour.
         */
    var AuthorizerResultTtlInSeconds: js.UndefOr[IntegerWithLengthBetween0And3600] = js.undefined
    /**
         * The authorizer type. Currently the only valid value is REQUEST, for a Lambda function using incoming request parameters.
         */
    var AuthorizerType: AuthorizerType
    /**
         * The authorizer's Uniform Resource Identifier (URI). For REQUEST authorizers, this must be a well-formed Lambda function URI, for example, arn:aws:apigateway:us-west-2:lambda:path/2015-03-31/functions/arn:aws:lambda:us-west-2:{account_id}:function:{lambda_function_name}/invocations. In general, the URI has this form: arn:aws:apigateway:{region}:lambda:path/{service_api} , where {region} is the same as the region hosting the Lambda function, path indicates that the remaining substring in the URI should be treated as the path to the resource, including the initial /. For Lambda functions, this is usually of the form /2015-03-31/functions/[FunctionARN]/invocations.
         */
    var AuthorizerUri: UriWithLengthBetween1And2048
    /**
         * The identity source for which authorization is requested.For the REQUEST authorizer, this is required when authorization caching is enabled. The value is a comma-separated string of one or more mapping expressions of the specified request parameters. For example, if an Auth header and a Name query string parameters are defined as identity sources, this value is method.request.header.Auth, method.request.querystring.Name. These parameters will be used to derive the authorization caching key and to perform runtime validation of the REQUEST authorizer by verifying all of the identity-related request parameters are present, not null, and non-empty. Only when this is true does the authorizer invoke the authorizer Lambda function, otherwise, it returns a 401 Unauthorized response without calling the Lambda function. The valid value is a string of comma-separated mapping expressions of the specified request parameters. When the authorization caching is not enabled, this property is optional.
         */
    var IdentitySource: IdentitySourceList
    /**
         * The validation expression does not apply to the REQUEST authorizer.
         */
    var IdentityValidationExpression: js.UndefOr[StringWithLengthBetween0And1024] = js.undefined
    /**
         * The name of the authorizer.
         */
    var Name: StringWithLengthBetween1And128
    /**
         * For REQUEST authorizer, this is not defined.
         */
    var ProviderArns: js.UndefOr[ProviderArnList] = js.undefined
  }
  
  
  trait CreateAuthorizerResponse extends js.Object {
    /**
         * Specifies the required credentials as an IAM role for API Gateway to invoke the authorizer. To specify an IAM role for API Gateway to assume, use the role's Amazon Resource Name (ARN). To use resource-based permissions on the Lambda function, specify null.
         */
    var AuthorizerCredentialsArn: js.UndefOr[Arn] = js.undefined
    /**
         * The authorizer identifier.
         */
    var AuthorizerId: js.UndefOr[Id] = js.undefined
    /**
         * The time to live (TTL), in seconds, of cached authorizer results. If it equals 0, authorization caching is disabled. If it is greater than 0, API Gateway will cache authorizer responses. If this field is not set, the default value is 300. The maximum value is 3600, or 1 hour.
         */
    var AuthorizerResultTtlInSeconds: js.UndefOr[IntegerWithLengthBetween0And3600] = js.undefined
    /**
         * The authorizer type. Currently the only valid value is REQUEST, for a Lambda function using incoming request parameters.
         */
    var AuthorizerType: js.UndefOr[AuthorizerType] = js.undefined
    /**
         * The authorizer's Uniform Resource Identifier (URI). ForREQUEST authorizers, this must be a well-formed Lambda function URI, for example, arn:aws:apigateway:us-west-2:lambda:path/2015-03-31/functions/arn:aws:lambda:us-west-2:{account_id}:function:{lambda_function_name}/invocations. In general, the URI has this form: arn:aws:apigateway:{region}:lambda:path/{service_api} , where {region} is the same as the region hosting the Lambda function, path indicates that the remaining substring in the URI should be treated as the path to the resource, including the initial /. For Lambda functions, this is usually of the form /2015-03-31/functions/[FunctionARN]/invocations.
         */
    var AuthorizerUri: js.UndefOr[UriWithLengthBetween1And2048] = js.undefined
    /**
         * The identity source for which authorization is requested.For the REQUEST authorizer, this is required when authorization caching is enabled. The value is a comma-separated string of one or more mapping expressions of the specified request parameters. For example, if an Auth header and a Name query string parameters are defined as identity sources, this value is method.request.header.Auth, method.request.querystring.Name. These parameters will be used to derive the authorization caching key and to perform runtime validation of the REQUEST authorizer by verifying all of the identity-related request parameters are present, not null, and non-empty. Only when this is true does the authorizer invoke the authorizer Lambda function, otherwise, it returns a 401 Unauthorized response without calling the Lambda function. The valid value is a string of comma-separated mapping expressions of the specified request parameters. When the authorization caching is not enabled, this property is optional.
         */
    var IdentitySource: js.UndefOr[IdentitySourceList] = js.undefined
    /**
         * The validation expression does not apply to the REQUEST authorizer.
         */
    var IdentityValidationExpression: js.UndefOr[StringWithLengthBetween0And1024] = js.undefined
    /**
         * The name of the authorizer.
         */
    var Name: js.UndefOr[StringWithLengthBetween1And128] = js.undefined
    /**
         * For REQUEST authorizer, this is not defined.
         */
    var ProviderArns: js.UndefOr[ProviderArnList] = js.undefined
  }
  
  
  trait CreateDeploymentRequest extends js.Object {
    /**
         * The API identifier.
         */
    var ApiId: __string
    /**
         * The description for the deployment resource.
         */
    var Description: js.UndefOr[StringWithLengthBetween0And1024] = js.undefined
    /**
         * The name of the Stage resource for the Deployment resource to create.
         */
    var StageName: js.UndefOr[StringWithLengthBetween1And128] = js.undefined
  }
  
  
  trait CreateDeploymentResponse extends js.Object {
    /**
         * The date and time when the Deployment resource was created.
         */
    var CreatedDate: js.UndefOr[__timestampIso8601] = js.undefined
    /**
         * The identifier for the deployment.
         */
    var DeploymentId: js.UndefOr[Id] = js.undefined
    /**
         * The status of the deployment: PENDING, FAILED, or SUCCEEDED.
         */
    var DeploymentStatus: js.UndefOr[DeploymentStatus] = js.undefined
    /**
         * May contain additional feedback on the status of an API deployment.
         */
    var DeploymentStatusMessage: js.UndefOr[__string] = js.undefined
    /**
         * The description for the deployment.
         */
    var Description: js.UndefOr[StringWithLengthBetween0And1024] = js.undefined
  }
  
  
  trait CreateDomainNameRequest extends js.Object {
    /**
         * The domain name.
         */
    var DomainName: StringWithLengthBetween1And512
    /**
         * The domain name configurations.
         */
    var DomainNameConfigurations: js.UndefOr[DomainNameConfigurations] = js.undefined
  }
  
  
  trait CreateDomainNameResponse extends js.Object {
    /**
         * The API mapping selection expression.
         */
    var ApiMappingSelectionExpression: js.UndefOr[SelectionExpression] = js.undefined
    /**
         * The name of the DomainName resource.
         */
    var DomainName: js.UndefOr[StringWithLengthBetween1And512] = js.undefined
    /**
         * The domain name configurations.
         */
    var DomainNameConfigurations: js.UndefOr[DomainNameConfigurations] = js.undefined
  }
  
  
  trait CreateIntegrationRequest extends js.Object {
    /**
         * The API identifier.
         */
    var ApiId: __string
    /**
         * The identifier of the VpcLink used for the integration when the connectionType is VPC_LINK; otherwise undefined.
         */
    var ConnectionId: js.UndefOr[StringWithLengthBetween1And1024] = js.undefined
    /**
         * The type of the network connection to the integration endpoint. The valid value is INTERNET for connections through the public routable internet or VPC_LINK for private connections between API Gateway and a network load balancer in a VPC. The default value is INTERNET.
         */
    var ConnectionType: js.UndefOr[ConnectionType] = js.undefined
    /**
         * Specifies how to handle response payload content type conversions. Supported values are CONVERT_TO_BINARY and CONVERT_TO_TEXT, with the following behaviors: CONVERT_TO_BINARY: Converts a response payload from a Base64-encoded string to the corresponding binary blob. CONVERT_TO_TEXT: Converts a response payload from a binary blob to a Base64-encoded string.If this property is not defined, the response payload will be passed through from the integration response to the route response or method response without modification.
         */
    var ContentHandlingStrategy: js.UndefOr[ContentHandlingStrategy] = js.undefined
    /**
         * Specifies the credentials required for the integration, if any. For AWS integrations, three options are available. To specify an IAM Role for API Gateway to assume, use the role's Amazon Resource Name (ARN). To require that the caller's identity be passed through from the request, specify the string arn:aws:iam::*:user/ *. To use resource-based permissions on supported AWS services, specify null.
         */
    var CredentialsArn: js.UndefOr[Arn] = js.undefined
    /**
         * The description of the integration.
         */
    var Description: js.UndefOr[StringWithLengthBetween0And1024] = js.undefined
    /**
         * Specifies the integration's HTTP method type.
         */
    var IntegrationMethod: js.UndefOr[StringWithLengthBetween1And64] = js.undefined
    /**
         * The integration type of an integration. One of the following: AWS: for integrating the route or method request with an AWS service action, including the Lambda function-invoking action. With the Lambda function-invoking action, this is referred to as the Lambda custom integration. With any other AWS service action, this is known as AWS integration. AWS_PROXY: for integrating the route or method request with the Lambda function-invoking action with the client request passed through as-is. This integration is also referred to as Lambda proxy integration. HTTP: for integrating the route or method request with an HTTP endpoint, including a private HTTP endpoint within a VPC. This integration is also referred to as the HTTP custom integration. HTTP_PROXY: for integrating route or method request with an HTTP endpoint, including a private HTTP endpoint within a VPC, with the client request passed through as-is. This is also referred to as HTTP proxy integration. MOCK: for integrating the route or method request with API Gateway as a "loopback" endpoint without invoking any backend.
         */
    var IntegrationType: js.UndefOr[IntegrationType] = js.undefined
    /**
         * Specifies the Uniform Resource Identifier (URI) of the integration endpoint.For HTTP or HTTP_PROXY integrations, the URI must be a fully formed, encoded HTTP(S) URL according to the RFC-3986 specification, for either standard integration, where connectionType is not VPC_LINK, or private integration, where connectionType is VPC_LINK. For a private HTTP integration, the URI is not used for routing.For AWS or AWS_PROXY integrations, the URI is of the form arn:aws:apigateway:{region}:{subdomain.service|service}:path|action/{service_api}. Here, {Region} is the API Gateway region (e.g., us-east-1); {service} is the name of the integrated AWS service (e.g., s3); and {subdomain} is a designated subdomain supported by certain AWS service for fast host-name lookup. action can be used for an AWS service action-based API, using an Action={name}&{p1}={v1}&p2={v2}... query string. The ensuing {service_api} refers to a supported action {name} plus any required input parameters. Alternatively, path can be used for an AWS service path-based API. The ensuing service_api refers to the path to an AWS service resource, including the region of the integrated AWS service, if applicable. For example, for integration with the S3 API of GetObject, the URI can be either arn:aws:apigateway:us-west-2:s3:action/GetObject&Bucket={bucket}&Key={key} or arn:aws:apigateway:us-west-2:s3:path/{bucket}/{key}
         */
    var IntegrationUri: js.UndefOr[UriWithLengthBetween1And2048] = js.undefined
    /**
         * Specifies the pass-through behavior for incoming requests based on the Content-Type header in the request, and the available mapping templates specified as the requestTemplates property on the Integration resource. There are three valid values: WHEN_NO_MATCH, WHEN_NO_TEMPLATES, and NEVER. WHEN_NO_MATCH passes the request body for unmapped content types through to the integration backend without transformation. NEVER rejects unmapped content types with an HTTP 415 Unsupported Media Type response. WHEN_NO_TEMPLATES allows pass-through when the integration has no content types mapped to templates. However, if there is at least one content type defined, unmapped content types will be rejected with the same HTTP 415 Unsupported Media Type response.
         */
    var PassthroughBehavior: js.UndefOr[PassthroughBehavior] = js.undefined
    /**
         * A key-value map specifying request parameters that are passed from the method request to the backend. The key is an integration request parameter name and the associated value is a method request parameter value or static value that must be enclosed within single quotes and pre-encoded as required by the backend. The method request parameter value must match the pattern of method.request.{location}.{name} , where  {location}  is querystring, path, or header; and  {name}  must be a valid and unique method request parameter name.
         */
    var RequestParameters: js.UndefOr[IntegrationParameters] = js.undefined
    /**
         * Represents a map of Velocity templates that are applied on the request payload based on the value of the Content-Type header sent by the client. The content type value is the key in this map, and the template (as a String) is the value.
         */
    var RequestTemplates: js.UndefOr[TemplateMap] = js.undefined
    /**
         * The template selection expression for the integration.
         */
    var TemplateSelectionExpression: js.UndefOr[SelectionExpression] = js.undefined
    /**
         * Custom timeout between 50 and 29,000 milliseconds. The default value is 29,000 milliseconds or 29 seconds.
         */
    var TimeoutInMillis: js.UndefOr[IntegerWithLengthBetween50And29000] = js.undefined
  }
  
  
  trait CreateIntegrationResponseRequest extends js.Object {
    /**
         * The API identifier.
         */
    var ApiId: __string
    /**
         * Specifies how to handle response payload content type conversions. Supported values are CONVERT_TO_BINARY and CONVERT_TO_TEXT, with the following behaviors: CONVERT_TO_BINARY: Converts a response payload from a Base64-encoded string to the corresponding binary blob. CONVERT_TO_TEXT: Converts a response payload from a binary blob to a Base64-encoded string.If this property is not defined, the response payload will be passed through from the integration response to the route response or method response without modification.
         */
    var ContentHandlingStrategy: js.UndefOr[ContentHandlingStrategy] = js.undefined
    /**
         * The integration ID.
         */
    var IntegrationId: __string
    /**
         * The integration response key.
         */
    var IntegrationResponseKey: SelectionKey
    /**
         * A key-value map specifying response parameters that are passed to the method response from the backend. The key is a method response header parameter name and the mapped value is an integration response header value, a static value enclosed within a pair of single quotes, or a JSON expression from the integration response body. The mapping key must match the pattern of method.response.header.{name}, where {name} is a valid and unique header name. The mapped non-static value must match the pattern of integration.response.header.{name} or integration.response.body.{JSON-expression}, where {name} is a valid and unique response header name and {JSON-expression} is a valid JSON expression without the $ prefix.
         */
    var ResponseParameters: js.UndefOr[IntegrationParameters] = js.undefined
    /**
         * The collection of response templates for the integration response as a string-to-string map of key-value pairs. Response templates are represented as a key/value map, with a content-type as the key and a template as the value.
         */
    var ResponseTemplates: js.UndefOr[TemplateMap] = js.undefined
    /**
         * The template selection expression for the integration response.
         */
    var TemplateSelectionExpression: js.UndefOr[SelectionExpression] = js.undefined
  }
  
  
  trait CreateIntegrationResponseResponse extends js.Object {
    /**
         * Specifies how to handle response payload content type conversions. Supported values are CONVERT_TO_BINARY and CONVERT_TO_TEXT, with the following behaviors: CONVERT_TO_BINARY: Converts a response payload from a Base64-encoded string to the corresponding binary blob. CONVERT_TO_TEXT: Converts a response payload from a binary blob to a Base64-encoded string.If this property is not defined, the response payload will be passed through from the integration response to the route response or method response without modification.
         */
    var ContentHandlingStrategy: js.UndefOr[ContentHandlingStrategy] = js.undefined
    /**
         * The integration response ID.
         */
    var IntegrationResponseId: js.UndefOr[Id] = js.undefined
    /**
         * The integration response key.
         */
    var IntegrationResponseKey: js.UndefOr[SelectionKey] = js.undefined
    /**
         * A key-value map specifying response parameters that are passed to the method response from the backend. The key is a method response header parameter name and the mapped value is an integration response header value, a static value enclosed within a pair of single quotes, or a JSON expression from the integration response body. The mapping key must match the pattern of method.response.header.{name}, where name is a valid and unique header name. The mapped non-static value must match the pattern of integration.response.header.{name} or integration.response.body.{JSON-expression}, where name is a valid and unique response header name and JSON-expression is a valid JSON expression without the $ prefix.
         */
    var ResponseParameters: js.UndefOr[IntegrationParameters] = js.undefined
    /**
         * The collection of response templates for the integration response as a string-to-string map of key-value pairs. Response templates are represented as a key/value map, with a content-type as the key and a template as the value.
         */
    var ResponseTemplates: js.UndefOr[TemplateMap] = js.undefined
    /**
         * The template selection expressions for the integration response.
         */
    var TemplateSelectionExpression: js.UndefOr[SelectionExpression] = js.undefined
  }
  
  
  trait CreateIntegrationResult extends js.Object {
    /**
         * The identifier of the VpcLink used for the integration when the connectionType is VPC_LINK; otherwise undefined.
         */
    var ConnectionId: js.UndefOr[StringWithLengthBetween1And1024] = js.undefined
    /**
         * The type of the network connection to the integration endpoint. The valid value is INTERNET for connections through the public routable internet or VPC_LINK for private connections between API Gateway and a network load balancer in a VPC. The default value is INTERNET.
         */
    var ConnectionType: js.UndefOr[ConnectionType] = js.undefined
    /**
         * Specifies how to handle response payload content type conversions. Supported values are CONVERT_TO_BINARY and CONVERT_TO_TEXT, with the following behaviors: CONVERT_TO_BINARY: Converts a response payload from a Base64-encoded string to the corresponding binary blob. CONVERT_TO_TEXT: Converts a response payload from a binary blob to a Base64-encoded string.If this property is not defined, the response payload will be passed through from the integration response to the route response or method response without modification.
         */
    var ContentHandlingStrategy: js.UndefOr[ContentHandlingStrategy] = js.undefined
    /**
         * Specifies the credentials required for the integration, if any. For AWS integrations, three options are available. To specify an IAM Role for API Gateway to assume, use the role's Amazon Resource Name (ARN). To require that the caller's identity be passed through from the request, specify the string arn:aws:iam::*:user/ *. To use resource-based permissions on supported AWS services, specify null.
         */
    var CredentialsArn: js.UndefOr[Arn] = js.undefined
    /**
         * Represents the description of an integration.
         */
    var Description: js.UndefOr[StringWithLengthBetween0And1024] = js.undefined
    /**
         * Represents the identifier of an integration.
         */
    var IntegrationId: js.UndefOr[Id] = js.undefined
    /**
         * Specifies the integration's HTTP method type.
         */
    var IntegrationMethod: js.UndefOr[StringWithLengthBetween1And64] = js.undefined
    var IntegrationResponseSelectionExpression: js.UndefOr[SelectionExpression] = js.undefined
    /**
         * The integration type of an integration. One of the following: AWS: for integrating the route or method request with an AWS service action, including the Lambda function-invoking action. With the Lambda function-invoking action, this is referred to as the Lambda custom integration. With any other AWS service action, this is known as AWS integration. AWS_PROXY: for integrating the route or method request with the Lambda function-invoking action with the client request passed through as-is. This integration is also referred to as Lambda proxy integration. HTTP: for integrating the route or method request with an HTTP endpoint, including a private HTTP endpoint within a VPC. This integration is also referred to as the HTTP custom integration. HTTP_PROXY: for integrating route or method request with an HTTP endpoint, including a private HTTP endpoint within a VPC, with the client request passed through as-is. This is also referred to as HTTP proxy integration. MOCK: for integrating the route or method request with API Gateway as a "loopback" endpoint without invoking any backend.
         */
    var IntegrationType: js.UndefOr[IntegrationType] = js.undefined
    /**
         * Specifies the Uniform Resource Identifier (URI) of the integration endpoint.For HTTP or HTTP_PROXY integrations, the URI must be a fully formed, encoded HTTP(S) URL according to the RFC-3986 specification, for either standard integration, where connectionType is not VPC_LINK, or private integration, where connectionType is VPC_LINK. For a private HTTP integration, the URI is not used for routing.For AWS or AWS_PROXY integrations, the URI is of the form arn:aws:apigateway:{region}:{subdomain.service|service}:path|action/{service_api}. Here, {Region} is the API Gateway region (e.g., us-east-1); {service} is the name of the integrated AWS service (e.g., s3); and {subdomain} is a designated subdomain supported by certain AWS service for fast host-name lookup. action can be used for an AWS service action-based API, using an Action={name}&{p1}={v1}&p2={v2}... query string. The ensuing {service_api} refers to a supported action {name} plus any required input parameters. Alternatively, path can be used for an AWS service path-based API. The ensuing service_api refers to the path to an AWS service resource, including the region of the integrated AWS service, if applicable. For example, for integration with the S3 API of GetObject, the URI can be either arn:aws:apigateway:us-west-2:s3:action/GetObject&Bucket={bucket}&Key={key} or arn:aws:apigateway:us-west-2:s3:path/{bucket}/{key}
         */
    var IntegrationUri: js.UndefOr[UriWithLengthBetween1And2048] = js.undefined
    /**
         * Specifies the pass-through behavior for incoming requests based on the Content-Type header in the request, and the available mapping templates specified as the requestTemplates property on the Integration resource. There are three valid values: WHEN_NO_MATCH, WHEN_NO_TEMPLATES, and NEVER. WHEN_NO_MATCH passes the request body for unmapped content types through to the integration backend without transformation. NEVER rejects unmapped content types with an HTTP 415 Unsupported Media Type response. WHEN_NO_TEMPLATES allows pass-through when the integration has no content types mapped to templates. However, if there is at least one content type defined, unmapped content types will be rejected with the same HTTP 415 Unsupported Media Type response.
         */
    var PassthroughBehavior: js.UndefOr[PassthroughBehavior] = js.undefined
    /**
         * A key-value map specifying request parameters that are passed from the method request to the backend. The key is an integration request parameter name and the associated value is a method request parameter value or static value that must be enclosed within single quotes and pre-encoded as required by the backend. The method request parameter value must match the pattern of method.request.{location}.{name} , where  {location}  is querystring, path, or header; and  {name}  must be a valid and unique method request parameter name.
         */
    var RequestParameters: js.UndefOr[IntegrationParameters] = js.undefined
    /**
         * Represents a map of Velocity templates that are applied on the request payload based on the value of the Content-Type header sent by the client. The content type value is the key in this map, and the template (as a String) is the value.
         */
    var RequestTemplates: js.UndefOr[TemplateMap] = js.undefined
    /**
         * The template selection expression for the integration.
         */
    var TemplateSelectionExpression: js.UndefOr[SelectionExpression] = js.undefined
    /**
         * Custom timeout between 50 and 29,000 milliseconds. The default value is 29,000 milliseconds or 29 seconds.
         */
    var TimeoutInMillis: js.UndefOr[IntegerWithLengthBetween50And29000] = js.undefined
  }
  
  
  trait CreateModelRequest extends js.Object {
    /**
         * The API identifier.
         */
    var ApiId: __string
    /**
         * The content-type for the model, for example, "application/json".
         */
    var ContentType: js.UndefOr[StringWithLengthBetween1And256] = js.undefined
    /**
         * The description of the model.
         */
    var Description: js.UndefOr[StringWithLengthBetween0And1024] = js.undefined
    /**
         * The name of the model. Must be alphanumeric.
         */
    var Name: StringWithLengthBetween1And128
    /**
         * The schema for the model. For application/json models, this should be JSON schema draft 4 model.
         */
    var Schema: js.UndefOr[StringWithLengthBetween0And32K] = js.undefined
  }
  
  
  trait CreateModelResponse extends js.Object {
    /**
         * The content-type for the model, for example, "application/json".
         */
    var ContentType: js.UndefOr[StringWithLengthBetween1And256] = js.undefined
    /**
         * The description of the model.
         */
    var Description: js.UndefOr[StringWithLengthBetween0And1024] = js.undefined
    /**
         * The model identifier.
         */
    var ModelId: js.UndefOr[Id] = js.undefined
    /**
         * The name of the model. Must be alphanumeric.
         */
    var Name: js.UndefOr[StringWithLengthBetween1And128] = js.undefined
    /**
         * The schema for the model. For application/json models, this should be JSON schema draft 4 model.
         */
    var Schema: js.UndefOr[StringWithLengthBetween0And32K] = js.undefined
  }
  
  
  trait CreateRouteRequest extends js.Object {
    /**
         * The API identifier.
         */
    var ApiId: __string
    /**
         * Specifies whether an API key is required for the route.
         */
    var ApiKeyRequired: js.UndefOr[__boolean] = js.undefined
    /**
         * The authorization scopes supported by this route.
         */
    var AuthorizationScopes: js.UndefOr[AuthorizationScopes] = js.undefined
    /**
         * The authorization type for the route. Valid values are NONE for open access, AWS_IAM for using AWS IAM permissions.
         */
    var AuthorizationType: js.UndefOr[AuthorizationType] = js.undefined
    /**
         * The identifier of the Authorizer resource to be associated with this route.
         */
    var AuthorizerId: js.UndefOr[Id] = js.undefined
    /**
         * The model selection expression for the route.
         */
    var ModelSelectionExpression: js.UndefOr[SelectionExpression] = js.undefined
    /**
         * The operation name for the route.
         */
    var OperationName: js.UndefOr[StringWithLengthBetween1And64] = js.undefined
    /**
         * The request models for the route.
         */
    var RequestModels: js.UndefOr[RouteModels] = js.undefined
    /**
         * The request parameters for the route.
         */
    var RequestParameters: js.UndefOr[RouteParameters] = js.undefined
    /**
         * The route key for the route.
         */
    var RouteKey: SelectionKey
    /**
         * The route response selection expression for the route.
         */
    var RouteResponseSelectionExpression: js.UndefOr[SelectionExpression] = js.undefined
    /**
         * The target for the route.
         */
    var Target: js.UndefOr[StringWithLengthBetween1And128] = js.undefined
  }
  
  
  trait CreateRouteResponseRequest extends js.Object {
    /**
         * The API identifier.
         */
    var ApiId: __string
    /**
         * The model selection expression for the route response.
         */
    var ModelSelectionExpression: js.UndefOr[SelectionExpression] = js.undefined
    /**
         * The response models for the route response.
         */
    var ResponseModels: js.UndefOr[RouteModels] = js.undefined
    /**
         * The route response parameters.
         */
    var ResponseParameters: js.UndefOr[RouteParameters] = js.undefined
    /**
         * The route ID.
         */
    var RouteId: __string
    /**
         * The route response key.
         */
    var RouteResponseKey: SelectionKey
  }
  
  
  trait CreateRouteResponseResponse extends js.Object {
    /**
         * Represents the model selection expression of a route response.
         */
    var ModelSelectionExpression: js.UndefOr[SelectionExpression] = js.undefined
    /**
         * Represents the response models of a route response.
         */
    var ResponseModels: js.UndefOr[RouteModels] = js.undefined
    /**
         * Represents the response parameters of a route response.
         */
    var ResponseParameters: js.UndefOr[RouteParameters] = js.undefined
    /**
         * Represents the identifier of a route response.
         */
    var RouteResponseId: js.UndefOr[Id] = js.undefined
    /**
         * Represents the route response key of a route response.
         */
    var RouteResponseKey: js.UndefOr[SelectionKey] = js.undefined
  }
  
  
  trait CreateRouteResult extends js.Object {
    /**
         * Specifies whether an API key is required for this route.
         */
    var ApiKeyRequired: js.UndefOr[__boolean] = js.undefined
    /**
         * The authorization scopes supported by this route. 
         */
    var AuthorizationScopes: js.UndefOr[AuthorizationScopes] = js.undefined
    /**
         * The authorization type for the route. Valid values are NONE for open access, AWS_IAM for using AWS IAM permissions.
         */
    var AuthorizationType: js.UndefOr[AuthorizationType] = js.undefined
    /**
         * The identifier of the Authorizer resource to be associated with this route.
         */
    var AuthorizerId: js.UndefOr[Id] = js.undefined
    /**
         * The model selection expression for the route.
         */
    var ModelSelectionExpression: js.UndefOr[SelectionExpression] = js.undefined
    /**
         * The operation name for the route.
         */
    var OperationName: js.UndefOr[StringWithLengthBetween1And64] = js.undefined
    /**
         * The request models for the route.
         */
    var RequestModels: js.UndefOr[RouteModels] = js.undefined
    /**
         * The request parameters for the route.
         */
    var RequestParameters: js.UndefOr[RouteParameters] = js.undefined
    /**
         * The route ID.
         */
    var RouteId: js.UndefOr[Id] = js.undefined
    /**
         * The route key for the route.
         */
    var RouteKey: js.UndefOr[SelectionKey] = js.undefined
    /**
         * The route response selection expression for the route.
         */
    var RouteResponseSelectionExpression: js.UndefOr[SelectionExpression] = js.undefined
    /**
         * The target for the route.
         */
    var Target: js.UndefOr[StringWithLengthBetween1And128] = js.undefined
  }
  
  
  trait CreateStageRequest extends js.Object {
    /**
         * Settings for logging access in this stage.
         */
    var AccessLogSettings: js.UndefOr[AccessLogSettings] = js.undefined
    /**
         * The API identifier.
         */
    var ApiId: __string
    /**
         * The identifier of a client certificate for a Stage.
         */
    var ClientCertificateId: js.UndefOr[Id] = js.undefined
    /**
         * The default route settings for the stage.
         */
    var DefaultRouteSettings: js.UndefOr[RouteSettings] = js.undefined
    /**
         * The deployment identifier of the API stage.
         */
    var DeploymentId: js.UndefOr[Id] = js.undefined
    /**
         * The description for the API stage.
         */
    var Description: js.UndefOr[StringWithLengthBetween0And1024] = js.undefined
    /**
         * Route settings for the stage.
         */
    var RouteSettings: js.UndefOr[RouteSettingsMap] = js.undefined
    /**
         * The name of the stage.
         */
    var StageName: StringWithLengthBetween1And128
    /**
         * A map that defines the stage variables for a Stage. Variable names can have alphanumeric and underscore characters, and the values must match [A-Za-z0-9-._~:/?#&=,]+.
         */
    var StageVariables: js.UndefOr[StageVariablesMap] = js.undefined
  }
  
  
  trait CreateStageResponse extends js.Object {
    /**
         * Settings for logging access in this stage.
         */
    var AccessLogSettings: js.UndefOr[AccessLogSettings] = js.undefined
    /**
         * The identifier of a client certificate for a Stage.
         */
    var ClientCertificateId: js.UndefOr[Id] = js.undefined
    /**
         * The timestamp when the stage was created.
         */
    var CreatedDate: js.UndefOr[__timestampIso8601] = js.undefined
    /**
         * Default route settings for the stage.
         */
    var DefaultRouteSettings: js.UndefOr[RouteSettings] = js.undefined
    /**
         * The identifier of the Deployment that the Stage is associated with.
         */
    var DeploymentId: js.UndefOr[Id] = js.undefined
    /**
         * The description of the stage.
         */
    var Description: js.UndefOr[StringWithLengthBetween0And1024] = js.undefined
    /**
         * The timestamp when the stage was last updated.
         */
    var LastUpdatedDate: js.UndefOr[__timestampIso8601] = js.undefined
    /**
         * Route settings for the stage.
         */
    var RouteSettings: js.UndefOr[RouteSettingsMap] = js.undefined
    /**
         * The name of the stage.
         */
    var StageName: js.UndefOr[StringWithLengthBetween1And128] = js.undefined
    /**
         * A map that defines the stage variables for a stage resource. Variable names can have alphanumeric and underscore characters, and the values must match [A-Za-z0-9-._~:/?#&=,]+.
         */
    var StageVariables: js.UndefOr[StageVariablesMap] = js.undefined
  }
  
  
  trait DeleteApiMappingRequest extends js.Object {
    /**
         * The identifier of the API.
         */
    var ApiId: __string
    /**
         * The API mapping identifier.
         */
    var ApiMappingId: __string
    /**
         * The domain name.
         */
    var DomainName: __string
  }
  
  
  trait DeleteApiRequest extends js.Object {
    /**
         * The API identifier.
         */
    var ApiId: __string
  }
  
  
  trait DeleteAuthorizerRequest extends js.Object {
    /**
         * The API identifier.
         */
    var ApiId: __string
    /**
         * The authorizer identifier.
         */
    var AuthorizerId: __string
  }
  
  
  trait DeleteDeploymentRequest extends js.Object {
    /**
         * The API identifier.
         */
    var ApiId: __string
    /**
         * The deployment ID.
         */
    var DeploymentId: __string
  }
  
  
  trait DeleteDomainNameRequest extends js.Object {
    /**
         * The domain name.
         */
    var DomainName: __string
  }
  
  
  trait DeleteIntegrationRequest extends js.Object {
    /**
         * The API identifier.
         */
    var ApiId: __string
    /**
         * The integration ID.
         */
    var IntegrationId: __string
  }
  
  
  trait DeleteIntegrationResponseRequest extends js.Object {
    /**
         * The API identifier.
         */
    var ApiId: __string
    /**
         * The integration ID.
         */
    var IntegrationId: __string
    /**
         * The integration response ID.
         */
    var IntegrationResponseId: __string
  }
  
  
  trait DeleteModelRequest extends js.Object {
    /**
         * The API identifier.
         */
    var ApiId: __string
    /**
         * The model ID.
         */
    var ModelId: __string
  }
  
  
  trait DeleteRouteRequest extends js.Object {
    /**
         * The API identifier.
         */
    var ApiId: __string
    /**
         * The route ID.
         */
    var RouteId: __string
  }
  
  
  trait DeleteRouteResponseRequest extends js.Object {
    /**
         * The API identifier.
         */
    var ApiId: __string
    /**
         * The route ID.
         */
    var RouteId: __string
    /**
         * The route response ID.
         */
    var RouteResponseId: __string
  }
  
  
  trait DeleteStageRequest extends js.Object {
    /**
         * The API identifier.
         */
    var ApiId: __string
    /**
         * The stage name.
         */
    var StageName: __string
  }
  
  
  trait Deployment extends js.Object {
    /**
         * The date and time when the Deployment resource was created.
         */
    var CreatedDate: js.UndefOr[__timestampIso8601] = js.undefined
    /**
         * The identifier for the deployment.
         */
    var DeploymentId: js.UndefOr[Id] = js.undefined
    /**
         * The status of the deployment: PENDING, FAILED, or SUCCEEDED.
         */
    var DeploymentStatus: js.UndefOr[DeploymentStatus] = js.undefined
    /**
         * May contain additional feedback on the status of an API deployment.
         */
    var DeploymentStatusMessage: js.UndefOr[__string] = js.undefined
    /**
         * The description for the deployment.
         */
    var Description: js.UndefOr[StringWithLengthBetween0And1024] = js.undefined
  }
  
  
  trait DomainName extends js.Object {
    /**
         * The API mapping selection expression.
         */
    var ApiMappingSelectionExpression: js.UndefOr[SelectionExpression] = js.undefined
    /**
         * The name of the DomainName resource.
         */
    var DomainName: StringWithLengthBetween1And512
    /**
         * The domain name configurations.
         */
    var DomainNameConfigurations: js.UndefOr[DomainNameConfigurations] = js.undefined
  }
  
  
  trait DomainNameConfiguration extends js.Object {
    /**
         * A domain name for the WebSocket API.
         */
    var ApiGatewayDomainName: js.UndefOr[__string] = js.undefined
    /**
         * An AWS-managed certificate that will be used by the edge-optimized endpoint for this domain name. AWS Certificate Manager is the only supported source.
         */
    var CertificateArn: js.UndefOr[Arn] = js.undefined
    /**
         * The user-friendly name of the certificate that will be used by the edge-optimized endpoint for this domain name.
         */
    var CertificateName: js.UndefOr[StringWithLengthBetween1And128] = js.undefined
    /**
         * The timestamp when the certificate that was used by edge-optimized endpoint for this domain name was uploaded.
         */
    var CertificateUploadDate: js.UndefOr[__timestampIso8601] = js.undefined
    /**
         * The endpoint type.
         */
    var EndpointType: js.UndefOr[EndpointType] = js.undefined
    /**
         * The Amazon Route 53 Hosted Zone ID of the endpoint. See AWS Regions and Endpoints for API Gateway.
         */
    var HostedZoneId: js.UndefOr[__string] = js.undefined
  }
  
  
  trait GetApiMappingRequest extends js.Object {
    /**
         * The identifier of the API.
         */
    var ApiId: __string
    /**
         * The API mapping identifier.
         */
    var ApiMappingId: __string
    /**
         * The domain name.
         */
    var DomainName: __string
  }
  
  
  trait GetApiMappingResponse extends js.Object {
    /**
         * The API identifier.
         */
    var ApiId: js.UndefOr[Id] = js.undefined
    /**
         * The API mapping identifier.
         */
    var ApiMappingId: js.UndefOr[Id] = js.undefined
    /**
         * The API mapping key.
         */
    var ApiMappingKey: js.UndefOr[SelectionKey] = js.undefined
    /**
         * The API stage.
         */
    var Stage: js.UndefOr[StringWithLengthBetween1And128] = js.undefined
  }
  
  
  trait GetApiMappingsRequest extends js.Object {
    /**
         * The domain name.
         */
    var DomainName: __string
    /**
         * The maximum number of elements to be returned for this resource.
         */
    var MaxResults: js.UndefOr[__string] = js.undefined
    /**
         * The next page of elements from this collection. Not valid for the last element of the collection.
         */
    var NextToken: js.UndefOr[__string] = js.undefined
  }
  
  
  trait GetApiMappingsResponse extends js.Object {
    /**
         * The API identifier.
         */
    var ApiId: js.UndefOr[Id] = js.undefined
    /**
         * The API mapping identifier.
         */
    var ApiMappingId: js.UndefOr[Id] = js.undefined
    /**
         * The API mapping key.
         */
    var ApiMappingKey: js.UndefOr[SelectionKey] = js.undefined
    /**
         * The API stage.
         */
    var Stage: js.UndefOr[StringWithLengthBetween1And128] = js.undefined
  }
  
  
  trait GetApiRequest extends js.Object {
    /**
         * The API identifier.
         */
    var ApiId: __string
  }
  
  
  trait GetApiResponse extends js.Object {
    /**
         * The URI of the API, of the form {api-id}.execute-api.{region}.amazonaws.com. The stage name is typically appended to this URI to form a complete path to a deployed API stage.
         */
    var ApiEndpoint: js.UndefOr[__string] = js.undefined
    /**
         * The API ID.
         */
    var ApiId: js.UndefOr[Id] = js.undefined
    /**
         * An API key selection expression. See API Key Selection Expressions.
         */
    var ApiKeySelectionExpression: js.UndefOr[SelectionExpression] = js.undefined
    /**
         * The timestamp when the API was created.
         */
    var CreatedDate: js.UndefOr[__timestampIso8601] = js.undefined
    /**
         * The description of the API.
         */
    var Description: js.UndefOr[StringWithLengthBetween0And1024] = js.undefined
    /**
         * Avoid validating models when creating a deployment.
         */
    var DisableSchemaValidation: js.UndefOr[__boolean] = js.undefined
    /**
         * The name of the API.
         */
    var Name: js.UndefOr[StringWithLengthBetween1And128] = js.undefined
    /**
         * The API protocol: HTTP or WEBSOCKET.
         */
    var ProtocolType: js.UndefOr[ProtocolType] = js.undefined
    /**
         * The route selection expression for the API.
         */
    var RouteSelectionExpression: js.UndefOr[SelectionExpression] = js.undefined
    /**
         * A version identifier for the API.
         */
    var Version: js.UndefOr[StringWithLengthBetween1And64] = js.undefined
    /**
         * The warning messages reported when failonwarnings is turned on during API import.
         */
    var Warnings: js.UndefOr[__listOf__string] = js.undefined
  }
  
  
  trait GetApisRequest extends js.Object {
    /**
         * The maximum number of elements to be returned for this resource.
         */
    var MaxResults: js.UndefOr[__string] = js.undefined
    /**
         * The next page of elements from this collection. Not valid for the last element of the collection.
         */
    var NextToken: js.UndefOr[__string] = js.undefined
  }
  
  
  trait GetApisResponse extends js.Object {
    /**
         * The elements from this collection.
         */
    var Items: js.UndefOr[__listOfApi] = js.undefined
    /**
         * The next page of elements from this collection. Not valid for the last element of the collection.
         */
    var NextToken: js.UndefOr[NextToken] = js.undefined
  }
  
  
  trait GetAuthorizerRequest extends js.Object {
    /**
         * The API identifier.
         */
    var ApiId: __string
    /**
         * The authorizer identifier.
         */
    var AuthorizerId: __string
  }
  
  
  trait GetAuthorizerResponse extends js.Object {
    /**
         * Specifies the required credentials as an IAM role for API Gateway to invoke the authorizer. To specify an IAM role for API Gateway to assume, use the role's Amazon Resource Name (ARN). To use resource-based permissions on the Lambda function, specify null.
         */
    var AuthorizerCredentialsArn: js.UndefOr[Arn] = js.undefined
    /**
         * The authorizer identifier.
         */
    var AuthorizerId: js.UndefOr[Id] = js.undefined
    /**
         * The time to live (TTL), in seconds, of cached authorizer results. If it equals 0, authorization caching is disabled. If it is greater than 0, API Gateway will cache authorizer responses. If this field is not set, the default value is 300. The maximum value is 3600, or 1 hour.
         */
    var AuthorizerResultTtlInSeconds: js.UndefOr[IntegerWithLengthBetween0And3600] = js.undefined
    /**
         * The authorizer type. Currently the only valid value is REQUEST, for a Lambda function using incoming request parameters.
         */
    var AuthorizerType: js.UndefOr[AuthorizerType] = js.undefined
    /**
         * The authorizer's Uniform Resource Identifier (URI). ForREQUEST authorizers, this must be a well-formed Lambda function URI, for example, arn:aws:apigateway:us-west-2:lambda:path/2015-03-31/functions/arn:aws:lambda:us-west-2:{account_id}:function:{lambda_function_name}/invocations. In general, the URI has this form: arn:aws:apigateway:{region}:lambda:path/{service_api} , where {region} is the same as the region hosting the Lambda function, path indicates that the remaining substring in the URI should be treated as the path to the resource, including the initial /. For Lambda functions, this is usually of the form /2015-03-31/functions/[FunctionARN]/invocations.
         */
    var AuthorizerUri: js.UndefOr[UriWithLengthBetween1And2048] = js.undefined
    /**
         * The identity source for which authorization is requested.For the REQUEST authorizer, this is required when authorization caching is enabled. The value is a comma-separated string of one or more mapping expressions of the specified request parameters. For example, if an Auth header and a Name query string parameters are defined as identity sources, this value is method.request.header.Auth, method.request.querystring.Name. These parameters will be used to derive the authorization caching key and to perform runtime validation of the REQUEST authorizer by verifying all of the identity-related request parameters are present, not null, and non-empty. Only when this is true does the authorizer invoke the authorizer Lambda function, otherwise, it returns a 401 Unauthorized response without calling the Lambda function. The valid value is a string of comma-separated mapping expressions of the specified request parameters. When the authorization caching is not enabled, this property is optional.
         */
    var IdentitySource: js.UndefOr[IdentitySourceList] = js.undefined
    /**
         * The validation expression does not apply to the REQUEST authorizer.
         */
    var IdentityValidationExpression: js.UndefOr[StringWithLengthBetween0And1024] = js.undefined
    /**
         * The name of the authorizer.
         */
    var Name: js.UndefOr[StringWithLengthBetween1And128] = js.undefined
    /**
         * For REQUEST authorizer, this is not defined.
         */
    var ProviderArns: js.UndefOr[ProviderArnList] = js.undefined
  }
  
  
  trait GetAuthorizersRequest extends js.Object {
    /**
         * The API identifier.
         */
    var ApiId: __string
    /**
         * The maximum number of elements to be returned for this resource.
         */
    var MaxResults: js.UndefOr[__string] = js.undefined
    /**
         * The next page of elements from this collection. Not valid for the last element of the collection.
         */
    var NextToken: js.UndefOr[__string] = js.undefined
  }
  
  
  trait GetAuthorizersResponse extends js.Object {
    /**
         * The elements from this collection.
         */
    var Items: js.UndefOr[__listOfAuthorizer] = js.undefined
    /**
         * The next page of elements from this collection. Not valid for the last element of the collection.
         */
    var NextToken: js.UndefOr[NextToken] = js.undefined
  }
  
  
  trait GetDeploymentRequest extends js.Object {
    /**
         * The API identifier.
         */
    var ApiId: __string
    /**
         * The deployment ID.
         */
    var DeploymentId: __string
  }
  
  
  trait GetDeploymentResponse extends js.Object {
    /**
         * The date and time when the Deployment resource was created.
         */
    var CreatedDate: js.UndefOr[__timestampIso8601] = js.undefined
    /**
         * The identifier for the deployment.
         */
    var DeploymentId: js.UndefOr[Id] = js.undefined
    /**
         * The status of the deployment: PENDING, FAILED, or SUCCEEDED.
         */
    var DeploymentStatus: js.UndefOr[DeploymentStatus] = js.undefined
    /**
         * May contain additional feedback on the status of an API deployment.
         */
    var DeploymentStatusMessage: js.UndefOr[__string] = js.undefined
    /**
         * The description for the deployment.
         */
    var Description: js.UndefOr[StringWithLengthBetween0And1024] = js.undefined
  }
  
  
  trait GetDeploymentsRequest extends js.Object {
    /**
         * The API identifier.
         */
    var ApiId: __string
    /**
         * The maximum number of elements to be returned for this resource.
         */
    var MaxResults: js.UndefOr[__string] = js.undefined
    /**
         * The next page of elements from this collection. Not valid for the last element of the collection.
         */
    var NextToken: js.UndefOr[__string] = js.undefined
  }
  
  
  trait GetDeploymentsResponse extends js.Object {
    /**
         * The elements from this collection.
         */
    var Items: js.UndefOr[__listOfDeployment] = js.undefined
    /**
         * The next page of elements from this collection. Not valid for the last element of the collection.
         */
    var NextToken: js.UndefOr[NextToken] = js.undefined
  }
  
  
  trait GetDomainNameRequest extends js.Object {
    /**
         * The domain name.
         */
    var DomainName: __string
  }
  
  
  trait GetDomainNameResponse extends js.Object {
    /**
         * The API mapping selection expression.
         */
    var ApiMappingSelectionExpression: js.UndefOr[SelectionExpression] = js.undefined
    /**
         * The name of the DomainName resource.
         */
    var DomainName: js.UndefOr[StringWithLengthBetween1And512] = js.undefined
    /**
         * The domain name configurations.
         */
    var DomainNameConfigurations: js.UndefOr[DomainNameConfigurations] = js.undefined
  }
  
  
  trait GetDomainNamesRequest extends js.Object {
    /**
         * The maximum number of elements to be returned for this resource.
         */
    var MaxResults: js.UndefOr[__string] = js.undefined
    /**
         * The next page of elements from this collection. Not valid for the last element of the collection.
         */
    var NextToken: js.UndefOr[__string] = js.undefined
  }
  
  
  trait GetDomainNamesResponse extends js.Object {
    /**
         * The elements from this collection.
         */
    var Items: js.UndefOr[__listOfDomainName] = js.undefined
    /**
         * The next page of elements from this collection. Not valid for the last element of the collection.
         */
    var NextToken: js.UndefOr[NextToken] = js.undefined
  }
  
  
  trait GetIntegrationRequest extends js.Object {
    /**
         * The API identifier.
         */
    var ApiId: __string
    /**
         * The integration ID.
         */
    var IntegrationId: __string
  }
  
  
  trait GetIntegrationResponseRequest extends js.Object {
    /**
         * The API identifier.
         */
    var ApiId: __string
    /**
         * The integration ID.
         */
    var IntegrationId: __string
    /**
         * The integration response ID.
         */
    var IntegrationResponseId: __string
  }
  
  
  trait GetIntegrationResponseResponse extends js.Object {
    /**
         * Specifies how to handle response payload content type conversions. Supported values are CONVERT_TO_BINARY and CONVERT_TO_TEXT, with the following behaviors: CONVERT_TO_BINARY: Converts a response payload from a Base64-encoded string to the corresponding binary blob. CONVERT_TO_TEXT: Converts a response payload from a binary blob to a Base64-encoded string.If this property is not defined, the response payload will be passed through from the integration response to the route response or method response without modification.
         */
    var ContentHandlingStrategy: js.UndefOr[ContentHandlingStrategy] = js.undefined
    /**
         * The integration response ID.
         */
    var IntegrationResponseId: js.UndefOr[Id] = js.undefined
    /**
         * The integration response key.
         */
    var IntegrationResponseKey: js.UndefOr[SelectionKey] = js.undefined
    /**
         * A key-value map specifying response parameters that are passed to the method response from the backend. The key is a method response header parameter name and the mapped value is an integration response header value, a static value enclosed within a pair of single quotes, or a JSON expression from the integration response body. The mapping key must match the pattern of method.response.header.{name}, where name is a valid and unique header name. The mapped non-static value must match the pattern of integration.response.header.{name} or integration.response.body.{JSON-expression}, where name is a valid and unique response header name and JSON-expression is a valid JSON expression without the $ prefix.
         */
    var ResponseParameters: js.UndefOr[IntegrationParameters] = js.undefined
    /**
         * The collection of response templates for the integration response as a string-to-string map of key-value pairs. Response templates are represented as a key/value map, with a content-type as the key and a template as the value.
         */
    var ResponseTemplates: js.UndefOr[TemplateMap] = js.undefined
    /**
         * The template selection expressions for the integration response.
         */
    var TemplateSelectionExpression: js.UndefOr[SelectionExpression] = js.undefined
  }
  
  
  trait GetIntegrationResponsesRequest extends js.Object {
    /**
         * The API identifier.
         */
    var ApiId: __string
    /**
         * The integration ID.
         */
    var IntegrationId: __string
    /**
         * The maximum number of elements to be returned for this resource.
         */
    var MaxResults: js.UndefOr[__string] = js.undefined
    /**
         * The next page of elements from this collection. Not valid for the last element of the collection.
         */
    var NextToken: js.UndefOr[__string] = js.undefined
  }
  
  
  trait GetIntegrationResponsesResponse extends js.Object {
    /**
         * The elements from this collection.
         */
    var Items: js.UndefOr[__listOfIntegrationResponse] = js.undefined
    /**
         * The next page of elements from this collection. Not valid for the last element of the collection.
         */
    var NextToken: js.UndefOr[NextToken] = js.undefined
  }
  
  
  trait GetIntegrationResult extends js.Object {
    /**
         * The identifier of the VpcLink used for the integration when the connectionType is VPC_LINK; otherwise undefined.
         */
    var ConnectionId: js.UndefOr[StringWithLengthBetween1And1024] = js.undefined
    /**
         * The type of the network connection to the integration endpoint. The valid value is INTERNET for connections through the public routable internet or VPC_LINK for private connections between API Gateway and a network load balancer in a VPC. The default value is INTERNET.
         */
    var ConnectionType: js.UndefOr[ConnectionType] = js.undefined
    /**
         * Specifies how to handle response payload content type conversions. Supported values are CONVERT_TO_BINARY and CONVERT_TO_TEXT, with the following behaviors: CONVERT_TO_BINARY: Converts a response payload from a Base64-encoded string to the corresponding binary blob. CONVERT_TO_TEXT: Converts a response payload from a binary blob to a Base64-encoded string.If this property is not defined, the response payload will be passed through from the integration response to the route response or method response without modification.
         */
    var ContentHandlingStrategy: js.UndefOr[ContentHandlingStrategy] = js.undefined
    /**
         * Specifies the credentials required for the integration, if any. For AWS integrations, three options are available. To specify an IAM Role for API Gateway to assume, use the role's Amazon Resource Name (ARN). To require that the caller's identity be passed through from the request, specify the string arn:aws:iam::*:user/ *. To use resource-based permissions on supported AWS services, specify null.
         */
    var CredentialsArn: js.UndefOr[Arn] = js.undefined
    /**
         * Represents the description of an integration.
         */
    var Description: js.UndefOr[StringWithLengthBetween0And1024] = js.undefined
    /**
         * Represents the identifier of an integration.
         */
    var IntegrationId: js.UndefOr[Id] = js.undefined
    /**
         * Specifies the integration's HTTP method type.
         */
    var IntegrationMethod: js.UndefOr[StringWithLengthBetween1And64] = js.undefined
    var IntegrationResponseSelectionExpression: js.UndefOr[SelectionExpression] = js.undefined
    /**
         * The integration type of an integration. One of the following: AWS: for integrating the route or method request with an AWS service action, including the Lambda function-invoking action. With the Lambda function-invoking action, this is referred to as the Lambda custom integration. With any other AWS service action, this is known as AWS integration. AWS_PROXY: for integrating the route or method request with the Lambda function-invoking action with the client request passed through as-is. This integration is also referred to as Lambda proxy integration. HTTP: for integrating the route or method request with an HTTP endpoint, including a private HTTP endpoint within a VPC. This integration is also referred to as the HTTP custom integration. HTTP_PROXY: for integrating route or method request with an HTTP endpoint, including a private HTTP endpoint within a VPC, with the client request passed through as-is. This is also referred to as HTTP proxy integration. MOCK: for integrating the route or method request with API Gateway as a "loopback" endpoint without invoking any backend.
         */
    var IntegrationType: js.UndefOr[IntegrationType] = js.undefined
    /**
         * Specifies the Uniform Resource Identifier (URI) of the integration endpoint.For HTTP or HTTP_PROXY integrations, the URI must be a fully formed, encoded HTTP(S) URL according to the RFC-3986 specification, for either standard integration, where connectionType is not VPC_LINK, or private integration, where connectionType is VPC_LINK. For a private HTTP integration, the URI is not used for routing.For AWS or AWS_PROXY integrations, the URI is of the form arn:aws:apigateway:{region}:{subdomain.service|service}:path|action/{service_api}. Here, {Region} is the API Gateway region (e.g., us-east-1); {service} is the name of the integrated AWS service (e.g., s3); and {subdomain} is a designated subdomain supported by certain AWS service for fast host-name lookup. action can be used for an AWS service action-based API, using an Action={name}&{p1}={v1}&p2={v2}... query string. The ensuing {service_api} refers to a supported action {name} plus any required input parameters. Alternatively, path can be used for an AWS service path-based API. The ensuing service_api refers to the path to an AWS service resource, including the region of the integrated AWS service, if applicable. For example, for integration with the S3 API of GetObject, the URI can be either arn:aws:apigateway:us-west-2:s3:action/GetObject&Bucket={bucket}&Key={key} or arn:aws:apigateway:us-west-2:s3:path/{bucket}/{key}
         */
    var IntegrationUri: js.UndefOr[UriWithLengthBetween1And2048] = js.undefined
    /**
         * Specifies the pass-through behavior for incoming requests based on the Content-Type header in the request, and the available mapping templates specified as the requestTemplates property on the Integration resource. There are three valid values: WHEN_NO_MATCH, WHEN_NO_TEMPLATES, and NEVER. WHEN_NO_MATCH passes the request body for unmapped content types through to the integration backend without transformation. NEVER rejects unmapped content types with an HTTP 415 Unsupported Media Type response. WHEN_NO_TEMPLATES allows pass-through when the integration has no content types mapped to templates. However, if there is at least one content type defined, unmapped content types will be rejected with the same HTTP 415 Unsupported Media Type response.
         */
    var PassthroughBehavior: js.UndefOr[PassthroughBehavior] = js.undefined
    /**
         * A key-value map specifying request parameters that are passed from the method request to the backend. The key is an integration request parameter name and the associated value is a method request parameter value or static value that must be enclosed within single quotes and pre-encoded as required by the backend. The method request parameter value must match the pattern of method.request.{location}.{name} , where  {location}  is querystring, path, or header; and  {name}  must be a valid and unique method request parameter name.
         */
    var RequestParameters: js.UndefOr[IntegrationParameters] = js.undefined
    /**
         * Represents a map of Velocity templates that are applied on the request payload based on the value of the Content-Type header sent by the client. The content type value is the key in this map, and the template (as a String) is the value.
         */
    var RequestTemplates: js.UndefOr[TemplateMap] = js.undefined
    /**
         * The template selection expression for the integration.
         */
    var TemplateSelectionExpression: js.UndefOr[SelectionExpression] = js.undefined
    /**
         * Custom timeout between 50 and 29,000 milliseconds. The default value is 29,000 milliseconds or 29 seconds.
         */
    var TimeoutInMillis: js.UndefOr[IntegerWithLengthBetween50And29000] = js.undefined
  }
  
  
  trait GetIntegrationsRequest extends js.Object {
    /**
         * The API identifier.
         */
    var ApiId: __string
    /**
         * The maximum number of elements to be returned for this resource.
         */
    var MaxResults: js.UndefOr[__string] = js.undefined
    /**
         * The next page of elements from this collection. Not valid for the last element of the collection.
         */
    var NextToken: js.UndefOr[__string] = js.undefined
  }
  
  
  trait GetIntegrationsResponse extends js.Object {
    /**
         * The elements from this collection.
         */
    var Items: js.UndefOr[__listOfIntegration] = js.undefined
    /**
         * The next page of elements from this collection. Not valid for the last element of the collection.
         */
    var NextToken: js.UndefOr[NextToken] = js.undefined
  }
  
  
  trait GetModelRequest extends js.Object {
    /**
         * The API identifier.
         */
    var ApiId: __string
    /**
         * The model ID.
         */
    var ModelId: __string
  }
  
  
  trait GetModelResponse extends js.Object {
    /**
         * The content-type for the model, for example, "application/json".
         */
    var ContentType: js.UndefOr[StringWithLengthBetween1And256] = js.undefined
    /**
         * The description of the model.
         */
    var Description: js.UndefOr[StringWithLengthBetween0And1024] = js.undefined
    /**
         * The model identifier.
         */
    var ModelId: js.UndefOr[Id] = js.undefined
    /**
         * The name of the model. Must be alphanumeric.
         */
    var Name: js.UndefOr[StringWithLengthBetween1And128] = js.undefined
    /**
         * The schema for the model. For application/json models, this should be JSON schema draft 4 model.
         */
    var Schema: js.UndefOr[StringWithLengthBetween0And32K] = js.undefined
  }
  
  
  trait GetModelTemplateRequest extends js.Object {
    /**
         * The API identifier.
         */
    var ApiId: __string
    /**
         * The model ID.
         */
    var ModelId: __string
  }
  
  
  trait GetModelTemplateResponse extends js.Object {
    /**
         * The template value.
         */
    var Value: js.UndefOr[__string] = js.undefined
  }
  
  
  trait GetModelsRequest extends js.Object {
    /**
         * The API identifier.
         */
    var ApiId: __string
    /**
         * The maximum number of elements to be returned for this resource.
         */
    var MaxResults: js.UndefOr[__string] = js.undefined
    /**
         * The next page of elements from this collection. Not valid for the last element of the collection.
         */
    var NextToken: js.UndefOr[__string] = js.undefined
  }
  
  
  trait GetModelsResponse extends js.Object {
    /**
         * The elements from this collection.
         */
    var Items: js.UndefOr[__listOfModel] = js.undefined
    /**
         * The next page of elements from this collection. Not valid for the last element of the collection.
         */
    var NextToken: js.UndefOr[NextToken] = js.undefined
  }
  
  
  trait GetRouteRequest extends js.Object {
    /**
         * The API identifier.
         */
    var ApiId: __string
    /**
         * The route ID.
         */
    var RouteId: __string
  }
  
  
  trait GetRouteResponseRequest extends js.Object {
    /**
         * The API identifier.
         */
    var ApiId: __string
    /**
         * The route ID.
         */
    var RouteId: __string
    /**
         * The route response ID.
         */
    var RouteResponseId: __string
  }
  
  
  trait GetRouteResponseResponse extends js.Object {
    /**
         * Represents the model selection expression of a route response.
         */
    var ModelSelectionExpression: js.UndefOr[SelectionExpression] = js.undefined
    /**
         * Represents the response models of a route response.
         */
    var ResponseModels: js.UndefOr[RouteModels] = js.undefined
    /**
         * Represents the response parameters of a route response.
         */
    var ResponseParameters: js.UndefOr[RouteParameters] = js.undefined
    /**
         * Represents the identifier of a route response.
         */
    var RouteResponseId: js.UndefOr[Id] = js.undefined
    /**
         * Represents the route response key of a route response.
         */
    var RouteResponseKey: js.UndefOr[SelectionKey] = js.undefined
  }
  
  
  trait GetRouteResponsesRequest extends js.Object {
    /**
         * The API identifier.
         */
    var ApiId: __string
    /**
         * The maximum number of elements to be returned for this resource.
         */
    var MaxResults: js.UndefOr[__string] = js.undefined
    /**
         * The next page of elements from this collection. Not valid for the last element of the collection.
         */
    var NextToken: js.UndefOr[__string] = js.undefined
    /**
         * The route ID.
         */
    var RouteId: __string
  }
  
  
  trait GetRouteResponsesResponse extends js.Object {
    /**
         * The elements from this collection.
         */
    var Items: js.UndefOr[__listOfRouteResponse] = js.undefined
    /**
         * The next page of elements from this collection. Not valid for the last element of the collection.
         */
    var NextToken: js.UndefOr[NextToken] = js.undefined
  }
  
  
  trait GetRouteResult extends js.Object {
    /**
         * Specifies whether an API key is required for this route.
         */
    var ApiKeyRequired: js.UndefOr[__boolean] = js.undefined
    /**
         * The authorization scopes supported by this route. 
         */
    var AuthorizationScopes: js.UndefOr[AuthorizationScopes] = js.undefined
    /**
         * The authorization type for the route. Valid values are NONE for open access, AWS_IAM for using AWS IAM permissions.
         */
    var AuthorizationType: js.UndefOr[AuthorizationType] = js.undefined
    /**
         * The identifier of the Authorizer resource to be associated with this route.
         */
    var AuthorizerId: js.UndefOr[Id] = js.undefined
    /**
         * The model selection expression for the route.
         */
    var ModelSelectionExpression: js.UndefOr[SelectionExpression] = js.undefined
    /**
         * The operation name for the route.
         */
    var OperationName: js.UndefOr[StringWithLengthBetween1And64] = js.undefined
    /**
         * The request models for the route.
         */
    var RequestModels: js.UndefOr[RouteModels] = js.undefined
    /**
         * The request parameters for the route.
         */
    var RequestParameters: js.UndefOr[RouteParameters] = js.undefined
    /**
         * The route ID.
         */
    var RouteId: js.UndefOr[Id] = js.undefined
    /**
         * The route key for the route.
         */
    var RouteKey: js.UndefOr[SelectionKey] = js.undefined
    /**
         * The route response selection expression for the route.
         */
    var RouteResponseSelectionExpression: js.UndefOr[SelectionExpression] = js.undefined
    /**
         * The target for the route.
         */
    var Target: js.UndefOr[StringWithLengthBetween1And128] = js.undefined
  }
  
  
  trait GetRoutesRequest extends js.Object {
    /**
         * The API identifier.
         */
    var ApiId: __string
    /**
         * The maximum number of elements to be returned for this resource.
         */
    var MaxResults: js.UndefOr[__string] = js.undefined
    /**
         * The next page of elements from this collection. Not valid for the last element of the collection.
         */
    var NextToken: js.UndefOr[__string] = js.undefined
  }
  
  
  trait GetRoutesResponse extends js.Object {
    /**
         * The elements from this collection.
         */
    var Items: js.UndefOr[__listOfRoute] = js.undefined
    /**
         * The next page of elements from this collection. Not valid for the last element of the collection.
         */
    var NextToken: js.UndefOr[NextToken] = js.undefined
  }
  
  
  trait GetStageRequest extends js.Object {
    /**
         * The API identifier.
         */
    var ApiId: __string
    /**
         * The stage name.
         */
    var StageName: __string
  }
  
  
  trait GetStageResponse extends js.Object {
    /**
         * Settings for logging access in this stage.
         */
    var AccessLogSettings: js.UndefOr[AccessLogSettings] = js.undefined
    /**
         * The identifier of a client certificate for a Stage.
         */
    var ClientCertificateId: js.UndefOr[Id] = js.undefined
    /**
         * The timestamp when the stage was created.
         */
    var CreatedDate: js.UndefOr[__timestampIso8601] = js.undefined
    /**
         * Default route settings for the stage.
         */
    var DefaultRouteSettings: js.UndefOr[RouteSettings] = js.undefined
    /**
         * The identifier of the Deployment that the Stage is associated with.
         */
    var DeploymentId: js.UndefOr[Id] = js.undefined
    /**
         * The description of the stage.
         */
    var Description: js.UndefOr[StringWithLengthBetween0And1024] = js.undefined
    /**
         * The timestamp when the stage was last updated.
         */
    var LastUpdatedDate: js.UndefOr[__timestampIso8601] = js.undefined
    /**
         * Route settings for the stage.
         */
    var RouteSettings: js.UndefOr[RouteSettingsMap] = js.undefined
    /**
         * The name of the stage.
         */
    var StageName: js.UndefOr[StringWithLengthBetween1And128] = js.undefined
    /**
         * A map that defines the stage variables for a stage resource. Variable names can have alphanumeric and underscore characters, and the values must match [A-Za-z0-9-._~:/?#&=,]+.
         */
    var StageVariables: js.UndefOr[StageVariablesMap] = js.undefined
  }
  
  
  trait GetStagesRequest extends js.Object {
    /**
         * The API identifier.
         */
    var ApiId: __string
    /**
         * The maximum number of elements to be returned for this resource.
         */
    var MaxResults: js.UndefOr[__string] = js.undefined
    /**
         * The next page of elements from this collection. Not valid for the last element of the collection.
         */
    var NextToken: js.UndefOr[__string] = js.undefined
  }
  
  
  trait GetStagesResponse extends js.Object {
    /**
         * The elements from this collection.
         */
    var Items: js.UndefOr[__listOfStage] = js.undefined
    /**
         * The next page of elements from this collection. Not valid for the last element of the collection.
         */
    var NextToken: js.UndefOr[NextToken] = js.undefined
  }
  
  
  trait Integration extends js.Object {
    /**
         * The identifier of the VpcLink used for the integration when the connectionType is VPC_LINK; otherwise undefined.
         */
    var ConnectionId: js.UndefOr[StringWithLengthBetween1And1024] = js.undefined
    /**
         * The type of the network connection to the integration endpoint. The valid value is INTERNET for connections through the public routable internet or VPC_LINK for private connections between API Gateway and a network load balancer in a VPC. The default value is INTERNET.
         */
    var ConnectionType: js.UndefOr[ConnectionType] = js.undefined
    /**
         * Specifies how to handle response payload content type conversions. Supported values are CONVERT_TO_BINARY and CONVERT_TO_TEXT, with the following behaviors: CONVERT_TO_BINARY: Converts a response payload from a Base64-encoded string to the corresponding binary blob. CONVERT_TO_TEXT: Converts a response payload from a binary blob to a Base64-encoded string.If this property is not defined, the response payload will be passed through from the integration response to the route response or method response without modification.
         */
    var ContentHandlingStrategy: js.UndefOr[ContentHandlingStrategy] = js.undefined
    /**
         * Specifies the credentials required for the integration, if any. For AWS integrations, three options are available. To specify an IAM Role for API Gateway to assume, use the role's Amazon Resource Name (ARN). To require that the caller's identity be passed through from the request, specify the string arn:aws:iam::*:user/ *. To use resource-based permissions on supported AWS services, specify null.
         */
    var CredentialsArn: js.UndefOr[Arn] = js.undefined
    /**
         * Represents the description of an integration.
         */
    var Description: js.UndefOr[StringWithLengthBetween0And1024] = js.undefined
    /**
         * Represents the identifier of an integration.
         */
    var IntegrationId: js.UndefOr[Id] = js.undefined
    /**
         * Specifies the integration's HTTP method type.
         */
    var IntegrationMethod: js.UndefOr[StringWithLengthBetween1And64] = js.undefined
    var IntegrationResponseSelectionExpression: js.UndefOr[SelectionExpression] = js.undefined
    /**
         * The integration type of an integration. One of the following: AWS: for integrating the route or method request with an AWS service action, including the Lambda function-invoking action. With the Lambda function-invoking action, this is referred to as the Lambda custom integration. With any other AWS service action, this is known as AWS integration. AWS_PROXY: for integrating the route or method request with the Lambda function-invoking action with the client request passed through as-is. This integration is also referred to as Lambda proxy integration. HTTP: for integrating the route or method request with an HTTP endpoint, including a private HTTP endpoint within a VPC. This integration is also referred to as the HTTP custom integration. HTTP_PROXY: for integrating route or method request with an HTTP endpoint, including a private HTTP endpoint within a VPC, with the client request passed through as-is. This is also referred to as HTTP proxy integration. MOCK: for integrating the route or method request with API Gateway as a "loopback" endpoint without invoking any backend.
         */
    var IntegrationType: js.UndefOr[IntegrationType] = js.undefined
    /**
         * Specifies the Uniform Resource Identifier (URI) of the integration endpoint.For HTTP or HTTP_PROXY integrations, the URI must be a fully formed, encoded HTTP(S) URL according to the RFC-3986 specification, for either standard integration, where connectionType is not VPC_LINK, or private integration, where connectionType is VPC_LINK. For a private HTTP integration, the URI is not used for routing.For AWS or AWS_PROXY integrations, the URI is of the form arn:aws:apigateway:{region}:{subdomain.service|service}:path|action/{service_api}. Here, {Region} is the API Gateway region (e.g., us-east-1); {service} is the name of the integrated AWS service (e.g., s3); and {subdomain} is a designated subdomain supported by certain AWS service for fast host-name lookup. action can be used for an AWS service action-based API, using an Action={name}&{p1}={v1}&p2={v2}... query string. The ensuing {service_api} refers to a supported action {name} plus any required input parameters. Alternatively, path can be used for an AWS service path-based API. The ensuing service_api refers to the path to an AWS service resource, including the region of the integrated AWS service, if applicable. For example, for integration with the S3 API of GetObject, the URI can be either arn:aws:apigateway:us-west-2:s3:action/GetObject&Bucket={bucket}&Key={key} or arn:aws:apigateway:us-west-2:s3:path/{bucket}/{key}
         */
    var IntegrationUri: js.UndefOr[UriWithLengthBetween1And2048] = js.undefined
    /**
         * Specifies the pass-through behavior for incoming requests based on the Content-Type header in the request, and the available mapping templates specified as the requestTemplates property on the Integration resource. There are three valid values: WHEN_NO_MATCH, WHEN_NO_TEMPLATES, and NEVER. WHEN_NO_MATCH passes the request body for unmapped content types through to the integration backend without transformation. NEVER rejects unmapped content types with an HTTP 415 Unsupported Media Type response. WHEN_NO_TEMPLATES allows pass-through when the integration has no content types mapped to templates. However, if there is at least one content type defined, unmapped content types will be rejected with the same HTTP 415 Unsupported Media Type response.
         */
    var PassthroughBehavior: js.UndefOr[PassthroughBehavior] = js.undefined
    /**
         * A key-value map specifying request parameters that are passed from the method request to the backend. The key is an integration request parameter name and the associated value is a method request parameter value or static value that must be enclosed within single quotes and pre-encoded as required by the backend. The method request parameter value must match the pattern of method.request.{location}.{name} , where  {location}  is querystring, path, or header; and  {name}  must be a valid and unique method request parameter name.
         */
    var RequestParameters: js.UndefOr[IntegrationParameters] = js.undefined
    /**
         * Represents a map of Velocity templates that are applied on the request payload based on the value of the Content-Type header sent by the client. The content type value is the key in this map, and the template (as a String) is the value.
         */
    var RequestTemplates: js.UndefOr[TemplateMap] = js.undefined
    /**
         * The template selection expression for the integration.
         */
    var TemplateSelectionExpression: js.UndefOr[SelectionExpression] = js.undefined
    /**
         * Custom timeout between 50 and 29,000 milliseconds. The default value is 29,000 milliseconds or 29 seconds.
         */
    var TimeoutInMillis: js.UndefOr[IntegerWithLengthBetween50And29000] = js.undefined
  }
  
  
  trait IntegrationParameters
    extends /* key */ org.scalablytyped.runtime.StringDictionary[StringWithLengthBetween1And512]
  
  
  trait IntegrationResponse extends js.Object {
    /**
         * Specifies how to handle response payload content type conversions. Supported values are CONVERT_TO_BINARY and CONVERT_TO_TEXT, with the following behaviors: CONVERT_TO_BINARY: Converts a response payload from a Base64-encoded string to the corresponding binary blob. CONVERT_TO_TEXT: Converts a response payload from a binary blob to a Base64-encoded string.If this property is not defined, the response payload will be passed through from the integration response to the route response or method response without modification.
         */
    var ContentHandlingStrategy: js.UndefOr[ContentHandlingStrategy] = js.undefined
    /**
         * The integration response ID.
         */
    var IntegrationResponseId: js.UndefOr[Id] = js.undefined
    /**
         * The integration response key.
         */
    var IntegrationResponseKey: SelectionKey
    /**
         * A key-value map specifying response parameters that are passed to the method response from the backend. The key is a method response header parameter name and the mapped value is an integration response header value, a static value enclosed within a pair of single quotes, or a JSON expression from the integration response body. The mapping key must match the pattern of method.response.header.{name}, where name is a valid and unique header name. The mapped non-static value must match the pattern of integration.response.header.{name} or integration.response.body.{JSON-expression}, where name is a valid and unique response header name and JSON-expression is a valid JSON expression without the $ prefix.
         */
    var ResponseParameters: js.UndefOr[IntegrationParameters] = js.undefined
    /**
         * The collection of response templates for the integration response as a string-to-string map of key-value pairs. Response templates are represented as a key/value map, with a content-type as the key and a template as the value.
         */
    var ResponseTemplates: js.UndefOr[TemplateMap] = js.undefined
    /**
         * The template selection expressions for the integration response.
         */
    var TemplateSelectionExpression: js.UndefOr[SelectionExpression] = js.undefined
  }
  
  
  trait Model extends js.Object {
    /**
         * The content-type for the model, for example, "application/json".
         */
    var ContentType: js.UndefOr[StringWithLengthBetween1And256] = js.undefined
    /**
         * The description of the model.
         */
    var Description: js.UndefOr[StringWithLengthBetween0And1024] = js.undefined
    /**
         * The model identifier.
         */
    var ModelId: js.UndefOr[Id] = js.undefined
    /**
         * The name of the model. Must be alphanumeric.
         */
    var Name: StringWithLengthBetween1And128
    /**
         * The schema for the model. For application/json models, this should be JSON schema draft 4 model.
         */
    var Schema: js.UndefOr[StringWithLengthBetween0And32K] = js.undefined
  }
  
  
  trait ParameterConstraints extends js.Object {
    /**
         * Whether or not the parameter is required.
         */
    var Required: js.UndefOr[__boolean] = js.undefined
  }
  
  
  trait Route extends js.Object {
    /**
         * Specifies whether an API key is required for this route.
         */
    var ApiKeyRequired: js.UndefOr[__boolean] = js.undefined
    /**
         * The authorization scopes supported by this route. 
         */
    var AuthorizationScopes: js.UndefOr[AuthorizationScopes] = js.undefined
    /**
         * The authorization type for the route. Valid values are NONE for open access, AWS_IAM for using AWS IAM permissions.
         */
    var AuthorizationType: js.UndefOr[AuthorizationType] = js.undefined
    /**
         * The identifier of the Authorizer resource to be associated with this route.
         */
    var AuthorizerId: js.UndefOr[Id] = js.undefined
    /**
         * The model selection expression for the route.
         */
    var ModelSelectionExpression: js.UndefOr[SelectionExpression] = js.undefined
    /**
         * The operation name for the route.
         */
    var OperationName: js.UndefOr[StringWithLengthBetween1And64] = js.undefined
    /**
         * The request models for the route.
         */
    var RequestModels: js.UndefOr[RouteModels] = js.undefined
    /**
         * The request parameters for the route.
         */
    var RequestParameters: js.UndefOr[RouteParameters] = js.undefined
    /**
         * The route ID.
         */
    var RouteId: js.UndefOr[Id] = js.undefined
    /**
         * The route key for the route.
         */
    var RouteKey: SelectionKey
    /**
         * The route response selection expression for the route.
         */
    var RouteResponseSelectionExpression: js.UndefOr[SelectionExpression] = js.undefined
    /**
         * The target for the route.
         */
    var Target: js.UndefOr[StringWithLengthBetween1And128] = js.undefined
  }
  
  
  trait RouteModels
    extends /* key */ org.scalablytyped.runtime.StringDictionary[StringWithLengthBetween1And128]
  
  
  trait RouteParameters
    extends /* key */ org.scalablytyped.runtime.StringDictionary[ParameterConstraints]
  
  
  trait RouteResponse extends js.Object {
    /**
         * Represents the model selection expression of a route response.
         */
    var ModelSelectionExpression: js.UndefOr[SelectionExpression] = js.undefined
    /**
         * Represents the response models of a route response.
         */
    var ResponseModels: js.UndefOr[RouteModels] = js.undefined
    /**
         * Represents the response parameters of a route response.
         */
    var ResponseParameters: js.UndefOr[RouteParameters] = js.undefined
    /**
         * Represents the identifier of a route response.
         */
    var RouteResponseId: js.UndefOr[Id] = js.undefined
    /**
         * Represents the route response key of a route response.
         */
    var RouteResponseKey: SelectionKey
  }
  
  
  trait RouteSettings extends js.Object {
    /**
         * Specifies whether (true) or not (false) data trace logging is enabled for this route. This property affects the log entries pushed to Amazon CloudWatch Logs.
         */
    var DataTraceEnabled: js.UndefOr[__boolean] = js.undefined
    /**
         * Specifies whether detailed metrics are enabled.
         */
    var DetailedMetricsEnabled: js.UndefOr[__boolean] = js.undefined
    /**
         * Specifies the logging level for this route: DEBUG, INFO, or WARN. This property affects the log entries pushed to Amazon CloudWatch Logs.
         */
    var LoggingLevel: js.UndefOr[LoggingLevel] = js.undefined
    /**
         * Specifies the throttling burst limit.
         */
    var ThrottlingBurstLimit: js.UndefOr[__integer] = js.undefined
    /**
         * Specifies the throttling rate limit.
         */
    var ThrottlingRateLimit: js.UndefOr[__double] = js.undefined
  }
  
  
  trait RouteSettingsMap
    extends /* key */ org.scalablytyped.runtime.StringDictionary[RouteSettings]
  
  
  trait Stage extends js.Object {
    /**
         * Settings for logging access in this stage.
         */
    var AccessLogSettings: js.UndefOr[AccessLogSettings] = js.undefined
    /**
         * The identifier of a client certificate for a Stage.
         */
    var ClientCertificateId: js.UndefOr[Id] = js.undefined
    /**
         * The timestamp when the stage was created.
         */
    var CreatedDate: js.UndefOr[__timestampIso8601] = js.undefined
    /**
         * Default route settings for the stage.
         */
    var DefaultRouteSettings: js.UndefOr[RouteSettings] = js.undefined
    /**
         * The identifier of the Deployment that the Stage is associated with.
         */
    var DeploymentId: js.UndefOr[Id] = js.undefined
    /**
         * The description of the stage.
         */
    var Description: js.UndefOr[StringWithLengthBetween0And1024] = js.undefined
    /**
         * The timestamp when the stage was last updated.
         */
    var LastUpdatedDate: js.UndefOr[__timestampIso8601] = js.undefined
    /**
         * Route settings for the stage.
         */
    var RouteSettings: js.UndefOr[RouteSettingsMap] = js.undefined
    /**
         * The name of the stage.
         */
    var StageName: StringWithLengthBetween1And128
    /**
         * A map that defines the stage variables for a stage resource. Variable names can have alphanumeric and underscore characters, and the values must match [A-Za-z0-9-._~:/?#&=,]+.
         */
    var StageVariables: js.UndefOr[StageVariablesMap] = js.undefined
  }
  
  
  trait StageVariablesMap
    extends /* key */ org.scalablytyped.runtime.StringDictionary[StringWithLengthBetween0And2048]
  
  
  trait TemplateMap
    extends /* key */ org.scalablytyped.runtime.StringDictionary[StringWithLengthBetween0And32K]
  
  @js.native
  trait Types
    extends awsDashSdkLib.libServiceMod.Service {
    @JSName("config")
    var config_Types: awsDashSdkLib.libConfigMod.ConfigBase with ClientConfiguration = js.native
    /**
       * Creates an Api resource.
       */
    def createApi(): awsDashSdkLib.libRequestMod.Request[CreateApiResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Creates an Api resource.
       */
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
    /**
       * Creates an Api resource.
       */
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
    /**
       * Creates an API mapping.
       */
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
    /**
       * Creates an API mapping.
       */
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
    /**
       * Creates an Authorizer for an API.
       */
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
    /**
       * Creates an Authorizer for an API.
       */
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
    /**
       * Creates a Deployment for an API.
       */
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
    /**
       * Creates a Deployment for an API.
       */
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
    /**
       * Creates a domain name.
       */
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
    /**
       * Creates a domain name.
       */
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
    def createIntegration(): awsDashSdkLib.libRequestMod.Request[CreateIntegrationResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Creates an Integration.
       */
    def createIntegration(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateIntegrationResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateIntegrationResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Creates an Integration.
       */
    def createIntegration(params: CreateIntegrationRequest): awsDashSdkLib.libRequestMod.Request[CreateIntegrationResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Creates an Integration.
       */
    def createIntegration(
      params: CreateIntegrationRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateIntegrationResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateIntegrationResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Creates an IntegrationResponses.
       */
    def createIntegrationResponse(): awsDashSdkLib.libRequestMod.Request[CreateIntegrationResponseResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Creates an IntegrationResponses.
       */
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
    /**
       * Creates an IntegrationResponses.
       */
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
    /**
       * Creates a Model for an API.
       */
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
    /**
       * Creates a Model for an API.
       */
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
    def createRoute(): awsDashSdkLib.libRequestMod.Request[CreateRouteResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Creates a Route for an API.
       */
    def createRoute(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateRouteResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateRouteResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Creates a Route for an API.
       */
    def createRoute(params: CreateRouteRequest): awsDashSdkLib.libRequestMod.Request[CreateRouteResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Creates a Route for an API.
       */
    def createRoute(
      params: CreateRouteRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateRouteResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateRouteResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Creates a RouteResponse for a Route.
       */
    def createRouteResponse(): awsDashSdkLib.libRequestMod.Request[CreateRouteResponseResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Creates a RouteResponse for a Route.
       */
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
    /**
       * Creates a RouteResponse for a Route.
       */
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
    /**
       * Creates a Stage for an API.
       */
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
    /**
       * Creates a Stage for an API.
       */
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
    /**
       * Deletes an Api resource.
       */
    def deleteApi(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Deletes an Api resource.
       */
    def deleteApi(params: DeleteApiRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Deletes an Api resource.
       */
    def deleteApi(
      params: DeleteApiRequest,
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
    def deleteApiMapping(params: DeleteApiMappingRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Deletes an API mapping.
       */
    def deleteApiMapping(
      params: DeleteApiMappingRequest,
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
    def deleteAuthorizer(params: DeleteAuthorizerRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Deletes an Authorizer.
       */
    def deleteAuthorizer(
      params: DeleteAuthorizerRequest,
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
    def deleteDeployment(params: DeleteDeploymentRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Deletes a Deployment.
       */
    def deleteDeployment(
      params: DeleteDeploymentRequest,
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
    def deleteDomainName(params: DeleteDomainNameRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Deletes a domain name.
       */
    def deleteDomainName(
      params: DeleteDomainNameRequest,
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
    def deleteIntegration(params: DeleteIntegrationRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Deletes an Integration.
       */
    def deleteIntegration(
      params: DeleteIntegrationRequest,
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
    def deleteIntegrationResponse(params: DeleteIntegrationResponseRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Deletes an IntegrationResponses.
       */
    def deleteIntegrationResponse(
      params: DeleteIntegrationResponseRequest,
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
    def deleteModel(params: DeleteModelRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Deletes a Model.
       */
    def deleteModel(
      params: DeleteModelRequest,
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
    def deleteRoute(params: DeleteRouteRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Deletes a Route.
       */
    def deleteRoute(
      params: DeleteRouteRequest,
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
    def deleteRouteResponse(params: DeleteRouteResponseRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Deletes a RouteResponse.
       */
    def deleteRouteResponse(
      params: DeleteRouteResponseRequest,
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
    def deleteStage(params: DeleteStageRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Deletes a Stage.
       */
    def deleteStage(
      params: DeleteStageRequest,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Gets an Api resource.
       */
    def getApi(): awsDashSdkLib.libRequestMod.Request[GetApiResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Gets an Api resource.
       */
    def getApi(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ GetApiResponse, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[GetApiResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Gets an Api resource.
       */
    def getApi(params: GetApiRequest): awsDashSdkLib.libRequestMod.Request[GetApiResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Gets an Api resource.
       */
    def getApi(
      params: GetApiRequest,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ GetApiResponse, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[GetApiResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * The API mapping.
       */
    def getApiMapping(): awsDashSdkLib.libRequestMod.Request[GetApiMappingResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * The API mapping.
       */
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
    /**
       * The API mapping.
       */
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
    /**
       * The API mappings.
       */
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
    /**
       * The API mappings.
       */
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
    /**
       * Gets a collection of Api resources.
       */
    def getApis(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ GetApisResponse, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[GetApisResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Gets a collection of Api resources.
       */
    def getApis(params: GetApisRequest): awsDashSdkLib.libRequestMod.Request[GetApisResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Gets a collection of Api resources.
       */
    def getApis(
      params: GetApisRequest,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ GetApisResponse, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[GetApisResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Gets an Authorizer.
       */
    def getAuthorizer(): awsDashSdkLib.libRequestMod.Request[GetAuthorizerResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Gets an Authorizer.
       */
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
    /**
       * Gets an Authorizer.
       */
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
    /**
       * Gets the Authorizers for an API.
       */
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
    /**
       * Gets the Authorizers for an API.
       */
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
    /**
       * Gets a Deployment.
       */
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
    /**
       * Gets a Deployment.
       */
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
    /**
       * Gets the Deployments for an API.
       */
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
    /**
       * Gets the Deployments for an API.
       */
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
    /**
       * Gets a domain name.
       */
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
    /**
       * Gets a domain name.
       */
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
    /**
       * Gets the domain names for an AWS account.
       */
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
    /**
       * Gets the domain names for an AWS account.
       */
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
    def getIntegration(): awsDashSdkLib.libRequestMod.Request[GetIntegrationResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Gets an Integration.
       */
    def getIntegration(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetIntegrationResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetIntegrationResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Gets an Integration.
       */
    def getIntegration(params: GetIntegrationRequest): awsDashSdkLib.libRequestMod.Request[GetIntegrationResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Gets an Integration.
       */
    def getIntegration(
      params: GetIntegrationRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetIntegrationResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetIntegrationResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Gets an IntegrationResponses.
       */
    def getIntegrationResponse(): awsDashSdkLib.libRequestMod.Request[GetIntegrationResponseResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Gets an IntegrationResponses.
       */
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
    /**
       * Gets an IntegrationResponses.
       */
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
    /**
       * Gets the IntegrationResponses for an Integration.
       */
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
    /**
       * Gets the IntegrationResponses for an Integration.
       */
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
    /**
       * Gets the Integrations for an API.
       */
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
    /**
       * Gets the Integrations for an API.
       */
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
    /**
       * Gets a Model.
       */
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
    /**
       * Gets a Model.
       */
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
    /**
       * Gets a model template.
       */
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
    /**
       * Gets a model template.
       */
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
    /**
       * Gets the Models for an API.
       */
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
    /**
       * Gets the Models for an API.
       */
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
    def getRoute(): awsDashSdkLib.libRequestMod.Request[GetRouteResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Gets a Route.
       */
    def getRoute(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ GetRouteResult, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[GetRouteResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Gets a Route.
       */
    def getRoute(params: GetRouteRequest): awsDashSdkLib.libRequestMod.Request[GetRouteResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Gets a Route.
       */
    def getRoute(
      params: GetRouteRequest,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ GetRouteResult, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[GetRouteResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Gets a RouteResponse.
       */
    def getRouteResponse(): awsDashSdkLib.libRequestMod.Request[GetRouteResponseResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Gets a RouteResponse.
       */
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
    /**
       * Gets a RouteResponse.
       */
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
    /**
       * Gets the RouteResponses for a Route.
       */
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
    /**
       * Gets the RouteResponses for a Route.
       */
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
    /**
       * Gets the Routes for an API.
       */
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
    /**
       * Gets the Routes for an API.
       */
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
    /**
       * Gets a Stage.
       */
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
    /**
       * Gets a Stage.
       */
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
    /**
       * Gets the Stages for an API.
       */
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
    /**
       * Gets the Stages for an API.
       */
    def getStages(
      params: GetStagesRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetStagesResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetStagesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Updates an Api resource.
       */
    def updateApi(): awsDashSdkLib.libRequestMod.Request[UpdateApiResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Updates an Api resource.
       */
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
    /**
       * Updates an Api resource.
       */
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
    /**
       * The API mapping.
       */
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
    /**
       * The API mapping.
       */
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
    /**
       * Updates an Authorizer.
       */
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
    /**
       * Updates an Authorizer.
       */
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
    /**
       * Updates a Deployment.
       */
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
    /**
       * Updates a Deployment.
       */
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
    /**
       * Updates a domain name.
       */
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
    /**
       * Updates a domain name.
       */
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
    def updateIntegration(): awsDashSdkLib.libRequestMod.Request[UpdateIntegrationResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Updates an Integration.
       */
    def updateIntegration(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ UpdateIntegrationResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[UpdateIntegrationResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Updates an Integration.
       */
    def updateIntegration(params: UpdateIntegrationRequest): awsDashSdkLib.libRequestMod.Request[UpdateIntegrationResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Updates an Integration.
       */
    def updateIntegration(
      params: UpdateIntegrationRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ UpdateIntegrationResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[UpdateIntegrationResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Updates an IntegrationResponses.
       */
    def updateIntegrationResponse(): awsDashSdkLib.libRequestMod.Request[UpdateIntegrationResponseResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Updates an IntegrationResponses.
       */
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
    /**
       * Updates an IntegrationResponses.
       */
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
    /**
       * Updates a Model.
       */
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
    /**
       * Updates a Model.
       */
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
    def updateRoute(): awsDashSdkLib.libRequestMod.Request[UpdateRouteResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Updates a Route.
       */
    def updateRoute(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ UpdateRouteResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[UpdateRouteResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Updates a Route.
       */
    def updateRoute(params: UpdateRouteRequest): awsDashSdkLib.libRequestMod.Request[UpdateRouteResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Updates a Route.
       */
    def updateRoute(
      params: UpdateRouteRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ UpdateRouteResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[UpdateRouteResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Updates a RouteResponse.
       */
    def updateRouteResponse(): awsDashSdkLib.libRequestMod.Request[UpdateRouteResponseResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Updates a RouteResponse.
       */
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
    /**
       * Updates a RouteResponse.
       */
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
    /**
       * Updates a Stage.
       */
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
    /**
       * Updates a Stage.
       */
    def updateStage(
      params: UpdateStageRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ UpdateStageResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[UpdateStageResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  }
  
  
  trait UpdateApiMappingRequest extends js.Object {
    /**
         * The API identifier.
         */
    var ApiId: Id
    /**
         * The API mapping identifier.
         */
    var ApiMappingId: __string
    /**
         * The API mapping key.
         */
    var ApiMappingKey: js.UndefOr[SelectionKey] = js.undefined
    /**
         * The domain name.
         */
    var DomainName: __string
    /**
         * The API stage.
         */
    var Stage: js.UndefOr[StringWithLengthBetween1And128] = js.undefined
  }
  
  
  trait UpdateApiMappingResponse extends js.Object {
    /**
         * The API identifier.
         */
    var ApiId: js.UndefOr[Id] = js.undefined
    /**
         * The API mapping identifier.
         */
    var ApiMappingId: js.UndefOr[Id] = js.undefined
    /**
         * The API mapping key.
         */
    var ApiMappingKey: js.UndefOr[SelectionKey] = js.undefined
    /**
         * The API stage.
         */
    var Stage: js.UndefOr[StringWithLengthBetween1And128] = js.undefined
  }
  
  
  trait UpdateApiRequest extends js.Object {
    /**
         * The API identifier.
         */
    var ApiId: __string
    /**
         * An API key selection expression. See API Key Selection Expressions.
         */
    var ApiKeySelectionExpression: js.UndefOr[SelectionExpression] = js.undefined
    /**
         * The description of the API.
         */
    var Description: js.UndefOr[StringWithLengthBetween0And1024] = js.undefined
    /**
         * Avoid validating models when creating a deployment.
         */
    var DisableSchemaValidation: js.UndefOr[__boolean] = js.undefined
    /**
         * The name of the API.
         */
    var Name: js.UndefOr[StringWithLengthBetween1And128] = js.undefined
    /**
         * The route selection expression for the API.
         */
    var RouteSelectionExpression: js.UndefOr[SelectionExpression] = js.undefined
    /**
         * A version identifier for the API.
         */
    var Version: js.UndefOr[StringWithLengthBetween1And64] = js.undefined
  }
  
  
  trait UpdateApiResponse extends js.Object {
    /**
         * The URI of the API, of the form {api-id}.execute-api.{region}.amazonaws.com. The stage name is typically appended to this URI to form a complete path to a deployed API stage.
         */
    var ApiEndpoint: js.UndefOr[__string] = js.undefined
    /**
         * The API ID.
         */
    var ApiId: js.UndefOr[Id] = js.undefined
    /**
         * An API key selection expression. See API Key Selection Expressions.
         */
    var ApiKeySelectionExpression: js.UndefOr[SelectionExpression] = js.undefined
    /**
         * The timestamp when the API was created.
         */
    var CreatedDate: js.UndefOr[__timestampIso8601] = js.undefined
    /**
         * The description of the API.
         */
    var Description: js.UndefOr[StringWithLengthBetween0And1024] = js.undefined
    /**
         * Avoid validating models when creating a deployment.
         */
    var DisableSchemaValidation: js.UndefOr[__boolean] = js.undefined
    /**
         * The name of the API.
         */
    var Name: js.UndefOr[StringWithLengthBetween1And128] = js.undefined
    /**
         * The API protocol: HTTP or WEBSOCKET.
         */
    var ProtocolType: js.UndefOr[ProtocolType] = js.undefined
    /**
         * The route selection expression for the API.
         */
    var RouteSelectionExpression: js.UndefOr[SelectionExpression] = js.undefined
    /**
         * A version identifier for the API.
         */
    var Version: js.UndefOr[StringWithLengthBetween1And64] = js.undefined
    /**
         * The warning messages reported when failonwarnings is turned on during API import.
         */
    var Warnings: js.UndefOr[__listOf__string] = js.undefined
  }
  
  
  trait UpdateAuthorizerRequest extends js.Object {
    /**
         * The API identifier.
         */
    var ApiId: __string
    /**
         * Specifies the required credentials as an IAM role for API Gateway to invoke the authorizer. To specify an IAM role for API Gateway to assume, use the role's Amazon Resource Name (ARN). To use resource-based permissions on the Lambda function, specify null.
         */
    var AuthorizerCredentialsArn: js.UndefOr[Arn] = js.undefined
    /**
         * The authorizer identifier.
         */
    var AuthorizerId: __string
    /**
         * The time to live (TTL), in seconds, of cached authorizer results. If it is zero, authorization caching is disabled. If it is greater than zero, API Gateway will cache authorizer responses. If this field is not set, the default value is 300. The maximum value is 3600, or 1 hour.
         */
    var AuthorizerResultTtlInSeconds: js.UndefOr[IntegerWithLengthBetween0And3600] = js.undefined
    /**
         * The authorizer type. Currently the only valid value is REQUEST, for a Lambda function using incoming request parameters.
         */
    var AuthorizerType: js.UndefOr[AuthorizerType] = js.undefined
    /**
         * The authorizer's Uniform Resource Identifier (URI). For REQUEST authorizers, this must be a well-formed Lambda function URI, for example, arn:aws:apigateway:us-west-2:lambda:path/2015-03-31/functions/arn:aws:lambda:us-west-2:{account_id}:function:{lambda_function_name}/invocations. In general, the URI has this form: arn:aws:apigateway:{region}:lambda:path/{service_api} , where {region} is the same as the region hosting the Lambda function, path indicates that the remaining substring in the URI should be treated as the path to the resource, including the initial /. For Lambda functions, this is usually of the form /2015-03-31/functions/[FunctionARN]/invocations.
         */
    var AuthorizerUri: js.UndefOr[UriWithLengthBetween1And2048] = js.undefined
    /**
         * The identity source for which authorization is requested.For the REQUEST authorizer, this is required when authorization caching is enabled. The value is a comma-separated string of one or more mapping expressions of the specified request parameters. For example, if an Auth header, a Name query string parameter are defined as identity sources, this value is $method.request.header.Auth, $method.request.querystring.Name. These parameters will be used to derive the authorization caching key and to perform runtime validation of the REQUEST authorizer by verifying all of the identity-related request parameters are present, not null and non-empty. Only when this is true does the authorizer invoke the authorizer Lambda function, otherwise, it returns a 401 Unauthorized response without calling the Lambda function. The valid value is a string of comma-separated mapping expressions of the specified request parameters. When the authorization caching is not enabled, this property is optional.
         */
    var IdentitySource: js.UndefOr[IdentitySourceList] = js.undefined
    /**
         * The validation expression does not apply to the REQUEST authorizer.
         */
    var IdentityValidationExpression: js.UndefOr[StringWithLengthBetween0And1024] = js.undefined
    /**
         * The name of the authorizer.
         */
    var Name: js.UndefOr[StringWithLengthBetween1And128] = js.undefined
    /**
         * For REQUEST authorizer, this is not defined.
         */
    var ProviderArns: js.UndefOr[ProviderArnList] = js.undefined
  }
  
  
  trait UpdateAuthorizerResponse extends js.Object {
    /**
         * Specifies the required credentials as an IAM role for API Gateway to invoke the authorizer. To specify an IAM role for API Gateway to assume, use the role's Amazon Resource Name (ARN). To use resource-based permissions on the Lambda function, specify null.
         */
    var AuthorizerCredentialsArn: js.UndefOr[Arn] = js.undefined
    /**
         * The authorizer identifier.
         */
    var AuthorizerId: js.UndefOr[Id] = js.undefined
    /**
         * The time to live (TTL), in seconds, of cached authorizer results. If it equals 0, authorization caching is disabled. If it is greater than 0, API Gateway will cache authorizer responses. If this field is not set, the default value is 300. The maximum value is 3600, or 1 hour.
         */
    var AuthorizerResultTtlInSeconds: js.UndefOr[IntegerWithLengthBetween0And3600] = js.undefined
    /**
         * The authorizer type. Currently the only valid value is REQUEST, for a Lambda function using incoming request parameters.
         */
    var AuthorizerType: js.UndefOr[AuthorizerType] = js.undefined
    /**
         * The authorizer's Uniform Resource Identifier (URI). ForREQUEST authorizers, this must be a well-formed Lambda function URI, for example, arn:aws:apigateway:us-west-2:lambda:path/2015-03-31/functions/arn:aws:lambda:us-west-2:{account_id}:function:{lambda_function_name}/invocations. In general, the URI has this form: arn:aws:apigateway:{region}:lambda:path/{service_api} , where {region} is the same as the region hosting the Lambda function, path indicates that the remaining substring in the URI should be treated as the path to the resource, including the initial /. For Lambda functions, this is usually of the form /2015-03-31/functions/[FunctionARN]/invocations.
         */
    var AuthorizerUri: js.UndefOr[UriWithLengthBetween1And2048] = js.undefined
    /**
         * The identity source for which authorization is requested.For the REQUEST authorizer, this is required when authorization caching is enabled. The value is a comma-separated string of one or more mapping expressions of the specified request parameters. For example, if an Auth header and a Name query string parameters are defined as identity sources, this value is method.request.header.Auth, method.request.querystring.Name. These parameters will be used to derive the authorization caching key and to perform runtime validation of the REQUEST authorizer by verifying all of the identity-related request parameters are present, not null, and non-empty. Only when this is true does the authorizer invoke the authorizer Lambda function, otherwise, it returns a 401 Unauthorized response without calling the Lambda function. The valid value is a string of comma-separated mapping expressions of the specified request parameters. When the authorization caching is not enabled, this property is optional.
         */
    var IdentitySource: js.UndefOr[IdentitySourceList] = js.undefined
    /**
         * The validation expression does not apply to the REQUEST authorizer.
         */
    var IdentityValidationExpression: js.UndefOr[StringWithLengthBetween0And1024] = js.undefined
    /**
         * The name of the authorizer.
         */
    var Name: js.UndefOr[StringWithLengthBetween1And128] = js.undefined
    /**
         * For REQUEST authorizer, this is not defined.
         */
    var ProviderArns: js.UndefOr[ProviderArnList] = js.undefined
  }
  
  
  trait UpdateDeploymentRequest extends js.Object {
    /**
         * The API identifier.
         */
    var ApiId: __string
    /**
         * The deployment ID.
         */
    var DeploymentId: __string
    /**
         * The description for the deployment resource.
         */
    var Description: js.UndefOr[StringWithLengthBetween0And1024] = js.undefined
  }
  
  
  trait UpdateDeploymentResponse extends js.Object {
    /**
         * The date and time when the Deployment resource was created.
         */
    var CreatedDate: js.UndefOr[__timestampIso8601] = js.undefined
    /**
         * The identifier for the deployment.
         */
    var DeploymentId: js.UndefOr[Id] = js.undefined
    /**
         * The status of the deployment: PENDING, FAILED, or SUCCEEDED.
         */
    var DeploymentStatus: js.UndefOr[DeploymentStatus] = js.undefined
    /**
         * May contain additional feedback on the status of an API deployment.
         */
    var DeploymentStatusMessage: js.UndefOr[__string] = js.undefined
    /**
         * The description for the deployment.
         */
    var Description: js.UndefOr[StringWithLengthBetween0And1024] = js.undefined
  }
  
  
  trait UpdateDomainNameRequest extends js.Object {
    /**
         * The domain name.
         */
    var DomainName: __string
    /**
         * The domain name configurations.
         */
    var DomainNameConfigurations: js.UndefOr[DomainNameConfigurations] = js.undefined
  }
  
  
  trait UpdateDomainNameResponse extends js.Object {
    /**
         * The API mapping selection expression.
         */
    var ApiMappingSelectionExpression: js.UndefOr[SelectionExpression] = js.undefined
    /**
         * The name of the DomainName resource.
         */
    var DomainName: js.UndefOr[StringWithLengthBetween1And512] = js.undefined
    /**
         * The domain name configurations.
         */
    var DomainNameConfigurations: js.UndefOr[DomainNameConfigurations] = js.undefined
  }
  
  
  trait UpdateIntegrationRequest extends js.Object {
    /**
         * The API identifier.
         */
    var ApiId: __string
    /**
         * The identifier of the VpcLink used for the integration when the connectionType is VPC_LINK; otherwise undefined.
         */
    var ConnectionId: js.UndefOr[StringWithLengthBetween1And1024] = js.undefined
    /**
         * The type of the network connection to the integration endpoint. The valid value is INTERNET for connections through the public routable internet or VPC_LINK for private connections between API Gateway and a network load balancer in a VPC. The default value is INTERNET.
         */
    var ConnectionType: js.UndefOr[ConnectionType] = js.undefined
    /**
         * Specifies how to handle response payload content type conversions. Supported values are CONVERT_TO_BINARY and CONVERT_TO_TEXT, with the following behaviors: CONVERT_TO_BINARY: Converts a response payload from a Base64-encoded string to the corresponding binary blob. CONVERT_TO_TEXT: Converts a response payload from a binary blob to a Base64-encoded string.If this property is not defined, the response payload will be passed through from the integration response to the route response or method response without modification.
         */
    var ContentHandlingStrategy: js.UndefOr[ContentHandlingStrategy] = js.undefined
    /**
         * Specifies the credentials required for the integration, if any. For AWS integrations, three options are available. To specify an IAM Role for API Gateway to assume, use the role's Amazon Resource Name (ARN). To require that the caller's identity be passed through from the request, specify the string arn:aws:iam::*:user/ *. To use resource-based permissions on supported AWS services, specify null.
         */
    var CredentialsArn: js.UndefOr[Arn] = js.undefined
    /**
         * The description of the integration
         */
    var Description: js.UndefOr[StringWithLengthBetween0And1024] = js.undefined
    /**
         * The integration ID.
         */
    var IntegrationId: __string
    /**
         * Specifies the integration's HTTP method type.
         */
    var IntegrationMethod: js.UndefOr[StringWithLengthBetween1And64] = js.undefined
    /**
         * The integration type of an integration. One of the following: AWS: for integrating the route or method request with an AWS service action, including the Lambda function-invoking action. With the Lambda function-invoking action, this is referred to as the Lambda custom integration. With any other AWS service action, this is known as AWS integration. AWS_PROXY: for integrating the route or method request with the Lambda function-invoking action with the client request passed through as-is. This integration is also referred to as Lambda proxy integration. HTTP: for integrating the route or method request with an HTTP endpoint, including a private HTTP endpoint within a VPC. This integration is also referred to as the HTTP custom integration. HTTP_PROXY: for integrating route or method request with an HTTP endpoint, including a private HTTP endpoint within a VPC, with the client request passed through as-is. This is also referred to as HTTP proxy integration. MOCK: for integrating the route or method request with API Gateway as a "loopback" endpoint without invoking any backend.
         */
    var IntegrationType: js.UndefOr[IntegrationType] = js.undefined
    /**
         * Specifies the Uniform Resource Identifier (URI) of the integration endpoint.For HTTP or HTTP_PROXY integrations, the URI must be a fully formed, encoded HTTP(S) URL according to the RFC-3986 specification, for either standard integration, where connectionType is not VPC_LINK, or private integration, where connectionType is VPC_LINK. For a private HTTP integration, the URI is not used for routing.For AWS or AWS_PROXY integrations, the URI is of the form arn:aws:apigateway:{region}:{subdomain.service|service}:path|action/{service_api}. Here, {Region} is the API Gateway region (e.g., us-east-1); {service} is the name of the integrated AWS service (e.g., s3); and {subdomain} is a designated subdomain supported by certain AWS service for fast host-name lookup. action can be used for an AWS service action-based API, using an Action={name}&{p1}={v1}&p2={v2}... query string. The ensuing {service_api} refers to a supported action {name} plus any required input parameters. Alternatively, path can be used for an AWS service path-based API. The ensuing service_api refers to the path to an AWS service resource, including the region of the integrated AWS service, if applicable. For example, for integration with the S3 API of GetObject, the URI can be either arn:aws:apigateway:us-west-2:s3:action/GetObject&Bucket={bucket}&Key={key} or arn:aws:apigateway:us-west-2:s3:path/{bucket}/{key}
         */
    var IntegrationUri: js.UndefOr[UriWithLengthBetween1And2048] = js.undefined
    /**
         * Specifies the pass-through behavior for incoming requests based on the Content-Type header in the request, and the available mapping templates specified as the requestTemplates property on the Integration resource. There are three valid values: WHEN_NO_MATCH, WHEN_NO_TEMPLATES, and NEVER. WHEN_NO_MATCH passes the request body for unmapped content types through to the integration backend without transformation. NEVER rejects unmapped content types with an HTTP 415 Unsupported Media Type response. WHEN_NO_TEMPLATES allows pass-through when the integration has no content types mapped to templates. However, if there is at least one content type defined, unmapped content types will be rejected with the same HTTP 415 Unsupported Media Type response.
         */
    var PassthroughBehavior: js.UndefOr[PassthroughBehavior] = js.undefined
    /**
         * A key-value map specifying request parameters that are passed from the method request to the backend. The key is an integration request parameter name and the associated value is a method request parameter value or static value that must be enclosed within single quotes and pre-encoded as required by the backend. The method request parameter value must match the pattern of method.request.{location}.{name} , where  {location}  is querystring, path, or header; and  {name}  must be a valid and unique method request parameter name.
         */
    var RequestParameters: js.UndefOr[IntegrationParameters] = js.undefined
    /**
         * Represents a map of Velocity templates that are applied on the request payload based on the value of the Content-Type header sent by the client. The content type value is the key in this map, and the template (as a String) is the value.
         */
    var RequestTemplates: js.UndefOr[TemplateMap] = js.undefined
    /**
         * The template selection expression for the integration.
         */
    var TemplateSelectionExpression: js.UndefOr[SelectionExpression] = js.undefined
    /**
         * Custom timeout between 50 and 29,000 milliseconds. The default value is 29,000 milliseconds or 29 seconds.
         */
    var TimeoutInMillis: js.UndefOr[IntegerWithLengthBetween50And29000] = js.undefined
  }
  
  
  trait UpdateIntegrationResponseRequest extends js.Object {
    /**
         * The API identifier.
         */
    var ApiId: __string
    /**
         * Specifies how to handle response payload content type conversions. Supported values are CONVERT_TO_BINARY and CONVERT_TO_TEXT, with the following behaviors: CONVERT_TO_BINARY: Converts a response payload from a Base64-encoded string to the corresponding binary blob. CONVERT_TO_TEXT: Converts a response payload from a binary blob to a Base64-encoded string.If this property is not defined, the response payload will be passed through from the integration response to the route response or method response without modification.
         */
    var ContentHandlingStrategy: js.UndefOr[ContentHandlingStrategy] = js.undefined
    /**
         * The integration ID.
         */
    var IntegrationId: __string
    /**
         * The integration response ID.
         */
    var IntegrationResponseId: __string
    /**
         * The integration response key.
         */
    var IntegrationResponseKey: js.UndefOr[SelectionKey] = js.undefined
    /**
         * A key-value map specifying response parameters that are passed to the method response from the backend. The key is a method response header parameter name and the mapped value is an integration response header value, a static value enclosed within a pair of single quotes, or a JSON expression from the integration response body. The mapping key must match the pattern of method.response.header.{name} , where name is a valid and unique header name. The mapped non-static value must match the pattern of integration.response.header.{name}  or integration.response.body.{JSON-expression} , where  {name}  is a valid and unique response header name and  {JSON-expression}  is a valid JSON expression without the $ prefix.
         */
    var ResponseParameters: js.UndefOr[IntegrationParameters] = js.undefined
    /**
         * The collection of response templates for the integration response as a string-to-string map of key-value pairs. Response templates are represented as a key/value map, with a content-type as the key and a template as the value.
         */
    var ResponseTemplates: js.UndefOr[TemplateMap] = js.undefined
    /**
         * The template selection expression for the integration response.
         */
    var TemplateSelectionExpression: js.UndefOr[SelectionExpression] = js.undefined
  }
  
  
  trait UpdateIntegrationResponseResponse extends js.Object {
    /**
         * Specifies how to handle response payload content type conversions. Supported values are CONVERT_TO_BINARY and CONVERT_TO_TEXT, with the following behaviors: CONVERT_TO_BINARY: Converts a response payload from a Base64-encoded string to the corresponding binary blob. CONVERT_TO_TEXT: Converts a response payload from a binary blob to a Base64-encoded string.If this property is not defined, the response payload will be passed through from the integration response to the route response or method response without modification.
         */
    var ContentHandlingStrategy: js.UndefOr[ContentHandlingStrategy] = js.undefined
    /**
         * The integration response ID.
         */
    var IntegrationResponseId: js.UndefOr[Id] = js.undefined
    /**
         * The integration response key.
         */
    var IntegrationResponseKey: js.UndefOr[SelectionKey] = js.undefined
    /**
         * A key-value map specifying response parameters that are passed to the method response from the backend. The key is a method response header parameter name and the mapped value is an integration response header value, a static value enclosed within a pair of single quotes, or a JSON expression from the integration response body. The mapping key must match the pattern of method.response.header.{name}, where name is a valid and unique header name. The mapped non-static value must match the pattern of integration.response.header.{name} or integration.response.body.{JSON-expression}, where name is a valid and unique response header name and JSON-expression is a valid JSON expression without the $ prefix.
         */
    var ResponseParameters: js.UndefOr[IntegrationParameters] = js.undefined
    /**
         * The collection of response templates for the integration response as a string-to-string map of key-value pairs. Response templates are represented as a key/value map, with a content-type as the key and a template as the value.
         */
    var ResponseTemplates: js.UndefOr[TemplateMap] = js.undefined
    /**
         * The template selection expressions for the integration response.
         */
    var TemplateSelectionExpression: js.UndefOr[SelectionExpression] = js.undefined
  }
  
  
  trait UpdateIntegrationResult extends js.Object {
    /**
         * The identifier of the VpcLink used for the integration when the connectionType is VPC_LINK; otherwise undefined.
         */
    var ConnectionId: js.UndefOr[StringWithLengthBetween1And1024] = js.undefined
    /**
         * The type of the network connection to the integration endpoint. The valid value is INTERNET for connections through the public routable internet or VPC_LINK for private connections between API Gateway and a network load balancer in a VPC. The default value is INTERNET.
         */
    var ConnectionType: js.UndefOr[ConnectionType] = js.undefined
    /**
         * Specifies how to handle response payload content type conversions. Supported values are CONVERT_TO_BINARY and CONVERT_TO_TEXT, with the following behaviors: CONVERT_TO_BINARY: Converts a response payload from a Base64-encoded string to the corresponding binary blob. CONVERT_TO_TEXT: Converts a response payload from a binary blob to a Base64-encoded string.If this property is not defined, the response payload will be passed through from the integration response to the route response or method response without modification.
         */
    var ContentHandlingStrategy: js.UndefOr[ContentHandlingStrategy] = js.undefined
    /**
         * Specifies the credentials required for the integration, if any. For AWS integrations, three options are available. To specify an IAM Role for API Gateway to assume, use the role's Amazon Resource Name (ARN). To require that the caller's identity be passed through from the request, specify the string arn:aws:iam::*:user/ *. To use resource-based permissions on supported AWS services, specify null.
         */
    var CredentialsArn: js.UndefOr[Arn] = js.undefined
    /**
         * Represents the description of an integration.
         */
    var Description: js.UndefOr[StringWithLengthBetween0And1024] = js.undefined
    /**
         * Represents the identifier of an integration.
         */
    var IntegrationId: js.UndefOr[Id] = js.undefined
    /**
         * Specifies the integration's HTTP method type.
         */
    var IntegrationMethod: js.UndefOr[StringWithLengthBetween1And64] = js.undefined
    var IntegrationResponseSelectionExpression: js.UndefOr[SelectionExpression] = js.undefined
    /**
         * The integration type of an integration. One of the following: AWS: for integrating the route or method request with an AWS service action, including the Lambda function-invoking action. With the Lambda function-invoking action, this is referred to as the Lambda custom integration. With any other AWS service action, this is known as AWS integration. AWS_PROXY: for integrating the route or method request with the Lambda function-invoking action with the client request passed through as-is. This integration is also referred to as Lambda proxy integration. HTTP: for integrating the route or method request with an HTTP endpoint, including a private HTTP endpoint within a VPC. This integration is also referred to as the HTTP custom integration. HTTP_PROXY: for integrating route or method request with an HTTP endpoint, including a private HTTP endpoint within a VPC, with the client request passed through as-is. This is also referred to as HTTP proxy integration. MOCK: for integrating the route or method request with API Gateway as a "loopback" endpoint without invoking any backend.
         */
    var IntegrationType: js.UndefOr[IntegrationType] = js.undefined
    /**
         * Specifies the Uniform Resource Identifier (URI) of the integration endpoint.For HTTP or HTTP_PROXY integrations, the URI must be a fully formed, encoded HTTP(S) URL according to the RFC-3986 specification, for either standard integration, where connectionType is not VPC_LINK, or private integration, where connectionType is VPC_LINK. For a private HTTP integration, the URI is not used for routing.For AWS or AWS_PROXY integrations, the URI is of the form arn:aws:apigateway:{region}:{subdomain.service|service}:path|action/{service_api}. Here, {Region} is the API Gateway region (e.g., us-east-1); {service} is the name of the integrated AWS service (e.g., s3); and {subdomain} is a designated subdomain supported by certain AWS service for fast host-name lookup. action can be used for an AWS service action-based API, using an Action={name}&{p1}={v1}&p2={v2}... query string. The ensuing {service_api} refers to a supported action {name} plus any required input parameters. Alternatively, path can be used for an AWS service path-based API. The ensuing service_api refers to the path to an AWS service resource, including the region of the integrated AWS service, if applicable. For example, for integration with the S3 API of GetObject, the URI can be either arn:aws:apigateway:us-west-2:s3:action/GetObject&Bucket={bucket}&Key={key} or arn:aws:apigateway:us-west-2:s3:path/{bucket}/{key}
         */
    var IntegrationUri: js.UndefOr[UriWithLengthBetween1And2048] = js.undefined
    /**
         * Specifies the pass-through behavior for incoming requests based on the Content-Type header in the request, and the available mapping templates specified as the requestTemplates property on the Integration resource. There are three valid values: WHEN_NO_MATCH, WHEN_NO_TEMPLATES, and NEVER. WHEN_NO_MATCH passes the request body for unmapped content types through to the integration backend without transformation. NEVER rejects unmapped content types with an HTTP 415 Unsupported Media Type response. WHEN_NO_TEMPLATES allows pass-through when the integration has no content types mapped to templates. However, if there is at least one content type defined, unmapped content types will be rejected with the same HTTP 415 Unsupported Media Type response.
         */
    var PassthroughBehavior: js.UndefOr[PassthroughBehavior] = js.undefined
    /**
         * A key-value map specifying request parameters that are passed from the method request to the backend. The key is an integration request parameter name and the associated value is a method request parameter value or static value that must be enclosed within single quotes and pre-encoded as required by the backend. The method request parameter value must match the pattern of method.request.{location}.{name} , where  {location}  is querystring, path, or header; and  {name}  must be a valid and unique method request parameter name.
         */
    var RequestParameters: js.UndefOr[IntegrationParameters] = js.undefined
    /**
         * Represents a map of Velocity templates that are applied on the request payload based on the value of the Content-Type header sent by the client. The content type value is the key in this map, and the template (as a String) is the value.
         */
    var RequestTemplates: js.UndefOr[TemplateMap] = js.undefined
    /**
         * The template selection expression for the integration.
         */
    var TemplateSelectionExpression: js.UndefOr[SelectionExpression] = js.undefined
    /**
         * Custom timeout between 50 and 29,000 milliseconds. The default value is 29,000 milliseconds or 29 seconds.
         */
    var TimeoutInMillis: js.UndefOr[IntegerWithLengthBetween50And29000] = js.undefined
  }
  
  
  trait UpdateModelRequest extends js.Object {
    /**
         * The API identifier.
         */
    var ApiId: __string
    /**
         * The content-type for the model, for example, "application/json".
         */
    var ContentType: js.UndefOr[StringWithLengthBetween1And256] = js.undefined
    /**
         * The description of the model.
         */
    var Description: js.UndefOr[StringWithLengthBetween0And1024] = js.undefined
    /**
         * The model ID.
         */
    var ModelId: __string
    /**
         * The name of the model.
         */
    var Name: js.UndefOr[StringWithLengthBetween1And128] = js.undefined
    /**
         * The schema for the model. For application/json models, this should be JSON schema draft 4 model.
         */
    var Schema: js.UndefOr[StringWithLengthBetween0And32K] = js.undefined
  }
  
  
  trait UpdateModelResponse extends js.Object {
    /**
         * The content-type for the model, for example, "application/json".
         */
    var ContentType: js.UndefOr[StringWithLengthBetween1And256] = js.undefined
    /**
         * The description of the model.
         */
    var Description: js.UndefOr[StringWithLengthBetween0And1024] = js.undefined
    /**
         * The model identifier.
         */
    var ModelId: js.UndefOr[Id] = js.undefined
    /**
         * The name of the model. Must be alphanumeric.
         */
    var Name: js.UndefOr[StringWithLengthBetween1And128] = js.undefined
    /**
         * The schema for the model. For application/json models, this should be JSON schema draft 4 model.
         */
    var Schema: js.UndefOr[StringWithLengthBetween0And32K] = js.undefined
  }
  
  
  trait UpdateRouteRequest extends js.Object {
    /**
         * The API identifier.
         */
    var ApiId: __string
    /**
         * Specifies whether an API key is required for the route.
         */
    var ApiKeyRequired: js.UndefOr[__boolean] = js.undefined
    /**
         * The authorization scopes supported by this route.
         */
    var AuthorizationScopes: js.UndefOr[AuthorizationScopes] = js.undefined
    /**
         * The authorization type for the route. Valid values are NONE for open access, AWS_IAM for using AWS IAM permissions.
         */
    var AuthorizationType: js.UndefOr[AuthorizationType] = js.undefined
    /**
         * The identifier of the Authorizer resource to be associated with this route.
         */
    var AuthorizerId: js.UndefOr[Id] = js.undefined
    /**
         * The model selection expression for the route.
         */
    var ModelSelectionExpression: js.UndefOr[SelectionExpression] = js.undefined
    /**
         * The operation name for the route.
         */
    var OperationName: js.UndefOr[StringWithLengthBetween1And64] = js.undefined
    /**
         * The request models for the route.
         */
    var RequestModels: js.UndefOr[RouteModels] = js.undefined
    /**
         * The request parameters for the route.
         */
    var RequestParameters: js.UndefOr[RouteParameters] = js.undefined
    /**
         * The route ID.
         */
    var RouteId: __string
    /**
         * The route key for the route.
         */
    var RouteKey: js.UndefOr[SelectionKey] = js.undefined
    /**
         * The route response selection expression for the route.
         */
    var RouteResponseSelectionExpression: js.UndefOr[SelectionExpression] = js.undefined
    /**
         * The target for the route.
         */
    var Target: js.UndefOr[StringWithLengthBetween1And128] = js.undefined
  }
  
  
  trait UpdateRouteResponseRequest extends js.Object {
    /**
         * The API identifier.
         */
    var ApiId: __string
    /**
         * The model selection expression for the route response.
         */
    var ModelSelectionExpression: js.UndefOr[SelectionExpression] = js.undefined
    /**
         * The response models for the route response.
         */
    var ResponseModels: js.UndefOr[RouteModels] = js.undefined
    /**
         * The route response parameters.
         */
    var ResponseParameters: js.UndefOr[RouteParameters] = js.undefined
    /**
         * The route ID.
         */
    var RouteId: __string
    /**
         * The route response ID.
         */
    var RouteResponseId: __string
    /**
         * The route response key.
         */
    var RouteResponseKey: js.UndefOr[SelectionKey] = js.undefined
  }
  
  
  trait UpdateRouteResponseResponse extends js.Object {
    /**
         * Represents the model selection expression of a route response.
         */
    var ModelSelectionExpression: js.UndefOr[SelectionExpression] = js.undefined
    /**
         * Represents the response models of a route response.
         */
    var ResponseModels: js.UndefOr[RouteModels] = js.undefined
    /**
         * Represents the response parameters of a route response.
         */
    var ResponseParameters: js.UndefOr[RouteParameters] = js.undefined
    /**
         * Represents the identifier of a route response.
         */
    var RouteResponseId: js.UndefOr[Id] = js.undefined
    /**
         * Represents the route response key of a route response.
         */
    var RouteResponseKey: js.UndefOr[SelectionKey] = js.undefined
  }
  
  
  trait UpdateRouteResult extends js.Object {
    /**
         * Specifies whether an API key is required for this route.
         */
    var ApiKeyRequired: js.UndefOr[__boolean] = js.undefined
    /**
         * The authorization scopes supported by this route. 
         */
    var AuthorizationScopes: js.UndefOr[AuthorizationScopes] = js.undefined
    /**
         * The authorization type for the route. Valid values are NONE for open access, AWS_IAM for using AWS IAM permissions.
         */
    var AuthorizationType: js.UndefOr[AuthorizationType] = js.undefined
    /**
         * The identifier of the Authorizer resource to be associated with this route.
         */
    var AuthorizerId: js.UndefOr[Id] = js.undefined
    /**
         * The model selection expression for the route.
         */
    var ModelSelectionExpression: js.UndefOr[SelectionExpression] = js.undefined
    /**
         * The operation name for the route.
         */
    var OperationName: js.UndefOr[StringWithLengthBetween1And64] = js.undefined
    /**
         * The request models for the route.
         */
    var RequestModels: js.UndefOr[RouteModels] = js.undefined
    /**
         * The request parameters for the route.
         */
    var RequestParameters: js.UndefOr[RouteParameters] = js.undefined
    /**
         * The route ID.
         */
    var RouteId: js.UndefOr[Id] = js.undefined
    /**
         * The route key for the route.
         */
    var RouteKey: js.UndefOr[SelectionKey] = js.undefined
    /**
         * The route response selection expression for the route.
         */
    var RouteResponseSelectionExpression: js.UndefOr[SelectionExpression] = js.undefined
    /**
         * The target for the route.
         */
    var Target: js.UndefOr[StringWithLengthBetween1And128] = js.undefined
  }
  
  
  trait UpdateStageRequest extends js.Object {
    /**
         * Settings for logging access in this stage.
         */
    var AccessLogSettings: js.UndefOr[AccessLogSettings] = js.undefined
    /**
         * The API identifier.
         */
    var ApiId: __string
    /**
         * The identifier of a client certificate for a Stage.
         */
    var ClientCertificateId: js.UndefOr[Id] = js.undefined
    /**
         * The default route settings for the stage.
         */
    var DefaultRouteSettings: js.UndefOr[RouteSettings] = js.undefined
    /**
         * The deployment identifier for the API stage.
         */
    var DeploymentId: js.UndefOr[Id] = js.undefined
    /**
         * The description for the API stage.
         */
    var Description: js.UndefOr[StringWithLengthBetween0And1024] = js.undefined
    /**
         * Route settings for the stage.
         */
    var RouteSettings: js.UndefOr[RouteSettingsMap] = js.undefined
    /**
         * The stage name.
         */
    var StageName: __string
    /**
         * A map that defines the stage variables for a Stage. Variable names can have alphanumeric and underscore characters, and the values must match [A-Za-z0-9-._~:/?#&=,]+.
         */
    var StageVariables: js.UndefOr[StageVariablesMap] = js.undefined
  }
  
  
  trait UpdateStageResponse extends js.Object {
    /**
         * Settings for logging access in this stage.
         */
    var AccessLogSettings: js.UndefOr[AccessLogSettings] = js.undefined
    /**
         * The identifier of a client certificate for a Stage.
         */
    var ClientCertificateId: js.UndefOr[Id] = js.undefined
    /**
         * The timestamp when the stage was created.
         */
    var CreatedDate: js.UndefOr[__timestampIso8601] = js.undefined
    /**
         * Default route settings for the stage.
         */
    var DefaultRouteSettings: js.UndefOr[RouteSettings] = js.undefined
    /**
         * The identifier of the Deployment that the Stage is associated with.
         */
    var DeploymentId: js.UndefOr[Id] = js.undefined
    /**
         * The description of the stage.
         */
    var Description: js.UndefOr[StringWithLengthBetween0And1024] = js.undefined
    /**
         * The timestamp when the stage was last updated.
         */
    var LastUpdatedDate: js.UndefOr[__timestampIso8601] = js.undefined
    /**
         * Route settings for the stage.
         */
    var RouteSettings: js.UndefOr[RouteSettingsMap] = js.undefined
    /**
         * The name of the stage.
         */
    var StageName: js.UndefOr[StringWithLengthBetween1And128] = js.undefined
    /**
         * A map that defines the stage variables for a stage resource. Variable names can have alphanumeric and underscore characters, and the values must match [A-Za-z0-9-._~:/?#&=,]+.
         */
    var StageVariables: js.UndefOr[StageVariablesMap] = js.undefined
  }
  
  val TypesNs: this.type = js.native
  type Arn = java.lang.String
  type AuthorizationScopes = js.Array[StringWithLengthBetween1And64]
  type AuthorizationType = awsDashSdkLib.awsDashSdkLibStrings.NONE | awsDashSdkLib.awsDashSdkLibStrings.AWS_IAM | awsDashSdkLib.awsDashSdkLibStrings.CUSTOM | java.lang.String
  type AuthorizerType = awsDashSdkLib.awsDashSdkLibStrings.REQUEST | java.lang.String
  type ClientConfiguration = awsDashSdkLib.libServiceMod.ServiceConfigurationOptions with ClientApiVersions
  type ConnectionType = awsDashSdkLib.awsDashSdkLibStrings.INTERNET | awsDashSdkLib.awsDashSdkLibStrings.VPC_LINK | java.lang.String
  type ContentHandlingStrategy = awsDashSdkLib.awsDashSdkLibStrings.CONVERT_TO_BINARY | awsDashSdkLib.awsDashSdkLibStrings.CONVERT_TO_TEXT | java.lang.String
  type DeploymentStatus = awsDashSdkLib.awsDashSdkLibStrings.PENDING | awsDashSdkLib.awsDashSdkLibStrings.FAILED | awsDashSdkLib.awsDashSdkLibStrings.DEPLOYED | java.lang.String
  type DomainNameConfigurations = js.Array[DomainNameConfiguration]
  type EndpointType = awsDashSdkLib.awsDashSdkLibStrings.REGIONAL | awsDashSdkLib.awsDashSdkLibStrings.EDGE | java.lang.String
  type Id = java.lang.String
  type IdentitySourceList = js.Array[__string]
  type IntegerWithLengthBetween0And3600 = scala.Double
  type IntegerWithLengthBetween50And29000 = scala.Double
  type IntegrationType = awsDashSdkLib.awsDashSdkLibStrings.AWS | awsDashSdkLib.awsDashSdkLibStrings.HTTP | awsDashSdkLib.awsDashSdkLibStrings.MOCK | awsDashSdkLib.awsDashSdkLibStrings.HTTP_PROXY | awsDashSdkLib.awsDashSdkLibStrings.AWS_PROXY | java.lang.String
  type LoggingLevel = awsDashSdkLib.awsDashSdkLibStrings.ERROR | awsDashSdkLib.awsDashSdkLibStrings.INFO | awsDashSdkLib.awsDashSdkLibStrings.`false` | java.lang.String
  type NextToken = java.lang.String
  type PassthroughBehavior = awsDashSdkLib.awsDashSdkLibStrings.WHEN_NO_MATCH | awsDashSdkLib.awsDashSdkLibStrings.NEVER | awsDashSdkLib.awsDashSdkLibStrings.WHEN_NO_TEMPLATES | java.lang.String
  type ProtocolType = awsDashSdkLib.awsDashSdkLibStrings.WEBSOCKET | java.lang.String
  type ProviderArnList = js.Array[Arn]
  type SelectionExpression = java.lang.String
  type SelectionKey = java.lang.String
  type StringWithLengthBetween0And1024 = java.lang.String
  type StringWithLengthBetween0And2048 = java.lang.String
  type StringWithLengthBetween0And32K = java.lang.String
  type StringWithLengthBetween1And1024 = java.lang.String
  type StringWithLengthBetween1And128 = java.lang.String
  type StringWithLengthBetween1And256 = java.lang.String
  type StringWithLengthBetween1And512 = java.lang.String
  type StringWithLengthBetween1And64 = java.lang.String
  type UriWithLengthBetween1And2048 = java.lang.String
  type __boolean = scala.Boolean
  type __double = scala.Double
  type __integer = scala.Double
  type __listOfApi = js.Array[Api]
  type __listOfAuthorizer = js.Array[Authorizer]
  type __listOfDeployment = js.Array[Deployment]
  type __listOfDomainName = js.Array[DomainName]
  type __listOfIntegration = js.Array[Integration]
  type __listOfIntegrationResponse = js.Array[IntegrationResponse]
  type __listOfModel = js.Array[Model]
  type __listOfRoute = js.Array[Route]
  type __listOfRouteResponse = js.Array[RouteResponse]
  type __listOfStage = js.Array[Stage]
  type __listOf__string = js.Array[__string]
  type __string = java.lang.String
  type __timestampIso8601 = stdLib.Date
  type apiVersion = awsDashSdkLib.awsDashSdkLibStrings.`2018-11-29` | awsDashSdkLib.awsDashSdkLibStrings.latest | java.lang.String
}

