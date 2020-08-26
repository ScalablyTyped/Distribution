package typings.awsSdk.apigatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateAuthorizerRequest extends js.Object {
  /**
    * Optional customer-defined field, used in OpenAPI imports and exports without functional impact.
    */
  var authType: js.UndefOr[String] = js.native
  /**
    * Specifies the required credentials as an IAM role for API Gateway to invoke the authorizer. To specify an IAM role for API Gateway to assume, use the role's Amazon Resource Name (ARN). To use resource-based permissions on the Lambda function, specify null.
    */
  var authorizerCredentials: js.UndefOr[String] = js.native
  /**
    * The TTL in seconds of cached authorizer results. If it equals 0, authorization caching is disabled. If it is greater than 0, API Gateway will cache authorizer responses. If this field is not set, the default value is 300. The maximum value is 3600, or 1 hour.
    */
  var authorizerResultTtlInSeconds: js.UndefOr[NullableInteger] = js.native
  /**
    * Specifies the authorizer's Uniform Resource Identifier (URI). For TOKEN or REQUEST authorizers, this must be a well-formed Lambda function URI, for example, arn:aws:apigateway:us-west-2:lambda:path/2015-03-31/functions/arn:aws:lambda:us-west-2:{account_id}:function:{lambda_function_name}/invocations. In general, the URI has this form arn:aws:apigateway:{region}:lambda:path/{service_api}, where {region} is the same as the region hosting the Lambda function, path indicates that the remaining substring in the URI should be treated as the path to the resource, including the initial /. For Lambda functions, this is usually of the form /2015-03-31/functions/[FunctionARN]/invocations.
    */
  var authorizerUri: js.UndefOr[String] = js.native
  /**
    * The identity source for which authorization is requested. For a TOKEN or COGNITO_USER_POOLS authorizer, this is required and specifies the request header mapping expression for the custom header holding the authorization token submitted by the client. For example, if the token header name is Auth, the header mapping expression is method.request.header.Auth.For the REQUEST authorizer, this is required when authorization caching is enabled. The value is a comma-separated string of one or more mapping expressions of the specified request parameters. For example, if an Auth header, a Name query string parameter are defined as identity sources, this value is method.request.header.Auth, method.request.querystring.Name. These parameters will be used to derive the authorization caching key and to perform runtime validation of the REQUEST authorizer by verifying all of the identity-related request parameters are present, not null and non-empty. Only when this is true does the authorizer invoke the authorizer Lambda function, otherwise, it returns a 401 Unauthorized response without calling the Lambda function. The valid value is a string of comma-separated mapping expressions of the specified request parameters. When the authorization caching is not enabled, this property is optional.
    */
  var identitySource: js.UndefOr[String] = js.native
  /**
    * A validation expression for the incoming identity token. For TOKEN authorizers, this value is a regular expression. For COGNITO_USER_POOLS authorizers, API Gateway will match the aud field of the incoming token from the client against the specified regular expression. It will invoke the authorizer's Lambda function when there is a match. Otherwise, it will return a 401 Unauthorized response without calling the Lambda function. The validation expression does not apply to the REQUEST authorizer.
    */
  var identityValidationExpression: js.UndefOr[String] = js.native
  /**
    * [Required] The name of the authorizer.
    */
  var name: String = js.native
  /**
    * A list of the Amazon Cognito user pool ARNs for the COGNITO_USER_POOLS authorizer. Each element is of this format: arn:aws:cognito-idp:{region}:{account_id}:userpool/{user_pool_id}. For a TOKEN or REQUEST authorizer, this is not defined. 
    */
  var providerARNs: js.UndefOr[ListOfARNs] = js.native
  /**
    * [Required] The string identifier of the associated RestApi.
    */
  var restApiId: String = js.native
  /**
    * [Required] The authorizer type. Valid values are TOKEN for a Lambda function using a single authorization token submitted in a custom header, REQUEST for a Lambda function using incoming request parameters, and COGNITO_USER_POOLS for using an Amazon Cognito user pool.
    */
  var `type`: AuthorizerType = js.native
}

object CreateAuthorizerRequest {
  @scala.inline
  def apply(name: String, restApiId: String, `type`: AuthorizerType): CreateAuthorizerRequest = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], restApiId = restApiId.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateAuthorizerRequest]
  }
  @scala.inline
  implicit class CreateAuthorizerRequestOps[Self <: CreateAuthorizerRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setRestApiId(value: String): Self = this.set("restApiId", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: AuthorizerType): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setAuthType(value: String): Self = this.set("authType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAuthType: Self = this.set("authType", js.undefined)
    @scala.inline
    def setAuthorizerCredentials(value: String): Self = this.set("authorizerCredentials", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAuthorizerCredentials: Self = this.set("authorizerCredentials", js.undefined)
    @scala.inline
    def setAuthorizerResultTtlInSeconds(value: NullableInteger): Self = this.set("authorizerResultTtlInSeconds", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAuthorizerResultTtlInSeconds: Self = this.set("authorizerResultTtlInSeconds", js.undefined)
    @scala.inline
    def setAuthorizerUri(value: String): Self = this.set("authorizerUri", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAuthorizerUri: Self = this.set("authorizerUri", js.undefined)
    @scala.inline
    def setIdentitySource(value: String): Self = this.set("identitySource", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIdentitySource: Self = this.set("identitySource", js.undefined)
    @scala.inline
    def setIdentityValidationExpression(value: String): Self = this.set("identityValidationExpression", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIdentityValidationExpression: Self = this.set("identityValidationExpression", js.undefined)
    @scala.inline
    def setProviderARNsVarargs(value: ProviderARN*): Self = this.set("providerARNs", js.Array(value :_*))
    @scala.inline
    def setProviderARNs(value: ListOfARNs): Self = this.set("providerARNs", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProviderARNs: Self = this.set("providerARNs", js.undefined)
  }
  
}

