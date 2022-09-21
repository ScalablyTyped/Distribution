package typings.awsSdk.apigatewayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TestInvokeMethodRequest extends StObject {
  
  /**
    * The simulated request body of an incoming invocation request.
    */
  var body: js.UndefOr[String] = js.undefined
  
  /**
    * A ClientCertificate identifier to use in the test invocation. API Gateway will use the certificate when making the HTTPS request to the defined back-end endpoint.
    */
  var clientCertificateId: js.UndefOr[String] = js.undefined
  
  /**
    * A key-value map of headers to simulate an incoming invocation request.
    */
  var headers: js.UndefOr[MapOfStringToString] = js.undefined
  
  /**
    * Specifies a test invoke method request's HTTP method.
    */
  var httpMethod: String
  
  /**
    * The headers as a map from string to list of values to simulate an incoming invocation request.
    */
  var multiValueHeaders: js.UndefOr[MapOfStringToList] = js.undefined
  
  /**
    * The URI path, including query string, of the simulated invocation request. Use this to specify path parameters and query string parameters.
    */
  var pathWithQueryString: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies a test invoke method request's resource ID.
    */
  var resourceId: String
  
  /**
    * The string identifier of the associated RestApi.
    */
  var restApiId: String
  
  /**
    * A key-value map of stage variables to simulate an invocation on a deployed Stage.
    */
  var stageVariables: js.UndefOr[MapOfStringToString] = js.undefined
}
object TestInvokeMethodRequest {
  
  inline def apply(httpMethod: String, resourceId: String, restApiId: String): TestInvokeMethodRequest = {
    val __obj = js.Dynamic.literal(httpMethod = httpMethod.asInstanceOf[js.Any], resourceId = resourceId.asInstanceOf[js.Any], restApiId = restApiId.asInstanceOf[js.Any])
    __obj.asInstanceOf[TestInvokeMethodRequest]
  }
  
  extension [Self <: TestInvokeMethodRequest](x: Self) {
    
    inline def setBody(value: String): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    inline def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
    
    inline def setClientCertificateId(value: String): Self = StObject.set(x, "clientCertificateId", value.asInstanceOf[js.Any])
    
    inline def setClientCertificateIdUndefined: Self = StObject.set(x, "clientCertificateId", js.undefined)
    
    inline def setHeaders(value: MapOfStringToString): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
    
    inline def setHttpMethod(value: String): Self = StObject.set(x, "httpMethod", value.asInstanceOf[js.Any])
    
    inline def setMultiValueHeaders(value: MapOfStringToList): Self = StObject.set(x, "multiValueHeaders", value.asInstanceOf[js.Any])
    
    inline def setMultiValueHeadersUndefined: Self = StObject.set(x, "multiValueHeaders", js.undefined)
    
    inline def setPathWithQueryString(value: String): Self = StObject.set(x, "pathWithQueryString", value.asInstanceOf[js.Any])
    
    inline def setPathWithQueryStringUndefined: Self = StObject.set(x, "pathWithQueryString", js.undefined)
    
    inline def setResourceId(value: String): Self = StObject.set(x, "resourceId", value.asInstanceOf[js.Any])
    
    inline def setRestApiId(value: String): Self = StObject.set(x, "restApiId", value.asInstanceOf[js.Any])
    
    inline def setStageVariables(value: MapOfStringToString): Self = StObject.set(x, "stageVariables", value.asInstanceOf[js.Any])
    
    inline def setStageVariablesUndefined: Self = StObject.set(x, "stageVariables", js.undefined)
  }
}
