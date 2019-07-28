package typings.awsDashSdk.clientsApigatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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

object TestInvokeAuthorizerRequest {
  @scala.inline
  def apply(
    authorizerId: String,
    restApiId: String,
    additionalContext: MapOfStringToString = null,
    body: String = null,
    headers: MapOfStringToString = null,
    multiValueHeaders: MapOfStringToList = null,
    pathWithQueryString: String = null,
    stageVariables: MapOfStringToString = null
  ): TestInvokeAuthorizerRequest = {
    val __obj = js.Dynamic.literal(authorizerId = authorizerId, restApiId = restApiId)
    if (additionalContext != null) __obj.updateDynamic("additionalContext")(additionalContext)
    if (body != null) __obj.updateDynamic("body")(body)
    if (headers != null) __obj.updateDynamic("headers")(headers)
    if (multiValueHeaders != null) __obj.updateDynamic("multiValueHeaders")(multiValueHeaders)
    if (pathWithQueryString != null) __obj.updateDynamic("pathWithQueryString")(pathWithQueryString)
    if (stageVariables != null) __obj.updateDynamic("stageVariables")(stageVariables)
    __obj.asInstanceOf[TestInvokeAuthorizerRequest]
  }
}

