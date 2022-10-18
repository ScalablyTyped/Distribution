package typings.awsSdk.clientsApigatewayv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetAuthorizerResponse extends StObject {
  
  /**
    * Specifies the required credentials as an IAM role for API Gateway to invoke the authorizer. To specify an IAM role for API Gateway to assume, use the role's Amazon Resource Name (ARN). To use resource-based permissions on the Lambda function, don't specify this parameter. Supported only for REQUEST authorizers.
    */
  var AuthorizerCredentialsArn: js.UndefOr[Arn] = js.undefined
  
  /**
    * The authorizer identifier.
    */
  var AuthorizerId: js.UndefOr[Id] = js.undefined
  
  /**
    * Specifies the format of the payload sent to an HTTP API Lambda authorizer. Required for HTTP API Lambda authorizers. Supported values are 1.0 and 2.0. To learn more, see Working with AWS Lambda authorizers for HTTP APIs.
    */
  var AuthorizerPayloadFormatVersion: js.UndefOr[StringWithLengthBetween1And64] = js.undefined
  
  /**
    * The time to live (TTL) for cached authorizer results, in seconds. If it equals 0, authorization caching is disabled. If it is greater than 0, API Gateway caches authorizer responses. The maximum value is 3600, or 1 hour. Supported only for HTTP API Lambda authorizers.
    */
  var AuthorizerResultTtlInSeconds: js.UndefOr[IntegerWithLengthBetween0And3600] = js.undefined
  
  /**
    * The authorizer type. Specify REQUEST for a Lambda function using incoming request parameters. Specify JWT to use JSON Web Tokens (supported only for HTTP APIs).
    */
  var AuthorizerType: js.UndefOr[typings.awsSdk.clientsApigatewayv2Mod.AuthorizerType] = js.undefined
  
  /**
    * The authorizer's Uniform Resource Identifier (URI). For REQUEST authorizers, this must be a well-formed Lambda function URI, for example, arn:aws:apigateway:us-west-2:lambda:path/2015-03-31/functions/arn:aws:lambda:us-west-2:{account_id}:function:{lambda_function_name}/invocations. In general, the URI has this form: arn:aws:apigateway:{region}:lambda:path/{service_api}
    , where {region} is the same as the region hosting the Lambda function, path indicates that the remaining substring in the URI should be treated as the path to the resource, including the initial /. For Lambda functions, this is usually of the form /2015-03-31/functions/[FunctionARN]/invocations. Supported only for REQUEST authorizers.
    */
  var AuthorizerUri: js.UndefOr[UriWithLengthBetween1And2048] = js.undefined
  
  /**
    * Specifies whether a Lambda authorizer returns a response in a simple format. If enabled, the Lambda authorizer can return a boolean value instead of an IAM policy. Supported only for HTTP APIs. To learn more, see Working with AWS Lambda authorizers for HTTP APIs
    */
  var EnableSimpleResponses: js.UndefOr[boolean] = js.undefined
  
  /**
    * The identity source for which authorization is requested. For a REQUEST authorizer, this is optional. The value is a set of one or more mapping expressions of the specified request parameters. The identity source can be headers, query string parameters, stage variables, and context parameters. For example, if an Auth header and a Name query string parameter are defined as identity sources, this value is route.request.header.Auth, route.request.querystring.Name for WebSocket APIs. For HTTP APIs, use selection expressions prefixed with $, for example, $request.header.Auth, $request.querystring.Name. These parameters are used to perform runtime validation for Lambda-based authorizers by verifying all of the identity-related request parameters are present in the request, not null, and non-empty. Only when this is true does the authorizer invoke the authorizer Lambda function. Otherwise, it returns a 401 Unauthorized response without calling the Lambda function. For HTTP APIs, identity sources are also used as the cache key when caching is enabled. To learn more, see Working with AWS Lambda authorizers for HTTP APIs. For JWT, a single entry that specifies where to extract the JSON Web Token (JWT) from inbound requests. Currently only header-based and query parameter-based selections are supported, for example $request.header.Authorization.
    */
  var IdentitySource: js.UndefOr[IdentitySourceList] = js.undefined
  
  /**
    * The validation expression does not apply to the REQUEST authorizer.
    */
  var IdentityValidationExpression: js.UndefOr[StringWithLengthBetween0And1024] = js.undefined
  
  /**
    * Represents the configuration of a JWT authorizer. Required for the JWT authorizer type. Supported only for HTTP APIs.
    */
  var JwtConfiguration: js.UndefOr[JWTConfiguration] = js.undefined
  
  /**
    * The name of the authorizer.
    */
  var Name: js.UndefOr[StringWithLengthBetween1And128] = js.undefined
}
object GetAuthorizerResponse {
  
