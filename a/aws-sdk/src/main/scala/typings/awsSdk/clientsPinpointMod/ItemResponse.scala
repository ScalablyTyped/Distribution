package typings.awsSdk.clientsPinpointMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ItemResponse extends StObject {
  
  /**
    * The response that was received after the endpoint data was accepted.
    */
  var EndpointItemResponse: js.UndefOr[typings.awsSdk.clientsPinpointMod.EndpointItemResponse] = js.undefined
  
  /**
    * A multipart response object that contains a key and a value for each event in the request. In each object, the event ID is the key and an EventItemResponse object is the value.
    */
  var EventsItemResponse: js.UndefOr[MapOfEventItemResponse] = js.undefined
}
object ItemResponse {
  
  inline def apply(): ItemResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ItemResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ItemResponse] (val x: Self) extends AnyVal {
    
    inline def setEndpointItemResponse(value: EndpointItemResponse): Self = StObject.set(x, "EndpointItemResponse", value.asInstanceOf[js.Any])
    
    inline def setEndpointItemResponseUndefined: Self = StObject.set(x, "EndpointItemResponse", js.undefined)
    
    inline def setEventsItemResponse(value: MapOfEventItemResponse): Self = StObject.set(x, "EventsItemResponse", value.asInstanceOf[js.Any])
    
    inline def setEventsItemResponseUndefined: Self = StObject.set(x, "EventsItemResponse", js.undefined)
  }
}
