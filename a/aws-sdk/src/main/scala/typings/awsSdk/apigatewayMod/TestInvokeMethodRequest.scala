package typings.awsSdk.apigatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  def apply(httpMethod: String, resourceId: String, restApiId: String): TestInvokeMethodRequest = {
    val __obj = js.Dynamic.literal(httpMethod = httpMethod.asInstanceOf[js.Any], resourceId = resourceId.asInstanceOf[js.Any], restApiId = restApiId.asInstanceOf[js.Any])
    __obj.asInstanceOf[TestInvokeMethodRequest]
  }
  
  @scala.inline
  implicit class TestInvokeMethodRequestOps[Self <: TestInvokeMethodRequest] (val x: Self) extends AnyVal {
    
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
    def setHttpMethod(value: String): Self = this.set("httpMethod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceId(value: String): Self = this.set("resourceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRestApiId(value: String): Self = this.set("restApiId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBody(value: String): Self = this.set("body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBody: Self = this.set("body", js.undefined)
    
    @scala.inline
    def setClientCertificateId(value: String): Self = this.set("clientCertificateId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClientCertificateId: Self = this.set("clientCertificateId", js.undefined)
    
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
