package typings.awsSdk.clientsPinpointMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PutEventStreamResponse extends StObject {
  
  var EventStream: typings.awsSdk.clientsPinpointMod.EventStream
}
object PutEventStreamResponse {
  
  inline def apply(EventStream: EventStream): PutEventStreamResponse = {
    val __obj = js.Dynamic.literal(EventStream = EventStream.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutEventStreamResponse]
  }
  
  extension [Self <: PutEventStreamResponse](x: Self) {
    
    inline def setEventStream(value: EventStream): Self = StObject.set(x, "EventStream", value.asInstanceOf[js.Any])
  }
}
