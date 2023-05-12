package typings.awsSdk.clientsLambdaMod

import typings.awsSdk.anon.InvokeComplete
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InvokeWithResponseStreamResponse extends StObject {
  
  /**
    * The stream of response payloads.
    */
  var EventStream: js.UndefOr[InvokeWithResponseStreamResponseEvent] = js.undefined
  
  /**
    * The version of the function that executed. When you invoke a function with an alias, this indicates which version the alias resolved to.
    */
  var ExecutedVersion: js.UndefOr[Version] = js.undefined
  
  /**
    * The type of data the stream is returning.
    */
  var ResponseStreamContentType: js.UndefOr[String] = js.undefined
  
  /**
    * For a successful request, the HTTP status code is in the 200 range. For the RequestResponse invocation type, this status code is 200. For the DryRun invocation type, this status code is 204.
    */
  var StatusCode: js.UndefOr[Integer] = js.undefined
}
object InvokeWithResponseStreamResponse {
  
  inline def apply(): InvokeWithResponseStreamResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InvokeWithResponseStreamResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: InvokeWithResponseStreamResponse] (val x: Self) extends AnyVal {
    
    inline def setEventStream(value: InvokeWithResponseStreamResponseEvent): Self = StObject.set(x, "EventStream", value.asInstanceOf[js.Any])
    
    inline def setEventStreamUndefined: Self = StObject.set(x, "EventStream", js.undefined)
    
    inline def setEventStreamVarargs(value: InvokeComplete*): Self = StObject.set(x, "EventStream", js.Array(value*))
    
    inline def setExecutedVersion(value: Version): Self = StObject.set(x, "ExecutedVersion", value.asInstanceOf[js.Any])
    
    inline def setExecutedVersionUndefined: Self = StObject.set(x, "ExecutedVersion", js.undefined)
    
    inline def setResponseStreamContentType(value: String): Self = StObject.set(x, "ResponseStreamContentType", value.asInstanceOf[js.Any])
    
    inline def setResponseStreamContentTypeUndefined: Self = StObject.set(x, "ResponseStreamContentType", js.undefined)
    
    inline def setStatusCode(value: Integer): Self = StObject.set(x, "StatusCode", value.asInstanceOf[js.Any])
    
    inline def setStatusCodeUndefined: Self = StObject.set(x, "StatusCode", js.undefined)
  }
}
