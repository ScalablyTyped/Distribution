package typings.awsSdk.apigatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TestInvokeMethodRequest extends js.Object {
  /**
    * The simulated request body of an incoming invocation request.
    */
  var body: js.UndefOr[String] = js.native
  /**
    * A ClientCertificate identifier to use in the test invocation. API Gateway will use the certificate when making the HTTPS request to the defined back-end endpoint.
    */
  var clientCertificateId: js.UndefOr[String] = js.native
  /**
    * A key-value map of headers to simulate an incoming invocation request.
    */
  var headers: js.UndefOr[MapOfStringToString] = js.native
  /**
    * [Required] Specifies a test invoke method request's HTTP method.
    */
  var httpMethod: String = js.native
  /**
    * The headers as a map from string to list of values to simulate an incoming invocation request.
    */
  var multiValueHeaders: js.UndefOr[MapOfStringToList] = js.native
  /**
    * The URI path, including query string, of the simulated invocation request. Use this to specify path parameters and query string parameters.
    */
  var pathWithQueryString: js.UndefOr[String] = js.native
  /**
    * [Required] Specifies a test invoke method request's resource ID.
    */
  var resourceId: String = js.native
  /**
    * [Required] The string identifier of the associated RestApi.
    */
  var restApiId: String = js.native
  /**
    * A key-value map of stage variables to simulate an invocation on a deployed Stage.
    */
  var stageVariables: js.UndefOr[MapOfStringToString] = js.native
}

object TestInvokeMethodRequest {
  @scala.inline
  def apply(
    httpMethod: String,
    resourceId: String,
    restApiId: String,
    body: String = null,
    clientCertificateId: String = null,
    headers: MapOfStringToString = null,
    multiValueHeaders: MapOfStringToList = null,
    pathWithQueryString: String = null,
    stageVariables: MapOfStringToString = null
  ): TestInvokeMethodRequest = {
    val __obj = js.Dynamic.literal(httpMethod = httpMethod.asInstanceOf[js.Any], resourceId = resourceId.asInstanceOf[js.Any], restApiId = restApiId.asInstanceOf[js.Any])
    if (body != null) __obj.updateDynamic("body")(body.asInstanceOf[js.Any])
    if (clientCertificateId != null) __obj.updateDynamic("clientCertificateId")(clientCertificateId.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (multiValueHeaders != null) __obj.updateDynamic("multiValueHeaders")(multiValueHeaders.asInstanceOf[js.Any])
    if (pathWithQueryString != null) __obj.updateDynamic("pathWithQueryString")(pathWithQueryString.asInstanceOf[js.Any])
    if (stageVariables != null) __obj.updateDynamic("stageVariables")(stageVariables.asInstanceOf[js.Any])
    __obj.asInstanceOf[TestInvokeMethodRequest]
  }
}

