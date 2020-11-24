package typings.awsSdk.apigatewayv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetAuthorizerResponse extends js.Object {
  
  /**
    * Specifies the required credentials as an IAM role for API Gateway to invoke the authorizer. To specify an IAM role for API Gateway to assume, use the role's Amazon Resource Name (ARN). To use resource-based permissions on the Lambda function, don't specify this parameter. Supported only for REQUEST authorizers.
    */
  var AuthorizerCredentialsArn: js.UndefOr[Arn] = js.native
  
  /**
    * The authorizer identifier.
    */
  var AuthorizerId: js.UndefOr[Id] = js.native
  
  /**
    * Specifies the format of the payload sent to an HTTP API Lambda authorizer. Required for HTTP API Lambda authorizers. Supported values are 1.0 and 2.0. To learn more, see Working with AWS Lambda authorizers for HTTP APIs.
    */
  var AuthorizerPayloadFormatVersion: js.UndefOr[StringWithLengthBetween1And64] = js.native
  
  /**
    * The time to live (TTL) for cached authorizer results, in seconds. If it equals 0, authorization caching is disabled. If it is greater than 0, API Gateway caches authorizer responses. The maximum value is 3600, or 1 hour. Supported only for HTTP API Lambda authorizers.
    */
  var AuthorizerResultTtlInSeconds: js.UndefOr[IntegerWithLengthBetween0And3600] = js.native
  
  /**
    * The authorizer type. Specify REQUEST for a Lambda function using incoming request parameters. Specify JWT to use JSON Web Tokens (supported only for HTTP APIs).
    */
  var AuthorizerType: js.UndefOr[typings.awsSdk.apigatewayv2Mod.AuthorizerType] = js.native
  
  /**
    * The authorizer's Uniform Resource Identifier (URI). For REQUEST authorizers, this must be a well-formed Lambda function URI, for example, arn:aws:apigateway:us-west-2:lambda:path/2015-03-31/functions/arn:aws:lambda:us-west-2:{account_id}:function:{lambda_function_name}/invocations. In general, the URI has this form: arn:aws:apigateway:{region}:lambda:path/{service_api}
    , where {region} is the same as the region hosting the Lambda function, path indicates that the remaining substring in the URI should be treated as the path to the resource, including the initial /. For Lambda functions, this is usually of the form /2015-03-31/functions/[FunctionARN]/invocations. Supported only for REQUEST authorizers.
    */
  var AuthorizerUri: js.UndefOr[UriWithLengthBetween1And2048] = js.native
  
  /**
    * Specifies whether a Lambda authorizer returns a response in a simple format. If enabled, the Lambda authorizer can return a boolean value instead of an IAM policy. Supported only for HTTP APIs. To learn more, see Working with AWS Lambda authorizers for HTTP APIs
    */
  var EnableSimpleResponses: js.UndefOr[boolean] = js.native
  
  /**
    * The identity source for which authorization is requested. For a REQUEST authorizer, this is optional. The value is a set of one or more mapping expressions of the specified request parameters. The identity source can be headers, query string parameters, stage variables, and context parameters. For example, if an Auth header and a Name query string parameter are defined as identity sources, this value is route.request.header.Auth, route.request.querystring.Name for WebSocket APIs. For HTTP APIs, use selection expressions prefixed with $, for example, $request.header.Auth, $request.querystring.Name. These parameters are used to perform runtime validation for Lambda-based authorizers by verifying all of the identity-related request parameters are present in the request, not null, and non-empty. Only when this is true does the authorizer invoke the authorizer Lambda function. Otherwise, it returns a 401 Unauthorized response without calling the Lambda function. For HTTP APIs, identity sources are also used as the cache key when caching is enabled. To learn more, see Working with AWS Lambda authorizers for HTTP APIs. For JWT, a single entry that specifies where to extract the JSON Web Token (JWT) from inbound requests. Currently only header-based and query parameter-based selections are supported, for example $request.header.Authorization.
    */
  var IdentitySource: js.UndefOr[IdentitySourceList] = js.native
  
  /**
    * The validation expression does not apply to the REQUEST authorizer.
    */
  var IdentityValidationExpression: js.UndefOr[StringWithLengthBetween0And1024] = js.native
  
  /**
    * Represents the configuration of a JWT authorizer. Required for the JWT authorizer type. Supported only for HTTP APIs.
    */
  var JwtConfiguration: js.UndefOr[JWTConfiguration] = js.native
  
  /**
    * The name of the authorizer.
    */
  var Name: js.UndefOr[StringWithLengthBetween1And128] = js.native
}
object GetAuthorizerResponse {
  
  @scala.inline
  def apply(): GetAuthorizerResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetAuthorizerResponse]
  }
  
  @scala.inline
  implicit class GetAuthorizerResponseOps[Self <: GetAuthorizerResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAuthorizerCredentialsArn(value: Arn): Self = this.set("AuthorizerCredentialsArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAuthorizerCredentialsArn: Self = this.set("AuthorizerCredentialsArn", js.undefined)
    
    @scala.inline
    def setAuthorizerId(value: Id): Self = this.set("AuthorizerId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAuthorizerId: Self = this.set("AuthorizerId", js.undefined)
    
    @scala.inline
    def setAuthorizerPayloadFormatVersion(value: StringWithLengthBetween1And64): Self = this.set("AuthorizerPayloadFormatVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAuthorizerPayloadFormatVersion: Self = this.set("AuthorizerPayloadFormatVersion", js.undefined)
    
    @scala.inline
    def setAuthorizerResultTtlInSeconds(value: IntegerWithLengthBetween0And3600): Self = this.set("AuthorizerResultTtlInSeconds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAuthorizerResultTtlInSeconds: Self = this.set("AuthorizerResultTtlInSeconds", js.undefined)
    
    @scala.inline
    def setAuthorizerType(value: AuthorizerType): Self = this.set("AuthorizerType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAuthorizerType: Self = this.set("AuthorizerType", js.undefined)
    
    @scala.inline
    def setAuthorizerUri(value: UriWithLengthBetween1And2048): Self = this.set("AuthorizerUri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAuthorizerUri: Self = this.set("AuthorizerUri", js.undefined)
    
    @scala.inline
    def setEnableSimpleResponses(value: boolean): Self = this.set("EnableSimpleResponses", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableSimpleResponses: Self = this.set("EnableSimpleResponses", js.undefined)
    
    @scala.inline
    def setIdentitySourceVarargs(value: string*): Self = this.set("IdentitySource", js.Array(value :_*))
    
    @scala.inline
    def setIdentitySource(value: IdentitySourceList): Self = this.set("IdentitySource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIdentitySource: Self = this.set("IdentitySource", js.undefined)
    
    @scala.inline
    def setIdentityValidationExpression(value: StringWithLengthBetween0And1024): Self = this.set("IdentityValidationExpression", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIdentityValidationExpression: Self = this.set("IdentityValidationExpression", js.undefined)
    
    @scala.inline
    def setJwtConfiguration(value: JWTConfiguration): Self = this.set("JwtConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteJwtConfiguration: Self = this.set("JwtConfiguration", js.undefined)
    
    @scala.inline
    def setName(value: StringWithLengthBetween1And128): Self = this.set("Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("Name", js.undefined)
  }
}
