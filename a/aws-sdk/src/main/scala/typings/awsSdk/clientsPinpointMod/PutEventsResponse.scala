package typings.awsSdk.clientsPinpointMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PutEventsResponse extends StObject {
  
  var EventsResponse: typings.awsSdk.clientsPinpointMod.EventsResponse
}
object PutEventsResponse {
  
  inline def apply(EventsResponse: EventsResponse): PutEventsResponse = {
    val __obj = js.Dynamic.literal(EventsResponse = EventsResponse.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutEventsResponse]
  }
  
  extension [Self <: PutEventsResponse](x: Self) {
    
    inline def setEventsResponse(value: EventsResponse): Self = StObject.set(x, "EventsResponse", value.asInstanceOf[js.Any])
  }
}
