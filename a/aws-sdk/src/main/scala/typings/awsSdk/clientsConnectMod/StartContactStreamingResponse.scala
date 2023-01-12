package typings.awsSdk.clientsConnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StartContactStreamingResponse extends StObject {
  
  /**
    * The identifier of the streaming configuration enabled. 
    */
  var StreamingId: typings.awsSdk.clientsConnectMod.StreamingId
}
object StartContactStreamingResponse {
  
  inline def apply(StreamingId: StreamingId): StartContactStreamingResponse = {
    val __obj = js.Dynamic.literal(StreamingId = StreamingId.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartContactStreamingResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StartContactStreamingResponse] (val x: Self) extends AnyVal {
    
    inline def setStreamingId(value: StreamingId): Self = StObject.set(x, "StreamingId", value.asInstanceOf[js.Any])
  }
}
