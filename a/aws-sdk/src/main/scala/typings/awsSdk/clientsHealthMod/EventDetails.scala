package typings.awsSdk.clientsHealthMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EventDetails extends StObject {
  
  /**
    * Summary information about the event.
    */
  var event: js.UndefOr[Event] = js.undefined
  
  /**
    * The most recent description of the event.
    */
  var eventDescription: js.UndefOr[EventDescription_] = js.undefined
  
  /**
    * Additional metadata about the event.
    */
  var eventMetadata: js.UndefOr[typings.awsSdk.clientsHealthMod.eventMetadata] = js.undefined
}
object EventDetails {
  
  inline def apply(): EventDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EventDetails]
  }
  
  extension [Self <: EventDetails](x: Self) {
    
    inline def setEvent(value: Event): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
    
    inline def setEventDescription(value: EventDescription_): Self = StObject.set(x, "eventDescription", value.asInstanceOf[js.Any])
    
    inline def setEventDescriptionUndefined: Self = StObject.set(x, "eventDescription", js.undefined)
    
    inline def setEventMetadata(value: eventMetadata): Self = StObject.set(x, "eventMetadata", value.asInstanceOf[js.Any])
    
    inline def setEventMetadataUndefined: Self = StObject.set(x, "eventMetadata", js.undefined)
    
    inline def setEventUndefined: Self = StObject.set(x, "event", js.undefined)
  }
}
