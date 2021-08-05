package typings.activexLibreoffice.com_.sun.star.document

import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * is thrown on document and document content events
  * @deprecated Deprecated
  * @see XEventListener
  * @see XEventBroadcaster
  * @see DocumentEvent
  */
trait EventObject
  extends StObject
     with typings.activexLibreoffice.com_.sun.star.lang.EventObject {
  
  /**
    * specifies the name of the occurred event
    *
    * For a list of possible event names see {@link Events} .
    */
  var EventName: String
}
object EventObject {
  
  inline def apply(EventName: String, Source: XInterface): EventObject = {
    val __obj = js.Dynamic.literal(EventName = EventName.asInstanceOf[js.Any], Source = Source.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventObject]
  }
  
  extension [Self <: EventObject](x: Self) {
    
    inline def setEventName(value: String): Self = StObject.set(x, "EventName", value.asInstanceOf[js.Any])
  }
}
