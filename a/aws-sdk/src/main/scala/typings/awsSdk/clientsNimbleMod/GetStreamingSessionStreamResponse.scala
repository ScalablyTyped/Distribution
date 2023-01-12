package typings.awsSdk.clientsNimbleMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetStreamingSessionStreamResponse extends StObject {
  
  /**
    * The stream.
    */
  var stream: js.UndefOr[StreamingSessionStream] = js.undefined
}
object GetStreamingSessionStreamResponse {
  
  inline def apply(): GetStreamingSessionStreamResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetStreamingSessionStreamResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetStreamingSessionStreamResponse] (val x: Self) extends AnyVal {
    
    inline def setStream(value: StreamingSessionStream): Self = StObject.set(x, "stream", value.asInstanceOf[js.Any])
    
    inline def setStreamUndefined: Self = StObject.set(x, "stream", js.undefined)
  }
}
