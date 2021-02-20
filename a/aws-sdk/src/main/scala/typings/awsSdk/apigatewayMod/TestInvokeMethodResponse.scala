package typings.awsSdk.apigatewayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TestInvokeMethodResponse extends StObject {
  
  /**
    * The body of the HTTP response.
    */
  var body: js.UndefOr[String] = js.native
  
  /**
    * The headers of the HTTP response.
    */
  var headers: js.UndefOr[MapOfStringToString] = js.native
  
  /**
    * The execution latency of the test invoke request.
    */
  var latency: js.UndefOr[Long] = js.native
  
  /**
    * The API Gateway execution log for the test invoke request.
    */
  var log: js.UndefOr[String] = js.native
  
  /**
    * The headers of the HTTP response as a map from string to list of values.
    */
  var multiValueHeaders: js.UndefOr[MapOfStringToList] = js.native
  
  /**
    * The HTTP status code.
    */
  var status: js.UndefOr[Integer] = js.native
}
object TestInvokeMethodResponse {
  
  @scala.inline
  def apply(): TestInvokeMethodResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TestInvokeMethodResponse]
  }
  
  @scala.inline
  implicit class TestInvokeMethodResponseMutableBuilder[Self <: TestInvokeMethodResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBody(value: String): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
    
    @scala.inline
    def setHeaders(value: MapOfStringToString): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
    
    @scala.inline
    def setLatency(value: Long): Self = StObject.set(x, "latency", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLatencyUndefined: Self = StObject.set(x, "latency", js.undefined)
    
    @scala.inline
    def setLog(value: String): Self = StObject.set(x, "log", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLogUndefined: Self = StObject.set(x, "log", js.undefined)
    
    @scala.inline
    def setMultiValueHeaders(value: MapOfStringToList): Self = StObject.set(x, "multiValueHeaders", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMultiValueHeadersUndefined: Self = StObject.set(x, "multiValueHeaders", js.undefined)
    
    @scala.inline
    def setStatus(value: Integer): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
