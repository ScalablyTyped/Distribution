package typings.awsSdk.clientsApigatewayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MethodResponse extends StObject {
  
  /**
    * Specifies the Model resources used for the response's content-type. Response models are represented as a key/value map, with a content-type as the key and a Model name as the value.
    */
  var responseModels: js.UndefOr[MapOfStringToString] = js.undefined
  
  /**
    * A key-value map specifying required or optional response parameters that API Gateway can send back to the caller. A key defines a method response header and the value specifies whether the associated method response header is required or not. The expression of the key must match the pattern method.response.header.{name}, where name is a valid and unique header name. API Gateway passes certain integration response data to the method response headers specified here according to the mapping you prescribe in the API's IntegrationResponse. The integration response data that can be mapped include an integration response header expressed in integration.response.header.{name}, a static value enclosed within a pair of single quotes (e.g., 'application/json'), or a JSON expression from the back-end response payload in the form of integration.response.body.{JSON-expression}, where JSON-expression is a valid JSON expression without the $ prefix.)
    */
  var responseParameters: js.UndefOr[MapOfStringToBoolean] = js.undefined
  
  /**
    * The method response's status code.
    */
  var statusCode: js.UndefOr[StatusCode] = js.undefined
}
object MethodResponse {
  
  inline def apply(): MethodResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MethodResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MethodResponse] (val x: Self) extends AnyVal {
    
    inline def setResponseModels(value: MapOfStringToString): Self = StObject.set(x, "responseModels", value.asInstanceOf[js.Any])
    
    inline def setResponseModelsUndefined: Self = StObject.set(x, "responseModels", js.undefined)
    
    inline def setResponseParameters(value: MapOfStringToBoolean): Self = StObject.set(x, "responseParameters", value.asInstanceOf[js.Any])
    
    inline def setResponseParametersUndefined: Self = StObject.set(x, "responseParameters", js.undefined)
    
    inline def setStatusCode(value: StatusCode): Self = StObject.set(x, "statusCode", value.asInstanceOf[js.Any])
    
    inline def setStatusCodeUndefined: Self = StObject.set(x, "statusCode", js.undefined)
  }
}
