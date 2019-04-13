package typings
package awsDashSdkLib.clientsApigatewayv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateAuthorizerRequest extends js.Object {
  /**
    * The API identifier.
    */
  var ApiId: __string
  /**
    * Specifies the required credentials as an IAM role for API Gateway to invoke the
    authorizer. To specify an IAM role for API Gateway to assume, use the role's Amazon
    Resource Name (ARN). To use resource-based permissions on the Lambda function,
    specify null.
    */
  var AuthorizerCredentialsArn: js.UndefOr[Arn] = js.undefined
  /**
    * The authorizer identifier.
    */
  var AuthorizerId: __string
  /**
    * The time to live (TTL), in seconds, of cached authorizer results. If it is zero,
    authorization caching is disabled. If it is greater than zero, API Gateway will cache
    authorizer responses. If this field is not set, the default value is 300. The maximum
    value is 3600, or 1 hour.
    */
  var AuthorizerResultTtlInSeconds: js.UndefOr[IntegerWithLengthBetween0And3600] = js.undefined
  /**
    * The authorizer type. Currently the only valid value is REQUEST, for a
    Lambda function using incoming request parameters.
    */
  var AuthorizerType: js.UndefOr[AuthorizerType] = js.undefined
  /**
    * The authorizer's Uniform Resource Identifier (URI). For
    REQUEST authorizers, this must be a
    well-formed Lambda function URI, for example,
    arn:aws:apigateway:us-west-2:lambda:path/2015-03-31/functions/arn:aws:lambda:us-west-2:{account_id}:function:{lambda_function_name}/invocations.
    In general, the URI has this form:
    arn:aws:apigateway:{region}:lambda:path/{service_api}
    , where {region} is the same as the region hosting the Lambda
    function, path indicates that the remaining substring in the URI should be treated as
    the path to the resource, including the initial /. For Lambda functions,
    this is usually of the form
    /2015-03-31/functions/[FunctionARN]/invocations.
    */
  var AuthorizerUri: js.UndefOr[UriWithLengthBetween1And2048] = js.undefined
  /**
    * The identity source for which authorization is requested.For the REQUEST authorizer, this is required when authorization
    caching is enabled. The value is a comma-separated string of one or more mapping
    expressions of the specified request parameters. For example, if an Auth header, a
    Name query string parameter are defined as identity sources, this value is
    $method.request.header.Auth, $method.request.querystring.Name. These
    parameters will be used to derive the authorization caching key and to perform
    runtime validation of the REQUEST authorizer by verifying all of the
    identity-related request parameters are present, not null and non-empty. Only when
    this is true does the authorizer invoke the authorizer Lambda function, otherwise, it
    returns a 401 Unauthorized response without calling the Lambda function.
    The valid value is a string of comma-separated mapping expressions of the specified
    request parameters. When the authorization caching is not enabled, this property is
    optional.
    */
  var IdentitySource: js.UndefOr[IdentitySourceList] = js.undefined
  /**
    * The
    validation expression does not apply to the REQUEST authorizer.
    */
  var IdentityValidationExpression: js.UndefOr[StringWithLengthBetween0And1024] = js.undefined
  /**
    * The name of the authorizer.
    */
  var Name: js.UndefOr[StringWithLengthBetween1And128] = js.undefined
  /**
    * For
    REQUEST authorizer, this is not
    defined.
    */
  var ProviderArns: js.UndefOr[ProviderArnList] = js.undefined
}

object UpdateAuthorizerRequest {
  @scala.inline
  def apply(
    ApiId: __string,
    AuthorizerId: __string,
    AuthorizerCredentialsArn: Arn = null,
    AuthorizerResultTtlInSeconds: js.UndefOr[IntegerWithLengthBetween0And3600] = js.undefined,
    AuthorizerType: AuthorizerType = null,
    AuthorizerUri: UriWithLengthBetween1And2048 = null,
    IdentitySource: IdentitySourceList = null,
    IdentityValidationExpression: StringWithLengthBetween0And1024 = null,
    Name: StringWithLengthBetween1And128 = null,
    ProviderArns: ProviderArnList = null
  ): UpdateAuthorizerRequest = {
    val __obj = js.Dynamic.literal(ApiId = ApiId, AuthorizerId = AuthorizerId)
    if (AuthorizerCredentialsArn != null) __obj.updateDynamic("AuthorizerCredentialsArn")(AuthorizerCredentialsArn)
    if (!js.isUndefined(AuthorizerResultTtlInSeconds)) __obj.updateDynamic("AuthorizerResultTtlInSeconds")(AuthorizerResultTtlInSeconds)
    if (AuthorizerType != null) __obj.updateDynamic("AuthorizerType")(AuthorizerType.asInstanceOf[js.Any])
    if (AuthorizerUri != null) __obj.updateDynamic("AuthorizerUri")(AuthorizerUri)
    if (IdentitySource != null) __obj.updateDynamic("IdentitySource")(IdentitySource)
    if (IdentityValidationExpression != null) __obj.updateDynamic("IdentityValidationExpression")(IdentityValidationExpression)
    if (Name != null) __obj.updateDynamic("Name")(Name)
    if (ProviderArns != null) __obj.updateDynamic("ProviderArns")(ProviderArns)
    __obj.asInstanceOf[UpdateAuthorizerRequest]
  }
}

