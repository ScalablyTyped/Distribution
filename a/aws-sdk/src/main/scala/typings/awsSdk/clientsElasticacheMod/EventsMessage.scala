package typings.awsSdk.clientsElasticacheMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EventsMessage extends StObject {
  
  /**
    * A list of events. Each element in the list contains detailed information about one event.
    */
  var Events: js.UndefOr[EventList] = js.undefined
  
  /**
    * Provides an identifier to allow retrieval of paginated results.
    */
  var Marker: js.UndefOr[String] = js.undefined
}
object EventsMessage {
  
  inline def apply(): EventsMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EventsMessage]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EventsMessage] (val x: Self) extends AnyVal {
    
    inline def setEvents(value: EventList): Self = StObject.set(x, "Events", value.asInstanceOf[js.Any])
    
    inline def setEventsUndefined: Self = StObject.set(x, "Events", js.undefined)
    
    inline def setEventsVarargs(value: Event*): Self = StObject.set(x, "Events", js.Array(value*))
    
    inline def setMarker(value: String): Self = StObject.set(x, "Marker", value.asInstanceOf[js.Any])
    
    inline def setMarkerUndefined: Self = StObject.set(x, "Marker", js.undefined)
  }
}
