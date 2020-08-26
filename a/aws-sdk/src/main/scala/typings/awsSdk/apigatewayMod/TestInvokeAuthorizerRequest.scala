package typings.awsSdk.apigatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TestInvokeAuthorizerRequest extends js.Object {
  /**
    * [Optional] A key-value map of additional context variables.
    */
  var additionalContext: js.UndefOr[MapOfStringToString] = js.native
  /**
    * [Required] Specifies a test invoke authorizer request's Authorizer ID.
    */
  var authorizerId: String = js.native
  /**
    * [Optional] The simulated request body of an incoming invocation request.
    */
  var body: js.UndefOr[String] = js.native
  /**
    * [Required] A key-value map of headers to simulate an incoming invocation request. This is where the incoming authorization token, or identity source, should be specified.
    */
  var headers: js.UndefOr[MapOfStringToString] = js.native
  /**
    * [Optional] The headers as a map from string to list of values to simulate an incoming invocation request. This is where the incoming authorization token, or identity source, may be specified.
    */
  var multiValueHeaders: js.UndefOr[MapOfStringToList] = js.native
  /**
    * [Optional] The URI path, including query string, of the simulated invocation request. Use this to specify path parameters and query string parameters.
    */
  var pathWithQueryString: js.UndefOr[String] = js.native
  /**
    * [Required] The string identifier of the associated RestApi.
    */
  var restApiId: String = js.native
  /**
    * A key-value map of stage variables to simulate an invocation on a deployed Stage.
    */
  var stageVariables: js.UndefOr[MapOfStringToString] = js.native
}

object TestInvokeAuthorizerRequest {
  @scala.inline
  def apply(authorizerId: String, restApiId: String): TestInvokeAuthorizerRequest = {
    val __obj = js.Dynamic.literal(authorizerId = authorizerId.asInstanceOf[js.Any], restApiId = restApiId.asInstanceOf[js.Any])
    __obj.asInstanceOf[TestInvokeAuthorizerRequest]
  }
  @scala.inline
  implicit class TestInvokeAuthorizerRequestOps[Self <: TestInvokeAuthorizerRequest] (val x: Self) extends AnyVal {
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
    def setAuthorizerId(value: String): Self = this.set("authorizerId", value.asInstanceOf[js.Any])
    @scala.inline
    def setRestApiId(value: String): Self = this.set("restApiId", value.asInstanceOf[js.Any])
    @scala.inline
    def setAdditionalContext(value: MapOfStringToString): Self = this.set("additionalContext", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAdditionalContext: Self = this.set("additionalContext", js.undefined)
    @scala.inline
    def setBody(value: String): Self = this.set("body", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBody: Self = this.set("body", js.undefined)
    @scala.inline
    def setHeaders(value: MapOfStringToString): Self = this.set("headers", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeaders: Self = this.set("headers", js.undefined)
    @scala.inline
    def setMultiValueHeaders(value: MapOfStringToList): Self = this.set("multiValueHeaders", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMultiValueHeaders: Self = this.set("multiValueHeaders", js.undefined)
    @scala.inline
    def setPathWithQueryString(value: String): Self = this.set("pathWithQueryString", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePathWithQueryString: Self = this.set("pathWithQueryString", js.undefined)
    @scala.inline
    def setStageVariables(value: MapOfStringToString): Self = this.set("stageVariables", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStageVariables: Self = this.set("stageVariables", js.undefined)
  }
  
}

