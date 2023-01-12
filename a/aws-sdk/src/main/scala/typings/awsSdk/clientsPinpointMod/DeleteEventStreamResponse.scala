package typings.awsSdk.clientsPinpointMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteEventStreamResponse extends StObject {
  
  var EventStream: typings.awsSdk.clientsPinpointMod.EventStream
}
object DeleteEventStreamResponse {
  
  inline def apply(EventStream: EventStream): DeleteEventStreamResponse = {
    val __obj = js.Dynamic.literal(EventStream = EventStream.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteEventStreamResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteEventStreamResponse] (val x: Self) extends AnyVal {
    
    inline def setEventStream(value: EventStream): Self = StObject.set(x, "EventStream", value.asInstanceOf[js.Any])
  }
}
