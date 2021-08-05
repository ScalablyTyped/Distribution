package typings.awsSdk.apigatewayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TestInvokeAuthorizerRequest extends StObject {
  
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
  
  inline def apply(authorizerId: String, restApiId: String): TestInvokeAuthorizerRequest = {
    val __obj = js.Dynamic.literal(authorizerId = authorizerId.asInstanceOf[js.Any], restApiId = restApiId.asInstanceOf[js.Any])
    __obj.asInstanceOf[TestInvokeAuthorizerRequest]
  }
  
  extension [Self <: TestInvokeAuthorizerRequest](x: Self) {
    
    inline def setAdditionalContext(value: MapOfStringToString): Self = StObject.set(x, "additionalContext", value.asInstanceOf[js.Any])
    
    inline def setAdditionalContextUndefined: Self = StObject.set(x, "additionalContext", js.undefined)
    
    inline def setAuthorizerId(value: String): Self = StObject.set(x, "authorizerId", value.asInstanceOf[js.Any])
    
    inline def setBody(value: String): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    inline def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
    
    inline def setHeaders(value: MapOfStringToString): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
    
    inline def setMultiValueHeaders(value: MapOfStringToList): Self = StObject.set(x, "multiValueHeaders", value.asInstanceOf[js.Any])
    
    inline def setMultiValueHeadersUndefined: Self = StObject.set(x, "multiValueHeaders", js.undefined)
    
    inline def setPathWithQueryString(value: String): Self = StObject.set(x, "pathWithQueryString", value.asInstanceOf[js.Any])
    
    inline def setPathWithQueryStringUndefined: Self = StObject.set(x, "pathWithQueryString", js.undefined)
    
    inline def setRestApiId(value: String): Self = StObject.set(x, "restApiId", value.asInstanceOf[js.Any])
    
    inline def setStageVariables(value: MapOfStringToString): Self = StObject.set(x, "stageVariables", value.asInstanceOf[js.Any])
    
    inline def setStageVariablesUndefined: Self = StObject.set(x, "stageVariables", js.undefined)
  }
}
