package typings.awsSdk.apigatewayv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateAuthorizerRequest extends js.Object {
  /**
    * The API identifier.
    */
  var ApiId: string = js.native
  /**
    * Specifies the required credentials as an IAM role for API Gateway to invoke the authorizer. To specify an IAM role for API Gateway to assume, use the role's Amazon Resource Name (ARN). To use resource-based permissions on the Lambda function, specify null. Supported only for REQUEST authorizers.
    */
  var AuthorizerCredentialsArn: js.UndefOr[Arn] = js.native
  /**
    * Authorizer caching is not currently supported. Don't specify this value for authorizers.
    */
  var AuthorizerResultTtlInSeconds: js.UndefOr[IntegerWithLengthBetween0And3600] = js.native
  /**
    * The authorizer type. For WebSocket APIs, specify REQUEST for a Lambda function using incoming request parameters. For HTTP APIs, specify JWT to use JSON Web Tokens.
    */
  var AuthorizerType: typings.awsSdk.apigatewayv2Mod.AuthorizerType = js.native
  /**
    * The authorizer's Uniform Resource Identifier (URI). For REQUEST authorizers, this must be a well-formed Lambda function URI, for example, arn:aws:apigateway:us-west-2:lambda:path/2015-03-31/functions/arn:aws:lambda:us-west-2:{account_id}:function:{lambda_function_name}/invocations. In general, the URI has this form: arn:aws:apigateway:{region}:lambda:path/{service_api}
    , where {region} is the same as the region hosting the Lambda function, path indicates that the remaining substring in the URI should be treated as the path to the resource, including the initial /. For Lambda functions, this is usually of the form /2015-03-31/functions/[FunctionARN]/invocations. Supported only for REQUEST authorizers.
    */
  var AuthorizerUri: js.UndefOr[UriWithLengthBetween1And2048] = js.native
  /**
    * The identity source for which authorization is requested. For a REQUEST authorizer, this is optional. The value is a set of one or more mapping expressions of the specified request parameters. Currently, the identity source can be headers, query string parameters, stage variables, and context parameters. For example, if an Auth header and a Name query string parameter are defined as identity sources, this value is route.request.header.Auth, route.request.querystring.Name. These parameters will be used to perform runtime validation for Lambda-based authorizers by verifying all of the identity-related request parameters are present in the request, not null, and non-empty. Only when this is true does the authorizer invoke the authorizer Lambda function. Otherwise, it returns a 401 Unauthorized response without calling the Lambda function. For JWT, a single entry that specifies where to extract the JSON Web Token (JWT )from inbound requests. Currently only header-based and query parameter-based selections are supported, for example "$request.header.Authorization".
    */
  var IdentitySource: IdentitySourceList = js.native
  /**
    * This parameter is not used.
    */
  var IdentityValidationExpression: js.UndefOr[StringWithLengthBetween0And1024] = js.native
  /**
    * Represents the configuration of a JWT authorizer. Required for the JWT authorizer type. Supported only for HTTP APIs.
    */
  var JwtConfiguration: js.UndefOr[JWTConfiguration] = js.native
  /**
    * The name of the authorizer.
    */
  var Name: StringWithLengthBetween1And128 = js.native
}

object CreateAuthorizerRequest {
  @scala.inline
  def apply(
    ApiId: string,
    AuthorizerType: AuthorizerType,
    IdentitySource: IdentitySourceList,
    Name: StringWithLengthBetween1And128
  ): CreateAuthorizerRequest = {
    val __obj = js.Dynamic.literal(ApiId = ApiId.asInstanceOf[js.Any], AuthorizerType = AuthorizerType.asInstanceOf[js.Any], IdentitySource = IdentitySource.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateAuthorizerRequest]
  }
  @scala.inline
  implicit class CreateAuthorizerRequestOps[Self <: CreateAuthorizerRequest] (val x: Self) extends AnyVal {
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
    def setApiId(value: string): Self = this.set("ApiId", value.asInstanceOf[js.Any])
    @scala.inline
    def setAuthorizerType(value: AuthorizerType): Self = this.set("AuthorizerType", value.asInstanceOf[js.Any])
    @scala.inline
    def setIdentitySourceVarargs(value: string*): Self = this.set("IdentitySource", js.Array(value :_*))
    @scala.inline
    def setIdentitySource(value: IdentitySourceList): Self = this.set("IdentitySource", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: StringWithLengthBetween1And128): Self = this.set("Name", value.asInstanceOf[js.Any])
    @scala.inline
    def setAuthorizerCredentialsArn(value: Arn): Self = this.set("AuthorizerCredentialsArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAuthorizerCredentialsArn: Self = this.set("AuthorizerCredentialsArn", js.undefined)
    @scala.inline
    def setAuthorizerResultTtlInSeconds(value: IntegerWithLengthBetween0And3600): Self = this.set("AuthorizerResultTtlInSeconds", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAuthorizerResultTtlInSeconds: Self = this.set("AuthorizerResultTtlInSeconds", js.undefined)
    @scala.inline
    def setAuthorizerUri(value: UriWithLengthBetween1And2048): Self = this.set("AuthorizerUri", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAuthorizerUri: Self = this.set("AuthorizerUri", js.undefined)
    @scala.inline
    def setIdentityValidationExpression(value: StringWithLengthBetween0And1024): Self = this.set("IdentityValidationExpression", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIdentityValidationExpression: Self = this.set("IdentityValidationExpression", js.undefined)
    @scala.inline
    def setJwtConfiguration(value: JWTConfiguration): Self = this.set("JwtConfiguration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteJwtConfiguration: Self = this.set("JwtConfiguration", js.undefined)
  }
  
}

