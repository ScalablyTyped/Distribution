package typings.awsSdk.apigatewayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TestInvokeMethodResponse extends StObject {
  
  /**
    * The body of the HTTP response.
    */
  var body: js.UndefOr[String] = js.undefined
  
  /**
    * The headers of the HTTP response.
    */
  var headers: js.UndefOr[MapOfStringToString] = js.undefined
  
  /**
    * The execution latency of the test invoke request.
    */
  var latency: js.UndefOr[Long] = js.undefined
  
  /**
    * The API Gateway execution log for the test invoke request.
    */
  var log: js.UndefOr[String] = js.undefined
  
  /**
    * The headers of the HTTP response as a map from string to list of values.
    */
  var multiValueHeaders: js.UndefOr[MapOfStringToList] = js.undefined
  
  /**
    * The HTTP status code.
    */
  var status: js.UndefOr[Integer] = js.undefined
}
object TestInvokeMethodResponse {
  
  inline def apply(): TestInvokeMethodResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TestInvokeMethodResponse]
  }
  
  extension [Self <: TestInvokeMethodResponse](x: Self) {
    
    inline def setBody(value: String): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    inline def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
    
    inline def setHeaders(value: MapOfStringToString): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
    
    inline def setLatency(value: Long): Self = StObject.set(x, "latency", value.asInstanceOf[js.Any])
    
    inline def setLatencyUndefined: Self = StObject.set(x, "latency", js.undefined)
    
    inline def setLog(value: String): Self = StObject.set(x, "log", value.asInstanceOf[js.Any])
    
    inline def setLogUndefined: Self = StObject.set(x, "log", js.undefined)
    
    inline def setMultiValueHeaders(value: MapOfStringToList): Self = StObject.set(x, "multiValueHeaders", value.asInstanceOf[js.Any])
    
    inline def setMultiValueHeadersUndefined: Self = StObject.set(x, "multiValueHeaders", js.undefined)
    
    inline def setStatus(value: Integer): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