  inline def apply(): GetAuthorizerResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetAuthorizerResponse]
  }
  
  extension [Self <: GetAuthorizerResponse](x: Self) {
    
    inline def setAuthorizerCredentialsArn(value: Arn): Self = StObject.set(x, "AuthorizerCredentialsArn", value.asInstanceOf[js.Any])
    
    inline def setAuthorizerCredentialsArnUndefined: Self = StObject.set(x, "AuthorizerCredentialsArn", js.undefined)
    
    inline def setAuthorizerId(value: Id): Self = StObject.set(x, "AuthorizerId", value.asInstanceOf[js.Any])
    
    inline def setAuthorizerIdUndefined: Self = StObject.set(x, "AuthorizerId", js.undefined)
    
    inline def setAuthorizerPayloadFormatVersion(value: StringWithLengthBetween1And64): Self = StObject.set(x, "AuthorizerPayloadFormatVersion", value.asInstanceOf[js.Any])
    
    inline def setAuthorizerPayloadFormatVersionUndefined: Self = StObject.set(x, "AuthorizerPayloadFormatVersion", js.undefined)
    
    inline def setAuthorizerResultTtlInSeconds(value: IntegerWithLengthBetween0And3600): Self = StObject.set(x, "AuthorizerResultTtlInSeconds", value.asInstanceOf[js.Any])
    
    inline def setAuthorizerResultTtlInSecondsUndefined: Self = StObject.set(x, "AuthorizerResultTtlInSeconds", js.undefined)
    
    inline def setAuthorizerType(value: AuthorizerType): Self = StObject.set(x, "AuthorizerType", value.asInstanceOf[js.Any])
    
    inline def setAuthorizerTypeUndefined: Self = StObject.set(x, "AuthorizerType", js.undefined)
    
    inline def setAuthorizerUri(value: UriWithLengthBetween1And2048): Self = StObject.set(x, "AuthorizerUri", value.asInstanceOf[js.Any])
    
    inline def setAuthorizerUriUndefined: Self = StObject.set(x, "AuthorizerUri", js.undefined)
    
    inline def setEnableSimpleResponses(value: boolean): Self = StObject.set(x, "EnableSimpleResponses", value.asInstanceOf[js.Any])
    
    inline def setEnableSimpleResponsesUndefined: Self = StObject.set(x, "EnableSimpleResponses", js.undefined)
    
    inline def setIdentitySource(value: IdentitySourceList): Self = StObject.set(x, "IdentitySource", value.asInstanceOf[js.Any])
    
    inline def setIdentitySourceUndefined: Self = StObject.set(x, "IdentitySource", js.undefined)
    
    inline def setIdentitySourceVarargs(value: string*): Self = StObject.set(x, "IdentitySource", js.Array(value*))
    
    inline def setIdentityValidationExpression(value: StringWithLengthBetween0And1024): Self = StObject.set(x, "IdentityValidationExpression", value.asInstanceOf[js.Any])
    
    inline def setIdentityValidationExpressionUndefined: Self = StObject.set(x, "IdentityValidationExpression", js.undefined)
    
    inline def setJwtConfiguration(value: JWTConfiguration): Self = StObject.set(x, "JwtConfiguration", value.asInstanceOf[js.Any])
    
    inline def setJwtConfigurationUndefined: Self = StObject.set(x, "JwtConfiguration", js.undefined)
    
    inline def setName(value: StringWithLengthBetween1And128): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
  }
}
